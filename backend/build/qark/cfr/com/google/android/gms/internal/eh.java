/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Set
 */
package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ee$a;
import com.google.android.gms.internal.eh$a;
import com.google.android.gms.internal.hc;
import com.google.android.gms.internal.hl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class eh
implements SafeParcelable {
    public static final hl a = new hl();
    private final int b;
    private final HashMap c;
    private final ArrayList d;
    private final String e;

    eh(int n2, ArrayList arrayList, String string) {
        this.b = n2;
        this.d = null;
        this.c = eh.a(arrayList);
        this.e = (String)hc.a((Object)string);
        this.a();
    }

    private static HashMap a(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            eh$a eh$a = (eh$a)arrayList.get(i2);
            hashMap.put((Object)eh$a.c, (Object)eh$a.a());
        }
        return hashMap;
    }

    public HashMap a(String string) {
        return (HashMap)this.c.get((Object)string);
    }

    public void a() {
        Iterator iterator = this.c.keySet().iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            string = (HashMap)this.c.get((Object)string);
            Iterator iterator2 = string.keySet().iterator();
            while (iterator2.hasNext()) {
                ((ee$a)string.get((Object)((String)iterator2.next()))).a(this);
            }
        }
    }

    int b() {
        return this.b;
    }

    ArrayList c() {
        ArrayList arrayList = new ArrayList();
        for (String string : this.c.keySet()) {
            arrayList.add((Object)new eh$a(string, (HashMap)this.c.get((Object)string)));
        }
        return arrayList;
    }

    public String d() {
        return this.e;
    }

    public int describeContents() {
        hl hl2 = a;
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = this.c.keySet().iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            stringBuilder.append(string).append(":\n");
            string = (HashMap)this.c.get((Object)string);
            for (String string2 : string.keySet()) {
                stringBuilder.append("  ").append(string2).append(": ");
                stringBuilder.append(string.get((Object)string2));
            }
        }
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n2) {
        hl hl2 = a;
        hl.a(this, parcel, n2);
    }
}

