package ru.shoptesting.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ProductPage {

    private final SelenideElement productTitle = $x("//h1[contains(@class, 'product-page__title')]");
    private final SelenideElement addToCartButton = $x("//button[contains(@class, 'btn-main') and contains(text(), 'Добавить в корзину')]");
    private final SelenideElement cartIcon = $x("//a[contains(@href, '/lk/basket')] | //div[contains(@class, 'navbar-pc__icon--basket')]");
    private final SelenideElement cartItemsCount = $x("//span[contains(@class, 'navbar-pc__notify')] | //span[contains(@class, 'badge')]");

    public void verifyPageIsDisplayed() {
        productTitle.shouldBe(visible).shouldNotBe(empty);
        addToCartButton.shouldBe(visible).shouldBe(enabled);
    }

    public void addProductToCart() {
        addToCartButton.click();
    }

    public void verifyProductAdded() {
        cartItemsCount.shouldBe(visible);
        cartIcon.shouldBe(visible);
    }

    public void navigateToCart() {
        cartIcon.click();
    }
}
