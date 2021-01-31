
package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.{Company, User}

class UserValidator {
  def isValid(user: User): Boolean = {
    
    val companyReadDto = new CompanyReadDto()
    val dbResult: Option[Company] = companyReadDto.getCompanyByName(user.companyName)

    
    val emailValidator = new EmailValidator()
    val emailValidatorResult = emailValidator.emailIdIsValid(user.emailId)

    if (dbResult.isDefined && emailValidatorResult) true

    false
  }
}
