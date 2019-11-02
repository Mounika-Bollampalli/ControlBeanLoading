package ControllBeansLoading;

public class EventPublisherBean {

    private void initialize()
    {
        System.out.println("EventPublisherBean initializing");
        EventManager.getInstance().Publish("Mounika");
    }
}
