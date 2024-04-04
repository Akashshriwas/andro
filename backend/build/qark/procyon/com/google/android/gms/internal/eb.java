// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class eb implements SafeParcelable, hi
{
    public static final hg a;
    private final int b;
    private final HashMap c;
    private final HashMap d;
    private final ArrayList e;
    
    static {
        a = new hg();
    }
    
    public eb() {
        this.b = 1;
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = null;
    }
    
    eb(final int b, final ArrayList list) {
        this.b = b;
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = null;
        this.a(list);
    }
    
    private void a(final ArrayList list) {
        for (final eb$a eb$a : list) {
            this.a(eb$a.c, eb$a.d);
        }
    }
    
    int a() {
        return this.b;
    }
    
    public eb a(final String s, final int n) {
        this.c.put(s, n);
        this.d.put(n, s);
        return this;
    }
    
    public String a(final Integer key) {
        String s2;
        final String s = s2 = this.d.get(key);
        if (s == null) {
            s2 = s;
            if (this.c.containsKey("gms_unknown")) {
                s2 = "gms_unknown";
            }
        }
        return s2;
    }
    
    ArrayList b() {
        final ArrayList<eb$a> list = new ArrayList<eb$a>();
        for (final String key : this.c.keySet()) {
            list.add(new eb$a(key, (int)this.c.get(key)));
        }
        return list;
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
        final hg a = eb.a;
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final hg a = eb.a;
        hg.a(this, parcel, n);
    }
}
