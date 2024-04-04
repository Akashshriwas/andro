/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package android.support.v4.c;

public class a {
    public static void a(Object object, StringBuilder stringBuilder) {
        String string;
        block6 : {
            String string2;
            block5 : {
                if (object == null) {
                    stringBuilder.append("null");
                    return;
                }
                string2 = object.getClass().getSimpleName();
                if (string2 == null) break block5;
                string = string2;
                if (string2.length() > 0) break block6;
            }
            string2 = object.getClass().getName();
            int n2 = string2.lastIndexOf(46);
            string = string2;
            if (n2 > 0) {
                string = string2.substring(n2 + 1);
            }
        }
        stringBuilder.append(string);
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString((int)System.identityHashCode((Object)object)));
    }
}

