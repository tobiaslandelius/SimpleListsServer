import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * Created by tobias on 6/17/17.
 */
public class AppTest {

    @Test
    public void MainTest() {
        try {
            Main.main(new String[1]);
        } catch (Exception e) {
            fail("Main program threw exception during runtime!");
        }
    }
}
