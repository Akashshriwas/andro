/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 */
package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.dz;
import com.google.android.gms.internal.eh;
import com.google.android.gms.internal.ek;
import com.google.android.gms.internal.hc;
import com.google.android.gms.internal.hi;
import com.google.android.gms.internal.hj;
import java.util.HashMap;

public class ee$a
implements SafeParcelable {
    public static final hj i = new hj();
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

    /*
     * Enabled aggressive block sorting
     */
    ee$a(int n2, int n3, boolean bl2, int n4, boolean bl3, String string, int n5, String string2, dz dz2) {
        this.j = n2;
        this.a = n3;
        this.b = bl2;
        this.c = n4;
        this.d = bl3;
        this.e = string;
        this.f = n5;
        if (string2 == null) {
            this.g = null;
            this.h = null;
        } else {
            this.g = ek.class;
            this.h = string2;
        }
        if (dz2 == null) {
            this.l = null;
            return;
        }
        this.l = dz2.c();
    }

    /*
     * Enabled aggressive block sorting
     */
    protected ee$a(int n2, boolean bl2, int n3, boolean bl3, String string, int n4, Class class_, hi hi2) {
        this.j = 1;
        this.a = n2;
        this.b = bl2;
        this.c = n3;
        this.d = bl3;
        this.e = string;
        this.f = n4;
        this.g = class_;
        this.h = class_ == null ? null : class_.getCanonicalName();
        this.l = hi2;
    }

    public static ee$a a(String string, int n2) {
        return new ee$a(0, false, 0, false, string, n2, null, null);
    }

    public static ee$a a(String string, int n2, hi hi2, boolean bl2) {
        return new ee$a(hi2.c(), bl2, hi2.d(), false, string, n2, null, hi2);
    }

    public static ee$a a(String string, int n2, Class class_) {
        return new ee$a(11, false, 11, false, string, n2, class_, null);
    }

    static /* synthetic */ hi a(ee$a ee$a) {
        return ee$a.l;
    }

    public static ee$a b(String string, int n2) {
        return new ee$a(4, false, 4, false, string, n2, null, null);
    }

    public static ee$a b(String string, int n2, Class class_) {
        return new ee$a(11, true, 11, true, string, n2, class_, null);
    }

    public static ee$a c(String string, int n2) {
        return new ee$a(6, false, 6, false, string, n2, null, null);
    }

    public static ee$a d(String string, int n2) {
        return new ee$a(7, false, 7, false, string, n2, null, null);
    }

    public static ee$a e(String string, int n2) {
        return new ee$a(7, true, 7, true, string, n2, null, null);
    }

    public int a() {
        return this.j;
    }

    public Object a(Object object) {
        return this.l.a(object);
    }

    public void a(eh eh2) {
        this.k = eh2;
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
        hj hj2 = i;
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
        if (this.l != null) {
            return true;
        }
        return false;
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

    /*
     * Enabled aggressive block sorting
     */
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Field\n");
        stringBuilder.append("            versionCode=").append(this.j).append('\n');
        stringBuilder.append("                 typeIn=").append(this.a).append('\n');
        stringBuilder.append("            typeInArray=").append(this.b).append('\n');
        stringBuilder.append("                typeOut=").append(this.c).append('\n');
        stringBuilder.append("           typeOutArray=").append(this.d).append('\n');
        stringBuilder.append("        outputFieldName=").append(this.e).append('\n');
        stringBuilder.append("      safeParcelFieldId=").append(this.f).append('\n');
        stringBuilder.append("       concreteTypeName=").append(this.i()).append('\n');
        if (this.h() != null) {
            stringBuilder.append("     concreteType.class=").append(this.h().getCanonicalName()).append('\n');
        }
        StringBuilder stringBuilder2 = stringBuilder.append("          converterName=");
        String string = this.l == null ? "null" : this.l.getClass().getCanonicalName();
        stringBuilder2.append(string).append('\n');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n2) {
        hj hj2 = i;
        hj.a(this, parcel, n2);
    }
}

