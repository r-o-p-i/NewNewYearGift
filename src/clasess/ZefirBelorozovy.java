package clasess;

public class ZefirBelorozovy extends Zefir {
    public ZefirBelorozovy(String type, String name, String colorUpacovki, String typeUpacovki, String fabric, double ves) {
        super(type, name, colorUpacovki, typeUpacovki, fabric, ves);
    }

    static int count;

    public static Sladost Create() {
        CreateSladost cl = new CreateSladost("Zefir");
        cl.setType("Зефир");
        cl.setName("Белорозовый");
        cl.setFabric("Красный пищевик");
        cl.setColorUpacovki("Прозрачный");
        cl.setTypeUpacovki("Цилофан");
        cl.setVes(30.0);
        Sladost d = cl.getSladost();
        count++;
        return d;

    }

    public static int getCount() {
        return count;
    }


}
