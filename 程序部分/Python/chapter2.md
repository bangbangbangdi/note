## 二进制和字符编码

- 单位换算

计算机的最小单位，bit

8 bit --> 1 byte

1024 byte --> 1 KB

1024 KB --> 1MB

1024 MB --> 1 GB

1024 GB --> 1 TB

- Unicode和UTF-8

Unicode只是规定了每个字符规定的数字，UTF-8规定了每个二进制数的具体实现方式

```python
# 二进制与字符编码

print(chr(0b100111001011000))
print(ord('乘'))
```



## Python 中的标识符和保留字

```python
# 标识符和保留字

import keyword
print(keyword.kwlist)

['False', 'None', 'True', '__peg_parser__', 'and', 'as', 'assert', 'async', 'await', 'break', 'class', 'continue', 'def', 'del', 'elif', 'else', 'except', 'finally', 'for', 'from', 'global', 'if', 'import', 'in', 'is', 'lambda', 'nonlocal', 'not', 'or', 'pass', 'raise', 'return', 'try', 'while', 'with', 'yield']
```



## 变量的定义和使用

- 变量由三部分组成
  - 标识：表示对象所存储的内存地址，使用内置函数id（obj）来获取
  - 类型：表示的是对象的数据类型，使用内置函数type（obj）来获取
  - 值：表示对象所存储的具体数据，使用print（obj）可以将值进行打印输出

```python
# 变量的定义和使用

name = '邦迪'

print(name)
print('标识', id(name))
print('类型', type(name))
print('值', name)
```



## 变量多次赋值（变量：可变的）

- 当多次赋值之后，变量名会指向新的空间

```python
# 变量的多次赋值

name = 'bangdi'
print(name)

name = '邦迪'
print(name)
```



## 数据类型

- 常用的数据类型
  - 整数类型	int	98
  - 浮点数类似	float	3.14159
  - 布尔类型	bool	True，False
  - 字符串类型	str	邦迪邦迪

```python
# 常见的数据类型

i = 12
f = 3.14
b = True
s = 'bangdi'

print(type(i))
print(type(f))
print(type(b))
print(type(s))
```



## 整型

- 零，正负数
- 二进制，八进制，十进制，十六机制

```python
# 整型，进制

print(0b1100)
print(0o1100)
print(1100)
print(0x1100)
```



## 浮点类型

- 浮点数整数部分和小数部分组成
- 浮点数存储不确定性（导入decimal模块）

```python
# 浮点类型 不确定性

f1 = 1.1
f2 = 2.2
print(f1 + f2)

from decimal import Decimal
print(Decimal('1.1')+Decimal('2.2'))
```



## 布尔类型

- 用来表示真或者假
- True表示真，False表示假
- 布尔值可以转化为整数
  - True	1
  - False	1

```python
# 布尔类型

f1 = True
f2 = False

print(f1 + 1)
print(f2 + 1)
```



## 字符串类型

* 字符串又被称为不可变的字符序列
* 可以使用单引号''双引号""三引号''''''来定义
* 单引号，双引号定义的字符串必须在一行
* 三引号定义的字符串可以分布在多行

```python
# 字符串类型

s1 = 'bangdi,邦迪'
s2 = "bangdi,邦迪"
s3 = '''bangdi,邦迪'''

print(s1,type(s1))
print(s2,type(s2))
print(s3,type(s3))
```



## 数据类型转换

* 为什么要数据类型转换

  > 将不同类型的数据拼接在一起
  >
  > int()	文字类和小数类字符串无法转换成整数
  >
  > float()	文字类字符串不可
  >
  > str()	
  >
  > bool()

```python
# 数据类型转换

s = '777'
# print(s + 1)  # error
print(int(s) + 1)
print(s + str(1))
```

```python
# float()函数

b = True

print(float(b), type(float(b)))
```

**注意：**布尔类型也可以转浮点型或者整型



## 注释

* 在代码中对代码的功能性进行解释说明的标注性文字，可以提供代码的可读性
* 注释的内容会被Python解释器忽略
* 三种类型的注释
  * 单行注释	以#开头，直到换行结束
  * 多行注释	一堆三引号之间的代码
  * 中文编码声明	在文件开头加上中文声明注释，用以指定源码文件的编码格式

```python
# coding:GBK
# 注释

# 这里是单行注释
'''这里是多行注释'''
```

