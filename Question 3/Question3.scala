object SphereVolumeCalculator {
  def main(args: Array[String]): Unit = {
    val radius = 5
    val volume = calculateVolume(radius)
    println(f"Volume of the sphere with radius $radius = $volume%.2f")
  }

  def calculateVolume(radius: Double): Double = {
    (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
  }
}
