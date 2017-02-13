package de.cherry;

/**
 * Created by mbaaxur on 13.02.17.
 */
public class SourceObjekt {
    private String name;
    private int alter;
    private Geschlecht typ;

    public SourceObjekt(String name, int alter, Geschlecht typ) {
        this.name = name;
        this.alter = alter;
        this.typ = typ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public Geschlecht getTyp() {
        return typ;
    }

    public void setTyp(Geschlecht typ) {
        this.typ = typ;
    }
}
