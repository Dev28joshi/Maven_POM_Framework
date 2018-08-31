package utility;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;

import org.eclipse.jetty.websocket.client.masks.RandomMasker;

public class Constant 
{
	public static String basePath="C:\\Users\\Zeus\\Desktop";
	
	///home page
	public static String appurl="http://demowebshop.tricentis.com/";
	public static String xpathHomeRegisterLink="//a[text()='Register']";
	public static String xpathHomeLoginLink="//a[text()='Log in']";
	
	///login page
	public static String IdLoginEmailTxt="Email";
	public static String IdLoginpwdTxt="Password";
	public static String xpathLoginBtn="//input[@class=\"button-1 login-button\"]";
	
	///Register page
	public static String id_radio_btn="gender-male";
	public static String idLoginFNameTxt="FirstName";
	public static String idLoginLNameTxt="LastName";
	public static String idregistercpswdTxt="ConfirmPassword";
	public static String idregisterbtn="register-button";
	
	
}
