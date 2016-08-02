
public class Calculadora {
	
	private int primerNum;
	private int segundoNum;
	private String operacion;
	
	
	public int getPrimerNum() {
		return primerNum;
	}
	public void setPrimerNum(int primerNum) {

		this.primerNum = primerNum;
	}
	public int getSegundoNum() {
		return segundoNum;
	}
	public void setSegundoNum(int segundoNum) {
		this.segundoNum = segundoNum;
	}
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		
		this.operacion = operacion;
	}
	
	
	public int Resultado(){
		int resultado =0;
		switch (operacion) {
		case "+":
			resultado = primerNum + segundoNum;
			break;
		case "-":
			resultado = primerNum - segundoNum;
			break;
		case "*":
			resultado = primerNum * segundoNum;
			break;
		case "/":
			resultado = primerNum / segundoNum;
			break;

		}
		return resultado;
	}

}
