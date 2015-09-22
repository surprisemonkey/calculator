/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Flia
 */
public class CalcController {
    private static CalcModel model;
    private static ViewCalculator view;
    private static ActionListener actionlistener;
    private static ActionListener result;
    private static ActionListener operand;
    private static String operandor = "";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         view = new ViewCalculator();
         view.setVisible(true);
         model = new CalcModel();
         
         actionlistener = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                 decimalButtonPressed();
             }
        };
        view.decimalButton.addActionListener(actionlistener);
                  
         actionlistener = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                oneButtonPressed();
             }
         };
         view.oneButton.addActionListener(actionlistener);
         
         actionlistener = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                twoButtonPressed();
             }
         };
         view.twoButton.addActionListener(actionlistener);
         
         actionlistener = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                threeButtonPressed();
             }
         };
         view.threeButton.addActionListener(actionlistener);
         
         actionlistener = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                fourButtonPressed();
             }
         };
         view.fourButton.addActionListener(actionlistener);
         
         actionlistener = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                fiveButtonPressed();
             }
         };
         view.fiveButton.addActionListener(actionlistener);
         
         actionlistener = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                sixButtonPressed();
             }
         };
         view.sixButton.addActionListener(actionlistener);
         
         actionlistener = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                sevenButtonPressed();
             }
         };
         view.sevenButton.addActionListener(actionlistener);
         
         actionlistener = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                eightButtonPressed();
             }
         };
         view.eightButton.addActionListener(actionlistener);
         
         actionlistener = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                nineButtonPressed();
             }
         };
         view.nineButton.addActionListener(actionlistener);

         actionlistener = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                zeroButtonPressed();
             }
         };
         view.zeroButton.addActionListener(actionlistener);
         
         actionlistener = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                 clearButtonPressed();
             }
         };
         view.clearButton.addActionListener(actionlistener);
         
         operand = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                plusButtonPressed();
             }
         };
         view.plusButton.addActionListener(operand);
         
         operand = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                minusButtonPressed();
             }
         };
         view.minusButton.addActionListener(operand);
         
         operand = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                multButtonPressed();
             }
         };
         view.multButton.addActionListener(operand);
         
         operand = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                divideButtonPressed();
             }
         };
         view.divideButton.addActionListener(operand);
         
         operand = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                sinButtonPressed();
             }
         };
         view.sinButton.addActionListener(operand);
         
         operand = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                cosButtonPressed();
             }
         };
         view.cosButton.addActionListener(operand);
         
         operand = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                tanButtonPressed();
             }
         };
         view.tanButton.addActionListener(operand);
         
         operand = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                expButtonPressed();
             }
         };
         view.expButton.addActionListener(operand);
         
         result = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                equalButtonPressed();
             }
         };
         view.equalButton.addActionListener(result);
         
         
    }
    public static void putText(String insert){
        view.jLabel1.setText(insert);
    }
    
    private static void decimalButtonPressed(){
        model.setOperand(".");
    }
    
    private static void oneButtonPressed(){
        model.setOperand("1");
    }
    
    private static void twoButtonPressed(){
        CalcModel.setOperand("2");
    }
    
    private static void threeButtonPressed(){
        CalcModel.setOperand("3");
    }
    
    private static void fourButtonPressed(){
        CalcModel.setOperand("4");
    }
    
    private static void fiveButtonPressed(){
        CalcModel.setOperand("5");
    }
    
    private static void sixButtonPressed(){
        CalcModel.setOperand("6");
    }
    
    private static void sevenButtonPressed(){
        CalcModel.setOperand("7");
    }
    
    private static void eightButtonPressed(){
        CalcModel.setOperand("8");
    }
    
    private static void nineButtonPressed(){
        CalcModel.setOperand("9");
    }
    
    private static void zeroButtonPressed(){
        CalcModel.setOperand("0");
    }
    
    private static void plusButtonPressed(){
        operandor = "+";
        CalcModel.setOperation(operandor, "");
    }
    
    private static void minusButtonPressed(){
        operandor = "-";
        CalcModel.setOperation(operandor, "");
    }
    
    private static void multButtonPressed(){
        operandor = "*";
        CalcModel.setOperation(operandor, "");
    }
    
    private static void divideButtonPressed(){
        operandor = "/";
        CalcModel.setOperation(operandor, "");
    }
    
    private static void sinButtonPressed(){
        operandor = "sin";
        CalcModel.setOperation(operandor, "");
    }
    
    private static void cosButtonPressed(){
        operandor = "cos";
        CalcModel.setOperation(operandor, "");
    }
    
    private static void tanButtonPressed(){
        operandor = "tan";
        CalcModel.setOperation(operandor, "");
    }
    
    private static void expButtonPressed(){
        operandor = "exp";
        CalcModel.setOperation(operandor, "");
    }
    
    private static void equalButtonPressed(){
        System.out.println(operandor + " this is the operandor");
        CalcModel.setOperation(operandor, "=");
    }
    private static void clearButtonPressed(){
        CalcModel.setClear();
    }
}
