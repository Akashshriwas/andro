// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import java.util.HashMap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ee$a implements SafeParcelable
{
    public static final hj i;
    protected final int a;
    protected final boolean b;
    protected final int c;
    protected final boolean d;
    protected final String e;
    protected final int f;
    protected final Class g;
    protected final String h;
    private final int j;
    private eh k;
    private hi l;
    
    static {
        i = new hj();
    }
    
    ee$a(final int j, final int a, final boolean b, final int c, final boolean d, final String e, final int f, final String h, final dz dz) {
        this.j = j;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        if (h == null) {
            this.g = null;
            this.h = null;
        }
        else {
            this.g = ek.class;
            this.h = h;
        }
        if (dz == null) {
            this.l = null;
            return;
        }
        this.l = dz.c();
    }
    
    protected ee$a(final int a, final boolean b, final int c, final boolean d, final String e, final int f, final Class g, final hi l) {
        this.j = 1;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        if (g == null) {
            this.h = null;
        }
        else {
            this.h = g.getCanonicalName();
        }
        this.l = l;
    }
    
    public static ee$a a(final String s, final int n) {
        return new ee$a(0, false, 0, false, s, n, null, null);
    }
    
    public static ee$a a(final String s, final int n, final hi hi, final boolean b) {
        return new ee$a(hi.c(), b, hi.d(), false, s, n, null, hi);
    }
    
    public static ee$a a(final String s, final int n, final Class clazz) {
        return new ee$a(11, false, 11, false, s, n, clazz, null);
    }
    
    public static ee$a b(final String s, final int n) {
        return new ee$a(4, false, 4, false, s, n, null, null);
    }
    
    public static ee$a b(final String s, final int n, final Class clazz) {
        return new ee$a(11, true, 11, true, s, n, clazz, null);
    }
    
    public static ee$a c(final String s, final int n) {
        return new ee$a(6, false, 6, false, s, n, null, null);
    }
    
    public static ee$a d(final String s, final int n) {
        return new ee$a(7, false, 7, false, s, n, null, null);
    }
    
    public static ee$a e(final String s, final int n) {
        return new ee$a(7, true, 7, true, s, n, null, null);
    }
    
    public int a() {
        return this.j;
    }
    
    public Object a(final Object o) {
        return this.l.a(o);
    }
    
    public void a(final eh k) {
        this.k = k;
    }
    
    public int b() {
        return this.a;
    }
    
    public boolean c() {
        return this.b;
    }
    
    public int d() {
        return this.c;
    }
    
    public int describeContents() {
        final hj i = ee$a.i;
        return 0;
    }
    
    public boolean e() {
        return this.d;
    }
    
    public String f() {
        return this.e;
    }
    
    public int g() {
        return this.f;
    }
    
    public Class h() {
        return this.g;
    }
    
    String i() {
        if (this.h == null) {
            return null;
        }
        return this.h;
    }
    
    public boolean j() {
        return this.l != null;
    }
    
    dz k() {
        if (this.l == null) {
            return null;
        }
        return dz.a(this.l);
    }
    
    public HashMap l() {
        hc.a((Object)this.h);
        hc.a(this.k);
        return this.k.a(this.h);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Field\n");
        sb.append("            versionCode=").append(this.j).append('\n');
        sb.append("                 typeIn=").append(this.a).append('\n');
        sb.append("            typeInArray=").append(this.b).append('\n');
        sb.append("                typeOut=").append(this.c).append('\n');
        sb.append("           typeOutArray=").append(this.d).append('\n');
        sb.append("        outputFieldName=").append(this.e).append('\n');
        sb.append("      safeParcelFieldId=").append(this.f).append('\n');
        sb.append("       concreteTypeName=").append(this.i()).append('\n');
        if (this.h() != null) {
            sb.append("     concreteType.class=").append(this.h().getCanonicalName()).append('\n');
        }
        final StringBuilder append = sb.append("          converterName=");
        String canonicalName;
        if (this.l == null) {
            canonicalName = "null";
        }
        else {
            canonicalName = this.l.getClass().getCanonicalName();
        }
        append.append(canonicalName).append('\n');
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final hj i = ee$a.i;
        hj.a(this, parcel, n);
    }
}
