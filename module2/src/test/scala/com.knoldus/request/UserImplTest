package com.knoldus.request

import com.knoldus.models.User
import com.knoldus.validator.UserValidator
import org.mockito.Mockito.when
import org.mockito.MockitoSugar.mock
import org.scalatest.flatspec.AnyFlatSpec

class UserImplTest extends AnyFlatSpec{
  it should "create user" in {

    val testUser: User = User("AMAN","VERMA", "Knoldus","aman.verma@knoldus.com")

    val mockedUserValidator = mock[UserValidator]
    when(mockedUserValidator.isValid(testUser)) thenReturn true

    val userImplTest = new UserImpl(mockedUserValidator)

    val result = userImplTest.createUser(testUser)

    assert(result == Option(testUser.emailId))

  }

}
