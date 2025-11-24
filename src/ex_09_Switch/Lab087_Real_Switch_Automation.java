package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {
  // web automation
        // i will ask user to give me the input from browser which he wants to
//  use to i will start the automation in that browser
// you ask from user that which browser wants to use
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser"); // whatever browser wants to enter,it will show under
        String browser = scanner.next();

        switch (browser){
            case "chrome" :
                System.out.println("Starting the chrome");
                System.out.println("....");
                System.out.println("TC1");
                System.out.println("TC2");
            break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                // further code start the Firefox
                //Webdriver driver = new Firefox(); // Selenium code
                break;
            case "edge":
                System.out.println("Excecute the Edge Code");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;
             }
        // whatever browser wants to enter,it will show under case



    }

}
