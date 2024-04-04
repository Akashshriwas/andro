package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

// $FF: renamed from: com.google.android.gms.common.images.d
final class class_261 implements Runnable {
   // $FF: renamed from: a com.google.android.gms.common.images.ImageManager
   // $FF: synthetic field
   final ImageManager field_745;
   // $FF: renamed from: b android.net.Uri
   private final Uri field_746;
   // $FF: renamed from: c android.graphics.Bitmap
   private final Bitmap field_747;
   // $FF: renamed from: d java.util.concurrent.CountDownLatch
   private final CountDownLatch field_748;
   // $FF: renamed from: e boolean
   private boolean field_749;

   public class_261(ImageManager var1, Uri var2, Bitmap var3, boolean var4, CountDownLatch var5) {
      this.field_745 = var1;
      this.field_746 = var2;
      this.field_747 = var3;
      this.field_749 = var4;
      this.field_748 = var5;
   }

   // $FF: renamed from: a (com.google.android.gms.common.images.ImageManager$ImageReceiver, boolean) void
   private void method_939(ImageManager$ImageReceiver var1, boolean var2) {
      var1.field_503 = true;
      ArrayList var5 = ImageManager$ImageReceiver.method_670(var1);
      int var4 = var5.size();

      for(int var3 = 0; var3 < var4; ++var3) {
         class_251 var6 = (class_251)var5.get(var3);
         if (var2) {
            var6.method_912(ImageManager.method_1406(this.field_745), this.field_747, false);
         } else {
            var6.method_913(ImageManager.method_1406(this.field_745), false);
         }

         if (var6.field_734 != 1) {
            ImageManager.method_1410(this.field_745).remove(var6);
         }
      }

      var1.field_503 = false;
   }

   public void run() {
      // $FF: Couldn't be decompiled
   }
}
