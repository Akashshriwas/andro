/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Byte
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.lang.reflect.Array
 *  java.lang.reflect.Field
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.jg;
import java.lang.reflect.Array;
import java.lang.reflect.Field;

public final class jh {
    public static String a(jg jg2) {
        if (jg2 == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            jh.a(null, jg2.getClass(), jg2, new StringBuffer(), stringBuffer);
        }
        catch (IllegalAccessException illegalAccessException) {
            return "Error printing proto: " + illegalAccessException.getMessage();
        }
        return stringBuffer.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String a(String string) {
        StringBuffer stringBuffer = new StringBuffer();
        int n2 = 0;
        while (n2 < string.length()) {
            char c2 = string.charAt(n2);
            if (n2 == 0) {
                stringBuffer.append(Character.toLowerCase((char)c2));
            } else if (Character.isUpperCase((char)c2)) {
                stringBuffer.append('_').append(Character.toLowerCase((char)c2));
            } else {
                stringBuffer.append(c2);
            }
            ++n2;
        }
        return stringBuffer.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void a(String string, Class arrfield, Object object, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        int n2;
        block16 : {
            block15 : {
                int n3;
                if (object == null) break block15;
                if (jg.class.isAssignableFrom((Class)arrfield)) {
                    n2 = stringBuffer.length();
                    if (string != null) {
                        stringBuffer2.append(stringBuffer).append(jh.a(string)).append(" <\n");
                        stringBuffer.append("  ");
                    }
                    arrfield = arrfield.getFields();
                    n3 = arrfield.length;
                } else {
                    string = jh.a(string);
                    stringBuffer2.append(stringBuffer).append(string).append(": ");
                    if (object instanceof String) {
                        string = jh.b((String)object);
                        stringBuffer2.append("\"").append(string).append("\"");
                    } else if (object instanceof byte[]) {
                        jh.a((byte[])object, stringBuffer2);
                    } else {
                        stringBuffer2.append(object);
                    }
                    stringBuffer2.append("\n");
                    return;
                }
                for (int i2 = 0; i2 < n3; ++i2) {
                    Field field = arrfield[i2];
                    int n4 = field.getModifiers();
                    String string2 = field.getName();
                    if ((n4 & 1) != 1 || (n4 & 8) == 8 || string2.startsWith("_") || string2.endsWith("_")) continue;
                    Class class_ = field.getType();
                    Object object2 = field.get(object);
                    if (class_.isArray()) {
                        Class class_2 = class_.getComponentType();
                        if (class_2 == Byte.TYPE) {
                            jh.a(string2, class_, object2, stringBuffer, stringBuffer2);
                            continue;
                        }
                        n4 = object2 == null ? 0 : Array.getLength((Object)object2);
                        for (int i3 = 0; i3 < n4; ++i3) {
                            jh.a(string2, class_2, Array.get((Object)object2, (int)i3), stringBuffer, stringBuffer2);
                        }
                        continue;
                    }
                    jh.a(string2, class_, object2, stringBuffer, stringBuffer2);
                }
                if (string != null) break block16;
            }
            return;
        }
        stringBuffer.setLength(n2);
        stringBuffer2.append(stringBuffer).append(">\n");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void a(byte[] arrby, StringBuffer stringBuffer) {
        if (arrby == null) {
            stringBuffer.append("\"\"");
            return;
        }
        stringBuffer.append('\"');
        int n2 = 0;
        do {
            if (n2 >= arrby.length) {
                stringBuffer.append('\"');
                return;
            }
            byte by2 = arrby[n2];
            if (by2 == 92 || by2 == 34) {
                stringBuffer.append('\\').append((char)by2);
            } else if (by2 >= 32 && by2 < 127) {
                stringBuffer.append((char)by2);
            } else {
                stringBuffer.append(String.format((String)"\\%03o", (Object[])new Object[]{by2}));
            }
            ++n2;
        } while (true);
    }

    private static String b(String string) {
        String string2 = string;
        if (!string.startsWith("http")) {
            string2 = string;
            if (string.length() > 200) {
                string2 = string.substring(0, 200) + "[...]";
            }
        }
        return jh.c(string2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String c(String string) {
        int n2 = string.length();
        StringBuilder stringBuilder = new StringBuilder(n2);
        int n3 = 0;
        while (n3 < n2) {
            char c2 = string.charAt(n3);
            if (c2 >= ' ' && c2 <= '~' && c2 != '\"' && c2 != '\'') {
                stringBuilder.append(c2);
            } else {
                stringBuilder.append(String.format((String)"\\u%04x", (Object[])new Object[]{c2}));
            }
            ++n3;
        }
        return stringBuilder.toString();
    }
}

