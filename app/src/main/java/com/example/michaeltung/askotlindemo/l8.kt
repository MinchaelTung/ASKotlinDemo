package com.example.michaeltung.askotlindemo

/**
 * @author: Michael Tung
 * @description: Kotlin 扩展
 * @projectName: ASKotlinDemo
 * @date: 2018-05-16
 * @time: 09:02
 */


class  l8{
    //Kotlin 扩展
//    Kotlin 可以对一个类的属性和方法进行扩展，且不需要继承或使用 Decorator 模式。
//    扩展是一种静态行为，对被扩展的类代码本身不会造成任何影响。

//    fun receiverType.functionName(params){
//        body
//    }
//    receiverType：表示函数的接收者，也就是函数扩展的对象
//    functionName：扩展函数的名称
//    params：扩展函数的参数，可以为NULL

//    以下实例扩展 User 类 ：
    class User1(var name:String)

    /**扩展函数**/
    fun User1.Print(){
        print("用户名 $name")
    }

    fun mainUser1(arg:Array<String>){
        var user = User1("Runoob")
        user.Print()
//        实例执行输出结果为： 用户名 Runoob
    }




}




