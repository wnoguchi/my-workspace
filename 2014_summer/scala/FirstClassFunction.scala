object FirstClassFunction extends App {

  val helloFunction = { string:String => println(string) }
  //val helloFunction = { println(_:String) }

  helloFunction("oh my scala.")

}

