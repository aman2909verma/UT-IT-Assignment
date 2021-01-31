package com.knoldus.validator

import com.knoldus.models.Company

import org.scalatest.flatspec.AnyFlatSpec

class IntegrationTest extends AnyFlatSpec{

  "Company" should "be valid" in {

    val companyValidator = new CompanyValidator()

    val testCompany: Company = Company("abcd",
      "abcd@abcd.com",
      "Noida")

    val result = companyValidator.companyIsValid(testCompany)

    assert(result)

  }
}
