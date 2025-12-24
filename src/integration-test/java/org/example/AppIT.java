package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppIT {

    @Test
    void fullCalculationFlow() {
        App app = new App();

        int sum = app.add(10, 5);
        int product = app.multiply(sum, 2);
        int result = app.subtract(product, 10);

        assertEquals(20, result);
    }

    @Test
    void divideIntegrationTest() {
        App app = new App();
        assertEquals(4, app.divide(8, 2));
    }
}
