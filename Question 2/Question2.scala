object TemperatureConverter {
  def main(args: Array[String]): Unit = {
    val celsius = 35
    val fahrenheit = calculateFahrenheit(celsius)
    println(f"$celsius%.2f°C is equal to $fahrenheit%.2f°F")
  }

  def calculateFahrenheit(celsius: Double): Double = {
    celsius * 1.8000 + 32.00
  }
}
