package practiceactivities

fun main(){
    println("Please Enter a String:")
    var name = readln()
    var count = 0
    var counter = 0

    while (count < name.length) {
        var vowels = name[count].uppercase().contains("a".uppercase())
        var vowels1 = name[count].uppercase().contains("e".uppercase())
        var vowels2 = name[count].uppercase().contains("i".uppercase())
        var vowels3 = name[count].uppercase().contains("o".uppercase())
        var vowels4 = name[count].uppercase().contains("u".uppercase())
        if (vowels == true) {
            counter++
            count++

        } else if (vowels1 == true) {
            counter++
            count++
        } else if (vowels2 == true) {
            counter++
            count++
        } else if (vowels3 == true) {
            counter++
            count++
        } else if (vowels4 == true) {
            counter++
            count++
        }else{
            count++
        }
        }
    println("Number of Vowels is = $counter")
    }


