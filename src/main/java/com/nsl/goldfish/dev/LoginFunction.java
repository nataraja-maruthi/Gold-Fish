package com.nsl.goldfish.dev;

public class LoginFunction {
private ReturnData data = null;

      public LoginFunction() {
      data = new ReturnData();

	}

	public ReturnData login(String userName, String password) {

		if (null==userName && null == password) {

			data=null;

		} else if(null==userName) {

			data.setMessage(LoginConstants.NO_USERID);

			data.setResult(false);

		}else if(null==password) {

			data.setMessage(LoginConstants.NO_PASSWORD);

			data.setResult(false);

		}else if(userName.equals("Nataraja") && password.equals("Suma")) {

			data.setMessage(LoginConstants.LOGIN_SUCCESS);

			data.setResult(true);

		}else {

			data.setMessage(LoginConstants.LOGIN_FAILURE);

			data.setResult(false);			

  		}

		return data;

	}

}





	 




