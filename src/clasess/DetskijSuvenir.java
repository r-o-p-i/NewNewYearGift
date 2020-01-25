package clasess;

public class DetskijSuvenir extends Candy {
    static int count;

    public DetskijSuvenir(String type, String name, String colorUpacovki, String typeUpacovki, String fabric, double ves) {
        super(type, name, colorUpacovki, typeUpacovki, fabric, ves);
        count++;
    }

    public static Sladost Create() {
        CreateSladost cl = new CreateSladost("Candy");
        cl.setType("Конфета");
        cl.setName("Детский Сувенир");
        cl.setFabric("Славянка");
        cl.setColorUpacovki("Цветная");
        cl.setTypeUpacovki("Фольга");
        cl.setVes(15.0);
        Sladost d = cl.getSladost();
        count++;
        return d;

    }

    public static int getCount() {
        return count;
    }

}
