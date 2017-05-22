/**
 * 
 */
package br.cesed.si.collection.p3;

import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author diego
 *
 */
public class TestTreeSet {

	@Test
	public void testAdd() {
		TreeSet<Produto> meuProduto = new TreeSet<Produto>();
		
		meuProduto.add(new Produto(003,"Cadera"));
		meuProduto.add(new Produto(004,"Losange"));
		meuProduto.add(new Produto(001,"Tele match"));
		meuProduto.add(new Produto(002,"Bafle"));
		meuProduto.add(new Produto(005,"TV Led 43°"));
		
		meuProduto.remove(meuProduto.last());
		Assert.assertTrue(meuProduto.size() == 3);
		
		meuProduto.removeAll(meuProduto);
		Assert.assertFalse(meuProduto.isEmpty());
		
		
	}

}
