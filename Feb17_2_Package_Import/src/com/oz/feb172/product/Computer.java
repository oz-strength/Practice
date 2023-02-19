package com.oz.feb172.product;

public class Computer extends Product{
    String cpu;
    int ram;
    int hdd;

    public Computer() {

    }

    public Computer(String name, int price, String cpu, int ram, int hdd) {
        super(name, price);
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(cpu);
        System.out.println(ram);
        System.out.println(hdd);
    }
}
