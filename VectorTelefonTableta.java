/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.aciee.electronice;

/**
 *
 * @author ac1019
 */
public class VectorTelefonTableta {
    public static void main(String[] args)
    {
        Object[] electroniceVector = new Object[10];
        for (int i = 0; i < 10; i++) {
            electroniceVector[i] = new Electronice("Marca" + i, "Produs" + i, 100 + i * 10, i % 2 == 0);
        }
        for (Object e : electroniceVector) {
            System.out.println(e);
        }
        
        Telefon[] telefonVector=new Telefon[10];
        for(int i=0;i<10;i++){
            telefonVector[i]=new Telefon("Marca telefon"+i,"Produs"+i,1500+i*50,i%2==1,2+i*2,4+i*2,8+i,"Culoare"+i,i%2==1);
        }
         for (Object t : telefonVector) {
            System.out.println(t);
        }
         
         Tableta[] tabletaVector=new Tableta[10];
        for(int i=0;i<10;i++){
            tabletaVector[i]=new Tableta("Marca tableta"+i,"Produs"+i,1200+i*50,i%2==1,5+i,350+i*2,12+i,i%2==0,"Rezolutie"+i);
        }
         for (Object p : tabletaVector) {
            System.out.println(p);
         }
         
        Electronice e1 = new Electronice();
        Electronice e2 = new Electronice("Arctic", "Frigider", 369.99, true);
        Electronice e3 = new Electronice(e2);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        Telefon a1= new Telefon();
        Telefon a2=new Telefon("Samsung","S24",2500,true,12,8,256,"Green",true);
        Telefon a3=new Telefon(a2);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        
        Tableta b1=new Tableta();
        Tableta b2=new Tableta("Xiaomi","Model 7",3000,false,13,500,28,true,"1340x800");
        Tableta b3=new Tableta(b2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        
        Telefon.filtreazaTelefoane(telefonVector,10,true);
        Tableta.filtreazaTablete(tabletaVector, 364, true);
    }
  
}
