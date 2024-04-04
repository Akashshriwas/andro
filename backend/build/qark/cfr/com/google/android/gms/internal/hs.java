/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Set
 */
package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hs {
    /*
     * Enabled aggressive block sorting
     */
    public static void a(StringBuilder stringBuilder, HashMap hashMap) {
        stringBuilder.append("{");
        Iterator iterator = hashMap.keySet().iterator();
        boolean bl2 = true;
        do {
            if (!iterator.hasNext()) {
                stringBuilder.append("}");
                return;
            }
            String string = (String)iterator.next();
            if (!bl2) {
                stringBuilder.append(",");
            } else {
                bl2 = false;
            }
            String string2 = (String)hashMap.get((Object)string);
            stringBuilder.append("\"").append(string).append("\":");
            if (string2 == null) {
                stringBuilder.append("null");
                continue;
            }
            stringBuilder.append("\"").append(string2).append("\"");
        } while (true);
    }
}

