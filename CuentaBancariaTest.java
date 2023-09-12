package cuentaBancaria;

public class CuentaBancariaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear cuenta sueldo con saldo en 0.
		System.out.println("Crear cuenta sueldo con saldo en 0.");
		
		//Preparacion
		Integer saldoEsperado = 100;
		Integer saldoObtenido = 1;
		CuentaSueldo miCuenta = new CuentaSueldo();
		
		
		//Ejecucion
		saldoObtenido = miCuenta.retornarSaldo();
		
		
		//Comparacion

	}

}
