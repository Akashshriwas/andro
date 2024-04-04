package com.google.android.gms.a;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.class_188;
import com.google.android.gms.internal.class_343;

// $FF: renamed from: com.google.android.gms.a.e
public abstract class class_378 {
   // $FF: renamed from: a java.lang.String
   private final String field_1014;
   // $FF: renamed from: b java.lang.Object
   private Object field_1015;

   protected class_378(String var1) {
      this.field_1014 = var1;
   }

   // $FF: renamed from: a (android.content.Context) java.lang.Object
   protected final Object method_1298(Context var1) {
      if (this.field_1015 == null) {
         class_343.method_1189(var1);
         var1 = class_188.method_802(var1);
         if (var1 == null) {
            throw new class_372("Could not get remote context.");
         }

         ClassLoader var5 = var1.getClassLoader();

         try {
            this.field_1015 = this.method_1299((IBinder)var5.loadClass(this.field_1014).newInstance());
         } catch (ClassNotFoundException var2) {
            throw new class_372("Could not load creator class.");
         } catch (InstantiationException var3) {
            throw new class_372("Could not instantiate creator.");
         } catch (IllegalAccessException var4) {
            throw new class_372("Could not access creator.");
         }
      }

      return this.field_1015;
   }

   // $FF: renamed from: a (android.os.IBinder) java.lang.Object
   protected abstract Object method_1299(IBinder var1);
}
