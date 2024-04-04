/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.lang.reflect.Method
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Set
 */
package com.google.android.gms.internal;

import com.google.android.gms.internal.ee$a;
import com.google.android.gms.internal.hc;
import com.google.android.gms.internal.hp;
import com.google.android.gms.internal.hr;
import com.google.android.gms.internal.hs;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public abstract class ee {
    private void a(StringBuilder stringBuilder, ee$a ee$a, Object object) {
        if (ee$a.b() == 11) {
            stringBuilder.append(((ee)ee$a.h().cast(object)).toString());
            return;
        }
        if (ee$a.b() == 7) {
            stringBuilder.append("\"");
            stringBuilder.append(hr.a((String)object));
            stringBuilder.append("\"");
            return;
        }
        stringBuilder.append(object);
    }

    private void a(StringBuilder stringBuilder, ee$a ee$a, ArrayList arrayList) {
        stringBuilder.append("[");
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object;
            if (i2 > 0) {
                stringBuilder.append(",");
            }
            if ((object = arrayList.get(i2)) == null) continue;
            this.a(stringBuilder, ee$a, object);
        }
        stringBuilder.append("]");
    }

    protected Object a(ee$a ee$a, Object object) {
        Object object2 = object;
        if (ee$a.a(ee$a) != null) {
            object2 = ee$a.a(object);
        }
        return object2;
    }

    protected abstract Object a(String var1);

    protected boolean a(ee$a ee$a) {
        if (ee$a.d() == 11) {
            if (ee$a.e()) {
                return this.d(ee$a.f());
            }
            return this.c(ee$a.f());
        }
        return this.b(ee$a.f());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected Object b(ee$a object) {
        boolean bl2 = true;
        String string = object.f();
        if (object.h() == null) {
            return this.a(object.f());
        }
        if (this.a(object.f()) != null) {
            bl2 = false;
        }
        hc.a(bl2, (Object)("Concrete field shouldn't be value object: " + object.f()));
        object = object.e() ? this.d() : this.c();
        if (object != null) {
            return object.get((Object)string);
        }
        try {
            object = "get" + Character.toUpperCase((char)string.charAt(0)) + string.substring(1);
            return this.getClass().getMethod((String)object, new Class[0]).invoke((Object)this, new Object[0]);
        }
        catch (Exception exception) {
            throw new RuntimeException((Throwable)exception);
        }
    }

    public abstract HashMap b();

    protected abstract boolean b(String var1);

    public HashMap c() {
        return null;
    }

    protected boolean c(String string) {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public HashMap d() {
        return null;
    }

    protected boolean d(String string) {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    /*
     * Enabled aggressive block sorting
     */
    public String toString() {
        HashMap hashMap = this.b();
        StringBuilder stringBuilder = new StringBuilder(100);
        block5 : for (String string : hashMap.keySet()) {
            ee$a ee$a = (ee$a)hashMap.get((Object)string);
            if (!this.a(ee$a)) continue;
            Object object = this.a(ee$a, this.b(ee$a));
            if (stringBuilder.length() == 0) {
                stringBuilder.append("{");
            } else {
                stringBuilder.append(",");
            }
            stringBuilder.append("\"").append(string).append("\":");
            if (object == null) {
                stringBuilder.append("null");
                continue;
            }
            switch (ee$a.d()) {
                default: {
                    if (!ee$a.c()) break;
                    this.a(stringBuilder, ee$a, (ArrayList)object);
                    continue block5;
                }
                case 8: {
                    stringBuilder.append("\"").append(hp.a((byte[])object)).append("\"");
                    continue block5;
                }
                case 9: {
                    stringBuilder.append("\"").append(hp.b((byte[])object)).append("\"");
                    continue block5;
                }
                case 10: {
                    hs.a(stringBuilder, (HashMap)object);
                    continue block5;
                }
            }
            this.a(stringBuilder, ee$a, object);
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
        stringBuilder.append("{}");
        return stringBuilder.toString();
    }
}

