package edu.udima.es;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import edu.udima.es.client.Impuestos;
import edu.udima.es.client.ImpuestosServicio;


/**
 * Invoca a un servicio web SOAP cuyo port {@link ImpuestosServicio} o endpoint se recupera a traves
 * de la clase {@link Impuestos}.
 * Las clases ubicadas en el paquete edu.udima.es.client son autogeneradas
 * a partir del WSDL ubicado en https://impuestosws.herokuapp.com/calculaIVA?wsdl
 * usando la herramienta wsimport.
 * 
 * @author Sofia Sabariego
 */
public class ClientesServicioImpuesto {

	/**
	 * Se pide un importe neto y se devolvera el importe resultante de
	 * aplicarle el IVA.
	 * @param args no se pasan argumentos.
	 * @throws IOException si se producen errores en la entrada o salida de datos.
	 */
	public static void main(String[] args) throws IOException {
		escribir("Introduzca el importe neto: ");
		String importeSinIVA= leer();
		
		Impuestos servicio = new Impuestos();
		ImpuestosServicio port = servicio.getImpuestosServicioPort();
		
		escribir("El total con IVA es: ");
		escribir(Float.toString(port.aplicarIVA(Float.parseFloat(importeSinIVA))));

	}
	
	
	/*
	 * Ayuda para escribir tanto por consola como por la salida estandar
	 * dependiendo de el entorno de ejecucion.
	 */
	private static void escribir(String texto) {
		if(System.console() != null){           
			System.console().writer().println(texto);
		}else{
			System.out.println(texto);
		}
	}

	/*
	 * Ayuda para leer tanto de consola como de la entrada estandar
	 * dependiendo de el entorno de ejecucion.
	 */
	private static String leer() throws IOException {
		BufferedReader br;
		if(System.console() != null){           
			return System.console().readLine();
		}else{
			br = new BufferedReader(new InputStreamReader(System.in));
			return br.readLine();
		}
	}


}
