package com.mycompany.electronice;

public class Desktop extends Electronice implements Stare {
    private String sistemOperare, culoare, sistemRacire;
    private boolean gaming, placaNvidia;

    public Desktop() {
        super();
        this.sistemOperare = "";
        this.culoare = "";
        this.sistemRacire = "";
        this.gaming = false;
        this.placaNvidia = false;
    }
    public Desktop(String marca,String numeProdus,double pret,boolean disponibil,String sistemOperare, String culoare, String sistemRacire, boolean gaming, boolean placaNvidia) {
        super(marca,numeProdus ,pret,disponibil);
        this.sistemOperare = sistemOperare;
        this.culoare = culoare;
        this.sistemRacire = sistemRacire;
        this.gaming = false;
        this.placaNvidia = false;
    }
    public Desktop(Desktop original){
        super(original);
        this.sistemOperare = original.sistemOperare;
        this.culoare = original.culoare;
        this.sistemRacire = original.sistemRacire;
        this.gaming = original.gaming;
        this.placaNvidia = original.placaNvidia;
    }
    public void setSistemOperare(String sistemOperare) {
        this.sistemOperare = sistemOperare;
    }
    public String getSistemOperare() {
        return sistemOperare;
    }
    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
    public String getCuloare() {
        return culoare;
    }
    public void setSistemRacire(String sistemRacire) {
        this.sistemRacire = sistemRacire;
    }
    public String getSistemRacire() {
        return sistemRacire;
    }
    public void setGaming(boolean gaming) {
        this.gaming = gaming;
    }
    public boolean getGaming() {
        return gaming;
    }
    public void setPlacaNvidia(boolean placaNvidia) {
        this.placaNvidia = placaNvidia;
    }
    public boolean getPlacaNvidia() {
        return placaNvidia;
    }
    @Override
    public String toString() {
        return super.toString()+ "sistemOperare=" + sistemOperare+ "culoare"+ culoare+ "sistemRacire=" + sistemRacire+"gaming=" + gaming+ "placaNvidia=" + placaNvidia;
    }
    @Override
    public void nou(){
        System.out.println(" com.mycompany.electronice.Desktop nou");
    }

    @Override
    public void resigilat(){
        System.out.println(" com.mycompany.electronice.Desktop resigilat");
    }


        public static void filtreazaDesktop(Object [] vector, String sistemOperare, boolean gaming){
            System.out.println(" Desktop care respecta cerintele ");
            for(Object obj : vector){
                Desktop b=(Desktop) obj;
                if(b.getSistemOperare()==sistemOperare && b.getGaming()==gaming ){
                    System.out.println(b);
                }
            }
        }
}
