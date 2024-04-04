// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.HashMap;

public class hs
{
    public static void a(final StringBuilder sb, final HashMap hashMap) {
        sb.append("{");
        final Iterator<String> iterator = hashMap.keySet().iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final String s = iterator.next();
            if (n == 0) {
                sb.append(",");
            }
            else {
                n = 0;
            }
            final String str = (String)hashMap.get(s);
            sb.append("\"").append(s).append("\":");
            if (str == null) {
                sb.append("null");
            }
            else {
                sb.append("\"").append(str).append("\"");
            }
        }
        sb.append("}");
    }
}
