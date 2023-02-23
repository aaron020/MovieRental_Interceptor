import java.util.ArrayList;
import java.util.List;

public class DispatcherInComing {
    List<InterceptorInComing> interceptorInComings = new ArrayList<>();

    private static DispatcherInComing dispatcherInComing;

    //Singleton
    public static DispatcherInComing getInstance(){
        if(dispatcherInComing == null){
            return new DispatcherInComing();
        }else{
            return dispatcherInComing;
        }
    }


    public void interceptCustomer(Context context){
        InterceptorInComing interceptorInComing = interceptorInComings.get(interceptorInComings.size()-1);
        interceptorInComing.interceptCustomer(context);
    }

    public void register(InterceptorInComing interceptor){
        interceptorInComings.add(interceptor);
    }

    public void remove(InterceptorInComing interceptor){
        interceptorInComings.remove(interceptor);
    }

}
