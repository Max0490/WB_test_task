# 🛒 Automated Wildberries Cart Test

![Java](https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=openjdk&logoColor=white)
![Selenide](https://img.shields.io/badge/Selenide-6.19.1-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-8.5-02303A?style=for-the-badge&logo=gradle&logoColor=white)
![Chrome](https://img.shields.io/badge/Chrome-Latest-4285F4?style=for-the-badge&logo=googlechrome&logoColor=white)

Автоматизированный тест для проверки функциональности добавления товара в корзину на сайте Wildberries с использованием Java 17, Selenide и Gradle.

## 🎯 Цель проекта

Проверка корректности работы функционала добавления товаров в корзину на сайте Wildberries.ru.

## ✨ Что будем использовать и почему:
- **🔄 Page Object Model** - мой любимый шаблон проектирования в автоматизации.
- **🚀 Selenide** - предпочитаю его Селениуму из-за более простого и читаемого синтаксиса).
- **⚡ Gradle** - наша система сборки, предпочитаю его Мавену во многом тоже из-за удобочитаемости синтаксиса.
- **🧪 JUnit 5** - Фреймворк для модульного тестирования.

## 📋 Тест-кейс

### Шаги выполнения:
1. **Открытие карточки товара** - Переход на страницу товара Wildberries
2. **Проверка открытия страницы** - Верификация элементов страницы товара
3. **Добавление в корзину** - Клик по кнопке "Добавить в корзину"
4. **Проверка добавления** - Подтверждение успешного добавления товара
5. **Переход в корзину** - Клик по кнопке "Перейти в корзину"
6. **Проверка корзины** - Верификация наличия товара в корзине
