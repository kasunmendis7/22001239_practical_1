import scala.io.StdIn.readLine

object Question1 {
  def main(args: Array[String]): Unit = {
    print("Enter the radius > ")
    val r = readLine().toDouble
    val area = Math.PI * Math.pow(r, 2)
    println(f"Area of the disk = $area%.2f")
  }
}
