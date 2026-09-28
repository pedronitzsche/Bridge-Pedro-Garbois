package Bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioFinanceiroTest {

    @Test
    void deveGerarRelatorioFinanceiroEmPDF() {
        FormatoRelatorio formato = new FormatoPDF();

        RelatorioFinanceiro relatorio = new RelatorioFinanceiro();
        relatorio.setFormato(formato);

        assertEquals(
            "PDF: Relatorio financeiro",
            relatorio.gerar()
        );
    }
    @Test
void deveGerarRelatorioFinanceiroEmCSV() {
    FormatoRelatorio formato = new FormatoCSV();

    RelatorioFinanceiro relatorio = new RelatorioFinanceiro();
    relatorio.setFormato(formato);

    assertEquals(
        "CSV: Relatorio financeiro",
        relatorio.gerar()
    );
}
@Test
void deveGerarRelatorioFinanceiroEmHTML() {
    FormatoRelatorio formato = new FormatoHTML();

    RelatorioFinanceiro relatorio = new RelatorioFinanceiro();
    relatorio.setFormato(formato);

    assertEquals(
        "HTML: Relatorio financeiro",
        relatorio.gerar()
    );
}
}