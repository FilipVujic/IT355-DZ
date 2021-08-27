/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz02;

/**
 *
 * @author filip
 */
public class Main {

    public static void main(String[] args) {

        ZivotinjaService zs1 = new ZivotinjaService();
        ZivotinjaService zs2 = new ZivotinjaService();
        ZivotinjaService zs3 = new ZivotinjaService();

        zs1.setZivotinja(new Pas());
        zs2.setZivotinja(new Ovca());
        zs3.setZivotinja(new Kokoska());
        
        zs1.getZivotinja().nacinOglasavanja();
        zs1.getZivotinja().nahraniZivotinju();

        zs2.getZivotinja().nacinOglasavanja();
        zs2.getZivotinja().nahraniZivotinju();

        zs3.getZivotinja().nacinOglasavanja();
        zs3.getZivotinja().nahraniZivotinju();
    }
}
