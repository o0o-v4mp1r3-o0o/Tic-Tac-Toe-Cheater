package main;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

//https://devqa.io/selenium-css-selectors/
//https://www.toolsqa.com/selenium-webdriver/write-effective-xpaths/
//https://stackoverflow.com/questions/57943607/how-to-track-dynamically-updating-code-using-selenium-in-python
//https://stackoverflow.com/questions/19906401/how-can-i-make-a-method-repeat-itself-java
//java -jar C:/Users/#USERNAMEHERE/IdeaProjects/WebScrape/out/artifacts/WebScrape_jar/Webscrape.jar

public class main {
    public static void main(String[] args) throws InterruptedException{
        String projectPath = System.getProperty("user.home");
        String projectPathToTheDriver = "\\IdeaProjects\\WebScrape\\Resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", projectPath + projectPathToTheDriver);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://playtictactoe.org/");
        Thread.sleep(4000);
        driver.findElement(By.cssSelector(".square.top.right")).click();
        Thread.sleep(3000);
        WebElement e = driver.findElement(By.xpath("//div[@class='o'][1]/parent::div"));
        String B = e.getAttribute("class");
        System.out.print(B);
        List<WebElement> as = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
        Iterator<WebElement> itr = as.iterator();
        String SSGIRLS = null;
        String SSGIRLS1 = null;
        String SSGIRLS2 = null;
        while(itr.hasNext()) {
            String name = itr.next().getAttribute("class");
            System.out.println(name);
        }
        //System.out.print(e.getAttribute("class"));
        //WebElement parent = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0]" +
                //".parentNode;", e);
        //String B = parent.getAttribute("class");
        //System.out.print(B);
        Thread.sleep(2000);
        if(Objects.equals(B, "square")){
            driver.findElement(By.xpath("//div[@class='square bottom left'][1]")).click();
            Thread.sleep(2000);
            List<WebElement> as1 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
            Iterator<WebElement> itr1 = as1.iterator();
            while(itr1.hasNext()) {
                String name = itr1.next().getAttribute("class");
                System.out.println(name);
                if(!Objects.equals(B, name)){
                    SSGIRLS = name;
                }
            }
                if(Objects.equals(SSGIRLS, "square top left")) {
                    driver.findElement(By.cssSelector(".square.bottom.right")).click();
                    Thread.sleep(2000);
                    List<WebElement> as2 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
                    Iterator<WebElement> itr2 = as2.iterator();
                    while (itr2.hasNext()) {
                        String name1 = itr2.next().getAttribute("class");
                        System.out.println(name1);
                        if (!Objects.equals(B, name1)) {
                            if (!Objects.equals(SSGIRLS, name1)) {
                                System.out.println(name1);
                                SSGIRLS1 = name1;
                                System.out.print(SSGIRLS1);
                            } else {
                                ;
                            }
                        } else {
                            ;
                        }
                    }
                    if (Objects.equals(SSGIRLS1, "square left")) { ;
                        driver.findElement(By.xpath("//div[@class='square right'][1]")).click();
                    }
                    if (Objects.equals(SSGIRLS1, "square top")) { ;
                        driver.findElement(By.xpath("//div[@class='square right'][1]")).click();
                    }
                    if (Objects.equals(SSGIRLS1, "square right")) { ;
                        driver.findElement(By.xpath("//div[@class='square bottom'][1]")).click();
                    }
                    if (Objects.equals(SSGIRLS1, "square bottom")) { ;
                        driver.findElement(By.xpath("//div[@class='square right'][1]")).click();
                    }
                }

                if (Objects.equals(SSGIRLS, "square bottom right")) {
                    driver.findElement(By.xpath("//div[@class='square top left'][1]")).click();
                    Thread.sleep(2000);
                    List<WebElement> as2 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
                    Iterator<WebElement> itr2 = as2.iterator();
                    while (itr2.hasNext()) {
                        String name1 = itr2.next().getAttribute("class");
                        System.out.println(name1);
                        if (!Objects.equals(B, name1)) {
                            if (!Objects.equals(SSGIRLS, name1)) {
                                System.out.println(name1);
                                SSGIRLS1 = name1;
                                System.out.print(SSGIRLS1);
                            } else {
                                ;
                            }
                        } else {
                            ;
                        }
                    }
                    if (Objects.equals(SSGIRLS1, "square left")) {
                        driver.findElement(By.xpath("//div[@class='square top'][1]")).click();
                    }
                    if (Objects.equals(SSGIRLS1, "square top")) {
                        driver.findElement(By.xpath("//div[@class='square left'][1]")).click();
                    }
                    if (Objects.equals(SSGIRLS1, "square right")) {
                        driver.findElement(By.xpath("//div[@class='square left'][1]")).click();
                    }
                    if (Objects.equals(SSGIRLS1, "square bottom")) {
                        driver.findElement(By.xpath("//div[@class='square left'][1]")).click();
                    }

                }
            if (Objects.equals(SSGIRLS, "square top")) {
                driver.findElement(By.xpath("//div[@class='square bottom'][1]")).click();
                Thread.sleep(2000);
                List<WebElement> as2 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
                Iterator<WebElement> itr2 = as2.iterator();
                while (itr2.hasNext()) {
                    String name1 = itr2.next().getAttribute("class");
                    System.out.println(name1);
                    if (!Objects.equals(B, name1)) {
                        if (!Objects.equals(SSGIRLS, name1)) {
                            System.out.println(name1);
                            SSGIRLS1 = name1;
                            System.out.print(SSGIRLS1);
                        } else {
                            ;
                        }
                    } else {
                        ;
                    }
                }
                if (Objects.equals(SSGIRLS1, "square left")) {
                    driver.findElement(By.xpath("//div[@class='square bottom right'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square top left")) {
                    driver.findElement(By.xpath("//div[@class='square bottom right'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square right")) {
                    driver.findElement(By.xpath("//div[@class='square bottom right'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square bottom right")) {
                    driver.findElement(By.xpath("//div[@class='square top left'][1]")).click();
                    Thread.sleep(2000);
                    List<WebElement> as3 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
                    Iterator<WebElement> itr3 = as3.iterator();
                    while (itr3.hasNext()) {
                        String name1 = itr3.next().getAttribute("class");
                        System.out.println(name1);
                        if (!Objects.equals(B, name1)) {
                            if (!Objects.equals(SSGIRLS, name1)) {
                                if (!Objects.equals(SSGIRLS1, name1)) {
                                    System.out.println(name1);
                                    SSGIRLS2 = name1;
                                    System.out.print(SSGIRLS2);
                                }
                            } else {
                                ;
                            }
                        } else {
                            ;
                        }
                    }
                    if (Objects.equals(SSGIRLS2, "square left")) {
                        driver.findElement(By.xpath("//div[@class='square right'][1]")).click();
                    }
                    if (Objects.equals(SSGIRLS2, "square right")) {
                        driver.findElement(By.xpath("//div[@class='square left'][1]")).click();
                    }
                }
            }
            if (Objects.equals(SSGIRLS, "square bottom")) { //THIRD MOVE
                driver.findElement(By.xpath("//div[@class='square top'][1]")).click();
                Thread.sleep(2000);
                List<WebElement> as2 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
                Iterator<WebElement> itr2 = as2.iterator();
                while (itr2.hasNext()) {
                    String name1 = itr2.next().getAttribute("class");
                    System.out.println(name1);
                    if (!Objects.equals(B, name1)) {
                        if (!Objects.equals(SSGIRLS, name1)) {
                            System.out.println(name1);
                            SSGIRLS1 = name1;
                            System.out.print(SSGIRLS1);
                        } else {
                            ;
                        }
                    } else {
                        ;
                    }
                }
                if (Objects.equals(SSGIRLS1, "square left")) {
                    driver.findElement(By.xpath("//div[@class='square top left'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square bottom right")) {
                    driver.findElement(By.xpath("//div[@class='square top left'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square right")) {
                    driver.findElement(By.xpath("//div[@class='square top left'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square top left")) {
                    driver.findElement(By.xpath("//div[@class='square bottom right'][1]")).click();
                    Thread.sleep(2000);
                    List<WebElement> as3 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
                    Iterator<WebElement> itr3 = as3.iterator();
                    while (itr3.hasNext()) {
                        String name1 = itr3.next().getAttribute("class");
                        System.out.println(name1);
                        if (!Objects.equals(B, name1)) {
                            if (!Objects.equals(SSGIRLS, name1)) {
                                if (!Objects.equals(SSGIRLS1, name1)) {
                                    System.out.println(name1);
                                    SSGIRLS2 = name1;
                                    System.out.print(SSGIRLS2);
                                }
                            } else {
                                ;
                            }
                        } else {
                            ;
                        }
                    }
                    if (Objects.equals(SSGIRLS2, "square left")) {
                        driver.findElement(By.xpath("//div[@class='square right'][1]")).click();
                    }
                    if (Objects.equals(SSGIRLS2, "square right")) {
                        driver.findElement(By.xpath("//div[@class='square left'][1]")).click();
                    }
                }
            }
            if (Objects.equals(SSGIRLS, "square right")) { //THIRD MOVE
                driver.findElement(By.xpath("//div[@class='square left'][1]")).click();
                Thread.sleep(2000);
                List<WebElement> as2 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
                Iterator<WebElement> itr2 = as2.iterator();
                while (itr2.hasNext()) {
                    String name1 = itr2.next().getAttribute("class");
                    System.out.println(name1);
                    if (!Objects.equals(B, name1)) {
                        if (!Objects.equals(SSGIRLS, name1)) {
                            System.out.println(name1);
                            SSGIRLS1 = name1;
                            System.out.print(SSGIRLS1);
                        } else {
                            ;
                        }
                    } else {
                        ;
                    }
                }
                if (Objects.equals(SSGIRLS1, "square top")) {
                    driver.findElement(By.xpath("//div[@class='square top left'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square bottom")) {
                    driver.findElement(By.xpath("//div[@class='square top left'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square bottom right")) {
                    driver.findElement(By.xpath("//div[@class='square top left'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square top left")) {
                    driver.findElement(By.xpath("//div[@class='square bottom left'][1]")).click();
                    Thread.sleep(2000);
                    List<WebElement> as3 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
                    Iterator<WebElement> itr3 = as3.iterator();
                    while (itr3.hasNext()) {
                        String name1 = itr3.next().getAttribute("class");
                        System.out.println(name1);
                        if (!Objects.equals(B, name1)) {
                            if (!Objects.equals(SSGIRLS, name1)) {
                                if (!Objects.equals(SSGIRLS1, name1)) {
                                    System.out.println(name1);
                                    SSGIRLS2 = name1;
                                    System.out.print(SSGIRLS2);
                                }
                            } else {
                                ;
                            }
                        } else {
                            ;
                        }
                    }
                    if (Objects.equals(SSGIRLS2, "square top")) {
                        driver.findElement(By.xpath("//div[@class='square bottom'][1]")).click();
                    }
                    if (Objects.equals(SSGIRLS2, "square bottom")) {
                        driver.findElement(By.xpath("//div[@class='square top'][1]")).click();
                    }
                }
            }
            if (Objects.equals(SSGIRLS, "square left")) { //THIRD MOVE
                driver.findElement(By.xpath("//div[@class='square right'][1]")).click();
                Thread.sleep(2000);
                List<WebElement> as2 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
                Iterator<WebElement> itr2 = as2.iterator();
                while (itr2.hasNext()) {
                    String name1 = itr2.next().getAttribute("class");
                    System.out.println(name1);
                    if (!Objects.equals(B, name1)) {
                        if (!Objects.equals(SSGIRLS, name1)) {
                            System.out.println(name1);
                            SSGIRLS1 = name1;
                            System.out.print(SSGIRLS1);
                        } else {
                            ;
                        }
                    } else {
                        ;
                    }
                }
                if (Objects.equals(SSGIRLS1, "square top")) {
                    driver.findElement(By.xpath("//div[@class='square bottom right'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square bottom")) {
                    driver.findElement(By.xpath("//div[@class='square bottom right'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square top left")) {
                    driver.findElement(By.xpath("//div[@class='square bottom right'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square bottom right")) {
                    driver.findElement(By.xpath("//div[@class='square top left'][1]")).click();
                    Thread.sleep(2000);
                    List<WebElement> as3 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
                    Iterator<WebElement> itr3 = as3.iterator();
                    while (itr3.hasNext()) {
                        String name1 = itr3.next().getAttribute("class");
                        System.out.println(name1);
                        if (!Objects.equals(B, name1)) {
                            if (!Objects.equals(SSGIRLS, name1)) {
                                if (!Objects.equals(SSGIRLS1, name1)) {
                                    System.out.println(name1);
                                    SSGIRLS2 = name1;
                                    System.out.print(SSGIRLS2);
                                }
                            } else {
                                ;
                            }
                        } else {
                            ;
                        }
                    }
                    if (Objects.equals(SSGIRLS2, "square top")) {
                        driver.findElement(By.xpath("//div[@class='square bottom'][1]")).click();
                    }
                    if (Objects.equals(SSGIRLS2, "square bottom")) {
                        driver.findElement(By.xpath("//div[@class='square top'][1]")).click();
                    }
                }
            }
        }
        else if(Objects.equals(B, "square top")){
            driver.findElement(By.xpath("//div[@class='square'][1]")).click();
            Thread.sleep(1000);
            List<WebElement> as1 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
            Iterator<WebElement> itr1 = as1.iterator();
            while(itr1.hasNext()) {
                String name = itr1.next().getAttribute("class");
                System.out.println(name);
                if(!Objects.equals(B, name)){
                    SSGIRLS = name;
                }
            }
            if(Objects.equals(SSGIRLS, "square top left")) {
                driver.findElement(By.cssSelector(".square.bottom.left")).click();
            }
            if(Objects.equals(SSGIRLS, "square left")) {
                driver.findElement(By.cssSelector(".square.bottom.left")).click();
            }
            if(Objects.equals(SSGIRLS, "square right")) {
                driver.findElement(By.cssSelector(".square.bottom.left")).click();
            }
            if(Objects.equals(SSGIRLS, "square bottom ")) {
                driver.findElement(By.cssSelector(".square.bottom.left")).click();
            }
            if(Objects.equals(SSGIRLS, "square bottom right")) {
                driver.findElement(By.cssSelector(".square.bottom.left")).click();
            }
            if(Objects.equals(SSGIRLS, "square bottom left")) {
                driver.findElement(By.cssSelector(".square.bottom.right")).click();
                Thread.sleep(2000);
                List<WebElement> as2 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
                Iterator<WebElement> itr2 = as2.iterator();
                while (itr2.hasNext()) {
                    String name1 = itr2.next().getAttribute("class");
                    System.out.println(name1);
                    if (!Objects.equals(B, name1)) {
                        if (!Objects.equals(SSGIRLS, name1)) {
                            System.out.println(name1);
                            SSGIRLS1 = name1;
                            System.out.print(SSGIRLS1);
                        } else {
                            ;
                        }
                    } else {
                        ;
                    }
                }
                if (Objects.equals(SSGIRLS1, "square left")) { ;
                    driver.findElement(By.xpath("//div[@class='square right'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square top left")) { ;
                    driver.findElement(By.xpath("//div[@class='square right'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square right")) { ;
                    driver.findElement(By.xpath("//div[@class='square top left'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square bottom")) { ;
                    driver.findElement(By.xpath("//div[@class='square right'][1]")).click();
                }
            }
        }
        else if(Objects.equals(B, "square top left")) {
            driver.findElement(By.xpath("//div[@class='square bottom left'][1]")).click();
            Thread.sleep(1000);
            List<WebElement> as1 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
            Iterator<WebElement> itr1 = as1.iterator();
            while(itr1.hasNext()) {
                String name = itr1.next().getAttribute("class");
                System.out.println(name);
                if(!Objects.equals(B, name)){
                    SSGIRLS = name;
                }
            }
            if(Objects.equals(SSGIRLS, "square top")) {
                driver.findElement(By.cssSelector(".square")).click();
            }
            if(Objects.equals(SSGIRLS, "square left")) {
                driver.findElement(By.cssSelector(".square")).click();
            }
            if(Objects.equals(SSGIRLS, "square right")) {
                driver.findElement(By.cssSelector(".square")).click();
            }
            if(Objects.equals(SSGIRLS, "square bottom ")) {
                driver.findElement(By.cssSelector(".square")).click();
            }
            if(Objects.equals(SSGIRLS, "square bottom right")) {
                driver.findElement(By.cssSelector(".square")).click();
            }
            if(Objects.equals(SSGIRLS, "square")) {
                driver.findElement(By.cssSelector(".square.bottom.right")).click();
                Thread.sleep(2000);
                List<WebElement> as2 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
                Iterator<WebElement> itr2 = as2.iterator();
                while (itr2.hasNext()) {
                    String name1 = itr2.next().getAttribute("class");
                    System.out.println(name1);
                    if (!Objects.equals(B, name1)) {
                        if (!Objects.equals(SSGIRLS, name1)) {
                            System.out.println(name1);
                            SSGIRLS1 = name1;
                            System.out.print(SSGIRLS1);
                        } else {
                            ;
                        }
                    } else {
                        ;
                    }
                }
                if (Objects.equals(SSGIRLS1, "square left")) { ;
                    driver.findElement(By.xpath("//div[@class='square right'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square top")) { ;
                    driver.findElement(By.xpath("//div[@class='square right'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square right")) { ;
                    driver.findElement(By.xpath("//div[@class='square bottom'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square bottom")) { ;
                    driver.findElement(By.xpath("//div[@class='square right'][1]")).click();
                }
            }
        }
        else if(Objects.equals(B, "square left")){
            driver.findElement(By.xpath("//div[@class='square'][1]")).click();
            Thread.sleep(1000);
            List<WebElement> as1 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
            Iterator<WebElement> itr1 = as1.iterator();
            while(itr1.hasNext()) {
                String name = itr1.next().getAttribute("class");
                System.out.println(name);
                if(!Objects.equals(B, name)){
                    SSGIRLS = name;
                }
            }
            if(Objects.equals(SSGIRLS, "square top left")) {
                driver.findElement(By.xpath("//div[@class='square bottom left'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square top")) {
                driver.findElement(By.xpath("//div[@class='square bottom left'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square right")) {
                driver.findElement(By.xpath("//div[@class='square bottom left'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square bottom right")) {
                driver.findElement(By.xpath("//div[@class='square bottom left'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square bottom")) {
                driver.findElement(By.xpath("//div[@class='square bottom left'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square bottom left")) {
                driver.findElement(By.xpath("//div[@class='square top left'][1]")).click();
                Thread.sleep(2000);
                List<WebElement> as2 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
                Iterator<WebElement> itr2 = as2.iterator();
                while (itr2.hasNext()) {
                    String name1 = itr2.next().getAttribute("class");
                    System.out.println(name1);
                    if (!Objects.equals(B, name1)) {
                        if (!Objects.equals(SSGIRLS, name1)) {
                            System.out.println(name1);
                            SSGIRLS1 = name1;
                            System.out.print(SSGIRLS1);
                        } else {
                            ;
                        }
                    } else {
                        ;
                    }
                }
                if (Objects.equals(SSGIRLS1, "square bottom right")) { ;
                    driver.findElement(By.xpath("//div[@class='square top'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square top")) { ;
                    driver.findElement(By.xpath("//div[@class='square bottom right'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square right")) { ;
                    driver.findElement(By.xpath("//div[@class='square top'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square bottom")) { ;
                    driver.findElement(By.xpath("//div[@class='square top'][1]")).click();
                }
            }
        }
        else if(Objects.equals(B, "square bottom left")) {
            driver.findElement(By.xpath("//div[@class='square bottom right'][1]")).click();
            Thread.sleep(1000);
            List<WebElement> as1 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
            Iterator<WebElement> itr1 = as1.iterator();
            while(itr1.hasNext()) {
                String name = itr1.next().getAttribute("class");
                System.out.println(name);
                if(!Objects.equals(B, name)){
                    SSGIRLS = name;
                }
            }
            if(Objects.equals(SSGIRLS, "square top left")) {
                driver.findElement(By.xpath("//div[@class='square right'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square top")) {
                driver.findElement(By.xpath("//div[@class='square right'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square")) {
                driver.findElement(By.xpath("//div[@class='square right'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square left")) {
                driver.findElement(By.xpath("//div[@class='square right'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square bottom")) {
                driver.findElement(By.xpath("//div[@class='square right'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square right")) {
                driver.findElement(By.xpath("//div[@class='square top left'][1]")).click();
                Thread.sleep(2000);
                List<WebElement> as2 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
                Iterator<WebElement> itr2 = as2.iterator();
                while (itr2.hasNext()) {
                    String name1 = itr2.next().getAttribute("class");
                    System.out.println(name1);
                    if (!Objects.equals(B, name1)) {
                        if (!Objects.equals(SSGIRLS, name1)) {
                            System.out.println(name1);
                            SSGIRLS1 = name1;
                            System.out.print(SSGIRLS1);
                        } else {
                            ;
                        }
                    } else {
                        ;
                    }
                }
                if (Objects.equals(SSGIRLS1, "square")) { ;
                    driver.findElement(By.xpath("//div[@class='square top'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square top")) { ;
                    driver.findElement(By.xpath("//div[@class='square'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square left")) { ;
                    driver.findElement(By.xpath("//div[@class='square'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square bottom")) { ;
                    driver.findElement(By.xpath("//div[@class='square'][1]")).click();
                }
            }
        }
        else if(Objects.equals(B, "square bottom")) {
            driver.findElement(By.xpath("//div[@class='square bottom right'][1]")).click();
            Thread.sleep(1000);
            List<WebElement> as1 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
            Iterator<WebElement> itr1 = as1.iterator();
            while(itr1.hasNext()) {
                String name = itr1.next().getAttribute("class");
                System.out.println(name);
                if(!Objects.equals(B, name)){
                    SSGIRLS = name;
                }
            }
            if(Objects.equals(SSGIRLS, "square top left")) {
                driver.findElement(By.xpath("//div[@class='square right'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square top")) {
                driver.findElement(By.xpath("//div[@class='square right'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square")) {
                driver.findElement(By.xpath("//div[@class='square right'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square left")) {
                driver.findElement(By.xpath("//div[@class='square right'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square bottom left")) {
                driver.findElement(By.xpath("//div[@class='square right'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square right")) {
                driver.findElement(By.xpath("//div[@class='square'][1]")).click();
                Thread.sleep(2000);
                List<WebElement> as2 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
                Iterator<WebElement> itr2 = as2.iterator();
                while (itr2.hasNext()) {
                    String name1 = itr2.next().getAttribute("class");
                    System.out.println(name1);
                    if (!Objects.equals(B, name1)) {
                        if (!Objects.equals(SSGIRLS, name1)) {
                            System.out.println(name1);
                            SSGIRLS1 = name1;
                            System.out.print(SSGIRLS1);
                        } else {
                            ;
                        }
                    } else {
                        ;
                    }
                }
                if (Objects.equals(SSGIRLS1, "square top left")) { ;
                    driver.findElement(By.xpath("//div[@class='square bottom left'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square top")) { ;
                    driver.findElement(By.xpath("//div[@class='square bottom left'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square left")) { ;
                    driver.findElement(By.xpath("//div[@class='square bottom left'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square bottom left")) { ;
                    driver.findElement(By.xpath("//div[@class='square top left'][1]")).click();
                }
            }
        }
        else if(Objects.equals(B, "square bottom right")){
            driver.findElement(By.xpath("//div[@class='square bottom left'][1]")).click();
            Thread.sleep(1000);
            List<WebElement> as1 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
            Iterator<WebElement> itr1 = as1.iterator();
            while(itr1.hasNext()) {
                String name = itr1.next().getAttribute("class");
                System.out.println(name);
                if(!Objects.equals(B, name)){
                    SSGIRLS = name;
                }
            }
            if(Objects.equals(SSGIRLS, "square top left")) {
                driver.findElement(By.xpath("//div[@class='square'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square top")) {
                driver.findElement(By.xpath("//div[@class='square'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square bottom")) {
                driver.findElement(By.xpath("//div[@class='square'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square left")) {
                driver.findElement(By.xpath("//div[@class='square'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square right")) {
                driver.findElement(By.xpath("//div[@class='square'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square")) {
                driver.findElement(By.xpath("//div[@class='square top left'][1]")).click();
                Thread.sleep(2000);
                List<WebElement> as2 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
                Iterator<WebElement> itr2 = as2.iterator();
                while (itr2.hasNext()) {
                    String name1 = itr2.next().getAttribute("class");
                    System.out.println(name1);
                    if (!Objects.equals(B, name1)) {
                        if (!Objects.equals(SSGIRLS, name1)) {
                            System.out.println(name1);
                            SSGIRLS1 = name1;
                            System.out.print(SSGIRLS1);
                        } else {
                            ;
                        }
                    } else {
                        ;
                    }
                }
                if (Objects.equals(SSGIRLS1, "square right")) { ;
                    driver.findElement(By.xpath("//div[@class='square top'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square top")) { ;
                    driver.findElement(By.xpath("//div[@class='square left'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square left")) { ;
                    driver.findElement(By.xpath("//div[@class='square top'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square bottom")) { ;
                    driver.findElement(By.xpath("//div[@class='square top'][1]")).click();
                }
            }
        }
        else if(Objects.equals(B, "square right")) {
            driver.findElement(By.xpath("//div[@class='square'][1]")).click();
            Thread.sleep(1000);
            List<WebElement> as1 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
            Iterator<WebElement> itr1 = as1.iterator();
            while(itr1.hasNext()) {
                String name = itr1.next().getAttribute("class");
                System.out.println(name);
                if(!Objects.equals(B, name)){
                    SSGIRLS = name;
                }
            }
            if(Objects.equals(SSGIRLS, "square top left")) {
                driver.findElement(By.xpath("//div[@class='square bottom left'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square top")) {
                driver.findElement(By.xpath("//div[@class='square bottom left'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square bottom")) {
                driver.findElement(By.xpath("//div[@class='square bottom left'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square left")) {
                driver.findElement(By.xpath("//div[@class='square bottom left'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square bottom right")) {
                driver.findElement(By.xpath("//div[@class='square bottom left'][1]")).click();
            }
            if(Objects.equals(SSGIRLS, "square bottom left")) {
                driver.findElement(By.xpath("//div[@class='square top left'][1]")).click();
                Thread.sleep(2000);
                List<WebElement> as2 = driver.findElements(By.xpath("//div[@class='o'][1]/parent::div"));
                Iterator<WebElement> itr2 = as2.iterator();
                while (itr2.hasNext()) {
                    String name1 = itr2.next().getAttribute("class");
                    System.out.println(name1);
                    if (!Objects.equals(B, name1)) {
                        if (!Objects.equals(SSGIRLS, name1)) {
                            System.out.println(name1);
                            SSGIRLS1 = name1;
                            System.out.print(SSGIRLS1);
                        } else {
                            ;
                        }
                    } else {
                        ;
                    }
                }
                if (Objects.equals(SSGIRLS1, "square bottom right")) { ;
                    driver.findElement(By.xpath("//div[@class='square top'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square top")) { ;
                    driver.findElement(By.xpath("//div[@class='square bottom right'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square left")) { ;
                    driver.findElement(By.xpath("//div[@class='square top'][1]")).click();
                }
                if (Objects.equals(SSGIRLS1, "square bottom")) { ;
                    driver.findElement(By.xpath("//div[@class='square top'][1]")).click();
                }
            }
        }
    }
}

