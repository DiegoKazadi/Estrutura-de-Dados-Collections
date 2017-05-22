/**
 * 
 */
package br.cesed.si.collection.p3;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author aluno
 *
 */
public class TestArrayList {

	@Test
	public void testAdd() {
			ArrayList <Produto> meuProduto = new ArrayList<Produto>();
			meuProduto.add(new Produto(123,"Computador",200,3));
			meuProduto.add(new Produto(123,"Teclado",20,2));
			meuProduto.add(new Produto(123,"Mouse",15,5));
			
			meuProduto.remove(1);
			//Adiciona na posição
			meuProduto.add(1, new Produto(124,"Boracha",65,2));
			
			Assert.assertEquals("Boracha", meuProduto.get(1).getDescricao());
			Assert.assertTrue(meuProduto.get(2).getValorUnitario() == 15);
			Assert.assertEquals(meuProduto.size(),3);
						
		}
	@Test
	public void testRemove(){
		ArrayList <Produto> meuProduto = new ArrayList<Produto>();
		
		meuProduto.add(new Produto(002,"Lapis",2,1));
		meuProduto.add(new Produto(123,"Computador",200,3));
		meuProduto.add(new Produto(123,"Teclado",20,2));
		
		meuProduto.remove(0);
		Assert.assertEquals("Computador", meuProduto.get(0).getDescricao());
		
	}
	@Test
	public void testSize(){
		ArrayList <Produto> meuProduto = new ArrayList<Produto>();
		
		meuProduto.add(new Produto(001,"Lapis"));
		meuProduto.add(new Produto(002,"Computador"));
		meuProduto.add(new Produto(003,"Teclado"));
		meuProduto.add(new Produto(004,"Caneta"));
		meuProduto.add(new Produto(005,"Estabilizador"));
		meuProduto.add(new Produto(006,"Lampada"));
		
		
		Assert.assertEquals(meuProduto.size(),6);
	}
	@Test
	public void testGet(){
	ArrayList <Produto> meuProduto = new ArrayList<Produto>();
	
		meuProduto.add(new Produto(001,"Lapis"));
		meuProduto.add(new Produto(002,"Computador"));
		meuProduto.add(new Produto(003,"Teclado"));
		meuProduto.add(new Produto(004,"Caneta"));
		meuProduto.add(new Produto(005,"Estabilizador"));
		meuProduto.add(new Produto(006,"Lampada"));
		
		Assert.assertEquals("Lampada",meuProduto.get(5).getDescricao());
		
	}
	
	
}
