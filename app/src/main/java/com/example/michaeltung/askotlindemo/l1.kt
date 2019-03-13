package com.example.michaeltung.askotlindemo
//Kotlin 基础语法
class l1{
    //带返回值的方法
    fun sum1(a: Int, b: Int): Int {
        return a + b
    }

    fun sum2(a: Int, b: Int) = a + b
    fun sum3(a: Int, b: Int): Int = a + b

    //无返回的方法
    fun printSum1(a: Int, b: Int): Unit {
        print(a + b)
    }

    fun printSum2(a: Int, b: Int) {
        print(a + b)
    }

    //可变长参数
    fun vars(vararg v: Int) {
        for (vt in v) {
            print(vt)
        }
    }

    //lambda 表达式函数
    fun lambdaFn(args: Array<String>) {

        val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
        print(sumLambda(1, 2))
    }
//变量

    var a: Int = 1
    val b = 1       // 系统自动推断变量类型为Int
    fun aeges() {
        val c: Int      // 如果不在声明时初始化则必须提供变量类型
        c = 1           // 明确赋值
        var x = 5        // 系统自动推断变量类型为Int
        x += 1           // 变量可修改
    }

    //字符串模板
    fun ddd() {
        // 模板中的简单名称：
        val s1 = "a is $a"
        // 模板中的任意表达式：
        a = 2
        val s2 = "${s1.replace("is", "was")}, but now is $a"
    }

    //NULL检查机制
    //类型后面加?表示可为空
    var age: String? = "23"
    //抛出空指针异常
    val ages = age!!.toInt()
    //不做处理返回 null
    val ages1 = age?.toInt()
    //age为空返回-1
    val ages2 = age?.toInt() ?: -1
    var numNull: Int? = null


    //类型检测及自动类型转换
    fun getStringLength(obj: Any): Int? {
        //我们可以使用 is 运算符检测一个表达式是否某类型的一个实例(类似于Java中的instanceof关键字)。
        if (obj is String) {
            // 做过类型判断以后，obj会被系统自动转换为String类型
            return obj.length
        }

        //在这里还有一种方法，与Java中instanceof不同，使用!is
        // if (obj !is String){
        //   // XXX
        // }

        // 这里的obj仍然是Any类型的引用
        return null
    }

    fun getStringLength2(obj: Any): Int? {
        if (obj !is String)
            return null
        // 在这个分支中, `obj` 的类型会被自动转换为 `String`
        return obj.length
    }


    fun getStringLength3(obj: Any): Int? {
        // 在 `&&` 运算符的右侧, `obj` 的类型会被自动转换为 `String`
        if (obj is String && obj.length > 0)
            return obj.length
        return null
    }

    fun qujian() {
        //  区间
        //  区间表达式由具有操作符形式 .. 的 rangeTo 函数辅以 in 和 !in 形成。
        //  区间是为任何可比较类型定义的，但对于整型原生类型，它有一个优化的实现。以下是使用区间的一些示例:

        for (i in 1..4) print(i) // 输出“1234”

        for (i in 4..1) print(i) // 什么都不输出
        var x = 9
        if (x in 1..10) { // 等同于 1 <= i && i <= 10
            println(x)
        }

// 使用 step 指定步长
        for (i in 1..4 step 2) print(i) // 输出“13”

        for (i in 4 downTo 1 step 2) print(i) // 输出“42”


// 使用 until 函数排除结束元素
        for (i in 1 until 10) {   // i in [1, 10) 排除了 10
            println(i)
        }

    }
}