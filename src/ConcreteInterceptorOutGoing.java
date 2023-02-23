import java.util.ArrayList;



/*
    • Interceptor for logging output of system
 */
public class ConcreteInterceptorOutGoing implements InterceptorOutGoing {
    ArrayList<String> statementsLogs = new ArrayList<>();
    ArrayList<String> frequentRenterPointsLogs = new ArrayList<>();

    ArrayList<String> customers = new ArrayList<>();

    private static ConcreteInterceptorOutGoing concreteInterceptor;

    private ConcreteInterceptorOutGoing(){}

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
    public static ConcreteInterceptorOutGoing getInstance(){
        if(concreteInterceptor == null){
            return new ConcreteInterceptorOutGoing();
        }else{
            return concreteInterceptor;
        }
    }
}
