# chapter8

## 什么是元组

* python内置的数据结构之一，是一个不可变序列

* **不可变序列与可变序列**

  > 不可变序列：字符串，元组
  >
  > ​	不可变序列没有增删改查的操作
  >
  > 可变序列：列表，字典
  >
  > ​	可变序列：可以对序列执行增删改操作，对象地址不发生更改

```python
# 什么是元组
# python内置的数据结构之一，是一个不可变序列
# - **不可变序列与可变序列**
#
#   > 不可变序列：字符串，元组
#   >
#   > ​	不可变序列没有增删改查的操作
#   >
#   > 可变序列：列表，字典
#   >
#   > ​	可变序列：可以对序列执行增删改操作，对象地址不发生更改

# 不可变序列
print('—————————不可变序列———————————')
str = 'bang'
print(id(str))
str = str + 'di'
print(id(str))

# 可变序列
print('—————————可变序列———————————')
lst1 = [60, 70, 80, 90]
print(id(lst1))
lst1.append(100)
print(id(lst1))

dic1 = {'bang': 70, 'di': 80}
print(id(dic1))
dic1['erro'] = 777
print(id(dic1))
```



## 元组的创建方式

* 直接使用小括号

* 使用内置函数tuple()
* 只包含一个元组的元素需要使用逗号和小括号

```python
# 元组的创建方式
t1 = ('Python', 'world', 98)
print(t1)
print(type(t1))

t2 = tuple(('Python', 'world', 98))
print(t2)
print(type(t2))

t3 = ('Python',)  # 只包含一个元组的元素需要使用逗号和小括号,如果没有逗号则会认为类型为str(字符串)
print(t3)
print(type(t3))

# 空列表，空字典，空元组
lst1 = []
lst2 = list()

dic1 = {}
dic2 = dict()

tup1 = ()
tup2 = tuple()

print('空列表', lst1, lst2)
print('空字典', dic1, dic2)
print('空元组', tup1, tup2)
```



## 为什么要将元组设计成不可变序列

* 为什么要将元组设计成不可变序列
  * 在多线程环境下，同时操作对象时不需要加锁
  * 因此，在程序中尽量使用不可变序列（可能不准确，不可变的速度应该会慢）
  * 注意事项：元组中的存储是对象的引用
    * 如果元组中对象本身为不可变对象，则不能再引用其他对象
    * 如果元组中的对象是可变对象，则可变对象的引用不允许改变，但数据可以改变

```python
# 为什么要将元组设计成不可变序列
t = (10, [20, 30], 40)
print(t)
print(t[0], type(t[0]), id(t[0]))
print(t[1], type(t[1]), id(t[1]))
print(t[2], type(t[2]), id(t[2]))

# t[1] = 100  # TypeError: 'tuple' object does not support item assignment 不允许重新赋值
t[1].append(100)
print(t)
```



## 元组的遍历

* 元组是可迭代对象，所以可以使用for...in进行遍历

```python
# 元组的遍历
# 元组是可迭代对象，所以可以使用for...in进行遍历
tup1 = ('Python', 'bangdi', 98)
print(tup1[0])
print(tup1[1])
print(tup1[2])
print('-----------for in-----------')
for t in tup1:
    print(t)
```



## 集合的概述与创建

### 什么是集合

* Python语言提供内置的数据结构
* 与列表，字典一样都属于可变类型序列
* 集合是没有value的字典

### 集合的创建方式

* 直接{}
* 使用内置函数set（）



## 集合的相关操作

* 集合元素的判断操作

  > in / not in

* 集合元素的新增操作

  > 调用add()方法，一次添中一个元素
  >
  > 调用update（）方法，至少添中一个元素

* 集合元素的删除操作

  > 调用remove（）方法，一次删除一个指定元素 ，如果指定的元素不存在抛出KeyError
  >
  > 调用discard（）方法，一次删除一个指定元素，如果指定的元素不存在不会抛出异常
  >
  > 调用pop（）方法，一次只删除一个任意元素
  >
  > 调用clear（）方法，清空集合



## 集合间的关系

* 两个集合是否相等
  可以使用运算符==或！=进行判断
* 一个集合是否是另一个集合的子集
  可以调用方法issubset进行判断
* 一个集合是否是另一个集合的超集
  可以调用方法issuperset进行判断
* 两个集合是否没有交集
  可以调用方法isdisjoin进行判断

```python
# 集合间的关系
set1 = {10, 20, 30, 40, 50}
set2 = {30, 40, 50, 10, 20}
set3 = {10, 20, 30, 40, 50, 70, 80}
set4 = {10, 20, 30, 40, 50, 70, 80, 100}
set5 = {200, 300, 400}

print(set1 == set2)  # 因为集合是乱序的，所以两个集合相等的唯一标准是集合内的元素是否一致
print(set1.issubset(set3))  # 可以用issubset（）方法判断是否为另一集合的子集
print(set4.issubset(set3))  # 可以用issubset（）方法判断是否为另一集合的子集
print(set3.issuperset(set1))  # 调用issuperset（）方法判断是否为另一集合的超集
print(set1.isdisjoint(set5))  # 调用isdisjoint来判断两个集合是否有交集
```



## 集合的数学操作

* 交集
  intersection	&
* 并集
  union    |
* 差集
  difference    -
* 对称差集
  symmetric_difference    ^

```python
# 集合的数学操作
set1 = {10, 20, 30, 40}
set2 = {30, 40, 50, 60, 70}
# 集合的焦急
print(set1.intersection(set2))
print(set1 & set2)
# 集合的并集
print(set1.union(set2))
print(set1 | set2)
# 集合的差集
print(set1.difference(set2))
print(set1 - set2)
# 集合的对称差集
print(set1.symmetric_difference(set2))
print(set1^set2)
```



## 集合生成式

{i*i 	for	i	in	range(10)}

```python
# 集合生成式
lst1 = [i * i for i in range(10)]
print(lst1)

lst2 = {i * i for i in range(10)}
print(lst2)
```



## 列表，字典，元组，集合总结

| 数据结构      | 是否可变 | 是否重复                | 是否有序 | 定义符号    |
| ------------- | -------- | ----------------------- | -------- | ----------- |
| 列表（list）  | 可变     | 可重复                  | 有序     | []          |
| 元组（tuple） | 不可变   | 可重复                  | 有序     | （）        |
| 字典（dict）  | 可变     | key不可重复/value可重复 | 无序     | {key:value} |
| 集合（set）   | 可变     | 不可重复                | 无序     | {}          |















