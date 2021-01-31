package com.knoldus.validator

class EmailValidator {

  def emailIdIsValid(emailId: String): Boolean = {
    if(emailId.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$"))
      true
    else
      false
  }
}
