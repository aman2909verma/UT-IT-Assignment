package com.knoldus

class ImplClass extends InterfaceClass {
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
}
