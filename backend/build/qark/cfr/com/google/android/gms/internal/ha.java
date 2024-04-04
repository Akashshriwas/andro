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
import com.google.android.gms.b.a.b.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.eb;
import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.ee$a;
import com.google.android.gms.internal.ha$a;
import com.google.android.gms.internal.ha$b;
import com.google.android.gms.internal.ha$c;
import com.google.android.gms.internal.ha$d;
import com.google.android.gms.internal.ha$f;
import com.google.android.gms.internal.ha$g;
import com.google.android.gms.internal.ha$h;
import com.google.android.gms.internal.it;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ha
extends ee
implements a,
SafeParcelable {
    public static final it a = new it();
    private static final HashMap b = new HashMap();
    private List A;
    private boolean B;
    private final Set c;
    private final int d;
    private String e;
    private ha$a f;
    private String g;
    private String h;
    private int i;
    private ha$b j;
    private String k;
    private String l;
    private int m;
    private String n;
    private ha$c o;
    private boolean p;
    private String q;
    private ha$d r;
    private String s;
    private int t;
    private List u;
    private List v;
    private int w;
    private int x;
    private String y;
    private String z;

    static {
        b.put((Object)"aboutMe", (Object)ee$a.d("aboutMe", 2));
        b.put((Object)"ageRange", (Object)ee$a.a("ageRange", 3, ha$a.class));
        b.put((Object)"birthday", (Object)ee$a.d("birthday", 4));
        b.put((Object)"braggingRights", (Object)ee$a.d("braggingRights", 5));
        b.put((Object)"circledByCount", (Object)ee$a.a("circledByCount", 6));
        b.put((Object)"cover", (Object)ee$a.a("cover", 7, ha$b.class));
        b.put((Object)"currentLocation", (Object)ee$a.d("currentLocation", 8));
        b.put((Object)"displayName", (Object)ee$a.d("displayName", 9));
        b.put((Object)"gender", (Object)ee$a.a("gender", 12, new eb().a("male", 0).a("female", 1).a("other", 2), false));
        b.put((Object)"id", (Object)ee$a.d("id", 14));
        b.put((Object)"image", (Object)ee$a.a("image", 15, ha$c.class));
        b.put((Object)"isPlusUser", (Object)ee$a.c("isPlusUser", 16));
        b.put((Object)"language", (Object)ee$a.d("language", 18));
        b.put((Object)"name", (Object)ee$a.a("name", 19, ha$d.class));
        b.put((Object)"nickname", (Object)ee$a.d("nickname", 20));
        b.put((Object)"objectType", (Object)ee$a.a("objectType", 21, new eb().a("person", 0).a("page", 1), false));
        b.put((Object)"organizations", (Object)ee$a.b("organizations", 22, ha$f.class));
        b.put((Object)"placesLived", (Object)ee$a.b("placesLived", 23, ha$g.class));
        b.put((Object)"plusOneCount", (Object)ee$a.a("plusOneCount", 24));
        b.put((Object)"relationshipStatus", (Object)ee$a.a("relationshipStatus", 25, new eb().a("single", 0).a("in_a_relationship", 1).a("engaged", 2).a("married", 3).a("its_complicated", 4).a("open_relationship", 5).a("widowed", 6).a("in_domestic_partnership", 7).a("in_civil_union", 8), false));
        b.put((Object)"tagline", (Object)ee$a.d("tagline", 26));
        b.put((Object)"url", (Object)ee$a.d("url", 27));
        b.put((Object)"urls", (Object)ee$a.b("urls", 28, ha$h.class));
        b.put((Object)"verified", (Object)ee$a.c("verified", 29));
    }

    public ha() {
        this.d = 2;
        this.c = new HashSet();
    }

    ha(Set set, int n2, String string, ha$a ha$a, String string2, String string3, int n3, ha$b ha$b, String string4, String string5, int n4, String string6, ha$c ha$c, boolean bl2, String string7, ha$d ha$d, String string8, int n5, List list, List list2, int n6, int n7, String string9, String string10, List list3, boolean bl3) {
        this.c = set;
        this.d = n2;
        this.e = string;
        this.f = ha$a;
        this.g = string2;
        this.h = string3;
        this.i = n3;
        this.j = ha$b;
        this.k = string4;
        this.l = string5;
        this.m = n4;
        this.n = string6;
        this.o = ha$c;
        this.p = bl2;
        this.q = string7;
        this.r = ha$d;
        this.s = string8;
        this.t = n5;
        this.u = list;
        this.v = list2;
        this.w = n6;
        this.x = n7;
        this.y = string9;
        this.z = string10;
        this.A = list3;
        this.B = bl3;
    }

    public String A() {
        return this.y;
    }

    public String B() {
        return this.z;
    }

    List C() {
        return this.A;
    }

    public boolean D() {
        return this.B;
    }

    public ha E() {
        return this;
    }

    @Override
    public /* synthetic */ Object a() {
        return this.E();
    }

    @Override
    protected Object a(String string) {
        return null;
    }

    @Override
    protected boolean a(ee$a ee$a) {
        return this.c.contains((Object)ee$a.g());
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
            case 12: {
                return this.m;
            }
            case 14: {
                return this.n;
            }
            case 15: {
                return this.o;
            }
            case 16: {
                return this.p;
            }
            case 18: {
                return this.q;
            }
            case 19: {
                return this.r;
            }
            case 20: {
                return this.s;
            }
            case 21: {
                return this.t;
            }
            case 22: {
                return this.u;
            }
            case 23: {
                return this.v;
            }
            case 24: {
                return this.w;
            }
            case 25: {
                return this.x;
            }
            case 26: {
                return this.y;
            }
            case 27: {
                return this.z;
            }
            case 28: {
                return this.A;
            }
            case 29: 
        }
        return this.B;
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
        it it2 = a;
        return 0;
    }

    Set e() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (!(object instanceof ha)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        object = (ha)object;
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

    public String g() {
        return this.e;
    }

    ha$a h() {
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

    public String i() {
        return this.g;
    }

    public String j() {
        return this.h;
    }

    public int k() {
        return this.i;
    }

    ha$b l() {
        return this.j;
    }

    public String m() {
        return this.k;
    }

    public String n() {
        return this.l;
    }

    public int o() {
        return this.m;
    }

    public String p() {
        return this.n;
    }

    ha$c q() {
        return this.o;
    }

    public boolean r() {
        return this.p;
    }

    public String s() {
        return this.q;
    }

    ha$d t() {
        return this.r;
    }

    public String u() {
        return this.s;
    }

    public int v() {
        return this.t;
    }

    List w() {
        return this.u;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        it it2 = a;
        it.a(this, parcel, n2);
    }

    List x() {
        return this.v;
    }

    public int y() {
        return this.w;
    }

    public int z() {
        return this.x;
    }
}

