package Bridge;

public class RelatorioFinanceiro extends Relatorio {

    public String gerar() {
        return this.formato.formatar("Relatorio financeiro");
    }
}
