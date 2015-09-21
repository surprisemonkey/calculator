/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Flia
 */
public class CalcModel {
    private static int operand = 0;
    private static String operand1 = "";
    private static String operand2 = "";
    private static double result;
    private static CalcController controller;
    public static void setOperand(String adddigit) {
        if(operand == 0){
            operand1 += adddigit;
            CalcController.putText(operand1);
        } else {
            operand2 += adddigit;
            CalcController.putText(operand2);
        }
    }
    public static void setOperation(){
        operand = 1;
    }
    
    public static void calculate(int sign){
        double change1 = Double.parseDouble(operand1);
        double change2 = Double.parseDouble(operand2);
        if(sign == 0) {
        } else if (sign == 1){
            result = change1 - change2;
        } else if (sign == 2){
            result = change1*change2;
        } else if (sign == 3){
            result = change1/change2;
        } else {
            result = change1 + change2;
        }
    }
}


