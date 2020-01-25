package clasess;


import java.util.Comparator;
import java.util.LinkedList;

public class NewYearGift implements Upacovka {
    private String name;
    private static int Count;
    private String colorUpakovki;
    private String typeUpakovki;
    private LinkedList<Sladost> st = new LinkedList<>();
    private double ves = 0.0;

    public NewYearGift(String name) {
        this.name = name;
        Create();
        Count++;
    }

    public static int getCount() {
        return Count;
    }

    public void AddList(Sladost... s) {
        for (int i = 0; i < s.length; i++) {
            st.add(s[i]);
        }
    }

    public void AddList(Sladost s, int j) {
        for (int i = 0; i < j; i++) {
            st.add(s);
        }
    }

    private LinkedList<Sladost> Create() {
        if (this.name == "Новогодний подарок №1 ") {
            this.typeUpakovki = "Пакет";
            this.colorUpakovki = "Белый";

            Sreate();


            return st;
        } else if (this.name == "Новогодний подарок №2 ") {
            this.typeUpakovki = "Картон";
            this.colorUpakovki = "Красный";

            AddList(ZefirBelorozovy.Create(), 2);
            AddList(MameladFigurka.Create(), 2);
            AddList(IvanSorvanec.Create(), 2);
            AddList(Alenka.Create(), 2);
            AddList(Multisynapalochke.Create(), 2);
            AddList(ZefirBelorozovy.Create(), 2);


            return st;
        } else {
            return null;
        }
    }

    public void Sreate() {
        st.add(Alenka.Create());
        st.add(Multisynapalochke.Create());
        st.add(MameladFigurka.Create());
        st.add(DetskijSuvenir.Create());
        st.add(IvanSorvanec.Create());
        st.add(Tomtom.Create());
        st.add(ZefirBelorozovy.Create());
    }


    public int getKolichestvoSladosliVpodarke() {
        int kolichestvoSladosliVpodarke = getSt().size();

        return kolichestvoSladosliVpodarke;
    }

    public double getVesGift() {
        ves = 0;
        for (Sladost b : getSt()
        ) {
            ves += b.getVes();
        }
        return ves;

    }

    @Override
    public String toString() {
        double vesGift = getVesGift();
        String ves = "";
        if (vesGift >= 1000) {
            ves = "1 Кг";
        } else {
            ves = "" + vesGift + " гр.";
        }
        String s = name + "{Упаковка='" + getTypeUpacovki() + "',Цвет Упаковки='" + getColorUpacovki() + "', Вес подарка:" + ves +
                " ,Количество сладостей в подарке='" + getKolichestvoSladosliVpodarke() + "'\n { Состав = ";
        for (Sladost a : getSt()) {

            s += "" + a.toString() + ",\n";
        }
        s = s.substring(0, s.length() - 2);
        return s += "}}";
    }


    public LinkedList<Sladost> getSt() {
        st.sort(Comparator.comparing(Sladost::getName));
        return st;
    }


    @Override
    public void setTypeUpacovki(String typeUpacovki) {
        this.typeUpakovki = typeUpacovki;
    }

    @Override
    public void setColorUpacovki(String colorUpakovki) {
        this.colorUpakovki = colorUpakovki;
    }

    @Override
    public String getTypeUpacovki() {
        return this.typeUpakovki;
    }

    @Override
    public String getColorUpacovki() {
        return this.colorUpakovki;
    }
}

