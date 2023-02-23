import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Test {

    @org.junit.jupiter.api.Test
    public void testDispatcherRegister(){
        DispatcherOutGoing dispatcher = DispatcherOutGoing.getInstance();

        ConcreteInterceptorOutGoing concreteInterceptorOutGoing = ConcreteInterceptorOutGoing.getInstance();
        ConcreteInterceptorOutGoing concreteInterceptorOutGoing1 = ConcreteInterceptorOutGoing.getInstance();
        dispatcher.register(concreteInterceptorOutGoing);
        dispatcher.register(concreteInterceptorOutGoing1);

        assertEquals(2,dispatcher.dispatcherSize());

        dispatcher.remove(concreteInterceptorOutGoing);

        assertEquals(1,dispatcher.dispatcherSize());
    }

}