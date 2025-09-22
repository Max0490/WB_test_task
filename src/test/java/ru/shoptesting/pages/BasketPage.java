package ru.shoptesting.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class BasketPage {

    private final SelenideElement basketTitle = $x("//h1[contains(text(), 'Корзина') or contains(@class, 'basket-title')]");
    private final SelenideElement basketItem = $x("//div[contains(@class, 'basket-item') or contains(@class, 'cart-item')]");
    private final SelenideElement itemName = $x("//span[contains(@class, 'good-info__title')] | //div[contains(@class, 'item-name')]");

    public void verifyBasketOpened() {
        basketTitle.shouldBe(visible);
        basketTitle.shouldHave(text("Корзина"));
    }

    public void verifyItem() {
        basketItem.shouldBe(visible);
        itemName.shouldBe(visible);
    }
}
