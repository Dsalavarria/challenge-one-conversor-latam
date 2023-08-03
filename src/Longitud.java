import javax.swing.JOptionPane;

public interface Longitud {
	public static void SeleccionarLongitud(double valor) {

		String longitud[] = { "metros a Centimetros", "Cenrimetros a Metros"};
		String LongitugSeleccionada =(String) JOptionPane.showInputDialog(null,
	            "Seleccione la unidad a la que desea transformar", "longitud",
	            JOptionPane.INFORMATION_MESSAGE, null,
	            longitud, longitud[0]);
		if(LongitugSeleccionada=="metros a Centimetros") {
			double total= Math.round((valor*(100))*100.0)/100.0;
			JOptionPane.showMessageDialog(null,valor+ " Metro Tiene " +total+ " Centimetros");
			Monedas.Confirmarsalida();
		}else {
			double total=Math.round((valor/(100))*100.0)/100.0;
		    JOptionPane.showMessageDialog(null,valor+ " Centimetros equivalen a " +total+ " Metros");
		    Monedas.Confirmarsalida();
		}
	}
}
