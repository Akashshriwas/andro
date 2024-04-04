/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcel
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Set
 *  java.util.TimeZone
 */
package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fw;
import com.google.android.gms.internal.gd;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.gz;
import com.google.android.gms.internal.ic;
import com.google.android.gms.internal.ik;
import com.google.android.gms.internal.im;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

public final class gb
extends ic
implements SafeParcelable {
    public static final ik a = new ik();
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

    gb(int n2, String string, List list, Bundle bundle, gd object2, LatLng latLng, float f2, LatLngBounds latLngBounds, String string2, Uri uri, boolean bl2, float f3, int n3, long l2) {
        this.b = n2;
        this.c = string;
        this.o = Collections.unmodifiableList((List)list);
        this.d = bundle;
        this.e = object2;
        this.f = latLng;
        this.g = f2;
        this.h = latLngBounds;
        this.i = string2;
        this.j = uri;
        this.k = bl2;
        this.l = f3;
        this.m = n3;
        this.n = l2;
        string = new HashMap();
        for (Object object2 : bundle.keySet()) {
            string.put((Object)fw.a((String)object2), (Object)bundle.getString((String)object2));
        }
        this.p = Collections.unmodifiableMap((Map)string);
        this.q = TimeZone.getTimeZone((String)this.i);
        this.r = null;
        this.s = null;
    }

    private void a(String string) {
        if (this.s != null) {
            this.s.a(this.c, "PlaceImpl", string);
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
        ik ik2 = a;
        return 0;
    }

    public LatLngBounds e() {
        this.a("getViewport");
        return this.h;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean equals(Object object) {
        block5 : {
            block4 : {
                if (this == object) break block4;
                if (!(object instanceof gb)) {
                    return false;
                }
                object = (gb)object;
                if (!this.c.equals((Object)object.c) || !gw.a((Object)this.r, (Object)object.r) || this.n != object.n) break block5;
            }
            return true;
        }
        return false;
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

    public int hashCode() {
        return gw.a(new Object[]{this.c, this.r, this.n});
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

    public String toString() {
        return gw.a((Object)this).a("id", this.c).a("localization", this.e).a("locale", (Object)this.r).a("latlng", this.f).a("levelNumber", (Object)Float.valueOf((float)this.g)).a("viewport", this.h).a("timeZone", this.i).a("websiteUri", (Object)this.j).a("isPermanentlyClosed", this.k).a("priceLevel", this.m).a("timestampSecs", this.n).toString();
    }

    public void writeToParcel(Parcel parcel, int n2) {
        ik ik2 = a;
        ik.a(this, parcel, n2);
    }
}

