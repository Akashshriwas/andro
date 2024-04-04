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
import com.google.android.gms.b.a.b.c;

public final class ha$b extends ee implements c, SafeParcelable
{
    public static final iv a;
    private static final HashMap b;
    private final Set c;
    private final int d;
    private ha$b$a e;
    private ha$b$b f;
    private int g;
    
    static {
        a = new iv();
        (b = new HashMap()).put("coverInfo", ee$a.a("coverInfo", 2, ha$b$a.class));
        ha$b.b.put("coverPhoto", ee$a.a("coverPhoto", 3, ha$b$b.class));
        ha$b.b.put("layout", ee$a.a("layout", 4, new eb().a("banner", 0), false));
    }
    
    public ha$b() {
        this.d = 1;
        this.c = new HashSet();
    }
    
    ha$b(final Set c, final int d, final ha$b$a e, final ha$b$b f, final int g) {
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
        return ha$b.b;
    }
    
    @Override
    protected boolean b(final String s) {
        return false;
    }
    
    public int describeContents() {
        final iv a = ha$b.a;
        return 0;
    }
    
    Set e() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof ha$b)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final ha$b ha$b = (ha$b)o;
        for (final ee$a ee$a : com.google.android.gms.internal.ha$b.b.values()) {
            if (this.a(ee$a)) {
                if (!ha$b.a(ee$a)) {
                    return false;
                }
                if (!this.b(ee$a).equals(ha$b.b(ee$a))) {
                    return false;
                }
                continue;
            }
            else {
                if (ha$b.a(ee$a)) {
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
    
    ha$b$a g() {
        return this.e;
    }
    
    ha$b$b h() {
        return this.f;
    }
    
    @Override
    public int hashCode() {
        final Iterator<ee$a> iterator = ha$b.b.values().iterator();
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
    
    public ha$b j() {
        return this;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final iv a = ha$b.a;
        iv.a(this, parcel, n);
    }
}
