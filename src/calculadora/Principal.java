package calculadora;

import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Locale locale = new Locale("pt", "BR");
		NumberFormat f = NumberFormat.getNumberInstance(locale);

		String n1 = JOptionPane.showInputDialog(null, "Info number N1", "N1", JOptionPane.QUESTION_MESSAGE);
		String n2 = JOptionPane.showInputDialog(null, "Info number N2", "N2", JOptionPane.QUESTION_MESSAGE);

		String numbers = String.format("Numbers: N1 = %s ; N2 = %s", n1, n2);
		
		String sum = String.format("\n\nSum N1 + N2 = %s", f.format(sum(Float.parseFloat(n1), Float.parseFloat(n2))));
		
		String sub = String.format("\n\nSubtract N1 - N2 = %s", f.format(sub(Float.parseFloat(n1), Float.parseFloat(n2))));

		String mult = String.format("\n\nMultiplication N1 * N2 = %s", f.format(mult(Float.parseFloat(n1), Float.parseFloat(n2))));
		
		String div = String.format("\n\nDivision N1 / N2 = %s", f.format(div(Float.parseFloat(n1), Float.parseFloat(n2))));
		
		StringBuilder builder = new StringBuilder();
		builder.append(numbers);
		builder.append(sum);
		builder.append(sub);
		builder.append(mult);
		builder.append(div);
		
		JOptionPane.showMessageDialog(null, builder.toString(), "Result", JOptionPane.INFORMATION_MESSAGE);
	}

	public static float sum(float a, float b) {
		return a + b;
	}

	public static float sub(float a, float b) {
		return a - b;
	}

	public static float mult(float a, float b) {
		return a * b;
	}

	public static float div(float a, float b) {
		return a / b;
	}

}
