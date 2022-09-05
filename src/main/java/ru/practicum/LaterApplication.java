package ru.practicum;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class LaterApplication {
    //    private static final int PORT = 8080;

    public static void main(String[] args) throws LifecycleException {
        SpringApplication.run(LaterApplication.class, args);
       /*
       Tomcat tomcat = new Tomcat();
        tomcat.getConnector().setPort(PORT);

        // то самое "приложение" или "контекст" с пустым путём
        Context tomcatContext = tomcat.addContext("", null);

        // класс Wrapper позволяет задать дополнительные настройки для сервлета
        Wrapper testServletWrapper =
                Tomcat.addServlet(tomcatContext, "testServlet", new TestServlet());

        // addMapping() сопоставляет URL-путь с сервлетом
        testServletWrapper.addMapping("/test");

        tomcat.start();
        */

        /*
        Tomcat tomcat = new Tomcat();
        tomcat.getConnector().setPort(8080);

        Context tomcatContext = tomcat.addContext("", null);

        AnnotationConfigWebApplicationContext applicationContext =
                new AnnotationConfigWebApplicationContext();
        applicationContext.scan("ru.practicum");
        applicationContext.setServletContext(tomcatContext.getServletContext());
        applicationContext.refresh();

        // добавляем диспетчер запросов
        DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
        Wrapper dispatcherWrapper =
                Tomcat.addServlet(tomcatContext, "dispatcher", dispatcherServlet);
        dispatcherWrapper.addMapping("/");
        dispatcherWrapper.setLoadOnStartup(1);

        tomcat.start();
        */
    }
}