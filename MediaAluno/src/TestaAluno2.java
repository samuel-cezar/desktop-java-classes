/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sam
 */
public class TestaAluno2 {
    
    // Método para teste pontual individual
    public void testePontual(double n1, double n2, double n3, double n4, 
                           double mediaEsperada, String situacaoEsperada) {
        Aluno2 aluno = new Aluno2();
        
        // Carregando as notas usando métodos individuais
        aluno.recebeNota1(n1);
        aluno.recebeNota2(n2);
        aluno.recebeNota3(n3);
        aluno.recebeNota4(n4);
        
        double media = aluno.obtemMedia();
        String situacao = aluno.obtemSituacao();
        
        // Verificação da média (com tolerância para números decimais)
        if (Math.abs(media - mediaEsperada) > 0.01) {
            System.out.println("ERRO: Média incorreta para notas " + 
                             n1 + ", " + n2 + ", " + n3 + ", " + n4 +
                             ". Esperado: " + mediaEsperada + 
                             ", Obtido: " + media);
        }
        
        // Verificação da situação
        if (!situacao.equals(situacaoEsperada)) {
            System.out.println("ERRO: Situação incorreta para média " + media +
                             ". Esperado: " + situacaoEsperada + 
                             ", Obtido: " + situacao);
        }
    }
    
    // Método que testa todos os casos
    public void testaTudo() {
        System.out.println("=== INICIANDO TESTES DA CLASSE ALUNO2 ===");
        
        // Testes baseados nos exemplos da atividade original
        testePontual(8.7, 7.2, 9.3, 7.4, 8.15, "aprovado");
        testePontual(5.2, 3.4, 6.5, 2.1, 4.3, "recuperação");
        testePontual(3.4, 5.1, 1.1, 2.0, 2.9, "reprovado");
        
        // Testes adicionais para casos limites
        testePontual(7.0, 7.0, 7.0, 7.0, 7.0, "aprovado");    // Limite aprovação
        testePontual(4.0, 4.0, 4.0, 4.0, 4.0, "recuperação"); // Limite recuperação
        testePontual(3.9, 3.9, 3.9, 3.9, 3.9, "reprovado");   // Limite reprovação
        testePontual(10.0, 9.0, 8.0, 9.5, 9.125, "aprovado"); // Notas altas
        testePontual(0.0, 1.0, 2.0, 1.0, 1.0, "reprovado");   // Notas baixas
        
        // Teste com ordem diferentes de inserção das notas
        testeOrdemDiferente();
        
        System.out.println("=== TESTES DA CLASSE ALUNO2 CONCLUÍDOS ===");
    }
    
    // Teste específico para verificar se a ordem de inserção das notas não importa
    public void testeOrdemDiferente() {
        Aluno2 aluno1 = new Aluno2();
        Aluno2 aluno2 = new Aluno2();
        
        // Primeiro aluno: ordem normal (1, 2, 3, 4)
        aluno1.recebeNota1(8.0);
        aluno1.recebeNota2(7.0);
        aluno1.recebeNota3(9.0);
        aluno1.recebeNota4(6.0);
        
        // Segundo aluno: ordem diferente (4, 1, 3, 2)
        aluno2.recebeNota4(6.0);
        aluno2.recebeNota1(8.0);
        aluno2.recebeNota3(9.0);
        aluno2.recebeNota2(7.0);
        
        // Ambos devem ter a mesma média
        if (Math.abs(aluno1.obtemMedia() - aluno2.obtemMedia()) > 0.01) {
            System.out.println("ERRO: Ordem de inserção das notas está afetando o cálculo!");
        }
    }
    
    // Método main para executar os testes
    public static void main(String[] args) {
        TestaAluno2 teste = new TestaAluno2();
        teste.testaTudo();
    }
}