package Usuario;

import java.util.Scanner;

import Funcionalidades.Generico;
import Funcionalidades.Internet;
import Funcionalidades.Reprodutor_Musical;
import Funcionalidades.Telefone;

public class Iphone extends Generico{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.err.println("Bem vindo ao celular, escolha a função a se executar:");
        System.err.println("Digite 1 para acessar internet");
        System.err.println("Digite 2 para acessar ligacao");
        System.err.println("Digite 3 para acessar musica");
        int escolha = sc.nextInt();
        if(escolha == 1){
            Testando_Internet();
        }else if(escolha == 2){
            Testando_Ligacao();
        }else{
            Testando_Musica();
        }
    }

    private static void Testando_Internet(){
        Scanner sc = new Scanner(System.in);
        Internet internet = new Internet();

        Generico.ligar();
        System.out.println("Bem vindo, qual site deseja acessar?");
        String site = sc.nextLine();
        internet.setNome_Pagina(site);
        internet.abrirPagina();

        System.out.println("Deseja abrir outra pagina web?");
        String nova_Pagina = sc.nextLine();
        if(nova_Pagina.equals("sim")){
            System.out.println("Nome da pagina:");
            String nova_Pagina_Nome = sc.nextLine();
            internet.setNome_Pagina(nova_Pagina_Nome);
            internet.abrirNovaPagina();
        }

        System.out.println("Fechar pagina web?");
        String close = sc.nextLine();
        if(close.equals("sim")){
            internet.fecharPagina();
        }
        Generico.desligar();
    }

    private static void Testando_Ligacao(){
        Scanner sc = new Scanner(System.in);
        Telefone tel = new Telefone();
        System.out.println("Digite o celular para ligar");
        String cell = sc.nextLine();
        Generico.ligar();
        tel.setCelular(cell);

        tel.ligacoes();

        System.out.println("Digite n para desligar");
        String desligar = sc.nextLine();
        if(desligar.equals("n")){
            Generico.desligar();
        }
    }

    private static void Testando_Musica(){
        Reprodutor_Musical rep = new Reprodutor_Musical();
        rep.tocar();
    }
}
