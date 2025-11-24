package com.mycompany.electronice;

public class Fitnessband extends Electronice implements Stare {
    private boolean accelerometru, giroscop, senzorLumina, gps;
    private String materialCarcasa, culoare;

    public Fitnessband() {
        super();
        this.accelerometru = false;
        this.giroscop = false;
        this.senzorLumina = false;
        this.gps = false;
        this.materialCarcasa = "";
        this.culoare = "";
    }

    public Fitnessband(String marca, String numeProdus, double pret, boolean disponibil, boolean accelerometru, boolean giroscop, boolean senzorLumina, boolean gps, String materialCarcasa, String culoare) {
        super(marca, numeProdus, pret, disponibil);
        this.accelerometru = accelerometru;
        this.giroscop = giroscop;
        this.senzorLumina = senzorLumina;
        this.gps = gps;
        this.materialCarcasa = materialCarcasa;
        this.culoare = culoare;
    }

    public Fitnessband(Fitnessband original) {
        super(original);
        this.accelerometru = original.accelerometru;
        this.giroscop = original.giroscop;
        this.senzorLumina = original.senzorLumina;
        this.gps = original.gps;
        this.materialCarcasa = original.materialCarcasa;
        this.culoare = original.culoare;
    }

    public void setAccelerometru (boolean accelerometru)
    {
        this.accelerometru = accelerometru;
    }

    public boolean getAccelerometru()
    {
        return accelerometru;
    }

    public void setGiroscop(boolean giroscop) {
        this.giroscop = giroscop;
    }

    public boolean getGiroscop() {
        return giroscop;
    }

    public void setSenzorLumina(boolean senzorLumina) {
        this.senzorLumina = senzorLumina;
    }

    public boolean getSenzorLumina() {
        return senzorLumina;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean getGps() {
        return gps;
    }

    public void setMaterialCarcasa(String materialCarcasa) {
        this.materialCarcasa = materialCarcasa;
    }

    public String getMaterialCarcasa() {
        return materialCarcasa;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getCuloare() {
        return culoare;
    }

    @Override
    public String toString () {
        return super.toString() + "Accelerometru:" + accelerometru + "Giroscop:" + giroscop + "Senzor de lumina:" + senzorLumina + "GPS:" + gps + "Material carcasa:" + materialCarcasa + "Culoare:" + culoare;
    }

    @Override
    public void nou() {
        System.out.println("Fitnessbandul este nou.");
    }

    @Override
    public void resigilat() {
        System.out.println("Fitnessbandul este resigilat.");
    }

    public static void filtreazaFitnessband(Fitnessband[] vector, boolean giroscop, boolean gps) {
        System.out.println("Fitnessband care respecta cerintele");
        for (Object obj : vector) {
            Fitnessband b = (Fitnessband) obj;
            if(b.giroscop == giroscop && b.gps == gps ) {
                System.out.println(b);
            }
        }
    }
}

