package com.example.savemoneyback_end.resources;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class Receita_ResourcesTest {

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before("")
    public void setUp() {
        driver = (WebDriver) new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After("")
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void adicionar() {
        driver.get("http://localhost:63343/savemoney_project_2/project_savemoney_2/app/Usuario/receita.html#");
        /*driver.manage().window().setSize(new Dimension(1382, 744));*/
        driver.findElement(By.id("input_nome_receita")).click();
        driver.findElement(By.id("input_nome_receita")).sendKeys("Test1");
        driver.findElement(By.id("input_valor_receita")).sendKeys("1223.23");
        driver.findElement(By.id("input_descricao_receita")).sendKeys("testdesc");
        driver.findElement(By.name("adicionar")).click();
        assertThat(driver.findElement(By.id("form-adicionar")).getText(), is("Nome da receita:\\\\nValor:\\\\nDescrição:"));
    }

    private void assertThat(String text, Matcher<String> stringMatcher) {
    }

}