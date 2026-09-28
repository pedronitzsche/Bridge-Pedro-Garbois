package Bridge;

public class FormatoPDF implements FormatoRelatorio {

    public String formatar(String conteudo) {
        return "PDF: " + conteudo;
    }
}