/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sam
 */
public class Aluno {
    // Atributos para as 4 notas
    private double p1;
    private double p2;
    private double p3;
    private double p4;
    
    // Método para carregar as 4 notas
    public void carregaNotas(double nota1, double nota2, double nota3, double nota4) {
        this.p1 = nota1;
        this.p2 = nota2;
        this.p3 = nota3;
        this.p4 = nota4;
    }
    
    // Método para calcular a média aritmética
    public double calculaMedia() {
        return (p1 + p2 + p3 + p4) / 4.0;
    }
    
    // Método que dá o veredito (aprovado, recuperação, reprovado)
    public String verificaSituacao() {
        double media = calculaMedia();
        
        if (media >= 7.0) {
            return "aprovado";
        } else if (media >= 4.0) {
            return "recuperacao";
        } else {
            return "reprovado";
        }
    }
    
    // Método que retorna a situação completa formatada
    public String situacaoCompleta() {
        double media = calculaMedia();
        String situacao = verificaSituacao();
        return String.format("Media: %.1f -> %s.", media, situacao);
    }
}