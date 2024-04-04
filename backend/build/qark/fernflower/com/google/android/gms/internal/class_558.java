package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.a.a.class_29;
import com.google.a.a.class_5;
import java.util.Map;

// $FF: renamed from: com.google.android.gms.internal.bk
public final class class_558 extends class_557 {
   // $FF: renamed from: a java.util.Map
   private Map field_1896;

   // $FF: renamed from: b (java.lang.String) com.google.android.gms.internal.bp
   private class_63 method_1850(String var1) {
      try {
         class_5 var2 = (class_5)Class.forName(var1).newInstance();
         class_561 var4 = new class_561(var2, (class_29)this.field_1896.get(var2.method_7()));
         return var4;
      } catch (Throwable var3) {
         class_467.method_1610("Could not instantiate mediation adapter: " + var1 + ". " + var3.getMessage());
         throw new RemoteException();
      }
   }

   // $FF: renamed from: a (java.lang.String) com.google.android.gms.internal.bp
   public class_63 method_170(String var1) {
      return this.method_1850(var1);
   }

   // $FF: renamed from: a (java.util.Map) void
   public void method_1851(Map var1) {
      this.field_1896 = var1;
   }
}
