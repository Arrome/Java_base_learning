# README

一个class只通过反射创建一个Class对象

泛型
--------
在虚拟机中泛型类型**擦除特性**<br>

java.lang.reflection.Type接口

* TypeVariable接口：描述类型变量 `T extends Comparable<? super T>`
* WildcardType接口：描述通配符 `? super T`
* ParameterizedType接口：描述泛型类和接口类型 `Comparable<? super T>`
* GenericArrayType接口：描述泛型数组 `T[]`