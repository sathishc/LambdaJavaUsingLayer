package ecomjavaexample;

import com.amazonaws.services.lambda.runtime.Context;
import static utilities.Utilities.logMessage;


public class LambdaExample {
    public String handleRequest(int myCount, Context context){
        
        logMessage(context, "received " + myCount);
        return String.valueOf(myCount);
    }
}
