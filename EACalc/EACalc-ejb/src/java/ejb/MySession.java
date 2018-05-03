/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import static java.lang.Math.cbrt;
import static java.lang.Math.log;
import static java.lang.Math.pow;
;import static java.lang.Math.sqrt;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;

/**
 *
 * @author Tiago Matias
 */
@Stateless
public class MySession implements MySessionRemote {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public String getResult() {
        return "This is My Session Bean";
    }

    @Override
    @RolesAllowed("high")
    public double calcExp(int base, int exp) {
        double result = pow(base, exp);
        return result;
    }

    @Override
    @RolesAllowed("medium")
    public double squareRoot(int x) {
        double result = sqrt(x);
        return result;
    }

    @Override
    @RolesAllowed("medium")
    public double cubicSquare(int x) {
        return cbrt(x);
    }

    @Override
    @RolesAllowed("low")
    public double opLog(int base, int exp) {
        return (log(base)/log(exp));
    }
    
    
}
