package com.github.mather.study20180317.model

/**
  *
  * @author eisuke
  */
case class ItemStock(item: Item, quantity: Int) {
  def showStock: String = {
    this.quantity match {
      case i if i >= 3 => "在庫あり"
      case i if i > 0 => s"残り${i}点"
      case _ => "在庫なし"
    }
  }
}
