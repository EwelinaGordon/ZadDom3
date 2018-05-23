public class TelevisorTest {
    public static void main(String[] args) {

        Televisor tv1 = new Televisor();


            System.out.println("Status: Is the television ON? " + tv1.getInfo());
            tv1.turnOn();
            System.out.println("Is the television ON? " + tv1.getInfo());
            tv1.turnOff();
            System.out.println("Is the television OFF? " + tv1.getInfo());

    }
}
