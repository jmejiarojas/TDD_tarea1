package pe.cibertec.app;

import javax.swing.JOptionPane;

import pe.cibertec.figure.Triangulo;

public class App {

	public static void main(String[] args) {
		
		Triangulo triangulo = new Triangulo();
		
		try {
			int lado1 = Integer.parseInt(entrada("Ingrese el primer lado"));
			int lado2 = Integer.parseInt(entrada("Ingrese el segundo lado"));
			int lado3 = Integer.parseInt(entrada("Ingrese el tercer lado"));
			
			//Evaluamos si el trinagulo existe
			boolean isTriangulo = triangulo.isExistTriangulo(lado1, lado2, lado3);
			String resultado = "";
			
			if(isTriangulo){
				
				if(triangulo.isEquilatero(lado1, lado2, lado3)){
					resultado = "Un triangulo es Equilatero";
				}else if(triangulo.isEscaleno(lado1, lado2, lado3)){
					resultado = "Un triangulo es escaleno";
				}else{
					resultado = "Un triangulo es isoceles";
				}
				
				salida("Los lados ["+lado1+ " " + lado2 + " " + lado3 + ") hacen " + resultado);
			}else{
				salida("Los lados ["+lado1+ " " + lado2 + " " + lado3 + ") no hacen un triangulo valido");
			}
		} catch (Exception e) {
			salida("Error de ingreso de datos: " + e.getMessage());
		}
		
	}
	
	public static String entrada(String msg){
		return JOptionPane.showInputDialog(null,msg);
	}
	
	public static void salida(String msg){
		JOptionPane.showMessageDialog(null,msg);
	}
}
