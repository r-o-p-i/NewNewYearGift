package clasess;


public class Tomtom extends Chocolate {
    static int count;


    public static Sladost Create() {
        CreateSladost cl = new CreateSladost("Chocolate");
        cl.setType("Шоколадка");
        cl.setName("Молочный");
        cl.setFabric("Славянка");
        cl.setColorUpacovki("коричневый");
        cl.setTypeUpacovki("Фольга");
        cl.setVes(30.0);
        Sladost d = cl.getSladost();
        count++;
        return d;
    }

    public static int getCount() {
        return count;
    }
}
