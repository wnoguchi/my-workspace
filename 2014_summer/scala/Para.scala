// 並列実行のサンプル
object Para extends App {
  //(1 to 1000).toList.par.foreach(println)
  List("a", "b", "c", "d", "e", "f").par.foreach(println)
}

