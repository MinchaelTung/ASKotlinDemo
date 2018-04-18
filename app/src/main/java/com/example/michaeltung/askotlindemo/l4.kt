package com.example.michaeltung.askotlindemo

/**
 * @author: Michael Tung
 * @description:Kotlin 循环控制
 * @projectName: ASKotlinDemo
 * @date: 2018-04-17
 * @time: 09:59
 */


class l4 {
    //For 循环
    fun abc() {
        //for 循环可以对任何提供迭代器（iterator）的对象进行遍历，语法如下:
        //for (item in collection) print(item)
        //循环体可以是一个代码块:
        //for (item: Int in ints) {
        // ……
        //}
        //如上所述，for 可以循环遍历任何提供了迭代器的对象。
        //如果你想要通过索引遍历一个数组或者一个 list，你可以这么做：
        //for (i in array.indices) {
        //print(array[i])
        //}
        //注意这种"在区间上遍历"会编译成优化的实现而不会创建额外对象。
        //或者你可以用库函数 withIndex：
        //for ((index, value) in array.withIndex()) {
        //println("the element at $index is $value")
        //}
        //对集合进行迭代：
        val items = listOf("apple", "banana", "kiwi")
        for (item in items) {
            println(item)
        }

        for (index in items.indices) {
            println("item at $index is ${items[index]}")
        }

        /*
        输出结果：
        apple
        banana
        kiwi
        item at 0 is apple
        item at 1 is banana
        item at 2 is kiwi
        */
    }

    //while 与 do...while 循环
    fun bbb() {
//        while是最基本的循环，它的结构为：
//        while( 布尔表达式 ) {
//            //循环内容
//        }
//        do…while 循环 对于 while 语句而言，如果不满足条件，则不能进入循环。但有时候我们需要即使不满足条件，也至少执行一次。
//        do…while 循环和 while 循环相似，不同的是，do…while 循环至少会执行一次。
//        do {
//            //代码语句
//        }while(布尔表达式);

//        实例
        println("----while 使用-----")
        var x = 5
        while (x > 0) {
            println(x--)
        }


        println("----do...while 使用-----")
        var y = 5
        do {
            println(y--)
        } while (y > 0)
        //输出结果    5,4,3,2,1

    }

//    返回和跳转
//    return。默认从最直接包围它的函数或者匿名函数返回。
//    break。终止最直接包围它的循环。
//    continue。继续下一次最直接包围它的循环。




}