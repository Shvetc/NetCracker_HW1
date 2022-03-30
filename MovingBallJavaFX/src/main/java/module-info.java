module com.netcracker.movingballjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.netcracker.movingballjavafx to javafx.fxml;
    exports com.netcracker.movingballjavafx;
}