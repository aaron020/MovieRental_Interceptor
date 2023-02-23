import java.util.ArrayList;



/*
    • Interceptor for logging output of system
 */
public class ConcreteInterceptor implements Interceptor{
    ArrayList<String> statementsLogs = new ArrayList<>();
    ArrayList<String> frequentRenterPointsLogs = new ArrayList<>();

    private static ConcreteInterceptor concreteInterceptor;

    private ConcreteInterceptor(){}

    @Override
    public void interceptStatement(Context context) {
        String moviesRentedString = context.getStatement();
        System.out.println("The following statment has been logged: \n" + moviesRentedString);
        //add to logs
        statementsLogs.add(moviesRentedString);
    }

    @Override
    public void interceptFrequentRenterPoints(Context context) {
        String FrequentRenterPoints = "Customer : " + context.getName() + "\n" +
                "Frequent Renter Points: "+context.getTotalFrequentRenterPoints();
        System.out.println("The following info has been logged: \n" + FrequentRenterPoints);
        //add to logs
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
