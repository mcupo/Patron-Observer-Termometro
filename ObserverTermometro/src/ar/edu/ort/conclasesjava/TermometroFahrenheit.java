package ar.edu.ort.conclasesjava;

import java.util.Observable;
//Clase que representa un ObservadorConcreto
public class TermometroFahrenheit extends Termometro {

    public TermometroFahrenheit(Observable sujeto) {
        super(sujeto);
    }

    @Override
    protected double temperaturaConvertida(double kelvins) {
        return (kelvins - 273) * 1.8 + 32;
    }
    
    @Override
    public String toString() {
        return String.format("[%s]: %s", "TermometroFahrenheit", tempActual);
    }
}