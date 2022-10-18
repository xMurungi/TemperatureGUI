import java.util.Random;

import javax.swing.JOptionPane;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random temperature = new Random();
		int temp = temperature.nextInt(56);
		
		if(temp>=30 && temp <= 37) {
			JOptionPane.showMessageDialog(null, "The temperature is " +temp +" degrees celcius. It is hot outside.");
		}
		else if (temp>=20 && temp<30)/*both conditions must be true*/ {
			JOptionPane.showMessageDialog(null,"The temperature is " +temp + " degrees celcius. It is warm outside.");
		}
		else if(temp <= 19){
			JOptionPane.showMessageDialog(null,"The temperature is " +temp +" degrees celcius. It is extremely cold outside.");
		}
		else{
			JOptionPane.showMessageDialog(null, "The temperature is " +temp +" degrees celcius. Hide in your freezer you might get barbecued.");
		}
	}

}
