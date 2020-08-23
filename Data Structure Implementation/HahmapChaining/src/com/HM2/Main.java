package com.HM2;

public class Main {

    public static void main(String[] args) {
        Employee joneJones = new Employee("Jane","Jones",123);
        Employee johnDoe = new Employee("John","Doe",456);
        Employee SujPatil = new Employee("Suj","Patil",576);

        ChainedHashTable ht = new ChainedHashTable();
        ht.put("Jones",joneJones);
        ht.put("Doe",johnDoe);
        ht.put("Patil",SujPatil);

        ht.printhashtable();
        System.out.println("REMOVING: "+ht.get("Patil"));
        ht.remove("Patil");
        ht.printhashtable();
        System.out.println("GET: "+ht.get("Patil"));
    }
}
