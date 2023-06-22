package web.config;

/**
 * Клонируйте заготовку проекта по ссылке:
 * https://github.com/KataAcademy/PP_2_2_2_spring-mvc
 * В разработке используйте сервер Tomcat

 * 1. Создайте еще один контроллер, замаппленный на /cars.
 * 2. Создайте модель Car с тремя произвольными полями.
 * 3. Создайте список из 5 машин.
 * 4. Создайте сервис с методом, который будет возвращать указанное число машин из созданного списка.
 * 5. Создайте страницу cars.html. Реализуйте создание таблицы с машинами из сервиса с помощью thymeleaf.
 * 6. При запросе /cars выводить весь список. При запросе /cars?count=2 должен отобразиться список из 2 машин,
 * при /cars?count=3 - из 3, и тд. При count ≥ 5 выводить весь список машин.
 */

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    // Метод, указывающий на класс конфигурации
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }


    // Добавление конфигурации, в которой инициализируем ViewResolver, для корректного отображения jsp.
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                WebConfig.class
        };
    }


    /* Данный метод указывает url, на котором будет базироваться приложение */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}