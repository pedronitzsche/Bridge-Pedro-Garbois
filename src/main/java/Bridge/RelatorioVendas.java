package Bridge;

public class RelatorioVendas extends Relatorio {

    public String gerar() {
        return this.formato.formatar("Relatorio de vendas");
    }
}