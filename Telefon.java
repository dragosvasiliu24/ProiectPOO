/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.aciee.electronice;

/**
 *
 * @author ac1019
 */
public class Telefon extends Electronice implements Stare {
    
    private int memorieRAM,numarNuclee,memorieInterna;
    private String culoare;
    private boolean waterproof;
    
    public Telefon(){
        super();
        this.memorieRAM=0;
        this.culoare=null;
        this.memorieInterna=0;
        this.numarNuclee=0;
        this.waterproof=false;
    }
    
    public Telefon(String marca, String numeProdus, double pret , boolean disponibil, int memorieRam, int numarNuclee, int memorieInterna, String culoare, boolean waterproof ){
        super(marca, numeProdus, pret, disponibil);
        this.culoare=culoare;
        this.memorieInterna=memorieInterna;
        this.memorieRAM=memorieRam;
        this.numarNuclee=numarNuclee;
        this.waterproof=waterproof;
    }
    
    public Telefon(Telefon copy){
        super(copy);
        this.culoare=copy.culoare;
        this.memorieInterna=copy.memorieInterna;
        this.memorieRAM=copy.memorieRAM;
        this.numarNuclee=copy.numarNuclee;
        this.waterproof=copy.waterproof;
    }
    
    public void setCuloare (String culoare){
        this.culoare=culoare;
    }
    
    public String getCuloare(){
        return culoare;
    }
    
    public void setMemorieInterna (int memorieInterna){
        this.memorieInterna=memorieInterna;
    }
    
    public int getMemorieInterna(){
        return memorieInterna;
    }
    
    public void  setMemorieRAM(int memorieRAM){
        this.memorieRAM=memorieRAM;
    }
    
    public int getMemorieRAM(){
        return memorieRAM;
    }
    
    public void setNumarNuclee(int numarNuclee){
        this.numarNuclee=numarNuclee;
    }
    
    public int getNumarNuclee(){
        return numarNuclee;
    }
    
    public void setWaterproof(boolean waterproof){
        this.waterproof=waterproof;
    }
    
    public boolean getWaterproof(){
        return waterproof;
    }
    
    @Override
    public String toString(){
        return super.toString() + "Culoare:" + culoare + " Memorie interna:"+ memorieInterna+" Memorie RAm:"+memorieRAM+" Numar Nuclee:"+numarNuclee+" Waterproof:"+waterproof;
    }
    
     @Override
    public void nou() {
        System.out.println("Telefonul este nou.");
    }

    @Override
    public void resigilat() {
        System.out.println("Telefonul este resigilat.");
    }
    
    public static void filtreazaTelefoane(Object[] vector,int memorieRAMmin,boolean waterproof){
        System.out.println("-------Telefoane care respecta cerinta------");
        for(Object obj :vector)
        {
            Telefon t=(Telefon) obj;
            if(t.getMemorieRAM()>=memorieRAMmin & t.getWaterproof==waterproof){
                System.out.println(t);
            }
        }
    }
        public static void scrieTelefonFisier(Object[] TelefonVector, String filename) {
    try (PrintWriter pw = new PrintWriter(new FileWriter(filename, true))) {  
        for (Object o : TelefonVector) {
            if (o == null) continue;

            Telefon b = (Telefon) o;
            pw.println(b.toString());   
        }
        System.out.println("Am adăugat Telefoane în: " + filename);
    } catch (IOException ex) {
        System.err.println("Eroare la scrierea în fișierul " + filename + ": " + ex.getMessage());
    }
}
    
}


