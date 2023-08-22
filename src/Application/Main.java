package Application;

import CoreInterfaces.AparelhoTelefonico;
import CoreInterfaces.ReprodutorMusical;
import CoreInterfaces.NavegadorNaInternet;
class Main {

    public static void main(String[] args) {
        AparelhoTelefonico telefone1= new Main().new Telefone();
        telefone1.ligar();
        AparelhoTelefonico telefone2 = new Main().new Telefone();
        telefone2.atender();
        AparelhoTelefonico telefone3 = new Main().new Telefone();
        telefone3.iniciarCorreioDeVoz();

        ReprodutorMusical reprodutor1 = new Main().new Reprodutor();
        reprodutor1.tocar();
        ReprodutorMusical reprodutor2 = new Main().new Reprodutor();
        reprodutor2.pausar();
        ReprodutorMusical reprodutor3 = new Main().new Reprodutor();
        reprodutor3.selecionarMusica();

        NavegadorNaInternet internet1 = new Main().new Internet();
        internet1.exibirPagina();
        NavegadorNaInternet internet2 = new Main().new Internet();
        internet2.adicionarNovaAba();
        NavegadorNaInternet internet3 = new Main().new Internet();
        internet3.atualizarPagina();


    }

    class Telefone implements AparelhoTelefonico {
        @Override
        public void ligar() {
            System.out.println("Realizando Ligação...");
        }

        @Override
        public void atender() {
            System.out.println("Ligação Atendida com Sucesso.");
        }

        @Override
        public void iniciarCorreioDeVoz() {
            System.out.println("Iniciando Correio de Voz com Sucesso...");
        }
    }

    class Reprodutor implements ReprodutorMusical {
        @Override
        public void tocar() {
            System.out.println("Tocando Música...");
        }

        @Override
        public void pausar() {
            System.out.println("Música Pausada.");
        }

        @Override
        public void selecionarMusica() {
            System.out.println("Música Selecionada com sucesso.");
        }
    }

    class Internet implements NavegadorNaInternet {

        @Override
        public void exibirPagina() {
            System.out.println("Exibindo Página Web com Sucesso...");

        }

        @Override
        public void adicionarNovaAba() {
            System.out.println("Adicionando Nova Aba...");

        }

        @Override
        public void atualizarPagina() {
            System.out.println("Atualizando Página com Sucesso...");

        }
    }
}
