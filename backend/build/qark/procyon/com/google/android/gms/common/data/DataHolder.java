// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.common.data;

import android.os.Parcel;
import android.util.Log;
import android.net.Uri;
import com.google.android.gms.internal.hc;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class DataHolder implements SafeParcelable
{
    public static final c a;
    private static final b m;
    Bundle b;
    int[] c;
    int d;
    boolean e;
    private final int f;
    private final String[] g;
    private final CursorWindow[] h;
    private final int i;
    private final Bundle j;
    private Object k;
    private boolean l;
    
    static {
        a = new c();
        m = new a(new String[0], null);
    }
    
    DataHolder(final int f, final String[] g, final CursorWindow[] h, final int i, final Bundle j) {
        this.e = false;
        this.l = true;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    private void a(final String str, final int n) {
        if (this.b == null || !this.b.containsKey(str)) {
            throw new IllegalArgumentException("No such column: " + str);
        }
        if (this.h()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (n < 0 || n >= this.d) {
            throw new CursorIndexOutOfBoundsException(n, this.d);
        }
    }
    
    public int a(int n) {
        int n2 = 0;
        hc.a(n >= 0 && n < this.d);
        int n3;
        while (true) {
            n3 = n2;
            if (n2 >= this.c.length) {
                break;
            }
            if (n < this.c[n2]) {
                n3 = n2 - 1;
                break;
            }
            ++n2;
        }
        if ((n = n3) == this.c.length) {
            n = n3 - 1;
        }
        return n;
    }
    
    public long a(final String s, final int n, final int n2) {
        this.a(s, n);
        return this.h[n2].getLong(n - this.c[n2], this.b.getInt(s));
    }
    
    public void a() {
        final int n = 0;
        this.b = new Bundle();
        for (int i = 0; i < this.g.length; ++i) {
            this.b.putInt(this.g[i], i);
        }
        this.c = new int[this.h.length];
        final int n2 = 0;
        int j = n;
        int d = n2;
        while (j < this.h.length) {
            this.c[j] = d;
            d += this.h[j].getNumRows();
            ++j;
        }
        this.d = d;
    }
    
    int b() {
        return this.f;
    }
    
    public int b(final String s, final int n, final int n2) {
        this.a(s, n);
        return this.h[n2].getInt(n - this.c[n2], this.b.getInt(s));
    }
    
    public String c(final String s, final int n, final int n2) {
        this.a(s, n);
        return this.h[n2].getString(n - this.c[n2], this.b.getInt(s));
    }
    
    String[] c() {
        return this.g;
    }
    
    public boolean d(final String s, final int n, final int n2) {
        this.a(s, n);
        return this.h[n2].getLong(n - this.c[n2], this.b.getInt(s)) == 1L;
    }
    
    CursorWindow[] d() {
        return this.h;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public int e() {
        return this.i;
    }
    
    public byte[] e(final String s, final int n, final int n2) {
        this.a(s, n);
        return this.h[n2].getBlob(n - this.c[n2], this.b.getInt(s));
    }
    
    public Uri f(String c, final int n, final int n2) {
        c = this.c(c, n, n2);
        if (c == null) {
            return null;
        }
        return Uri.parse(c);
    }
    
    public Bundle f() {
        return this.j;
    }
    
    @Override
    protected void finalize() {
        try {
            if (this.l && this.h.length > 0 && !this.h()) {
                String str;
                if (this.k == null) {
                    str = "internal object: " + this.toString();
                }
                else {
                    str = this.k.toString();
                }
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call close() on all DataBuffer extending objects when you are done with them. (" + str + ")");
                this.i();
            }
        }
        finally {
            super.finalize();
        }
    }
    
    public int g() {
        return this.d;
    }
    
    public boolean g(final String s, final int n, final int n2) {
        this.a(s, n);
        return this.h[n2].isNull(n - this.c[n2], this.b.getInt(s));
    }
    
    public boolean h() {
        synchronized (this) {
            return this.e;
        }
    }
    
    public void i() {
        synchronized (this) {
            if (!this.e) {
                this.e = true;
                for (int i = 0; i < this.h.length; ++i) {
                    this.h[i].close();
                }
            }
        }
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        com.google.android.gms.common.data.c.a(this, parcel, n);
    }
}
