# 🛒 Automated Wildberries Basket Test

![Java](https://img.shields.io/badge/Java-17-red?style=for-the-badge&logo=openjdk)
![Selenide](https://img.shields.io/badge/Selenide-6.19.1-green?style=for-the-badge&logo=selenium)
![JUnit](https://img.shields.io/badge/JUnit-5.10.0-orange?style=for-the-badge&logo=junit5)
![Maven](https://img.shields.io/badge/Maven-3.11.0-blue?style=for-the-badge&logo=apache-maven)

Автоматизированный тест для проверки функциональности добавления товара в корзину на сайте Wildberries с использованием Java 17, Selenide, Maven 

## 🎯 Цель 

Проверка корректности работы функционала добавления товаров в корзину на сайте Wildberries.ru.

## ✨ Что будем использовать:
- **Java 17** - язык программирования
- **Selenide 6.19.1** - фреймворк для автоматизации веб-тестирования (прошу прощения за выбор его вместо, Селениума - очень привык :relaxed:)
- **JUnit 5.10.0** - тестовый фреймворк
- **Maven** - система сборки

## 🚀 Инструкция по запуску

### Предварительные требования:
- Java 17 или выше
- Maven 3.6+
- IntelliJ IDEA (рекомендуется)

### Шаги для запуска:
1. Клонировать репозиторий
2. Открыть проект в IntelliJ IDEA
3. Дождаться загрузки Maven-зависимостей (автоматически)
4. Найти класс теста: `src/test/java/ru/shoptesting/tests/AddToBasketFlowTest.java`
5. Нажать правой кнопкой на метод addToBasketWorkflowTest() → "Run addToBasketWorkflowTest()"

## :exclamation: Важно:
- В повседневной работе я бы вынес методы работы с тектом на странице в отдельные вспомогательные классы
  (например, проверить что текст отображается на странице, что отображается в определенном блоке и т.д.).
А прочее - в другие (например класс с кнопками и работа с ними, поля ввода и работа с ними и т.д.)

- Был очень рад познакомиться и пообщаться! Собеседовние было безумно полезное и интересное! :relaxed:


