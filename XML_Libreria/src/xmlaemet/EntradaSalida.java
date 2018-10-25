package xmlaemet;

public class EntradaSalida {

	public static void mostrarPrediccion(Clima c) {
		System.out.println("Municipio: "+c.getMunicipio());
		System.out.println("Provincia"+c.getProvincia());
		for (Dia d : c.getLista_dias()) {
			System.out.println(formatearFecha(d.getFecha())+":"+d.getT_minima()+"ºC /"+d.getT_maxima()+"ºC");
		}
		
	}

	private static String formatearFecha(String fecha) {
		// TODO Auto-generated method stub
		String[] campos=fecha.split("-");
		String fecha_formateada=campos[2]+"/"+campos[1]+"/"+campos[0];
		return fecha_formateada;
	}

}
