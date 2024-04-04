/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 */
package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.a.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.ee$a;
import com.google.android.gms.internal.iq;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class gv
extends ee
implements a,
SafeParcelable {
    public static final iq a = new iq();
    private static final HashMap b = new HashMap();
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
        b.put((Object)"about", (Object)ee$a.a("about", 2, gv.class));
        b.put((Object)"additionalName", (Object)ee$a.e("additionalName", 3));
        b.put((Object)"address", (Object)ee$a.a("address", 4, gv.class));
        b.put((Object)"addressCountry", (Object)ee$a.d("addressCountry", 5));
        b.put((Object)"addressLocality", (Object)ee$a.d("addressLocality", 6));
        b.put((Object)"addressRegion", (Object)ee$a.d("addressRegion", 7));
        b.put((Object)"associated_media", (Object)ee$a.b("associated_media", 8, gv.class));
        b.put((Object)"attendeeCount", (Object)ee$a.a("attendeeCount", 9));
        b.put((Object)"attendees", (Object)ee$a.b("attendees", 10, gv.class));
        b.put((Object)"audio", (Object)ee$a.a("audio", 11, gv.class));
        b.put((Object)"author", (Object)ee$a.b("author", 12, gv.class));
        b.put((Object)"bestRating", (Object)ee$a.d("bestRating", 13));
        b.put((Object)"birthDate", (Object)ee$a.d("birthDate", 14));
        b.put((Object)"byArtist", (Object)ee$a.a("byArtist", 15, gv.class));
        b.put((Object)"caption", (Object)ee$a.d("caption", 16));
        b.put((Object)"contentSize", (Object)ee$a.d("contentSize", 17));
        b.put((Object)"contentUrl", (Object)ee$a.d("contentUrl", 18));
        b.put((Object)"contributor", (Object)ee$a.b("contributor", 19, gv.class));
        b.put((Object)"dateCreated", (Object)ee$a.d("dateCreated", 20));
        b.put((Object)"dateModified", (Object)ee$a.d("dateModified", 21));
        b.put((Object)"datePublished", (Object)ee$a.d("datePublished", 22));
        b.put((Object)"description", (Object)ee$a.d("description", 23));
        b.put((Object)"duration", (Object)ee$a.d("duration", 24));
        b.put((Object)"embedUrl", (Object)ee$a.d("embedUrl", 25));
        b.put((Object)"endDate", (Object)ee$a.d("endDate", 26));
        b.put((Object)"familyName", (Object)ee$a.d("familyName", 27));
        b.put((Object)"gender", (Object)ee$a.d("gender", 28));
        b.put((Object)"geo", (Object)ee$a.a("geo", 29, gv.class));
        b.put((Object)"givenName", (Object)ee$a.d("givenName", 30));
        b.put((Object)"height", (Object)ee$a.d("height", 31));
        b.put((Object)"id", (Object)ee$a.d("id", 32));
        b.put((Object)"image", (Object)ee$a.d("image", 33));
        b.put((Object)"inAlbum", (Object)ee$a.a("inAlbum", 34, gv.class));
        b.put((Object)"latitude", (Object)ee$a.b("latitude", 36));
        b.put((Object)"location", (Object)ee$a.a("location", 37, gv.class));
        b.put((Object)"longitude", (Object)ee$a.b("longitude", 38));
        b.put((Object)"name", (Object)ee$a.d("name", 39));
        b.put((Object)"partOfTVSeries", (Object)ee$a.a("partOfTVSeries", 40, gv.class));
        b.put((Object)"performers", (Object)ee$a.b("performers", 41, gv.class));
        b.put((Object)"playerType", (Object)ee$a.d("playerType", 42));
        b.put((Object)"postOfficeBoxNumber", (Object)ee$a.d("postOfficeBoxNumber", 43));
        b.put((Object)"postalCode", (Object)ee$a.d("postalCode", 44));
        b.put((Object)"ratingValue", (Object)ee$a.d("ratingValue", 45));
        b.put((Object)"reviewRating", (Object)ee$a.a("reviewRating", 46, gv.class));
        b.put((Object)"startDate", (Object)ee$a.d("startDate", 47));
        b.put((Object)"streetAddress", (Object)ee$a.d("streetAddress", 48));
        b.put((Object)"text", (Object)ee$a.d("text", 49));
        b.put((Object)"thumbnail", (Object)ee$a.a("thumbnail", 50, gv.class));
        b.put((Object)"thumbnailUrl", (Object)ee$a.d("thumbnailUrl", 51));
        b.put((Object)"tickerSymbol", (Object)ee$a.d("tickerSymbol", 52));
        b.put((Object)"type", (Object)ee$a.d("type", 53));
        b.put((Object)"url", (Object)ee$a.d("url", 54));
        b.put((Object)"width", (Object)ee$a.d("width", 55));
        b.put((Object)"worstRating", (Object)ee$a.d("worstRating", 56));
    }

    public gv() {
        this.d = 1;
        this.c = new HashSet();
    }

    gv(Set set, int n2, gv gv2, List list, gv gv3, String string, String string2, String string3, List list2, int n3, List list3, gv gv4, List list4, String string4, String string5, gv gv5, String string6, String string7, String string8, List list5, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, gv gv6, String string18, String string19, String string20, String string21, gv gv7, double d2, gv gv8, double d3, String string22, gv gv9, List list6, String string23, String string24, String string25, String string26, gv gv10, String string27, String string28, String string29, gv gv11, String string30, String string31, String string32, String string33, String string34, String string35) {
        this.c = set;
        this.d = n2;
        this.e = gv2;
        this.f = list;
        this.g = gv3;
        this.h = string;
        this.i = string2;
        this.j = string3;
        this.k = list2;
        this.l = n3;
        this.m = list3;
        this.n = gv4;
        this.o = list4;
        this.p = string4;
        this.q = string5;
        this.r = gv5;
        this.s = string6;
        this.t = string7;
        this.u = string8;
        this.v = list5;
        this.w = string9;
        this.x = string10;
        this.y = string11;
        this.z = string12;
        this.A = string13;
        this.B = string14;
        this.C = string15;
        this.D = string16;
        this.E = string17;
        this.F = gv6;
        this.G = string18;
        this.H = string19;
        this.I = string20;
        this.J = string21;
        this.K = gv7;
        this.L = d2;
        this.M = gv8;
        this.N = d3;
        this.O = string22;
        this.P = gv9;
        this.Q = list6;
        this.R = string23;
        this.S = string24;
        this.T = string25;
        this.U = string26;
        this.V = gv10;
        this.W = string27;
        this.X = string28;
        this.Y = string29;
        this.Z = gv11;
        this.aa = string30;
        this.ab = string31;
        this.ac = string32;
        this.ad = string33;
        this.ae = string34;
        this.af = string35;
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
    public /* synthetic */ Object a() {
        return this.ai();
    }

    @Override
    protected Object a(String string) {
        return null;
    }

    @Override
    protected boolean a(ee$a ee$a) {
        return this.c.contains((Object)ee$a.g());
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
    protected Object b(ee$a ee$a) {
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
            case 56: 
        }
        return this.af;
    }

    @Override
    public HashMap b() {
        return b;
    }

    @Override
    protected boolean b(String string) {
        return false;
    }

    public int describeContents() {
        iq iq2 = a;
        return 0;
    }

    Set e() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (!(object instanceof gv)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        object = (gv)object;
        for (ee$a ee$a : b.values()) {
            if (this.a(ee$a)) {
                if (object.a(ee$a)) {
                    if (this.b(ee$a).equals(object.b(ee$a))) continue;
                    return false;
                }
                return false;
            }
            if (!object.a(ee$a)) continue;
            return false;
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

    public int hashCode() {
        Iterator iterator = b.values().iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            ee$a ee$a = (ee$a)iterator.next();
            if (!this.a(ee$a)) continue;
            int n3 = ee$a.g();
            n2 = this.b(ee$a).hashCode() + (n2 + n3);
        }
        return n2;
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

    public void writeToParcel(Parcel parcel, int n2) {
        iq iq2 = a;
        iq.a(this, parcel, n2);
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

