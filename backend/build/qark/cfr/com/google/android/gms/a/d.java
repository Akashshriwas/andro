/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 */
package com.google.android.gms.a;

import android.os.IBinder;
import com.google.android.gms.a.a;
import com.google.android.gms.a.b;
import java.lang.reflect.Field;

public final class d
extends b {
    private final Object a;

    private d(Object object) {
        this.a = object;
    }

    public static a a(Object object) {
        return new d(object);
    }

    public static Object a(a object) {
        if (object instanceof d) {
            return ((d)object).a;
        }
        Field field = (object = object.asBinder()).getClass().getDeclaredFields();
        if (field.length == 1) {
            if (!(field = field[0]).isAccessible()) {
                field.setAccessible(true);
                try {
                    object = field.get(object);
                    return object;
                }
                catch (NullPointerException nullPointerException) {
                    throw new IllegalArgumentException("Binder object is null.", (Throwable)nullPointerException);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", (Throwable)illegalArgumentException);
                }
                catch (IllegalAccessException illegalAccessException) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", (Throwable)illegalAccessException);
                }
            }
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
        throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
    }
}

