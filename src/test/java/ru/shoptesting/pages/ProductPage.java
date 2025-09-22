package ru.shoptesting.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

public class ProductPage {

    private static final SelenideElement productTitle = $x("//div[@class='productHeader--Xgebr']");
    private static final SelenideElement addToBasketButton = $x("//button[.//span[text()='Добавить в корзину']]");
    private static final SelenideElement basketIcon = $x("//span[text()='Перейти в корзину']");


    public static void checkPageIsDisplayed() {
        productTitle.shouldBe(visible);
        addToBasketButton.shouldBe(visible);
    }

    public static void addProductToBasket() {
        addToBasketButton.click();
    }

    public static void checkProductAdded() {
        basketIcon.shouldBe(visible);
    }

    public static void goToBasket() {
        basketIcon.click();
    }
}
