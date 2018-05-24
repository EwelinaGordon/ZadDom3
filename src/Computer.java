public class Computer {
    String name;
    Procesor procesor;
    Memory memory;

    Computer(String name, Procesor procesor, Memory memory) {
        this.name = name;
        this.procesor = procesor;
        this.memory = memory;
    }


    void getInfo() {
        String result = name + " " + memory.number + " " + memory.procesor.model + " "
                + memory.procesor.producer + " " + memory.procesor.speed;
        System.out.println(result);
    }
}
