import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Customer Test")
public class CustomerTest {

    @org.junit.Test
    @Disabled("disabled") //shouldn't work
    public void prelTest() {
        assertTrue(true);
    }

    /**
     * When multiple customers are created, the static int id is incremented properly
     */

    /**
     * A wish list can be retrieved
     */
}
