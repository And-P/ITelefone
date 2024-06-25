import com.umbrella.services.*;

public class Main {

    public static void main(String args[]) {

        Reprodudor rep = new ReprodutorMusical();
        Navegador nav = new NavegadorInternet();
        Telefone tel = new AparelhoTelefonico();

        rep.tocar();
        rep.selecionar();
        rep.pausar();

        System.out.println();

        nav.exibirPagina();
        nav.adicionarNovaAba();
        nav.atualizarPagina();

        System.out.println();

        tel.ligar();
        tel.atender();

    }
}
