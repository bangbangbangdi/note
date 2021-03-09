# chapter6

## 为什么需要列表

* 变量可以存储一个元素，而列表是一个大容器可以储存N多个元素，程序可以方便地对这些数据进行整体操作
* 列表相对于其它语言中数组（但是可以存储不同类型的数据，从这一点看其实更像其他语言的集合）

```python
# 为什么需要列表
a = 10
lst = ['bangdi','world',99]
list = ['bangdi','world',99]
print(id(list))
print(type(list))
print(id(lst))
print(type(lst))
print(lst)
```



## 列表对象的创建

* 两种创建方式

  > 1. 使用中括号
  > 2. 调用内置函数

```python
# 列表对象的两种创建方式

# 第一种，使用中括号
list1 = ['hello', 'world', 98]
print(type(list1))

# 第二种方式，使用内置函数list()
list2 = list(['hello', 'world', 98])
print(type(list2))
```



## 列表的五个特点

* 列表元素的有序性
* 索引映射唯一一个数据
* 列表可以储存重复数据
* 任意数据类型混存
* 根据需要动态分配和回收内存



## 列表当中的查询操作

* 获取列表中指定元素的索引

```python
# 获取列表种指定元素的索引
lst1 = ['hello', 'bang', 'di', 97, 'hello']

print(lst1.index('hello')) # 如果存在多个元素，则只会返回查找到第一个元素的索引
print(lst1.index('hello',1,5)) # 如果存在多个元素，则只会返回查找到第一个元素的索引,注意：这里的区间是左闭右开的
print(lst1.index(97))
# print(lst1.index('xueqing'))  # 如果查询元素不在列表中，则会抛出valueerror
```

* 获取列表中的单个元素

```python
# 获取列表当中指定索引的元素
lst1 = ['hello', 'bang', 'di', 97]

print(lst1[0])  # 正序
print(lst1[-1])  # 倒叙
print(lst1[10])  # 如果索引不存在则会抛出indexerror
```

* **获取列表中的多个元素/切片操作（重点）**

```python
# 获取列表中的多个元素/切片操作

# 格式：列表名[start:stop:step]
lst1 = [10, 20, 30, 40, 50, 60, 70, 80, 90]
print(lst1[::])  # 默认情况下，start为0，stop为列表的末尾（列表长度？），step为1
print(lst1[1:5])  # 这里也是左闭右开区间，且默认step（步长）为一
print(lst1[-10:20])  # 值得注意的是这里start,stop不存在索引越界的问题
print(lst1[1:5:2])
print(lst1[::-1])  # step为负数的情况下列表的顺序的倒序的
print(lst1[6:0:-2])  # stop所对应的参数总是开区间
```

**注意：负数的情况下只是切片的方向变了，具体列表里的元素是不变的**

* 判断列表中是否存在某一元素，以及列表的遍历

```python
# 判断列表中是否存在某一元素，以及列表的遍历

lst1 = [10, 20, 30, 40, 50, 60, 70, 80, 90]

print(1 in lst1)  # False
print(1 not in lst1)  # True

for item in lst1:
    print(item, end=' ')
```



## 列表的增加操作

| 方法       | 描述                             |
| ---------- | -------------------------------- |
| append（） | 在列表末尾添加一个元素           |
| extend（） | 在列表末尾至少添加一个元素       |
| insert  () | 在列表的任意位置添加一个元素     |
| 切片       | 在列表的任意位置添加至少一个元素 |

```python
# 列表元素的添加操作
lst1 = [10, 20, 30]
print('添加元素之前', lst1, id(lst1))
lst1.append(100)
print('添加元素之后', lst1, id(lst1))
lst2 = [40, 50]
lst1.append(lst2)  # 这里可以看到，使用append会把整个列表变成一个元素添加进原数组中
print(lst1)
lst3 = [60, 70]
lst1.extend(lst3)  # extend会把列表中的每个元素拆开添加进去
print(lst1)
lst5 = ['外乡人1', '外乡人2']
lst1.insert(1, lst5)  # insert 在列表任意位置添加一个元素
print(lst1)
lst4 = ['切片1', '切片2']
lst1[1:4] = lst4  # 切片 在列表的任意位置添加至少一个元素，这里同样是一个左闭右开的区间
print(lst1)
```



## 列表元素的删除操作

| 方法       | 操作描述                                                     |
| ---------- | ------------------------------------------------------------ |
| remove（） | 一次删除一个元素<br />重复元素只能删除第一个，<br />元素不存在会抛出ValueError |
| pop（）    | 删除一个指定索引位置上的元素<br />指定索引不存在则会抛出IndexError<br />不指定索引，删除的是列表最后一个元素 |
| 切片       | 一次至少删除一个元素                                         |
| clear      | 清空列表                                                     |
| del        | 删除列表                                                     |

```python
# 列表元素的删除
lst1 = [10, 20, 30, 40, 50, 60, 70, 10]
lst1.remove(10)
print(lst1)
lst1.remove(10)
print(lst1)  # 一次删除一个元素，重复元素只删除第一个（从索引比较小的开始），元素不存在会抛出valueerror
lst1.pop(0)
print(lst1)
lst1.pop()
print(lst1)  # 删除一个指定索引位置上的元素，指定索引不存在则抛出indexerror
lst1[0:2] = []
print(lst1)  # 实际上只是把选中的元素赋值为空了（不确定python里有没有null这个概念）
lst1.clear()  # 清空列表
print(lst1)
del lst1  # 删除列表（通过分析控制台输出，正常输出的线程跟报错线程应该不是同一个线程）
print(lst1)
```



## 列表元素的修改操作

* 改变一个元素
* 改变多个元素

```python
# 列表元素的修改操作
lst1 = [10,20,30,40,50]
print(lst1)
lst1[1] = 70 # 改变一个元素
print(lst1)
lst1[1:3] = ['bang','di'] # 改变多个元素
print(lst1)
```



## 列表的排序操作

* 调用sort（）方法，列表中的所有元素默认按照从小到大的顺序进行排序，可以指定

  > reverse = True，进行降序排序

* 调用内置函数sorted（），可以指定reverse = True，进行降序排序，原列表不发生改变（产生新列表）

```python
# 列表的排序操作
lst1 = [10, 30, 20, 50, 40, 90, 80]
lst1.sort()
print(lst1)  # 默认是升序
lst1.sort(reverse=True)  # reverse为True时是降序
print(lst1)
new_lst1 = sorted(lst1)  # 原列表不会发生改变
print(new_lst1)
print(lst1)
new_lst2 = sorted(lst1, reverse=True)  # 原列表不会发生改变
print(new_lst2)
print(lst1)
```



## 列表生成式

* 生成列表的公式

```python
# 列表的生成式
lst1 = [i*i-i for i in range(1, 10)]
print(lst1)
```



