package com.mycompany.electronice;

public class vectorLaptopDesktop {
    public static void main(String[] args) {
        Object[] electroniceVector = new Object[10];
        for (int i = 0; i < 10; i++) {
            electroniceVector[i] = new Electronice("Marca" + i, "Produs" + i, 100 + i * 10, i % 2 == 0);
        }
        for (Object e : electroniceVector)
            System.out.println(e);

        Object[] laptopVector = new Object[10];
        for (int i = 0; i < 10; i++) {
            laptopVector[i]=new Laptop("marcaLaptop"+i, "numeProd"+i, 4499.99+i*10 , i%2==0 , "procesor"+i , "sistemOperare"+i , 14+i , 60+i , 16+i,  i%2==1);
        }
        for (Object l : laptopVector) {
            System.out.println(l);
    }
        Object[] DesktopVector = new Object[10];
        for (int i = 0; i < 10; i++) {
            DesktopVector[i]=new Desktop("Asus", "PC gaming", 6299.99, true, "fara Os", "negru", "lichid", true, true);
        }
        for (Object d : DesktopVector) {
            System.out.println(d);
        }
        Electronice e1 = new Electronice();
        Electronice e2 = new Electronice("kindle", "eBook", 878.04, true);
        Electronice e3 = new Electronice(e2);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop("Apple" , "Macbook Pro" , 7499.99,true,  "M2" , "macOs" , 16 , 60 , 16 ,false);
        Laptop l3 = new Laptop(l2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        Desktop d1=new Desktop();
        Desktop d2;
        d2 = new Desktop("Asus", "PC gaming" , 6299.99, true, "fara Os" , "negru" , "lichid" , true , true);
        Desktop d3=new Desktop(d2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        Laptop.filtreazaLaptop(laptopVector, 16, 128);
        Desktop.filtreazaDesktop(DesktopVector, "Windows", true );
}
}
