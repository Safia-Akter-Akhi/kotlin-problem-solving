import java.util.Scanner
fun main(){
   val scan=Scanner(System.`in`)
    val n=scan.nextInt()
    for(i in 2 until n-1){
        if(n%2==0){
            println("$n is not prime")
            break
        }
        else if(i==n-1){
            println("$n is prime")
        }
    }
}