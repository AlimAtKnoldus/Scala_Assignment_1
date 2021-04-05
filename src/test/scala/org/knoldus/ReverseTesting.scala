package org.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class ReverseTesting extends AnyFlatSpec {



  "test" should "be valid if list only have one element" in {
    val list = List(7)
    val reverseList = List(7)
    val testList = new ReverseList
    assert(reverseList == testList.reverseList(list))
  }

  "test" should "be valid if list has multiple element" in {
    val list = List(10, 20, "thirty", "forty")
    val reverseList = List("Forty", "thirty", 20, 10)
    val testList = new ReverseList
    assert(reverseList == testList.reverseList(list))
  }

  "test" should "not be valid if list is not reversed" in {
    val list = List(10, 20, 30, 40)
    val reverseList = List(10, 20, 30, 40)
    val testList = new ReverseList
    assert(!(reverseList == testList.reverseList(list)))
  }
}
