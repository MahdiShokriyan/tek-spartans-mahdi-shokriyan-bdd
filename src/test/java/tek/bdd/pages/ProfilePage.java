package tek.bdd.pages;

import org.openqa.selenium.By;

public class ProfilePage {
    static String visibleTextOfField;
    public static final By ALL_FIELDS = By.xpath("//label[text()= " +
            "'"+visibleTextOfField+"']/following-sibling::input");

    public static final By PROFILE_TITLE = By.className("account__personal-title");
}
