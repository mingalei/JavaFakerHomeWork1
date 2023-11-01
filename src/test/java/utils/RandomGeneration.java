package utils;

import com.github.javafaker.Faker;

import java.util.concurrent.ThreadLocalRandom;


public class RandomGeneration {
    static Faker faker = new Faker();

    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    public static String getRandomItemFromArray(String[] array) {
        int index = getRandomInt(0, array.length - 1);
        return array[index];
    }

    public static String getFirstName() {
        return faker.name().firstName();
    }

    public static String getLastName() {
        return faker.name().lastName();
    }

    public static String userMobileNumber() {
        return faker.numerify("##########");
    }

    public static String SetUserGender() {
        String[] genders = {"Male", "Female", "Other"};
        return new Faker().options().option(genders);
    }

    public static String getEmail() {
        return faker.internet().emailAddress();
    }

    public static String getMonth() {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return new Faker().options().option(months);
    }

    public static String getYear() {
        int year = faker.number().numberBetween(1960, 2003);
        return Integer.toString(year);
    }

    public static String getDay() {
        int day = getRandomInt(1, 28);
        if (day < 10) {
            return "0" + day;
        } else {
            return Integer.toString(day);
        }
    }

    public static String getRandomSubjects() {
        String[] subjects = {"Accounting", "Arts", "Biology", "Chemistry", "Civics", "Economics",
                "English", "Commerce", "Computer Science", "Physics", "Maths", "Hindi", "History", "Social Studies"};
        return new Faker().options().option(subjects);
    }

    public static String getHobbies() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        return new Faker().options().option(hobbies);
    }
    public static String getPicture() {
        String[] pictures = {"023.png", "011.jpg", "12.jpg"};
        return  getRandomItemFromArray(pictures);
    }
    public static String getAddress() {
        return faker.address().fullAddress();
    }
    public static String getState() {
        String[] states =  {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};
        return new Faker().options().option(states);
    }

    public static String getCity(String stateValue) {
        switch (stateValue) {
            case "NCR": {
                String[] city =  {"Delhi", "Gurgaon", "Noida"};
                return new Faker().options().option(city);
            }
            case "Uttar Pradesh": {
                String[] city =  {"Agra", "Lucknow", "Merrut"};
                return new Faker().options().option(city);
            }
            case "Haryana": {
                String[] city =  {"Karnal", "Panipat"};
                return new Faker().options().option(city);
            }
            case "Rajasthan": {
                String[] city =  {"Jaipur", "Jaiselmer"};
                return new Faker().options().option(city);
            }
        }
        return null;
    }

}
