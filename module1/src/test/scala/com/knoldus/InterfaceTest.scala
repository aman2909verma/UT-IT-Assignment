package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec

class InterfaceTest extends AnyFlatSpec with InterfaceClass {

  def isPalindrome(num:String):Boolean={
    val len = num.length()
    for(i <- 0 until len / 2) {
      if (num(i) != num(len - i - 1)){ false }
    }
    true
  }
  def factorial(num:Int): Int ={
    if(num==0) 1
    else{
      num*factorial(num-1)
    }

  }
  "The Number" should "be valid for palindrome" in{
    assert(!isPalindrome("1222"))
  }
  "The Number" should "be valid for factorial" in{

    assertResult(1){
      factorial(0)
    }
  }

}
