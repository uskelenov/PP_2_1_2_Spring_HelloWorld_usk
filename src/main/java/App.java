import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanCat1 = (Cat) applicationContext.getBean("mrmr");
        Cat beanCat2 = (Cat) applicationContext.getBean("mrmr");

        System.out.println(bean1.equals(bean2));
        System.out.println(beanCat1.equals(beanCat2));
    }
}