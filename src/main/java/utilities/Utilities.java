package utilities;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.Context;
import java.io.StringWriter;


public class Utilities {
    public static void logMessage(Context context, String msg) {
        LambdaLogger logger = context.getLogger();
        logger.log("Message: " + msg.toString());
        StringWriter sw = new StringWriter();
        logger.log(sw.toString().replaceAll("\n", "\r"));
    }
}
