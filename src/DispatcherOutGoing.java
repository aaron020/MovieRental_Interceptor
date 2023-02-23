import java.util.ArrayList;
import java.util.List;
/*
    • Allows applications to register and remove concrete
    interceptors.
    • Dispatches registered concrete interceptor callbacks when
    events occur.
 */
public class DispatcherOutGoing {
    List<InterceptorOutGoing> interceptorOutGoings = new ArrayList<>();

    private static DispatcherOutGoing dispatcherOutGoing;

    //Singleton
    public static DispatcherOutGoing getInstance(){
        if(dispatcherOutGoing == null){
            return new DispatcherOutGoing();
        }else{
            return dispatcherOutGoing;
        }
    }

    private DispatcherOutGoing(){}

    //Dispatch
    public void interceptStatement(Context context){
        InterceptorOutGoing interceptorOutGoing = interceptorOutGoings.get(interceptorOutGoings.size()-1);
        //Call back to the concrete interceptor
        interceptorOutGoing.interceptStatement(context);
    }

    //Dispatch
    public void interceptFrequentRenterPoints(Context context){
        InterceptorOutGoing interceptorOutGoing = interceptorOutGoings.get(interceptorOutGoings.size()-1);
        //Call back to the concrete interceptor
        interceptorOutGoing.interceptFrequentRenterPoints(context);
    }



    public void register(InterceptorOutGoing interceptorOutGoing){
        interceptorOutGoings.add(interceptorOutGoing);
    }

    public void remove(InterceptorOutGoing interceptorOutGoing){
        interceptorOutGoings.remove(interceptorOutGoing);
    }


    //For testing
    public int dispatcherSize(){
        return interceptorOutGoings.size();
    }

}
