/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sam
 */
public class Principal2 {
    public static void main(String[] args) {
        System.out.println("=== MAIN - ALUNO2 ===");
        
        // Primeiro aluno - exemplo da atividade
        Aluno2 aluno1 = new Aluno2();
        aluno1.recebeNota1(8.7);
        aluno1.recebeNota2(7.2);
        aluno1.recebeNota3(9.3);
        aluno1.recebeNota4(7.4);
        aluno1.imprimeMedia();
        
        // Segundo aluno - exemplo da atividade
        Aluno2 aluno2 = new Aluno2();
        aluno2.recebeNota1(5.2);
        aluno2.recebeNota2(3.4);
        aluno2.recebeNota3(6.5);
        aluno2.recebeNota4(2.1);
        aluno2.imprimeMedia();
        
        // Terceiro aluno - exemplo da atividade
        Aluno2 aluno3 = new Aluno2();
        aluno3.recebeNota1(3.4);
        aluno3.recebeNota2(5.1);
        aluno3.recebeNota3(1.1);
        aluno3.recebeNota4(2.0);
        aluno3.imprimeMedia();
        
        // Demonstração com ordem diferente de inserção
        Aluno2 aluno4 = new Aluno2();
        aluno4.recebeNota4(8.0);  // Inserindo nota 4 primeiro
        aluno4.recebeNota2(9.0);  // Depois nota 2
        aluno4.recebeNota1(7.5);  // Depois nota 1
        aluno4.recebeNota3(8.5);  // Por último nota 3
        aluno4.imprimeMedia();
    }
}