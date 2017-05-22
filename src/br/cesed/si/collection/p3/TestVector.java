/**
 * 
 */
package br.cesed.si.collection.p3;

import java.util.Vector;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author aluno
 *
 */
public class TestVector {

	@Test
	public void testAdd() {
		Vector<Produto> meuProduto = new Vector<Produto>();
		
		meuProduto.add(new Produto(001,"Cana a Sucre"));
		meuProduto.add(new Produto(002,"Copos"));
		meuProduto.add(new Produto(003,"Bola"));
		meuProduto.add(new Produto(004,"Jambo"));
		meuProduto.get(0).setDescricao("Panela de Pressão");

		Assert.assertEquals("Jambo",meuProduto.get(3).getDescricao());
		Assert.assertEquals("Panela de Pressão",meuProduto.get(0).getDescricao());
	}
	
	@Test
	public void testRemove(){
		Vector<Produto> meuProduto = new Vector<Produto>();
		
		meuProduto.add(new Produto(001,"Cana a Sucre"));
		meuProduto.add(new Produto(002,"Copos"));
		meuProduto.add(new Produto(003,"Bola"));
		meuProduto.add(new Produto(004,"Jambo"));
		
		meuProduto.remove(0);
		meuProduto.remove("Copos");

		meuProduto.removeAllElements();
		Assert.assertTrue(meuProduto.isEmpty());
		Assert.assertFalse(meuProduto.size() != 0);
	}
	@Test
	public void testSize(){
		Vector <Produto> meuProduto = new Vector<Produto>();
		
		meuProduto.add(new Produto(001,"Lapis"));
		meuProduto.add(new Produto(002,"Computador"));
		meuProduto.add(new Produto(003,"Teclado"));
		meuProduto.add(new Produto(004,"Caneta"));
		meuProduto.add(new Produto(005,"Estabilizador"));
		meuProduto.add(new Produto(006,"Lampada"));
		
		Assert.assertEquals(6, meuProduto.size());
		Assert.assertEquals(meuProduto.size(),6);
		
	}
	@Test
	public void testGet(){
		Vector<Produto> meuProduto = new Vector<Produto>();
	
		meuProduto.add(new Produto(001,"Lapis"));
		meuProduto.add(new Produto(002,"Computador"));
		meuProduto.add(new Produto(003,"Teclado"));
		meuProduto.add(new Produto(004,"Caneta"));
		meuProduto.add(new Produto(005,"Estabilizador"));
		meuProduto.add(new Produto(006,"Lampada"));
		
		Assert.assertEquals("Lampada",meuProduto.get(5).getDescricao());
		Assert.assertTrue("Lapis" == meuProduto.get(0).getDescricao());
		Assert.assertNotSame(004,meuProduto.get(2).getCodigo());
	}
}
