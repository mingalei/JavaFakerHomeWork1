package utils;

public class Variables {
    public static String
            userFirstName = RandomGeneration.getFirstName(),
            userLastName = RandomGeneration.getLastName(),
            mobileNumber = RandomGeneration.userMobileNumber(),
            userGender = RandomGeneration.SetUserGender(),
            userEmail = RandomGeneration.getEmail(),
            setYear = RandomGeneration.getYear(),
            setMonth = RandomGeneration.getMonth(),
            setDay = RandomGeneration.getDay(),
            setSubjects = RandomGeneration.getRandomSubjects(),
            setHobbies = RandomGeneration.getHobbies(),
            setPicture = RandomGeneration.getPicture(),
            setAddress = RandomGeneration.getAddress(),
            stateValue = RandomGeneration.getState(),
            cityValue = RandomGeneration.getCity(stateValue);


}
