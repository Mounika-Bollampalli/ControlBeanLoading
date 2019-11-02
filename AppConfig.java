package ControllBeansLoading;


import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "ControllBeansLoading")
public class AppConfig {
    @Bean(initMethod = "initialize")
    //@DependsOn("eventListener")
    public EventPublisherBean eventPublisherBean()
    {
        return new EventPublisherBean();
    }
    @Bean(name ="eventListener" , initMethod = "initialize")
    @Lazy
    public EvenListenerBean evenListenerBean()
    {
        return new EvenListenerBean();
    }

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(AppConfig.class);
    }
}

