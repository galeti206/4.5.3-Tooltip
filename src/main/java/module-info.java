module es.ieslosmontecillos.tooltip {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.tooltip to javafx.fxml;
    exports es.ieslosmontecillos.tooltip;
}