package com.takashabe.tpp

/**
 * change this message. write summary of file.
 *
 * @author Takashi Abe
 */
class Chapter2$Test extends org.specs2.mutable.Specification {
  "Chapter2" should {
    "p54 lookup exist" in {
      val word = "just"
      val array = Array[String]("apple", "bomb", "css", "deamon", "just")
      val index = Chapter2.lookup(word, array)
      index must be_==(4)
    }
    "p54 lookup not exist" in {
      val word = "hoge"
      val array = Array[String]("apple", "bomb", "css", "deamon", "just")
      val index = Chapter2.lookup(word, array)
      index must be_==(-1)
    }

    "p55 binarylookup exist" in {
      val name = "apple"
      val array = Array[Nameval](
        Nameval("Acirc", 10),
        Nameval("apple", 0),
        Nameval("bomb", 33),
        Nameval("css", 3),
        Nameval("hoge", 44),
        Nameval("just", 22)
      )
      val index = Chapter2.binaryLookup(name, array)
      index must be_==(1)
    }
    "p55 binarylookup not exist" in {
      val name = "None"
      val array = Array[Nameval](
        Nameval("Acirc", 10),
        Nameval("apple", 0),
        Nameval("bomb", 33),
        Nameval("css", 3),
        Nameval("hoge", 44),
        Nameval("just", 22)
      )
      val index = Chapter2.binaryLookup(name, array)
      index must be_==(-1)
    }

    "p57 quick sort" in {
      val list = List(2, 3, 5, 3, 4, 1)
      Chapter2.quickSort(list) must be_==(List(1, 2, 3, 3, 4, 5))
    }
  }
}
