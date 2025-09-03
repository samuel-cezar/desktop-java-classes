/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Samuel Cezar dos Santos - 1996789
 */
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ControllerArquivoTextoCliente extends ControllerArquivoTexto {

    private List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public boolean lerCliente() {
        clientes = new ArrayList<>();
        if (!ler()) {
            return false;
        }
        String conteudo = getTexto();
        if (conteudo == null || conteudo.isEmpty()) {
            return true;
        }

        StringTokenizer linha = new StringTokenizer(conteudo, "--");
        while (linha.hasMoreTokens()) {
            String token = linha.nextToken();
            if (token.isEmpty()) {
                continue;
            }
            StringTokenizer registro = new StringTokenizer(token, ";");
            if (registro.countTokens() < 3) {
                continue;
            }
            Cliente cli = new Cliente();
            cli.setNome(registro.nextToken());
            cli.setZap(registro.nextToken());
            cli.setEmail(registro.nextToken());
            clientes.add(cli);
        }
        return true;
    }

    public boolean escreverClientesOverwrite() {
        StringBuilder sb = new StringBuilder();
        for (Cliente c : clientes) {
            sb.append(c.getNome()).append(";")
                    .append(c.getZap()).append(";")
                    .append(c.getEmail()).append("--");
        }
        setTexto(sb.toString());
        return escrever(false);
    }
}
