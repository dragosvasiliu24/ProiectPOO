package com.mycompany.electronice;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Smartwatch extends Electronice implements Stare {
    private String stil;
    private String sistemDeOperare;
    private int dimensiuneDisplay, autonomie, lungimeBratara;
    private boolean rezistentLaApa;

    public Smartwatch() {
        super();
        this.stil = null;
        this.sistemDeOperare = null;
        this.dimensiuneDisplay = 0;
        this.autonomie = 0;
        this.lungimeBratara = 0;
        this.rezistentLaApa = false;
    }

    public Smartwatch(String marca, String numeProdus, double pret, boolean disponibil, String stil, String sistemDeOperare, int dimensiuneDisplay, int autonomie, int lungimeBratara, boolean rezistentLaApa)
    {
        super(marca, numeProdus, pret, disponibil);
        this.stil = stil;
        this.sistemDeOperare = sistemDeOperare;
        this.dimensiuneDisplay = dimensiuneDisplay;
        this.autonomie = autonomie;
        this.lungimeBratara = lungimeBratara;
        this.rezistentLaApa = rezistentLaApa;
    }

    public Smartwatch(Smartwatch original) {
        super(original);
        this.stil = original.stil;
        this.sistemDeOperare = original.sistemDeOperare;
        this.dimensiuneDisplay = original.dimensiuneDisplay;
        this.autonomie = original.autonomie;
        this.lungimeBratara = original.lungimeBratara;
        this.rezistentLaApa = original.rezistentLaApa;
    }

    public void setStil (String stil)
    {
        this.stil=stil;
    }

    public String getStil ()
    {
        return stil;
    }

    public void setSistemDeOperare (String sistemDeOperare)
    {
        this.sistemDeOperare=sistemDeOperare;
    }

    public String getSistemDeOperare ()
    {
        return sistemDeOperare;
    }

    public void setDimensiuneDisplay (int dimensiuneDisplay)
    {
        this.dimensiuneDisplay = dimensiuneDisplay;
    }

    public int getDimensiuneDisplay ()
    {
        return dimensiuneDisplay;
    }

    public void setAutonomie (int autonomie)
    {
        this.autonomie = autonomie;
    }

    public int getAutonomie ()
    {
        return autonomie;
    }

    public void setLungimeBratara (int lungimeBratara)
    {
        this.lungimeBratara = lungimeBratara;
    }

    public int getLungimeBratara ()
    {
        return lungimeBratara;
    }

    public void setRezistentLaApa (boolean rezistentLaApa)
    {
        this.rezistentLaApa = rezistentLaApa;
    }

    public boolean getRezistentLaApa ()
    {
        return rezistentLaApa;
    }

    @Override
    public String toString () {
        return super.toString() + "Stil:" + stil  + ", Sistem de operare:" + sistemDeOperare + ", Dimensiune display:" + dimensiuneDisplay + ", Autonomie:" + autonomie + ", LungimeBratara:" + lungimeBratara + ", Rezistent la apa:" + rezistentLaApa;
    }

    @Override
    public void nou() {
        System.out.println("Smartwatchul este nou.");
    }

    @Override
    public void resigilat() {
        System.out.println("Smartwatchul este resigilat.");
    }

    public static void scrieSmartwatch(Object[] smartwatchVector, String filename) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename, true))) {  // true = append
            for (Object o : smartwatchVector) {
                if (o == null) continue;

                Smartwatch b = (Smartwatch) o;
                pw.println(b.toString());   // scriere + trecere la linia următoare
            }
            System.out.println("Am adăugat Smartwatch în: " + filename);
        } catch (IOException ex) {
            System.err.println("Eroare la scrierea în fișierul " + filename + ": " + ex.getMessage());
        }
    }
    public static void filtreazaSmartwatch(Object[] vector, int dimensiuneDisplay, int lungimeBratara) {
        System.out.println("Smartwatch care respecta cerintele");
        for(Object obj : vector)  {
            Smartwatch b = (Smartwatch) obj;
            if(b.getDimensiuneDisplay() >= dimensiuneDisplay && b.getLungimeBratara() >= lungimeBratara) {
                System.out.println(b);
            }
        }
    }
}
