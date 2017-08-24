package com.example.liuwanhao.firstdemo

/**
 * Created by liuwanhao on 2017/8/11.
 */
class FirstClass : Runnable {
    //To change body of created functions use File | Settings | File Templates.

    override fun run() {
    }

    val a = 1
    var num: String = ""
    var bb = +1
    var b = 1
    val s = "a is $a"
    var c = a + b
    fun dianji(a: String): String {
        b += 2
        System.out.print(c)
        num = (b + c).toString()
        return "num :" + num + "  dian ji" + ";;;" + s + ""
    }

    fun wucan(): String {
        return "ceshi 返回值"
    }

    override fun toString(): String {
        return c.toString()
    }

    //返回值
    fun count(x: Int, y: Int): Int {
        if (x >= y) {
            return x;
        } else {
            return y;
        }
    }

    //    返回值含有空值     ？指返回值是否含空，可以先判断为空返回空，或者判断非空，最后返回空
    fun checkNUll(int: Int): Int? {
        println("打印某些数据")
        if (null == int) return null
        return int
    }

    fun checkNULL1(int: Int): Int? {
        println("打印某些数据")
        if (null != int) return int
        return null
    }

    //    类型转换 语法is （类似java instanceof ）
    fun castInt(obj: Any): Boolean {
        if (obj is Int) {
            return true
        }
        return false
    }

    //    use for loop  循环迭代 in
    fun iterate() {
        var list = listOf<Int>()
    }


}