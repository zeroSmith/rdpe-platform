package com.self.scs

import scala.util.Random
import scala.util.control.{BreakControl, Breaks}

/**
  * @author hasee
  */

object Test_one {
  def main(args: Array[String]): Unit = {
    explainBreak()
  }
  //s来从字符串中进行取值计算
  def getValueFromS(): Unit ={
    val name = "fread"
    val age = 23
    println(s"$name is $age  years")
  }
  //for and yield 来遍历一个字符串：
  def rangeStr={
    var str="this is a string"
   str= str.map(_.toUpper)
  }

  //通过for和yield来进行遍历一个字符串数组：
  def rangeArray(): Unit ={
    var str="hellow world"
    var str2=for(i<- str)yield i.toUpper

    str2.foreach(print(_))
  }

  //遍历字符串中的某个字符的时候，string的charAt()，或者是scala中的自带的一个数组的访问方式：
  def askString():Unit={
    var str="hellow this is for string"
    println(str.charAt(3))//java特性通过charAt来进行访问。
    println(str(3))//数组访问，scala特性
  }
  //字符串转换成为数字：scala中的to*  方法和java中的 类似的INterger.parseInt()等 的方式来实现：

  def changeToNumber(): Unit ={
   var str="34"

    println(str.toInt)//通过scala的方式来实现
    println(Integer.parseInt(str))
  }

  //对于一个数字变量通过什么方式来进行数字的重载，（也就是数字的类型这里）
  def overload(): Unit ={
    var int_value=1
    var double_value=1d
    var long_value=1L
    //这一种是通过具体声明某个数据是某个类型来实现的
    var int_value1:Int=1
    var double_value1:Double=1
    var long_value1:Long=1
    //这一种是通过声明变量的类型来实现的
  }

  //对于字符的计算类似于java中的++ --操作在scala中是通过  += -=来实现的
  def changeValue(): Unit ={
    var num=2
    num+=1
    println(num)//通过num首先增加1然后在再来进行打印操作
    num-=1  //
    //  num++ 这种在scala中是不能使用的 。
  }

  //scala中来创建一个随机数Random来生成随机数：
  def gerRandom(): Unit ={
    var randoms=Random
    var intvars=randoms.nextInt(100)//生成的是0到100之间的
    println(intvars)
  }

  //scala中来生成一个根据to形式形成一个数字序列；
  def makeValue(): Unit ={
    var arr=1 to 10 by 2
    arr.foreach(println(_))
  }

  //to ,until的区别：
  def toAndUntil(): Unit ={
    //to的形式会从1,2,3都会有
    for(i<- 1 to 3){
      println(i)
    }
    //until的方式仅仅1,2 最后的3不会包括了。
    //相当于是一个前闭，后开的数组。
    for(i<- 1 until  3){
      println(i)
    }
  }

  //scala中通过使用一个for循环来实现一个map的遍历：
  def rangeMap(): Unit ={
    var maps=Map((1,"a"),(2,"b"))
    for((k,v)<-maps){
      println(s"key is $k, value is $v")
    }
  }

  //for 循环中可以通过使用多个计数器来实现一个数据的遍历，当for循环中有多个计数器的时候，这个时候的for循环中可以使用一个大括号来进行
  //表示。
  def mulityNumber(): Unit ={
   for{j<- 1 to 3; i<- 3 to 5}{
     println(s"j ：$j  ,i  : $i")
   }
  }

  //for yield来进行联合使用的过程，通过遍历一个for的同时来将遍历的数据放置到yield中去形成一个新的序列
  def forYield(): Unit ={
    var newArr=for(i<- 1 to 2) yield  i*2
    newArr.foreach(println(_))
    //通过将数据进行一个，遍历和转换的过程，将新生成的数据放置到一个新的数组中去。
  }


  //scala中通过一个breakable的方式来实现java中的一个break的语句方式：
  def breaktest(): Unit ={
    Breaks.breakable{
      for(i<- 1 to 10){
        if(i==5) Breaks.break
        println(i)
      }
    }
  }

  //这里是对于scala中的break的解释，当使用这个break的时候，当执行到这个的时候
  //实际上是会产生一个异常，通过这个异常来结束当前的代码：
  def explainBreak(): Unit = {
    Breaks.breakable {
      try {
        for (i <- 1 to 3) {
          println(i)
          if (i == 2) {
            Breaks.break()
          }
        }
      } catch {
        case ex: Exception => {
          println(ex.getCause)
        }
      }
    }
  }
}
