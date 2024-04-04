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
import com.google.android.gms.b.a.b.e;

public final class ha$b$b extends ee implements e, SafeParcelable
{
    public static final ix a;
    private static final HashMap b;
    private final Set c;
    private final int d;
    private int e;
    private String f;
    private int g;
    
    static {
        a = new ix();
        (b = new HashMap()).put("height", ee$a.a("height", 2));
        ha$b$b.b.put("url", ee$a.d("url", 3));
        ha$b$b.b.put("width", ee$a.a("width", 4));
    }
    
    public ha$b$b() {
        this.d = 1;
        this.c = new HashSet();
    }
    
    ha$b$b(final Set c, final int d, final int e, final String f, final int g) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
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
        }
    }
    
    @Override
    public HashMap b() {
        return ha$b$b.b;
    }
    
    @Override
    protected boolean b(final String s) {
        return false;
    }
    
    public int describeContents() {
        final ix a = ha$b$b.a;
        return 0;
    }
    
    Set e() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof ha$b$b)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final ha$b$b ha$b$b = (ha$b$b)o;
        for (final ee$a ee$a : com.google.android.gms.internal.ha$b$b.b.values()) {
            if (this.a(ee$a)) {
                if (!ha$b$b.a(ee$a)) {
                    return false;
                }
                if (!this.b(ee$a).equals(ha$b$b.b(ee$a))) {
                    return false;
                }
                continue;
            }
            else {
                if (ha$b$b.a(ee$a)) {
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
    
    public int g() {
        return this.e;
    }
    
    public String h() {
        return this.f;
    }
    
    @Override
    public int hashCode() {
        final Iterator<ee$a> iterator = ha$b$b.b.values().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final ee$a ee$a = iterator.next();
            if (this.a(ee$a)) {
                n = this.b(ee$a).hashCode() + (n + ee$a.g());
            }
        }
        return n;
    }
    
    public int i() {
        return this.g;
    }
    
    public ha$b$b j() {
        return this;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final ix a = ha$b$b.a;
        ix.a(this, parcel, n);
    }
}
