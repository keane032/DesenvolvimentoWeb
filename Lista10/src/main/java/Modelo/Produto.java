package Modelo;

public class Produto {

	//Um produto deve ter um id, uma descrição e um valor.
	
	private String id;
	private String descri;
	private float preco;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescri() {
		return descri;
	}
	public void setDescri(String descri) {
		this.descri = descri;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
	
}
