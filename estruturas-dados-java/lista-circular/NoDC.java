package encadeadaDupla;

public class NoDC {
	private Object elemento;//genérico
	private NoDC proximo;
	private NoDC anterior;
	private NoDC cursor;
		
	public NoDC(Object elemento, NoDC proximo){
		this.elemento = elemento;
		this.proximo = proximo;
	}
	public NoDC(Object elemento){
		this(elemento,null);
	}
	
	public NoDC getProximo() {
		return this.proximo;
	}
	public NoDC getAnterior() {
		return this.anterior;
	}
	public NoDC getCursor() {
		return this.cursor;
	}
	
	public void setProximo(NoDC proximo) {
		this.proximo = proximo;
	}
	public void setAnterior(NoDC anterior) {
		this.anterior = anterior;
	}
	public void setCursor(NoDC cursor) {
		this.cursor = cursor;
	}
	public Object getElemento() {
		return this.elemento;
	}
}
