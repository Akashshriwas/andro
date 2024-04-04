/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.ee;
import com.google.android.gms.internal.ee$a;
import com.google.android.gms.internal.eh;
import com.google.android.gms.internal.hc;
import com.google.android.gms.internal.hn;
import com.google.android.gms.internal.ho;
import com.google.android.gms.internal.hp;
import com.google.android.gms.internal.hr;
import com.google.android.gms.internal.hs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ek
extends ee
implements SafeParcelable {
    public static final hn a = new hn();
    private final int b;
    private final Parcel c;
    private final int d;
    private final eh e;
    private final String f;
    private int g;
    private int h;

    /*
     * Enabled aggressive block sorting
     */
    ek(int n2, Parcel parcel, eh eh2) {
        this.b = n2;
        this.c = (Parcel)hc.a((Object)parcel);
        this.d = 2;
        this.e = eh2;
        this.f = this.e == null ? null : this.e.d();
        this.g = 2;
    }

    public static HashMap a(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String string : bundle.keySet()) {
            hashMap.put((Object)string, (Object)bundle.getString(string));
        }
        return hashMap;
    }

    private static HashMap a(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            hashMap2.put((Object)((ee$a)entry.getValue()).g(), (Object)entry);
        }
        return hashMap2;
    }

    private void a(StringBuilder stringBuilder, int n2, Object object) {
        switch (n2) {
            default: {
                throw new IllegalArgumentException("Unknown type = " + n2);
            }
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                stringBuilder.append(object);
                return;
            }
            case 7: {
                stringBuilder.append("\"").append(hr.a(object.toString())).append("\"");
                return;
            }
            case 8: {
                stringBuilder.append("\"").append(hp.a((byte[])object)).append("\"");
                return;
            }
            case 9: {
                stringBuilder.append("\"").append(hp.b((byte[])object));
                stringBuilder.append("\"");
                return;
            }
            case 10: {
                hs.a(stringBuilder, (HashMap)object);
                return;
            }
            case 11: 
        }
        throw new IllegalArgumentException("Method does not accept concrete type.");
    }

    private void a(StringBuilder stringBuilder, ee$a ee$a, Parcel parcel, int n2) {
        switch (ee$a.d()) {
            default: {
                throw new IllegalArgumentException("Unknown field out type = " + ee$a.d());
            }
            case 0: {
                this.a(stringBuilder, ee$a, this.a(ee$a, a.g(parcel, n2)));
                return;
            }
            case 1: {
                this.a(stringBuilder, ee$a, this.a(ee$a, (Object)a.i(parcel, n2)));
                return;
            }
            case 2: {
                this.a(stringBuilder, ee$a, this.a(ee$a, a.h(parcel, n2)));
                return;
            }
            case 3: {
                this.a(stringBuilder, ee$a, this.a(ee$a, (Object)Float.valueOf((float)a.j(parcel, n2))));
                return;
            }
            case 4: {
                this.a(stringBuilder, ee$a, this.a(ee$a, a.k(parcel, n2)));
                return;
            }
            case 5: {
                this.a(stringBuilder, ee$a, this.a(ee$a, (Object)a.l(parcel, n2)));
                return;
            }
            case 6: {
                this.a(stringBuilder, ee$a, this.a(ee$a, a.c(parcel, n2)));
                return;
            }
            case 7: {
                this.a(stringBuilder, ee$a, this.a(ee$a, a.m(parcel, n2)));
                return;
            }
            case 8: 
            case 9: {
                this.a(stringBuilder, ee$a, this.a(ee$a, a.p(parcel, n2)));
                return;
            }
            case 10: {
                this.a(stringBuilder, ee$a, this.a(ee$a, (Object)ek.a(a.o(parcel, n2))));
                return;
            }
            case 11: 
        }
        throw new IllegalArgumentException("Method does not accept concrete type.");
    }

    private void a(StringBuilder stringBuilder, ee$a ee$a, Object object) {
        if (ee$a.c()) {
            this.a(stringBuilder, ee$a, (ArrayList)object);
            return;
        }
        this.a(stringBuilder, ee$a.b(), object);
    }

    private void a(StringBuilder stringBuilder, ee$a ee$a, ArrayList arrayList) {
        stringBuilder.append("[");
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (i2 != 0) {
                stringBuilder.append(",");
            }
            this.a(stringBuilder, ee$a.b(), arrayList.get(i2));
        }
        stringBuilder.append("]");
    }

    private void a(StringBuilder stringBuilder, String string, ee$a ee$a, Parcel parcel, int n2) {
        stringBuilder.append("\"").append(string).append("\":");
        if (ee$a.j()) {
            this.a(stringBuilder, ee$a, parcel, n2);
            return;
        }
        this.b(stringBuilder, ee$a, parcel, n2);
    }

    private void a(StringBuilder stringBuilder, HashMap hashMap, Parcel parcel) {
        hashMap = ek.a(hashMap);
        stringBuilder.append('{');
        int n2 = a.b(parcel);
        boolean bl2 = false;
        while (parcel.dataPosition() < n2) {
            int n3 = a.a(parcel);
            Map.Entry entry = (Map.Entry)hashMap.get((Object)a.a(n3));
            if (entry == null) continue;
            if (bl2) {
                stringBuilder.append(",");
            }
            this.a(stringBuilder, (String)entry.getKey(), (ee$a)entry.getValue(), parcel, n3);
            bl2 = true;
        }
        if (parcel.dataPosition() != n2) {
            throw new b("Overread allowed size end=" + n2, parcel);
        }
        stringBuilder.append('}');
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b(StringBuilder stringBuilder, ee$a bundle, Parcel iterator, int n2) {
        if (bundle.e()) {
            stringBuilder.append("[");
            switch (bundle.d()) {
                default: {
                    throw new IllegalStateException("Unknown field type out.");
                }
                case 0: {
                    ho.a(stringBuilder, a.r((Parcel)iterator, n2));
                    break;
                }
                case 1: {
                    ho.a(stringBuilder, (Object[])a.t((Parcel)iterator, n2));
                    break;
                }
                case 2: {
                    ho.a(stringBuilder, a.s((Parcel)iterator, n2));
                    break;
                }
                case 3: {
                    ho.a(stringBuilder, a.u((Parcel)iterator, n2));
                    break;
                }
                case 4: {
                    ho.a(stringBuilder, a.v((Parcel)iterator, n2));
                    break;
                }
                case 5: {
                    ho.a(stringBuilder, (Object[])a.w((Parcel)iterator, n2));
                    break;
                }
                case 6: {
                    ho.a(stringBuilder, a.q((Parcel)iterator, n2));
                    break;
                }
                case 7: {
                    ho.a(stringBuilder, a.x((Parcel)iterator, n2));
                    break;
                }
                case 8: 
                case 9: 
                case 10: {
                    throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                }
                case 11: {
                    iterator = a.A((Parcel)iterator, n2);
                    int n3 = iterator.length;
                    for (n2 = 0; n2 < n3; ++n2) {
                        if (n2 > 0) {
                            stringBuilder.append(",");
                        }
                        iterator[n2].setDataPosition(0);
                        this.a(stringBuilder, bundle.l(), (Parcel)iterator[n2]);
                    }
                }
            }
            stringBuilder.append("]");
            return;
        }
        switch (bundle.d()) {
            default: {
                throw new IllegalStateException("Unknown field type out");
            }
            case 0: {
                stringBuilder.append(a.g((Parcel)iterator, n2));
                return;
            }
            case 1: {
                stringBuilder.append((Object)a.i((Parcel)iterator, n2));
                return;
            }
            case 2: {
                stringBuilder.append(a.h((Parcel)iterator, n2));
                return;
            }
            case 3: {
                stringBuilder.append(a.j((Parcel)iterator, n2));
                return;
            }
            case 4: {
                stringBuilder.append(a.k((Parcel)iterator, n2));
                return;
            }
            case 5: {
                stringBuilder.append((Object)a.l((Parcel)iterator, n2));
                return;
            }
            case 6: {
                stringBuilder.append(a.c((Parcel)iterator, n2));
                return;
            }
            case 7: {
                bundle = a.m((Parcel)iterator, n2);
                stringBuilder.append("\"").append(hr.a((String)bundle)).append("\"");
                return;
            }
            case 8: {
                bundle = a.p((Parcel)iterator, n2);
                stringBuilder.append("\"").append(hp.a((byte[])bundle)).append("\"");
                return;
            }
            case 9: {
                bundle = a.p((Parcel)iterator, n2);
                stringBuilder.append("\"").append(hp.b((byte[])bundle));
                stringBuilder.append("\"");
                return;
            }
            case 10: {
                bundle = a.o((Parcel)iterator, n2);
                iterator = bundle.keySet();
                iterator.size();
                stringBuilder.append("{");
                iterator = iterator.iterator();
                n2 = 1;
                do {
                    if (!iterator.hasNext()) {
                        stringBuilder.append("}");
                        return;
                    }
                    String string = (String)iterator.next();
                    if (n2 == 0) {
                        stringBuilder.append(",");
                    }
                    stringBuilder.append("\"").append(string).append("\"");
                    stringBuilder.append(":");
                    stringBuilder.append("\"").append(hr.a(bundle.getString(string))).append("\"");
                    n2 = 0;
                } while (true);
            }
            case 11: 
        }
        iterator = a.z((Parcel)iterator, n2);
        iterator.setDataPosition(0);
        this.a(stringBuilder, bundle.l(), (Parcel)iterator);
    }

    public int a() {
        return this.b;
    }

    @Override
    protected Object a(String string) {
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
    protected boolean b(String string) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public int describeContents() {
        hn hn2 = a;
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Parcel e() {
        switch (this.g) {
            case 0: {
                this.h = c.a(this.c);
                c.a(this.c, this.h);
                this.g = 2;
            }
            default: {
                return this.c;
            }
            case 1: 
        }
        c.a(this.c, this.h);
        this.g = 2;
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
            case 2: 
        }
        return this.e;
    }

    @Override
    public String toString() {
        hc.a(this.e, (Object)"Cannot convert to JSON on client side.");
        Parcel parcel = this.e();
        parcel.setDataPosition(0);
        StringBuilder stringBuilder = new StringBuilder(100);
        this.a(stringBuilder, this.e.a(this.f), parcel);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n2) {
        hn hn2 = a;
        hn.a(this, parcel, n2);
    }
}

