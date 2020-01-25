package clasess;


public class MameladFigurka extends Marmelad {
    public MameladFigurka(String type, String name, String colorUpacovki, String typeUpacovki, String fabric, double ves) {
        super(type, name, colorUpacovki, typeUpacovki, fabric, ves);
    }

    static int count;

    public static Sladost Create() {
        CreateSladost cl = new CreateSladost("Marmelad");
        cl.setType("Мармелад");
        cl.setName("В виде фигурок");
        cl.setFabric("Славянка");
        cl.setColorUpacovki("Белый");
        cl.setTypeUpacovki("Цилофан");
        cl.setVes(70.0);
        Sladost d = cl.getSladost();
        count++;
        return d;

    }

    public static int getCount() {
        return count;
    }

}

