package entities;

public class Triangle {
	
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public double getLadoA() {
		return ladoA;
	}
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	public double getLadoC() {
		return ladoC;
	}
	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}

	
	public double calculaP() {
		return (ladoA + ladoB + ladoC) / 2.0;
	}
	
	public double calculaArea() {
		double P = calculaP();
		return Math.sqrt(P * (P - ladoA) * (P - ladoB) * (P -ladoC));
	}
	
	

}
