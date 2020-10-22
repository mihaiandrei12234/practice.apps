import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://posabogdan.tech/demo/selenium/add_bug.html");
        for (int i = 0; i < 9999; i++) {
            for(int j=0;j<100;j++) {
                WebElement input1 = chromeDriver.findElementByCssSelector("#nr1");
                input1.clear();
                input1.sendKeys(i + "");
                WebElement input2 = chromeDriver.findElementByCssSelector("#nr2");
                input2.clear();
                input2.sendKeys(j + "");
                WebElement button = chromeDriver.findElementByCssSelector("button");
                button.submit();
                WebElement res = chromeDriver.findElementByCssSelector("#result");
                String resText = res.getText();
                System.out.println(resText);
                if (resText.equals( i+j + "")) {
                    System.out.println("Functioneaza corect cu " + i+","+j);
                } else {
                    System.out.println("Am gasit un bug pt" + i+","+j);
                }
            }
        }
    }
}
