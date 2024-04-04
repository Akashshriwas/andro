/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.je;
import com.google.android.gms.internal.jh;
import java.io.IOException;

public abstract class jg {
    protected int f = -1;

    public static final void a(jg jg2, byte[] object, int n2, int n3) {
        try {
            object = je.a((byte[])object, n2, n3);
            jg2.a((je)object);
            object.b();
            return;
        }
        catch (IOException iOException) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", (Throwable)iOException);
        }
    }

    public static final byte[] a(jg jg2) {
        byte[] arrby = new byte[jg2.a()];
        jg.a(jg2, arrby, 0, arrby.length);
        return arrby;
    }

    public int a() {
        this.f = 0;
        return 0;
    }

    public abstract void a(je var1);

    public String toString() {
        return jh.a(this);
    }
}

