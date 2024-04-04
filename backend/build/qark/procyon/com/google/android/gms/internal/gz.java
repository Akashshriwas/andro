// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

public final class gz
{
    private final List a;
    private final Object b;
    
    private gz(final Object o) {
        this.b = hc.a(o);
        this.a = new ArrayList();
    }
    
    public gz a(final String s, final Object obj) {
        this.a.add((String)hc.a((Object)s) + "=" + String.valueOf(obj));
        return this;
    }
    
    @Override
    public String toString() {
        final StringBuilder append = new StringBuilder(100).append(this.b.getClass().getSimpleName()).append('{');
        for (int size = this.a.size(), i = 0; i < size; ++i) {
            append.append((String)this.a.get(i));
            if (i < size - 1) {
                append.append(", ");
            }
        }
        return append.append('}').toString();
    }
}
