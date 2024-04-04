package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Iterator;

// $FF: renamed from: com.google.android.gms.internal.gm
public class class_324 implements ServiceConnection {
   // $FF: renamed from: a com.google.android.gms.internal.gl
   // $FF: synthetic field
   final class_325 field_921;

   public class_324(class_325 var1) {
      this.field_921 = var1;
   }

   public void onServiceConnected(ComponentName var1, IBinder var2) {
      HashMap var3 = class_326.method_1088(this.field_921.field_922);
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      label198: {
         Iterator var4;
         try {
            class_325.method_1074(this.field_921, var2);
            class_325.method_1073(this.field_921, var1);
            var4 = class_325.method_1075(this.field_921).iterator();
         } catch (Throwable var23) {
            var10000 = var23;
            var10001 = false;
            break label198;
         }

         while(true) {
            try {
               if (var4.hasNext()) {
                  ((class_318)var4.next()).onServiceConnected(var1, var2);
                  continue;
               }
            } catch (Throwable var24) {
               var10000 = var24;
               var10001 = false;
               break;
            }

            try {
               class_325.method_1072(this.field_921, 1);
               return;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break;
            }
         }
      }

      while(true) {
         Throwable var25 = var10000;

         try {
            throw var25;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            continue;
         }
      }
   }

   public void onServiceDisconnected(ComponentName var1) {
      HashMap var2 = class_326.method_1088(this.field_921.field_922);
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label198: {
         Iterator var3;
         try {
            class_325.method_1074(this.field_921, (IBinder)null);
            class_325.method_1073(this.field_921, var1);
            var3 = class_325.method_1075(this.field_921).iterator();
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            break label198;
         }

         while(true) {
            try {
               if (var3.hasNext()) {
                  ((class_318)var3.next()).onServiceDisconnected(var1);
                  continue;
               }
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break;
            }

            try {
               class_325.method_1072(this.field_921, 2);
               return;
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break;
            }
         }
      }

      while(true) {
         Throwable var24 = var10000;

         try {
            throw var24;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            continue;
         }
      }
   }
}
