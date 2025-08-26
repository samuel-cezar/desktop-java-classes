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
        // Cria um objeto da classe Olá
        Ola saudador = new Ola();
        
        // Testa as diferentes saudações
        System.out.println("=== Testando a classe Ola ===");
        
        // Primeira chamada
        System.out.print("1a chamada: ");
        saudador.cumprimenta();
        
        // Segunda chamada
        System.out.print("2a chamada: ");
        saudador.cumprimenta();
        
        // Terceira chamada
        System.out.print("3a chamada: ");
        saudador.cumprimenta();
        
        // Quarta chamada (deve voltar à primeira)
        System.out.print("4a chamada: ");
        saudador.cumprimenta();
        
        // Quinta chamada
        System.out.print("5a chamada: ");
        saudador.cumprimenta();
    }
}
