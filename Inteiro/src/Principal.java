/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sam
 */

public class Principal {
    
    public static void main(String[] args) {
        System.out.println("=== Demonstracao da Classe Inteiro ===\n");
        
        // Exemplo de uso conforme especificado na atividade
        Inteiro i = new Inteiro();
        
        System.out.println("1. Carregando valor 14:");
        i.carregaValor(14);
        System.out.println("Valor atual: " + i.devolveValor());
        i.imprime();
        
        System.out.println("\n2. Carregando valor -473158:");
        i.carregaValor(-473158);
        System.out.println("Valor atual: " + i.devolveValor());
        System.out.println("Valor absoluto: " + i.devolveValorAbsoluto());
        i.imprime();
    }
}
