package ar.edu.ort.sinclasesjava;

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