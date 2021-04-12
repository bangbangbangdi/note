# Mysql日志

## Redo log

* 当发生数据修改的时候，innodb引擎会先将记录写到redo log中， 并更新内存，此时更新就算是完成了，同时innodb引擎会在合适 的时机将记录操作到磁盘中
*  Redolog是固定大小的，是循环写的过程
* 有了redolog之后，innodb就可以保证即使数据库发生异常重启，之前的记录也不会丢失，叫做crash-safe

---

## Undo log

* Undo Log是为了实现事务的原子性，在MySQL数据库InnoDB存储引擎中， 还用Undo Log来实现多版本并发控制

* 在操作任何数据之前，首先将数据备份到一个地方(这个存储数据备份的地方 称为Undo Log)。然后进行数据的修改。如果出现了错误或者用户执行了 ROLLBACK语句，系统可以利用Undo Log中的备份将数据恢复到事务开始之 前的状态

* 注意:undo log是逻辑日志，可以理解为:
  – 当delete一条记录时，undo log中会记录一条对应的insert记录

  – 当insert一条记录时，undo log中会记录一条对应的delete记录 

  – 当update一条记录时，它记录一条对应相反的update记录

---

## binlog

* Binlog是server层的日志，主要做mysql功能层面的事情

* 与redo日志的区别:
   – 1、redo是innodb独有的，binlog是所有引擎都可以使用的
   – 2、redo是物理日志，记录的是在某个数据页上做了什么修改，binlog是逻

  辑日志，记录的是这个语句的原始逻辑
   – 3、redo是循环写的，空间会用完，binlog是可以追加写的，不会覆盖之前

  的日志信息

---

## 数据更新的流程

1、执行器先从引擎中找到数据，如果在内存中直接返回，如果不在内存中，查询后返回 
2、执行器拿到数据之后会先修改数据， 然后调用引擎接口重新写入数据 
3、引擎将数据更新到内存，同时写数据到redo中，此时处于prepare阶段，并通知执行器执行完成，随时可以操作 
4、执行器生成这个操作的binlog 
5、执行器调用引擎的事务提交接口，引擎把刚刚写完的redo改成commit状态， 更新完成

---

## 为什么Redo log要分两阶段提交

保证数据一致性

redo log在引擎端、binlog在服务端，redo log写完后先进入prepare阶段，然后等待binlog写完了以后再一起commit，此时要么都成功要么都失败，避免了数据不一致的情况

