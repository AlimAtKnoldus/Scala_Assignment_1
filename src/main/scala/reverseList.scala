import scala.annotation.tailrec

object reverseList {


  @tailrec
  //method to reverse the list using tail recursion
  def reverseList(arr:List[Int], revList:List[Int]):List[Int] = arr match {   //input list to array to implement tail recursion
    case head :: tail => reverseList(tail,  head :: revList)        //tail recursion is used to reverse the input list

    case Nil => revList         //if the input List is empty, new list is returned
  }

  def main(args: Array[String]): Unit={
    val nums: List[Int] = List(1, 2, 3, 4, 5)
    //function call to reverseList and input is send
    println("Reversed List is: " + reverseList(nums,Nil))
  }
}
