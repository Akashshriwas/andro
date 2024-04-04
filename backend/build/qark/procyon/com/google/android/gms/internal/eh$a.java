// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class eh$a implements SafeParcelable
{
    public static final hm a;
    final int b;
    final String c;
    final ArrayList d;
    
    static {
        a = new hm();
    }
    
    eh$a(final int b, final String c, final ArrayList d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    eh$a(final String c, final HashMap hashMap) {
        this.b = 1;
        this.c = c;
        this.d = a(hashMap);
    }
    
    private static ArrayList a(final HashMap hashMap) {
        if (hashMap == null) {
            return null;
        }
        final ArrayList<eh$b> list = new ArrayList<eh$b>();
        for (final String key : hashMap.keySet()) {
            list.add(new eh$b(key, (ee$a)hashMap.get(key)));
        }
        return list;
    }
    
    HashMap a() {
        final HashMap<String, ee$a> hashMap = new HashMap<String, ee$a>();
        for (int size = this.d.size(), i = 0; i < size; ++i) {
            final eh$b eh$b = this.d.get(i);
            hashMap.put(eh$b.c, eh$b.d);
        }
        return hashMap;
    }
    
    public int describeContents() {
        final hm a = eh$a.a;
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final hm a = eh$a.a;
        hm.a(this, parcel, n);
    }
}
