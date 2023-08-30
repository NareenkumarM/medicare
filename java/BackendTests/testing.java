package BackendTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testing {

    @Test
    public void testCalculateTotal() {
        BackendClass backend = new BackendClass();
        double total = backend.calculateTotal(10.0, 5.0);

        Assert.assertEquals(total, 15.0, "Total calculation is incorrect");
    }

    @Test
    public void testEdgeCases() {
        BackendClass backend = new BackendClass();

         double result = backend.methodWithEdgeCases(123);

        Assert.assertTrue(result >= 0, "Result should be non-negative");
    }

    
}
