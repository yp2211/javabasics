## 第二章 Java基础语法

### 一、关键字和保留字

#### 关键字
* 定义：被Java 语言赋予了特殊含义，用做专门用途的字符串（单词）
* 特点：关键字中所有字母都为小写

|||
| --- | --- |
|用于定义数据类型的关键字|class、interface、 enum 、byte 、short、 int 、long、 float、 double、 char、boolean、 void|
|用于定义流程控制的关键字|if 、else 、switch、 case、 default、while 、do、 for 、break、 continue、return|
|用于定义访问权限修饰符的关键字|private、 protected、 public|
|用于定义类，函数，变量修饰符的关键字|abstract 、final 、static 、synchronized|
|用于定义类与类之间关系的关键字|extends、 implements|
|用于定义建立实例及引用实例，判断实例的关键字|new 、this、 super、 instanceof|
|用于异常处理的关键字|try 、catch 、finally、 throw、 throws|
|用于包的关键字|package 、import|
|其他修饰符关键字|native 、strictfp、 transient 、volatile、 assert|
|用于定义数据类型值的字面值|true、 false、 null|

#### 保留字

* Java保留字：现有Java版本尚未使用，但以后版本可能会作为关键字使
用。自己命名标识符时要避免使用这些保留字

```
  goto 、const
```

***

### 二、标识符

标识符 ：是指在程序中，我们自己定义内容。比如类的名字、方法的名字和变量的名字等等，都是标识符。

#### 定义合法标识符规则
* 
* 标识符就是名称的意思，所有的名字都统称为标识符
* Java 中经常要定义类、方法、变量等，在定义的时候需要给它们取名字，这些名字就是标识符
* 只有字母（区分大小写），下划线 (_)，美元符号 ($) 和数字组成，长度不受限制
* 第一个字母不能是数字,不能用数字开头
* **不能是关键字**
* 不能是 true、false、null (尽管三个都不是关键字，而是**常量标识**)

#### Java中的名称命名规范

* 包名：多单词组成时所有字母都小写：xxxyyyzzz
* 类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz
* 变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个
* 单词首字母大写：xxxYyyZzz
* 常量名：所有字母都大写。多单词时每个单词用下划线连接：XXX_YYY_ZZZ

> 注意：见名知意 驼峰命名法 尽量不要用拼音
> 
> a. 驼峰命名法: 小驼峰 一般用于变量名，方法名 首字母小写，之后的每一个单词首字母大写 getStudentAge setStudentAge
studentScore studentGender 大驼峰 一般用于类名，接口名 所有单词首字母大写 FirstJava Demo1 Person UserService
StudentDao
> 
> b. 下划线命名法: 一般用于Java中的常量 MAX_VALUE 最大值 DEFAULT_CAPACITY 默认容量

***

### 三、变量

#### 变量概述

变量：常量是固定不变的数据，那么在程序中可以变化的量称为变量。

Java中要求一个变量每次只能保存一个数据，必须要明确保存的数据类型。

Java语言中数据类型：2大类
* 基本数据类型
* 引用数据类型

**字节**

字节是我们常见的计算机中**最小存储单元**，计算机存储任何的数据，都是以字节的形式存储。

8个bit（二进制位） 0000-0000表示为1个字节，写成1 byte或者1 B。

```
  8 bit = 1 B
  1024 B = 1 KB
  1024 KB = 1 MB
  1024 MB = 1 GB
  1024 GB = 1 TB
```

#### Java基本数据类型

基本数据类型：4类8种

* 布尔类型：

```
boolean，值只有2个：true，false
```

* 字符类型：
```
char，2个字节(16位)
```

* 整数类型：
```
byte，字节。1字节(8bit)，
short，短整型。2字节(16bit)，
int，整型。(默认类型)。4字节(32bit)
long，长整型。加L或l。8个字节(64bit)
```

* 浮点类型：
```
float，单精度。加f或F。4个字节(32bit)
double，双精度。(默认类型)。8个字节(64bit)
```

基本数据类型是 Java 语言中内置的类型。整数类型、小数类型、字符类型、布尔类型 这四类是最基础的类型。

|类型|说明|最小值|最大值|默认值|空间|
|---|---|---|---|---|---|
|byte|字节类型|-128(-2^7)|127(2^7-1)|0| 8 位|
|short|短整形|-32768(-2^15)|32767(2^15-1)|0| 16 位|
|int|整形|-(2^31)|2^31-1|0| 32 位|
|long|长整形|-(-2^63)|2^63-1|0L| 64 位|
|float|单精度|-|-|0.0f| 32 位|
|double|双精度|-|-|0.0d| 64 位|
|boolean|布尔|-|-|false| 表示一位的信息|
|char|字符|\u0000 (0)|\uffff (65,535)|-| 单一的16位Unicode字符|

> char 字符型 ，2 个字节 ，用单引号表示 '' ，刚好容纳一个汉字  
> 注意： char 里面只能放一个  
> long类型：建议数据后加L表示。  
> float类型：建议数据后加F表示。

#### 变量定义

变量：计算机内存中的一块存储空间，是存储数据的基本单元。

语法：  
变量包括三个要素： 数据类型 、 变量名 、 数据值 。
```
  数据类型 变量名 = 数据值;
```

示例：

```java
package com.training.lesson2;

/**
 * java的数据类型：
 *
 * 变量的语法格式：
 * 数据类型 变量名 = 赋值;
*/
public class Demo1 {
    public static void main(String[] args) {
        byte b1 = 123;      //赋值就是存数据
        short s1 = 200;
        int i1 = 300;      //默认int;
        long l1 = 1000L;//long类型后面要写上大写的L或者小写的l

        //访问变量就是取数据
        System.out.println("b1:"+b1);//+是表示字符串的拼接
        System.out.println("s1:"+s1);
        System.out.println("i1:"+i1);
        System.out.println("l1:"+l1);

        b1 = 120;

        System.out.println("-------------------------");
        float f1 =3.14f;//用小写的f或者大写的F标识这是float类型
        double d1 = 3.149;//小数的类型默认为double

        System.out.println("f1:"+f1);
        System.out.println("d1:"+d1);

        System.out.println("-------------------------");
        boolean bb1 = true;
        boolean bb2 =false;
        System.out.println("bb1:"+bb1);
        System.out.println("bb2:"+bb2);
        System.out.println("-------------------------");

        char c1 = 'A';
        char c2 = '中';
        System.out.println("c1:"+c1);
        System.out.println("c2:"+c2);
    }
}
```

**注意：**

* Java中每个变量必须先声明，后使用
* 使用变量名来访问这块区域的数据
* 变量的作用域：其定义所在的一对{ }内
* 变量只有在其作用域内才有效
* 同一个作用域内，不能定义重名的变量

#### 字符类型

ASCII(American Standard Code for Information Interchange)，美国标准信息交换码。

> 在计算机内部，所有数据都使用 二进制表示。每一个二进制位（bit）有 0 和 1 两种状态，
因此 8 个二进制位就可以组合出 256 种状态，这被称为一个字节（byte）。一个字节一
共可以用来表示 256 种不同的状态，每一个状态对应一个符号，就是 256 个符号，从
0000000 到 11111111。  
> ASCII码：上个世纪60年代，美国制定了一套字符编码，对英语字符与二进制位之间的
关系，做了统一规定。这被称为ASCII码。ASCII码一共规定了128个 个字符的编码，比如
空格“SPACE”是32（二进制00100000），大写的字母A是65（二进制01000001）。这
128个符号（包括32个不能打印出来的控制符号），只占用了一个字节的后面7位，最前
面的1位统一规定为0。

> GB2312老国标 支持中文简体字和一部分少数民族文字 GBK 新国标 支持中文简体字和少数民族文字 UTF-8 万国
码 支持世界上通用文字，也是后期开发中会使用的到的编码 JavaWEB项目 HTML前端页面 数据库软件编码集全
部都是对应的UTF-8 BIG5 中文繁体字编码，主要流行于中国香港，中国澳门，中国台湾省，新加坡 ASCII码 美
国XXXXX协会制定的一个标准编码。

Java中的所有字符都使用Unicode编码，故一个字符可以存储一个字 母，一个汉字，或其他书面语的一个字符。
* Unicode中每个字符都对应一个二进制整数，可以使用多种方式赋值。
* 字符赋值：char c1 = 'A';（通过''描述为字符赋值）
* 整数赋值：char c2 = 65;（通过十进制数65在字符集中对应的字符赋值）
* 进制赋值：char c3 = '\u0041';（通过十六进制数41在字符集中所对应的字符赋值）

示例：
```java
package com.training.lesson2;

/**
 * 字符类型
 */
public class DemoChar {
    public static void main(String[] args) {
        char c1 ='1';
        char c2 = 97;//char类型的数字1对应ascii对应的一个字符，
        System.out.println(c1);
        System.out.println((int)c1);
        System.out.println(c2);

        System.out.println("-------------------");
        //转义字符
        System.out.println("\"hello,world\"");
        System.out.println("\'hello,world\'");

        System.out.println("\"hello,\nworld\"");
        System.out.println("\"hello,\tworld\"");
    }
}
```

#### 基本数据类型的转换

Java允许程序员在一定程度上进行数据类型的转换。  
8种基本数据类型：  
7种数值类型可以参加转换：byte，short，char，int，long，float，double（boolean不参加）。

**显式转换**

* 显式转换(强制转换)：取值范围大的转为取值范围小的。
* 小范围数据类型 变量 = (小范围数据类型 变量)大范围数据类型;

```java
    int n = (int)6.7;
```
* 语法结构：(要转换的类型)数值

**隐式转换**

* 隐式转换(自动转换)：取值范围小的转为取值范围大的。
* 大范围数据类型 变量 = 小范围的数据类型;

```java
    double d = 10000;
```

> 数据范围从大到小：  
double >float>long>int>short>byte

示例：

```java
package com.training.lesson2;

/**
 * java中的数据类型的转换
 */
public class DemoType {
    public static void main(String[] args) {
        byte a = 123;
        short s = a;//隐式的自动类型转换；
        int i = s;

        System.out.println("a:"+a);
        System.out.println("s:"+s);
        System.out.println("i:"+i);

        int i2 = 128;
        byte b2 = (byte)i2;//强制类型转换：会有数据溢出
        int i3 = 129;
        byte b3 = (byte)i3;

        double d1 = 6.7;
        int i4 = (int)d1;
        System.out.println("b2:"+b2);
        System.out.println("b3:"+b3);

        System.out.println("i4:"+i4);

        System.out.println("----------------------");

        //特殊点1：byte,short,char这三种在运算的时候，会自动转成int;
        // byte a1 = 12;
        // byte a2 = 13;
        // byte bb = a1+a2;

        //特殊点2：
        long l1 = 100L;
        long l2 = 100;//int---->long自动类型转换
    }
}
```

***

### 四、运算符

#### 算术运算符

* +，-，*, / , %，++，--
* +：加
* -：减
* *：乘
* /：取商
* %：取余或者取模

示例：

```
    5 / 3 = 1
    5 % 3 = 2
```

* 自增自减运算
```
    ++：自增1
    --：自减1
```

**i++和++i**

变量在独立运算时， 前 ++ 和 后 ++ 没有区别。  
和其他变量放在一起， 前 ++ 和 后 ++ 就产生了不同。  
* i++，给i加1，但是i++的值是i本身。(先计算，后加1)  
* ++i，给i加1，但是++i的值是i+1了。(先加1，后计算)  

示例：

```java
package com.training.lesson2;

/**
 * 算术运算符
 */
public class Demo2Arithmetic {
    public static void main(String[] args) {
        int i = 10;
        int j =3;

        int div =10/3;
        int mod = 10%3;
        System.out.println("div:"+div);
        System.out.println("mod:"+mod);

        int a = 10;
        System.out.println("a:"+a);
        a++;
        System.out.println("a:"+a);//?
        a--;
        System.out.println("a:"+a);//?


        int b = 3;
        ++b;
        System.out.println("b:"+b);
        --b;
        System.out.println("b:"+b);

        System.out.println("----------------------------");

        int c =3;
        int d =3;
        System.out.println(c++);
        System.out.println(++d);

        int x = 3;
        int y = 10;
        int result1 = ++x + y++;
        System.out.println("x:"+x);
        System.out.println("y:"+y);
        System.out.println("result1:"+result1);

        x= 3;
        y = 4;
        int res1 = (x++)*(--y)-(++x)/(--y);

        System.out.println("x:"+x);
        System.out.println("y:"+y);
        System.out.println("res1:"+res1);
    }
}
```

#### 赋值运算符

* =，赋值：=右侧的数据，赋值给=左边的变量

* +=，-=，*=,/=,%=

* a += b //a =a + b

示例：
```java
package com.training.lesson2;

/**
 * 值运算符
 * =:
 * +=
 * -=
 * *=
 * /=
 * %=
 */
public class Demo4Assign {
    public static void main(String[] args) {
        int i = 10;//相当于把右边的值赋值给左边的变量

        i +=2;//i = i+2; 12
        System.out.println(i);


        i -=4;//i = i-4; 8
        System.out.println(i);

        i *=2;//i = i*2 ; 16
        System.out.println(i);

        i /= 3;//i = i/3;5
        System.out.println(i);
        i %= 1;//i = i%1;0
        System.out.println(i);
        int a = 16;
        a += a++;//a =a +(a++)

        System.out.println("a="+a);
    }
}
```

#### 关系运算符（比较运算符）

用于比较两个数的关系，结果是boolean类型的
* \>,<,>=,<=,==,!=
* ==：判断两个数是否相等
* != :判断两个数是否不相等

**==，和=的区别**
* =：赋值运算符
* ==：比较数值是否相等

示例：

```java
package com.training.lesson2;

/**
 * ==，和=的区别
 */
public class DemoEquals {
    public static void main(String[] args) {
        System.out.println(1==1);//true
        System.out.println(1<2);//true
        System.out.println(3>4);//false
        System.out.println(3<=4);//true
        System.out.println(3>=4);//false
        System.out.println(3!=4);//true
    }
}
```

#### 逻辑运算符（重点）

操作数是boolean类型，结果也是boolean类型

* &：与操作  
规则：操作数都是true，结果才是true，有一个是false就为false。  
一假则假，全真才真  
* |：或操作  
规则：操作数都是false，结果才是false，有一个是true，就是true  
一真则真，全假才假  
* ^：异或：异表示不同  
规则：两个操作数，相同为假，不同为真。  
* !：取非，取反    
规则：!T-->F, !F-->T  
* &&：短路与  
规则：遇到一个false就直接返回结果为false，后面的不再参加计算了。  
* ||：短路或  
规则：遇到一个true就直接返回结果为true，后面不再计算了  

示例：

```java
package com.training.lesson2;

/**
 * 逻辑运算符：操作的是布尔值之间的运算
 */
public class DemoLogic {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        boolean result1 = b1 & b2 & b3;//逻辑与运算，只有有一个false,那么就返回false
        System.out.println(result1);

        boolean result2 = b1 | b2; //逻辑或运算 ，只有一个true ,就返回true;
        boolean result3 = b2 | b4; //两个都是false,才返回false;
        System.out.println(result2);

        System.out.println(result3);
        boolean result6 = b1 ^ b2;
        System.out.println(result6);

        boolean result7 = !(b1 & b2 & b3);
        System.out.println("result7:"+result7);
        int a =3;
        int b =4;

        boolean result4= (a++<3)&&(b++>4);//短路&&，遇到一个false,就返回false,后面的不再执行
        System.out.println("a:"+a);
        System.out.println("b:"+b);

        boolean result5= (a++>2)||(b++>4);//短路||，遇到一个true,就返回true,后面的不再执行
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
```

***

### 五、程序流程控制

#### 选择结构
程序的流程结构：顺序结构，选择结构，循环结构  
通过分支语句实现：if，switch

##### 条件运算符
语法结构：
```
X ? Y : Z
```
* X必须是boolean类型的表达式：True，False  
* X的值为true-->取Y的值  
* X的值为false-->取Z的值  

示例：
```java
package com.training.lesson2;

/**
 * 三元运算符
 */
public class DemoTernaryOperator {
    public static void main(String[] args) {
        int score = 55;
        String res = score >= 60 ? "及格" : "不及格";
        System.out.println("res:" + res);
    }
}
```

练习：

```
    练习1：给定一个年龄，判断是否成年，18岁是分界线。
```

##### if语句

简单if语句语法：

```
    if (条件){
        执行语句
    }
```

示例：

```java
package com.training.lesson2;

/**
 * if 语句
 */
public class DemoIf {
    public static void main(String[] args) {
         /*
         if(布尔表达式)
         {
         // 如果布尔表达式为 true 将执行的语句
         }
         */

         int a = 88;

         if(a > 0){
            System.out.println("88大于0");
         }

         System.out.println(".....over.....");

    }
}
```

练习：

```
    练习1：给定一个数，打印它的绝对值
    练习2：给定一个成绩，如果大于等于60分，就打印及格
```

##### if else语句
语法：
```
    if (条件) {
        执行语句1
    } else {
        执行语句2
    }
```

示例：

```java
package com.training.lesson2;

/**
 * if...else...结构
 */
public class DemoIfElse {
    public static void main(String[] args) {
         /*
        if(布尔表达式){
            // 如果布尔表达式的值为 true
        }else{
            // 如果布尔表达式的值为 false
        }
        */

        int score = 12;
        if(score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }
}
```

练习：

```
    练习1：给定一个数，输出是奇数还是偶数（能否被2整除）
```

##### if的嵌套
语法：

```
    if (条件1) {
        执行语句1
    } else if(条件2) {
        执行语句2
    } else ...
```

示例：

```java
package com.training.lesson2;

/**
 * 嵌套的if....else
 */
public class DemoIfElse2 {
    public static void main(String[] args) {
        char sex = '中';
        if (sex=='男') {
            System.out.println("男厕所");
        } else {
            if (sex == '女') {
                System.out.println("女厕所");
            }else{
                System.out.println("我就不知道了");
            }
        }
    }
}
```

练习：

```
    练习1：给定一个成绩：打印级别
    【0-59】不及格
    【60-69】及格
    【70-79】中等
    【80-89】良好
    【90-100】优秀
```

##### switch语句
可以实现选择结构。

语法：

```
    switch( 变量 ){
        case 常量值1:
            分支1;
            break;
        case 常量值2:
            分支2;
            break;
        ...
        default:
    }
```

示例：

```java
package com.training.lesson2;

public class DemoSwitch {
    public static void main(String[] args) {

        /*
        switch(expression){
        case value :
        // 语句
        break; // 可选
        case value :
        // 语句
        break; // 可选
        // 你可以有任意数量的 case 语句
        default : // 可选
        // 语句
        }
        */

        int num = 5;
        switch (num) {
            case 1:
                System.out.println("第一季度");
                break;
            case 2:
                System.out.println("第二季度");
                break;
            case 3:
                System.out.println("第三季度");
                break;
            case 4:
                System.out.println("第四季度");
                break;
            default:
                System.out.println("非法数字");
        }

    }
}
```

**注意事项：**
1. 作用在int类型，byte，short，int,char，String，枚举
2. case后的数值必须唯一
3. case可以无序
4. break用于防止switch的穿透
5. default是可选的语句。

练习：

```
    练习1：给定一个月份，打印是哪个季节
        3-5：春季
        6-8：夏季
        9-11：秋季
        12-2：冬季
```

#### 循环结构

##### for循环
* 选择结构：条件满足，某些代码才会被执行。  
执行次数：0,1。

* 循环结构：条件满足，某些会被反复的多次执行，直到条件不满足。  
执行次数：0，1，多次

语法结构：  
```
    for (初始化表达式; 循环条件; 操作表达式) {
        执行语句;
        ...
    }
    
    for (表达式1; 表达式2; 表达式3) {
        执行语句;
        ...
    }
```

示例：

```java
package com.training.lesson2;

/**
 * 循环结构：for
 */
public class DemoFor {
    public static void main(String[] args) {
        //打印5次helloworld
        for(int i = 1; i <= 5; i++) { //i=1,2,3,4,5
            //里面的语句会循环执行
            System.out.println("hello,world----->" + i);
        }
    }
}
```

循环结构：条件满足，循环体要多次执行，直到条件不满足为止。  
```
for (表达式1; 表达式2; 表达式3){  
    循环体；
}
```

循环语句和分支语句的结合
```java
package com.training.lesson2;

/**
 * 循环语句和分支语句的结合
 */
public class DemoForIf {
    public static void main(String[] args) {
        System.out.println("1-100内所有的偶数：");
        for(int i = 1; i <= 100; i++) {
            //i=1;i%2!=0,所以 i%2==0不成立
            //i=2;i%2==0,所以 i%2==0成立
            //.....
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
```

练习：

```
    练习1：打印1-100内，能被3整除，不能被5整除的数，
        每行打印5个，统计打印数字的个数
```

**循环的嵌套**
用【System.out.print("*")】和循环语句，尝试打印下面图形：

练习1：

```
    *****
    *****
    *****
    *****
    *****
```

练习2:
```
    
    *
    **
    ***
    ****
    *****
```

##### while循环
语法：

```
    while(循环条件){
        循环体；
    }
```

先判断循环条件，如果满足，就执行里面的循环体；然后再来判断条件是否依然成立，如果成立继续执行，否则结束
了循环。

示例：
```java
package com.training.lesson2;

/**
 * 循环结构： while
 */
public class DemoWhile {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 5) {
            System.out.println(i);
            i++;
        }
        
        System.out.println("退出循环的时候i的值："+i);
    }
}
```

练习：
```
    练习1：打印1-100内能被7整除的数
```

##### do-while循环

语法：

```
    do {
        循环体；
    } while (条件);
```

先执行循环体，然后判断条件，如果满足，再执行循环体，再判断条件，如果不满足就结束了循环。
> 至少执行1次。

* while：先判断，再执行
* do-while：先执行，再判断

示例：

```java
package com.training.lesson2;

/**
 * 循环结构： do ... while ...
 */
public class DemoDoWhile {
    public static void main(String[] args) {
        /*
        * 求1-5的和
        */
        int i = 1;
        int sum = 0;
        do {
            sum += i; //+1+2+3+4+5
            i++;//2,3,4,5,6
        } while (i < 6);

        System.out.println("sum:" + sum);
    }
}
```

练习：
```
    练习2：求1-5的阶乘的和
```

##### break、continue
break：词意：打破，破坏
* 用法1：在switch中，用于防止穿透。
* 用法2：在循环中：for，while，do-while，用于强制结束循环。终止。

continue：词意：继续
* 只是结束某一次循环，循环下次继续的。中止。

break示例：
```java
package com.training.lesson2;

/**
 * 循环当中的break;
 */
public class DemoBreak {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j == 5) {
                    break;
                }
                System.out.println("j:" + j);

                /*
                i=1

                i=2

                i=3

                i=4

                i=5

                */
//                 if(i == 5){
//                    break;//i==5的时候，跳出循环；
//                 }
//
//                System.out.println(i);
            }
        }
    }
}
```

continue示例：

```java
package com.training.lesson2;

/**
 * 循环中的continue
 */
public class DemoContinue {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == 2) {
                    continue;//只用于结束某一次循环
                }
                System.out.println("j:" + j);
            }

            System.out.println(i);
        }
    }
}
```

return示例：

```java
package com.training.lesson2;

/**
 * 循环中的return
 */
public class DemoReturn {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            if (i == 2) {
                return;
            }

            System.out.println(i);
        }
    }
}
```

***
