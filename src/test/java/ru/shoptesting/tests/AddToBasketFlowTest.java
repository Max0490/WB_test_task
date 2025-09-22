package ru.shoptesting.tests;

import org.junit.jupiter.api.Test;
import ru.shoptesting.core.BaseTest;
import ru.shoptesting.pages.BasketPage;
import ru.shoptesting.pages.ProductPage;

import static com.codeborne.selenide.Selenide.open;

public class AddToBasketFlowTest extends BaseTest {

    private final String URL = "https://www.wildberries.ru/catalog/264220770/detail.aspx";

    @Test
    public void addToBasketWorkflowTest() {
        // Открываем страницу товара и проверяем загрузку
        open(URL);
        ProductPage.checkPageIsDisplayed();

        // Добавляем товар в корзину и проверяем успешность
        ProductPage.addProductToBasket();
        ProductPage.checkProductAdded();

        // Переходим в корзину
        ProductPage.goToBasket();
        BasketPage.checkBasket();

        // Проверяем наличие товара в корзине
        BasketPage.checkItemInBasket("Щелкунчик по балету Чайковского. Книги для детей");
    }
}


