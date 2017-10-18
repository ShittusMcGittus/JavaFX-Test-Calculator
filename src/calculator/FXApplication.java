package calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXApplication extends Application {

public static void main(String[] args) {
    launch(args);
}

@Override
public void start(Stage primaryStage) {

    primaryStage.setTitle("Calculator");
    GridPane grid = new GridPane();
    grid.setAlignment(Pos.CENTER);
    grid.setHgap(10);
    grid.setVgap(10);
    grid.setPadding(new Insets(25, 25, 25, 25));

    Text scenetitle = new Text("Welcome");
    scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
    grid.add(scenetitle, 0, 0, 2, 1);

    Label numberOne = new Label("Number 1:");
    grid.add(numberOne, 0, 1);

    TextField numberOneTextField = new TextField();
    grid.add(numberOneTextField, 1, 1);

    Label numberTwo = new Label("Number 2:");
    grid.add(numberTwo, 0, 2);

    TextField numberTwoTextField = new TextField();
    grid.add(numberTwoTextField, 1, 2);

    Button plus = new Button("+");
    HBox hbPlus = new HBox(10);
    hbPlus.setAlignment(Pos.BOTTOM_RIGHT);
    hbPlus.getChildren().add(plus);
    grid.add(hbPlus, 1, 4);
    
    Button minus = new Button("-");
    HBox hbMinus = new HBox(10);
    hbMinus.setAlignment(Pos.BOTTOM_RIGHT);
    hbPlus.getChildren().add(minus);
    grid.add(hbMinus, 1, 3);

    final Text actiontarget = new Text();
    
    grid.add(actiontarget, 1, 6);

    plus.setOnAction(new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent e) {
            
            CharSequence num1 = numberOneTextField.getCharacters();
            String num1s = num1.toString();
            int num1i = Integer.parseInt(num1s);
            System.out.println(num1i);
            
            CharSequence num2 = numberTwoTextField.getCharacters();
            String num2s = num2.toString();
            int num2i = Integer.parseInt(num2s);
            System.out.println(num2i);
            
            int ans = num1i + num2i;
            System.out.println(ans);
            actiontarget.setFill(Color.FIREBRICK);
            String sAns = Integer.toString(ans);
            actiontarget.setText(sAns);

            
        }
    });
    minus.setOnAction(new EventHandler<ActionEvent>(){
        @Override
        public void handle(ActionEvent e) {
            
            CharSequence num1 = numberOneTextField.getCharacters();
            String num1s = num1.toString();
            int num1i = Integer.parseInt(num1s);
            System.out.println(num1i);
            
            CharSequence num2 = numberTwoTextField.getCharacters();
            String num2s = num2.toString();
            int num2i = Integer.parseInt(num2s);
            System.out.println(num2i);
            
            int ans = num1i - num2i;
            System.out.println(ans);
            actiontarget.setFill(Color.FIREBRICK);
            String sAns = Integer.toString(ans);
            actiontarget.setText(sAns);

            
        }
    });
    Scene scene = new Scene(grid, 300, 275);
    primaryStage.setScene(scene);
    primaryStage.show();

}

}
            //int num1 = 1;
            //int num2 = 2;
            //int ans = 0;
            //ans = num1 + num2;
            //
            //actiontarget.setX(ans);
