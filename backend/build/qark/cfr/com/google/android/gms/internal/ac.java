/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.ad;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.fl;
import com.google.android.gms.internal.is;
import java.util.Map;

final class ac
implements ad {
    ac() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(ev object, Map object2) {
        int n2;
        int n3;
        int n4;
        String string = (String)object2.get((Object)"tx");
        String string2 = (String)object2.get((Object)"ty");
        object2 = (String)object2.get((Object)"td");
        try {
            n2 = Integer.parseInt((String)string);
            n4 = Integer.parseInt((String)string2);
            n3 = Integer.parseInt((String)object2);
            object = object.f();
            if (object == null) return;
        }
        catch (NumberFormatException numberFormatException) {
            et.e("Could not parse touch parameters from gmsg.");
            return;
        }
        object.a().a(n2, n4, n3);
    }
}

