import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;


import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class SorterGui extends Application {
    public static void main(String []args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final int SIZE = 10;
        String[] list = new String[SIZE];

        Font font = new Font("Calibri," ,20);
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(10));

        Label label = new Label("Enter"+ SIZE + "numbers:");
        Label sortedList = new Label(" Sorted List");
        label.setFont(font);
        sortedList.setFont(font);
        TextField[] textfield = new TextField[SIZE];

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setHgap(6);

        borderPane.setTop(label);
        borderPane.setCenter(gridPane);
        borderPane.setBottom(sortedList);
        Scene scene = new Scene (borderPane);

        for (int i= 0; i<textfield.length; i++){
            textfield[i]= new TextField();
            gridPane.add(textfield[i],i,0);
            textfield[i].setOnAction(e->{
                for (int k=0; k<list.length; k++){
                    String []doneList;
                    list[k]=textfield[k].getText();
                    doneList = SortArray.sort(list);
            }
            System.out.println("Test " + list[0]);
        });


    }
    primaryStage.setScene(scene);
        primaryStage.show();
    }


}
