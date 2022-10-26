package fidexio.step_definition;

import fidexio.utilities.Driver;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void teardownScenario(){
        Driver.closeDriver();
    }
}
