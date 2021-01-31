package com.knoldus.validator

import com.knoldus.models.Company
import com.knoldus.db.CompanyReadDto

class CompanyValidator {

  def companyIsValid(company: Company): Boolean = {
    val companyReadDto = new CompanyReadDto()
    val result: Option[Company]= companyReadDto.getCompanyByName(company.name)
    val emailValidator = new EmailValidator()
    if(result.isEmpty && emailValidator.emailIdIsValid(company.emailId))
      true
    else
      false
  }
}
