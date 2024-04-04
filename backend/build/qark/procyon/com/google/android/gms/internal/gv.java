// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.HashMap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.b.a.a.a;

public final class gv extends ee implements a, SafeParcelable
{
    public static final iq a;
    private static final HashMap b;
    private String A;
    private String B;
    private String C;
    private String D;
    private String E;
    private gv F;
    private String G;
    private String H;
    private String I;
    private String J;
    private gv K;
    private double L;
    private gv M;
    private double N;
    private String O;
    private gv P;
    private List Q;
    private String R;
    private String S;
    private String T;
    private String U;
    private gv V;
    private String W;
    private String X;
    private String Y;
    private gv Z;
    private String aa;
    private String ab;
    private String ac;
    private String ad;
    private String ae;
    private String af;
    private final Set c;
    private final int d;
    private gv e;
    private List f;
    private gv g;
    private String h;
    private String i;
    private String j;
    private List k;
    private int l;
    private List m;
    private gv n;
    private List o;
    private String p;
    private String q;
    private gv r;
    private String s;
    private String t;
    private String u;
    private List v;
    private String w;
    private String x;
    private String y;
    private String z;
    
    static {
        a = new iq();
        (b = new HashMap()).put("about", ee$a.a("about", 2, gv.class));
        gv.b.put("additionalName", ee$a.e("additionalName", 3));
        gv.b.put("address", ee$a.a("address", 4, gv.class));
        gv.b.put("addressCountry", ee$a.d("addressCountry", 5));
        gv.b.put("addressLocality", ee$a.d("addressLocality", 6));
        gv.b.put("addressRegion", ee$a.d("addressRegion", 7));
        gv.b.put("associated_media", ee$a.b("associated_media", 8, gv.class));
        gv.b.put("attendeeCount", ee$a.a("attendeeCount", 9));
        gv.b.put("attendees", ee$a.b("attendees", 10, gv.class));
        gv.b.put("audio", ee$a.a("audio", 11, gv.class));
        gv.b.put("author", ee$a.b("author", 12, gv.class));
        gv.b.put("bestRating", ee$a.d("bestRating", 13));
        gv.b.put("birthDate", ee$a.d("birthDate", 14));
        gv.b.put("byArtist", ee$a.a("byArtist", 15, gv.class));
        gv.b.put("caption", ee$a.d("caption", 16));
        gv.b.put("contentSize", ee$a.d("contentSize", 17));
        gv.b.put("contentUrl", ee$a.d("contentUrl", 18));
        gv.b.put("contributor", ee$a.b("contributor", 19, gv.class));
        gv.b.put("dateCreated", ee$a.d("dateCreated", 20));
        gv.b.put("dateModified", ee$a.d("dateModified", 21));
        gv.b.put("datePublished", ee$a.d("datePublished", 22));
        gv.b.put("description", ee$a.d("description", 23));
        gv.b.put("duration", ee$a.d("duration", 24));
        gv.b.put("embedUrl", ee$a.d("embedUrl", 25));
        gv.b.put("endDate", ee$a.d("endDate", 26));
        gv.b.put("familyName", ee$a.d("familyName", 27));
        gv.b.put("gender", ee$a.d("gender", 28));
        gv.b.put("geo", ee$a.a("geo", 29, gv.class));
        gv.b.put("givenName", ee$a.d("givenName", 30));
        gv.b.put("height", ee$a.d("height", 31));
        gv.b.put("id", ee$a.d("id", 32));
        gv.b.put("image", ee$a.d("image", 33));
        gv.b.put("inAlbum", ee$a.a("inAlbum", 34, gv.class));
        gv.b.put("latitude", ee$a.b("latitude", 36));
        gv.b.put("location", ee$a.a("location", 37, gv.class));
        gv.b.put("longitude", ee$a.b("longitude", 38));
        gv.b.put("name", ee$a.d("name", 39));
        gv.b.put("partOfTVSeries", ee$a.a("partOfTVSeries", 40, gv.class));
        gv.b.put("performers", ee$a.b("performers", 41, gv.class));
        gv.b.put("playerType", ee$a.d("playerType", 42));
        gv.b.put("postOfficeBoxNumber", ee$a.d("postOfficeBoxNumber", 43));
        gv.b.put("postalCode", ee$a.d("postalCode", 44));
        gv.b.put("ratingValue", ee$a.d("ratingValue", 45));
        gv.b.put("reviewRating", ee$a.a("reviewRating", 46, gv.class));
        gv.b.put("startDate", ee$a.d("startDate", 47));
        gv.b.put("streetAddress", ee$a.d("streetAddress", 48));
        gv.b.put("text", ee$a.d("text", 49));
        gv.b.put("thumbnail", ee$a.a("thumbnail", 50, gv.class));
        gv.b.put("thumbnailUrl", ee$a.d("thumbnailUrl", 51));
        gv.b.put("tickerSymbol", ee$a.d("tickerSymbol", 52));
        gv.b.put("type", ee$a.d("type", 53));
        gv.b.put("url", ee$a.d("url", 54));
        gv.b.put("width", ee$a.d("width", 55));
        gv.b.put("worstRating", ee$a.d("worstRating", 56));
    }
    
    public gv() {
        this.d = 1;
        this.c = new HashSet();
    }
    
    gv(final Set c, final int d, final gv e, final List f, final gv g, final String h, final String i, final String j, final List k, final int l, final List m, final gv n, final List o, final String p56, final String q, final gv r, final String s, final String t, final String u, final List v, final String w, final String x, final String y, final String z, final String a, final String b, final String c2, final String d2, final String e2, final gv f2, final String g2, final String h2, final String i2, final String j2, final gv k2, final double l2, final gv m2, final double n2, final String o2, final gv p57, final List q2, final String r2, final String s2, final String t2, final String u2, final gv v2, final String w2, final String x2, final String y2, final gv z2, final String aa, final String ab, final String ac, final String ad, final String ae, final String af) {
        this.c = c;
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
        this.o = o;
        this.p = p56;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c2;
        this.D = d2;
        this.E = e2;
        this.F = f2;
        this.G = g2;
        this.H = h2;
        this.I = i2;
        this.J = j2;
        this.K = k2;
        this.L = l2;
        this.M = m2;
        this.N = n2;
        this.O = o2;
        this.P = p57;
        this.Q = q2;
        this.R = r2;
        this.S = s2;
        this.T = t2;
        this.U = u2;
        this.V = v2;
        this.W = w2;
        this.X = x2;
        this.Y = y2;
        this.Z = z2;
        this.aa = aa;
        this.ab = ab;
        this.ac = ac;
        this.ad = ad;
        this.ae = ae;
        this.af = af;
    }
    
    public String A() {
        return this.y;
    }
    
    public String B() {
        return this.z;
    }
    
    public String C() {
        return this.A;
    }
    
    public String D() {
        return this.B;
    }
    
    public String E() {
        return this.C;
    }
    
    public String F() {
        return this.D;
    }
    
    public String G() {
        return this.E;
    }
    
    gv H() {
        return this.F;
    }
    
    public String I() {
        return this.G;
    }
    
    public String J() {
        return this.H;
    }
    
    public String K() {
        return this.I;
    }
    
    public String L() {
        return this.J;
    }
    
    gv M() {
        return this.K;
    }
    
    public double N() {
        return this.L;
    }
    
    gv O() {
        return this.M;
    }
    
    public double P() {
        return this.N;
    }
    
    public String Q() {
        return this.O;
    }
    
    gv R() {
        return this.P;
    }
    
    List S() {
        return this.Q;
    }
    
    public String T() {
        return this.R;
    }
    
    public String U() {
        return this.S;
    }
    
    public String V() {
        return this.T;
    }
    
    public String W() {
        return this.U;
    }
    
    gv X() {
        return this.V;
    }
    
    public String Y() {
        return this.W;
    }
    
    public String Z() {
        return this.X;
    }
    
    @Override
    protected Object a(final String s) {
        return null;
    }
    
    @Override
    protected boolean a(final ee$a ee$a) {
        return this.c.contains(ee$a.g());
    }
    
    public String aa() {
        return this.Y;
    }
    
    gv ab() {
        return this.Z;
    }
    
    public String ac() {
        return this.aa;
    }
    
    public String ad() {
        return this.ab;
    }
    
    public String ae() {
        return this.ac;
    }
    
    public String af() {
        return this.ad;
    }
    
    public String ag() {
        return this.ae;
    }
    
    public String ah() {
        return this.af;
    }
    
    public gv ai() {
        return this;
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
            case 8: {
                return this.k;
            }
            case 9: {
                return this.l;
            }
            case 10: {
                return this.m;
            }
            case 11: {
                return this.n;
            }
            case 12: {
                return this.o;
            }
            case 13: {
                return this.p;
            }
            case 14: {
                return this.q;
            }
            case 15: {
                return this.r;
            }
            case 16: {
                return this.s;
            }
            case 17: {
                return this.t;
            }
            case 18: {
                return this.u;
            }
            case 19: {
                return this.v;
            }
            case 20: {
                return this.w;
            }
            case 21: {
                return this.x;
            }
            case 22: {
                return this.y;
            }
            case 23: {
                return this.z;
            }
            case 24: {
                return this.A;
            }
            case 25: {
                return this.B;
            }
            case 26: {
                return this.C;
            }
            case 27: {
                return this.D;
            }
            case 28: {
                return this.E;
            }
            case 29: {
                return this.F;
            }
            case 30: {
                return this.G;
            }
            case 31: {
                return this.H;
            }
            case 32: {
                return this.I;
            }
            case 33: {
                return this.J;
            }
            case 34: {
                return this.K;
            }
            case 36: {
                return this.L;
            }
            case 37: {
                return this.M;
            }
            case 38: {
                return this.N;
            }
            case 39: {
                return this.O;
            }
            case 40: {
                return this.P;
            }
            case 41: {
                return this.Q;
            }
            case 42: {
                return this.R;
            }
            case 43: {
                return this.S;
            }
            case 44: {
                return this.T;
            }
            case 45: {
                return this.U;
            }
            case 46: {
                return this.V;
            }
            case 47: {
                return this.W;
            }
            case 48: {
                return this.X;
            }
            case 49: {
                return this.Y;
            }
            case 50: {
                return this.Z;
            }
            case 51: {
                return this.aa;
            }
            case 52: {
                return this.ab;
            }
            case 53: {
                return this.ac;
            }
            case 54: {
                return this.ad;
            }
            case 55: {
                return this.ae;
            }
            case 56: {
                return this.af;
            }
        }
    }
    
    @Override
    public HashMap b() {
        return gv.b;
    }
    
    @Override
    protected boolean b(final String s) {
        return false;
    }
    
    public int describeContents() {
        final iq a = gv.a;
        return 0;
    }
    
    Set e() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof gv)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final gv gv = (gv)o;
        for (final ee$a ee$a : com.google.android.gms.internal.gv.b.values()) {
            if (this.a(ee$a)) {
                if (!gv.a(ee$a)) {
                    return false;
                }
                if (!this.b(ee$a).equals(gv.b(ee$a))) {
                    return false;
                }
                continue;
            }
            else {
                if (gv.a(ee$a)) {
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
    
    gv g() {
        return this.e;
    }
    
    public List h() {
        return this.f;
    }
    
    @Override
    public int hashCode() {
        final Iterator<ee$a> iterator = gv.b.values().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final ee$a ee$a = iterator.next();
            if (this.a(ee$a)) {
                n = this.b(ee$a).hashCode() + (n + ee$a.g());
            }
        }
        return n;
    }
    
    gv i() {
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
    
    List m() {
        return this.k;
    }
    
    public int n() {
        return this.l;
    }
    
    List o() {
        return this.m;
    }
    
    gv p() {
        return this.n;
    }
    
    List q() {
        return this.o;
    }
    
    public String r() {
        return this.p;
    }
    
    public String s() {
        return this.q;
    }
    
    gv t() {
        return this.r;
    }
    
    public String u() {
        return this.s;
    }
    
    public String v() {
        return this.t;
    }
    
    public String w() {
        return this.u;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final iq a = gv.a;
        iq.a(this, parcel, n);
    }
    
    List x() {
        return this.v;
    }
    
    public String y() {
        return this.w;
    }
    
    public String z() {
        return this.x;
    }
}
