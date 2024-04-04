// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.a.a;

import java.util.Iterator;
import com.google.android.gms.internal.et;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public abstract class g
{
    protected void a() {
    }
    
    public void a(Map iterator) {
        final HashMap<Object, Field> hashMap = new HashMap<Object, Field>();
        final Field[] fields = this.getClass().getFields();
        for (int length = fields.length, i = 0; i < length; ++i) {
            final Field field = fields[i];
            final i j = field.getAnnotation(i.class);
            if (j != null) {
                hashMap.put(j.a(), field);
            }
        }
        if (hashMap.isEmpty()) {
            et.e("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        iterator = ((Map<Object, Object>)iterator).entrySet().iterator();
        while (iterator.hasNext()) {
            final Map.Entry<Object, Object> entry = iterator.next();
            final Field field2 = hashMap.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                }
                catch (IllegalAccessException ex) {
                    et.e("Server option \"" + entry.getKey() + "\" could not be set: Illegal Access");
                }
                catch (IllegalArgumentException ex2) {
                    et.e("Server option \"" + entry.getKey() + "\" could not be set: Bad Type");
                }
            }
            else {
                et.a("Unexpected server option: " + entry.getKey() + " = \"" + entry.getValue() + "\"");
            }
        }
        final StringBuilder sb = new StringBuilder();
        for (final Field field3 : hashMap.values()) {
            if (field3.getAnnotation(i.class).b()) {
                et.e("Required server option missing: " + field3.getAnnotation(i.class).a());
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(field3.getAnnotation(i.class).a());
            }
        }
        if (sb.length() > 0) {
            throw new h("Required server option(s) missing: " + sb.toString());
        }
        this.a();
    }
}
