package br.com.alura.loja.test;

import br.com.alura.loja.model.Produto;

import java.math.BigDecimal;

public class CadastroDeProduto {
    public static void main(String[] args) {
        Produto celular = new Produto();
        celular.setNome("Iphone 11");
        celular.setDescricao("Apple");
        celular.setPreco(new BigDecimal("800"));

        System.out.println(celular);


    }
}
