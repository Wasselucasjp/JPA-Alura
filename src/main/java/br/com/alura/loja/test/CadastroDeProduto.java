package br.com.alura.loja.test;

import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.model.Produto;
import br.com.alura.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroDeProduto {
    public static void main(String[] args) {
        Produto celular = new Produto();
        celular.setNome("Iphone 11");
        celular.setDescricao("Apple");
        celular.setPreco(new BigDecimal("800"));

        System.out.println(celular);

        EntityManager entityManager  =  JPAUtil.getEntityManager();
        ProdutoDao dao = new ProdutoDao(entityManager);
        entityManager.getTransaction().begin();
        entityManager.persist(celular);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
