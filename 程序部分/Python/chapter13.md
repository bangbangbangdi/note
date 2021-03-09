# chapter13

## 面向对象的三大特征：封装，继承，多态

* 封装：提高程序的安全性
  * 将数据（属性）和行为（方法）包装到类对象中。在方法内部对属性进行操作，在类对象的外部调用方法。这样，无需关心方法内部的具体实现细节，从而隔离了复杂度
  * 在Python中没有专门的修饰符用于属性的私有，如果该属性不希望在类对象外部被访问，前边使用两个__
* 继承：提高代码的复用性
* 多态：提高程序的可扩展性和可维护性



## 封装的实现

```python
class Student:
    def __init__(self, name, age):
        self.__name = name
        self.set_age(age)

    def get_age(self):
        return self.__age

    def set_age(self, age):
        if 0 <= age <= 120:
            self.__age = age
        else:
            self.__age = 18

    def show(self):
        print(self.__name, self.__age)


stu1 = Student('bangde', 23)
print(stu1.get_age())
stu1.show()
# print(stu1.__name)  # AttributeError: 'Student' object has no attribute '__name'
print(stu1._Student__age) # 即使是设为__不希望被访问，但是还是可以通过 _Student__age的方法来访问的
```



## 继承

* 如果一个类没有继承任何类，则默认继承object
* Python支持多继承
* 定义子类时，必须在其构造函数中调用父类的构造函数

```python
# 继承
class Person(object):
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def info(self):
        print(self.name, self.age)


class Student(Person):
    def __init__(self, name, age, stu_no):
        super().__init__(name, age)
        self.stu_no = stu_no


class Teacher(Person):
    def __init__(self, age, name, teachofyear):
        super().__init__(age, name)
        self.techofyear = teachofyear


stu = Student('bangdi', 23, 9527)
tea = Teacher('xiayu', 25, 9528)

stu.info()
print(stu.stu_no)
tea.info()
print(tea.techofyear)


class A(object):
    pass


class B(object):
    pass


class c(A, B):  # Python 的多继承
    pass
```



## 方法的重写

* 方法的重写
  * 如果子类对继承自父类的某个属性或方法不满意，可以在子类中对其（方法体）进行重新编写
  * 子类重写后的方法中可以通过super().XXX()调用父类中被重写的方法

```python
# 方法的重写
class Person(object):
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def info(self):
        print(self.name, self.age)


class Student(Person):
    def __init__(self, name, age, stu_no):
        super().__init__(name, age)
        self.stu_no = stu_no

    def info(self):
        print('学号为', self.stu_no)  # 在这里对父类Person 的 info方法进行了重写


class Teacher(Person):
    def __init__(self, age, name, teachofyear):  # 在这里对父类的Person的info方法进行了重写
        super().__init__(age, name)
        self.techofyear = teachofyear

    def info(self):
        print('教龄为', self.techofyear)
        super().info()  # 重写后在方法体重依然可以调用父类的方法


stu = Student('bangdi', 23, 9527)
stu.info()
tea = Teacher('xiayu', 25, 9528)
tea.info()
```





## object类

* object类是所有类的父类，因此所有类都有object类的属性和方法
* 内置函数dir()可以查看指定队对象所有属性
* Object有一个\__str\__（）方法，用于返回一个人对于“对象的描述”，对应与内置函数str（）经常用于print（）方法，来邦我们查看对象的信息，所以我们经常会对\__str\__（）进行重写

```python
# object类
class Student():
    def __init__(self, name1, age1):
        self.name = name1
        self.age = age1

    def show(self):
        print('这里是show方法')
        return '这里上show方法的返回值'

    def __str__(self):
        return '学生的名字为{0}，年纪为{1}'.format(self.name, self.age)



stu = Student('bangdi',23)
print(dir(stu))
print('--------------')
print(stu.__str__())  # __str__()方法的返回值与stu的返回值一致
print(stu.__str__)  # 直接打印方法名会返回对象的id和对方法的描述
print(stu)  # 直接打印对象其实是调用了__str()__方法
print('------------')
print(stu.show())
print(stu.show)
stu.show()
```



## 多态

* 简单的说，多态据说**具备多种形态**，它指的是：即便不知道一个变量所引用的对象到底是什么类型，仍然可以通过这个变量调用方法，在运行过程中根据变量所引用对象的类型，动态决定调用哪个对象中的方法

```python
# 多态
class Animal(object):
    def eat(self):
        print('动物会吃...')


class Dog(Animal):
    def eat(self):
        print('狗狗喜欢吃肉')


class Cat(Animal):
    def eat(self):
        print('猫猫喜欢吃鱼')


class Person(Animal):
    def eat(self):
        print('人吃万物')


def eat(animal):
   animal.eat()

eat(Animal())
eat(Dog())
eat(Cat())
eat(Person())
```



### 静态语言实现多态的三个必要条件

* 继承
* 方法重写
* 父类引用指向子类对象



### 动态语言

* 动态语言崇尚**鸭子类型**当看到一只鸟走起来像鸭子，游泳起来像鸭子，收起来也像鸭子，那么这只鸟就可以被称为鸭子。在鸭子类型中，不需要关心对象是什么类型，到底是不是鸭子，只关心对象的行为



## 特殊的属性和方法

|          | 名称         | 描述                                                         |
| -------- | ------------ | ------------------------------------------------------------ |
| 特殊属性 | \__dict\__   | 获得类对象或实例对象所绑定的所有属性和方法的字典             |
| 特殊方法 | \__len\__()  | 通过重写__len\__()方法，让内置函数len（）的参数可以是自定义类型 |
| 特殊方法 | \__add\__()  | 通过重写\__add\__()方法，可以使用自定义对象具有+功能         |
| 特殊方法 | \__new()\__  | 用于创建对象                                                 |
| 特殊方法 | \__init\__() | 对创建的对象进行初始化                                       |



```python
# 特殊属性
class A:
    pass


class B:
    pass


class C(A, B):
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def show(self):
        print('show')


class D(A):
    pass


# 创建C类对象
x = C('Jack', 23)
print(x.__dict__)  # 获取实例对象的属性字典
print(C.__dict__)  # 获取类对象的属性，方法和返回值
print('-----------------------')
print(x.__class__)  # 获取实例对象所属的类
print(C.__bases__)  # C类的所有父类元素
print(C.__base__)  # C类的最近一个父类元素
print(C.__mro__)  # 获取类的层次结构
print(A.__subclasses__())  # 获取类的子类列表

# 特殊方法
class Student:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def __add__(self, other):
        return self.name + other.name  # 通过重写__add__（）方法可以让对象进行+法操作

    def __len__(self):
        return len(self.name) # 通过重写__len__()方法可以让对象输出长度（任意类型）

stu1 = Student('xiayu', 25)
stu2 = Student('bangdi', 23)

print(stu1 + stu2)
print(stu1.__add__(stu2))

lst1 = [1, 2, 3, 4, 5]
print(len(lst1))
print(len(stu2))
```



## 创建对象的过程

```python
# 创建按对象的过程
class Person(object):
    def __new__(cls, *args, **kwargs):
        print('__new__被调用执行了，cls的id值为{0}'.format(id(cls)))
        obj = super().__new__(cls)
        print('创建对象的id为：{0}'.format(id(obj)))
        return obj

    def __init__(self, name, age):
        print('__init--被调用了，self的id值为{0}'.format(id(self)))
        self.name = name
        self.age = age


print('object这个类对象的id为{0}'.format(id(object)))
print('Person这个类对象的id为{0}'.format(id(Person)))
p1 = Person('bangdi', 20)
print('p1这个Person类的实例对象的id为：{0}'.format(id(p1)))
'''
通过观察可以推导出，创建一个对象的过程分为一下几步 
1.类对象会传给__new__方法，并创建一个obj的实例对象(完成对象的创建，造出一个人)
2.obj的实例对象会传给__init__方法，并创建一个Person对象（完成对象的初始化，造出一个具有细节的人）
'''
```



## 类的浅拷贝与深拷贝

* 变量的赋值操作
  * 只是形成两个变量，实际上还是指向同一个对象
* 浅拷贝
  * Python拷贝一般都是浅拷贝，拷贝时，对象包含的子对象内容不拷贝，因此，源对象与拷贝对象会引用同一个子对象
* 深拷贝
  * 使用copy模块的deepcopy函数，递归拷贝对象中包含的子对象，源对象和拷贝的对象所有的子对象也不相同

```python
# 深拷贝
class Cpu:
    pass


class Gpu:
    pass


class Disk:
    pass


class Computer:
    def __init__(self, cpu, gpu):  # 这里其实是没有设置参数类型的，任意类型的参数都可以
        self.cpu = cpu
        self.gpu = gpu


cpu1 = Cpu()
cpu2 = cpu1
gpu = Gpu()
print('gpu的id为：', gpu)
print('cpu1的id为：', cpu1)
print('cpu2的id为：', cpu2)  # 这两其实是一个对象
computer1 = Computer(cpu1, gpu)
print('computer1的各项id为：', computer1, computer1.cpu, computer1.gpu)
computer2 = Computer('bangdi', 23)
print('computer2的各项id为：', computer2, computer2.cpu, computer2.gpu)

# 浅拷贝
import copy

computer3 = copy.copy(computer1)  # 观察输出可以发现这只是创建了两个不同的computer对象，而对象内的cpu，gpu对象还是原本的
print('computer对象为', computer1, 'cpu对象为', computer1.cpu, 'gpu对象为', computer1.gpu)
print('computer对象为', computer3, 'cpu对象为', computer3.cpu, 'gpu对象为', computer3.gpu)
print('computer对象是否相等', computer1 == computer3)
print('cpu对象是否相等', computer1.cpu == computer3.cpu)
print('gpu对象是否相等', computer1.gpu == computer3.gpu)
print('----------------')

# 深拷贝
computer4 = copy.deepcopy(computer1) # 观察输出可以发现两个computer对象内的所有对象都不同
print(computer1, computer1.cpu, computer1.gpu)
print(computer4, computer4.cpu, computer4.gpu)
print('computer对象是否相等', computer1 == computer4)
print('cpu对象是否相等', computer1.cpu == computer4.cpu)
print('gpu对象是否相等', computer1.gpu == computer4.gpu)
```



