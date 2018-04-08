package ar.edu.ort.sinclasesjava;

//Clase que representa un tipo de ObservadorConcreto
public abstract class Termometro implements Observer {

    private 	Temperatura sujeto;
    protected 	double tempActual;

    public Termometro(Observable sujeto) {
        this.sujeto = (Temperatura) sujeto;
        sujeto.add(this);
        update();// si fuese necesario, actualizo la primera "vista" del valor.
    }
    
    // servirá para calcular la temperatura en el sistema que corresponda.
    protected abstract double temperaturaConvertida(double kelvins);

    @Override
    public void update() {
        tempActual = temperaturaConvertida(sujeto.getValor());
        show();// actualizamos la "vista"
    }

    private void show() {
        System.out.println(this);
    }

    public void desuscribir() {
        sujeto.delete(this);
    }
}