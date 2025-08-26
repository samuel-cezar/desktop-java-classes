/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sam
 */
/**
 * Classe para testar todas as funcionalidades da classe Inteiro
 * Verifica o funcionamento correto em diversas situações
 */
public class TestaInteiro {
    
    /**
     * Testa os métodos básicos da classe Inteiro
     */
    public void testaMetodosBasicos() {
        System.out.println("=== TESTE DOS MÉTODOS BÁSICOS ===");
        
        Inteiro i = new Inteiro();
        
        // Teste 1: Carregando e devolvendo valores
        i.carregaValor(14);
        if (i.devolveValor() == 14) {
            System.out.println("✓ Teste 1 PASSOU: carregaValor(14) e devolveValor()");
        } else {
            System.out.println("✗ Teste 1 FALHOU: Esperado 14, obtido " + i.devolveValor());
        }
        
        // Teste 2: Valor negativo
        i.carregaValor(-473158);
        if (i.devolveValor() == -473158) {
            System.out.println("✓ Teste 2 PASSOU: carregaValor(-473158)");
        } else {
            System.out.println("✗ Teste 2 FALHOU: Esperado -473158, obtido " + i.devolveValor());
        }
        
        // Teste 3: Valor absoluto
        if (i.devolveValorAbsoluto() == 473158) {
            System.out.println("✓ Teste 3 PASSOU: devolveValorAbsoluto() de -473158");
        } else {
            System.out.println("✗ Teste 3 FALHOU: Esperado 473158, obtido " + i.devolveValorAbsoluto());
        }
        
        // Teste 4: Imprime
        System.out.print("Teste 4 - Método imprime(): ");
        i.imprime();
        
        System.out.println();
    }
    
    /**
     * Testa as Operacoes matemáticas
     */
    public void testaOperacoesMatematicas() {
        System.out.println("=== TESTE DAS Operacoes MATEMÁTICAS ===");
        
        Inteiro i = new Inteiro();
        
        // Teste de soma
        i.carregaValor(15);
        int resultadoSoma = i.subtrai(20);
        if (resultadoSoma == -5 && i.devolveValor() == -5) {
            System.out.println("✓ Teste Soma PASSOU: 15 - 20 = -5");
        } else {
            System.out.println("✗ Teste Soma FALHOU: Esperado -5, obtido " + resultadoSoma);
        }
        
        // Teste de multiplicação
        i.carregaValor(7);
        int resultadoMult = i.multiplicaPor(6);
        if (resultadoMult == 42) {
            System.out.println("✓ Teste Multiplicação PASSOU: 7 * 6 = 42");
        } else {
            System.out.println("✗ Teste Multiplicação FALHOU: Esperado 42, obtido " + resultadoMult);
        }
        
        // Teste de divisão normal
        i.carregaValor(20);
        int resultadoDiv = i.dividePor(4);
        if (resultadoDiv == 5) {
            System.out.println("✓ Teste Divisão PASSOU: 20 / 4 = 5");
        } else {
            System.out.println("✗ Teste Divisao FALHOU: Esperado 5, obtido " + resultadoDiv);
        }
        
        System.out.println();
    }
    
    /**
     * Testa casos especiais, incluindo divisao por zero
     */
    public void testaCasosEspeciais() {
        System.out.println("=== TESTE DE CASOS ESPECIAIS ===");
        
        Inteiro i = new Inteiro();
        
        // Teste 1: Divisão por zero
        System.out.println("Teste 1 - Divisao por zero:");
        i.carregaValor(100);
        int valorAntes = i.devolveValor();
        int resultado = i.dividePor(0);
        if (resultado == valorAntes && i.devolveValor() == valorAntes) {
            System.out.println("✓ Divisao por zero tratada corretamente");
        } else {
            System.out.println("✗ Divisao por zero não tratada corretamente");
        }
        
        // Teste 2: Divisão com resto
        System.out.println("\nTeste 2 - Divisao com resto:");
        i.carregaValor(7);
        int resultadoResto = i.dividePor(3);
        if (resultadoResto == 2) {
            System.out.println("✓ Divisao inteira PASSOU: 7 / 3 = 2 (resto ignorado)");
        } else {
            System.out.println("✗ Divisao inteira FALHOU: Esperado 2, obtido " + resultadoResto);
        }
        
        // Teste 3: Operacoes com números negativos
        System.out.println("\nTeste 3 - Operacoes com negativos:");
        i.carregaValor(-10);
        i.soma(5);
        if (i.devolveValor() == -5) {
            System.out.println("✓ Soma com negativo PASSOU: -10 + 5 = -5");
        } else {
            System.out.println("✗ Soma com negativo FALHOU: Esperado -5, obtido " + i.devolveValor());
        }
        
        // Teste 4: Valor zero
        System.out.println("\nTeste 4 - Operacoes com zero:");
        i.carregaValor(0);
        if (i.devolveValorAbsoluto() == 0) {
            System.out.println("✓ Valor absoluto de zero PASSOU");
        } else {
            System.out.println("✗ Valor absoluto de zero FALHOU");
        }
        
        System.out.println();
    }
    
    /**
     * Executa todos os testes
     */
    public void executaTodosTestes() {
        System.out.println("==========================================");
        System.out.println("    INICIANDO TESTES DA CLASSE INTEIRO    ");
        System.out.println("==========================================\n");
        
        testaMetodosBasicos();
        testaOperacoesMatematicas();
        testaCasosEspeciais();
        
        System.out.println("==========================================");
        System.out.println("           TESTES CONCLUIDOS             ");
        System.out.println("==========================================");
    }
    
    /**
     * Método main para executar os testes
     */
    public static void main(String[] args) {
        TestaInteiro teste = new TestaInteiro();
        teste.executaTodosTestes();
        
        System.out.println("\n=== EXEMPLO DE USO INTERATIVO ===");
        
        // Demonstração como no Exemplo
        Inteiro i = new Inteiro();
        i.carregaValor(14);
        System.out.println("i.devolveValor() = " + i.devolveValor());
        
        i.carregaValor(-473158);
        System.out.println("i.devolveValor() = " + i.devolveValor());
        System.out.println("i.devolveValorAbsoluto() = " + i.devolveValorAbsoluto());
        
        System.out.print("i.imprime() = ");
        i.imprime();
    }
}