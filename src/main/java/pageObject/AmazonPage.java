package pageObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.SkipException;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class AmazonPage extends AppGeneric {
	protected Properties prop;

	public AmazonPage(String PropPath, ExtentTest log) {
		super(PropPath, log);
		try {
			prop = new Properties();
			prop.load(new FileInputStream(PropPath));
			this.log = log;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			new SkipException("File Not Found");
		} catch (Exception e) {
			e.printStackTrace();
			new SkipException("Execption occured");
		}

	}

	public AmazonPage clickNextBanner() throws Exception {
		clickElement("bannernext_xpath");
		log.log(Status.PASS, "ClickedonNextIconInBanner");
		return this;
	}
	public AmazonPage countOfBanners() throws Exception {
		getWebElementCount("Banners_xpath");
		log.log(Status.PASS, "BannersCount");
		return this;

	}

	public AmazonPage TodaysDeals() throws Exception {
		clickElement("todaysdeals_xpath");
		log.log(Status.PASS, "ClickedonTodaysDeals");
		System.out.println("Title of the page :" + getTitle());
		System.out.println("Number of products :" + isElementPresent("productslist_xpath").size());
		return this;
	}

	public AmazonPage clickMobiles() throws Exception {
		clickElement("clickMobiles_xpath");
		log.log(Status.PASS, "ClickedMobiles");
		return this;
	}	

	public AmazonPage countOfMobiles() throws Exception {
		getWebElementCount("allmobiles_xpath");
		log.log(Status.PASS, "allmobilescount");
		return this;
	}
	public AmazonPage electronics() throws Exception {
		clickElement("clickOnElectronics_xpath");
		log.log(Status.PASS, "ClickedonElectronics");
		return this;
	}

	public AmazonPage headPhones() throws Exception {
		clickElement("clickOnHeadPhones_xpath");
		log.log(Status.PASS, "ClickedonHeadPhones");
		return this;

	}
	public AmazonPage firstheadPhone() throws Exception {
		clickElement("bluetoothProduct_xpath");
		log.log(Status.PASS, "ClickedonFirstHeadPhones");
		return this;

	}

	public AmazonPage addToCart() throws Exception {
		clickElement("addToCart_xpath");
		log.log(Status.PASS, "ClickedonFirstHeadPhones");
		return this;
	}




}