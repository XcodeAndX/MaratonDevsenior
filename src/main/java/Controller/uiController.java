package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class uiController {

    @FXML
    private TextField Cantidad;

    @FXML
    private TextField Precio;

    @FXML
    private TextField Product_name;

    @FXML
    private TableColumn<?, ?> cantidad;

    @FXML
    private TableColumn<?, ?> cost;

    @FXML
    private TableColumn<?, ?> productName;

}
