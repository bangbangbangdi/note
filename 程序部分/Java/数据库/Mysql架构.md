# Mysql架构

---

## 基本架构

1. 客户端
2. 连接器
3. 分析器、查询缓存
4. 优化器
5. 执行器
6. 存储引擎

---

## 连接器

连接器负责跟客户端建立连接，获取权限，维持和管理连接

> 用户名密码验证
> 查询权限信息，分配对应权限
> 可以使用show processlist查看现在的连接
> 如果太长时间没有动静，会自动断开

连接分两类：

> 长连接：推荐使用，但是要周期性的断开长链接
> 短连接：要频繁的连接、断开数据库损耗较大、不推荐使用

---

## 查询缓存	8.0后失效

当执行查询语句的时候，会先去查询缓存中查看结果，之前执行过的sql语句及其结果可能以key-value的形式存储在缓存中，如果能找到则直接返回，如果找不到，就继续执行后续的阶段。

不推荐使用查询缓存：

1. 查询缓存的失效比较频繁，只要表更新，缓存就会清空
2. 缓存对应更新的数据命中率比较低

---

## 分析器

* 词法分析：Mysql需要把输入的字符串进行识别每个部分代表什么意思
* 语法分析：根据语法规则判断这个sql语句是否满足mysql的语法，如果不符合就会报错

---

## 优化器

* 在具体执行SQL语句之前，要经过优化器处理
* 不同的执行方式对SQL语句的执行效率影响很大
  * RBO：基于规则的优化
  * CBO：基于成本的优化

---

