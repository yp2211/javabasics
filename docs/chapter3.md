## 第3章 面向对象（一）

### 一、Java方法（函数）
#### 概念
概念：也叫函数，其实就是具有一定特殊功能的一段代码，将需要在多个位置重复使用的一组代码，定义在方法内部。  
意义：1.避免了重复的代码。2.增强了程序的扩展性。

#### 定义方法
用法：  
step1：方法的定义(声明)

```java
    public static void main(String[] args) {}
```

语法格式：

```
    [修饰符1,修饰符2...] 返回值/void 方法名(参数列表){
        .....
        return
    }
```

示例：
```java
    //求1-10的和
    public static void getSum(){
        //方法体
        int sum =0;
        for(int i=1;i<=10;i++){
            sum +=i;
        }
        System.out.println("sum:"+sum);
    }
```

> 修饰符：public，static  
返回值：一个方法执行之后，返回给调用处的结果。可能有，也可能没有。  
有：在方法定义的时候，写清楚方法要返回的数据的类型。  
没有：void，表示这个方法执行结束之后，没有返回值给调用处。  
方法名：也是一种标识符。首字母小写，驼峰式命名。  
()：方法的标志。括号里：参数列表  
{}：方法体  
参数列表：方法在运算过程中的未知数据，调用者调用方法时传递  
return ：将方法执行后的结果带给调用者，方法执行到 return ，整体方法运行结束  


#### 调用方法
#### 方法返回值
#### 方法参数
#### 方法重载
#### 递归
### 二、封装
#### 面向对象思想概述
#### 类和对象
#### 类的定义
#### 构造函数
#### this关键字
#### 面向对象三大特性之封装性
