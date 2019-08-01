package edu.swun.set;

import java.util.HashMap;
import java.util.Objects;

public class Cat {
    private String name;
    private int month;
    private String species;

    public Cat(String name, int month, String species) {
        this.name = name;
        this.month = month;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return  this.name+" "+this.month+" "+this.species ;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, month, species);
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj){
//            return true;
//        }
//        if(obj.getClass()==Cat.class){
//            Cat cat = (Cat)obj;
//            return cat.getName().equals(name)&&cat.getMonth()==month&&cat.getSpecies().equals(species);
//        }
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return getMonth() == cat.getMonth() &&
                Objects.equals(getName(), cat.getName()) &&
                Objects.equals(getSpecies(), cat.getSpecies());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMonth(), getSpecies());
    }
}
