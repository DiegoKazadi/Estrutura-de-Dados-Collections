/**
 * 
 */
package br.cesed.si.collection.p3;

/**
 * @author aluno
 *
 */
public class Produto {
	
	private int codigo;
	private String descricao;
	private double valorUnitario;
	private int quantidade;
	
	
	/**
	 * O método construtor com 4 paramentros
	 * @param codigo
	 * @param descricao
	 * @param valorUnitario
	 * @param quantidade
	 */
	public Produto(int codigo, String descricao, double valorUnitario, int quantidade) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
	}

	/**
	 * O método construtor com 2 paramentros
	 * @param codigo
	 * @param descricao
	 */
	public Produto(int codigo, String descricao) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}


	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	/**
	 * @return the valorUnitario
	 */
	public double getValorUnitario() {
		return valorUnitario;
	}


	/**
	 * @param valorUnitario the valorUnitario to set
	 */
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}


	/**
	 * @return the quantidade
	 */
	public int getQuantidade() {
		return quantidade;
	}


	/**
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Codigo do Produto : " + codigo + ", Descricao : " + descricao + ", ValorUnitario : " + valorUnitario
				+ ", Quantidade : " + quantidade + "\n";
	}
	
	
	
	
	
	
	

}
