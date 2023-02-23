import java.util.ArrayList;

public class ConcreteInterceptorInComing implements InterceptorInComing{
    ArrayList<String> customers = new ArrayList<>();
    private static ConcreteInterceptorInComing concreteInterceptor;

    @Override
    public void interceptCustomer(Context context){
        if(customers.contains(context.getName())){
            System.out.println("Customer is in the system");
        }else{
            System.out.println("New customer " + context.getName() + " has been logged");
            customers.add(context.getName());
        }
    }

    public ArrayList<java.lang.String> getCustomers(){
        return customers;
    }


    //Singleton
    public static ConcreteInterceptorInComing getInstance(){
        if(concreteInterceptor == null){
            return new ConcreteInterceptorInComing();
        }else{
            return concreteInterceptor;
        }
    }
}
