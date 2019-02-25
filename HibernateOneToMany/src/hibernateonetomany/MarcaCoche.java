package hibernateonetomany;

import java.util.List;

public class MarcaCoche {
private String nombre,pais_origen;
private int id;
private List<ModeloCoche> modelos;

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getPais_origen() {
	return pais_origen;
}
public void setPais_origen(String pais_origen) {
	this.pais_origen = pais_origen;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


public List<ModeloCoche> getModelos() {
	return modelos;
}
public void setModelos(List<ModeloCoche> modelos) {
	this.modelos = modelos;
}
public MarcaCoche() {

}
public MarcaCoche(String nombre, String pais_origen, List<ModeloCoche> modelos) {
	super();
	this.nombre = nombre;
	this.pais_origen = pais_origen;
	this.modelos = modelos;
}


}
