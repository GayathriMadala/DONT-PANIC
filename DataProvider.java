package com.example.haasikapuram.dontpanic;

/**
 * Created by haasikapuram on 19/06/17.
 */

public class DataProvider {
    private String name;
    private String mob;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public DataProvider(String name, String mob){
         this.name=name;
        this.mob=mob;


    }

}
