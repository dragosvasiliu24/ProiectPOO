/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electronice;

/**
 *
 * @author danut
 */
public class VecotriCastiBoxa {
    public static void main(String[] args) 
    {
        Electronice e1 = new Electronice(); 
        Electronice e2 = new Electronice("Samsung", "PowerBank 10000", 149.99, true);
        Electronice e3 = new Electronice(e2); 
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        Casti c1 = new Casti(); 
        Casti c2 = new Casti( "Apple", "Casti Apple AirPods 4", 799.99, true, true, "in-ear",30, true, true, true); 
        Casti c3 = new Casti(c2); 
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        Boxa_portabila b1 = new Boxa_portabila(); 
        Boxa_portabila b2 = new Boxa_portabila("JBL", "Boxa portabila JBL Go 4", 238.08, true, "plastic","negru", 85, 190,  7, 850, 10); 
        Boxa_portabila b3 = new Boxa_portabila(b2); 
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        
        System.out.println("\nVector Electronice");
        Object[] electroniceVector = new Object[10];
        for (int i = 0; i < 10; i++) {
            electroniceVector[i] = new Electronice("Marca" + i, "Produs" + i, 100 + i * 10, i % 2 == 0);
        }
        for (Object e : electroniceVector) {
            System.out.println(e);
        }

        Object[] castiVector = new Object[10];
        for (int i = 0; i < 10; i++) {
            castiVector[i] = new Casti("MarcaCasti" + i,"ModelCasti" + i,100 + i * 50, i % 2 == 0, i % 2 == 1, "in-ear", 20 + i, i % 2 == 0,
            i % 2 == 1, i % 2 == 1);
        }
        System.out.println("\nVector Casti");
        for (Object c : castiVector) {
            System.out.println(c);
        }
        
        Object[] boxeVector = new Object[10];
        for (int i = 0; i < 10; i++) {
            boxeVector[i] = new Boxa_portabila( "MarcaBoxa" + i,"Boxa" + i,300 + i * 25,i % 2 == 1,"plastic","negru",80 + i,0.4 + i * 0.1,10 + i, 
            4000 + i * 100,5 + i);
        }
        System.out.println("\nVector Boxa portabila");
        for (Object b : boxeVector) {
            System.out.println(b);
        }
        Boxa_portabila.filtreazaBoxe(boxeVector, 10, 1.0);
        Casti.filtreazaCasti(castiVector, 350, true);

        Boxa_portabila.scrieBoxeInFisier(boxeVector, "Boxe.txt");
        Casti.scrieCastiInFisier(castiVector, "Casti.txt");
    }
}


