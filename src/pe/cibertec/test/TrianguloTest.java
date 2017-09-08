package pe.cibertec.test;

import static org.junit.Assert.*;

import org.junit.Test;

import pe.cibertec.figure.Triangulo;

public class TrianguloTest {

	@Test
	public void testTrianguloEquilatero(){
		
		Triangulo triangulo = new Triangulo();
		boolean isEquilatero = triangulo.isEquilatero(3,3,3);
		boolean resultado = true;
		assertEquals(isEquilatero, resultado);
	}
	
	@Test
	public void testFailTrianguloEquilatero(){
		
		Triangulo triangulo = new Triangulo();
		boolean isEquilatero = triangulo.isEquilatero(2,3,5);
		boolean resultado = false;
		assertEquals(isEquilatero, resultado);
	}
	
	@Test
	public void testTrianguloIsoceles(){
		
		Triangulo triangulo = new Triangulo();
		boolean isIsoceles = triangulo.isIsoceles(3,3,2);
		boolean resultado = true;
		assertEquals(isIsoceles, resultado);
	}
	
	@Test
	public void testFailTrianguloIsoceles(){
		
		Triangulo triangulo = new Triangulo();
		boolean isIsoceles = triangulo.isIsoceles(3,1,2);
		boolean resultado = false;
		assertEquals(isIsoceles, resultado);
	}
	
	@Test
	public void testFail2TrianguloIsoceles(){
		
		Triangulo triangulo = new Triangulo();
		boolean isIsoceles = triangulo.isIsoceles(3,3,3);
		boolean resultado = false;
		assertEquals(isIsoceles, resultado);
	}
	
	@Test
	public void testTrianguloEscaleno(){
		
		Triangulo triangulo = new Triangulo();
		boolean isEscaleno = triangulo.isEscaleno(3,1,2);
		boolean resultado = true;
		assertEquals(isEscaleno, resultado);
	}
	
	@Test
	public void testFailTrianguloEscaleno(){
		
		Triangulo triangulo = new Triangulo();
		boolean isEscaleno = triangulo.isEscaleno(3,2,2);
		boolean resultado = false;
		assertEquals(isEscaleno, resultado);
	}
	
	@Test
	public void testFail2TrianguloEscaleno(){
		
		Triangulo triangulo = new Triangulo();
		boolean isEscaleno = triangulo.isEscaleno(2,2,2);
		boolean resultado = false;
		assertEquals(isEscaleno, resultado);
	}
	
	@Test
	public void testExistTriangulo(){
		
		Triangulo triangulo = new Triangulo();
		boolean isTriangulo = triangulo.isExistTriangulo(4,3,5);
		boolean  resultado = true;
		assertEquals(isTriangulo, resultado);
	}
	
	@Test
	public void testExistTriangulo2(){
		
		Triangulo triangulo = new Triangulo();
		boolean isTriangulo = triangulo.isExistTriangulo(5,13,12);
		boolean  resultado = true;
		assertEquals(isTriangulo, resultado);
	}
	
	@Test
	public void testFailExistTriangulo2(){
		
		Triangulo triangulo = new Triangulo();
		boolean isTriangulo = triangulo.isExistTriangulo(1,3,2);
		boolean  resultado = false;
		assertEquals(isTriangulo, resultado);
	}
}
