# chapter7

## 什么是字典

* python内置的数据结构之一，与列表一样是一个**可变**序列
* 以键值对的方式存储数据，字典是一个无序的序列



## 字典的实现原理

* 字典的实现原理与查字典类似，查字典是先根据部首或拼音查找对应页码，Python中的字典是根据key查找value所在的位置



## 字典的创建

* 两种方式

  1. 使用{}
  2. 使用dict（）

  ```python
  # 字典的创建
  '''使用{}'''
  scores = {'张三': 77, '李四': 98, '王五': 0}
  print(scores)
  print(type(scores))
  
  '''使用dict()'''
  student = dict(name='jack', age=99)
  print(student)
  
  '''空字典'''
  d = {}
  print(d)
  ```



## 字典元素的获取

```python
# 字典元素的获取
scores = {'张三': 77, '李四': 80, '王五': 90}
'''第一种方式，使用[]'''
print(scores['张三'])
# print(scores['赵六'])  # 如果元素不存在则会抛出KeyError

'''第二中方式，使用get()方法'''
print(scores.get('张三'))
print(scores.get('赵六'))  # 与直接查找不同，使用get()方法时如果字典里不存在，则会返回None
print(scores.get('赵六', 77))  # 如果在key后面再添加一个参数则表示，如果元素不存在的情况下会返回什么值
```



## 字典元素的常用操作

* key的判断

  > 1. in	指定的key在字典中存在返回True
  > 2. not in    指定的key在字典中存在返回False

* 字典元素的删除

  > del scores['张三']

* 字典元素的新增

  > scores['Jack'] = 90

```python
# 字典的常用操作
scores = {'张三': 70, '李四': 80, '王五': 90}
print('张三' in scores)
print(70 in scores)  # 这里只会查找keu在不在字典中
print('马六' in scores)
print('张三' not in scores)
print(70 not in scores)
print('马六' not in scores)
print(scores)
del scores['张三']  # 删除指定的键值对
print(scores)
scores.clear()  # 清空字典元素
print(scores)
scores['赵七'] = 60  # 新增元素
print(scores)
scores['赵七'] = 30  # 修改元素
print(scores)
```

* 获取字典视图的三个方法

  > 1. keys()		获取字典中所有key
  > 2. values()      获取字典中所有value
  > 3. items()        获取字典中所有key，value对

```python
# 获取字典视图的三种方法
scores = {'张三': 60, '李四': 70, '王五': 80}
# 获取所有的key
print(scores.keys())
keys = scores.keys()
print(keys)
print(type(keys))
print(list(keys))

# 获取所有的value
print('-----------value---------------')
print(scores.values())
values = scores.values()
print(type(values))
print(list(values))

# 获取所有的键值对
print('-----------items---------------')
print(scores.items())
items = scores.items()
print(type(items))
print(list(items))  # 元组
```

* 字典元素的遍历

```python
# 字典元素的遍历
scores = {'张三': 60, '李四': 70, '王五': 80}
for item in scores:
    print(item, scores[item], scores.get(item))
```



## 字典的特点

* 字典中的所有元素都是一个key-value对，key不允许重复，value可以重复
* 字典中的元素是无序的
* 字典中的key必须是不可变对象(例如：整数，字符串)
* 字典也可以根据需求动态的伸缩
* 字典会浪费较大的内存，是一种使用空间换时间的数据结构(不用一个一个比较)

```python
# 字典的特点
# key不允许重复
scores = {'张三': 60, '李四': 70, '张三': 80}
print(scores)  # 这里可以看到后面张三的值把前面的给覆盖了,钥匙和箱子
# 无序性
lst1 = [60,70,80]
# students = {lst1:11}  key值必须是不可变对象
# 动态分配内存空间
```



## 字典生成式

* 内置函数zip（）
* 用于将可迭代的对象作为参数，将对象中对应的元素打包成一个元组，然后返回由这些元组组成的**列表**

* 字典生成式

```python
dict1 = {item: price for item, price in zip(items, prices1)}
```

```python
# 字典生成式
items = ['Fruits', 'Books', 'Others']
prices1 = [96, 78, 85]
prices2 = [96, 78, 85]
lst1 = zip(items, prices1, prices2)  # 内置函数zip（）可以将多个个列表变为一个元组列表，注意：这里的列表需要通过list函数才能正常输出，直接打印的得出的是一个内存地址
print(list(lst1))
dict1 = {item: price for item, price in zip(items, prices1)}
print(dict1)
```



