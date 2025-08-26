/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sam
 */
public class Ola {
    // Atributo para controlar qual cumprimento usar
    private int tipoSaudacao;
    
    // Construtor - inicializa o tipo de saudação
    public Ola() {
        this.tipoSaudacao = 1; // Começa com a primeira saudação
    }
    
    // Método que cumprimenta de 3 maneiras diferentes
    public void cumprimenta() {
        if (tipoSaudacao == 1) {
            System.out.println("Ola! Como voce esta hoje?");
        } else if (tipoSaudacao == 2) {
            System.out.println("Oi! Que bom te ver!");
        } else if (tipoSaudacao == 3) {
            System.out.println("E ai! Tudo certo contigo?");
        }
        
        // Altera o valor do atributo para a próxima chamada
        tipoSaudacao++;
        
        // Se passou da terceira opção, volta para a primeira
        if (tipoSaudacao > 3) {
            tipoSaudacao = 1;
        }
    }
}
