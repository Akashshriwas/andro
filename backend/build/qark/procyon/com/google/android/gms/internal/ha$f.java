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
import com.google.android.gms.b.a.b.h;

public final class ha$f extends ee implements h, SafeParcelable
{
    public static final ja a;
    private static final HashMap b;
    private final Set c;
    private final int d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private boolean j;
    private String k;
    private String l;
    private int m;
    
    static {
        a = new ja();
        (b = new HashMap()).put("department", ee$a.d("department", 2));
        ha$f.b.put("description", ee$a.d("description", 3));
        ha$f.b.put("endDate", ee$a.d("endDate", 4));
        ha$f.b.put("location", ee$a.d("location", 5));
        ha$f.b.put("name", ee$a.d("name", 6));
        ha$f.b.put("primary", ee$a.c("primary", 7));
        ha$f.b.put("startDate", ee$a.d("startDate", 8));
        ha$f.b.put("title", ee$a.d("title", 9));
        ha$f.b.put("type", ee$a.a("type", 10, new eb().a("work", 0).a("school", 1), false));
    }
    
    public ha$f() {
        this.d = 1;
        this.c = new HashSet();
    }
    
    ha$f(final Set c, final int d, final String e, final String f, final String g, final String h, final String i, final boolean j, final String k, final String l, final int m) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
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
            case 3: {
                return this.f;
            }
            case 4: {
                return this.g;
            }
            case 5: {
                return this.h;
            }
            case 6: {
                return this.i;
            }
            case 7: {
                return this.j;
            }
            case 8: {
                return this.k;
            }
            case 9: {
                return this.l;
            }
            case 10: {
                return this.m;
            }
        }
    }
    
    @Override
    public HashMap b() {
        return ha$f.b;
    }
    
    @Override
    protected boolean b(final String s) {
        return false;
    }
    
    public int describeContents() {
        final ja a = ha$f.a;
        return 0;
    }
    
    Set e() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof ha$f)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final ha$f ha$f = (ha$f)o;
        for (final ee$a ee$a : com.google.android.gms.internal.ha$f.b.values()) {
            if (this.a(ee$a)) {
                if (!ha$f.a(ee$a)) {
                    return false;
                }
                if (!this.b(ee$a).equals(ha$f.b(ee$a))) {
                    return false;
                }
                continue;
            }
            else {
                if (ha$f.a(ee$a)) {
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
    
    public String h() {
        return this.f;
    }
    
    @Override
    public int hashCode() {
        final Iterator<ee$a> iterator = ha$f.b.values().iterator();
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
    
    public String j() {
        return this.h;
    }
    
    public String k() {
        return this.i;
    }
    
    public boolean l() {
        return this.j;
    }
    
    public String m() {
        return this.k;
    }
    
    public String n() {
        return this.l;
    }
    
    public int o() {
        return this.m;
    }
    
    public ha$f p() {
        return this;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final ja a = ha$f.a;
        ja.a(this, parcel, n);
    }
}
