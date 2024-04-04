/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Set
 */
package com.google.android.gms.drive.metadata;

import com.google.android.gms.internal.hc;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class b {
    private final String a;
    private final Set b;

    protected b(String string) {
        this.a = (String)hc.a(string, (Object)"fieldName");
        this.b = Collections.singleton((Object)string);
    }

    protected b(String string, Collection collection) {
        this.a = (String)hc.a(string, (Object)"fieldName");
        this.b = Collections.unmodifiableSet((Set)new HashSet(collection));
    }

    public final String a() {
        return this.a;
    }

    public String toString() {
        return this.a;
    }
}

