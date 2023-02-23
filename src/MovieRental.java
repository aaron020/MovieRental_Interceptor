

public class MovieRental {

    public void loadStatement(Context context, DispatcherOutGoing dispatcherOutGoing){
        InterceptorOutGoing moviesRented = ConcreteInterceptorOutGoing.getInstance();

        dispatcherOutGoing.register(moviesRented);
        dispatcherOutGoing.interceptStatement(context);
    }

    public void loadFrequentRenterPoints(Context context, DispatcherOutGoing dispatcherOutGoing){
        InterceptorOutGoing moviesRented = ConcreteInterceptorOutGoing.getInstance();

        dispatcherOutGoing.register(moviesRented);
        dispatcherOutGoing.interceptFrequentRenterPoints(context);
    }

    public void loadCustomer(Context context, DispatcherInComing dispatcherInComing){
        InterceptorInComing moviesRented = ConcreteInterceptorInComing.getInstance();

        dispatcherInComing.register(moviesRented);
        dispatcherInComing.interceptCustomer(context);
    }



}
