# chapter5

## range()的三种创建方式

* 用于生成一个整数序列
* 创建range对象的三种方式

```python
# range()函数的使用

# 第一种创建方式，只有一个参数（小括号中只有一个数）
r = range(10)
print(r) # 直接打印输出的是r对象本身
print(id(r))
print(list(r))

# 第二中种创建方式：有两个参数
r = range(1,10)
print(r)
print(id(r))
print(list(r))

# 第三种：三个参数
r = range(1,10,2)
print(r)
print(list(r))
```

* **range类型的优点：**不管range对象表示的整数序列有多长，所有range对象占用的内存空间都是相同的，因为仅仅需要存储start,stop,step,只有用到range对象时，才会去计算序列种的相关元素
* in与not in 判断整数序列中是否存在（不存在）指定的整数

```python
# 判断指定的整数，是否在序列中
print(10 in r)
print(1 in r)

print(10 not in r)
print(1 not in r)
```



## while循环

```python
# while循环结构

# 第一步：初始化变量
a = 1

# 第二部：条件判断
while a < 10:
    # 第三步：执行循环体
    print(a)
    # 第四步：改变变量
    a += 1
```



## 计算1到100的偶数和

```python
# 计算1到100之间的偶数和

a = 0
sum = 0
while a <= 100:
    if a % 2 == 0:
        sum += a
    a += 1
print(sum)
```



## for-in循环

* for- in 循环

  * in表达从（字符串，序列等）中依次取值，又称为遍历
  * for-in遍历对象必须是可迭代对象（字符串，序列等）

* for-in 的语法结构

  for	自定义的变量	in	可迭代对象：

  循环体

* 如果在循环体中不需要使用到自定义变量，可将自定义变量写为_

```python
# for-in循环

# 字符串也是可迭代对象
for item in 'python':
    print(item)

# 不需要自定义变量的时候可以用_
for _ in range(5):
    print('bangdi')

# 1到100的偶数和
sum = 0
for item in range(0,101,2):
    sum += item
print(sum)
```



## 100到1000水仙花数

```python
# 100到999之间的水仙花

'''
153 = 3*3*3+5*5*5+1*1*1
'''

for item in range(100, 1000):
    ones = item % 10  # 这里要注意是对十取余
    tens = item // 10 % 10
    hundreds = item // 100
    if ones ** 3 + tens ** 3 + hundreds ** 3 == item:
        print(item)
```



## 流程控制语句break

用于**结束**当前循环

```python
# 流程控制语句break

'''
从键盘录入密码，最多三次，如果正确就结束循环
'''

for item in range(3, 0, -1):
    pwd = input('请输入密码')
    if pwd == '777':
        print('登录成功')
        break
    else:
        print('登录失败，剩余', item - 1, '次机会')
```



## 流程控制语句continue

用于**跳过**当前循环

```python
# 流程控制语句continue

'''
要求输出1到50之间5的倍数
'''

# 正常解法1
for item in range(0, 51, 5):
    if item != 0:
        print(item)

print('--------正常解法2------------')
# 正常解法2
for item in range(1, 51):
    if (item % 5 == 0):
        print(item)

print('--------反解法------------')
# 不是5的倍数就跳过
for item in range(1, 51):
    if item % 5 != 0:
        continue
    else:
        print(item)
```



## else 语句（重点）

* 与else语句配合使用的三种情况
  * if条件表达式不成立时执行else
  * for没有遇到break时在循环结束前执行else
  * while没有遇到break时在循环结束前执行else

```python
# else语句

for item in range(3):
    # if item == 2:
    #     break
    # else:
    print(item)
else:
    print('bangdi')

print('-----------------')

item = 0
while item < 3:
    # if item == 2:
    #     break
    print(item)
    item += 1
else:
    print('else语句块')
```



## 循环嵌套

```python
# 嵌套循环

# 输出一个三行四列的矩形
for i in range(1, 4):
    for j in range(1, 5):
        print('*', end='\t')
    print()
print('------------------------')

# 输出一个直角三角形
for i in range(1, 10):
    for j in range(i):
        print('*', end='')
    print()
print('------------------------')

# 输出一个乘法表
for i in range(1, 10):
    for j in range(1,i+1):
        print(i, '*', j, '=', i * j, end='\t')
    print()
```



## 二重循环中的break和continue

* 只会影响本层的循环

```python
# 二重循环中的break和continue

for i in range(5):
    for j in range(1, 11):
        if j % 2 == 0:
            # break
            continue
        print(j, end='\t')
    print()
```

