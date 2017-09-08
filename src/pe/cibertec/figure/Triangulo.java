package pe.cibertec.figure;

public class Triangulo {

	public boolean isEquilatero(int lado1, int lado2, int lado3) {
		if (lado1 == lado2 && lado2 == lado3) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isIsoceles(int lado1, int lado2, int lado3) {
		if (lado1 == lado2 && lado2 == lado3)
			return false;
		else {
			if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
				return true;
			else {
				if (lado1 != lado2 || lado1 != lado3 || lado3 != lado2)
					return false;
			}
		}
		
		return false;
	}

	public boolean isEscaleno(int lado1, int lado2, int lado3) {
		if (lado1 == lado2 && lado2 == lado3)
			return false;
		else {
			if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
				return false;
			else {
				if (lado1 != lado2 || lado1 != lado3 || lado3 != lado2)
					return true;
			}
		}
		
		return false;
	}

	public boolean isExistTriangulo(int lado1, int lado2, int lado3) {
		
		//Para que un triangulo exista, un lado es menor que la suma de sus otros dos lados
		// y mayor que la diferencia  de esos mismos lados.
		int sumaLados = lado1 + lado2 + lado3;
		
		if( (lado1 < (sumaLados-lado1) && lado1 > ( lado2-lado3 < 0 ? (lado2-lado3)*-1 : lado2-lado3 )) && 
			(lado2 < (sumaLados-lado2) && lado2 > (lado1-lado3 < 0 ? (lado1-lado3)*-1 : lado1-lado3)) &&
			(lado3 < (sumaLados-lado3) && lado3 > (lado2-lado1 < 0 ? (lado2-lado1)*-1 : lado2-lado1))
				){
			return true;
		}else{
			return false;
		}
	}

}
