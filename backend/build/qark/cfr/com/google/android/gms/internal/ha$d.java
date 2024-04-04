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
import com.google.android.gms.b.a.b.g;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.ee$a;
import com.google.android.gms.internal.iz;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ha$d
extends ee
implements g,
SafeParcelable {
    public static final iz a = new iz();
    private static final HashMap b = new HashMap();
    private final Set c;
    private final int d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;

    static {
        b.put((Object)"familyName", (Object)ee$a.d("familyName", 2));
        b.put((Object)"formatted", (Object)ee$a.d("formatted", 3));
        b.put((Object)"givenName", (Object)ee$a.d("givenName", 4));
        b.put((Object)"honorificPrefix", (Object)ee$a.d("honorificPrefix", 5));
        b.put((Object)"honorificSuffix", (Object)ee$a.d("honorificSuffix", 6));
        b.put((Object)"middleName", (Object)ee$a.d("middleName", 7));
    }

    public ha$d() {
        this.d = 1;
        this.c = new HashSet();
    }

    ha$d(Set set, int n2, String string, String string2, String string3, String string4, String string5, String string6) {
        this.c = set;
        this.d = n2;
        this.e = string;
        this.f = string2;
        this.g = string3;
        this.h = string4;
        this.i = string5;
        this.j = string6;
    }

    @Override
    public /* synthetic */ Object a() {
        return this.m();
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
            case 7: 
        }
        return this.j;
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
        iz iz2 = a;
        return 0;
    }

    Set e() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (!(object instanceof ha$d)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        object = (ha$d)object;
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

    public String l() {
        return this.j;
    }

    public ha$d m() {
        return this;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        iz iz2 = a;
        iz.a(this, parcel, n2);
    }
}

