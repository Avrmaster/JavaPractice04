package com.leskivprod;

import com.leskivprod.annotations.IPerformer;
import com.leskivprod.xml.Magician;
import com.leskivprod.xml.Thinker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        new Application();
    }

    private Application() {
        annotations();
        xml();
    }

    private void annotations() {
        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
        annotationContext.register(AppConfig.class);
        annotationContext.refresh();

        IPerformer normPerformer = (IPerformer) annotationContext.getBean("normPerformer");
        IPerformer neNormPerformer = (IPerformer) annotationContext.getBean("neNormPerformer");
        try {
            normPerformer.perform();
            neNormPerformer.perform();
        } catch (Exception ignored) {
        }
    }

    private void xml() {
        ApplicationContext xmlContext = new ClassPathXmlApplicationContext("SpringBeans.xml");
        Thinker volunteer = (Thinker) xmlContext.getBean("volunteer");
        Magician magician = (Magician) xmlContext.getBean("magician");
        volunteer.thinkOfSomething("Volunteer is THINKING ...");
        try {
            magician.getThoughts();
        } catch (Exception ignored) {
        }
    }
}
