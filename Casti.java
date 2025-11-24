/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electronice;

/**
 *
 * @author danut
 */
public class Casti extends Electronice implements Stare{
    private boolean wireless;
    private String tip; //in-ear on-ear 
    private int autonomieBaterie; // ore functionare
    private boolean rezistentaApa;
    private boolean areMicrofon;
    private boolean noiceCancellation;
    
    public Casti()
    {
        super();
        this.wireless= false;
        this.tip=null;
        this.autonomieBaterie= 0;
        this.rezistentaApa=false;
        this.areMicrofon= false;
        this.noiceCancellation = false;
    }
    public Casti (String marca, String numeProdus, double pret, boolean disponibil, boolean wireless,
            String tip, int autonomieBaterie, boolean rezistentaApa, boolean areMicrofon, boolean noiceCancellation)
    {
        super(marca, numeProdus, pret, disponibil);
        this.wireless= wireless;
        this.tip=tip;
        this.autonomieBaterie= autonomieBaterie;
        this.rezistentaApa= rezistentaApa;
        this.areMicrofon= areMicrofon;
        this.noiceCancellation = noiceCancellation;
    }
    public Casti (Casti a)
    {
        super(a);
        this.wireless=a.wireless;
        this.tip=a.tip;
        this.autonomieBaterie=a.autonomieBaterie;
        this.rezistentaApa=a.rezistentaApa;
        this.areMicrofon=a.areMicrofon;
        this.noiceCancellation=a.noiceCancellation;
    }
    
    @Override
    public String toString ()
    {
        return super.toString() + "Wireless: "+ wireless + ", Tip: "+tip+", Autonomie Baterie: "+ autonomieBaterie+
                "ore , Rezistenta la Apa:"+rezistentaApa+", Microfon: "+areMicrofon+", Noice Cancellation: "+noiceCancellation;
    }
    
    public void setWireless (boolean wireless)
    {
        this.wireless=wireless;
    }
    public boolean getWireless ()
    {
        return wireless;
    }
    
    public void setTip (String tip)
    {
        this.tip=tip;
    }
    public String getTip ()
    {
        return tip;
    }
    
    public void setAutonomieBaterie(int autonomieBaterie)
    {
        this.autonomieBaterie=autonomieBaterie;
    }
    public int getAutonomieBaterie ()
    {
        return autonomieBaterie;
    }
    
    public void setRezistentaApa (boolean rezistentaApa)
    {
        this.rezistentaApa=rezistentaApa;
    }
    public boolean getRezistentaApa ()
    {
        return rezistentaApa;
    }
    
    public void setAreMicrofon (boolean areMicrofon)
    {
        this.areMicrofon=areMicrofon;
    }
    public boolean getAreMicrofon ()
    {
        return areMicrofon;
    }
    
    public void setNoiceCancellation (boolean noiceCancellation)
    {
        this.noiceCancellation=noiceCancellation;
    }
    public boolean getNoiceCancellation ()
    {
        return noiceCancellation;
    }

    @Override
    public void nou() {
        System.out.println("Castile sunt noi");
    }

    @Override
    public void resigilat() {
        System.out.println("Castile sunt resigilate");
    }

    public static void filtreazaCasti(Object[] vector, int pretMaxim, boolean areRezistentaApa) 
    {
        System.out.println("\nBoxe care au pretul maxim de "+pretMaxim+"lei si rezistenta apa: "+areRezistentaApa+":");
        for (Object obj : vector) 
        {
            Casti c = (Casti) obj;
            if (c.getPret() < pretMaxim && c.getRezistentaApa() == areRezistentaApa)
            {
                System.out.println(c);
            }
        }
    }
}


