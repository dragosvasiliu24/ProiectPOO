package ro.ugal.aciee.electronice;

public class Tableta extends Electronice implements Stare{
    
    private int diagonalaDisplay,greutate,capacitateBaterie;
    private boolean incarcatorInclus;
    private String rezolutie;
    
    public Tableta() {
        super(); 
        this.diagonalaDisplay = 0;
        this.greutate = 0;
        this.capacitateBaterie = 0;
        this.incarcatorInclus = false;
        this.rezolutie = null;
    }
    
    public Tableta(String marca, String numeProdus, double pret, boolean disponibil,int diagonalaDisplay, int greutate, int capacitateBaterie,boolean incarcatorInclus, String rezolutie) {
        super(marca, numeProdus, pret, disponibil); 
        this.diagonalaDisplay = diagonalaDisplay;
        this.greutate = greutate;
        this.capacitateBaterie = capacitateBaterie;
        this.incarcatorInclus = incarcatorInclus;
        this.rezolutie = rezolutie;
    }
    
    public Tableta(Tableta copy) {
        super(copy);
        this.diagonalaDisplay = copy.diagonalaDisplay;
        this.greutate = copy.greutate;
        this.capacitateBaterie = copy.capacitateBaterie;
        this.incarcatorInclus = copy.incarcatorInclus;
        this.rezolutie = copy.rezolutie;
    }
    
    public void setDiagonalaDisplay(int diagonalaDisplay) {
        this.diagonalaDisplay = diagonalaDisplay;
    }
    public int getDiagonalaDisplay() {
        return diagonalaDisplay;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }
    public int getGreutate() {
        return greutate;
    }

    public void setCapacitateBaterie(int capacitateBaterie) {
        this.capacitateBaterie = capacitateBaterie;
    }
    public int getCapacitateBaterie() {
        return capacitateBaterie;
    }

    public void setIncarcatorInclus(boolean incarcatorInclus) {
        this.incarcatorInclus = incarcatorInclus;
    }
    
    public boolean getIncarcatorInclus() {
        return incarcatorInclus;
    }

    public void setRezolutie(String rezolutie) {
        this.rezolutie = rezolutie;
    }
    public String getRezolutie() {
        return rezolutie;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Diagonala: " + diagonalaDisplay +  " Greutate: " + greutate +  " Baterie: " + capacitateBaterie +  " Rezolutie: " + rezolutie + " Incarcator inclus: " + incarcatorInclus;
    }
    
    
     @Override
    public void nou() {
        System.out.println("Tableta este noua.");
    }

    @Override
    public void resigilat() {
        System.out.println("Tableta este resigilata.");
    }
    
    
}

