fun main() {
    var n: Int = 0
    var ctrl = 0
    var count = 0
    print("Enter Matrix to Generate (n x n):")
    n = readln().toInt()
    var nxn = n * n
    while (ctrl < n) {
        var counter = 0
        while (counter < n) {

            if ((ctrl % 2) == 0) {
                print(" $nxn")
                nxn -= 1
                ++counter
                if(counter == n){
                    nxn = nxn - counter +1
                }
            } else  {
                print(" $nxn")
                nxn += 1
                ++counter

                if (counter == n) {
                    nxn = nxn - counter-1
                }

            }

        }
        ++ctrl
        println(" ")


    }
}