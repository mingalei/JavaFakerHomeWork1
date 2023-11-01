package guru.qa.tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static utils.Variables.*;


public class PracticeWithFakerTests extends BeforeUrl {

    RegistrationPage registrationPage = new RegistrationPage();


    @Test
    void formPageObject() {
        registrationPage.openPage()
                .setFirstName(userFirstName)
                .setLastname(userLastName)
                .setUserNumber(mobileNumber)
                .selectGender(userGender)
                .setUserEmail(userEmail)
                .birthday(setDay, setMonth, setYear)
                .subjectSelect(setSubjects)
                .hobbie(setHobbies)
                .pictureUpload(setPicture)
                .adress(setAddress)
                .selectState(stateValue)
                .selectCity(cityValue)
                .clickSubmit();

        this.registrationPage.checkModalTable()
                .resultPage("Student Name", userFirstName + " " + userLastName)
                .resultPage("Student Email", userEmail)
                .resultPage("Gender", userGender)
                .resultPage("Mobile", mobileNumber)
                .resultPage("Date of Birth", setDay + " " + setMonth + "," + setYear)
                .resultPage("Subjects", setSubjects)
                .resultPage("Hobbies", setHobbies)
                .resultPage("Picture", setPicture)
                .resultPage("Address", setAddress)
                .resultPage("State and City", stateValue + " " + cityValue);
    }
}