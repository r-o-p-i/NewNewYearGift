package clasess;

public class Alenka extends Candy {
    public Alenka(String type, String name, String colorUpacovki, String typeUpacovki, String fabric, double ves) {
        super(type, name, colorUpacovki, typeUpacovki, fabric, ves);
    }

    static int count;

    public static Sladost Create() {
        CreateSladost cl = new CreateSladost("Candy");
        cl.setType("Конфета");
        cl.setName("Alenka");
        cl.setFabric("Москва");
        cl.setColorUpacovki("Белый");
        cl.setTypeUpacovki("Бумага");
        cl.setVes(15.0);
        Sladost d = cl.getSladost();
        count++;
        return d;

    }

    public static int getCount() {
        return count;
    }

}