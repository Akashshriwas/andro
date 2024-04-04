// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.c;
import java.util.Set;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ek extends ee implements SafeParcelable
{
    public static final hn a;
    private final int b;
    private final Parcel c;
    private final int d;
    private final eh e;
    private final String f;
    private int g;
    private int h;
    
    static {
        a = new hn();
    }
    
    ek(final int b, final Parcel parcel, final eh e) {
        this.b = b;
        this.c = (Parcel)hc.a(parcel);
        this.d = 2;
        this.e = e;
        if (this.e == null) {
            this.f = null;
        }
        else {
            this.f = this.e.d();
        }
        this.g = 2;
    }
    
    public static HashMap a(final Bundle bundle) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        for (final String key : bundle.keySet()) {
            hashMap.put(key, bundle.getString(key));
        }
        return hashMap;
    }
    
    private static HashMap a(final HashMap hashMap) {
        final HashMap<Integer, Map.Entry<K, ee$a>> hashMap2 = new HashMap<Integer, Map.Entry<K, ee$a>>();
        for (final Map.Entry<K, ee$a> value : hashMap.entrySet()) {
            hashMap2.put(value.getValue().g(), value);
        }
        return hashMap2;
    }
    
    private void a(final StringBuilder sb, final int i, final Object obj) {
        switch (i) {
            default: {
                throw new IllegalArgumentException("Unknown type = " + i);
            }
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: {
                sb.append(obj);
            }
            case 7: {
                sb.append("\"").append(hr.a(obj.toString())).append("\"");
            }
            case 8: {
                sb.append("\"").append(hp.a((byte[])obj)).append("\"");
            }
            case 9: {
                sb.append("\"").append(hp.b((byte[])obj));
                sb.append("\"");
            }
            case 10: {
                hs.a(sb, (HashMap)obj);
            }
            case 11: {
                throw new IllegalArgumentException("Method does not accept concrete type.");
            }
        }
    }
    
    private void a(final StringBuilder sb, final ee$a ee$a, final Parcel parcel, final int n) {
        switch (ee$a.d()) {
            default: {
                throw new IllegalArgumentException("Unknown field out type = " + ee$a.d());
            }
            case 0: {
                this.a(sb, ee$a, this.a(ee$a, com.google.android.gms.common.internal.safeparcel.a.g(parcel, n)));
            }
            case 1: {
                this.a(sb, ee$a, this.a(ee$a, com.google.android.gms.common.internal.safeparcel.a.i(parcel, n)));
            }
            case 2: {
                this.a(sb, ee$a, this.a(ee$a, com.google.android.gms.common.internal.safeparcel.a.h(parcel, n)));
            }
            case 3: {
                this.a(sb, ee$a, this.a(ee$a, com.google.android.gms.common.internal.safeparcel.a.j(parcel, n)));
            }
            case 4: {
                this.a(sb, ee$a, this.a(ee$a, com.google.android.gms.common.internal.safeparcel.a.k(parcel, n)));
            }
            case 5: {
                this.a(sb, ee$a, this.a(ee$a, com.google.android.gms.common.internal.safeparcel.a.l(parcel, n)));
            }
            case 6: {
                this.a(sb, ee$a, this.a(ee$a, com.google.android.gms.common.internal.safeparcel.a.c(parcel, n)));
            }
            case 7: {
                this.a(sb, ee$a, this.a(ee$a, com.google.android.gms.common.internal.safeparcel.a.m(parcel, n)));
            }
            case 8:
            case 9: {
                this.a(sb, ee$a, this.a(ee$a, com.google.android.gms.common.internal.safeparcel.a.p(parcel, n)));
            }
            case 10: {
                this.a(sb, ee$a, this.a(ee$a, a(com.google.android.gms.common.internal.safeparcel.a.o(parcel, n))));
            }
            case 11: {
                throw new IllegalArgumentException("Method does not accept concrete type.");
            }
        }
    }
    
    private void a(final StringBuilder sb, final ee$a ee$a, final Object o) {
        if (ee$a.c()) {
            this.a(sb, ee$a, (ArrayList)o);
            return;
        }
        this.a(sb, ee$a.b(), o);
    }
    
    private void a(final StringBuilder sb, final ee$a ee$a, final ArrayList list) {
        sb.append("[");
        for (int size = list.size(), i = 0; i < size; ++i) {
            if (i != 0) {
                sb.append(",");
            }
            this.a(sb, ee$a.b(), list.get(i));
        }
        sb.append("]");
    }
    
    private void a(final StringBuilder sb, final String str, final ee$a ee$a, final Parcel parcel, final int n) {
        sb.append("\"").append(str).append("\":");
        if (ee$a.j()) {
            this.a(sb, ee$a, parcel, n);
            return;
        }
        this.b(sb, ee$a, parcel, n);
    }
    
    private void a(final StringBuilder sb, HashMap a, final Parcel parcel) {
        a = a(a);
        sb.append('{');
        final int b = a.b(parcel);
        int n = 0;
        while (parcel.dataPosition() < b) {
            final int a2 = a.a(parcel);
            final Map.Entry<String, V> entry = a.get(a.a(a2));
            if (entry != null) {
                if (n != 0) {
                    sb.append(",");
                }
                this.a(sb, entry.getKey(), (ee$a)entry.getValue(), parcel, a2);
                n = 1;
            }
        }
        if (parcel.dataPosition() != b) {
            throw new b("Overread allowed size end=" + b, parcel);
        }
        sb.append('}');
    }
    
    private void b(final StringBuilder sb, final ee$a ee$a, Parcel z, int i) {
        if (ee$a.e()) {
            sb.append("[");
            switch (ee$a.d()) {
                default: {
                    throw new IllegalStateException("Unknown field type out.");
                }
                case 0: {
                    ho.a(sb, com.google.android.gms.common.internal.safeparcel.a.r(z, i));
                    break;
                }
                case 1: {
                    ho.a(sb, com.google.android.gms.common.internal.safeparcel.a.t(z, i));
                    break;
                }
                case 2: {
                    ho.a(sb, com.google.android.gms.common.internal.safeparcel.a.s(z, i));
                    break;
                }
                case 3: {
                    ho.a(sb, com.google.android.gms.common.internal.safeparcel.a.u(z, i));
                    break;
                }
                case 4: {
                    ho.a(sb, com.google.android.gms.common.internal.safeparcel.a.v(z, i));
                    break;
                }
                case 5: {
                    ho.a(sb, com.google.android.gms.common.internal.safeparcel.a.w(z, i));
                    break;
                }
                case 6: {
                    ho.a(sb, com.google.android.gms.common.internal.safeparcel.a.q(z, i));
                    break;
                }
                case 7: {
                    ho.a(sb, com.google.android.gms.common.internal.safeparcel.a.x(z, i));
                    break;
                }
                case 8:
                case 9:
                case 10: {
                    throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                }
                case 11: {
                    final Parcel[] a = com.google.android.gms.common.internal.safeparcel.a.A(z, i);
                    int length;
                    for (length = a.length, i = 0; i < length; ++i) {
                        if (i > 0) {
                            sb.append(",");
                        }
                        a[i].setDataPosition(0);
                        this.a(sb, ee$a.l(), a[i]);
                    }
                    break;
                }
            }
            sb.append("]");
            return;
        }
        switch (ee$a.d()) {
            default: {
                throw new IllegalStateException("Unknown field type out");
            }
            case 0: {
                sb.append(com.google.android.gms.common.internal.safeparcel.a.g(z, i));
            }
            case 1: {
                sb.append(com.google.android.gms.common.internal.safeparcel.a.i(z, i));
            }
            case 2: {
                sb.append(com.google.android.gms.common.internal.safeparcel.a.h(z, i));
            }
            case 3: {
                sb.append(com.google.android.gms.common.internal.safeparcel.a.j(z, i));
            }
            case 4: {
                sb.append(com.google.android.gms.common.internal.safeparcel.a.k(z, i));
            }
            case 5: {
                sb.append(com.google.android.gms.common.internal.safeparcel.a.l(z, i));
            }
            case 6: {
                sb.append(com.google.android.gms.common.internal.safeparcel.a.c(z, i));
            }
            case 7: {
                sb.append("\"").append(hr.a(com.google.android.gms.common.internal.safeparcel.a.m(z, i))).append("\"");
            }
            case 8: {
                sb.append("\"").append(hp.a(com.google.android.gms.common.internal.safeparcel.a.p(z, i))).append("\"");
            }
            case 9: {
                sb.append("\"").append(hp.b(com.google.android.gms.common.internal.safeparcel.a.p(z, i)));
                sb.append("\"");
            }
            case 10: {
                final Bundle o = com.google.android.gms.common.internal.safeparcel.a.o(z, i);
                final Set keySet = o.keySet();
                keySet.size();
                sb.append("{");
                final Iterator<String> iterator = keySet.iterator();
                i = 1;
                while (iterator.hasNext()) {
                    final String str = iterator.next();
                    if (i == 0) {
                        sb.append(",");
                    }
                    sb.append("\"").append(str).append("\"");
                    sb.append(":");
                    sb.append("\"").append(hr.a(o.getString(str))).append("\"");
                    i = 0;
                }
                sb.append("}");
            }
            case 11: {
                z = com.google.android.gms.common.internal.safeparcel.a.z(z, i);
                z.setDataPosition(0);
                this.a(sb, ee$a.l(), z);
            }
        }
    }
    
    public int a() {
        return this.b;
    }
    
    @Override
    protected Object a(final String s) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }
    
    @Override
    public HashMap b() {
        if (this.e == null) {
            return null;
        }
        return this.e.a(this.f);
    }
    
    @Override
    protected boolean b(final String s) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }
    
    public int describeContents() {
        final hn a = ek.a;
        return 0;
    }
    
    public Parcel e() {
        switch (this.g) {
            case 0: {
                this.h = com.google.android.gms.common.internal.safeparcel.c.a(this.c);
                com.google.android.gms.common.internal.safeparcel.c.a(this.c, this.h);
                this.g = 2;
                break;
            }
            case 1: {
                com.google.android.gms.common.internal.safeparcel.c.a(this.c, this.h);
                this.g = 2;
                break;
            }
        }
        return this.c;
    }
    
    eh f() {
        switch (this.d) {
            default: {
                throw new IllegalStateException("Invalid creation type: " + this.d);
            }
            case 0: {
                return null;
            }
            case 1: {
                return this.e;
            }
            case 2: {
                return this.e;
            }
        }
    }
    
    @Override
    public String toString() {
        hc.a(this.e, "Cannot convert to JSON on client side.");
        final Parcel e = this.e();
        e.setDataPosition(0);
        final StringBuilder sb = new StringBuilder(100);
        this.a(sb, this.e.a(this.f), e);
        return sb.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final hn a = ek.a;
        hn.a(this, parcel, n);
    }
}
