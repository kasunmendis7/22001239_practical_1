import scala.io.StdIn.readLine;

object Question2{
    def main(args: Array[String]):Unit={
        print("Enter the temperatur > ")
        val temp = readLine().toDouble
        val fht = 1.8000*temp + 32.00
        println("Fahrenheit temperature = "+fht)
    }
}