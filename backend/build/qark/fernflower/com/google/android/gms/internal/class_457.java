package com.google.android.gms.internal;

// $FF: renamed from: com.google.android.gms.internal.db
class class_457 implements Runnable {
   // $FF: renamed from: a com.google.android.gms.internal.cy
   // $FF: synthetic field
   final class_431 field_1247;

   class_457(class_431 var1) {
      this.field_1247 = var1;
   }

   public void run() {
      Object var1 = class_431.method_1461(this.field_1247);
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label283: {
         try {
            if (class_431.method_1466(this.field_1247).field_1173 != -2) {
               return;
            }
         } catch (Throwable var32) {
            var10000 = var32;
            var10001 = false;
            break label283;
         }

         label284: {
            try {
               class_431.method_1469(this.field_1247).method_1649().method_1625(this.field_1247);
               if (class_431.method_1466(this.field_1247).field_1173 == -3) {
                  class_467.method_1609("Loading URL in WebView: " + class_431.method_1466(this.field_1247).field_1170);
                  class_431.method_1469(this.field_1247).loadUrl(class_431.method_1466(this.field_1247).field_1170);
                  break label284;
               }
            } catch (Throwable var31) {
               var10000 = var31;
               var10001 = false;
               break label283;
            }

            try {
               class_467.method_1609("Loading HTML in WebView.");
               class_431.method_1469(this.field_1247).loadDataWithBaseURL(class_466.method_1580(class_431.method_1466(this.field_1247).field_1170), class_431.method_1466(this.field_1247).field_1171, "text/html", "UTF-8", (String)null);
            } catch (Throwable var30) {
               var10000 = var30;
               var10001 = false;
               break label283;
            }
         }

         label266:
         try {
            return;
         } catch (Throwable var29) {
            var10000 = var29;
            var10001 = false;
            break label266;
         }
      }

      while(true) {
         Throwable var2 = var10000;

         try {
            throw var2;
         } catch (Throwable var28) {
            var10000 = var28;
            var10001 = false;
            continue;
         }
      }
   }
}
