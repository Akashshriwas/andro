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
import com.google.android.gms.b.a.b.g;

public final class ha$d extends ee implements g, SafeParcelable
{
    public static final iz a;
    private static final HashMap b;
    private final Set c;
    private final int d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    
    static {
        a = new iz();
        (b = new HashMap()).put("familyName", ee$a.d("familyName", 2));
        ha$d.b.put("formatted", ee$a.d("formatted", 3));
        ha$d.b.put("givenName", ee$a.d("givenName", 4));
        ha$d.b.put("honorificPrefix", ee$a.d("honorificPrefix", 5));
        ha$d.b.put("honorificSuffix", ee$a.d("honorificSuffix", 6));
        ha$d.b.put("middleName", ee$a.d("middleName", 7));
    }
    
    public ha$d() {
        this.d = 1;
        this.c = new HashSet();
    }
    
    ha$d(final Set c, final int d, final String e, final String f, final String g, final String h, final String i, final String j) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
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
        }
    }
    
    @Override
    public HashMap b() {
        return ha$d.b;
    }
    
    @Override
    protected boolean b(final String s) {
        return false;
    }
    
    public int describeContents() {
        final iz a = ha$d.a;
        return 0;
    }
    
    Set e() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof ha$d)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final ha$d ha$d = (ha$d)o;
        for (final ee$a ee$a : com.google.android.gms.internal.ha$d.b.values()) {
            if (this.a(ee$a)) {
                if (!ha$d.a(ee$a)) {
                    return false;
                }
                if (!this.b(ee$a).equals(ha$d.b(ee$a))) {
                    return false;
                }
                continue;
            }
            else {
                if (ha$d.a(ee$a)) {
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
        final Iterator<ee$a> iterator = ha$d.b.values().iterator();
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
    
    public String l() {
        return this.j;
    }
    
    public ha$d m() {
        return this;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final iz a = ha$d.a;
        iz.a(this, parcel, n);
    }
}
