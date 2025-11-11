package com.mycompany.electronice;

public class Electronice {
    private String marca;
    private String numeProdus;
    private double pret;
    private boolean disponibil;

    public Electronice()
    {

    }
    public Electronice (String marca, String numeProdus, double pret, boolean disponibil)
    {
        this.marca=marca;
        this.numeProdus=numeProdus;
        this.pret=pret;
        this.disponibil=disponibil;
    }
    public Electronice (Electronice original)
    {
        this.marca=original.marca;
        this.numeProdus=original.numeProdus;
        this.pret=original.pret;
        this.disponibil=original.disponibil;
    }

    public void setMarca (String marca)
    {
        this.marca=marca;
    }
    public String getMarca ()
    {
        return marca;
    }
    public void setNumeProdus (String numeProdus)
    {
        this.numeProdus=numeProdus;
    }
    public String getNumeProdus ()
    {
        return numeProdus;
    }
    public void setPret (double pret)
    {
        this.pret=pret;
    }
    public double getPret ()
    {
        return pret;
    }
    public void setDisponibil (boolean disponibil)
    {
        this.disponibil = disponibil;
    }
    public boolean getDisponibil ()
    {
        return disponibil;
    }

    @Override
    public String toString () {
        return "Marca: "+ marca + ", Nume produs: "+numeProdus+", Pret: "+ pret+", Disponibilitate:"+disponibil+ " ";
    }

}

