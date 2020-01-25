package clasess;

public class Marmelad implements Sladost {
    private String type;
    private String name;
    private String colorUpacovki;
    private String typeUpacovki;
    private String fabric;
    private double ves;
    public static double vesAll;
    public static int count;

    public Marmelad(String type, String name, String colorUpacovki, String typeUpacovki, String fabric, double ves) {
        this.type = type;
        this.name = name;
        this.colorUpacovki = colorUpacovki;
        this.typeUpacovki = typeUpacovki;
        this.fabric = fabric;
        this.ves = ves;
        vesAll = vesAll + ves;
        count++;
    }

    public Marmelad() {

        vesAll += getVes();
        count++;

    }

    public String toString() {
        var s = "{ ";
        if (getType() != null) {
            s += "Тип='" + getType() + "', ";
        }
        if (getName() != null) {
            s += "Название='" + getName() + "', ";
        }
        if (getVes() != 0.0) {
            s += " Вес='" + getVes() + "гр., ";
        }
        if (getFabric() != null) {
            s += "Фабрика='" + getFabric() + "', ";
        }
        if (getTypeUpacovki() != null) {
            s += "Упаковка='" + getTypeUpacovki() + "', ";
        }
        if (getColorUpacovki() != null) {
            s += "Цвет упаковки='" + getColorUpacovki() + "', ";
        }
        s = s.substring(0, s.length() - 2);
        return s + "}";
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getColorUpacovki() {
        return colorUpacovki;
    }

    @Override
    public void setColorUpacovki(String colorUpacovki) {
        this.colorUpacovki = colorUpacovki;
    }

    @Override
    public String getTypeUpacovki() {
        return typeUpacovki;
    }

    @Override
    public void setTypeUpacovki(String typeUpacovki) {
        this.typeUpacovki = typeUpacovki;
    }

    @Override
    public String getFabric() {
        return fabric;
    }

    @Override
    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    @Override
    public double getVes() {
        return ves;
    }

    @Override
    public void setVes(double ves) {
        this.ves = ves;
    }

}
