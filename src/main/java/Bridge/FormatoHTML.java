package Bridge;

public class FormatoHTML implements FormatoRelatorio {

    public String formatar(String conteudo) {
        return "HTML: " + conteudo;
    }
}