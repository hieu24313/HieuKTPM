module com.mycompany.newpj {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.newpj to javafx.fxml;
    exports com.mycompany.newpj;
}
