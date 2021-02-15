package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec

class InterfaceTest extends AnyFlatSpec{

  "The Number" should "be valid for palindrome" in{
    val testobj = new ImplClass()
    assert(!testobj.isPalindrome(1222))
  }
  "The Number" should "be valid for factorial" in{
    val testobj = new ImplClass()
    assertResult(1){
      testobj.factorial(0)
    }
  }

}
