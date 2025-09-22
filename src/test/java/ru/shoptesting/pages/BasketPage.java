package ru.shoptesting.pages;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class BasketPage {

    private static final SelenideElement basketTitle = $x("//h1[contains(text(), 'Корзина') or contains(@class, 'basket-title')]");
    private static SelenideElement textOnPage(String text) {
        return $x("//span[text()='" + text + "']");}

    public static void checkItemIsDisplayed(String text) {
        textOnPage(text).shouldBe(visible);
    }

    public static void checkBasket() {
        basketTitle.shouldBe(visible);
        basketTitle.shouldHave(text("Корзина"));
    }

    public static void checkItemInBasket(String productName) {
        basketTitle.shouldBe(visible);
        checkItemIsDisplayed(productName);
    }
}
