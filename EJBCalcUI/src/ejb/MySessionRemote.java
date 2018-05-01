/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Remote;

/**
 *
 * @author Tiago Matias
 */
@Remote
public interface MySessionRemote {

    String getResult();

    double calcExp(int base, int exp);

    double squareRoot(int x);

    double cubicSquare(int x);

    double opLog(int base, int exp);
    
}
