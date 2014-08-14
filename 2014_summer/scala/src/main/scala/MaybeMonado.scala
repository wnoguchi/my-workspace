// Maybeモナドサンプル
object MaybeMonado extends App {
  val list = List("a", "b", "c", "d")
  //val optionValue = list.find(_ == "c")
  val optionValue = list.find(_ == "z")

  // 値があれば表示する
  optionValue.foreach(println)

  // 値の有無で処理を分ける
  optionValue match {
    case Some(value) => println("value is %s".format(value))
    case None => println("no value")
  }

}

