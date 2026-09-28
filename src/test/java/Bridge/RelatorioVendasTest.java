package Bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioVendasTest {

    @Test
    void deveGerarRelatorioVendasEmPDF() {
        FormatoRelatorio formato = new FormatoPDF();

        RelatorioVendas relatorio = new RelatorioVendas();
        relatorio.setFormato(formato);

        assertEquals(
            "PDF: Relatorio de vendas",
            relatorio.gerar()
        );
    }
    @Test
void deveGerarRelatorioVendasEmCSV() {
    FormatoRelatorio formato = new FormatoCSV();

    RelatorioVendas relatorio = new RelatorioVendas();
    relatorio.setFormato(formato);

    assertEquals(
        "CSV: Relatorio de vendas",
        relatorio.gerar()
    );
}
@Test
void deveGerarRelatorioVendasEmHTML() {
    FormatoRelatorio formato = new FormatoHTML();

    RelatorioVendas relatorio = new RelatorioVendas();
    relatorio.setFormato(formato);

    assertEquals(
        "HTML: Relatorio de vendas",
        relatorio.gerar()
    );
}
}