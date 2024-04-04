// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Array;

public final class jh
{
    public static String a(final jg jg) {
        if (jg == null) {
            return "";
        }
        final StringBuffer sb = new StringBuffer();
        try {
            a(null, jg.getClass(), jg, new StringBuffer(), sb);
            return sb.toString();
        }
        catch (IllegalAccessException ex) {
            return "Error printing proto: " + ex.getMessage();
        }
    }
    
    private static String a(final String s) {
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (i == 0) {
                sb.append(Character.toLowerCase(char1));
            }
            else if (Character.isUpperCase(char1)) {
                sb.append('_').append(Character.toLowerCase(char1));
            }
            else {
                sb.append(char1);
            }
        }
        return sb.toString();
    }
    
    private static void a(String s, final Class clazz, final Object o, final StringBuffer sb, final StringBuffer sb2) {
        if (o != null) {
            if (!jg.class.isAssignableFrom(clazz)) {
                s = a(s);
                sb2.append(sb).append(s).append(": ");
                if (o instanceof String) {
                    s = b((String)o);
                    sb2.append("\"").append(s).append("\"");
                }
                else if (o instanceof byte[]) {
                    a((byte[])o, sb2);
                }
                else {
                    sb2.append(o);
                }
                sb2.append("\n");
                return;
            }
            final int length = sb.length();
            if (s != null) {
                sb2.append(sb).append(a(s)).append(" <\n");
                sb.append("  ");
            }
            final Field[] fields = clazz.getFields();
            for (int length2 = fields.length, i = 0; i < length2; ++i) {
                final Field field = fields[i];
                final int modifiers = field.getModifiers();
                final String name = field.getName();
                if ((modifiers & 0x1) == 0x1 && (modifiers & 0x8) != 0x8 && !name.startsWith("_") && !name.endsWith("_")) {
                    final Class<?> type = field.getType();
                    final Object value = field.get(o);
                    if (type.isArray()) {
                        final Class componentType = type.getComponentType();
                        if (componentType == Byte.TYPE) {
                            a(name, type, value, sb, sb2);
                        }
                        else {
                            int length3;
                            if (value == null) {
                                length3 = 0;
                            }
                            else {
                                length3 = Array.getLength(value);
                            }
                            for (int j = 0; j < length3; ++j) {
                                a(name, componentType, Array.get(value, j), sb, sb2);
                            }
                        }
                    }
                    else {
                        a(name, type, value, sb, sb2);
                    }
                }
            }
            if (s != null) {
                sb.setLength(length);
                sb2.append(sb).append(">\n");
            }
        }
    }
    
    private static void a(final byte[] array, final StringBuffer sb) {
        if (array == null) {
            sb.append("\"\"");
            return;
        }
        sb.append('\"');
        for (int i = 0; i < array.length; ++i) {
            final byte j = array[i];
            if (j == 92 || j == 34) {
                sb.append('\\').append((char)j);
            }
            else if (j >= 32 && j < 127) {
                sb.append((char)j);
            }
            else {
                sb.append(String.format("\\%03o", j));
            }
        }
        sb.append('\"');
    }
    
    private static String b(final String s) {
        String string = s;
        if (!s.startsWith("http")) {
            string = s;
            if (s.length() > 200) {
                string = s.substring(0, 200) + "[...]";
            }
        }
        return c(string);
    }
    
    private static String c(final String s) {
        final int length = s.length();
        final StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (char1 >= ' ' && char1 <= '~' && char1 != '\"' && char1 != '\'') {
                sb.append(char1);
            }
            else {
                sb.append(String.format("\\u%04x", (int)char1));
            }
        }
        return sb.toString();
    }
}
