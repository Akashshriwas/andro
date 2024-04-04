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
 *  java.util.Set
 */
package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.b.a.b.h;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.eb;
import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.ee$a;
import com.google.android.gms.internal.ja;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ha$f
extends ee
implements h,
SafeParcelable {
    public static final ja a = new ja();
    private static final HashMap b = new HashMap();
    private final Set c;
    private final int d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private boolean j;
    private String k;
    private String l;
    private int m;

    static {
        b.put((Object)"department", (Object)ee$a.d("department", 2));
        b.put((Object)"description", (Object)ee$a.d("description", 3));
        b.put((Object)"endDate", (Object)ee$a.d("endDate", 4));
        b.put((Object)"location", (Object)ee$a.d("location", 5));
        b.put((Object)"name", (Object)ee$a.d("name", 6));
        b.put((Object)"primary", (Object)ee$a.c("primary", 7));
        b.put((Object)"startDate", (Object)ee$a.d("startDate", 8));
        b.put((Object)"title", (Object)ee$a.d("title", 9));
        b.put((Object)"type", (Object)ee$a.a("type", 10, new eb().a("work", 0).a("school", 1), false));
    }

    public ha$f() {
        this.d = 1;
        this.c = new HashSet();
    }

    ha$f(Set set, int n2, String string, String string2, String string3, String string4, String string5, boolean bl2, String string6, String string7, int n3) {
        this.c = set;
        this.d = n2;
        this.e = string;
        this.f = string2;
        this.g = string3;
        this.h = string4;
        this.i = string5;
        this.j = bl2;
        this.k = string6;
        this.l = string7;
        this.m = n3;
    }

    @Override
    public /* synthetic */ Object a() {
        return this.p();
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
            case 10: 
        }
        return this.m;
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
        ja ja2 = a;
        return 0;
    }

    Set e() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (!(object instanceof ha$f)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        object = (ha$f)object;
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

    public String h() {
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

    public String k() {
        return this.i;
    }

    public boolean l() {
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

    public ha$f p() {
        return this;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        ja ja2 = a;
        ja.a(this, parcel, n2);
    }
}

