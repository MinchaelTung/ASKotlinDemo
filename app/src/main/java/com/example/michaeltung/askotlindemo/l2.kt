package com.example.michaeltung.askotlindemo
//Kotlin 基本数据类型
public  class l2{
    //定义常量
    //可以使用下换线使数字常量更 易读
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    //比较两个数字
    fun l21() {
        val a: Int = 10000
        println(a === a) // true，值相等，对象地址相等  三个等号 === 表示比较对象地址

        //经过了装箱，创建了两个不同的对象
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a

        //虽然经过了装箱，但是值是相等的，都是10000
        println(boxedA === anotherBoxedA) //  false，值相等，对象地址不一样 三个等号 === 表示比较对象地址
        println(boxedA == anotherBoxedA) // true，值相等 两个 == 表示比较两个值大小
    }

    //类型转换
    fun l22() {
        val b: Byte = 1 // OK, 字面值是静态检测的
        // val i: Int = b // 错误
        val i: Int = b.toInt() // OK
        //每种数据类型都有下面的这些方法，可以转化为其它的类型：
        /*
         toByte(): Byte
         toShort(): Short
         toInt(): Int
         toLong(): Long
         toFloat(): Float
         toDouble(): Double
         toChar(): Char
     */
        //隐式转换
        val l = 1L + 3 // Long + Int => Long

//位操作符
//对于Int和Long类型，还有一系列的位操作符可以使用

        fun weicaozuo() {
            var a: Int = 4
            var shl: Int = a shl (1)//左移位 (Java’s <<)
            var shr: Int = a shr (1) //右移位 (Java’s >>)
            var ushr: Int = a ushr (1) //无符号右移位 (Java’s >>>)
            var and: Int = a and (1) //与
            var or: Int = a or (1)//或
            var xor: Int = a xor (1)//异域
            var inv: Int = a.inv()


        }
    }


    //字符
//和 Java 不一样，Kotlin 中的 Char 不能直接和数字操作，Char 必需是单引号 ' 包含起来的。比如普通字符 '0'，'a'。
//    fun check(c: Char) {
//        if (c == 1) { // 错误：类型不兼容
//            // ……
//        }
//    }
//字符字面值用单引号括起来: '1'。 特殊字符可以用反斜杠转义。 支持这几个转义序列：\t、 \b、\n、\r、\'、\"、\\ 和 \$。
//编码其他字符要用 Unicode 转义序列语法：'\uFF00'。
//我们可以显式把字符转换为 Int 数字：
    fun decimalDigitValue(c: Char): Int {
        if (c !in '0'..'9')
            throw IllegalArgumentException("Out of range")
        return c.toInt() - '0'.toInt() // 显式转换为数字
    }

//布尔  布尔用 Boolean 类型表示，它有两个值：true 和 false。
//    || – 短路逻辑或
//    && – 短路逻辑与
//    ! - 逻辑非

    //数组
    fun arraydemo() {
        //[1,2,3]
        val a = arrayOf(1, 2, 3)
        //[0,2,4]
        val b = Array(3, { i -> (i * 2) })
//读取数组内容
        println(a[0])//输出结果:1
        println(b[1])//输出结果:2

        val x: IntArray = intArrayOf(1, 2, 3)
        x[0] = x[1] + x[2]
    }
//字符串
    //Kotlin 支持三个引号 """ 扩起来的字符串，支持多行字符串

    fun stringDemo() {
        val text = """
            多行字符串
            多行字符串
            """
        println(text)   // 输出有一些前置空格
        val text2 = """
            |多行字符串
            |菜鸟教程
            |多行字符串
            |Runoob
            """.trimMargin()
        //默认 | 用作边界前缀，但你可以选择其他字符并作为参数传入，比如 trimMargin(">")。
        println(text2)    // 前置空格删除了
    }
    //字符串模板
    fun zifumoban(){
        val i=10
        //字符串可以包含模板表达式 ，即一些小段代码，会求值并把结果合并到字符串中。
        //模板表达式以美元符（$）开头，由一个简单的名字构成:
        val s="i = $i"//求值结果为:"i = 10"
        println(s)
        //或者用花括号扩起来的任意表达式:
        val s1="runoob"
        val str="$s.length is ${s.length}"//求值结果为:"runoob.length is 6"
        println(str)
        //原生字符串和转义字符串内部都支持模板。
        // 如果你需要在原生字符串中表示字面值 $ 字符（它不支持反斜杠转义），你可以用下列语法：
        val price="""
            ${'$'}9.99
            """
        println(price)//求值结果为 $9.99



    }


}


