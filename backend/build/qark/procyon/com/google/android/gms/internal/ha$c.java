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
import com.google.android.gms.b.a.b.f;

public final class ha$c extends ee implements f, SafeParcelable
{
    public static final iy a;
    private static final HashMap b;
    private final Set c;
    private final int d;
    private String e;
    
    static {
        a = new iy();
        (b = new HashMap()).put("url", ee$a.d("url", 2));
    }
    
    public ha$c() {
        this.d = 1;
        this.c = new HashSet();
    }
    
    ha$c(final Set c, final int d, final String e) {
        this.c = c;
        this.d = d;
        this.e = e;
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
        }
    }
    
    @Override
    public HashMap b() {
        return ha$c.b;
    }
    
    @Override
    protected boolean b(final String s) {
        return false;
    }
    
    public int describeContents() {
        final iy a = ha$c.a;
        return 0;
    }
    
    Set e() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof ha$c)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final ha$c ha$c = (ha$c)o;
        for (final ee$a ee$a : com.google.android.gms.internal.ha$c.b.values()) {
            if (this.a(ee$a)) {
                if (!ha$c.a(ee$a)) {
                    return false;
                }
                if (!this.b(ee$a).equals(ha$c.b(ee$a))) {
                    return false;
                }
                continue;
            }
            else {
                if (ha$c.a(ee$a)) {
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
    
    public ha$c h() {
        return this;
    }
    
    @Override
    public int hashCode() {
        final Iterator<ee$a> iterator = ha$c.b.values().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final ee$a ee$a = iterator.next();
            if (this.a(ee$a)) {
                n = this.b(ee$a).hashCode() + (n + ee$a.g());
            }
        }
        return n;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final iy a = ha$c.a;
        iy.a(this, parcel, n);
    }
}
