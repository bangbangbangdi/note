# Lambda表达式

## 什么是Lambda表达式

Lambda表达式是Java8中最重要的新功能之一，使用Lambda表达式可以替代只有一个抽象函数的接口实现，告别匿名内部类，代码开起来更简洁易懂。Lambda表达式同时还提升了对集合，框架的迭代，遍历，过滤数据的操作。

### Lambda表达式的特点

* 函数式编程
* 参数类型自动推断
* 代码量少，简洁

### Lambda表达式应用场景

任何有**函数式接口**的地方

什么是函数式接口？

### 函数式接口

有且只有一个抽象方法（Object类中的方法除外）的接口是函数式接口
注解@FunctionalInterface，可用于判断一个接口是否为函数式接口



## 为什么使用Lambda表达式

简化代码咯

面向函数式编程、未来的趋势

## 怎么用Lambda表达式

### 实现简单的接口

```java
package com.bangdi;

public class Demo01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类实现接口");
            }
        }).start();

        new Thread(()->{
            System.out.println("Lambda表达式实现接口");
        }).start();
    }
}
```

## 方法的引用

方法引用是用来直接访问类或者实例的已经存在的方法或者构造方法，方法引用提供了一种引用而不执行方法的方式，如果抽象方法的实现恰好可以使用调用另外一个方法来实现，就**有可能**可以使用方法引用

| 类型         | 语法               | lambda表达式                       |
| ------------ | ------------------ | ---------------------------------- |
| 静态方法引用 | 类名::staticMethod | (args)->类名.staticMethod(args)    |
| 实例方法引用 | inst::instMethod   | (args)->inst.instMethod(args)      |
| 对象方法引用 | 类名::instMethod   | (inst,args)->类名.instMethod(args) |
| 构造方法引用 | 类名::new          | (args)->new 类名(args)             |

