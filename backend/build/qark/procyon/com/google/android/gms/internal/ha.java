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
import com.google.android.gms.b.a.b.a;

public final class ha extends ee implements a, SafeParcelable
{
    public static final it a;
    private static final HashMap b;
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
        a = new it();
        (b = new HashMap()).put("aboutMe", ee$a.d("aboutMe", 2));
        ha.b.put("ageRange", ee$a.a("ageRange", 3, ha$a.class));
        ha.b.put("birthday", ee$a.d("birthday", 4));
        ha.b.put("braggingRights", ee$a.d("braggingRights", 5));
        ha.b.put("circledByCount", ee$a.a("circledByCount", 6));
        ha.b.put("cover", ee$a.a("cover", 7, ha$b.class));
        ha.b.put("currentLocation", ee$a.d("currentLocation", 8));
        ha.b.put("displayName", ee$a.d("displayName", 9));
        ha.b.put("gender", ee$a.a("gender", 12, new eb().a("male", 0).a("female", 1).a("other", 2), false));
        ha.b.put("id", ee$a.d("id", 14));
        ha.b.put("image", ee$a.a("image", 15, ha$c.class));
        ha.b.put("isPlusUser", ee$a.c("isPlusUser", 16));
        ha.b.put("language", ee$a.d("language", 18));
        ha.b.put("name", ee$a.a("name", 19, ha$d.class));
        ha.b.put("nickname", ee$a.d("nickname", 20));
        ha.b.put("objectType", ee$a.a("objectType", 21, new eb().a("person", 0).a("page", 1), false));
        ha.b.put("organizations", ee$a.b("organizations", 22, ha$f.class));
        ha.b.put("placesLived", ee$a.b("placesLived", 23, ha$g.class));
        ha.b.put("plusOneCount", ee$a.a("plusOneCount", 24));
        ha.b.put("relationshipStatus", ee$a.a("relationshipStatus", 25, new eb().a("single", 0).a("in_a_relationship", 1).a("engaged", 2).a("married", 3).a("its_complicated", 4).a("open_relationship", 5).a("widowed", 6).a("in_domestic_partnership", 7).a("in_civil_union", 8), false));
        ha.b.put("tagline", ee$a.d("tagline", 26));
        ha.b.put("url", ee$a.d("url", 27));
        ha.b.put("urls", ee$a.b("urls", 28, ha$h.class));
        ha.b.put("verified", ee$a.c("verified", 29));
    }
    
    public ha() {
        this.d = 2;
        this.c = new HashSet();
    }
    
    ha(final Set c, final int d, final String e, final ha$a f, final String g, final String h, final int i, final ha$b j, final String k, final String l, final int m, final String n, final ha$c o, final boolean p26, final String q, final ha$d r, final String s, final int t, final List u, final List v, final int w, final int x, final String y, final String z, final List a, final boolean b) {
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
        this.p = p26;
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
            case 29: {
                return this.B;
            }
        }
    }
    
    @Override
    public HashMap b() {
        return ha.b;
    }
    
    @Override
    protected boolean b(final String s) {
        return false;
    }
    
    public int describeContents() {
        final it a = ha.a;
        return 0;
    }
    
    Set e() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof ha)) {
            return false;
        }
        if (this == o) {
            return true;
        }
        final ha ha = (ha)o;
        for (final ee$a ee$a : com.google.android.gms.internal.ha.b.values()) {
            if (this.a(ee$a)) {
                if (!ha.a(ee$a)) {
                    return false;
                }
                if (!this.b(ee$a).equals(ha.b(ee$a))) {
                    return false;
                }
                continue;
            }
            else {
                if (ha.a(ee$a)) {
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
    
    ha$a h() {
        return this.f;
    }
    
    @Override
    public int hashCode() {
        final Iterator<ee$a> iterator = ha.b.values().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final ee$a ee$a = iterator.next();
            if (this.a(ee$a)) {
                n = this.b(ee$a).hashCode() + (n + ee$a.g());
            }
        }
        return n;
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
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final it a = ha.a;
        it.a(this, parcel, n);
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
