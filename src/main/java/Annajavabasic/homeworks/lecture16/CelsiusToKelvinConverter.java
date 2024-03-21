package Annajavabasic.homeworks.lecture16;

class CelsiusToKelvinConverter extends TemperatureConverter {
    @Override
    public double convertToCelsius(double temperature) {
        return temperature - 273.15;
    }

    @Override
    public double convertFromCelsius(double temperature) {
        return temperature + 273.15;
    }
}
