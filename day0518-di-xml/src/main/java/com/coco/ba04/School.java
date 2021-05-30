package com.coco.ba04;

/**
 * @author cocoLin
 * @create 2021-05-19 22:23
 */
public class School {
    private String name;
    private String address;

    public School() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
