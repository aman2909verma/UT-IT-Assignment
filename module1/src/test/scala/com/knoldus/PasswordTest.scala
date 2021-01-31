package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec

class PasswordTest extends AnyFlatSpec {
    "The Password" should "contain no spaces" in{
      val pass = new PasswordValidator("Aman@ 123")
      assert(!pass.isValidForPassword)
    }
    "The Password" should "contain at least one digit" in{
      val pass = new PasswordValidator("Aman@aman")
      assert(!pass.isValidForPassword)
    }
    "The Password" should "be valid for length" in{
      val pass = new PasswordValidator("A@m1")
      assert(!pass.isValidForPassword)
    }
    "The Password" should "contain at least one upper case" in{
      val pass = new PasswordValidator("aman@123")
      assert(!pass.isValidForPassword)
    }
    "The Password" should "contain at least one lower case" in{
      val pass = new PasswordValidator("AMAN@123")
      assert(!pass.isValidForPassword)
    }
    "The Password" should "contain at least one special character" in{
      val pass = new PasswordValidator("Aman123")
      assert(!pass.isValidForPassword)
    }
}
