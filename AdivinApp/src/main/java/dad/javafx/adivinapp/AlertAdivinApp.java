package dad.javafx.adivinapp;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AlertAdivinApp {

	public static void mostrarAlert(AlertType tipoAlerta, String cabecera, String contenido) {
		Alert alert = new Alert(tipoAlerta);
		alert.setTitle("AdivinApp");
		alert.setHeaderText(cabecera);
		alert.setContentText(contenido);
		
		alert.showAndWait();
	}	
	
	
}
