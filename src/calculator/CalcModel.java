/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.ArrayList;
import java.lang.Math;

/**
 *
 * @author Flia
 */
public class CalcModel {
    private static String operand1 = "";
    private static Double operand2;
    private static double result = 0;
    private static ArrayList<Double> elements = new ArrayList<>();
    public static void setOperand(String adddigit) {
        operand1 += adddigit;
        CalcController.putText(operand1);
    }
    public static void setOperation(String operandor, String isequal){
        operand2 = Double.parseDouble(operand1);
        elements.add(operand2);
        if(operandor != "sin" && operandor != "cos" && operandor != "tan"){
            operand1= "";
        }
        if(isequal == "="){
            calculate(elements, operandor, operand2);
        }
    }

    public static void calculate(ArrayList<Double> elements, String operandor, Double operand2) {
        if(operandor == "+"){
            if(result == 0){
                result += elements.get(0) + elements.get(1);
                CalcController.putText(String.valueOf(result));
            } else {
                elements.add(result);
                result += elements.get(0);
            }
        } else if (operandor == "-"){
            if(result == 0){
                result = elements.get(0) - elements.get(1);
                CalcController.putText(String.valueOf(result));
            } else {
                elements.add(result);
                result -= elements.get(0);
            }
        } else if (operandor == "*"){
            if(result == 0){
                result = elements.get(0) * elements.get(1);
                CalcController.putText(String.valueOf(result));
            } else {
                elements.add(result);
                result *= elements.get(0);
            }
        } else if (operandor == "/"){
            if(result == 0){
                result = elements.get(0) / elements.get(1);
                CalcController.putText(String.valueOf(result));
            } else {
                elements.add(result);
                result /= elements.get(0);
            }
        } else if (operandor == "exp"){
            if(result == 0){
                result = Math.pow(elements.get(0),elements.get(1));
                CalcController.putText(String.valueOf(result));
            } else {
                elements.add(result);
                result = Math.pow(result, elements.get(0));
            }
        } else if (operandor == "sin"){
            if(result == 0){
                result = Math.sin(operand2);
            } else {
                elements.add(result);
                result = Math.sin(result);
            }
        } else if (operandor == "cos"){
            if(result == 0){
                result = Math.cos(operand2);
            } else {
                elements.add(result);
                result = Math.sin(result);
            }
        } else if (operandor == "tan"){
            if(result == 0){
                result = Math.tan(operand2);
            } else {
                elements.add(result);
                result = Math.sin(result);
            }
        }
        elements.clear();
        CalcController.putText(String.valueOf(result));
    }
    
    public static void setClear(){
        result = 0;
        elements.clear();
        operand1 = "";
        CalcController.putText("");
    }
}