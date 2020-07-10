# AndroidTraining-ahut2020

by ZHAO Jing  zj@webturing.com

## Day01:Java编程概述
### 准备 
#### 环境搭建

- java开发环境：jdk 1.8 or 1.9
- Android开发环境: intelliJ社区版+ADT =Android Studio

#### 文档链接

- runoob [菜鸟教程](https://www.runoob.com)
- git
- java [java基础教程](https://www.runoob.com/java/java-tutorial.html)
- android[Andoid基础](runoob.com/w3cnote/android-tutorial-intro.html)

### 工具
- git/github/gitee
  - Linus ： Linux/GIT
  - github
- IntelliJ/AndroidStudio
- 文档工具 markdown

### 课程结构
- CoreJava 复习 4~5day
  - jdk核心API
  - 基本数据结构和算法
  - 设计模式
- Android 基础  3~4day
  - 安卓原理
  - 四大组件
  - 文件/数据库
  - 多媒体
- Android 项目  4~5day

### 参考网址
- 菜鸟网
- jdkAPI
- AndroidAPI

### Java基础 
#### JVM基础数据类型

- 8种基础数据类型Primary DataType及其包装器类型Wrapper
  - boolean 布尔类型/Boolean
  - 1 byte 字节/Byte
  - 2 char 双字节  Unicode  vs ASCII /Character
  - 4 short 短整数 /Short
  - 4 int  整数/ Integer
  - 8 long 长整数 /Long
  - 4 float 单精度浮点数/ Float
  - 8 double 双精度浮点数/Double

#### 基础IO格式化输入输出:

- Scanner
- System.out/err.printf/print/println

#### 静态方法（子函数)

- 参数传递
  - 基本数据类型：值传递
  - 引用数据类型：引用传递
- 数组 int[] arr;
  - 定义，浅拷贝/深拷贝/克隆 :引用类型 x==y 意味着hashCode相同或者同为null
  - 索引访问，遍历:Arrays.toString(arr);
  - 排序 :Arrays.sort对基本数据类型仅支持按照非降序排列
  - 查找：Arrays.binarySearch对基本数据类型仅支持已经按照非降序排列的二分查找

## Day02  java 基础：字符和字符串基础

### 字符char

- Unicode vs ASCII
- 字符的表示'c' \u0045

#### 包装器Character类

- 分类 isDigit/isUpper/isLower/isSpace
- 大小写转化toUpperCase/toLowerCase

#### 字符数组

- 长度length 不可变
- 排序

### 字符串类

#### 不可变的字符串类String

- 因为不可以改变，所以不适合大量的拼接（每次拼接都会产生一个副本）

- API：length/charAt/indexOf/startsWith/endsWith/contain/split
- 类型转化: parsXXX
- 查找/匹配: 多次查找匹配

#### 可变字符串类StringBuilder/StringBuffer

- 字符的可以扩展的列表
- 适合频繁修改的场景

### 正则表达式

- 模式匹配
- 常用模式（闭包）
  - 数字 \d
  - 字母 [a-zA-Z]
  - 非 ^ 
  - 正闭包+
  - 星闭包*  

## DAY03 java OOP和自定义类

### 1. 类基础：(构造函数，this,可见性描述符)

#### 静态（方法）变量 static method/field

#### 构造方法(constructor)与this  this()

####成员（方法）变量  member method/field

#### 可见性描述符visibility :

- private: 仅该类自己可见，

- default:同一个包类可见

- protected:子类可见

- public：所有类都可见

#### 静态字段static与成员字段

- 静态字段在类加载时初始化，属于整个类（所有成员都共享），用类名引用

-  成员字段在构造函数调用时初始化，属于对象本身(每一个对象一份)，用对象引用

#### 静态方法与成员方法：

- 静态方法只要导入了类，都可以调用（静态方法内部只能调用静态方法）

- 成员方法必须在对象产生后（通常是new）后才可以使用，既可以调用成员方法也可以调用静态方法

### 2 继承和多态

#### 类继承inheritance

##### 子类拥有所有父类声明为public/protected的字段，可以调用描述符为public/protected的方法

##### 子类构造函数调用时默认在第一行添加一个super()来调用父类默认构造函数（且只调用一次）

#### A  a=new B();意义为创建一个B类的对象并把引用赋值给a

#####  前提是B必须是A的子类，或者B实现了A的接口
##### 如果引用a.x则只会访问A类中的数据

##### 如果是a.f() 需要满足：

- 类A中必须拥有方法f()的声明，可以是抽象方法

- 调用子类f还是父类f则会根据最后一次绑定的对象类型而定(多态)

#### abstract/final

##### abstract描述的方法没有方法体{},该类必须是抽象类

##### 抽象类的子类如果要实例化（生成实例，调用该类构造函数）则必须实现抽象方法，否则子类也必须声明为抽象类

- final 定义的变量为常量：Et .final int a=3;后a++则编译错误

- 如果为引用类型，表示引用关系不会改变（对象本身可以数值变化）

- final描述的方法不可以被子类重载

- final 描述的类，不可以有子类（称为最终类）

- final/abstract永远不会同时修饰一个元素

###  3接口和包

#### 接口interface:

- 全部方法都是public abstract的方法，

- 全部数据都是public static final数据

- 接口刻画了类的部分特征，比父类更灵活，更抽象，可以当成父类使用

#### 包package:

- 按层次构建类，并解决类重名的问题，都是小写字母如com.qq.view

- 默认描述符描述的字段/方法，只在同一个包内可以访问

#### 匿名类和内部类

- 定义在类A内部的类B称为内部类，其名称为A$B.class，为了提高封装性

- 匿名类：隐式继承/实现一个类(接口)A（一般都重载该类方法），为了提高程序的效率，如比较器Comparator和窗体鼠标消息等

### 4 OO建模：//封装，继承，组合

#### 基本数据建模：分数，点，日期等

#### 数据结构建模：
- 列表：顺序表（栈，队列，单链表，双向链表）
- 二叉树
- 图：

## Day04:Java集合框架

### 集合框架概述java.util.*

#### 集合框架意义

#### 集合框架的核心技术：

- 泛型编程  class XXX<T>{}

- 算法和数据结构的实现

- OOP的典范

#### 算法库：

- 静态算法（用类调用）：Math/Arrays/Collections

- 对象算法：Random BigInteger BigDecimal

- 包装器：Integer Long Character	

###  顺序表：Vector/ArrayList/Stack/LinkedList/Queue

### 数组表：动态容量实现

- Vector

- ArrayList

  #### 数组表的应用Stack

- 括号匹配检测

- 后缀式的计算

#### 链表 LinkedList 双向链表

i. 集合迭代器访问方法

ii. Foreach

iii. Get（index)//链表O(n),数组表为O(1)

#### 链表的应用 队列Queue

- 队列模拟
- 宽度优先搜索

## Day05:Java集合框架(2):

### Set:

####  Set://不再支持随机访问（索引访问）

i. 基于排序树TreeSet:

1. 排序 去重 

2. 所有操作原子操作都是lg(N)

ii. 基于哈希表HashSet

1. 去重

2. 所有原子操作 O(1)

   

### Map<K,V>

i. 基于排序树TreeMap要求键有序

ii. 基于哈系表HashMap 不保证键有序

iii. 迭代键的集合keySet(),valueSet()， EntrySet（）

\3. Queue： 

###  PriorityQueue :（**k**th查询比较高效）

- 保证所有操作都是log(n)
- 默认是小顶堆
- 大顶堆的定义 new PriorityQueue<>(Collections.reverseOrder());

### .案例建模：

i. 字符串统计,键值互转

ii. 利用Map实现电话本操作

iii. 利用Map实现数据库的模拟（登录验证）

iv. 二叉树建模：BinaryTree

v. 图建模：TreeMap<Integer,Vector<Integer>> graph;

###  总结：

- 深入理解Java泛型思想

-  掌握集合排序、各种数据结构操作

- 利用集合框架提升建模和编程能力