object Exercise2_1 {

  def main(args: Array[String]) {
    print(fib(13))
  }

  def fib(n: Int): Int = {
    def go(n: Int): Int = {
      if (n <= 2) {
        1
      } else {
        go(n - 2) + go(n - 1)
      }
    }
    go(n)
  }
}
