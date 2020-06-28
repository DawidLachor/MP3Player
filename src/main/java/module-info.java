module mp3player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires jid3lib;
    requires javafx.media;

    exports dev.dawidlachor to javafx.graphics;
    opens dev.dawidlachor.controller to javafx.fxml;
    opens dev.dawidlachor.mp3 to javafx.base;
}