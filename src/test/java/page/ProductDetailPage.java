package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public ProductDetailPage productDetailPage(){
        clickBy(By.className("btnAddBasket"));
        return new ProductDetailPage(driver);
    }



}
