# chapter15

## 编码格式的介绍

* Python的解释器使用的是Unicode（内存）
* .py文件在磁盘上使用UTF-8存储（外存）

```python
# encoding=gbk
# 编码格式的设置
```



## 读取磁盘中的内容

```python
# 读取磁盘中的内容
file = open('cc.txt','r')
print(file.readlines())
file.close()
```



## 常用的文件打开模式

* 文件的类型
  * 按文件中数据的组织形式，文件分为以下两大类
    * 文本文件：存储的是普通字符文本，默认为unicode字符集，可以使用记事本程序打开
    * 二进制文件：把数据内容用字节进行存储，无法用记事本打开，必须使用专用的软件打开

| 打开模式 | 描述                                                         |
| -------- | ------------------------------------------------------------ |
| r        | 以只读模式打开文件，文件的指针将会放在文件的开头             |
| w        | 以只写模式打开文件，如果文件不存在则创建，如果文件存在，则覆盖原有内容，文件指针在文件的开头 |
| a        | 以追加模式打开文件，如果文件不存在则创建，文件指针在文件开头，如果文件存在，则在文件末尾追加内容，文件指针在原文件末尾 |
| b        | 以二进制方式打开文件，不能单独使用，需要与共它模式一起使用，rb，或者wb |
| +        | 以读写方式打开文件，不能单独使用，需要与其他模式一起使用，a+ |

```python
# 读取磁盘中的内容
file = open('cc.txt', 'r')
print(file.readlines())  # readlines读取出来的是一个列表
file.close()

# file = open('aa.txt', 'w')
# file.write('hello\nPython')  # 观察结果，可以发现Python输出的文本默认为GBK编码

# file = open('aa.txt', 'a')
# file.write('hello\nPython')  # a，以追加模式打开文件

src_file = open('src_flie.jpg','rb')
target_file = open('target_file.jpg','wb')
target_file.write(src_file.read())
target_file.close()
src_file.close()
```



## 文件对象的常用方法

| 方法名                | 说明                                                         |
| --------------------- | ------------------------------------------------------------ |
| read（[size]）        | 从文件中读取size个字节或字符的内容返回，若省略[size],则读取到文件末尾，即一次读取文件所有内容 |
| readline()            | 从文本文件读取一行内容                                       |
| readlines()           | 把文本文件中每一行都作为独立的字符对象，并将这些对象放入列表返回 |
| write(src)            | 将字符串src内容写入文本                                      |
| writelines(s_list)    | 将字符串s_list内容写入文本                                   |
| seek(offset[,whence]) | 把文本指针移动到新的位置，offset表示相对whence的位置：<br />offset:为正往结束方向移动，为负往开始方向移动<br />whence不同的值代表不同含义：<br />0：从文件夹开头计算（默认值）<br />1：从当前位置开始计算<br />2：从文件尾开始计算 |
| tell（）              | 返回文件指针的当前位置                                       |
| flush()               | 把缓冲区的内容写入文件，但不关闭文档                         |
| close()               | 把缓冲区的内容写入文件，同时关闭文档，释放文件对象相关资源   |

```python
# 文件对象的常用方法

# 读方法
file = open('aa.txt', 'r')
print(file.read(10))  # 读取X个字符或者，字节
print(file.readline())
print(file.readlines())

# 写方法
w_file = open('dd.txt', 'w')
s_list = ['java', 'bangdi', 'jojo']
w_file.write('write\n')  # 将字符串写入文件
w_file.writelines(s_list)  # 将列表内容写入文件
w_file.close()

# seek
print('----------------------')
file.seek(1)  # 调整光标位置
print(file.tell())  # 显示光标位置
print(file.read())
print(file.tell())
file.close()
```



## with语句（上下文管理器）

* with语句可以自动管理上下文资源，不论什么原因跳出with块，都能确保文件正确的关闭，以此来达到释放资源的目的

```python
# with语句测试
class MyContentMgr(object):
   def __enter__(self):
       print('开始')
       return self

   def __exit__(self, exc_type, exc_val, exc_tb):
       print('结束')
       return

   def show(self):
       print('show')
       return

with MyContentMgr() as file:
    file.show()
```



## 目录操作

* os模块是Python内置的与操作系统功能和文件系统相关的模块，该模块中语句的执行结果通常与操作系统相关，不同操作系统结果可能不同
* os模块与os.path模块用于对目录或文件进行操作

| 函数                            | 说明                           |
| ------------------------------- | ------------------------------ |
| getcwd()                        | 返回当前的工作目录             |
| listdir(path)                   | 返回指定路径下的文件和目录信息 |
| mkdir(path[,mode])              | 创建目录                       |
| makedirs(path1/path2...[,mode]) | 创建多级目录                   |
| rmdir(path)                     | 删除目录                       |
| removedirs(path1/path2...)      | 删除多级目录                   |
| chdir(path)                     | 将path设置为当前工作目录       |

```python
# 目录操作
import os

# os.system('calc.exe') # 打开内置程序
print(os.getcwd())
print(os.listdir('C:\\Users\\我是谁\\PycharmProjects\\Python\\chapter15'))

os.mkdir('ee.txt') # 创建新文件夹
os.makedirs('A/B/C') # 创建多级文件夹

os.rmdir('ee.txt')
os.removedirs('A/B/C')
```



## os.path模块操作目录相关函数

| 函数            | 说明                                                        |
| --------------- | ----------------------------------------------------------- |
| abspath(path)   | 用于获取文件或目录的绝对路径                                |
| exists(path)    | 用于判断文件或目录是否存在，如果存在返回True，否则返回False |
| join(path,name) | 将目录与目录或文件名拼接起来                                |
| splitext()      | 分离文件名和扩展名                                          |
| basename(path)  | 从一个目录中提取文件名                                      |
| dirname(path)   | 从一个路径中提取文件路径，不包括文件名                      |
| isdir(path)     | 用于判断是否为路径                                          |

```python
# os.path模块的相关函数
import os.path as op
print(op.abspath('dd.txt'))
print(op.exists('C:\\Users\\我是谁\\PycharmProjects\\Python\\chapter15\\dd.txt')) # 判断指定目录下的文件是否存在
print(op.exists('C:\\Users\\我是谁\\PycharmProjects\\Python\\chapter15\\ff.txt'))  # 判断指定目录下的文件是否存在
print(op.join('C:\\Users\\我是谁\\PycharmProjects\\Python','chapter15\\dd.txt')) # 拼接目录路径或者文件名
print(op.splitext('dd.txt')) # 分离文件名和扩展名
print(op.basename('C:\\Users\\我是谁\\PycharmProjects\\Python\\chapter15\\dd.txt'))
print(op.dirname('C:\\Users\\我是谁\\PycharmProjects\\Python\\chapter15\\dd.txt'))
print(op.isdir('C:\\Users\\我是谁\\PycharmProjects\\Python\\chapter15\\dd.txt'))
```

