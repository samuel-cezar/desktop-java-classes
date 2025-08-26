/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sam
 */
public class TestaAluno {

    // Método para teste pontual individual
    public void testePontual(double n1, double n2, double n3, double n4,
            double mediaEsperada, String situacaoEsperada) {
        Aluno aluno = new Aluno();
        aluno.carregaNotas(n1, n2, n3, n4);

        double media = aluno.calculaMedia();
        String situacao = aluno.verificaSituacao();

        // Verificação da média (com tolerância para números decimais)
        if (Math.abs(media - mediaEsperada) > 0.01) {
            System.out.println("ERRO: Media incorreta para notas "
                    + n1 + ", " + n2 + ", " + n3 + ", " + n4
                    + ". Esperado: " + mediaEsperada
                    + ", Obtido: " + media);
        }

        // Verificação da situação
        if (!situacao.equals(situacaoEsperada)) {
            System.out.println("ERRO: Situacao incorreta para media " + media
                    + ". Esperado: " + situacaoEsperada
                    + ", Obtido: " + situacao);
        }
    }

    // Método que testa todos os casos
    public void testaTudo() {
        System.out.println("=== INICIANDO TESTES ===");

        // Testes baseados nos exemplos da atividade
        testePontual(8.7, 7.2, 9.3, 7.4, 8.15, "aprovado");
        testePontual(5.2, 3.4, 6.5, 2.1, 4.3, "recuperacao");
        testePontual(3.4, 5.1, 1.1, 2.0, 2.9, "reprovado");

        // Testes adicionais
        testePontual(7.0, 7.0, 7.0, 7.0, 7.0, "aprovado");  // Limite aprovação
        testePontual(4.0, 4.0, 4.0, 4.0, 4.0, "recuperacao"); // Limite recuperacao
        testePontual(3.9, 3.9, 3.9, 3.9, 3.9, "reprovado");   // Limite reprovação
        testePontual(10.0, 9.0, 8.0, 9.5, 9.125, "aprovado"); // Notas altas
        testePontual(0.0, 1.0, 2.0, 1.0, 1.0, "reprovado");   // Notas baixas

        System.out.println("=== TESTES CONCLUIDOS ===");
    }

    // Método main para executar os testes
    public static void main(String[] args) {
        TestaAluno teste = new TestaAluno();
        teste.testaTudo();
    }
}
