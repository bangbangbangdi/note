## input()函数的介绍

* 作用：接受来自用户的输入
* 返回值类型：输入值的类型为str
* 值的存储：使用=对输入进行存储

```python
# 输入函数input

present = input('大圣想要什么礼物呢？')
print(present,type(present))
```

```python
# 从键盘录入两个数，计算两个数的和

i1 = input('请输入第一个一个整数')
i2 = input('请输入第二个一个整数')
print(int(i1) + int(i2))
```



## 算数运算符

* 标准算数运算符：加（+），减（-），乘（*），除（/），整除(//)
* 取余运算符：%
* 幂运算符：**

```python
# 运算符

print(1 + 2)
print(1 - 2)
print(1 * 2)
print(1 / 2)

print(1 // 2)  # 整除运算，不要小数位
print(1 % 2)  # 取余运算
print(2 ** 3)  # 幂运算
```



* 取整的特殊情况

  > 一正一负向下取整

```python
# 取余的特殊情况:一正一负向下取整
print(-9 // 4)  # -3
print(9 // -4)  # -3
```



* 取余的特殊情况（一正一负）

  > 余数=被除数-除数*商

```python
# 取余的特殊情况（一正一负）：余数=被除数-除数*商(这里的商是向下取整的商)
print(-9 % 4)  # -9-(4)*(-3) = 3
print(9 % -4)  # 9-（-4）*（-3） = -3
```



## 赋值运算符

```python
# 赋值运算符

# 执行顺序 ==右-->左
i = 3 + 4
print(i)

# 链式赋值
a = b = c = 20
print(a, id(a), b, id(b), c, id(c))
e = 20
d = 20
print(id(e))
print(id(d))

# 参数赋值
a1 = 20
a1 += 10
print(a1)
a1 -= 10
print(a1)
a1 *= 10
print(a1)
a1 /= 10
print(a1)
a1 //= 3
print(a1)
a1 %= 4
print(a1)

# 支持系列解包赋值
a, b, c = 3, 6, 9
print(a, b, c)

# 交换值
a, b, c = c, b, a
print(a, b, c)
```



## 比较运算符

```python
# 比较运算符

a, b = 10, 20
print(a < b)
print(a > b)
print(a <= b)
print(a >= b)
print(a == b)
print(a != b)

'''一个变量由三个部分组成：标识，类型，值
    比较运算符比较的是值的部分
    比较标识(id)可以用    is   is not'''

print('----------比较标识部分-------------')
a, b = 10, 10
print(a == b)
print(a is b)
print(id(a), id(b))  # 这里其实比较的是变量对应的id值（可以理解为Java中的内存？）

a1 = [1, 2, 3, 4]
a2 = [1, 2, 3, 4]
print(a1 == a2)
print(a1 is a2)
print(id(a1), id(a2))
```



## 布尔运算符（逻辑运算符）

```python
# 布尔运算符

# 与运算符 and
a, b = 1, 2
print(a == 1 and b == 2)
print(a == 1 and b < 2)
print(a > 1 and b == 2)
print(a > 1 and b < 2)

# 或运算符 or
print('-----------或运算符-------------')
print(a == 1 or b == 2)
print(a == 1 or b < 2)
print(a > 1 or b == 2)
print(a > 1 or b < 2)

# 非运算符
print('------------非运算符-------------')
print(not True)
print(not False)

# in 与 not in
print('-----------in 与 not in-----------------')
s = 'helloworld'
print('h' in s)
print('z' in s)
print('h' not in s)
print('z' not in s)
```



## 位运算符

将数据转成二进制进行计算

```python
# 位运算

# 按位与 &
print(4 & 6)

# 按位或 |
print(4 | 8)

# 左位移运算符,乘二的n次方
print(2 << 2)

# 右位移运算符，除二的n次方
print(4 >> 2)
print(4 >> 3)
```



## 运算符的优先级

```python
# 运算符的优先级

# 算数运算符的优先级
'''
**
* / // %
+ -

'''

# 位运算符
'''
<< >>
&
|
'''

# 比较运算符
'''
<,>,<=,>=,==,!=
'''

# 布尔运算符
'''
and
or
'''

# 赋值运算符
'''
=
'''
```











