package com.tesji.carlosrv.algebralineal.funcionamiento;

import java.text.DecimalFormat;

public class ProgramaDificilHechoPorCarlos {
	double Uno;
	double Dos;
	double Tres;
	double Cuatro;
	double Cinco;
	double Seis;
	double Siete;
	double Ocho;
	double Nueve;
	double Diez;
	double Once;
	double Doce;
	double[][] matrizCarlos = new double[3][4];
	double[][] matrizTemporal = new double[3][4];

	public double getDiez() {
		return Diez;
	}

	public void setDiez(double diez) {
		Diez = diez;
	}

	public double getOnce() {
		return Once;
	}

	public void setOnce(double once) {
		Once = once;
	}

	public double getDoce() {
		return Doce;
	}

	public void setDoce(double doce) {
		Doce = doce;
	}

	public double getUno() {
		return Uno;
	}

	public void setUno(double uno) {
		Uno = uno;
	}

	public double getDos() {
		return Dos;
	}

	public void setDos(double dos) {
		Dos = dos;
	}

	public double getTres() {
		return Tres;
	}

	public void setTres(double tres) {
		Tres = tres;
	}

	public double getCuatro() {
		return Cuatro;
	}

	public void setCuatro(double cuatro) {
		Cuatro = cuatro;
	}

	public double getCinco() {
		return Cinco;
	}

	public void setCinco(double cinco) {
		Cinco = cinco;
	}

	public double getSeis() {
		return Seis;
	}

	public void setSeis(double seis) {
		Seis = seis;
	}

	public double getSiete() {
		return Siete;
	}

	public void setSiete(double siete) {
		Siete = siete;
	}

	public double getOcho() {
		return Ocho;
	}

	public void setOcho(double ocho) {
		Ocho = ocho;
	}

	public double getNueve() {
		return Nueve;
	}

	public void setNueve(double nueve) {
		Nueve = nueve;
	}

	public static void main(String[] args) {
		ProgramaDificilHechoPorCarlos objeto = new ProgramaDificilHechoPorCarlos();
		objeto.Imprimir();

	}

	public void quitarNegA0yImprimirCarlos() {

		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 4; c++) {

				if (matrizCarlos[f][c] == -0) {
					matrizCarlos[f][c] = Math.abs(0);

				}
			}

		}
	}

	public void asignacionDeValoresCarlos() {

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
		asignacionDeValoresCarlos();
		r1PrimeraVueltaCarlos();
		r2SegundaVueltaCarlos();
		pivote11Carlos();
		r3PrimeraVueltaCarlos();
		r1SegundaVueltaCarlos();
		r3SegundaVueltaCarlos();
		pivote22Carlos();
		r1TerceraVueltaCarlos();
		r2PrimeraVueltaCarlos();
		quitarNegA0yImprimirCarlos();

	}

	public double cambioDeValorCarlos(double variable20Carlos) {
		if (variable20Carlos < 0) {

			return Math.abs(variable20Carlos);

		} else {

			return -1 * variable20Carlos;
		}

	}

	public void r1PrimeraVueltaCarlos() {
		double posicionr1Carlos = matrizCarlos[0][0];
		for (int f = 0; f < 1; f++) {
			for (int c = 0; c < 4; c++) {
				matrizCarlos[f][c] = (matrizCarlos[f][c] / posicionr1Carlos);
			}
		}

	}

	public void r3PrimeraVueltaCarlos() {
		double variable20Carlos = matrizCarlos[2][0];

		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 4; c++) {
				matrizTemporal[f][c] = matrizCarlos[f][c];

			}
		}

		for (int a = 2; a < 3; a++) {
			for (int b = 0; b < 4; b++) {
				matrizTemporal[a][b] = matrizTemporal[0][b] * cambioDeValorCarlos(variable20Carlos)
						+ matrizCarlos[a][b];
				matrizCarlos[a][b] = matrizTemporal[a][b];

			}

		}

	}

	public void r1SegundaVueltaCarlos() {
		double variable01Carlos = matrizCarlos[0][1];

		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 4; c++) {
				matrizTemporal[f][c] = matrizCarlos[f][c];

			}
		}

		for (int a = 0; a < 1; a++) {
			for (int b = 0; b < 4; b++) {
				matrizTemporal[a][b] = matrizTemporal[1][b] * cambioDeValorCarlos(variable01Carlos)
						+ matrizCarlos[a][b];
				matrizCarlos[a][b] = matrizTemporal[a][b];

			}

		}

	}

	public void r3SegundaVueltaCarlos() {
		double variable21Carlos = matrizCarlos[2][1];

		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 4; c++) {
				matrizTemporal[f][c] = matrizCarlos[f][c];

			}
		}

		for (int a = 2; a < 3; a++) {
			for (int b = 0; b < 4; b++) {
				matrizTemporal[a][b] = matrizTemporal[1][b] * cambioDeValorCarlos(variable21Carlos)
						+ matrizCarlos[a][b];
				matrizCarlos[a][b] = matrizTemporal[a][b];

			}

		}

	}

	private void r1TerceraVueltaCarlos() {
		double variable02Carlos = matrizCarlos[0][2];

		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 4; c++) {
				matrizTemporal[f][c] = matrizCarlos[f][c];

			}
		}

		for (int a = 0; a < 1; a++) {
			for (int b = 0; b < 4; b++) {
				matrizTemporal[a][b] = matrizTemporal[2][b] * cambioDeValorCarlos(variable02Carlos)
						+ matrizCarlos[a][b];
				matrizCarlos[a][b] = matrizTemporal[a][b];

			}

		}

	}

	private void r2PrimeraVueltaCarlos() {
		double variable12Carlos = matrizCarlos[1][2];

		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 4; c++) {
				matrizTemporal[f][c] = matrizCarlos[f][c];

			}
		}

		for (int a = 1; a < 2; a++) {
			for (int b = 0; b < 4; b++) {
				matrizTemporal[a][b] = matrizTemporal[2][b] * cambioDeValorCarlos(variable12Carlos)
						+ matrizCarlos[a][b];
				matrizCarlos[a][b] = matrizTemporal[a][b];

			}

		}

	};

	public void pivote11Carlos() {
		double posicionr2Carlos = matrizCarlos[1][1];
		for (int f = 1; f < 2; f++) {
			for (int c = 0; c < 4; c++) {

				matrizCarlos[f][c] = (matrizCarlos[f][c] / posicionr2Carlos);
			}
		}
	}

	public void r2SegundaVueltaCarlos() {
		double variable10Carlos = matrizCarlos[1][0];

		for (int f = 0; f < 3; f++) {
			for (int c = 0; c < 4; c++) {
				matrizTemporal[f][c] = matrizCarlos[f][c];

			}
		}

		for (int a = 1; a < 2; a++) {
			for (int b = 0; b < 4; b++) {
				matrizTemporal[a][b] = matrizTemporal[0][b] * cambioDeValorCarlos(variable10Carlos)
						+ matrizCarlos[a][b];
				matrizCarlos[a][b] = matrizTemporal[a][b];
			}
		}
	}

	public void pivote22Carlos() {
		double posicionr3Carlos = matrizCarlos[2][2];
		for (int f = 2; f < 3; f++) {
			for (int c = 0; c < 4; c++) {
				matrizCarlos[f][c] = (matrizCarlos[f][c] / posicionr3Carlos);

			}
		}
	}

	public double[][] enviarValoresCarlos() {
		return matrizCarlos;
	}

}
