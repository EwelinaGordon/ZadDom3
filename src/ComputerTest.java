import java.sql.SQLOutput;

public class ComputerTest {

    public static void main(String[] args) {


        Procesor procesor = new Procesor("Intel", "ABC", 1000);
        Procesor procesor1 = new Procesor("Intel", "XYZ", 133);
        Memory memory = new Memory(1, procesor);
        Memory memory1 = new Memory(5, procesor1);
        Computer computer = new Computer("ASUS", procesor, memory);
        Computer computer1 = new Computer("HP", procesor, memory1);

        computer.getInfo();
        computer1.getInfo();

        System.out.println();

        Overclock overclock = new Overclock();

       overclock.increaseCpuClock(computer, 100);
       overclock.increaseCpuClock(computer1, 1000);

     //   System.out.println("Zwiększona prędkość procesora: " +  procesor.speed);

        computer.getInfo();
        computer1.getInfo();



    }
}