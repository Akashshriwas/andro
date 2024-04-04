package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// $FF: renamed from: com.google.android.gms.internal.dj
public abstract class class_85 implements SafeParcelable {
   // $FF: renamed from: a java.lang.Object
   private static final Object field_3 = new Object();
   // $FF: renamed from: b java.lang.ClassLoader
   private static ClassLoader field_4 = null;
   // $FF: renamed from: c java.lang.Integer
   private static Integer field_5 = null;
   // $FF: renamed from: d boolean
   private boolean field_6 = false;

   // $FF: renamed from: a (java.lang.Class) boolean
   private static boolean method_222(Class var0) {
      try {
         boolean var1 = "SAFE_PARCELABLE_NULL_STRING".equals(var0.getField("NULL").get((Object)null));
         return var1;
      } catch (NoSuchFieldException var2) {
         return false;
      } catch (IllegalAccessException var3) {
         return false;
      }
   }

   // $FF: renamed from: b (java.lang.String) boolean
   protected static boolean method_223(String var0) {
      ClassLoader var2 = method_224();
      if (var2 == null) {
         return true;
      } else {
         try {
            boolean var1 = method_222(var2.loadClass(var0));
            return var1;
         } catch (Exception var3) {
            return false;
         }
      }
   }

   // $FF: renamed from: v () java.lang.ClassLoader
   protected static ClassLoader method_224() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: w () java.lang.Integer
   protected static Integer method_225() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: x () boolean
   protected boolean method_226() {
      return this.field_6;
   }
}
