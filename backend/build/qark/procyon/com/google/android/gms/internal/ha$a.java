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
import com.google.android.gms.b.a.b.b;

public final class ha$a extends ee implements b, SafeParcelable
{
    public static final iu a;
    private static final HashMap b;
    private final Set c;
    private final int d;
    private int e;
    private int f;
    
    static {
        a = new iu();
        (b = new HashMap()).put("max", ee$a.a("max", 2));
        ha$a.b.put("min", ee$a.a("min", 3));
    }
    
    public ha$a() {
        this.d = 1;
        this.c = new HashSet();
    }
    
    ha$a(final Set c, final int d, final int e, final int f) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
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
        }
    }
    
    @Override
    public HashMap b() {
        return ha$a.b;
    }
    
    @Override
    protected boolean b(final String s) {
        return false;
    }
    
    public int describeContents() {
        final iu a = ha$a.a;
        return 0;
    }
    
    Set e() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof ha$a)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final ha$a ha$a = (ha$a)o;
        for (final ee$a ee$a : com.google.android.gms.internal.ha$a.b.values()) {
            if (this.a(ee$a)) {
                if (!ha$a.a(ee$a)) {
                    return false;
                }
                if (!this.b(ee$a).equals(ha$a.b(ee$a))) {
                    return false;
                }
                continue;
            }
            else {
                if (ha$a.a(ee$a)) {
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
    
    public int h() {
        return this.f;
    }
    
    @Override
    public int hashCode() {
        final Iterator<ee$a> iterator = ha$a.b.values().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final ee$a ee$a = iterator.next();
            if (this.a(ee$a)) {
                n = this.b(ee$a).hashCode() + (n + ee$a.g());
            }
        }
        return n;
    }
    
    public ha$a i() {
        return this;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final iu a = ha$a.a;
        iu.a(this, parcel, n);
    }
}
