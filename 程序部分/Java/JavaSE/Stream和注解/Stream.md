# Stream

## 是什么

Stream是一组用来处理数组、集合的**API**

### Stream特性

1. 不是数据结构、没有内部存储

2. 不支持索引访问

3. 延迟计算

   ```java
   //没有最后的终止操作findFirest中间的语句便不会执行
   Arrays.asList(1,2,3,4,5,6).stream().filter(x->{
     System.out.println("这里是是中间代码");
     return x==5;
   }).findFirst();
   ```

4. 支持并行

5. 很容易生成数组或集合

6. 支持过滤、查找、转换、汇总、聚合等操作

## 为什么

代码简洁、意图明确，使用stream接口让你从此告别for循环

多核友好，只需要多调用parallel()方法

## 怎么做

### Stream运行机制

Stream分为 源source、中间操作、终止操作

流的源可以是一个数组、一个集合、一个生成器、一个I/O通道等等

一个流可以有零个或者多个中间操作，每个中间操作都会返回一个新的流，供下一个操作使用。一个流只会有一个终止操作

Stream只有遇到终止操作，它的源才开始执行遍历操作

### Stream的创建

1. 通过数组

   ```java
   String[] strs = {"a", "b", "c", "d"};
   Stream<String> strs1 = Stream.of(strs);
   strs1.forEach(System.out::println);
   ```

2. 通过集合

   ```java
   List<String> list = Arrays.asList("1", "2", "3", "4", "5");
   Stream<String> stream = list.stream();
   stream.forEach(System.out::println);
   ```

3. 通过Stream.generate方法来创建

   ```java
   Stream<Integer> generate = Stream.generate(() -> 1);
   generate.limit(10).forEach(System.out::println);
   ```

4. 通过Stream.iterate方法来创建

   ```java
   Stream<Integer> iterate = Stream.iterate(1, x -> x + 1);
   iterate.limit(10).forEach(System.out::println);
   ```

5. 其他API创建

   ```java
   String str = "bangdi";
   IntStream intStream = str.chars();
   intStream.forEach(System.out::println);
   ```

### Stream常用API

循环 forEach

```java
Arrays.asList(1, 2, 3, 4, 5).stream().filter((x) -> x % 2 == 0).forEach(System.out::println);
```

计算 min、max、count、average

```java
//求集合的最大值
System.out.println("元素最大值为" + Arrays.asList(1, 2, 3, 4, 5, 6).stream().max((a, b) -> a - b).get());
//求集合的最小值
System.out.println("元素最小值为" + Arrays.asList(-100, 1, 2, 3, 4, 5, 6).stream().min((a, b) -> a - b).get());
//求集合的元素总数
System.out.println("元素的总数为：" + Arrays.asList(1, 2, 3, 4, 5).stream().count());
//求元素的平均数
System.out.println("元素的平均数为：" + Arrays.asList(1, 2, 3, 4, 5).stream().mapToInt(x -> x).average().getAsDouble());
```

匹配 anyMatch、allMatch、noneMatch、findFirst、findAny

```java
//查找任意一个流元素；如果是数据较少，串行地情况下，一般会返回第一个结果，如果是并行的情况，那就不能确保是第一个
System.out.println(IntStream.range(0, 100).parallel().findAny().getAsInt());
```

汇聚 reduce
收集器 toArray collect

```java
//将Stream转为collect
Set<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());
```

```java
//将流变成Array
Object[] objects = Arrays.asList(4, 3, 2, 1).stream().toArray();
for (int i = 0; i < objects.length; i++) {
  System.out.println("将Stream转成Array" + (int) objects[i]);
}
```







