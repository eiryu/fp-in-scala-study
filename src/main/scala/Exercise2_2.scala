object Exercise2_2 {

  def main(args: Array[String]) {
    val ordered = (n: Int, m: Int) => {
      n <= m
    }

    val as1 = Array(1, 2, 3)
    println(isSorted(as1, ordered))

    val as2 = Array(3, 2)
    println(isSorted(as2, ordered))
  }

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    def go(n: Int): Boolean = {
      if (n >= as.length - 1) true
      else if (ordered(as(n), as(n + 1))) go(n + 1)
      else false
    }

    go(0)
  }
}
