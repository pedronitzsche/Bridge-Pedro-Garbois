package Bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioEstoqueTest {

    @Test
    void deveGerarRelatorioEstoqueEmPDF() {
        FormatoRelatorio formato = new FormatoPDF();

        RelatorioEstoque relatorio = new RelatorioEstoque();
        relatorio.setFormato(formato);

        assertEquals(
            "PDF: Relatorio de estoque",
            relatorio.gerar()
        );
    }
    @Test
void deveGerarRelatorioEstoqueEmCSV() {
    FormatoRelatorio formato = new FormatoCSV();

    RelatorioEstoque relatorio = new RelatorioEstoque();
    relatorio.setFormato(formato);

    assertEquals(
        "CSV: Relatorio de estoque",
        relatorio.gerar()
    );
}
@Test
void deveGerarRelatorioEstoqueEmHTML() {
    FormatoRelatorio formato = new FormatoHTML();

    RelatorioEstoque relatorio = new RelatorioEstoque();
    relatorio.setFormato(formato);

    assertEquals(
        "HTML: Relatorio de estoque",
        relatorio.gerar()
    );
}
}