package com.mycompany.electronice;

public class VectorSmartwatchFitnessBand {
    public static void main(String[] args)
    {
        Object[] electroniceVector = new Object[10];
        for (int i = 0; i < 10; i++) {
            electroniceVector[i] = new Electronice("Marca" + i, "Produs" + i, 100 + i * 10, i % 2 == 0);
        }
        for (Object e : electroniceVector) {
            System.out.println(e);
        }

        Smartwatch[] smartwatchVector = new Smartwatch[10];
        for (int i = 0; i < 10; i++) {
            smartwatchVector[i] = new Smartwatch("Marca Smartwatch" + i, "Produs" + i, 100 + i * 10, i % 2 == 0, "Stil" + i, "Sistem de operare" + i, 40+i, 15+i, 170+i, i % 2 == 0);
        }
        for (Object s : smartwatchVector) {
            System.out.println(s);
        }

        Fitnessband [] fitnessbandVector = new Fitnessband[10];
        for (int i = 0; i < 10; i++) {
            fitnessbandVector[i] = new Fitnessband("Marca FitnessBand" + i, "Produs" + i, 100 + i * 10, i % 2 == 0, i % 2 == 0, i % 2 == 1, i % 2 == 0, i % 2 == 1, "Material carcasa" + i, "Culoare" + i);
        }
        for (Object d : fitnessbandVector) {
            System.out.println(d);
        }

        Electronice e1 = new Electronice();
        Electronice e2 = new Electronice("Philips", "Air Purifier", 369.99, true);
        Electronice e3 = new Electronice(e2);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        Smartwatch s1 = new Smartwatch();
        Smartwatch s2 = new Smartwatch("Apple", "Watch 11", 2299.99, true, "Sport", "watchOS", 45, 24, 20, true);
        Smartwatch s3 = new Smartwatch(s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        Fitnessband f1 = new Fitnessband();
        Fitnessband f2 = new Fitnessband("Samsung", "Galaxy Fit 3", 349.99, true, true, true, true, false, "Aluminiu", "Negru");
        Fitnessband f3 = new Fitnessband(f2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

        Smartwatch.filtreazaSmartwatch(smartwatchVector, 45, 120);
        Fitnessband.filtreazaFitnessband(fitnessbandVector, true, true);
    }
}
