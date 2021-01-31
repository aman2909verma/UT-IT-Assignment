package com.knoldus.validator

import com.knoldus.models.User
import org.scalatest.flatspec.AnyFlatSpec

class UserValidatorTest extends AnyFlatSpec{
  "User" should "be valid" in {
    val testObject = new UserValidator()
    val testUser: User = User("AMAN","VERMA", "Knoldus","aman.verma@knoldus.com",)
    assert(testObject.isValid(testUser))

  }
}
