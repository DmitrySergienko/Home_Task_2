package ru.ds.hometask_2;

public class Calculator {

    //операции
    public void performOperation(Double number, String operation) {
        //если операнд ранее не был установлен при вводе первой операции
        if (MainActivity.operand == null) {
            MainActivity.operand = number;
        } else {
            if (MainActivity.lastOperation.equals("=")) {
                MainActivity.lastOperation = operation;
            }
            switch (MainActivity.lastOperation) {
                case "=":
                    MainActivity.operand = number;
                    break;
                case "/":
                    if (number == 0) {
                        MainActivity.operand = 0.0;
                    } else {
                        MainActivity.operand /= number;
                    }
                    break;
                case "*":
                    MainActivity.operand *= number;
                    break;
                case "+":
                    MainActivity.operand += number;
                    break;
                case "-":
                    MainActivity.operand -= number;
            }
        }
        MainActivity.resultField.setText(MainActivity.operand.toString().replace('.', ','));
        MainActivity.numberField.setText("");
    }
}


