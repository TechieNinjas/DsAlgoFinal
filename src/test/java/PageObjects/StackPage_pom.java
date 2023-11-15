package PageObjects;

import org.openqa.selenium.By;

import Utilities.BaseClass;

public class StackPage_pom extends BaseClass {
	By StackGetStrtdBtn = By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']//div[4]//a");
	By OperationsinStack = By.xpath("//a[contains(text(), 'Operations in ')]");
	By StackImplemantation = By.xpath("//div[@class='col-2']//div/li[2]/a");
	By StackApplications = By.xpath("//div[@class='row']//div[1]/div/li[3]/a");

	public StackPage StackGetStrtdBtn() {
		driver.findElement(StackGetStrtdBtn).click();
		return new StackPage();
	}

	public OperationsinStack OperationsinStackBtn() {
		driver.findElement(OperationsinStack).click();
		return new OperationsinStack();
	}

	public StackImplementation StackImplementationBtn() {
		driver.findElement(StackImplemantation).click();
		return new StackImplementation();
	}

	public StackApplications StackApplicationsBtn() {
		driver.findElement(StackApplications).click();
		return new StackApplications();
	}

}
