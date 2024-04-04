// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.b.a.a.b;

public final class gx extends ee implements b, SafeParcelable
{
    public static final ir a;
    private static final HashMap b;
    private final Set c;
    private final int d;
    private String e;
    private gv f;
    private String g;
    private gv h;
    private String i;
    
    static {
        a = new ir();
        (b = new HashMap()).put("id", ee$a.d("id", 2));
        gx.b.put("result", ee$a.a("result", 4, gv.class));
        gx.b.put("startDate", ee$a.d("startDate", 5));
        gx.b.put("target", ee$a.a("target", 6, gv.class));
        gx.b.put("type", ee$a.d("type", 7));
    }
    
    public gx() {
        this.d = 1;
        this.c = new HashSet();
    }
    
    gx(final Set c, final int d, final String e, final gv f, final String g, final gv h, final String i) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    protected Object a(final String s) {
        return null;
    }
    
    @Override
    protected boolean a(final ee$a ee$a) {
        return this.c.contains(ee$a.g());
    }
    
    @Override
    protected Object b(final ee$a ee$a) {
        switch (ee$a.g()) {
            default: {
                throw new IllegalStateException("Unknown safe parcelable id=" + ee$a.g());
            }
            case 2: {
                return this.e;
            }
            case 4: {
                return this.f;
            }
            case 5: {
                return this.g;
            }
            case 6: {
                return this.h;
            }
            case 7: {
                return this.i;
            }
        }
    }
    
    @Override
    public HashMap b() {
        return gx.b;
    }
    
    @Override
    protected boolean b(final String s) {
        return false;
    }
    
    public int describeContents() {
        final ir a = gx.a;
        return 0;
    }
    
    Set e() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof gx)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final gx gx = (gx)o;
        for (final ee$a ee$a : com.google.android.gms.internal.gx.b.values()) {
            if (this.a(ee$a)) {
                if (!gx.a(ee$a)) {
                    return false;
                }
                if (!this.b(ee$a).equals(gx.b(ee$a))) {
                    return false;
                }
                continue;
            }
            else {
                if (gx.a(ee$a)) {
                    return false;
                }
                continue;
            }
        }
        return true;
    }
    
    int f() {
        return this.d;
    }
    
    public String g() {
        return this.e;
    }
    
    gv h() {
        return this.f;
    }
    
    @Override
    public int hashCode() {
        final Iterator<ee$a> iterator = gx.b.values().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final ee$a ee$a = iterator.next();
            if (this.a(ee$a)) {
                n = this.b(ee$a).hashCode() + (n + ee$a.g());
            }
        }
        return n;
    }
    
    public String i() {
        return this.g;
    }
    
    gv j() {
        return this.h;
    }
    
    public String k() {
        return this.i;
    }
    
    public gx l() {
        return this;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final ir a = gx.a;
        ir.a(this, parcel, n);
    }
}
