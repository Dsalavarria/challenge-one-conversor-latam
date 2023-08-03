import javax.swing.JOptionPane;
@SuppressWarnings("serial")
public class VentanasDialogo extends JOptionPane implements Monedas{
	static String ValorSeleccionado;
	public static void main(String[] args) {
	String valoresposibles[] = { "Convertidor de Monedas", "Convertidor de Distancia"};
	ValorSeleccionado =(String) JOptionPane.showInputDialog(null,
            "Seleccione Una Opcion", "Menu Principal",
            JOptionPane.INFORMATION_MESSAGE, null,
            valoresposibles, valoresposibles[0]);
	ingreso(ValorSeleccionado);
	}
	public static void ingreso(String valor) {
		switch (valor) {
		case "Convertidor de Monedas":
			String entrada = JOptionPane.showInputDialog("Ingrese valor a convertir");
		    if(ValidarIngreso(entrada)) {
			   double valor1 =Double.parseDouble(entrada);
			   Monedas.SeleccionarMonedas(valor1);
		    }else {
			  JOptionPane.showMessageDialog(null, "Valor no valido");
			  ingreso(ValorSeleccionado);
		    }
		 break;
		case "Convertidor de Distancia":
			String entrada2 = JOptionPane.showInputDialog("Ingrese distancia a convertir");
			if(ValidarIngreso(entrada2)){
				double valor1 =Double.parseDouble(entrada2);
				Longitud.SeleccionarLongitud(valor1);
			}else {
	    	   JOptionPane.showMessageDialog(null, "Valor no valido");
			   ingreso(ValorSeleccionado);}
		break;
		default:
		}
//		if(valor=="Convertidor de Monedas") {
//			String entrada = JOptionPane.showInputDialog("Ingrese valor a convertir");
//			if(ValidarIngreso(entrada)) {
//				double valor1 =Double.parseDouble(entrada);
//				Monedas.SeleccionarMonedas(valor1);
//			}else {
//				JOptionPane.showMessageDialog(null, "Valor no valido");
//				ingreso(ValorSeleccionado);}
//		}
//		else if (valor=="Convertidor de Distancia") {
//			    String entrada = JOptionPane.showInputDialog("Ingrese distancia a convertir");
//			    if(ValidarIngreso(entrada)){
//			       double valor1 =Double.parseDouble(entrada);
//			       Longitud.SeleccionarLongitud(valor1);}
//			    else {
//			    	JOptionPane.showMessageDialog(null, "Valor no valido");
//					ingreso(ValorSeleccionado);
//				}
//		} else {
//			Monedas.salir();
//		}
	}
	public static boolean ValidarIngreso(String entrada) {
		try {
			double x = Double.parseDouble(entrada);
			if(x>=0 || x<= 0)
				return true;
		}catch (NumberFormatException e) {
		  return false;
		  }
		return false;
 			}
		}
	

	
