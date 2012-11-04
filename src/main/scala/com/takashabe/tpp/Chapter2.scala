package com.takashabe.tpp

/**
 * change this message. write summary of file.
 *
 * @author Takashi Abe
 */
object Chapter2 {
  /**
   * LinearSearch版
   * @param word  検索対象の文字列
   * @param array 検索される側の配列
   * @return  array中のwordがあるindex. 存在しない場合は-1が返る。
   */
  def lookup(word: String, array: Array[String]): Int = {
    val size = array.size
    for (i <- 0 to size - 1) yield {
      if (word == array(i)) return i
    }
    return -1
  }

  /**
   * BinarySearch版
   * @param name  検索対象文字列
   * @param array 検索される側の配列
   * @return  array中のnameがあるindex. 存在しない場合は-1が返る。
   */
  def binaryLookup(name: String, array: Array[Nameval]): Int ={
    var low = 0
    var high = array.length - 1
    var mid = (low + high)/ 2
    var res = -1

    while(low <= high) {
      mid = (low + high) / 2
      if (name == array(mid).name) res = mid
      if (name < array(mid).name) {
        high = mid - 1
      } else {
        low = mid + 1
      }
    }

    res
  }

  def quickSort(xs: List[Int]): List[Int] = xs match {
    case List()  => List()
    case y :: ys => quickSort(ys filter(_ < y)) ::: List(y) ::: quickSort(ys filter(y <= _))
  }

}

case class Nameval(name: String, value: Int)