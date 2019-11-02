package ControllBeansLoading;
//event listner classgoit
public class EvenListenerBean {
    private void initialize()
    {
        System.out.println("EvenListenerBean initializing");
        EventManager.getInstance().addListener(s-> System.out.println("event received in EventListenerBean : " + s));
    }
}
