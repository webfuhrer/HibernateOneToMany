package hibernateonetomany;

public class ModeloCoche {
private int id;
private String modelo;
private int potencia;
public ModeloCoche(String modelo, int potencia) {
	super();
	this.modelo = modelo;
	this.potencia = potencia;
}
public ModeloCoche() {

}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public int getPotencia() {
	return potencia;
}
public void setPotencia(int potencia) {
	this.potencia = potencia;
}


}
