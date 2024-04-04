package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.class_174;

// $FF: renamed from: com.google.android.gms.internal.gf
public final class class_317 extends class_316 {
   // $FF: renamed from: b int
   public final int field_895;
   // $FF: renamed from: c android.os.Bundle
   public final Bundle field_896;
   // $FF: renamed from: d android.os.IBinder
   public final IBinder field_897;
   // $FF: renamed from: e com.google.android.gms.internal.fx
   // $FF: synthetic field
   final class_460 field_898;

   public class_317(class_460 var1, int var2, IBinder var3, Bundle var4) {
      super(var1, true);
      this.field_898 = var1;
      this.field_895 = var2;
      this.field_897 = var3;
      this.field_896 = var4;
   }

   // $FF: renamed from: a () void
   protected void method_1053() {
   }

   // $FF: renamed from: a (java.lang.Boolean) void
   protected void method_1058(Boolean var1) {
      if (var1 != null) {
         switch(this.field_895) {
         case 0:
            try {
               String var3 = this.field_897.getInterfaceDescriptor();
               if (this.field_898.method_1561().equals(var3)) {
                  class_460.method_1546(this.field_898, this.field_898.method_1560(this.field_897));
                  if (class_460.method_1551(this.field_898) != null) {
                     class_460.method_1548(this.field_898).method_1061();
                     return;
                  }
               }
            } catch (RemoteException var2) {
            }

            class_326.method_1087(class_460.method_1553(this.field_898)).method_1090(this.field_898.method_1554(), class_460.method_1552(this.field_898));
            class_460.method_1547(this.field_898, (class_318)null);
            class_460.method_1546(this.field_898, (IInterface)null);
            class_460.method_1548(this.field_898).method_1063(new class_174(8, (PendingIntent)null));
            return;
         case 10:
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
         default:
            PendingIntent var4;
            if (this.field_896 != null) {
               var4 = (PendingIntent)this.field_896.getParcelable("pendingIntent");
            } else {
               var4 = null;
            }

            if (class_460.method_1552(this.field_898) != null) {
               class_326.method_1087(class_460.method_1553(this.field_898)).method_1090(this.field_898.method_1554(), class_460.method_1552(this.field_898));
               class_460.method_1547(this.field_898, (class_318)null);
            }

            class_460.method_1546(this.field_898, (IInterface)null);
            class_460.method_1548(this.field_898).method_1063(new class_174(this.field_895, var4));
         }
      }
   }
}
