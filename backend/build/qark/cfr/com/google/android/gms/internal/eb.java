/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Set
 */
package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.eb$a;
import com.google.android.gms.internal.hg;
import com.google.android.gms.internal.hi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class eb
implements SafeParcelable,
hi {
    public static final hg a = new hg();
    private final int b;
    private final HashMap c;
    private final HashMap d;
    private final ArrayList e;

    public eb() {
        this.b = 1;
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = null;
    }

    eb(int n2, ArrayList arrayList) {
        this.b = n2;
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = null;
        this.a(arrayList);
    }

    private void a(ArrayList arrayList) {
        for (eb$a eb$a : arrayList) {
            this.a(eb$a.c, eb$a.d);
        }
    }

    int a() {
        return this.b;
    }

    public eb a(String string, int n2) {
        this.c.put((Object)string, (Object)n2);
        this.d.put((Object)n2, (Object)string);
        return this;
    }

    @Override
    public /* synthetic */ Object a(Object object) {
        return this.a((Integer)object);
    }

    public String a(Integer object) {
        String string = (String)this.d.get(object);
        object = string;
        if (string == null) {
            object = string;
            if (this.c.containsKey((Object)"gms_unknown")) {
                object = "gms_unknown";
            }
        }
        return object;
    }

    ArrayList b() {
        ArrayList arrayList = new ArrayList();
        for (String string : this.c.keySet()) {
            arrayList.add((Object)new eb$a(string, (Integer)this.c.get((Object)string)));
        }
        return arrayList;
    }

    @Override
    public int c() {
        return 7;
    }

    @Override
    public int d() {
        return 0;
    }

    public int describeContents() {
        hg hg2 = a;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        hg hg2 = a;
        hg.a(this, parcel, n2);
    }
}

