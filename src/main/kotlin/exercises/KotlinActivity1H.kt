package exercises
fun main() {
    println("Enter first number:")
    val n = readln().toInt()
    println("Enter second number:")
    val m = readln().toInt()

        when (n > m) {
            true -> { println("$m, $n")
                var a = 0
                var count = 0
                when (m % 2 == 0) {
                    true -> repeat(((n - m) - (n - m) / 2)) {
                        a++
                        println("${m + count + a}")
                        count++

                    }

                    false -> {
                        repeat(((n - m) - (n - m) / 2)) {
                            println("${m + count + a}")
                            count++
                            a++

                        }
                    }
                }
            }

            false -> { println("$n , $m")
                var a = 0
                var count = 0
                when (n % 2 == 0) {
                    true -> repeat(((m - n) - (m - n) / 2)) {
                        a++
                        println("${n + count + a}")
                        count++

                    }

                    false -> {
                        repeat(((m - n) - (m - n) / 2)) {
                            println("${n + count + a}")
                            count++
                            a++

                        }

                    }
                }
            }
        }
    }






