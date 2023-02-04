module hr.java.pubquiz {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens hr.java.pubquiz to javafx.fxml;
    exports hr.java.pubquiz;
}