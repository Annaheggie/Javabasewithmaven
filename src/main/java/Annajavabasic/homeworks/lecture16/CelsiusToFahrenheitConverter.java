package Annajavabasic.homeworks.lecture16;

class CelsiusToFahrenheitConverter extends TemperatureConverter {
    @Override
    public double convertToCelsius(double temperature) {
        return (temperature - 32) / 1.8;
    }

    @Override
    public double convertFromCelsius(double temperature) {
        return temperature * 1.8 + 32;
    }
}
