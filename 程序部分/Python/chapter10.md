# chapter10

## 函数的定义和调用

* 什么是函数？

  * 函数就是执行特定任务以完成特定功能的一段代码

* 为什么需要函数

  * 复用代码
  * 隐藏实现细节
  * 提高可维护性
  * 提高可读性便于调试

* 函数创建

  def	函数名	（[输入参数]）：

  函数体

  [retrun xxx]

```python
# 函数的定义与调用
def calc(a, b):
    c = a + b
    return c


result = calc(10, 20)
print(result)
```



## 函数调用的参数传递	位置实参	关键字实参

* 位置实参
  * 根据形参对应的位置进行实参传递
* 关键字实参
  * 根据形参名称进行实参传递

```python
# 函数定义的参数传递
def calc(a, b):  # a,b称为形式参数，简称形参，形参的位置是在函数的定义处
    c = a + b
    return c


result1 = calc(10, 20)  # 10，20 称为实际参数，简称实参，实参的位置是在函数的调用处
print(result1)

result2 = calc(b=10, a=20)  # =左侧的变量名称为： 关键字参数，如果指明了关键字参数则不会按照形参的顺序进行赋值
print(result2)
```



## 函数调用的参数传递内存分析图

* 在函数调用过程中，进行参数的传递
  * 如果是不可变对象，在函数体的修改不会影响实参的值
  * 如果是可变对象，在函数体的修改会影响到实参的值

```python
# 函数参数传递的内存分析
i1 = 100
lst1 = [10, 20, 30, 40, 50]


def calc(arg1, arg2):
    print('arg1', arg1)
    print('arg2', arg2)
    arg1 = 150
    arg2.append(10)
    print('arg1', arg1)
    print('arg2', arg2)
    return


calc(i1, lst1)
print('i1', i1)  # 如果是不可变对象，在函数体的修改不会影响实参的值
print('lst1', lst1)  # 如果是可变对象，在函数体的修改会影响到实参的值
```



## 函数的返回值

* 如果函数没有返回值，return可以省略不写
* 函数的返回值，如果是1个，直接返回类型
* 函数的返回值，如果是多个，返回的结果为元组

```python
# 函数的返回值
def fun(num):
    odd = []  # 存奇数
    even = []  # 存偶数
    for i in num:
        if i % 2 == 0:
            even.append(i)
        else:
            odd.append(i)
    return odd, even


lst1 = [23, 34, 5, 1123, 4, 64, 234, 64, 83]
print(fun(lst1))
print(type(fun(lst1)))  # 多个返回值时，返回值的类型为元组


def demo1():
    return 'bangdi'


print(demo1())
print(type(demo1()))


def demo2():
    return 'Hello ','bangdi'


print(demo2())
print(type(demo2()))
```



## 函数定义 默认值参数

* 函数定义默认值参数
  * 函数定义时，给形参设置默认值，只有与默认值不符的时候才需要传递实参

```python
# 函数定义，默认值参数
def fun(a, b=10):
    print('a', a)
    print('b', b)
    return

fun(100)
fun(50,30)
```



## 个数可变位置形参，个数可变关键字形参

* 个数可变的位置参数
  * 定义函数时，可能无法事先确定传递的位置实参的个数时，使用可变的位置参数
  * 使用*定义个数可变的位置形参
  * 结果为一个元组
* 个数可变的关键字形参
  * 定义函数时，无法事先确定传递的关键字实参个数时，使用可变的关键字形参
  * 使用**定义个数可变的关键字形参
  * 结果为一个字典

```python
# 可变参数
def fun(*args):  # 个数可变的位置形参
    print(args)
    print(type(args))  # 类型为元组
    return


def fun1(**args):  # 个数可变的关键字形参
    print(args)
    print(type(args))  # 类型为字典
    return


fun('Hello', 'bang', 'di', 777)
fun1(a='Hello', b='bang', c='di', e=777)  # 在传参时必须指明位置参数


def fun(*args1, **args2):  # 函数定义中，可变位置形参最多只能有一个，可变关键字形参最多也之只能有一个，要是同时存在可变位置形参和可变关键字形参时，关键字形参必须在最后
    print(args1)
    print(type(args1))  # 类型为元组
    print(args2)
    print(type(args2))
    return


print('-------------')

fun('Hello', 'bang', 'di', 777, a='bangdi')
```



## 函数的参数总结

| 序号 | 参数的类型                                             | 函数的定义 | 函数的调用 | 备注        |
| ---- | ------------------------------------------------------ | ---------- | ---------- | ----------- |
| 1    | 位置实参<br />将序列中的每个元素都转化为位置实参       |            | √<br />√   | <br />使用* |
| 2    | 关键字实参<br />将字典中的每个键值对都转换为关键字实参 |            | √<br />√   | 使用**      |
| 3    | 默认值形参                                             | √          |            |             |
| 4    | 关键字形参                                             | √          |            | 使用*       |
| 5    | 个数可变的位置形参                                     | √          |            | 使用*       |
| 6    | 个数可变的关键字形参                                   | √          |            | 使用**      |

```python
# 函数的参数总结
def fun(a, b, c):
    print('a=', a)
    print('b=', b)
    print('c=', c)
    return


print('---—----位置实参-------')
fun(1, 2, 3)
lst = [11, 22, 33]
fun(*lst)  # 把序列中的每一个参数都转化为位置实参，需要在序列前加上*
print('-----关键字实参-------')
fun(a=100, b=200, c=300)
dic1 = {'a': 100, 'b': 200, 'c': 300}  # 把字典中的每个键值对都转成关键字实参，需要在字典前加上**
fun(**dic1)


def fun1(a, b, c, d=10):
    print('a=', a)
    print('b=', b)
    print('c=', c)
    print('d=', d)
    return


print('-----默认值形参-----')
fun1(1, 2, 3)


def fun2(a, b, *, c, d=10):  # 如果需要一些参数只能使用关键字实参则在函数定义的时候要加上一个*
    print('a=', a)
    print('b=', b)
    print('c=', c)
    print('d=', d)
    return


print('-----关键字形参-----')
fun2(1, 2, c=3)

print('函数定义时的位置问题')


def fun3(a, b, *, c, d, **args):
    pass


def fun4(*args1, **args2):
    pass
```



## 变量的作用域

- 程序代码能访问该变量的区域
- 根据变量的有效范围可分为
  - 局部变量
    - 在函数内定义并使用的变量，只在函数内部有效，局部变量使用global声明，这个变量就会变成全局变量
  - 全局变量
    - 函数体外定义的变量，可作用于函数内外

```python
# 变量的作用域
def fun(a, b):
    c = a + b
    print(c)
    return


fun(1, 2)
# print(a,b,c)  a,b,c,称为局部变量，因为他们都是在函数体内定义的变量，作用范围也是函数内部

name = 'bangdi'


def fun1():
    print(name)
    return


fun1()
print(name)  # name称为全局变量，name的作用范围为函数内部和外部


def fun2():
    global age  # 在函数内部使用global关键字定义的变量会变成全局变量
    age = 10
    print(age)
    return


fun2()
print(age)  # 在调用的时候要注意，如果函数没有执行则全局变量也不会产生
```



## 递归函数

- 什么是递归函数
  - 如果在一个函数的函数体内调用了该函数本身，这个函数就称为递归函数
- 递归的组成部分
  - 递归调用与递归终止条件
- 递归的调用过程
  - 每递归调用一次函数，都会在栈内存分配一个栈桢
  - 每执行完一次函数，都会释放相应的空间
- 递归的优缺点
  - 缺点：占用内存多，效率低下
  - 优点：思路和代码简单

```python
# 递归函数
# 使用递归函数来计算阶乘


def fun(a):
    if a == 1:
        return 1
    else:
        count = a * int(fun(a - 1))
        print(count)
        return count


fun(5)
```



## 斐波那契数列

- 当前项的元素为前两项的和，例如：1，1，2，3，5，8...

```python
# 斐波那契数列
def fun(a):
    if a <= 0:
        print('输入有误')
    elif a == 1:
        lst = [1]
    elif a == 2:
        lst = [1, 1]
    elif a > 2:
        lst = [1, 1]
        for i in range(2, a):
            lst.append(lst[i - 2] + lst[i - 1])
    return lst


print(fun(8))
```

