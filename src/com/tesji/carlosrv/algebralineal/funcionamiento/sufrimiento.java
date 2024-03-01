//ESTA CLASE ES DE DONDE NACIÓ LA CLASE QUE TIENE EL MEJOR FUNCIONAMIENTO

package com.tesji.carlosrv.algebralineal.funcionamiento;

public class sufrimiento {
	double Uno = 1;
	double Dos = 1;
	double Tres = 2;
	double Cuatro = 9;
	double Cinco = 2;
	double Seis = 4;
	double Siete = -3;
	double Ocho = 1;
	double Nueve = 3;
	double Diez = 6;
	double Once = -5;
	double Doce = 0;
	double[][] matrizCarlos = new double[3][4];
	double[][] matrizTemporal = new double[3][4];

	public static void main(String[] args) {
		sufrimiento objeto = new sufrimiento();
		objeto.Imprimir();

	}

	public void asignacionDeValores() {

		matrizCarlos[0][0] = Uno;
		matrizCarlos[0][1] = Dos;
		matrizCarlos[0][2] = Tres;
		matrizCarlos[0][3] = Cuatro;
		matrizCarlos[1][0] = Cinco;
		matrizCarlos[1][1] = Seis;
		matrizCarlos[1][2] = Siete;
		matrizCarlos[1][3] = Ocho;
		matrizCarlos[2][0] = Nueve;
		matrizCarlos[2][1] = Diez;
		matrizCarlos[2][2] = Once;
		matrizCarlos[2][3] = Doce;
	}

	public void Imprimir() {
		asignacionDeValores();
		pivote00();
		r1PrimeraVuelta();
		r1SegundaVuelta();
		r2PrimeraVuelta();
		pivote11();
		r2SegundaVuelta();
		r3PrimeraVuelta();
		r3SegundaVuelta();
		pivote22();
		
	
	

	
		imprimirMatrizFinal();

	}

	public void pivote00() {
		double posicionr1Carlos = matrizCarlos[0][0];
		for (int f = 0; f < 1; f++) {
			for (int c = 0; c < 4; c++) {

				matrizCarlos[f][c] = (matrizCarlos[f][c] / posicionr1Carlos);
			}
			System.out.println("");
		}

	}

	public void r1PrimeraVuelta() {
		double variable01 = matrizCarlos[0][1];

		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 4; c++) {
				matrizTemporal[f][c] = matrizCarlos[f][c];

			}
		}

		for (int a = 0; a < 1; a++) {
			for (int b = 0; b < 4; b++) {
				matrizTemporal[a][b] = matrizTemporal[1][b] * cambioDeValor(variable01) + matrizCarlos[a][b];
				// System.out.print(matrizTemporal[a][b] + "\t");
				// matrizTemporal[0][b] = matrizCarlos[0][b];
				matrizCarlos[a][b] = matrizTemporal[a][b];

			}

		}

	}

	public void r1SegundaVuelta() {
		double variable02 = matrizCarlos[0][2];

		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 4; c++) {
				matrizTemporal[f][c] = matrizCarlos[f][c];

			}
		}

		for (int a = 0; a < 1; a++) {
			for (int b = 0; b < 4; b++) {
				matrizTemporal[a][b] = matrizTemporal[2][b] * cambioDeValor(variable02) + matrizCarlos[a][b];
				// System.out.print(matrizTemporal[a][b] + "\t");
				// matrizTemporal[0][b] = matrizCarlos[0][b];
				matrizCarlos[a][b] = matrizTemporal[a][b];

			}

		}

	}
	public void r2PrimeraVuelta() {
		double variable10 = matrizCarlos[1][0];

		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 4; c++) {
				matrizTemporal[f][c] = matrizCarlos[f][c];

			}
		}

		for (int a = 2; a < 3; a++) {
			for (int b = 0; b < 4; b++) {
				matrizTemporal[a][b] = matrizTemporal[0][b] * cambioDeValor(variable10) + matrizCarlos[a][b];
				// System.out.print(matrizTemporal[a][b] + "\t");
				// matrizTemporal[0][b] = matrizCarlos[0][b];
				matrizCarlos[a][b] = matrizTemporal[a][b];

			}

		}

	}


	public void pivote11() {
		double posicionr2Carlos = matrizCarlos[1][1];
		for (int f = 1; f < 2; f++) {
			for (int c = 0; c < 4; c++) {

				matrizCarlos[f][c] = (matrizCarlos[f][c] / posicionr2Carlos);
				// System.out.print((matrizCarlos[f][c] / matrizCarlos[0][0]) + "\t");
				// asignamos valores a nuestra matriz temporal

			}
			System.out.println("");
		}

	}

	public void r2SegundaVuelta() {
		double variable12 = matrizCarlos[1][2];

		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 4; c++) {
				matrizTemporal[f][c] = matrizCarlos[f][c];

			}
		}

		for (int a = 1; a < 2; a++) {
			for (int b = 0; b < 4; b++) {
				matrizTemporal[a][b] = matrizTemporal[2][b] * cambioDeValor(variable12) + matrizCarlos[a][b];
				// System.out.print(matrizTemporal[a][b] + "\t");
				// matrizTemporal[0][b] = matrizCarlos[0][b];
				matrizCarlos[a][b] = matrizTemporal[a][b];

			}

		}

	}


	public void r3PrimeraVuelta() {
		double variable20 = matrizCarlos[2][0];

		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 4; c++) {
				matrizTemporal[f][c] = matrizCarlos[f][c];

			}
		}

		for (int a = 2; a < 3; a++) {
			for (int b = 0; b < 4; b++) {
				matrizTemporal[a][b] = matrizTemporal[0][b] * cambioDeValor(variable20) + matrizCarlos[a][b];
				// System.out.print(matrizTemporal[a][b] + "\t");
				// matrizTemporal[0][b] = matrizCarlos[0][b];
				matrizCarlos[a][b] = matrizTemporal[a][b];

			}

		}

	}

	public void r3SegundaVuelta() {
		double variable21 = matrizCarlos[2][1];

		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 4; c++) {
				matrizTemporal[f][c] = matrizCarlos[f][c];

			}
		}

		for (int a = 2; a < 3; a++) {
			for (int b = 0; b < 4; b++) {
				matrizTemporal[a][b] = matrizTemporal[1][b] * cambioDeValor(variable21) + matrizCarlos[a][b];
				// System.out.print(matrizTemporal[a][b] + "\t");
				// matrizTemporal[0][b] = matrizCarlos[0][b];
				matrizCarlos[a][b] = matrizTemporal[a][b];

			}

		}

	}

	public void pivote22() {
		double posicionr3Carlos = matrizCarlos[2][2];
		for (int f = 2; f < 3; f++) {
			for (int c = 0; c < 4; c++) {

				matrizCarlos[f][c] = (matrizCarlos[f][c] / posicionr3Carlos);

			}
			System.out.println("");
		}

	}

	public double cambioDeValor(double variable20) {
		if (variable20 < 0) {

			return Math.abs(variable20);

		} else {

			return -1 * variable20;
		}

	}

	public void imprimirMatrizFinal() {
		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 4; c++) {

				System.out.print(matrizCarlos[f][c] + "\t");

			}
			System.out.println("");
		}
	}

}
