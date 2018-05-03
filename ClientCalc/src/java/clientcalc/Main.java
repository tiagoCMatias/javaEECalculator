/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientcalc;

import ejb.MySessionRemote;
import javax.ejb.EJB;
/**
 *
 * @author Tiago Matias
 */
public class Main{

    @EJB
    private static MySessionRemote mySession;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalcUI calcui = new CalcUI(mySession);
        calcui.setVisible(true);
        
        System.err.println("Test result = " + mySession.getResult());
        //High
        try{
            System.err.println("High result = " + mySession.calcExp(2,2));
        }
        catch (Exception e){
            System.err.println("No Permissions for CalcExp");
        }
        //Medium
        try{
            System.err.println("Medium result = " + mySession.squareRoot(8));
            System.err.println("Medium result = " + mySession.cubicSquare(8));

        }
        catch (Exception e){
            System.err.println("No Permissions for cubicSquare and squareRoot");
        }
        
        //low
        try{
            System.err.println("Low result = " + mySession.opLog(10,10));
        }
        catch (Exception e){
            System.err.println("No Permissions for opLog");
        }
        
    }
    
}
