# chapter12

## 类与对象

- 类

  - 类别，分门别类，人类，鸟类，动物类，植物类
  - 类是多个类似事物组成群体的统称。能够帮助我们快速理解和判断事物的性质

- 对象

  - 某个具体的人，具体的鸟
  - 对象是类的实例

  

## 定义Python中的类

- 创建类的语法

```python
class Student:
    pass
```

- 类的组成
  - 类属性
  - 实例方法
  - 静态方法
  - 类方法

```python
# 定义Python中的类
# class Student:
#     pass
#
#
# print(id(Student))
# print(type(Student))
# print(Student)

# 类的组成
class Student:  # 定义了一个Student类
    native_pace = '吉林'  # 类属性（静态成员变量？)

    # 初始化方法(构造方法)
    def __init__(self, name, age):
        self.name = name  # 这里的self.name称为实体属性
        self.age = age
        print('这是初始化方法')

    # 静态方法
    @staticmethod
    def run():
        print('这是静态方法')

    @classmethod
    def cmethond(cls):
        print('这是class方法')

    # 实例方法
    def eat(self):  # 实例方法：定义在类外面的叫函数，定义在类里面的叫方法
        print('这是实例方法')


def study():  # 函数：定义在类之外的方法叫函数
    print('这是函数')


study()
cc = Student('bangdi', 23)
cc.eat()
cc.run()
Student.run()
```



## 对象的创建

* 对象的创建又称类的实例化
* 语法:

```python
对象名 = 类名（）
```

```python
# 对象的创建
class Student:
    def __init__(self):
        print('实例方法')

    def eat(self):
        print('这是实例方法')


stu = Student()

print(id(stu))  # 实例对象
print(type(stu))
print(stu)  # 可以看到直接打印对象的话，输出的是id 和 type的值
print('-------------')
print(id(Student))
print(type(Student))
print(Student)  # 类对象
print('-------------')

Student.eat(stu)
```



## 类属性，类方法，静态方法

* 类属性：类中方法外定义的变量称为类属性，被该类的所有对象所共享
* 类方法：使用@classmethod修饰的方法，使用类名直接访问的方法
* 静态方法：使用@staticmethod修饰的方法，使用类名直接访问的方法

```python
# 类属性，类方法，静态方法
class Student():
    gender = '男'

    def __init__(self, name, age):
        self.name = name
        self.age = age

    @classmethod
    def cmethod(cls):
        print('这是类方法')

    @staticmethod
    def smethod():
        print('这是静态方法')


stu1 = Student('bangdi', 23)
stu2 = Student('xiayu', 25)

print(stu1.gender)
print(stu2.gender)
print(Student.gender)

Student.cmethod()
Student.smethod()
```



## 动态绑定属性和方法

* Python是动态语言，在创建对象之后，可以动态的绑定属性和方法

```python
# 动态绑定属性和方法
class Student():
    def __init__(self, name, age):
        self.name = name
        self.age = age


stu1 = Student('bangdi', '23')
stu2 = Student('xiaoyu', '25')

stu1.gender = '男'  # 注意这里很神奇的可以在对象创建后还绑定对象的属性

print(stu1.name, stu1.age, stu1.gender)


# print(stu2.name, stu2.age,stu2.gender)

def eat():
    print('学生在吃饭')


stu1.eat = eat
stu1.eat()
```

