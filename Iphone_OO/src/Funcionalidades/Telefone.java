package Funcionalidades;

public class Telefone{
    
    public String celular;

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCelular() {
        return celular;
    }

    public void ligacoes(){
        System.out.println("Ligando para: " + celular);
    }


}
