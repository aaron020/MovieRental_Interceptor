import java.util.ArrayList;



/*
    • Implements a specific out-of-band service.
    • Uses context object to control the concrete framework.
 */
public class ConcreteInterceptor implements Interceptor{
    ArrayList<String> statementsLogs = new ArrayList<>();
    ArrayList<String> frequentRenterPointsLogs = new ArrayList<>();

    private static ConcreteInterceptor concreteInterceptor;

    private ConcreteInterceptor(){}

    @Override
    public void interceptStatement(Context context) {
        String moviesRentedString = context.getCustomer().statement();
        System.out.println("The following statment has been logged: \n" + moviesRentedString);
        statementsLogs.add(moviesRentedString);
    }

    @Override
    public void interceptFrequentRenterPoints(Context context) {
        String FrequentRenterPoints = "Customer : " + context.getCustomer().getName() + "\n" +
                "Frequent Renter Points: "+context.getCustomer().getTotalFrequentRenterPoints();
        System.out.println("The following info has been logged: \n" + FrequentRenterPoints);
        frequentRenterPointsLogs.add(FrequentRenterPoints);
    }


    //Singleton
    public static ConcreteInterceptor getInstance(){
        if(concreteInterceptor == null){
            return new ConcreteInterceptor();
        }else{
            return concreteInterceptor;
        }
    }
}
