import java.util.ArrayList;
import java.util.List;
/*
    • Allows applications to register and remove concrete
    interceptors.
    • Dispatches registered concrete interceptor callbacks when
    events occur.
 */
public class Dispatcher {
    List<Interceptor> interceptors = new ArrayList<>();

    private static Dispatcher dispatcher;

    //Singleton
    public static Dispatcher getInstance(){
        if(dispatcher == null){
            return new Dispatcher();
        }else{
            return dispatcher;
        }
    }

    private Dispatcher(){}

    //Dispatch
    public void interceptStatement(Context context){
        Interceptor interceptor = interceptors.get(interceptors.size()-1);
        //Call back to the concrete interceptor
        interceptor.interceptStatement(context);
    }

    //Dispatch
    public void interceptFrequentRenterPoints(Context context){
        Interceptor interceptor = interceptors.get(interceptors.size()-1);
        //Call back to the concrete interceptor
        interceptor.interceptFrequentRenterPoints(context);
    }

    public void register(Interceptor interceptor){
        interceptors.add(interceptor);
    }

    public void remove(Interceptor interceptor){
        interceptors.remove(interceptor);
    }


}
