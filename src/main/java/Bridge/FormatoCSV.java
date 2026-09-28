package Bridge;

public class FormatoCSV implements FormatoRelatorio {

    public String formatar(String conteudo) {
        return "CSV: " + conteudo;
    }
}