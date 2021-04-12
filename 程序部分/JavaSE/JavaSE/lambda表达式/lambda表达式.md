# Lambda表达式

## 什么是Lambda表达式

Lambda表达式是Java8中最重要的新功能之一，使用Lambda表达式可以替代只有一个抽象函数的接口实现，告别匿名内部类，代码开起来更简洁易懂。Lambda表达式同时还提升了对集合，框架的迭代，遍历，过滤数据的操作。

### Lambda表达式的特点

* 函数式编程
* 参数类型自动推断
* 代码量少，简洁

### Lambda表达式应用场景

任何有**函数式接口**的地方



## 为什么使用Lambda表达式

简化代码咯



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

