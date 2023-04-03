特别关键字：const、goto是保留关键字

true、false、null不是关键字，是字面量

**标识符的规范：**

> 包名：多单词组成时所有字母都小写：xxxyyyzzz。
> 例如：java.lang、com.atguigu.bean

> 类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz
> 例如：HelloWorld，String，System等
>
> 大驼峰

> 变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz
> 例如：age,name,bookName,main,binarySearch,getName
>
> 小驼峰

> 常量名：所有字母都大写。多单词时每个单词用下划线连接：XXX_YYY_ZZZ
> 例如：MAX_VALUE,PI,DEFAULT_CAPACITY

Java变量的类型：

基本数据类型：

整数型：byte 、short、int、long(**需要提供后缀大写的L**)

浮点型：float 、 double

字符型：char

布尔型：double

引用数据类型：

类：class eg：String、System

数组array

接口：interface

枚举：enmu jdk5.0

注解：annotation jdk5.0

记录：record jdk十几

long加L，float加F

**浮点类型float、double的数据不适合在**`不容许舍入误差`的金融计算领域。如果需要`精确`
数字计算或保留指定位数的精度，需要使用`BigDecimal类`。

++，--不会改变数据的类型
