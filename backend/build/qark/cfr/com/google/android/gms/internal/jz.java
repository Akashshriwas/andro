/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.RemoteException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.a.a;
import com.google.android.gms.a.d;
import com.google.android.gms.common.g;
import com.google.android.gms.internal.bk;
import com.google.android.gms.internal.bl;
import com.google.android.gms.internal.ct;
import com.google.android.gms.internal.e;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.f;
import com.google.android.gms.internal.h;
import com.google.android.gms.internal.i;
import com.google.android.gms.internal.ju;
import com.google.android.gms.internal.x;

public final class jz
extends com.google.android.gms.a.e {
    private static final jz a = new jz();

    private jz() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public static e a(Context context, x x2, String string, bk bk2) {
        e e2;
        block3 : {
            block2 : {
                e e3;
                if (g.a(context) != 0) break block2;
                e2 = e3 = a.b(context, x2, string, bk2);
                if (e3 != null) break block3;
            }
            et.a("Using AdManager from the client jar.");
            e2 = new ju(context, x2, string, bk2, new ct(4132500, 4132500, true));
        }
        return e2;
    }

    private e b(Context object, x x2, String string, bk bk2) {
        try {
            a a2 = d.a(object);
            object = f.a(((h)this.a((Context)object)).a(a2, x2, string, bk2, 4132500));
            return object;
        }
        catch (RemoteException remoteException) {
            et.b("Could not create remote AdManager.", (Throwable)remoteException);
            return null;
        }
        catch (com.google.android.gms.a.f f2) {
            et.b("Could not create remote AdManager.", (Throwable)f2);
            return null;
        }
    }

    @Override
    protected /* synthetic */ Object a(IBinder iBinder) {
        return this.b(iBinder);
    }

    protected h b(IBinder iBinder) {
        return i.a(iBinder);
    }
}

