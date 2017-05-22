/**
 * 
 */
package br.cesed.si.collection.p3;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author diego
 *
 */
public class TestLinkedList {

	@Test
	public void testAdd() {
		LinkedList<Produto> meuProduto = new LinkedList<Produto>();
		
		meuProduto.add(new Produto(001,"Mesa",1000,1));
		meuProduto.add(new Produto(001,"Cadera",500,5));
		meuProduto.add(new Produto(005,"TV Led 43°",17500,2));
		
		Assert.assertEquals(1,meuProduto.get(0).getQuantidade());
		Assert.assertFalse(meuProduto.isEmpty());
		
		meuProduto.addFirst(new Produto(005,"TV Led 43°",17500,2));
		meuProduto.addLast(new Produto(004,"Sofa",900,2));
		
		Assert.assertEquals("TV Led 43°", meuProduto.getFirst().getDescricao());
		Assert.assertFalse(900 != meuProduto.getLast().getValorUnitario());
	}
	@Test
	public void testRemove(){
		LinkedList<Produto> meuProduto = new LinkedList<Produto>();
		
		meuProduto.add(new Produto(001,"Lapis"));
		meuProduto.add(new Produto(002,"Computador"));
		meuProduto.add(new Produto(003,"Teclado"));
		meuProduto.add(new Produto(004,"Caneta"));
		
		meuProduto.removeFirst();

		Assert.assertFalse(004 == meuProduto.get(0).getCodigo());
		Assert.assertTrue(004 == meuProduto.getLast().getCodigo());
		Assert.assertEquals(3, meuProduto.size());
		
		meuProduto.removeAll(meuProduto);
		Assert.assertTrue(meuProduto.isEmpty());
		
	}
	@Test
	public void testPushPop() {
			LinkedList<Produto> meuProduto = new LinkedList<Produto>();
			
			meuProduto.add(new Produto(123,"Computador",200,3));
			meuProduto.add(new Produto(124,"Teclado",20,2));
			meuProduto.add(new Produto(125,"Mouse",15,5));
			
			meuProduto.push(new Produto(126,"Estabilizador",125,3));
			meuProduto.pop();

			Assert.assertTrue(20 == meuProduto.get(1).getValorUnitario());
			Assert.assertEquals(meuProduto.size(),3);
			Assert.assertFalse("Teclado" == meuProduto.getLast().getDescricao());
						
		}

}
