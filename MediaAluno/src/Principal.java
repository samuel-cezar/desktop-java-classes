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
        // Criando os objetos aluno para os testes
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        System.out.println("=== MAIN - ALUNO1 ===");

        // Carregando as notas conforme o exemplo da atividade
        aluno1.carregaNotas(8.7, 7.2, 9.3, 7.4);
        aluno2.carregaNotas(5.2, 3.4, 6.5, 2.1);
        aluno3.carregaNotas(3.4, 5.1, 1.1, 2.0);

        // Exibindo os resultados
        System.out.println(aluno1.situacaoCompleta());
        System.out.println(aluno2.situacaoCompleta());
        System.out.println(aluno3.situacaoCompleta());
    }
}
