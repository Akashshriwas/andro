// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;

public abstract class ee
{
    private void a(final StringBuilder sb, final ee$a ee$a, final Object o) {
        if (ee$a.b() == 11) {
            sb.append(ee$a.h().cast(o).toString());
            return;
        }
        if (ee$a.b() == 7) {
            sb.append("\"");
            sb.append(hr.a((String)o));
            sb.append("\"");
            return;
        }
        sb.append(o);
    }
    
    private void a(final StringBuilder sb, final ee$a ee$a, final ArrayList list) {
        sb.append("[");
        for (int i = 0; i < list.size(); ++i) {
            if (i > 0) {
                sb.append(",");
            }
            final Object value = list.get(i);
            if (value != null) {
                this.a(sb, ee$a, value);
            }
        }
        sb.append("]");
    }
    
    protected Object a(final ee$a ee$a, final Object o) {
        Object a = o;
        if (ee$a.l != null) {
            a = ee$a.a(o);
        }
        return a;
    }
    
    protected abstract Object a(final String p0);
    
    protected boolean a(final ee$a ee$a) {
        if (ee$a.d() != 11) {
            return this.b(ee$a.f());
        }
        if (ee$a.e()) {
            return this.d(ee$a.f());
        }
        return this.c(ee$a.f());
    }
    
    protected Object b(final ee$a ee$a) {
        boolean b = true;
        final String f = ee$a.f();
        if (ee$a.h() != null) {
            if (this.a(ee$a.f()) != null) {
                b = false;
            }
            hc.a(b, (Object)("Concrete field shouldn't be value object: " + ee$a.f()));
            HashMap hashMap;
            if (ee$a.e()) {
                hashMap = this.d();
            }
            else {
                hashMap = this.c();
            }
            if (hashMap != null) {
                return hashMap.get(f);
            }
            try {
                return this.getClass().getMethod("get" + Character.toUpperCase(f.charAt(0)) + f.substring(1), (Class<?>[])new Class[0]).invoke(this, new Object[0]);
            }
            catch (Exception cause) {
                throw new RuntimeException(cause);
            }
        }
        return this.a(ee$a.f());
    }
    
    public abstract HashMap b();
    
    protected abstract boolean b(final String p0);
    
    public HashMap c() {
        return null;
    }
    
    protected boolean c(final String s) {
        throw new UnsupportedOperationException("Concrete types not supported");
    }
    
    public HashMap d() {
        return null;
    }
    
    protected boolean d(final String s) {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }
    
    @Override
    public String toString() {
        final HashMap b = this.b();
        final StringBuilder sb = new StringBuilder(100);
        for (final String s : b.keySet()) {
            final ee$a ee$a = (ee$a)b.get(s);
            if (this.a(ee$a)) {
                final Object a = this.a(ee$a, this.b(ee$a));
                if (sb.length() == 0) {
                    sb.append("{");
                }
                else {
                    sb.append(",");
                }
                sb.append("\"").append(s).append("\":");
                if (a == null) {
                    sb.append("null");
                }
                else {
                    switch (ee$a.d()) {
                        default: {
                            if (ee$a.c()) {
                                this.a(sb, ee$a, (ArrayList)a);
                                continue;
                            }
                            this.a(sb, ee$a, a);
                            continue;
                        }
                        case 8: {
                            sb.append("\"").append(hp.a((byte[])a)).append("\"");
                            continue;
                        }
                        case 9: {
                            sb.append("\"").append(hp.b((byte[])a)).append("\"");
                            continue;
                        }
                        case 10: {
                            hs.a(sb, (HashMap)a);
                            continue;
                        }
                    }
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        }
        else {
            sb.append("{}");
        }
        return sb.toString();
    }
}
