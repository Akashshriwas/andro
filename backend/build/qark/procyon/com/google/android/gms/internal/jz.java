// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.a.d;
import com.google.android.gms.common.g;
import android.content.Context;
import com.google.android.gms.a.e;

public final class jz extends e
{
    private static final jz a;
    
    static {
        a = new jz();
    }
    
    private jz() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }
    
    public static com.google.android.gms.internal.e a(final Context context, final x x, final String s, final bk bk) {
        com.google.android.gms.internal.e b;
        if (g.a(context) != 0 || (b = jz.a.b(context, x, s, bk)) == null) {
            et.a("Using AdManager from the client jar.");
            b = new ju(context, x, s, bk, new ct(4132500, 4132500, true));
        }
        return b;
    }
    
    private com.google.android.gms.internal.e b(final Context context, final x x, final String s, final bk bk) {
        try {
            return f.a(((h)this.a(context)).a(d.a(context), x, s, bk, 4132500));
        }
        catch (RemoteException ex) {
            et.b("Could not create remote AdManager.", (Throwable)ex);
            return null;
        }
        catch (com.google.android.gms.a.f f) {
            et.b("Could not create remote AdManager.", f);
            return null;
        }
    }
    
    protected h b(final IBinder binder) {
        return i.a(binder);
    }
}
