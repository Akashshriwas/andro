// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.Collection;
import java.util.HashSet;
import java.util.Collections;
import java.util.Set;
import java.util.List;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class fs implements SafeParcelable
{
    public static final ie a;
    final int b;
    final List c;
    private final int d;
    private final String e;
    private final String f;
    private final boolean g;
    private final Set h;
    
    static {
        a = new ie();
    }
    
    fs(final int b, final int d, List list, final String s, final String s2, final boolean g) {
        this.b = b;
        this.d = d;
        if (list == null) {
            list = Collections.emptyList();
        }
        else {
            list = Collections.unmodifiableList((List<?>)list);
        }
        this.c = list;
        String e = s;
        if (s == null) {
            e = "";
        }
        this.e = e;
        String f;
        if ((f = s2) == null) {
            f = "";
        }
        this.f = f;
        this.g = g;
        if (this.c.isEmpty()) {
            this.h = Collections.emptySet();
            return;
        }
        this.h = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(this.c));
    }
    
    public int a() {
        return this.d;
    }
    
    public String b() {
        return this.e;
    }
    
    public String c() {
        return this.f;
    }
    
    public boolean d() {
        return this.g;
    }
    
    public int describeContents() {
        final ie a = fs.a;
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof fs)) {
                return false;
            }
            final fs fs = (fs)o;
            if (this.d != fs.d || !this.h.equals(fs.h) || this.e != fs.e || this.f != fs.f || this.g != fs.g) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return gw.a(this.d, this.h, this.e, this.f, this.g);
    }
    
    @Override
    public String toString() {
        return gw.a(this).a("maxResults", this.d).a("types", this.h).a("nameQuery", this.e).a("textQuery", this.f).a("isOpenNowRequired", this.g).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final ie a = fs.a;
        ie.a(this, parcel, n);
    }
}
