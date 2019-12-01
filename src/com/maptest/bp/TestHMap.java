package com.maptest.bp;

public class TestHMap {

    public static void main(String[] args) {
        TMHashMap tmhm = new TMHashMap();

        Employee e1 = new Employee(100, "Niranjan");
        tmhm.put(e1, "dept1");

        Employee e2_dup = new Employee(200, "basava");
        tmhm.put(e2_dup, "dept13");


        Employee e1_dup = new Employee(100, "Niranjan");
        tmhm.put(e1_dup, "dept12");



        TMHashMap.Entry e = tmhm.get(e1_dup);
        System.out.println("GET element - " + e.getKey() + "::" + e.getValue());
    }

}
