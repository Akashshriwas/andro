// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.Map;
import java.util.LinkedHashMap;

public class hd
{
    private final LinkedHashMap a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    
    private int c(final Object obj, final Object obj2) {
        final int a = this.a(obj, obj2);
        if (a < 0) {
            throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
        }
        return a;
    }
    
    protected int a(final Object o, final Object o2) {
        return 1;
    }
    
    public final void a() {
        this.a(-1);
    }
    
    public void a(final int n) {
        while (true) {
            synchronized (this) {
                if (this.b < 0 || (this.a.isEmpty() && this.b != 0)) {
                    throw new IllegalStateException(this.getClass().getName() + ".sizeOf() is reporting inconsistent results!");
                }
            }
            if (this.b <= n || this.a.isEmpty()) {
                break;
            }
            final Map.Entry<Object, V> entry = this.a.entrySet().iterator().next();
            final Object key = entry.getKey();
            final V value = entry.getValue();
            this.a.remove(key);
            this.b -= this.c(key, value);
            ++this.e;
            // monitorexit(this)
            this.a(true, key, value, null);
        }
    }
    // monitorexit(this)
    
    protected void a(final boolean b, final Object o, final Object o2, final Object o3) {
    }
    
    public final Object b(final Object key, final Object value) {
        if (key == null || value == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            ++this.d;
            this.b += this.c(key, value);
            final Object put = this.a.put(key, value);
            if (put != null) {
                this.b -= this.c(key, put);
            }
            // monitorexit(this)
            if (put != null) {
                this.a(false, key, put, value);
            }
            this.a(this.c);
            return put;
        }
    }
    
    @Override
    public final String toString() {
        int i = 0;
        synchronized (this) {
            final int n = this.f + this.g;
            if (n != 0) {
                i = this.f * 100 / n;
            }
            return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", this.c, this.f, this.g, i);
        }
    }
}
