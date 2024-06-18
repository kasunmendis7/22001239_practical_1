object Question1 {
  def main(args: Array[String]): Unit = {
    val radius = 5
    val area = calculateArea(radius)
    println(f"Area of the disk with radius $radius = $area%.2f")
  }

  def calculateArea(radius: Double): Double = {
    Math.PI * radius * radius
  }
}
