package com.github.mather.study20180317.infrastracture

import com.github.mather.study20180317.model.{Item, ItemStock}

/**
  *
  * @author eisuke
  */
class ItemStockDataAccess {
  val stock1 = ItemStock(Item(1, "sample1", "99-9051-047-4"), 10)
  val stock2 = ItemStock(Item(2, "sample2", "99-9051-047-5"), 1)
  val stock3 = ItemStock(Item(3, "sample3", "99-9051-047-6"), 0)

  def findAll(): Seq[ItemStock] = List(stock1, stock2, stock3)

  def find(itemId: Int): ItemStock = itemId match {
    case 1 => stock1
    case 2 => stock2
    case 3 => stock3
    case _ => throw new NoSuchElementException
  }

}
