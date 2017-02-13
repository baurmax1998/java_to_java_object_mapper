package de.cherry;

import javax.xml.bind.annotation.XmlList;

/**
 * Created by mbaaxur on 13.02.17.
 */
public class DestinationObjekt {
    @Column
    private String name;
    @Column
    private String alter;
    @Column(name = "typ")
    private String geschlecht;

    public DestinationObjekt() {
    }

    public DestinationObjekt(String name, String alter, String geschlecht) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getAlter() {
        return alter;
    }

    public void setAlter(String alter) {
        this.alter = alter;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }
}
