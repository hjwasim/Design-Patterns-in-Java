package model;

public class Laptop {
    private String name;
    private String bareBones;
    private String CPU;

    public Laptop(String name, String bareBones, String CPU, String RAM, String hardDrive, String graphicsCard) {
        this.name = name;
        this.bareBones = bareBones;
        this.CPU = CPU;
        this.RAM = RAM;
        this.hardDrive = hardDrive;
        this.graphicsCard = graphicsCard;
    }

    private String RAM;
    private String hardDrive;
    private String graphicsCard;

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", bareBones='" + bareBones + '\'' +
                ", CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }
}
