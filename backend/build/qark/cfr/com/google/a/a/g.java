/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.annotation.Annotation
 *  java.lang.reflect.Field
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.google.a.a;

import com.google.a.a.h;
import com.google.a.a.i;
import com.google.android.gms.internal.et;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Deprecated
public abstract class g {
    protected void a() {
    }

    public void a(Map map) {
        HashMap hashMap = new HashMap();
        for (Field field : this.getClass().getFields()) {
            i i2 = (i)field.getAnnotation(i.class);
            if (i2 == null) continue;
            hashMap.put((Object)i2.a(), (Object)field);
        }
        if (hashMap.isEmpty()) {
            et.e("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Map.Entry entry : map.entrySet()) {
            Field field;
            field = (Field)hashMap.remove(entry.getKey());
            if (field != null) {
                try {
                    field.set((Object)this, entry.getValue());
                }
                catch (IllegalAccessException illegalAccessException) {
                    et.e("Server option \"" + (String)entry.getKey() + "\" could not be set: Illegal Access");
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    et.e("Server option \"" + (String)entry.getKey() + "\" could not be set: Bad Type");
                }
                continue;
            }
            et.a("Unexpected server option: " + (String)entry.getKey() + " = \"" + (String)entry.getValue() + "\"");
        }
        map = new StringBuilder();
        for (Map.Entry entry : hashMap.values()) {
            if (!((i)entry.getAnnotation(i.class)).b()) continue;
            et.e("Required server option missing: " + ((i)entry.getAnnotation(i.class)).a());
            if (map.length() > 0) {
                map.append(", ");
            }
            map.append(((i)entry.getAnnotation(i.class)).a());
        }
        if (map.length() > 0) {
            throw new h("Required server option(s) missing: " + map.toString());
        }
        this.a();
    }
}

