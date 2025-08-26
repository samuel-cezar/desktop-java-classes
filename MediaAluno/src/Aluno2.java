/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sam
 */
public class Aluno2 {
    // Atributos para as 4 notas
    private double p1;
    private double p2;
    private double p3;
    private double p4;
    
    // Métodos individuais para receber cada nota
    public void recebeNota1(double nota) {
        this.p1 = nota;
    }
    
    public void recebeNota2(double nota) {
        this.p2 = nota;
    }
    
    public void recebeNota3(double nota) {
        this.p3 = nota;
    }
    
    public void recebeNota4(double nota) {
        this.p4 = nota;
    }
    
    // Método privado para calcular a média
    private double calculaMedia() {
        return (p1 + p2 + p3 + p4) / 4.0;
    }
    
    // Método privado para verificar situação
    private String verificaSituacao() {
        double media = calculaMedia();
        
        if (media >= 7.0) {
            return "aprovado";
        } else if (media >= 4.0) {
            return "recuperacao";
        } else {
            return "reprovado";
        }
    }
    
    // Método que imprime a média e situação do aluno
    public void imprimeMedia() {
        double media = calculaMedia();
        String situacao = verificaSituacao();
        System.out.printf("Media: %.1f -> %s.%n", media, situacao);
    }
    
    // Métodos públicos auxiliares para os testes
    public double obtemMedia() {
        return calculaMedia();
    }
    
    public String obtemSituacao() {
        return verificaSituacao();
    }
}
