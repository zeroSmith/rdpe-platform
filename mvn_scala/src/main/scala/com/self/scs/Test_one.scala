package com.self.scs

object Test_one {
  def main(args: Array[String]): Unit = {
    changeToNumber()
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

  //、、对于一个数字变量通过什么方式来进行数字的重载，（也就是数字的类型这里）
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


}
