var name: Type = Int
for(i <- (1 to 100)){
	println(i)
}
var ppt=1
 while(ppt < 100) {
   println(ppt)
    ppt+=1
  }

 // function declaration

 def  sum(a: Int,b: Int){ 
 	var c=0 // initialization is must
 	c=a +b
 	c  // return is must
 }


 def  void sum(a: Int,b: Int)={ // = sign is important
 	var c=0 // initialization is must
 	c=a +b
 }

 object Demo{

 	def main(args: Array[String]){
 		var num_list=List(64.5,5,5,5,6243)
 		for(i <- num_list){
 			i
 		}
 	}
 }

 def some_fun(fun: Int => Int, a: Int, b: Int){
 	var total=0
 	for(element <- a to b){
 		total += fun(element)
 	}
 	total
 }

  def double(a: Int)= a*a


// anonymous function
some_fun(i => 5*i, 1, 2)

// Defining the class and look for the OOPS concepts

class Order(OrderID: String,  OrderDate: String,  OrderCustomerID: String,  OrderStatus: String){
	println("THis is the constructor")

}

// Creating the object and invoking the constructor
val order= new Order("67ewhgh", "27-01-2020", "djkahjs", "Arrived")

// adding override method toString to print the address of the object

class Order(OrderID: String,  OrderDate: String,  OrderCustomerID: String,  OrderStatus: String){
	println("THis is the constructor")
	override def toString= "Order("+OrderID+","+OrderDate+","+OrderCustomerID+","+OrderStatus+ ")"

}

// by default the function returns the order class as immutable objects without getter and setters methofs

// if we want to generate the getter and setters for the variables then declare with val or var variables

class Order(val OrderID: String,  val OrderDate: String,  val OrderCustomerID: String,  val OrderStatus: String){
	println("THis is the constructor with getters initialization using val ")
	override def toString= "Order("+OrderID+","+OrderDate+","+OrderCustomerID+","+OrderStatus+ ")"

}

// including the getters and setters
class Order(var OrderID: String,  var OrderDate: String,  var OrderCustomerID: String,  var OrderStatus: String){
	println("THis is the constructor with getters initialization using val ")
	override def toString= "Order("+OrderID+","+OrderDate+","+OrderCustomerID+","+OrderStatus+ ")"

}

// singleton clas in scala is defined with object .. Unit refers to the method returns nothing..


object Helloworld{
	def main(args: Array[String]): Unit={
		println("This is the singleton class")
	}
}

// invoking
Helloworld.main(Array())

// if object name and class name are same, then its called companion object.. we shd use :paste mode

// including the getters and setters
class Order(var OrderID: String,  var OrderDate: String,  var OrderCustomerID: String,  var OrderStatus: String){
	println("THis is the constructor with getters initialization using val ")
	override def toString= "Order("+OrderID+","+OrderDate+","+OrderCustomerID+","+OrderStatus+ ")"
}

object Order{
	def apply(OrderID: String,  OrderDate: String,  OrderCustomerID: String,  OrderStatus: String):Order={
		new Order(OrderID,OrderDate,OrderCustomerID,OrderStatus)
	}
	def apply(OrderID: Int, OrderDate: String,  OrderCustomerID: String,  OrderStatus: String):Order={
		new Order(OrderID,OrderDate,OrderCustomerID,OrderStatus)
	}
}


// case class introduction

//case cclass needs to be created with constructor varriabeles 

// default datatype inside the class will be val and it is immutable

case class Order(var OrderID: String,  var OrderDate: String,  var OrderCustomerID: String,  var OrderStatus: String){
	println("THis is the constructor with getters initialization using val ")
	// by defaut it implements Product interface and serializable interfaces  aslso wlogn with toString method
	// override def toString= "Order("+OrderID+","+OrderDate+","+OrderCustomerID+","+OrderStatus+ ")"
}

/*
There are many collections available in scala package also
1. Array
2. List
3. Set
4. map
*/

var a=Array(1,4,5,6,7)

var l=List(4,5,6,67)

var s=Set(3,3,5,6,7)

var m=Map("hello"->4, "kar"->45)


//  List functions:
//etc///
List.drop(1)
List.fill(10)(2)
List.tablulate(4,5) 

// filter, Map, Reduce fuinctions in scala
val list=( 1  to 50 ).toList
val filt= list.filter(i => i%10==0)
var map=filt.map(rec=> rec * rec)
var tot=0
var red=map.reduce((tot,element)=>tot+ element)

// reading data from file using Source command
import scala.io.Source
val data=Source.fromFile("filepath").getLines()
val datafilter=data.filter(_.split(",")(1).toInt==2).
     | map(_.split(",")(4).toFloat).
     | reduce((t1, t2) => t1 + t2 )


operaator