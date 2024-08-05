package tek.bdd.utility;

public class RandomEmailGenerator {
    public String RandomEmailGenerator(String name) {

        int randomNumber = (int) (Math.random() * 10000);
        return name + randomNumber + "@gmail.com";
    }
}
