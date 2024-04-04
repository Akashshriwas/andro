// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.drive.metadata;

import java.util.HashSet;
import java.util.Collection;
import java.util.Collections;
import com.google.android.gms.internal.hc;
import java.util.Set;

public abstract class b
{
    private final String a;
    private final Set b;
    
    protected b(final String o) {
        this.a = (String)hc.a(o, "fieldName");
        this.b = Collections.singleton(o);
    }
    
    protected b(final String s, final Collection c) {
        this.a = (String)hc.a(s, "fieldName");
        this.b = Collections.unmodifiableSet((Set<?>)new HashSet<Object>(c));
    }
    
    public final String a() {
        return this.a;
    }
    
    @Override
    public String toString() {
        return this.a;
    }
}
