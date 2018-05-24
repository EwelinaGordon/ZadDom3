public class Device {

    String code;
    String producer;
    String type;
    double price;

    Device(String code, String producer, String type) {
        this.code = code;
        this.producer = producer;
        this.type = type;
    }

    Device(String code, String producer, String type, double price) {
        this(code, producer, type);
        this.price = price;
    }

    String getInfo() {
        String result = "Kod: " + code + ", producent: " + producer + ", typ: " + type + ", cena: " + price;
        return result;
    }
}