package javaOrientacaoAObjetosPolimorfismoFuncionario;

//contrato Autenticavel
//quem assina esse contrato, precisa implementar
//metodo setSenha
//metodo autentica
//interface eh abstrata e oublica e seus metodos tbm, fica em cinza "abstract" e "public"

public abstract interface Autenticavel {

//    public abstract  void setSenha(int senha);
//
//    public abstract boolean autentica(int senha);

    public abstract void setSenha(int senha) ;

    public abstract boolean autentica(int senha) ;
}

