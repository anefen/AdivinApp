package dad.javafx.adivinapp;

import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AdivinApp extends Application {

	private Label valorLabel = new Label();
	private TextField numeroField = new TextField();
	private Button comprobarButton = new Button();
	private Button aceptarButton = new Button();
	private VBox root = new VBox();
	private Random random = new Random();
	private Integer numeroRandom = random.nextInt(100)+1;
	private Integer intentos = 0;

	@Override
	public void start(Stage window) throws Exception {
		comprobarButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				try {
					Integer parseNumeroField = Integer.parseInt(numeroField.getText());
					System.out.println(numeroRandom);
					if (parseNumeroField == numeroRandom) {
						intentos++;
						ImplementacionesAdivinApp.numeroCorrectoAlert(intentos);
					} else if (parseNumeroField > numeroRandom) {
						intentos++;
						ImplementacionesAdivinApp.numeroIncorrectoMayorAlert(intentos, parseNumeroField);
					} else if (parseNumeroField < numeroRandom) {
						intentos++;
						ImplementacionesAdivinApp.numeroIncorrectoMenorAlert(intentos, parseNumeroField);
					}

				} catch (Exception e) {
					ImplementacionesAdivinApp.valorErroneoAlert();
				}

			}
		});
		comprobarButton.setText("Comprobar");
		aceptarButton.setText("Aceptar");
		valorLabel.setText("Introduce un número del 1 al 100");
		numeroField.setText("0");
		numeroField.setAlignment(Pos.CENTER);
		numeroField.setMaxWidth(150);

		Scene scene = new Scene(root, 300, 250);
		root.getChildren().addAll(valorLabel, numeroField, comprobarButton);
		root.setAlignment(Pos.CENTER);
		window.setTitle("AdivinApp");
		window.setScene(scene);
		window.show();

	}

	public static void main(String[] args) {

		launch(args);

	}

}
