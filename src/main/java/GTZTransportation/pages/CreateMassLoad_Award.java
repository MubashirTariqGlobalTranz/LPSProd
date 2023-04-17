package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class CreateMassLoad_Award extends BaseClass {
    
	//public static WebDriver driver;
    
    @FindBy(xpath = "/html/body/form/div[3]/div[3]/div/table/tbody/tr/td[2]/div[1]/div[3]/ul/li[6]/a")
    WebElement SpotQuote;
    
    @FindBy(xpath = "/html/body/form/div[3]/div[2]/div[1]/ul/li[1]/a/span")
    WebElement createLoadPage;
    
    @FindBy(xpath = "/html/body/form/div[3]/div[2]/div[2]/ul/li[4]/a/span")
    WebElement Massload;
 
   @FindBy(id = "ContentPlaceHolder1_txtSource")
    WebElement SourceLPS;
   
  // @FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[2]/div/table/tbody/tr[2]/th")
   //WebElement Companynameclick;

   //@FindBy(id = "ContentPlaceHolder1_decBidAmount")
   //WebElement BidAmount; 
   
    @FindBy(id = "ContentPlaceHolder1_txtLoadCount")
    WebElement LoadCount;
    
    //@FindBy(id = "ContentPlaceHolder1_txtContactName")
    //WebElement Name;
    
    @FindBy(id = "ContentPlaceHolder1_timePickupWindow_dateSelection_0_txtDate")
    WebElement PickUpWindow;
    
    @FindBy(id = "ContentPlaceHolder1_timeDeliveryWindow_dateSelection_0_txtDate")
    WebElement DeliveryWindow;
    
    @FindBy(id = "ContentPlaceHolder1_createButton")
    WebElement Create;
    
    /*@FindBy(id = "ContentPlaceHolder1_quickLoad_txtOriginContactName")
    WebElement PickupContact;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_txtOriginContactPhone")
    WebElement PickupPhone;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_txtOriginCity")
    WebElement originCity;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_txtOriginState")
    WebElement OriginState;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_txtOriginPostalCode")
    WebElement OriginPostalCode;
    
    @FindBy(id = "/html/body/form/div[3]/div[3]/div/table/tbody/tr[1]/td[1]/div/div/table/tbody/tr[7]/td[1]/input")
    WebElement Country;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_originWindows_dateSelection_0_txtDate")
    WebElement PickTimeWindow;
    
    @FindBy(xpath = "/html/body/form/div[3]/div[3]/div/table/tbody/tr[1]/td[1]/div/div/table/tbody/tr[9]/td/span/div/table/tbody/tr/td[1]/span/div/input")
    WebElement PickupDateselection;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_txtOriginContactEmail")
    WebElement PickupEmail;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_txtDestinationName")
    WebElement DestinationName;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_txtDestinationAddress1")
    WebElement DestinationAddress;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_txtDestinationContactName")
    WebElement PickupContactDestination;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_txtDestinationContactPhone")
    WebElement PickupPhoneDestination;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_txtDestinationCity")
    WebElement DestinationCity;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_txtDestinationState")
    WebElement DestinationState;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_txtDestinationPostalCode")
    WebElement DestinationPostalCode;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_txtDestinationCountry")
    WebElement DestinationCountry;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_destinationWindows_dateSelection_0_txtDate")
    WebElement DestinationTimeWindow;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_itemList_decDeclaredValue")
    WebElement DeclaredValue;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_itemList_intPieces")
    WebElement Pieces;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_itemList_decWeight")
    WebElement Weight;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_itemList_txtItemDescription")
    WebElement Description;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_itemList_decHeight")
    WebElement Height;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_itemList_decWidth")
    WebElement Width;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_itemList_decLength")
    WebElement Length;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_itemList_ddlClass")
    WebElement Class;
    
    @FindBy(xpath = "/html/body/form/div[3]/div[3]/div/table/tbody/tr[2]/td[2]/div/div/table[1]/tbody/tr[3]/td[1]/select/option[3]")
    WebElement ClassSelection;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_txtReferenceNumber")
    WebElement ReferenceNo;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_RptrTransportMethods_chkRptr_0")
    WebElement Flatbed;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_RptrTransportMethods_chkRptr_1")
    WebElement TruckLoad;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_RptrTransportMethods_chkRptr_2")
    WebElement Expedited;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_RptrTransportMethods_chkRptr_3")
    WebElement LTLGuaranted;
    
    @FindBy(id = "ContentPlaceHolder1_quickLoad_btnSave")
    WebElement Create;
    
    @FindBy(id = "ContentPlaceHolder1_containerProcess_btnSend")
    WebElement SendBid;
   
    @FindBy(id = "ContentPlaceHolder1_gridLars_linkAward_0")
    WebElement AwardBid;
    
    @FindBy(xpath = "/html/body/form/div[3]/div[2]/div[1]/ul/li[2]/a")
    WebElement LoadBoard;
    
    @FindBy(xpath = "/html/body/form/div[3]/div[3]/div/span/div[2]/div/h3/a")
    WebElement FilterClick;
    
    @FindBy(id = "ContentPlaceHolder1_containerFilter_txtSearchNumber")
    WebElement LoadId;
    
    @FindBy(id = "ContentPlaceHolder1_containerFilter_rblExceptions_0")
    WebElement AllLoad;
    
    @FindBy(id = "ContentPlaceHolder1_containerFilter_btnRefresh")
    WebElement FilterLoad;
    
   */
    
    public CreateMassLoad_Award(){
    	 PageFactory.initElements(driver,this);
    }
    
    public void openSpotQuote()
    
    {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	SpotQuote.click();
    }
public void Create_Load() {
    
    
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	createLoadPage.click();
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Massload.click();
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	SourceLPS.sendKeys("LPS-230414-070118");
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	LoadCount.sendKeys("5");
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	//BidAmount.sendKeys("1000");
   
    	PickUpWindow.sendKeys("4/11/2023");
    	//Name.sendKeys("Devon Daggenstoss");
    	
    	DeliveryWindow.sendKeys("4/11/2023");
    	Create.click();
    	WebElement K = driver.findElement(By.className("info-validation"));
    	String kt = K.getText();
    	System.out.println(kt);
    	/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	originName.sendKeys("Golden Services, LLC");
    	originAddress.sendKeys("2400 70th Avenue East Suite B100");
    	PickupContact.sendKeys("Test");
    	PickupPhone.sendKeys("(919) 304-3846");
    	originCity.sendKeys("Fife");
    	OriginState.sendKeys("WA");
    	OriginPostalCode.sendKeys("98424");
    	//Country.sendKeys("US");
    	
    	//PickTimeWindow.sendKeys("4/11/2023");
    	//PickTimeWindow.sendKeys(Keys.ENTER);
    	
    	
    	
    	//PickupDateselection.click();
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	PickupEmail.sendKeys("Test@gmail.com");
    	
    	DestinationName.sendKeys("REFRIGERATION SUPPLIES DIST");
    	DestinationAddress.sendKeys("2521 PACIFIC HIGHWAY E, SUITE C");
    	PickupContactDestination.sendKeys("Test");
    	PickupPhoneDestination.sendKeys("(919) 304-1199");
    	DestinationCity.sendKeys("TACOMA");
    	DestinationState.sendKeys("WA");
    	DestinationPostalCode.sendKeys("98424");
    	DestinationCountry.sendKeys("US");
    	DestinationTimeWindow.sendKeys("4/11/2023");
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	DeclaredValue.sendKeys("1000");
    	Pieces.sendKeys("11");
    	Weight.sendKeys("10");
    	Height.sendKeys("20");
    	Length.sendKeys("20");
    	Width.sendKeys("20");
    	Class.click();
    	ClassSelection.click();
    	Description.sendKeys("This is Test");
    	ReferenceNo.sendKeys("Ref123456");
    	
    	PickTimeWindow.sendKeys("4/11/2023");
    	
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	//Flatbed.click();
    	TruckLoad.click();
    	//Expedited.click();
    	LTLGuaranted.click();
    	Create.click();
    	
    	try {
    		Thread.sleep(8000);
    	} catch (InterruptedException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    	
    	WebElement K = driver.findElement(By.className("success-validation"));
    	String kt = K.getText();
    	System.out.println(kt);
    	
    	SendBid.click();
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.switchTo( ).alert( ).accept();
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	AwardBid.click();
    	driver.switchTo( ).alert( ).accept();
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	WebElement M = driver.findElement(By.className("success-validation"));
    	String Mt = M.getText();
    	System.out.println(Mt);
    	
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	/*LoadBoard.click();
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	FilterClick.click();
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	LoadId.sendKeys(kt);
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
    	LoadId.click();
    	LoadId.sendKeys(Keys.ARROW_LEFT);
    	LoadId.sendKeys(Keys.ARROW_LEFT);
    	LoadId.sendKeys(Keys.ARROW_LEFT);
    	LoadId.sendKeys(Keys.ARROW_LEFT);
    	LoadId.sendKeys(Keys.ARROW_LEFT);
    	LoadId.sendKeys(Keys.ARROW_LEFT);
    	LoadId.sendKeys(Keys.ARROW_LEFT);
    	LoadId.sendKeys(Keys.ARROW_LEFT);
    	LoadId.sendKeys(Keys.BACK_SPACE);
    	LoadId.sendKeys(Keys.BACK_SPACE);
    	LoadId.sendKeys(Keys.BACK_SPACE);
    	LoadId.sendKeys(Keys.BACK_SPACE);
    	LoadId.sendKeys(Keys.BACK_SPACE);
    	LoadId.sendKeys(Keys.BACK_SPACE);
    	LoadId.sendKeys(Keys.BACK_SPACE);
    	LoadId.sendKeys(Keys.BACK_SPACE);
    
    	AllLoad.click();
    	FilterLoad.click(); */
    	
    	
    
    
}
}
