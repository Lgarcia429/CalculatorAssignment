package marchseventeen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LayoutGUIController {
    private String currentOp;
    float num1=0, num2;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button plusBtn;
    @FXML
    private Button eqBtn;
    @FXML
    private TextField txt1;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button minusBtn;
    @FXML
    private Button btn9;
    @FXML
    private Button btn8;
    @FXML
    private Button btn7;
    @FXML
    private Button multiBtn;
    @FXML
    private Button btn0;
    @FXML
    private Button divBtn;
    @FXML
    private Button negateBtn;
    @FXML
    void addNum(ActionEvent event) {
        
        if( ((Button)event.getSource()).getText().equals("1")){
            txt1.setText(txt1.getText() + "1");
        }
        if( ((Button)event.getSource()).getText().equals("2")){
            txt1.setText(txt1.getText() + "2");
        }
        if( ((Button)event.getSource()).getText().equals("3")){
            txt1.setText(txt1.getText() + "3");
        }
        if( ((Button)event.getSource()).getText().equals("4")){
            txt1.setText(txt1.getText() + "4");
        }
        if( ((Button)event.getSource()).getText().equals("5")){
            txt1.setText(txt1.getText() + "5");
        }
        if( ((Button)event.getSource()).getText().equals("6")){
            txt1.setText(txt1.getText() + "6");
        }
        if( ((Button)event.getSource()).getText().equals("7")){
            txt1.setText(txt1.getText() + "7");
        }
        if( ((Button)event.getSource()).getText().equals("8")){
            txt1.setText(txt1.getText() + "8");
        }
        if( ((Button)event.getSource()).getText().equals("9")){
            txt1.setText(txt1.getText() + "9");
        }
        if( ((Button)event.getSource()).getText().equals("0")){
            txt1.setText(txt1.getText() + "0");
        }
    }

    @FXML
    void addOp(ActionEvent event) {
        num1 = Integer.parseInt(txt1.getText());
        txt1.clear();
        currentOp = "add";
    }

    @FXML
    void divideOp(ActionEvent event) {
        num1 = Integer.parseInt(txt1.getText());
        txt1.clear();
        currentOp = "divide";
    }

    @FXML
    void multiplyOp(ActionEvent event) {
        num1 = Integer.parseInt(txt1.getText());
        txt1.clear();
        currentOp = "multiply";
    }

    @FXML
    void negOp(ActionEvent event) {
        num1 = Integer.parseInt(txt1.getText());
        txt1.clear();
        currentOp = "subtract";
    }
    @FXML
    void eqOp(ActionEvent event) {
        float result;
        switch(currentOp){
            case "add":
                num2 = Integer.parseInt(txt1.getText());
                result = num1 + num2;
                txt1.setText(result + "");
                break;
                
            case "multiply":
                num2 = Integer.parseInt(txt1.getText());
                result = num1 * num2;
                txt1.setText("" + result);
                break;
                
            case "subtract":
                num2 = Integer.parseInt(txt1.getText());
                result = num1 - num2;
                txt1.setText("" + result);
                break;
                
            case "divide":
                num2 = Integer.parseInt(txt1.getText());
                if(num2 == 0){
                    txt1.setText("Can't divide by 0!");
                    break;
                }
                result = num1 / num2;
                txt1.setText("" + result);
                break;
        }
    }
 @FXML
 void clearIt(ActionEvent event) {
     txt1.clear();
    }    
}
    
