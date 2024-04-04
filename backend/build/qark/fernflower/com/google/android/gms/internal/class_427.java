package com.google.android.gms.internal;

import android.content.Context;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// $FF: renamed from: com.google.android.gms.internal.er
public final class class_427 extends class_426 {
   // $FF: renamed from: a java.lang.String
   private final String field_1134;
   // $FF: renamed from: b android.content.Context
   private final Context field_1135;
   // $FF: renamed from: c java.lang.String
   private final String field_1136;

   public class_427(Context var1, String var2, String var3) {
      this.field_1135 = var1;
      this.field_1134 = var2;
      this.field_1136 = var3;
   }

   // $FF: renamed from: a () void
   public void method_1453() {
      IOException var10000;
      label128: {
         HttpURLConnection var2;
         boolean var10001;
         try {
            class_467.method_1609("Pinging URL: " + this.field_1136);
            var2 = (HttpURLConnection)(new URL(this.field_1136)).openConnection();
         } catch (IOException var18) {
            var10000 = var18;
            var10001 = false;
            break label128;
         }

         label129: {
            Throwable var20;
            label130: {
               int var1;
               try {
                  class_466.method_1587(this.field_1135, this.field_1134, true, var2);
                  var1 = var2.getResponseCode();
               } catch (Throwable var17) {
                  var20 = var17;
                  var10001 = false;
                  break label130;
               }

               if (var1 >= 200 && var1 < 300) {
                  break label129;
               }

               label116:
               try {
                  class_467.method_1610("Received non-success response code " + var1 + " from pinging URL: " + this.field_1136);
                  break label129;
               } catch (Throwable var16) {
                  var20 = var16;
                  var10001 = false;
                  break label116;
               }
            }

            Throwable var3 = var20;

            try {
               var2.disconnect();
               throw var3;
            } catch (IOException var14) {
               var10000 = var14;
               var10001 = false;
               break label128;
            }
         }

         try {
            var2.disconnect();
            return;
         } catch (IOException var15) {
            var10000 = var15;
            var10001 = false;
         }
      }

      IOException var19 = var10000;
      class_467.method_1610("Error while pinging URL: " + this.field_1136 + ". " + var19.getMessage());
   }

   // $FF: renamed from: b () void
   public void method_1454() {
   }
}
