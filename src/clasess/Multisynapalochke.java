package clasess;

public class Multisynapalochke extends Candy {
    public Multisynapalochke(String type, String name, String colorUpacovki, String typeUpacovki, String fabric, double ves) {
        super(type, name, colorUpacovki, typeUpacovki, fabric, ves);
    }

    static int count;

    public static Sladost Create() {
        CreateSladost cl = new CreateSladost("Candy");
        cl.setType("Леденец карамельный на палочке");
        cl.setName("Мультисы");
        cl.setFabric("КОНФЕКТУМ");
        cl.setColorUpacovki("Цветной");
        cl.setTypeUpacovki("Целофан");
        cl.setVes(16.0);
        Sladost d = cl.getSladost();
        count++;
        return d;

    }

    public static int getCount() {
        return count;
    }

}


