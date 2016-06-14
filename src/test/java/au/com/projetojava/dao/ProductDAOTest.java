package au.com.projetojava.dao;

import au.com.projetojava.model.Make;
import au.com.projetojava.model.Product;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by vinidev on 15/06/16.
 */
public class ProductDAOTest {

    @Test
    public void salvar(){
        MakeDAO makeDAO = new MakeDAO();
        Make Make = makeDAO.search(new Long("1"));

        Product product = new Product();
        product.setDescription("Cataflan 50mg");
        product.setMake(Make);
        product.setPrice(new BigDecimal("13.70"));
        product.setQty(new Short("7"));

        ProductDAO ProductDAO = new ProductDAO();
        ProductDAO.save(product);

    }
}
