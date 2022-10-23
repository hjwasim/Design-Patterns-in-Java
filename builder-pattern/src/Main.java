import builder.LaptopBuilder;
import model.Laptop;

public class Main {
    public static void main(String[] args) {
        Laptop hp = new LaptopBuilder().setName("HP")
                .setBareBones("MSI")
                .setGraphicsCard("Nvdia GTX")
                .setCPU("Intel i9")
                .setRAM("8GB")
                .setHardDrive("1TB")
                .build();
        Laptop lenovo = new LaptopBuilder().setName("Lenovo")
                .setBareBones("Wistron")
                .setGraphicsCard("Intel UHD/Nvidia")
                .setCPU("Intel i7")
                .setRAM("8GB")
                .setHardDrive("1TB")
                .build();

        System.out.println(hp);
        System.out.println(lenovo);
    }
}
