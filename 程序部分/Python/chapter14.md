# chapter14

## 什么叫模块

* 模块的英文为Modules
* 函数与模块的关系
  * 一个模块中可以包含N多个函数
* 在Python中一个扩展名为.py的文件就是一个模块
* 使用模块的好处
  * 方便其他程序和脚本的引入并使用
  * 避免函数名和变量名冲突
  * 提高代码的可维护性
  * 提高代码的可重用性



## Python程序的分层

* 包1
  * 模块A
    - 函数
    - 类
      - 类属性
      - 实例属性
      - 静态方法（无隐含函数，类对象和实例对象都可以的调用）
      - 类方法（隐含参数为cls）
      - 实例方法（隐含参数为self）
    - 语句
  * 模块B
* 包2



## 自定义模块

* 创建模块
  * 新建一个.py文件，名称尽量不要与Python自带的标准模块名称相同
* 导入模块
  * import	模块名称	[as 别名]
  * from    模块名称   import 函数/变量/类（只导入模块的一部分）



## PyCharm 中Directory与Python package的区别

* 如果我们将所有相关的代码都放在一个py文件中，则该py文件既是程序又是模块，但是程序和模块的设计目的是不同的，程序的目的是为了运行，而模块的目的是为了其他程序进行引用

```python
from calc import add # 只导入模块的一部分
c = add(1,2)
print(c,type(c))

import calc # 导入整个模块
d = calc.add(5,5)
print(d,type(d))
```



## 以主程序的方式运行

* 每个模块都有一个记录名称的变量\__name\__,顶级模块（主线程所在的模块？）的\__name\__变量的值为\__main\__

```python
# 自定义的计算模块
def add(a, b):
    return a + b


print(add(20, 30))

if __name__ == '__main__':  # 当运行该模块时才会执行
    print(add(200, 100))

    
# 以主程序的方式运行
import calc2
print(calc2.add(200,300)) # 可以观察到calc2模块里的函数执行了,而主程序并没有执行
```



## Python当中的包

* Python中的包
  * 包是一个分层的目录结构，它将一组功能相近的模块组织在一个目录下
  * 作用
    * 代码规范
    * 避免模块名称冲突
  * 包与目录的区别
    * 包含\__init\__.py文件的目录称为包
    * 目录里通常不包含\__init\__.py文件
  * 包的导入
    * import	包名.模块名

```python
import packageT.module as mo  # 在导入带包的模块时，跟Python一样格式是包名+模块名

print(mo.a)
```



## Python当中常用的内容模块

| 模块名   | 描述                                                         |
| -------- | ------------------------------------------------------------ |
| sys      | 与Python解释器及其环境操作相关的标准库                       |
| time     | 提供与时间相关的各种函数的标准库                             |
| os       | 提供了访问操作系统服务功能的标准库                           |
| calendar | 提供与日期相关的各种函数的标准库                             |
| urllib   | 用于读取来自网上（服务器）的数据标准库                       |
| json     | 用于使用JSON序列化和反序列化对象                             |
| re       | 用于在字符串中执行正则表达式匹配和替换                       |
| math     | 提供标准算术运算符的标准库                                   |
| decimal  | 用于进行精确控制运算精度，有效数位和四舍五入操作的十进制运算 |
| logging  | 提供了灵活的记录事件，错误，警告和调试信息等日志信息的功能   |



## 第三方模块的安装及使用

* 第三方模块的安装

  pip	install	模块名

* 第三方模块的使用

  import	模块名

```python
# 第三方模块的安装及使用
import schedule
import time


class test(object):
    a = 1

    def job(self):
        print(self.a,'经过')
        self.a = self.a + 1

t = test()
schedule.every(1).seconds.do(t.job)
while True:
    schedule.run_pending()
```



