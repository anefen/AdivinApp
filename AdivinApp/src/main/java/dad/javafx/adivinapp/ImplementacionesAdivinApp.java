package dad.javafx.adivinapp;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ImplementacionesAdivinApp {

	public static void numeroCorrectoAlert(Integer intento) {

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("AdivinApp");
		alert.setHeaderText("¡Has ganado!");
		alert.setContentText("Sólo has necesitado " + intento + " intentos. \n\nVuelve a jugar y hazlo mejor.");

		alert.showAndWait();

	}

	public static void numeroIncorrectoMayorAlert(Integer intento, Integer numeroComprobar) {

		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle("AdivinApp");
		alert.setHeaderText("¡Has fallado!");
		alert.setContentText("El número a adivinar es menor que "+numeroComprobar+". \n\nVuelve a intentarlo.");

		alert.showAndWait();
	}
	
	public static void numeroIncorrectoMenorAlert(Integer intento, Integer numeroComprobar) {

		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle("AdivinApp");
		alert.setHeaderText("¡Has fallado!");
		alert.setContentText("El número a adivinar es mayor que "+numeroComprobar+". \n\nVuelve a intentarlo.");

		alert.showAndWait();
	}

	public static void valorErroneoAlert() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("AdivinApp");
		alert.setHeaderText("Error");
		alert.setContentText("El número introducido no es válido.");

		alert.showAndWait();
	}

}
