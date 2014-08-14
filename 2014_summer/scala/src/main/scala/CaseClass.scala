object CaseClass extends App {

  case class Person(name:String, age:Integer, gender:String)

  val person = Person("Wataru", 28, "Male")
  //val person = Person("Wataru", 28, "Female")
  //val person = Person("Wataru", 28, "X")

  person match {
    case Person(name, age, "Male") => println("Hello, Mr.%s! Are you %d years old?".format(name, age))
    case Person(name, _, "Female") => println("Hello, Mrs.%s!".format(name))
    case Person(name, _, _) => println("Hello, %s!".format(name))
  }

}

