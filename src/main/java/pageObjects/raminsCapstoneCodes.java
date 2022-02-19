//click method
//@SuppressWarnings("deprecation")
//	public static void waitAndClickElement(WebElement element) {
//		boolean clicked = false;
//		int attempts = 0;
//		while(!clicked && attempts < 10) {
//			try {
//			wait = new WebDriverWait(driver, 20);
//			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
//			System.out.println("Successfully clicked on the WebElement: " + "=" + element.toString());
//			clicked = true;
//			} catch (Exception e) {
//				try {
//					logger.info("Failed to click the element");
//				} catch (Exception e2) {
//				}
//				Assert.fail("Unable to click the element: " + "=" +  element.toString());
//			}	
//		attempts++;
//		}	
//	}

//---------------------------------------------------------------------
//highlight and take screen shots
//
////How we can give border to an element on webpage and take screenshot
//	public static void highlightelementRedBorderAndTakeScreenshot(WebElement element, String fileName) throws IOException {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].style.border='2px solid red'", element);
//		try {
//			Thread.sleep(3000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		Utilities.takeScreenShot(fileName);
//	}
////
//
////---------------------------------------------------------------------
//
//
//laptops and notebooks feature file
//
//@laptopsAndNoteBook
//Feature: Home Page
//Scenario: Add and Remove a Mac book from Cart
//  Given user is on test environment homepage
//	When User click on Laptop & NoteBook tab
//	And User click on Show all Laptop & NoteBook option
//	And User click on MacBook  item
//	And User click add to Cart button
//	Then User should see a message 'Success: You have added MacBook to your shopping cart!'
//	And User should see '1 item(s) - $602.00' showed to the cart
//	And User click on cart option
//	And user click on red X button to remove the item from cart
//	Then item should be removed and cart should show '0 item(s) - $0.00'
//
//---------------------------------------------------------------------





