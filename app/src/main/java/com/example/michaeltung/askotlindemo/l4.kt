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
    fun  bbb(){

    }

}