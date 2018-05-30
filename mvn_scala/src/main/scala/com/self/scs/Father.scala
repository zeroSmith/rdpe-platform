package com.self.scs

class Father(var name: String) {

}

class sun(name: String) extends Father(name: String) {
  //当子类需要继承父类中的属性的时候，在父类中对于类中的字段已经自动的生成了getter和setter的方法
  //所以子类中就不用再在name属相的前边加上一个var的属性了。因为这个已经在父类中进行了定义
  //可以直接去调用父类中的这个方法，即可对于字段进行一个调用。
}

object Father {
  def main(args: Array[String]): Unit = {
    val aps=AP("name")

  }
}

//scala 中使用抽象类的时候， 核心就是为了能够实现这个类中的构造方法，因为在scala中的trait中是不能够有构造方法的
abstract class Cone(name: String) {
  def connection(a: String, pwd: Int)

  def update()
}

class Imp(name: String) extends Cone(name: String) {
  override def connection(a: String, pwd: Int): Unit = println("实现了父类中的方法，")

  override def update(): Unit = println("update")
}

//抽象类中可以有一个抽象的字段，这个字段可以是val，可以是var，当这个类在编译的过程中是不会出现这个字段的，只有当这个类的子类实现了
//这个抽象类的时候，才能将这个类中，已经定义的抽象字段来进行具体的实现，和生成相关的getter和setter方法。
abstract class One {
  val name: String
  //这里的两个字段都是抽象的字段
  var age: Int //这里的age也是一个抽象的属性，只有下边的子类在继承这个父类的时候，可以将这些个属性进行一实现。
}

class Two extends One {
  val name = "name"
  var age = 12

  def apply: Two = new Two()
}

//===============================================================下面是通过在abstract中定义一个def，然后在父类中来实现这个东西

abstract class Three {
  def one: String
}

class Four extends Three {
  val one = "hello"
  val two = null
}

//=================================================================================================================================end

class AP(name:String){
  //def apply(name: String): AP = new AP(name)
}
object AP{
  //在普通的类中通过写一个apply方法，那么就可以省略掉new关键字来，创造一个对象
  //但是在case中，这个apply方法是默认实现的，也就是通过case来创建对象的时候，直接就可以不用一个new关键字
  //直接通过一个  类名，和类中定义的属性即可来创建一个对象。
  def apply(name: String): AP = new AP(name)
}

