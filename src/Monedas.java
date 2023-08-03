import javax.swing.JOptionPane;

public interface Monedas {
	public static void SeleccionarMonedas(double valor) {

	String Monedas[] = { "Pesos a Dolar", "Dolar a Pesos"};
	String MonedaSeleccionada =(String) JOptionPane.showInputDialog(null,
            "SeleccioneTipo De Moneda", "Monedas",
            JOptionPane.INFORMATION_MESSAGE, null,
            Monedas, Monedas[0]);
	if(MonedaSeleccionada=="Dolar a Pesos") {
		double total= Math.round((valor*(3400))*100.0)/100.0;
		JOptionPane.showMessageDialog(null, "Usted tiene " +total+ " Pesos");
		Confirmarsalida();
	}else {
		double total=Math.round((valor/(3400))*100.0)/100.0;
	    JOptionPane.showMessageDialog(null, "Usted tiene " +total+ " Dolares");
	    Confirmarsalida();
	}
	
	}
	public static void Confirmarsalida() {
		int  x =JOptionPane.showConfirmDialog(null, "Desea hacer otra convercion","CONFIRMACION DESALIDA",JOptionPane.YES_NO_CANCEL_OPTION);
		 System.out.println(x);
		if (x==0)
			 VentanasDialogo.main(null);
		 if (x==1) {
			salir();
		}
	}
	public static void salir(){
		JOptionPane.showMessageDialog(null, "Gracias por usar convertidor D.E.S.R");
	}
	
}
