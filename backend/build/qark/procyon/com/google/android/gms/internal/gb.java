// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Collections;
import java.util.Locale;
import java.util.TimeZone;
import java.util.Map;
import java.util.List;
import android.net.Uri;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.LatLng;
import android.os.Bundle;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class gb extends ic implements SafeParcelable
{
    public static final ik a;
    final int b;
    private final String c;
    private final Bundle d;
    private final gd e;
    private final LatLng f;
    private final float g;
    private final LatLngBounds h;
    private final String i;
    private final Uri j;
    private final boolean k;
    private final float l;
    private final int m;
    private final long n;
    private final List o;
    private final Map p;
    private final TimeZone q;
    private Locale r;
    private im s;
    
    static {
        a = new ik();
    }
    
    gb(final int b, final String c, final List list, final Bundle d, final gd e, final LatLng f, final float g, final LatLngBounds h, final String i, final Uri j, final boolean k, final float l, final int m, final long n) {
        this.b = b;
        this.c = c;
        this.o = Collections.unmodifiableList((List<?>)list);
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
        this.n = n;
        final HashMap<fw, String> m2 = new HashMap<fw, String>();
        for (final String s : d.keySet()) {
            m2.put(fw.a(s), d.getString(s));
        }
        this.p = Collections.unmodifiableMap((Map<?, ?>)m2);
        this.q = TimeZone.getTimeZone(this.i);
        this.r = null;
        this.s = null;
    }
    
    private void a(final String s) {
        if (this.s != null) {
            this.s.a(this.c, "PlaceImpl", s);
        }
    }
    
    public String a() {
        this.a("getId");
        return this.c;
    }
    
    public List b() {
        this.a("getTypes");
        return this.o;
    }
    
    public LatLng c() {
        this.a("getLatLng");
        return this.f;
    }
    
    public float d() {
        this.a("getLevelNumber");
        return this.g;
    }
    
    public int describeContents() {
        final ik a = gb.a;
        return 0;
    }
    
    public LatLngBounds e() {
        this.a("getViewport");
        return this.h;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof gb)) {
                return false;
            }
            final gb gb = (gb)o;
            if (!this.c.equals(gb.c) || !gw.a(this.r, gb.r) || this.n != gb.n) {
                return false;
            }
        }
        return true;
    }
    
    public Uri f() {
        this.a("getWebsiteUri");
        return this.j;
    }
    
    public boolean g() {
        this.a("isPermanentlyClosed");
        return this.k;
    }
    
    public float h() {
        this.a("getRating");
        return this.l;
    }
    
    @Override
    public int hashCode() {
        return gw.a(this.c, this.r, this.n);
    }
    
    public int i() {
        this.a("getPriceLevel");
        return this.m;
    }
    
    public long j() {
        return this.n;
    }
    
    public Bundle k() {
        return this.d;
    }
    
    public gd l() {
        return this.e;
    }
    
    public String m() {
        return this.i;
    }
    
    @Override
    public String toString() {
        return gw.a(this).a("id", this.c).a("localization", this.e).a("locale", this.r).a("latlng", this.f).a("levelNumber", this.g).a("viewport", this.h).a("timeZone", this.i).a("websiteUri", this.j).a("isPermanentlyClosed", this.k).a("priceLevel", this.m).a("timestampSecs", this.n).toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final ik a = gb.a;
        ik.a(this, parcel, n);
    }
}
