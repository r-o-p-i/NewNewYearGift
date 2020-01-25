package clasess;

public class IvanSorvanec extends Candy {
    public IvanSorvanec(String type, String name, String colorUpacovki, String typeUpacovki, String fabric, double ves) {
        super(type, name, colorUpacovki, typeUpacovki, fabric, ves);
        count++;
    }

    private static int count;

    public static Sladost Create() {
        CreateSladost ct = new CreateSladost("Candy");
        ct.setType("Конфета");
        ct.setName("Ванька Сорвонец");
        ct.setFabric("Москва");
        ct.setColorUpacovki("Белый");
        ct.setTypeUpacovki("Бумага");
        ct.setVes(15.0);
        Sladost d = ct.getSladost();
        count++;
        return d;

    }

    public static int getCount() {
        return count;
    }
}

