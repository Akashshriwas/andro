package com.a.g;

import android.content.Context;
import dn.class_100;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// $FF: renamed from: com.a.g.d
public class class_155 {
   // $FF: renamed from: a java.util.concurrent.ExecutorService
   ExecutorService field_473;

   public class_155(Context var1) {
      class_100.method_315();
      this.field_473 = Executors.newFixedThreadPool(5);
   }

   // $FF: renamed from: a (com.a.g.d, java.lang.String, java.lang.String) void
   // $FF: synthetic method
   static void method_656(class_155 var0, String var1, String var2) {
      var0.method_658(var1, var2);
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) void
   private void method_657(String var1, String var2) {
      class_158 var3 = new class_158(this, var1, var2);
      this.field_473.submit(new class_149(this, var3));
   }

   // $FF: renamed from: c (java.lang.String, java.lang.String) void
   private void method_658(String var1, String var2) {
      Throwable var10000;
      label49: {
         InputStream var4;
         HttpURLConnection var12;
         boolean var10001;
         try {
            var12 = (HttpURLConnection)(new URL(var1)).openConnection();
            var12.setConnectTimeout(30000);
            var12.setReadTimeout(30000);
            var12.setInstanceFollowRedirects(true);
            var4 = var12.getInputStream();
         } catch (Throwable var11) {
            var10000 = var11;
            var10001 = false;
            break label49;
         }

         if (var4 != null) {
            byte[] var5;
            FileOutputStream var14;
            try {
               var14 = new FileOutputStream(class_100.method_309(var2));
               var5 = new byte[1024];
            } catch (Throwable var10) {
               var10000 = var10;
               var10001 = false;
               break label49;
            }

            while(true) {
               int var3;
               try {
                  var3 = var4.read(var5);
               } catch (Throwable var8) {
                  var10000 = var8;
                  var10001 = false;
                  break label49;
               }

               if (var3 == -1) {
                  try {
                     var4.close();
                     var14.flush();
                     var14.close();
                     break;
                  } catch (Throwable var7) {
                     var10000 = var7;
                     var10001 = false;
                     break label49;
                  }
               }

               try {
                  var14.write(var5, 0, var3);
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

   // $FF: renamed from: a (java.lang.String, java.lang.String) void
   public void method_659(String var1, String var2) {
      this.method_657(var1, var2);
   }
}
