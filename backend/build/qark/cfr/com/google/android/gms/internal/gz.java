/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.hc;
import java.util.ArrayList;
import java.util.List;

public final class gz {
    private final List a;
    private final Object b;

    private gz(Object object) {
        this.b = hc.a(object);
        this.a = new ArrayList();
    }

    /* synthetic */ gz(Object object, gy gy2) {
        this(object);
    }

    public gz a(String string, Object object) {
        this.a.add((Object)((String)hc.a((Object)string) + "=" + String.valueOf((Object)object)));
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(100).append(this.b.getClass().getSimpleName()).append('{');
        int n2 = this.a.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append((String)this.a.get(i2));
            if (i2 >= n2 - 1) continue;
            stringBuilder.append(", ");
        }
        return stringBuilder.append('}').toString();
    }
}

