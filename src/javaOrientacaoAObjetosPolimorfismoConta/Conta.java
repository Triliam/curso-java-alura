package javaOrientacaoAObjetosPolimorfismoConta;

public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public Conta(int agencia, int numero){ //Parametros no construtor - faz a Conta nascer com os parametros definidos
        this.agencia = agencia;
        this.numero = numero;
    }

    public abstract void deposita(double valor);

    public boolean saca (double valor){
        if (saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        } else{
        return false;
        }
    }

    public boolean tranfere (double valor, Conta destino){
        if (this.saca(valor)){
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo (){
        return this.saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <=0){
            System.out.println("Nao pode valor menor ou igual a 0");
            return;
        }
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
