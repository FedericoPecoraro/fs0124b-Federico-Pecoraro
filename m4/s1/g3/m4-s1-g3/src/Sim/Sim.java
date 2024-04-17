package Sim;

public class Sim {
    private int numero;
    private int credito;
    private Calls[] last5call;

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
    public int getCredito() {
        return credito;
    }

    public Calls[] getLast5call() {
        return last5call;
    }
    public void setLast5call(Calls[] last5call) {
        this.last5call = last5call;
    }
}
