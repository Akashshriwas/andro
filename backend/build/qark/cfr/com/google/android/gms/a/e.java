/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.InstantiationException
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.a;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.a.f;
import com.google.android.gms.common.g;
import com.google.android.gms.internal.hc;

public abstract class e {
    private final String a;
    private Object b;

    protected e(String string) {
        this.a = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected final Object a(Context context) {
        if (this.b != null) return this.b;
        hc.a((Object)context);
        context = g.c(context);
        if (context == null) {
            throw new f("Could not get remote context.");
        }
        context = context.getClassLoader();
        try {
            this.b = this.a((IBinder)context.loadClass(this.a).newInstance());
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new f("Could not load creator class.");
        }
        catch (InstantiationException instantiationException) {
            throw new f("Could not instantiate creator.");
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new f("Could not access creator.");
        }
        return this.b;
    }

    protected abstract Object a(IBinder var1);
}

