/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Set
 */
package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ee$a;
import com.google.android.gms.internal.eh$b;
import com.google.android.gms.internal.hm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class eh$a
implements SafeParcelable {
    public static final hm a = new hm();
    final int b;
    final String c;
    final ArrayList d;

    eh$a(int n2, String string, ArrayList arrayList) {
        this.b = n2;
        this.c = string;
        this.d = arrayList;
    }

    eh$a(String string, HashMap hashMap) {
        this.b = 1;
        this.c = string;
        this.d = eh$a.a(hashMap);
    }

    private static ArrayList a(HashMap hashMap) {
        if (hashMap == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String string : hashMap.keySet()) {
            arrayList.add((Object)new eh$b(string, (ee$a)hashMap.get((Object)string)));
        }
        return arrayList;
    }

    HashMap a() {
        HashMap hashMap = new HashMap();
        int n2 = this.d.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            eh$b eh$b = (eh$b)this.d.get(i2);
            hashMap.put((Object)eh$b.c, (Object)eh$b.d);
        }
        return hashMap;
    }

    public int describeContents() {
        hm hm2 = a;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        hm hm2 = a;
        hm.a(this, parcel, n2);
    }
}

