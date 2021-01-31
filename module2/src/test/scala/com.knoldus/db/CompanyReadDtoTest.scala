package com.knoldus.db

import org.scalatest.flatspec.AnyFlatSpec

class CompanyReadDtoTest extends AnyFlatSpec{
  val companyReadDto: CompanyReadDto = new CompanyReadDto()

  it should "return the company object from db" in {

    val result = companyReadDto.getCompanyByName("Knoldus")

    assert(result.isDefined)

  }
}
