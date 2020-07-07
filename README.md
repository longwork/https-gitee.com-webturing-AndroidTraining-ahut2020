# AndroidTraining-ahut2020

by ZHAO Jing  260768400@qq.com

## Day01:
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