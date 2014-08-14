object FirstClassMore extends App {

  // 1から10まで表示。
  (1 to 10).foreach(println)

  // リストの中身を倍にしてから表示
  (1 to 10).map(_ * 2).foreach(println)

  // リストの中から奇数のみを抽出して表示
  (1 to 10).filter(_ % 2 == 1).foreach(println)

}

