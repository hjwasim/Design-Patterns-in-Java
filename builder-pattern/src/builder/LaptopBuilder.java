package builder;

import model.Laptop;

public class LaptopBuilder {

    private String name;
    private String bareBones;
    private String CPU;
    private String RAM;
    private String hardDrive;
    private String graphicsCard;

    public LaptopBuilder setBareBones(String bareBone){
        this.bareBones = bareBone;
        return this;
    }

    public LaptopBuilder setName(String name){
        this.name = name;
        return this;
    }

    public LaptopBuilder setCPU(String CPU){
        this.CPU = CPU;
        return this;
    }
    public LaptopBuilder setRAM(String RAM){
        this.RAM = RAM;
        return this;
    }

    public LaptopBuilder setHardDrive(String hardDrive){
        this.hardDrive = hardDrive;
        return this;
    }

    public LaptopBuilder setGraphicsCard(String graphicsCard){
        this.graphicsCard = graphicsCard;
        return this;
    }

    public Laptop build(){
        return new Laptop(name,bareBones,CPU,graphicsCard,hardDrive,RAM);
    }
}
