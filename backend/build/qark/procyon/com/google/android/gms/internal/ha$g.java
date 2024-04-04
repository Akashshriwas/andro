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
import com.google.android.gms.b.a.b.i;

public final class ha$g extends ee implements i, SafeParcelable
{
    public static final jb a;
    private static final HashMap b;
    private final Set c;
    private final int d;
    private boolean e;
    private String f;
    
    static {
        a = new jb();
        (b = new HashMap()).put("primary", ee$a.c("primary", 2));
        ha$g.b.put("value", ee$a.d("value", 3));
    }
    
    public ha$g() {
        this.d = 1;
        this.c = new HashSet();
    }
    
    ha$g(final Set c, final int d, final boolean e, final String f) {
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
        return ha$g.b;
    }
    
    @Override
    protected boolean b(final String s) {
        return false;
    }
    
    public int describeContents() {
        final jb a = ha$g.a;
        return 0;
    }
    
    Set e() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof ha$g)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final ha$g ha$g = (ha$g)o;
        for (final ee$a ee$a : com.google.android.gms.internal.ha$g.b.values()) {
            if (this.a(ee$a)) {
                if (!ha$g.a(ee$a)) {
                    return false;
                }
                if (!this.b(ee$a).equals(ha$g.b(ee$a))) {
                    return false;
                }
                continue;
            }
            else {
                if (ha$g.a(ee$a)) {
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
    
    public boolean g() {
        return this.e;
    }
    
    public String h() {
        return this.f;
    }
    
    @Override
    public int hashCode() {
        final Iterator<ee$a> iterator = ha$g.b.values().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final ee$a ee$a = iterator.next();
            if (this.a(ee$a)) {
                n = this.b(ee$a).hashCode() + (n + ee$a.g());
            }
        }
        return n;
    }
    
    public ha$g i() {
        return this;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final jb a = ha$g.a;
        jb.a(this, parcel, n);
    }
}
