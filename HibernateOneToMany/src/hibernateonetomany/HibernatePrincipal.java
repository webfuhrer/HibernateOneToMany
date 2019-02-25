package hibernateonetomany;

import java.util.ArrayList;
import java.util.List;

public class HibernatePrincipal {

	public static void main(String[] args) {
		
		
			try {
				AccesoBD.setUp();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//String nombre, String pais_origen, List<ModeloCoche> modelos
		/*	MarcaCoche marca=new MarcaCoche();
			marca.setNombre("Ford");
			marca.setPais_origen("América");
			ArrayList<ModeloCoche> lista=new ArrayList<ModeloCoche>();
			ModeloCoche m1=new ModeloCoche("Fiesta", 100);
			ModeloCoche m2=new ModeloCoche("Orion", 120);
			ModeloCoche m3=new ModeloCoche("Scort", 100);
			ModeloCoche m4=new ModeloCoche("focus", 120);
			lista.add(m1);
			lista.add(m2);
			marca.setModelos(lista);
			
			AccesoBD.insertarMarca(marca);*/
			
			List<MarcaCoche> lista=AccesoBD.listarMarcas("Ford");
			for (MarcaCoche m : lista) {
				System.out.println("Nombre: "+m.getNombre()+" Origen: "+m.getPais_origen());
				for (ModeloCoche mo: m.getModelos())
				{
					System.out.println(mo.getModelo()+" "+mo.getPotencia());
				}
				
				
			}
			
			
		
		

}

}
