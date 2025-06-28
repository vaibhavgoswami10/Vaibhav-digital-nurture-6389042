import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String username = "john_doe";
        int userId = 101;

        logger.info("User {} with ID {} has logged in.", username, userId);

        int itemCount = 5;
        double pricePerItem = 19.99;
        double total = itemCount * pricePerItem;

        logger.debug("Calculating total for {} items at ${} each. Total: ${}", itemCount, pricePerItem, total);

        String errorDetail = "File not found";
        logger.error("An error occurred while accessing the file: {}", errorDetail);
    }
}
