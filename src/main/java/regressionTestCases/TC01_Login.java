package regressionTestCases;

import allPages.LoginPPP;

public class TC01_Login extends LoginPPP {

	public static void main(String[] args) {
		BrowseLaunch();
		Enter_Email("afreen@gmail.com");
		Enter_Password("afreen");
		LoginIn();

	}

}
