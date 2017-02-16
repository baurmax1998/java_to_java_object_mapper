package de.cherry;


import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
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
                if(annotations[j].annotationType().equals(Column.class)){
                    System.out.println("anotation gefunden");
                    fieldNameMap.put(
                            ((Column) annotations[0]).name().equals("")? fields[i].getName():((Column) annotations[0]).name()
                            , fields[i]);

                }
            }
        }
    }

    public void map(Object sourceObject, Object destinationObject){
        Field[] declaredFields = sourceObject.getClass().getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            Field field = fieldNameMap.get(declaredFields[i].getName());
            try {
                declaredFields[i].setAccessible(true);
                Object o = declaredFields[i].get(sourceObject);
                field.setAccessible(true);
                Class converter = field.getAnnotation(Column.class).converter();
                Constructor<?> ctor = converter.getConstructor();;
                Converter object = (Converter) ctor.newInstance(new Object[] { });
                Object converted = object.convert(o);
                field.set(destinationObject, converted);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

    }
}
