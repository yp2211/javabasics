## 第4章 面向对象（二）

### 一、static关键字
- 静态（static）可以修饰属性和方法。

- 称为静态属性（类属性）、静态方法（类方法）。

- 静态成员是全类所有对象共享的成员。

- 在全类中只有一份，不因创建多个对象而产生多份。

- 不必创建对象，可直接通过类名访问。

例子：

```java
package com.training.lesson3;

public class Demo1 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.setName("Tom");
        a1.setIsMale(true);

        Animal a2 = new Animal();
        a2.setName("Jerry");
        a2.setIsMale(false);

        a1.doWork();
        a2.doWork();

        //调用静态的方法：类名.方法名
        Animal.DoSomeStaticFunction();
    }
}
```

```java
package com.training.lesson3;

public class Animal {

    private String name;

    private boolean isMale = true;

    public static void DoSomeStaticFunction() {
        System.out.println("You are calling DoSomeStaticFunction.");
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }
    public boolean getIsMale() {
        return this.isMale;
    }

    public static boolean isAlive = true;

    public Animal() {
        this.name = "none";
    }

    public Animal(String name) {
        if (Animal.isAlive) {
            this.name = name;
        } else {
            this.name = "dead";
        }
    }

    public void doWork() {
        // 1st step
        printName();

        // 2nd step
        printSucceed();
    }

    private void printName() {
        if (this.isMale) {
            System.out.println("I'm Mr. " + this.name);
        } else {
            System.out.println("I'm Ms. " + this.name);
        }
        return;
    }

    private void printSucceed() {
        System.out.println("Succeed");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```


#### 静态属性

形成静态属性，不再属于对象。非静态属性（实例属性）属于对象，随着对象的创建而产生，每个对象的属性值都是独立的。

**静态属性是属于类的，只有一份(节省内存)**。应该由类来访问，但是对象也可以访问，所有的对象共享着一份数据。

非静态属性由对象访问：对象.属性-->赋值，取值

静态属性由类访问：类名.静态属性-->赋值，取值

**静态属性可以和final搭配使用，形成静态常量**。

#### 静态方法

形成了静态方法。属于类而不再属于对象了，应该由类来访问，但是对象也可以访问。

普通的方法由对象调用。

静态方法中：只能访问属于类，不能访问属于对象。

A：访问静态属性

B：访问静态方法

C：不能直接访问非静态属性

D：不能直接访问非静态方法

非静态方法中：属于类，属于对象都可以访问

A：访问静态属性

B：访问静态方法

C：访问非静态属性

D：访问非静态方法

```java
package com.training.lesson3;

public class Demo2 {
    public void eat() {
        System.out.println(this.name + ",吃东西啦。。。"); //非静态方法，可以访问非静态属性
        System.out.println("城市：" + Person.city); //非静态方法，可以访问静态属性
        this.showInfo(); // 非静态方法，可以调用非静态方法。
        Person.printCity(); //非静态方法，可以调用静态方法。
    }

    public static void test1() { //属于类的
        System.out.println(Person.city); //静态方法中，可以访问静态属性。
        Person.printCity();//静态方法中，可以访问静态方法。
        //System.out.println(name); //静态方法中，不能访问非静态的属性
        //this.showInfo(); //静态方法中，不能调用非静态的方法。
    }
}
```

#### 静态代码块

代码块，就是一块代码。使用{}包裹起来的。

- 普通代码块：{}包裹起来一段代码。注意作用域。

- 构造代码块：写在类里，方法外的代码块，就叫构造代码块。当创建对象的时候，随着构造函数的调用而执行。而且优先于构造函数执行。构造函数被多次调用，那么构造代码块也被多次调用。

- **静态代码块：用static关键字修饰的代码块。在类第一次使用的时候执行，优先于main的执行。只执行一次。例如连接数据库的驱动等**

- 同步代码块：多线程。

**优先级别：静态代码块 > 构造代码块 > 构造方法**

### 二、继承

#### 概念

生活中我们经常听到一些名词，譬如富二代，官二代，红二代，穷二代，农二代等等，它代表中人与人之间的一种关系。那么程序当中怎么表示这种关系呢？

概念：描述两个类的关系的。在Java中，类的继承是指在一个现有类的基础上去构建一个新的类，构建出来的新类被称作子类(派生类，SubClass)，现有类被称作父类(超类，SuperClass)，**子类会自动拥有父类所有非私有的属性和方法**

意义：

A：避免重复的代码。(从子类的角度)

B：扩展类的功能。(从父类的角度)

继承性：子类，父类。存在继承关系。

子类对象，可以直接访问父类的非私有的属性和方法。(避免重复代码)

子类也可以新增自己的属性和方法。(扩展类的功能)

子类可以重新实现父类已有的方法。(扩展类的功能)

#### 语法

父类：A类

子类：B类

语法结构：

```
class 父类{

}

class 子类 extends 父类{

}
```
**extends**关键字：表示两个类是继承关系。

```java
    public class Person {
        String name;
        int age;
        
        public void eat(){
            System.out.println("吃东西。。。。。");
        }
        
        public void sleep(){
            System.out.println("睡觉");
        }
    }

    /**
     * extends关键字：表示两个类是继承关系。
      */
    public class Student extends Person{
        String school;
    
        //@Override可以不加，但是如果加上，子类的重写的方法一定要和父类的那个方法名相同
        public void eat(){
            System.out.println("学生吃东西。。。。。");
        }
        
        public void study(){
            System.out.println("学习了。。。。。");
        }
    }
```

```java
    //父类的创建
    Person p1 = new Person();
    p1.name = "乔布斯";
    p1.age = 55;
    p1.eat();
    p1.sleep();
    //p1.study();父类无法访问子类新增的方法和属性
    Student stu = new Student();
    stu.name = "小学生";
    stu.age = 34;
    stu.eat();
    stu.sleep();
    stu.school = "图灵";
    stu.study();//子类肯定可以访问新增的方法
```

#### 继承中的构造方法

1/**

2* 父类，动物类

3*/

4public class Animal {

5String name;

6int age;

7

8public Animal(){

9System.out.println("父类的无参的构造方法。。");

10}

11

12//有参的构造方法

13public Animal(String name,int age){

14System.out.println("父类的有参的构造方法。。");

15this.name = name;

16this.age = age;

17}

18

19

20public void eat(){

21System.out.println("吃东西。。。。。");

22}

23

24}

25

26public class Cat extends Animal {

27String color;

28

29public Cat(){

30

31}

32

33public Cat(String name,int age,String color){

34//System.out.println("子类的有参构造");

35//super();//默认调用，隐含调用父类的无参的构造方法

36super(name,age);

37this();//争宠。。

38this.color = color;

39System.out.println("子类的无参的构造方法。。");

40}

41

42public void catchMouse(){

43System.out.println("抓老鼠......");

44}

45

46}

#### super关键字

子类对象的创建过程：

子类的构造方法中，默认先调用父类的无参构造方法。如果没有显示的调用，那么隐含着super()。

super关键字：

可以访问父类的属性

可以访问父类的方法

指代父类的构造方法， 如果有多个，靠参数来区分。要在第一行。

this关键字：

作为本类的对象，

访问本类的属性。如果在继承中，本类没有这个属性，那么再找父类中。

访问本类的方法

可以指代本类的构造方法：this()。要在第一行。


1class A{

2int i=100;

3int j = 200;

4

5public void test(){

6System.out.println("i---->"+this.i);

7System.out.println("j---->"+this.j);

8System.out.println("------------test1-------------");

9}

10

11public void fun(){

12System.out.println("父类的fun()方法。。。");

13}

14

15}

16

17class B extends A{

18

19int i = 300;

20

21public void test2(){

22System.out.println("i------>"+super.i);//子类有的，就访问子类

23System.out.println("j------>"+j);//如果子类没有相应的属性，那么会默认去找父类的属性

24System.out.println("------------test2-----------------");

25

26this.fun();

27}

28

29 //	public void fun(){

30 //	System.out.println("子类重写了父类的fun()方法。。。");

31//

32//}

33

34}

this和super的对比：






















this，super关键字，不能出现在static方法中。

#### 方法重写[重点]

重写：

关键字：override

概念：继承关系中，子类将父类已有的方法重新实现，叫做方法的重写。


1public class Animal {

2String name;

3int age;

4

5public void eat(){

6System.out.println("动物吃东西。。。。");

7}

8}

9

10

11public class Fish extends Animal {

12

13String color;

14

15@Override

16public void eat() {

17System.out.println("鱼游海底。。。。吃东西。。。");

18}

19}

20

21Animal a = new Animal();

22a.eat();//父类对象，访问父类方法

23

24Fish fish = new Fish();

25fish.eat();//子类对象，访问子类重写后的方法。。。

26

27


规则：

A：继承关系中。

B：子类重写的方法的声明，必须和父类一致。

方法的返回值(注意点：子类重写的方法的返回类型可以是父类方法返回类型的子类)，参数列表，方法名。

C：子类重写方法的访问权限，不能比父类更加严格。

D：重写的方法，不能抛出比父类更大的异常。

重载：overload

概念：一个方法，因为参数不同，执行的具体的方法也不同。

规则：

A：同一个类中。

B：方法名必须一致。

C：参数列表必须不同：顺序，个数，类型。





















### 三、访问修饰符

访问权限：对类，方法，变量，常量等访问位置的限定。通过访问权限修饰符来实现。

在Java中，可以在类、类的属性以及类的方法前面加上一个修饰符（modifier），来对类进行一些访问上的控制。

private：私有的，限制在本类中才能访问。

default：什么都不写，就是default。同类，同包。

protected：受保护的，同类，同包，不同包(限于子类访问)

public：公共的，同类，同包，不同包。

示例：


1

2

3public class Test {

4

5private int age;//private 只能在本类中访问

6

7int i;//default：什么都不写，就是default。同类，同包。

8

9protected int j;//protected：受保护的，同类，同包，不同包(限于子类访问)

10

11public void print(){//public：公共的，同类，同包，不同包。

12System.out.println("age:"+age);

13}

14

15}

16


示例：

1

2

3

4/**

5* 同一个包，不同的类

6*/

7public class Demo6 {

8

9public static void main(String[] args) {

10Test test = new Test();

11//test.age //无法访问私有属性

12

13test.i = 100;//default修饰的可以在同一个包中访问

14System.out.println("i的值："+test.i);

15

16test.j = 200;//protected修饰的，可以在同一个包中访问

17System.out.println("j的值："+test.j);

18

19test.print();//同一个包中，可以访问

20}

21}

22





1

2

3/**

4* 同一个包中，子类

5*/

6public class SubTest extends Test {

7

8public void test(){

9//System.out.println(""+this.age);无法访问私有属性

10System.out.println(""+this.j);//子类可以访问

11}

12}

13





1package com.tuling.access.sub;

2

3import com.qf.access.Test;

4

5/**

6* 不同的包，子类

7*/

8public class SubTest2 extends Test {

9public void subTest(){

10System.out.println(""+this.j);//protected修饰的属性，在不同的包中，子类也可以访问

11

12}

13}

14





1package com.tuling.access.sub;

2

3

4import com.tuling.access.Test;

5

6/**

7* 不同的包，不同的类

8*/

9public class Demo {

10

11public static void main(String[] args) {

12Test test =new Test();

13//test.i = 100;//在不同的包中，default修饰的属性无法访问

14

15//test.j = 200;//在不同的包中，protected修饰的属性无法访问，

16

17test.print();//不同的包中，可以访问

18

19

20}

21}

22

对类的修饰：只能是default和public。protected不能修饰一个类。




















最终结论：

private<default<protected<public


### 四、final关键字

词意：终结的，最终的，最后的。

final可修饰的内容：

类（最终类）

方法（最终方法）

变量（最终变量）


final修饰类：此类不能被继承。String、Math、System均为final修饰的类，不能被继承。

final修饰方法：此方法不能被覆盖。意为最终方法，不支持子类以覆盖的形式修改。

final修饰变量：此变量值不能被改变（常量）。所有final修饰的变量只能赋值一次，值不允许改变。


final修饰基本类型：值不可变

final修饰引用类型：地址不可变

静态常量不再提供默认值，必须手动赋予初始值。

示例：


1package com.tuling.part4;

2

3//public final class Animal {//final修饰的类，是不能被继承的

4public class Animal {

5		
6	//	public final void eat(){//修饰的方法，不能被重写
7	//	System.out.println("动物吃东西。。。。。。");
8	//	}
9

10public  void eat(){

11System.out.println("动物吃东西。。。。。。");

12}

13

14

15public int test1(){

16System.out.println("test1........");

17return 0;

18}

19}

20

子类：


1package com.tuling.part5;

2

3/**

4*

5*

6* 重写

7*/

8public class Fish extends Animal {

9

10@Override

11public void eat() {

12System.out.println("鱼吃什么。。。。。");

13}

14

15//@Override//加上这个标识，一定是重写:返回值要一样，方法名要一样，参数列表要一样

16public int  test1(int a){

17System.out.println("wowowo");

18return 0;

19}

20

21

22}

23





