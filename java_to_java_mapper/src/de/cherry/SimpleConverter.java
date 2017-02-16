package de.cherry;

/**
 * Created by mbaaxur on 16.02.17.
 */
public class SimpleConverter implements Converter {
    @Override
    public Object convert(Object param) {
        return param;
    }
}
