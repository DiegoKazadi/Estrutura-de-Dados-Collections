/**
 * 
 */
package br.cesed.si.collection.p3;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author diego
 *
 */
public class TestHashSet {

	@Test
	public void testAdd() {
		HashSet<Produto> meuProduto = new HashSet<Produto>();
		
		meuProduto.add(new Produto(111, "Livro"));
		meuProduto.add(new Produto(112, "Caneta"));
		meuProduto.add(new Produto(113, "Regua"));
		meuProduto.add(new Produto(114, "Caderno"));
		
		System.out.println(meuProduto.hashCode());
		Assert.assertEquals(113,meuProduto.hashCode());
		Assert.assertTrue(meuProduto.contains("Caneta"));
	}
	

}
