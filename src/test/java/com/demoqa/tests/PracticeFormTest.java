package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.PracticeFormPage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTest extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPracticeForm();
    }

    @Test
    public void createStudentAccountTest() {
        //убираем рекламу
        new PracticeFormPage(driver).hideIframes();
        //ввод персональных данных
        new PracticeFormPage(driver)
                .enterPersonData("Vincent", "Vega", "pulp_fiction@gmail.com", "1234567890")
        //выбор пола (radio button)
                .selectGender("Male")
        //ввод даты рождения
                .enterBirthDay("16 August 1961")
        //ввод предметов
                .enterSubjects(new String[]{"Maths", "Chemistry"})
        //выбор хобби (check box)
                .selectHobby(new String[]{"Sports", "Reading"})
        //загрузка файлов
                .uploadFile("C:/Tools/vincent_vega.jpg")
        //выбор страны и выбор города
                .selectState("NCR")
                .selectCity("Delhi")
        //клик на кнопку отправки формы
                .clickOnSubmit()
        //Assert...
                .verifySuccessTitle("Thanks for submitting the form");
    }
}
