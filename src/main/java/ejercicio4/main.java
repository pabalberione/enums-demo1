package ejercicio4;

public class main {

    public static void main(String[] args) {
        WeatherReport weatherReport1 = new WeatherReport(1, "Buenos Aires", WeatherCondition.CLOUDY);
        WeatherReport weatherReport2 = new WeatherReport(2, "Santa Fe", WeatherCondition.SUNNY);
        WeatherReport weatherReport3 = new WeatherReport(3, "Cordoba", WeatherCondition.RAINY);
        WeatherReport weatherReport4 = new WeatherReport(4, "Mendoza", WeatherCondition.STORMY);

        System.out.println("Ubicación: " + weatherReport1.getLocation() + ", Condición: " + weatherReport1.getWeatherCondition());
        System.out.println("Ubicación: " + weatherReport2.getLocation() + ", Condición: " + weatherReport2.getWeatherCondition());
        System.out.println("Ubicación: " + weatherReport3.getLocation() + ", Condición: " + weatherReport3.getWeatherCondition());
        System.out.println("Ubicación: " + weatherReport4.getLocation() + ", Condición: " + weatherReport4.getWeatherCondition());

    }


}
