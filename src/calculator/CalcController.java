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
         view.eightButton.addActionListener(actionlistener);
         actionlistener = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                eightButtonPressed();
             }
         };
         view.sevenButton.addActionListener(actionlistener);
         
         view.nineButton.addActionListener(actionlistener);
         actionlistener = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                nineButtonPressed();
             }
         };
         view.sevenButton.addActionListener(actionlistener);
         
         view.nineButton.addActionListener(actionlistener);
         actionlistener = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                zeroButtonPressed();
             }
         };
         view.zeroButton.addActionListener(actionlistener);
         
         operand = new ActionListener(){
             public void actionPerformed(ActionEvent actionEvent){
                plusButtonPressed();
             }
         };
         view.plusButton.addActionListener(operand);
         
         
    }
    public static void putText(String insert){
        view.jLabel1.setText(insert);
    }
    
    private static void oneButtonPressed(){
        view.jLabel1.setText("1");
        model.setOperand("1");
    }
    
    private static void twoButtonPressed(){
        view.jLabel1.setText("2");
        CalcModel.setOperand("2");
    }
    
    private static void threeButtonPressed(){
        view.jLabel1.setText("3");
        CalcModel.setOperand("3");
    }
    
    private static void fourButtonPressed(){
        view.jLabel1.setText("4");
        CalcModel.setOperand("4");
    }
    
    private static void fiveButtonPressed(){
        view.jLabel1.setText("5");
        CalcModel.setOperand("5");
    }
    
    private static void sixButtonPressed(){
        view.jLabel1.setText("6");
        CalcModel.setOperand("6");
    }
    
    private static void sevenButtonPressed(){
        view.jLabel1.setText("7");
        CalcModel.setOperand("7");
    }
    
    private static void eightButtonPressed(){
        view.jLabel1.setText("8");
        CalcModel.setOperand("8");
    }
    
    private static void nineButtonPressed(){
        view.jLabel1.setText("9");
        CalcModel.setOperand("9");
    }
    
    private static void zeroButtonPressed(){
        view.jLabel1.setText("0");
        CalcModel.setOperand("0");
    }
    
    private static void plusButtonPressed(){
        CalcModel.setOperation();
        CalcModel.setOperand("1");
    }
    
    private static void equalButton(){
        
    }
}
