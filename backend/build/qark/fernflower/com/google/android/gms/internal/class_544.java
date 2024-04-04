package com.google.android.gms.internal;

// $FF: renamed from: com.google.android.gms.internal.aq
class class_544 implements Runnable {
   // $FF: renamed from: a com.google.android.gms.internal.ao
   // $FF: synthetic field
   final class_534 field_1679;
   // $FF: renamed from: b com.google.android.gms.internal.ap
   // $FF: synthetic field
   final class_531 field_1680;

   class_544(class_531 var1, class_534 var2) {
      this.field_1680 = var1;
      this.field_1679 = var2;
   }

   public void run() {
      Object var1 = class_531.method_1795(this.field_1680);
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label198: {
         try {
            if (class_531.method_1799(this.field_1680) != -2) {
               return;
            }
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            break label198;
         }

         try {
            class_531.method_1794(this.field_1680, class_531.method_1802(this.field_1680));
            if (class_531.method_1803(this.field_1680) == null) {
               this.field_1680.method_165(4);
               return;
            }
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            break label198;
         }

         label185:
         try {
            this.field_1679.method_1811(this.field_1680);
            class_531.method_1798(this.field_1680, this.field_1679);
            return;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            break label185;
         }
      }

      while(true) {
         Throwable var2 = var10000;

         try {
            throw var2;
         } catch (Throwable var19) {
            var10000 = var19;
            var10001 = false;
            continue;
         }
      }
   }
}
