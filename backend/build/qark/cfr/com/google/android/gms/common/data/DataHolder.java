/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.database.CursorIndexOutOfBoundsException
 *  android.database.CursorWindow
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.util.Log
 *  java.lang.IllegalArgumentException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.data.a;
import com.google.android.gms.common.data.b;
import com.google.android.gms.common.data.c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hc;

public final class DataHolder
implements SafeParcelable {
    public static final c a = new c();
    private static final b m = new a(new String[0], null);
    Bundle b;
    int[] c;
    int d;
    boolean e = false;
    private final int f;
    private final String[] g;
    private final CursorWindow[] h;
    private final int i;
    private final Bundle j;
    private Object k;
    private boolean l = true;

    DataHolder(int n2, String[] arrstring, CursorWindow[] arrcursorWindow, int n3, Bundle bundle) {
        this.f = n2;
        this.g = arrstring;
        this.h = arrcursorWindow;
        this.i = n3;
        this.j = bundle;
    }

    private void a(String string, int n2) {
        if (this.b == null || !this.b.containsKey(string)) {
            throw new IllegalArgumentException("No such column: " + string);
        }
        if (this.h()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (n2 < 0 || n2 >= this.d) {
            throw new CursorIndexOutOfBoundsException(n2, this.d);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public int a(int n2) {
        int n3 = 0;
        boolean bl2 = n2 >= 0 && n2 < this.d;
        hc.a(bl2);
        do {
            block4 : {
                int n4;
                block3 : {
                    n4 = n3;
                    if (n3 >= this.c.length) break block3;
                    if (n2 >= this.c[n3]) break block4;
                    n4 = n3 - 1;
                }
                n2 = n4;
                if (n4 != this.c.length) return n2;
                return n4 - 1;
            }
            ++n3;
        } while (true);
    }

    public long a(String string, int n2, int n3) {
        this.a(string, n2);
        return this.h[n3].getLong(n2 - this.c[n3], this.b.getInt(string));
    }

    public void a() {
        int n2;
        int n3 = 0;
        this.b = new Bundle();
        for (n2 = 0; n2 < this.g.length; ++n2) {
            this.b.putInt(this.g[n2], n2);
        }
        this.c = new int[this.h.length];
        int n4 = 0;
        n2 = n3;
        n3 = n4;
        while (n2 < this.h.length) {
            this.c[n2] = n3;
            n3 += this.h[n2].getNumRows();
            ++n2;
        }
        this.d = n3;
    }

    int b() {
        return this.f;
    }

    public int b(String string, int n2, int n3) {
        this.a(string, n2);
        return this.h[n3].getInt(n2 - this.c[n3], this.b.getInt(string));
    }

    public String c(String string, int n2, int n3) {
        this.a(string, n2);
        return this.h[n3].getString(n2 - this.c[n3], this.b.getInt(string));
    }

    String[] c() {
        return this.g;
    }

    public boolean d(String string, int n2, int n3) {
        this.a(string, n2);
        if (Long.valueOf((long)this.h[n3].getLong(n2 - this.c[n3], this.b.getInt(string))) == 1L) {
            return true;
        }
        return false;
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

    public byte[] e(String string, int n2, int n3) {
        this.a(string, n2);
        return this.h[n3].getBlob(n2 - this.c[n3], this.b.getInt(string));
    }

    public Uri f(String string, int n2, int n3) {
        if ((string = this.c(string, n2, n3)) == null) {
            return null;
        }
        return Uri.parse((String)string);
    }

    public Bundle f() {
        return this.j;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void finalize() {
        try {
            if (!this.l) return;
            if (this.h.length <= 0) return;
            if (this.h()) return;
            String string = this.k == null ? "internal object: " + this.toString() : this.k.toString();
            Log.e((String)"DataBuffer", (String)("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call close() on all DataBuffer extending objects when you are done with them. (" + string + ")"));
            this.i();
            return;
        }
        finally {
            super.finalize();
        }
    }

    public int g() {
        return this.d;
    }

    public boolean g(String string, int n2, int n3) {
        this.a(string, n2);
        return this.h[n3].isNull(n2 - this.c[n3], this.b.getInt(string));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean h() {
        synchronized (this) {
            return this.e;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void i() {
        synchronized (this) {
            if (this.e) {
                return;
            }
            this.e = true;
            int n2 = 0;
            while (n2 < this.h.length) {
                this.h[n2].close();
                ++n2;
            }
            return;
        }
    }

    public void writeToParcel(Parcel parcel, int n2) {
        c.a(this, parcel, n2);
    }
}

