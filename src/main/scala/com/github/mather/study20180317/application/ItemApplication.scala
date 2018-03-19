package com.github.mather.study20180317.application

import com.github.mather.study20180317.infrastracture.ItemStockDataAccess
import com.github.mather.study20180317.model.ItemStock


class ItemApplication {
  val ds = new ItemStockDataAccess

  def showItems: Seq[ItemStock] = ds.findAll()

  def showItem(itemId: Int): ItemStock = ds.find(itemId)
}
