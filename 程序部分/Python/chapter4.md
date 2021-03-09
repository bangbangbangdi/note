# chapter4

## 顺序结构

```python
# 顺序结构

print('把冰箱门打开')
print('把大象放冰箱')
print('把冰箱门关上')
```



## 对象的布尔值

```python
# 对象的布尔值

# 测试对象的布尔值
print(bool(False))
print(bool(0))
print(bool(0.0))
print(bool(None))  # 相当于Java中的null?
print(bool(''))
print(bool(""))
print(bool(''''''))
print(bool([]))  # 空列表
print(bool(list()))  # 空列表
print(bool(()))  # 空元组
print(bool(tuple()))  # 空元组
print(bool({}))  # 空字典
print(bool(dict()))  # 空字典
print(bool(set()))  # 空集合
print('-------其他的对的布尔值均为True------------')
```



## 分支结构

```python
# 分支结构

money = 1000  # 余额
s = int(input('输入取款金额：'))
if money < s:
    print('咱没那么多钱')
```



## 双分支结构

```python
# 分支结构

money = 1000  # 余额
s = int(input('输入取款金额：'))
if money < s:
    print('咱没那么多钱')
else:
    money -= s
    print('取出', s, '目前余额为', money)
```



## 多分支结构

```python
# 多分支结构

age = int(input('请输入年龄'))

if (age > 18):
    print('成年')
elif (age > 14):
    print('青少年')
elif (age > 10):
    print('少年')
elif (age > 0):
    print('儿童')
else:
    print('输入有误')
```



## 嵌套if

```python
# 嵌套if
answer = input('您是会员吗？y/n')
if answer == 'y':
    money = int(input('请输入消费单价'))
    if (money >= 200):
        print('打8折最终消费为：', money * 0.8)
    elif (money >= 100):
        print('打9折最终消费为：', money * 0.9)
    elif (money > 0):
        print('最终消费为:', money)
    else:
        print('输入有误')
else:
    money = int(input('请输入消费单价'))
    if (money >= 200):
        print('打8折最终消费为：', money * 0.95)
    else:
        print('最终消费为：', money)
```



## 条件表达式（三元运算符）

```python
# 条件表达

num_a = int(input('输入第一个数字'))
num_b = int(input('输入第二个数字'))
'''
if (num_a > num_b):
    print('第一个数大于第二个数')
elif (num_a < num_b):
    print('第一个数小于第二个数')
elif (num_a == num_b):
    print('第一个数等于第二个数')
else:
    print('输入有误')
'''

# 如果用条件表达式的话
# print('第一个数大于第二个数' if (num_a > num_b) else '第一个数小于或者等于第二个数')
print('第一个数大于第二个数' if (num_a > num_b) else '第一个数小于第二个数' if (num_a > num_b) else '第一个数等于第二个数')
```

**注意：条件表达式能相互嵌套**



## pass 语句

* 语句什么都不做，只是一个占位符，用在语法上需要语句的地方

* 什么时候用

  > 先搭建语法结构，还没想好代码怎么写的时候

* 哪些语句一起使用

  > if语句的条件执行体
  >
  > for-in语句的循环体
  >
  > 定义函数时的函数体

```python
# pass语句

# 什么都不做，只是一个占位符，用在语法上需要语语句的地方
answer = input('您是会员吗？y/n')

if answer:
    print('芜湖~')
else:
    print('起飞')

if answer:
    pass
else:
    pass
```

















