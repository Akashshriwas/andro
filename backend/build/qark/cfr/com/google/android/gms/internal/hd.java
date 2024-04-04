/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class hd {
    private final LinkedHashMap a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    private int c(Object object, Object object2) {
        int n2 = this.a(object, object2);
        if (n2 < 0) {
            throw new IllegalStateException("Negative size: " + object + "=" + object2);
        }
        return n2;
    }

    protected int a(Object object, Object object2) {
        return 1;
    }

    public final void a() {
        this.a(-1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(int n2) {
        do {
            Object object;
            Object object2;
            synchronized (this) {
                if (this.b < 0 || this.a.isEmpty() && this.b != 0) {
                    throw new IllegalStateException(this.getClass().getName() + ".sizeOf() is reporting inconsistent results!");
                }
                if (this.b <= n2 || this.a.isEmpty()) {
                    return;
                }
                object2 = (Map.Entry)this.a.entrySet().iterator().next();
                object = object2.getKey();
                object2 = object2.getValue();
                this.a.remove(object);
                this.b -= this.c(object, object2);
                ++this.e;
            }
            this.a(true, object, object2, null);
        } while (true);
    }

    protected void a(boolean bl2, Object object, Object object2, Object object3) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object b(Object object, Object object2) {
        if (object == null) throw new NullPointerException("key == null || value == null");
        if (object2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        // MONITORENTER : this
        ++this.d;
        this.b += this.c(object, object2);
        Object object3 = this.a.put(object, object2);
        if (object3 != null) {
            this.b -= this.c(object, object3);
        }
        // MONITOREXIT : this
        if (object3 != null) {
            this.a(false, object, object3, object2);
        }
        this.a(this.c);
        return object3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String toString() {
        int n2 = 0;
        synchronized (this) {
            int n3 = this.f + this.g;
            if (n3 == 0) return String.format((String)"LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", (Object[])new Object[]{this.c, this.f, this.g, n2});
            n2 = this.f * 100 / n3;
            return String.format((String)"LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", (Object[])new Object[]{this.c, this.f, this.g, n2});
        }
    }
}

