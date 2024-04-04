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
import com.google.android.gms.b.a.b.j;

public final class ha$h extends ee implements j, SafeParcelable
{
    public static final jc a;
    private static final HashMap b;
    private final Set c;
    private final int d;
    private String e;
    private final int f;
    private int g;
    private String h;
    
    static {
        a = new jc();
        (b = new HashMap()).put("label", ee$a.d("label", 5));
        ha$h.b.put("type", ee$a.a("type", 6, new eb().a("home", 0).a("work", 1).a("blog", 2).a("profile", 3).a("other", 4).a("otherProfile", 5).a("contributor", 6).a("website", 7), false));
        ha$h.b.put("value", ee$a.d("value", 4));
    }
    
    public ha$h() {
        this.f = 4;
        this.d = 2;
        this.c = new HashSet();
    }
    
    ha$h(final Set c, final int d, final String e, final int g, final String h, final int n) {
        this.f = 4;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
        this.h = h;
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
            case 5: {
                return this.e;
            }
            case 6: {
                return this.g;
            }
            case 4: {
                return this.h;
            }
        }
    }
    
    @Override
    public HashMap b() {
        return ha$h.b;
    }
    
    @Override
    protected boolean b(final String s) {
        return false;
    }
    
    public int describeContents() {
        final jc a = ha$h.a;
        return 0;
    }
    
    Set e() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof ha$h)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final ha$h ha$h = (ha$h)o;
        for (final ee$a ee$a : com.google.android.gms.internal.ha$h.b.values()) {
            if (this.a(ee$a)) {
                if (!ha$h.a(ee$a)) {
                    return false;
                }
                if (!this.b(ee$a).equals(ha$h.b(ee$a))) {
                    return false;
                }
                continue;
            }
            else {
                if (ha$h.a(ee$a)) {
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
    
    @Deprecated
    public int h() {
        return 4;
    }
    
    @Override
    public int hashCode() {
        final Iterator<ee$a> iterator = ha$h.b.values().iterator();
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
    
    public String j() {
        return this.h;
    }
    
    public ha$h k() {
        return this;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final jc a = ha$h.a;
        jc.a(this, parcel, n);
    }
}
