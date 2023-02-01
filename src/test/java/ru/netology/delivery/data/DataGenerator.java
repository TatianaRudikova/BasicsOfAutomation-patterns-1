package ru.netology.delivery.data;

import com.github.javafaker.Faker;
import lombok.Value;
import lombok.val;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    private static Random random = new Random();

    private DataGenerator() {
    }

    public static String generateDate(int shift, int range) {
        return LocalDate.now().plusDays(3 + shift).plusDays(random.nextInt(range))
                .format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public static String generateCity() {
        String[] city = new String[]{"Москва", "Майкоп", "Санкт-Петербург", "Уфа", "Великий Новгород", "Нарьян-Мар",
                "Ростов-на-Дону", "Нижний Новгород", "Владимир", "Архангельск"};
        return city[random.nextInt(city.length)];
    }

    public static String generateName(String locale) {
        Faker faker = new Faker(new Locale(locale));
        return faker.name().fullName();
    }

    public static String generatePhone(String locale) {
        Faker faker = new Faker(new Locale(locale));
        return faker.phoneNumber().phoneNumber();
    }

//    public static class Registration {
//        private Registration() {
//        }

//        public static UserInfo generateUser(String locale) {
//            Faker faker = new Faker(new Locale(locale));
//            return new UserInfo(generateCity(), generateName(locale), generatePhone(locale));
//        }

//    }
//
//    @Value
//    public static class UserInfo {
//        String city;
//        String name;
//        String phone;
//    }
}