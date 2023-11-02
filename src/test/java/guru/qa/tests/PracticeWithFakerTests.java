package guru.qa.tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import utils.Variables;


public class PracticeWithFakerTests extends BeforeUrl {

    RegistrationPage registrationPage = new RegistrationPage();


    @Test
    public void formPageObject() {
        Variables user = new Variables();
        registrationPage.openPage()
                .setFirstName(user.userFirstName)
                .setLastname(user.userLastName)
                .setUserNumber(user.mobileNumber)
                .selectGender(user.userGender)
                .setUserEmail(user.userEmail)
                .birthday(user.setDay, user.setMonth, user.setYear)
                .subjectSelect(user.setSubjects)
                .hobbie(user.setHobbies)
                .pictureUpload(user.setPicture)
                .adress(user.setAddress)
                .selectState(user.stateValue)
                .selectCity(user.cityValue)
                .clickSubmit();

        registrationPage.checkModalTable()
                .resultPage("Student Name", user.userFirstName + " " + user.userLastName)
                .resultPage("Student Email", user.userEmail)
                .resultPage("Gender", user.userGender)
                .resultPage("Mobile", user.mobileNumber)
                .resultPage("Date of Birth", user.setDay + " " + user.setMonth + "," + user.setYear)
                .resultPage("Subjects", user.setSubjects)
                .resultPage("Hobbies", user.setHobbies)
                .resultPage("Picture", user.setPicture)
                .resultPage("Address", user.setAddress)
                .resultPage("State and City", user.stateValue + " " + user.cityValue);
    }
}