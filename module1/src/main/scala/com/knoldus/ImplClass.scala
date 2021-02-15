package com.knoldus

class ImplClass extends InterfaceClass {
  def isPalindrome(num:Int):Boolean={
    val inputNumberToStr: String = num.toString
    val lenOfNumberStr: Int = inputNumberToStr.length

    for (counterForNumberStr <- 0 until lenOfNumberStr / 2) {
      if (inputNumberToStr(counterForNumberStr) != inputNumberToStr(lenOfNumberStr - counterForNumberStr - 1))
        return false
    }
    true
  }
  def factorial(num:Int): Int = {
    if (num == 0) 1
    else {
      num * factorial(num - 1)
    }
  }
}
