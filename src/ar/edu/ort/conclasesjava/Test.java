package ar.edu.ort.conclasesjava;

public class Test {

	public static void main(String[] args) {
        // Creo el sensor de la temperatura y los term�metros
        System.out.println("Creo el objeto que 'sensa' la temperatura");
        Temperatura temperatura = new Temperatura();
        System.out.println("Creo los term�metros, uno de cada tipo");
        TermometroKelvin tk = new TermometroKelvin(temperatura);
        TermometroFahrenheit tf = new TermometroFahrenheit(temperatura);
        TermometroCelsius tc = new TermometroCelsius(temperatura);
        System.out.println("Cambio la temperatura a 150 K");
        temperatura.setValor(150);
        // desuscribo el term�metro Kelvin
        System.out.println("desuscribo el term�metro Kelvin");
        tk.desuscribir();
        System.out.println("Cambio la temperatura a 200 K");
        temperatura.setValor(200);
        // desuscribo el term�metro Fahrenheit solo quedar� "escuchando" el Celsius
        System.out.println("desuscribo el term�metro Fahrenheit");
        tf.desuscribir();
        System.out.println("Cambio la temperatura a 300 K");
        temperatura.setValor(300);
        // desuscribo el �ltimo que quedaba
        System.out.println("desuscribo el term�metro Celsius");
        tc.desuscribir();
        // nadie informar� este �ltimo cambio de valor
        System.out.println("Cambio la temperatura a 0 K");
        temperatura.setValor(0);
    }
}