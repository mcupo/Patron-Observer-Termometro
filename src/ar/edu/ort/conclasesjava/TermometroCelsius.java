package ar.edu.ort.conclasesjava;

import java.util.Observable;
//Clase que representa un ObservadorConcreto
public class TermometroCelsius extends Termometro {

	public TermometroCelsius(Observable sujeto) {
		super(sujeto);
	}

	@Override
	protected double temperaturaConvertida(double kelvins) {
		return kelvins - 273;
	}

    @Override
    public String toString() {
        return String.format("[%s]: %s", "TermometroCelsius", tempActual);
    }
}