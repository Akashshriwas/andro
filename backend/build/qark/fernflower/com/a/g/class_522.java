package com.a.g;

import android.content.Context;
import dn.class_100;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// $FF: renamed from: com.a.g.a
public class class_522 {
   // $FF: renamed from: a java.util.concurrent.ExecutorService
   ExecutorService field_1616;

   public class_522(Context var1) {
      class_100.method_315();
      this.field_1616 = Executors.newFixedThreadPool(5);
   }

   // $FF: renamed from: a (com.a.g.a, java.lang.String, int) void
   // $FF: synthetic method
   static void method_1773(class_522 var0, String var1, int var2) {
      var0.method_1775(var1, var2);
   }

   // $FF: renamed from: b (java.lang.String, int) void
   private void method_1774(String var1, int var2) {
      class_520 var3 = new class_520(this, var1, var2);
      this.field_1616.submit(new class_521(this, var3));
   }

   // $FF: renamed from: c (java.lang.String, int) void
   private void method_1775(String var1, int var2) {
      Throwable var10000;
      label49: {
         InputStream var3;
         HttpURLConnection var12;
         boolean var10001;
         try {
            var12 = (HttpURLConnection)(new URL(var1)).openConnection();
            var12.setConnectTimeout(30000);
            var12.setReadTimeout(30000);
            var12.setInstanceFollowRedirects(true);
            var3 = var12.getInputStream();
         } catch (Throwable var11) {
            var10000 = var11;
            var10001 = false;
            break label49;
         }

         if (var3 != null) {
            FileOutputStream var4;
            byte[] var5;
            try {
               var4 = new FileOutputStream(class_100.method_308(var2));
               var5 = new byte[1024];
            } catch (Throwable var10) {
               var10000 = var10;
               var10001 = false;
               break label49;
            }

            while(true) {
               try {
                  var2 = var3.read(var5);
               } catch (Throwable var8) {
                  var10000 = var8;
                  var10001 = false;
                  break label49;
               }

               if (var2 == -1) {
                  try {
                     var3.close();
                     var4.flush();
                     var4.close();
                     break;
                  } catch (Throwable var7) {
                     var10000 = var7;
                     var10001 = false;
                     break label49;
                  }
               }

               try {
                  var4.write(var5, 0, var2);
               } catch (Throwable var9) {
                  var10000 = var9;
                  var10001 = false;
                  break label49;
               }
            }
         }

         try {
            var12.disconnect();
            return;
         } catch (Throwable var6) {
            var10000 = var6;
            var10001 = false;
         }
      }

      Throwable var13 = var10000;
      var13.printStackTrace();
   }

   // $FF: renamed from: a (java.lang.String, int) void
   public void method_1776(String var1, int var2) {
      this.method_1774(var1, var2);
   }
}
