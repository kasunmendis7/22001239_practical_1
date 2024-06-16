import scala.io.StdIn.readLine;

object Question4 {
  def main(args: Array[String]): Unit = {
    val coverPrice = 24.95
    val discount = 0.40
    val discountPrice = coverPrice * (1 - discount)

    val noOfCopies = 60
    val shippingCostFirst50 = 3.00
    val shippingCostAdditional = 0.75

    val totalBookCost = discountPrice * noOfCopies

    val totalShippingCost = shippingCostFirst50*noOfCopies+(if(noOfCopies>50)(noOfCopies-50)*shippingCostAdditional else 0)

    val totalWholesaleCost = totalBookCost + totalShippingCost

    println(f"The total cost for 60 copies = Rs. $totalWholesaleCost%.2f")

  }
}
