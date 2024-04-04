// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.a;

import java.lang.reflect.Field;
import android.os.IBinder;

public final class d extends b
{
    private final Object a;
    
    private d(final Object a) {
        this.a = a;
    }
    
    public static a a(final Object o) {
        return new d(o);
    }
    
    public static Object a(final a a) {
        if (a instanceof d) {
            return ((d)a).a;
        }
        final IBinder binder = a.asBinder();
        final Field[] declaredFields = binder.getClass().getDeclaredFields();
        if (declaredFields.length == 1) {
            final Field field = declaredFields[0];
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(binder);
                }
                catch (NullPointerException cause) {
                    throw new IllegalArgumentException("Binder object is null.", cause);
                }
                catch (IllegalArgumentException cause2) {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", cause2);
                }
                catch (IllegalAccessException cause3) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", cause3);
                }
            }
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
        throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
    }
}
