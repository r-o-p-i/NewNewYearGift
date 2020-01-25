package clasess;

public class CreateSladost implements Sladost {
    private Sladost sladost;

    public CreateSladost(String s) {
        reset(s);
    }

    public void reset(String s) {
        switch (s) {
            case "Candy":
                sladost = new Candy();
                break;
            case "Chocolate":
                sladost = new Chocolate();
                break;
            case "Zefir":
                sladost = new Zefir();
                break;
            case "Marmelad":
                sladost = new Marmelad();
                break;
        }

    }

    @Override
    public String getName() {
        return sladost.getName();
    }

    @Override
    public String getFabric() {
        return sladost.getFabric();
    }

    @Override
    public double getVes() {
        return sladost.getVes();
    }

    @Override
    public void setVes(double ves) {
        sladost.setVes(ves);
    }

    @Override
    public void setType(String type) {
        sladost.setType(type);
    }

    @Override
    public void setName(String name) {
        sladost.setName(name);
    }

    @Override
    public void setFabric(String fabric) {
        sladost.setFabric(fabric);
    }

    @Override
    public void setTypeUpacovki(String typeUpacovki) {
        sladost.setTypeUpacovki(typeUpacovki);
    }

    @Override
    public void setColorUpacovki(String colorUpakovki) {
        sladost.setColorUpacovki(colorUpakovki);
    }

    @Override
    public String getType() {
        return sladost.getType();
    }

    @Override
    public String getTypeUpacovki() {
        return sladost.getTypeUpacovki();
    }

    @Override
    public String getColorUpacovki() {
        return sladost.getColorUpacovki();
    }

    public Sladost getSladost() {
        return sladost;
    }
}
