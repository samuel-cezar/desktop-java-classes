/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Samuel Cezar dos Santos - 1996789
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ControllerArquivoTexto extends ControllerArquivo {

    private String texto = null;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public boolean ler() {
        if (arquivo == null) {
            return false;
        }
        StringBuilder builder = new StringBuilder();
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            while (leitor.ready()) {
                builder.append(leitor.readLine());
            }
            setTexto(builder.toString());
            return true;
        } catch (IOException e) {
            System.err.println("Erro ao tentar ler: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean escrever(boolean append) {
        if (arquivo == null) {
            return false;
        }
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivo, append))) {
            escritor.write(getTexto() != null ? getTexto() : "");
            return true;
        } catch (IOException e) {
            System.err.println("Erro ao tentar escrever: " + e.getMessage());
            return false;
        }
    }
}
