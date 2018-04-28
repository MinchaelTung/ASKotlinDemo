package com.example.michaeltung.askotlindemo

/**
 * @author: Michael Tung
 * @description:Kotlin 继承
 * @projectName: ASKotlinDemo
 * @date: 2018-04-28
 * @time: 12:18
 */


class  l6{
//Kotlin 继承
//Kotlin 中所有类都继承该 Any 类，它是所有类的超类，对于没有超类型声明的类是默认超类：
//class Example // 从 Any 隐式继承
//Any 默认提供了三个函数：
//equals()
//hashCode()
//toString()
//注意：Any 不是 java.lang.Object。
//如果一个类要被继承，可以使用 open 关键字进行修饰。
//open class Base(p: Int)           // 定义基类
//class Derived(p: Int) : Base(p)


//构造函数
//子类有主构造函数
//如果子类有主构造函数， 则基类必须在主构造函数中立即初始化。

open class Person(var name : String, var age : Int){// 基类

}
class Student(name : String, age : Int, var no : String, var score : Int) : Person(name, age) {

}

    // 测试
    fun main(args: Array<String>) {
        val s =  Student("Runoob", 18, "S12346", 89)
        println("学生名： ${s.name}")
        println("年龄： ${s.age}")
        println("学生号： ${s.no}")
        println("成绩： ${s.score}")
//        输出结果：
//        学生名： Runoob
//        年龄： 18
//        学生号： S12346
//        成绩： 89


    }


    









}





























