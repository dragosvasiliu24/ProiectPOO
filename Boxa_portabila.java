/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electronice;

/**
 *
 * @author danut
 */
public class Boxa_portabila extends Electronice implements Stare{
    private String material;
    private String culoare;
    private int sensibilitate; // in dB, cat de tare se aude
    private double greutate;
    private int autonomieAcumulator; //autonomie acumulator in ore
    private int capacitateAcumulator; //in mAh
    private int distantaMaxima; //distanta maxima de operare
   
    public Boxa_portabila ()
    {
        super();
        this.material=null;
        this.culoare=null;
        this.sensibilitate=0;
        this.greutate=0;
        this.autonomieAcumulator=0;
        this.capacitateAcumulator=0;
        this.distantaMaxima=0;
    }
    public Boxa_portabila (String marca, String numeProdus, double pret, boolean disponibil, String material, 
            String culoare, int sensibilitate, double greutate, int autonomieAcumulator, int capacitateAcumulator, int distantaMaxima)
    {
        super(marca, numeProdus, pret, disponibil);
        this.material=material;
        this.culoare=culoare;
        this.sensibilitate=sensibilitate;
        this.greutate=greutate;
        this.autonomieAcumulator=autonomieAcumulator;
        this.capacitateAcumulator=capacitateAcumulator;
        this.distantaMaxima=distantaMaxima;
    }
    public Boxa_portabila (Boxa_portabila a)
    {   
        super(a);
        this.material=a.material;
        this.culoare=a.culoare;
        this.sensibilitate=a.sensibilitate;
        this.greutate=a.greutate;
        this.autonomieAcumulator=a.autonomieAcumulator;
        this.capacitateAcumulator=a.capacitateAcumulator;
        this.distantaMaxima=a.distantaMaxima;
    }
    @Override 
    public String toString()
    {
        return super.toString() + "Material: "+material+", Culoare: "+culoare+", Sensibilitate: "+sensibilitate+
                "dB, Greutate: "+greutate+", Autonomie acumulator: "+autonomieAcumulator+"ore, Capacitate Acumulator: "+
                capacitateAcumulator+"mAh, Distanta maxima de operare: "+distantaMaxima+" metri";
    }
    
    public void setMaterial (String material)
    {
        this.material=material;
    }
    public String getMaterial ()
    {
        return material;
    }
    
    public void setCuloare (String culoare)
    {
        this.culoare=culoare;
    }
    public String getCuloare ()
    {
        return culoare;
    }
    
    public void setSensibilitate(int sensibilitate)
    {
        this.sensibilitate=sensibilitate;
    }
    public int getSensibilitate ()
    {
        return sensibilitate;
    }
    
    public void setGreutate (double greutate)
    {
        this.greutate=greutate;
    }
    public double getGreutate ()
    {
        return greutate;
    }
    
    public void setAutonomieAcumulator(int autonomieAcumulator)
    {
        this.autonomieAcumulator=autonomieAcumulator;
    }
    public int getAutonomieAcumulator ()
    {
        return autonomieAcumulator;
    }
    
    public void setCapacitateAcumulator(int capacitateAcumulator)
    {
        this.capacitateAcumulator=capacitateAcumulator;
    }
    public int getCapacitateAcumulator ()
    {
        return capacitateAcumulator;
    }
    
    public void setDistantaMaxima(int distantaMaxima)
    {
        this.distantaMaxima=distantaMaxima;
    }
    public int getDistantaMaxima ()
    {
        return distantaMaxima;
    }
    
    @Override
    public void nou() {
        System.out.println("Boxa portabila este noua");
    }

    @Override
    public void resigilat() {
        System.out.println("Boxa portabila este resigilata");
    }
}

