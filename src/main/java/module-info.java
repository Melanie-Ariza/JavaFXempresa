 module uniquindio.edu.co.javafxempresa {
    requires javafx.controls;
    requires javafx.fxml;

    opens uniquindio.edu.co.javafxempresa to javafx.fxml;
    exports uniquindio.edu.co.javafxempresa;
    exports uniquindio.edu.co.javafxempresa.viewController;
    opens uniquindio.edu.co.javafxempresa.viewController to javafx.fxml;

}