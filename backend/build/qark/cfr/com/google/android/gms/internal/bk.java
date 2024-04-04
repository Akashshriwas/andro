/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Map
 */
package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.a.a.b;
import com.google.a.a.j;
import com.google.android.gms.internal.bn;
import com.google.android.gms.internal.bp;
import com.google.android.gms.internal.bv;
import com.google.android.gms.internal.et;
import java.util.Map;

public final class bk
extends bn {
    private Map a;

    private bp b(String string) {
        try {
            Object object = (b)Class.forName((String)string).newInstance();
            object = new bv((b)object, (j)this.a.get((Object)object.b()));
            return object;
        }
        catch (Throwable throwable) {
            et.e("Could not instantiate mediation adapter: " + string + ". " + throwable.getMessage());
            throw new RemoteException();
        }
    }

    @Override
    public bp a(String string) {
        return this.b(string);
    }

    public void a(Map map) {
        this.a = map;
    }
}

