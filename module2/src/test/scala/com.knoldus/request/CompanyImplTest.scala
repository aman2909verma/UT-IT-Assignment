package com.knoldus.request

import com.knoldus.models.Company
import com.knoldus.validator.CompanyValidator
import org.scalatest.flatspec.AnyFlatSpec

class CompanyImplTest extends AnyFlatSpec{
  val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
  val companyValidator = new CompanyValidator()
  val companyImpl = new CompanyImpl(companyValidator)
  "a company " can "be created if it is valid" in{
    assertResult(None){
      companyImpl.createCompany(knoldusCompany)
    }
  }
}
