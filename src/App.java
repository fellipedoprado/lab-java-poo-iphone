import com.dio.iphone.classes.iPhone;

public class App {
    public static void main(String[] args) throws Exception {
        iPhone meuIphone = new iPhone();

        meuIphone.selecionarMusica("We Will Rock You - Queen");
        meuIphone.tocar();
        meuIphone.pausar();

        meuIphone.ligar("11999999999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}

