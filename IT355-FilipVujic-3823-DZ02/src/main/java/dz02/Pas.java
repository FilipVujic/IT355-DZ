/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz02;

import org.springframework.stereotype.Component;



/**
 *
 * @author filip
 */
@Component
public class Pas implements Zivotinja {

    public void Pas() {
       
    }
   

    @Override
    public void nacinOglasavanja() {
        System.out.println("Pas kaze av av.");
    }

    @Override
    public void nahraniZivotinju() {
        System.out.println("Pas je pojeo hranu.");
    }
    
    
}
