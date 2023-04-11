package com.ppt;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Test_Yatra {
	
	@Test
	public static void main1() throws Exception {
		// TODO Auto-generated method stub
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		dc.setCapability(MobileCapabilityType.UDID, "d8e807c9");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//dc.setCapability("appPackage", "com.yatra.base");
		dc.setCapability("app", "C:\\Users\\DELL\\Katalon Studio\\yatra-com-14-23-0.apk");
		//dc.setCapability("appActivity", "com.yatra.appcommons.activity.WebCheckInWebviewActivity");
		dc.setCapability("appium:appWaitForLaunch", "false");
		dc.setCapability("autoGrantPermissions", true);
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,dc);
		Thread.sleep(3000);
		
	        
		Thread.sleep(3000);
		System.out.println("Application started....");
		
		
		//WebElement hotel =driver.findElements(By.id("com.yatra.base:id/tv_lob_title")).get(1); //hotel
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView")).click();
		
		WebElement city = driver.findElement(By.id("com.yatra.base:id/dest_hotel_cityname_textview"));  //city
		 city.click();
		 
		WebElement city1 =driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.TextView"));  //city name
		city1.click();
		
		WebElement checkin = driver.findElement(By.id("com.yatra.base:id/txt_check_in"));  //check in
		checkin.click();
		
		WebElement date =driver.findElement(By.xpath("//android.view.View[@content-desc=\"08 April 2023\"]"));   //check in date
		date.click();
		
		WebElement button = driver.findElement(By.id("com.yatra.base:id/btn_ok"));
		button.click();
		
		WebElement search =driver.findElement(By.id("com.yatra.base:id/search_button_hotel"));   //search button
		search.click();
		
		WebElement select =driver.findElement(By.id("com.yatra.base:id/hotel_preview_imageview"));   //hotel selected
		select.click();
		//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]")).click();
		
		driver.findElement(By.id("com.yatra.base:id/proceed_button")).click();
		
		WebElement button1 = driver.findElement(By.id("com.yatra.base:id/book_now_button"));  //book now
		button1.click();
		
		WebElement proceed=driver.findElement(By.id("com.yatra.base:id/proceed_button"));  //proceed
		proceed.click();
		
		WebElement guest=driver.findElement(By.id("com.yatra.base:id/continue_as_guest"));  //continue as guest
		guest.click();
		
		driver.findElement(By.id("com.yatra.base:id/emailInputLayout")).sendKeys("sushrisangita82@gmail.com");
		driver.findElement(By.id("com.yatra.base:id/mobile_edit_text")).sendKeys("7855041842");   //Phone No
		
				
		WebElement guest1 =driver.findElement(By.id("com.yatra.base:id/guest_button"));
		guest1.click();
		
		WebElement miss =driver.findElement(By.id("com.yatra.base:id/rb_title_mrs"));            //MS
		miss.click();

		
		driver.findElement(By.id("com.yatra.base:id/edit_text")).sendKeys("sushri") ;   //first name
		driver.findElement(By.id("com.yatra.base:id/edit_text")).sendKeys("sangita") ;  //last name
		
		WebElement proceed1= driver.findElement(By.id("com.yatra.base:id/proceed_button"));
		proceed1.click();

		

}
}
