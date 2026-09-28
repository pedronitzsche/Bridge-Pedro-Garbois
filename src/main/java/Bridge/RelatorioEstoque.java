package Bridge;

public class RelatorioEstoque extends Relatorio {

    public String gerar() {
        return this.formato.formatar("Relatorio de estoque");
    }
}