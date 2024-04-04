// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class eh implements SafeParcelable
{
    public static final hl a;
    private final int b;
    private final HashMap c;
    private final ArrayList d;
    private final String e;
    
    static {
        a = new hl();
    }
    
    eh(final int b, final ArrayList list, final String s) {
        this.b = b;
        this.d = null;
        this.c = a(list);
        this.e = (String)hc.a((Object)s);
        this.a();
    }
    
    private static HashMap a(final ArrayList list) {
        final HashMap<String, HashMap> hashMap = new HashMap<String, HashMap>();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final eh$a eh$a = list.get(i);
            hashMap.put(eh$a.c, eh$a.a());
        }
        return hashMap;
    }
    
    public HashMap a(final String key) {
        return this.c.get(key);
    }
    
    public void a() {
        final Iterator<String> iterator = this.c.keySet().iterator();
        while (iterator.hasNext()) {
            final HashMap<String, HashMap<String, HashMap<String, HashMap>>> hashMap = this.c.get(iterator.next());
            final Iterator<String> iterator2 = hashMap.keySet().iterator();
            while (iterator2.hasNext()) {
                ((ee$a)hashMap.get(iterator2.next())).a(this);
            }
        }
    }
    
    int b() {
        return this.b;
    }
    
    ArrayList c() {
        final ArrayList<eh$a> list = new ArrayList<eh$a>();
        for (final String key : this.c.keySet()) {
            list.add(new eh$a(key, (HashMap)this.c.get(key)));
        }
        return list;
    }
    
    public String d() {
        return this.e;
    }
    
    public int describeContents() {
        final hl a = eh.a;
        return 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (final String s : this.c.keySet()) {
            sb.append(s).append(":\n");
            final HashMap<String, HashMap<String, HashMap<String, HashMap>>> hashMap = this.c.get(s);
            for (final String s2 : hashMap.keySet()) {
                sb.append("  ").append(s2).append(": ");
                sb.append(hashMap.get(s2));
            }
        }
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final hl a = eh.a;
        hl.a(this, parcel, n);
    }
}
