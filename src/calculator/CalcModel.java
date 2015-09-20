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
    private static String operation = "";
    private static Integer operand1;
    private static Integer operand2;
    public static void setOperand(Integer operand) {
        if(operand1 == null){
            operand1  = operand;
        } else if (operand2 == null) {
            operand2 = operand;
        }
    }
}


