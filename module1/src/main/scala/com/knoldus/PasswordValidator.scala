package com.knoldus


class PasswordValidator (pass:String){
    def isValidForPassword:Boolean={
      if(pass.indexOf(" ") == -1 && pass.matches("^.*[0-9]+.*$") && (pass.length() <=15 && pass.length() >= 8) &&
        pass.exists(_.isUpper) && pass.exists(_.isLower) && pass.matches(".*[@#%&!$]+.*"))  {
        true
      }
      else{
        false
      }
    }
}
