package javaExcecoes;

public class TesteSaca {

    public static void main(String[] args) {

        Conta conta = new ContaCorrente(42,24);
        conta.deposita(100);

        try{
            conta.saca(101);
        } catch (SaldoInsuficienteException ex){
            System.out.println("Ex: " + ex.getMessage());
        }
        System.out.println(conta.getSaldo());
    }
}
