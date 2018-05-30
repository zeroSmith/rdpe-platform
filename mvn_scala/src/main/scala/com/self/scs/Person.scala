
/**
  * @author hasee
  */


/*
* 这里是对于一个scala中的类来进行定义，当一个类定义好了之后，当进行调用的时候
* 这个类中的所有的内容都会从头到尾的走一遍。
* */
class Person(var name: String, age: Int) {

  println("开始构造方法的开始")
  println(System.getProperty("user.home"))
  override def toString = s"name is $name ,age is $age"
  def method(): Unit = {
    println("当一个实例被调用的时候这个方法就会开始执行")
  }
  method()
}

object Person{
  def main(args: Array[String]): Unit = {
    val p=new Person("name",11)
    println(p.name)


  }
}
