/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sam
 */
/**
 * Classe que representa um número inteiro com operações matemáticas básicas.
 * Implementa os métodos solicitados na atividade do capítulo 5.
 */
public class Inteiro {

    // Atributo que armazena o valor do inteiro
    private int valor;

    // ========== MÉTODOS BÁSICOS ==========
    /**
     * Carrega um novo valor no objeto
     *
     * @param v novo valor a ser armazenado
     */
    public void carregaValor(int v) {
        this.valor = v;
    }

    /**
     * Devolve o valor atual do objeto
     *
     * @return valor inteiro armazenado
     */
    public int devolveValor() {
        return this.valor;
    }

    /**
     * Devolve o valor absoluto do número
     *
     * @return valor absoluto do inteiro
     */
    public int devolveValorAbsoluto() {
        if (this.valor < 0) {
            return -this.valor;
        }
        return this.valor;
    }

    /**
     * Imprime uma representação do objeto
     */
    public void imprime() {
        System.out.println("Valor: " + this.valor + ".");
    }

    // ========== OPERAÇÕES MATEMÁTICAS ==========
    /**
     * Soma um valor ao inteiro atual
     *
     * @param v valor a ser somado
     * @return novo valor após a soma
     */
    public int soma(int v) {
        this.valor = this.valor + v;
        return this.valor;
    }

    /**
     * Subtrai um valor do inteiro atual
     *
     * @param v valor a ser subtraído
     * @return novo valor após a subtração
     */
    public int subtrai(int v) {
        this.valor = this.valor - v;
        return this.valor;
    }

    /**
     * Multiplica o inteiro atual por um valor
     *
     * @param v valor multiplicador
     * @return novo valor após a multiplicação
     */
    public int multiplicaPor(int v) {
        this.valor = this.valor * v;
        return this.valor;
    }

    /**
     * Divide o inteiro atual por um divisor
     *
     * @param divisor valor divisor (não pode ser zero)
     * @return novo valor após a divisão ou valor inalterado se divisor for zero
     */
    public int dividePor(int divisor) {
        if (divisor == 0) {
            System.out.println("ERRO: Divisão por zero não é permitida!");
            return this.valor; // Retorna valor inalterado
        }
        this.valor = this.valor / divisor;
        return this.valor;
    }

    // ========== MÉTODOS ADICIONAIS (OPCIONAIS) ==========
    /**
     * Calcula a soma sem alterar o valor atual
     *
     * @param v valor a ser somado
     * @return resultado da soma
     */
    public int calculaSoma(int v) {
        return this.valor + v;
    }

    /**
     * Calcula a subtração sem alterar o valor atual
     *
     * @param v valor a ser subtraído
     * @return resultado da subtração
     */
    public int calculaSubtracao(int v) {
        return this.valor - v;
    }

    /**
     * Calcula a multiplicação sem alterar o valor atual
     *
     * @param v valor multiplicador
     * @return resultado da multiplicação
     */
    public int calculaMultiplicacao(int v) {
        return this.valor * v;
    }

    /**
     * Calcula a divisão sem alterar o valor atual
     *
     * @param divisor valor divisor
     * @return resultado da divisão ou valor atual se divisor for zero
     */
    public int calculaDivisao(int divisor) {
        if (divisor == 0) {
            System.out.println("ERRO: Divisão por zero não é permitida!");
            return this.valor;
        }
        return this.valor / divisor;
    }
}
