package day_1;

public class CreateChannel {
    public static void main(String[] args) {

        System.out.println("User is able to create channel");

        System.out.println(         );
        System.out.println("what is conflit");


        for (String arg : args) {//changed from inteliJ

            break;
        }
        }

   
    
     @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    
    
    

    }

