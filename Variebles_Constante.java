package clase;

public class Variebles_Constante {

	public static void main(String[] args) {
		// Tipos de datos primitivos
		// Entros - int 
		int edad= 17 ;
		System.out.println("Mi edad es: " +edad);
		//Decimales 
		double estatura= 1.75;
		System.out.println("Mi estatura es: "+estatura+" Metros");
		
		// alfanumerico 
		String nombre="Anderson";
		System.out.println(nombre.getClass().getSimpleName());
		//char - un solo caracter
		char a= 's'; 
		
		//Booleano 
		boolean Verdad=true;
		
		var flor="Holitas";
		System.out.println(flor);
		
		final String mail="acoronelqunab.edu.co";
		System.out.println(mail);
		// mail= "Andersoncroroneltarazona@gmail.com"
		// System.out.println(mail);
		
	}

}
