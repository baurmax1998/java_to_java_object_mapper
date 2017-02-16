package de.cherry;

import javax.print.attribute.standard.Destination;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("start");
        List<SourceObjekt> sourceObjekts = new ArrayList<>();

        sourceObjekts.add( new SourceObjekt("max",34, Geschlecht.MAENLICH));
        sourceObjekts.add( new SourceObjekt("peter",11, Geschlecht.MAENLICH));
        sourceObjekts.add( new SourceObjekt("petra",94, Geschlecht.WEIBLICH));


        DestinationObjekt destination = new DestinationObjekt();
        JavaToJavaMapper javaToJavaMapper = new JavaToJavaMapper(destination.getClass());

        javaToJavaMapper.map(new SourceObjekt("petra",94, Geschlecht.WEIBLICH), destination);

        System.out.println();


    }

}