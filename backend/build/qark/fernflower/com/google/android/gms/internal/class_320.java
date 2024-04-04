package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.class_26;
import java.util.ArrayList;

// $FF: renamed from: com.google.android.gms.internal.gi
final class class_320 extends Handler {
   // $FF: renamed from: a com.google.android.gms.internal.gh
   // $FF: synthetic field
   final class_321 field_907;

   public class_320(class_321 var1, Looper var2) {
      super(var2);
      this.field_907 = var1;
   }

   public void handleMessage(Message var1) {
      if (var1.what == 1) {
         ArrayList var2 = class_321.method_1059(this.field_907);
         synchronized(var2){}

         Throwable var10000;
         boolean var10001;
         label152: {
            try {
               if (class_321.method_1060(this.field_907).method_125() && class_321.method_1060(this.field_907).method_123() && class_321.method_1059(this.field_907).contains(var1.obj)) {
                  Bundle var3 = class_321.method_1060(this.field_907).method_124();
                  ((class_26)var1.obj).method_81(var3);
               }
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label152;
            }

            label149:
            try {
               return;
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label149;
            }
         }

         while(true) {
            Throwable var16 = var10000;

            try {
               throw var16;
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               continue;
            }
         }
      } else {
         Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
      }
   }
}
