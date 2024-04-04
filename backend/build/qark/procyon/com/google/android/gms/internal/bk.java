// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.a.a.j;
import com.google.a.a.b;
import java.util.Map;

public final class bk extends bn
{
    private Map a;
    
    private bp b(final String s) {
        try {
            final b b = (b)Class.forName(s).newInstance();
            return new bv(b, (j)this.a.get(b.b()));
        }
        catch (Throwable t) {
            et.e("Could not instantiate mediation adapter: " + s + ". " + t.getMessage());
            throw new RemoteException();
        }
    }
    
    public bp a(final String s) {
        return this.b(s);
    }
    
    public void a(final Map a) {
        this.a = a;
    }
}
