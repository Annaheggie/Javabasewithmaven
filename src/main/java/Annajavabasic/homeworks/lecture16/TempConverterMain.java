package Annajavabasic.homeworks.lecture16;


public class TempConverterMain {
    public static void main(String[] args) {
        CelsiusToFahrenheitConverter celsiusToFahrenheitConverter = new CelsiusToFahrenheitConverter();
        CelsiusToKelvinConverter celsiusToKelvinConverter = new CelsiusToKelvinConverter();

        double celsiusTemperature = 25.0;

        // Celsius to Fahrenheit
        double fahrenheitTemperature = celsiusToFahrenheitConverter.convertFromCelsius(celsiusTemperature);
        System.out.println(celsiusTemperature + "°C is equal to " + fahrenheitTemperature + "°F");

        // Celsius to Kelvin
        double kelvinTemperature = celsiusToKelvinConverter.convertFromCelsius(celsiusTemperature);
        System.out.println(celsiusTemperature + "°C is equal to " + kelvinTemperature + "K");
    }
}

