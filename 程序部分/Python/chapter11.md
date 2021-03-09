# chapter11

## BUG的由来及分类

- Bug的又来
  - 老哥在电脑里发现了一只飞蛾，然后就把飞蛾命名为Bug
- Debug
  - 杀虫



## Bug的由来及分类

- 粗心导致的语法错误SyntaxError

```python
# 粗心导致的Bug
age = input('请输入你的年龄')
if age >= 18:
    print('你已经是个成年人亮点')
```

这里会抛出以下异常

```python
TypeError: '>=' not supported between instances of 'str' and 'int'
```

*  知识点不熟练

```python
# 知识点不熟练导致的错误
lst1 = [1,2,3,4]
print(lst1[4])
```

这里会抛出以下异常

```python
IndexError: list index out of range
```

* 思路不清晰导致的问题

一步一步往下查



## 异常处理

```python
# try-except结构
a = int(input('输入第一个参数'))
b = int(input('输入第二个参数'))
result = a / b
print('结果为:', result)
```

如果第二个参数为0时会抛出如下异常

```python
ZeroDivisionError: division by zero
```

如果有参数为空或不为数字时会抛出如下异常

```python
ValueError: invalid literal for int() with base 10: ''
```

以上情况可以用try-except进行捕捉

```python
# try-except结构
# a = int(input('输入第一个参数'))
# b = int(input('输入第二个参数'))
# result = a / b
# print('结果为:', result)

try:
    a = int(input('输入第一个参数'))
    b = int(input('输入第二个参数'))
    result = a / b
    print('结果为:', result)
except ZeroDivisionError:
    print('除数不允许为0')
except ValueError:
    print('输入参数错误，参数必须为整数')
```



## 异常处理中的else，finally

* else
  * 如果try块中没有抛出异常，则执行else块，如果try中抛出异常，则执行except块
* finally
  * 无论是否发生异常都会被执行，能常用来释放try块中申请的资源

```python
# try else finnally 结构
try:
    a = int(input('输入第一个参数'))
    b = int(input('输入第二个参数'))
    result = a / b
    print('结果为:', result)
except ZeroDivisionError:
    print('除数不允许为0')
except ValueError:
    print('输入参数错误，参数必须为整数')
else:
    print('程序正常结束')
finally:
    print('无论出不出错都要求会执行的代码')
```



## 常见的异常类型

| 序号 | 异常类型          | 描述                           |
| ---- | ----------------- | ------------------------------ |
| 1    | ZeroDivisionError | 除（或取模）零（所有数据类型） |
| 2    | IndexError        | 序列中没有此索引（index）      |
| 3    | KeyError          | 映射中没有这个键               |
| 4    | NameError         | 未声明/初始化对象（没有属性）  |
| 5    | SyntaxError       | Python语法错误                 |
| 6    | ValueError        | 传入无效的参数                 |



## traceback模块的使用

* 使用traceback模块打印异常信息

```python
# traceback模块的使用
# print(1 / 0)
# print('后续代码')  # 可以看到后续代码都没有运行

# try:
#     print(1 / 0)
# except:  # 无参的情况下，所有异常都会被捕获
#     print('出错')
import traceback

try:
    print(1 / 0)
except:
    traceback.print_exc()
print('后续代码')  # 可以看到异常被捕捉打印了以后并不会影响后续代码的执行
```



## Pycharm的调式（断点测试）

* 断点
  * 程序运行到此处，暂时挂起，停止执行。此时可以详细观察程序的运行情况，方便做出进一步的判断

```python
# 断点测试
i = 1
while i < 10:
    print(i)
    i += 1
```



## 编程思想

|        | 面向过程                                                     | 面向对象                                     |
| ------ | ------------------------------------------------------------ | -------------------------------------------- |
| 区别   | 事物比较简单，可以用线性的思维去解决                         | 事物比较复杂，使用简单的线性思维无法解决     |
| 共同的 | 面向过程和面向对象都是解决实际问题的一种思维                 | 面向过程和面向对象都是解决实际问题的一种思维 |
|        | 二者相辅相成，并不是对立的<br />解决复杂问题，通过面向对象方式便于我们从宏观上把握事物键的复杂关系，方便我们分析整个系统；具体到围观操作，仍然使用面向过程的方式来解决 |                                              |



