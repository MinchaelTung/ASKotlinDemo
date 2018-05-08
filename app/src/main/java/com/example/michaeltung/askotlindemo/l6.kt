package com.example.michaeltung.askotlindemo

import android.content.Context
import android.util.AttributeSet

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



//        子类没有主构造函数
//        如果子类没有主构造函数，则必须在每一个二级构造函数中用 super 关键字初始化基类，
//        或者在代理另一个构造函数。初始化基类时，可以调用基类的不同构造方法。

//        class Student : Person {
//            constructor(ctx: Context) : super(ctx) {
//            }
//            constructor(ctx: Context, attrs: AttributeSet) : super(ctx,attrs) {
//            }
//        }
//        实例

        /**用户基类**/
        open class Person(name:String){
            /**次级构造函数**/
            constructor(name:String,age:Int):this(name){
                //初始化
                println("-------基类次级构造函数---------")
            }
        }
        /**子类继承 Person 类**/
        class Student:Person{

            /**次级构造函数**/
            constructor(name:String,age:Int,no:String,score:Int):super(name,age){
                println("-------继承类次级构造函数---------")
                println("学生名： ${name}")
                println("年龄： ${age}")
                println("学生号： ${no}")
                println("成绩： ${score}")
            }
        }

        fun main2(args: Array<String>) {
            var s =  Student("Runoob", 18, "S12345", 89)
        }
//        输出结果：

//        -------基类次级构造函数---------
//        -------继承类次级构造函数---------
//        学生名： Runoob
//        年龄： 18
//        学生号： S12345
//        成绩： 89

    }












}





























