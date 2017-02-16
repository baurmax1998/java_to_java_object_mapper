package de.cherry;

/**
 * Created by mbaaxur on 16.02.17.
 */
public class ToStringConverter implements Converter{
    @Override
    public Object convert(Object param) {
        return String.valueOf(param);
    }
}
