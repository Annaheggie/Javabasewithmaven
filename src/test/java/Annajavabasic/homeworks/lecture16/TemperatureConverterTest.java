package Annajavabasic.homeworks.lecture16;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConverterTest {

    @Test
    public void testCelsiusToFahrenheitConversion() {
        CelsiusToFahrenheitConverter converter = new CelsiusToFahrenheitConverter();
        assertEquals(50.0, converter.convertFromCelsius(10.0));
    }

    @Test
    public void testCelsiusToKelvinConversion() {
        CelsiusToKelvinConverter converter = new CelsiusToKelvinConverter();
        assertEquals(283.15, converter.convertFromCelsius(10.0));
    }
}
