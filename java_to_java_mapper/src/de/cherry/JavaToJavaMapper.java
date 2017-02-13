package de.cherry;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mbaaxur on 13.02.17.
 */
public class JavaToJavaMapper {
    private Class destinationClass;
    private Map<String, Field> fieldNameMap = new HashMap<String, Field>();

    public Class getDestinationClass() {
        return destinationClass;
    }

    public JavaToJavaMapper(Class destinationClass) {
        this.destinationClass = destinationClass;
        Field[] fields = destinationClass.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Annotation[] annotations = fields[i].getDeclaredAnnotations();
            for (int j = 0; j < annotations.length; j++) {
                if(annotations[j].annotationType().equals(Column.class))
                    System.out.println("anotation gefunden");
            }
        }
    }

    public void map(Object sourceObject, Object destinationObject){

    }
}
