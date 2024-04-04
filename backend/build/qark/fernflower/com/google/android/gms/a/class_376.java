package com.google.android.gms.a;

import android.os.IBinder;
import java.lang.reflect.Field;

// $FF: renamed from: com.google.android.gms.a.d
public final class class_376 extends class_375 {
   // $FF: renamed from: a java.lang.Object
   private final Object field_1013;

   private class_376(Object var1) {
      this.field_1013 = var1;
   }

   // $FF: renamed from: a (java.lang.Object) com.google.android.gms.a.a
   public static class_43 method_1293(Object var0) {
      return new class_376(var0);
   }

   // $FF: renamed from: a (com.google.android.gms.a.a) java.lang.Object
   public static Object method_1294(class_43 var0) {
      if (var0 instanceof class_376) {
         return ((class_376)var0).field_1013;
      } else {
         IBinder var5 = var0.asBinder();
         Field[] var1 = var5.getClass().getDeclaredFields();
         if (var1.length == 1) {
            Field var7 = var1[0];
            if (!var7.isAccessible()) {
               var7.setAccessible(true);

               try {
                  Object var6 = var7.get(var5);
                  return var6;
               } catch (NullPointerException var2) {
                  throw new IllegalArgumentException("Binder object is null.", var2);
               } catch (IllegalArgumentException var3) {
                  throw new IllegalArgumentException("remoteBinder is the wrong class.", var3);
               } catch (IllegalAccessException var4) {
                  throw new IllegalArgumentException("Could not access the field in remoteBinder.", var4);
               }
            } else {
               throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
         } else {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
         }
      }
   }
}
