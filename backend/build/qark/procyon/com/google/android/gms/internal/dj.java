// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public abstract class dj implements SafeParcelable
{
    private static final Object a;
    private static ClassLoader b;
    private static Integer c;
    private boolean d;
    
    static {
        a = new Object();
        dj.b = null;
        dj.c = null;
    }
    
    public dj() {
        this.d = false;
    }
    
    private static boolean a(final Class clazz) {
        try {
            return "SAFE_PARCELABLE_NULL_STRING".equals(clazz.getField("NULL").get(null));
        }
        catch (IllegalAccessException ex) {
            return false;
        }
        catch (NoSuchFieldException ex2) {
            return false;
        }
    }
    
    protected static boolean b(final String name) {
        final ClassLoader v = v();
        if (v == null) {
            return true;
        }
        try {
            return a(v.loadClass(name));
        }
        catch (Exception ex) {
            return false;
        }
    }
    
    protected static ClassLoader v() {
        synchronized (dj.a) {
            return dj.b;
        }
    }
    
    protected static Integer w() {
        synchronized (dj.a) {
            return dj.c;
        }
    }
    
    protected boolean x() {
        return this.d;
    }
}
