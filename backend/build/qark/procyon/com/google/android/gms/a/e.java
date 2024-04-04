// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.a;

import android.os.IBinder;
import com.google.android.gms.common.g;
import com.google.android.gms.internal.hc;
import android.content.Context;

public abstract class e
{
    private final String a;
    private Object b;
    
    protected e(final String a) {
        this.a = a;
    }
    
    protected final Object a(Context c) {
        Label_0058: {
            if (this.b != null) {
                break Label_0058;
            }
            hc.a(c);
            c = g.c(c);
            if (c == null) {
                throw new f("Could not get remote context.");
            }
            final ClassLoader classLoader = c.getClassLoader();
            try {
                this.b = this.a((IBinder)classLoader.loadClass(this.a).newInstance());
                return this.b;
            }
            catch (ClassNotFoundException ex) {
                throw new f("Could not load creator class.");
            }
            catch (InstantiationException ex2) {
                throw new f("Could not instantiate creator.");
            }
            catch (IllegalAccessException ex3) {
                throw new f("Could not access creator.");
            }
        }
    }
    
    protected abstract Object a(final IBinder p0);
}
