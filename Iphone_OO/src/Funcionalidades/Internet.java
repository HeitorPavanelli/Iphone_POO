package Funcionalidades;

public class Internet extends Generico{

    public String Nome_Pagina;
    public void setNome_Pagina(String nome_Pagina) {
        Nome_Pagina = nome_Pagina;
    }

    public String getNome_Pagina() {
        return Nome_Pagina;
    }
    
    public void abrirPagina(){
        System.out.println("Abrindo pagina web: " + Nome_Pagina);
    }

    public void abrirNovaPagina(){
        abrirPagina();
    }

    public void fecharPagina(){
        System.out.println("Fechando pagina web");
    }

    public void atualizarPagina(){
        System.out.println("Recarregando a pagina " + Nome_Pagina);
    }


}
