package pe.edu.upn.demo01.dto;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog https://gcoronelc.blogspot.com/
 * @email gcoronelc@gmail.com
 * @youtube https://www.youtube.com/DesarrollaSoftware
 * @facebook https://www.facebook.com/groups/desarrollasoftware/
 * @cursos https://gcoronelc.github.io/
 */
public class TablaDto {

	private int num1;
	private String oper;
	private int num2;
	private int rpta;

	public TablaDto() {
	}

	public TablaDto(int num1, String oper, int num2, int rpta) {
		this.num1 = num1;
		this.oper = oper;
		this.num2 = num2;
		this.rpta = rpta;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public String getOper() {
		return oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getRpta() {
		return rpta;
	}

	public void setRpta(int rpta) {
		this.rpta = rpta;
	}

	@Override
	public String toString() {
		String texto = this.num1 + "\t" + this.oper + "\t" + this.num2 + "\t=\t" + this.rpta;
		return texto;
	}

	
}
