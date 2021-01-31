package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec

class ImplTest extends AnyFlatSpec {
  "The Number" should "be valid for palindrome" in{
    val palindromeTestObject = new ImplClass()
    assert(!palindromeTestObject.isPalindrome("1222"))
  }
  "The Number" should "be valid for factorial" in{
    val factorialTestObject = new ImplClass()
    assertResult(1){
      factorialTestObject.factorial(0)
    }
  }

}
