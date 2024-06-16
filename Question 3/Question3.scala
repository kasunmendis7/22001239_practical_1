import scala.io.StdIn.readLine;

object Question3 {
  def main(args: Array[String]): Unit = {
    print("Enter the radius > ");
    var r = readLine().toDouble
    val volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    println("Volume of the sphere = " + volume)
  }
}
