package Funcionalidades;

import java.util.Scanner;

public class Reprodutor_Musical extends Generico{

    public void tocar(){
        Scanner sc = new Scanner(System.in);
        Generico.ligar();

        System.out.println("Selecione a musica para escutar");
        System.out.println("Tocando: " + selecionarMusica());

        System.out.println("Digite p para pausar ou s para trocar de musica ou digite nada para desligar:");
        String acao = sc.nextLine();

        if(acao.equals("p")){
            pausar();
        }else if(acao.equals("s")){
            System.out.println("Selecione a musica para escutar");
            String musica = selecionarMusica();
            System.out.println("Tocando: " + musica);
        }else{
            Generico.desligar();
        }
    }

    private void pausar(){
        System.out.println("Pausando musica");
    }

    private String selecionarMusica(){
        Scanner sc = new Scanner(System.in);
        String nome_Musica = sc.nextLine();
        return nome_Musica;
    }
}
