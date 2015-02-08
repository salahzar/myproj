/**
 * Created by user on 2/8/15.
 */
object Logic {
  def matchLikelihood(kitten: Kitten, buyer:BuyerPreferences): Double = {
    val matches=buyer.attributes.map{a =>
      kitten.attributes contains a
    }
    val nums=matches map { b =>
      if(b) 1.0 else 0.0
    }
    nums.sum / nums.length
  }
}
