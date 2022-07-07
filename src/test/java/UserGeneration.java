import com.github.javafaker.Faker;

public class UserGeneration {

    public static UserData generateUser(String status) {
        return new UserData(generateLogin(), generatePassword(), status);
    }

    private static String generatePassword() {
        Faker faker = new Faker();
        return faker.internet().password();
    }

    public static String generateLogin() {
        Faker faker = new Faker();
        return faker.name().username();
    }
}