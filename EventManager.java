package ControllBeansLoading;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class EventManager {

    private final List<Consumer<String>> listeners= new ArrayList();
    private EventManager(){ }
    private static class SigletonHolder
    {
        private static final EventManager Instance=new EventManager();
    }
    public  static EventManager getInstance()
    {
        return SigletonHolder.Instance;
    }
    public void addListener(Consumer<String> eventConsumer)
    {
        listeners.add(eventConsumer);
    }
    public void Publish(final String message)
    {
        listeners.forEach(l->l.accept(message));
    }

}
