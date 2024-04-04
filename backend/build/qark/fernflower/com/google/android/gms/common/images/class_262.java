package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.internal.class_495;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

// $FF: renamed from: com.google.android.gms.common.images.c
final class class_262 implements Runnable {
   // $FF: renamed from: a com.google.android.gms.common.images.ImageManager
   // $FF: synthetic field
   final ImageManager field_750;
   // $FF: renamed from: b android.net.Uri
   private final Uri field_751;
   // $FF: renamed from: c android.os.ParcelFileDescriptor
   private final ParcelFileDescriptor field_752;

   public class_262(ImageManager var1, Uri var2, ParcelFileDescriptor var3) {
      this.field_750 = var1;
      this.field_751 = var2;
      this.field_752 = var3;
   }

   public void run() {
      class_495.method_1708("LoadBitmapFromDiskRunnable can't be executed in the main thread");
      boolean var1 = false;
      boolean var2 = false;
      Bitmap var3 = null;
      CountDownLatch var4 = null;
      if (this.field_752 != null) {
         label23: {
            try {
               var3 = BitmapFactory.decodeFileDescriptor(this.field_752.getFileDescriptor());
            } catch (OutOfMemoryError var7) {
               Log.e("ImageManager", "OOM while loading bitmap for uri: " + this.field_751, var7);
               var1 = true;
               var3 = var4;
               break label23;
            }

            var1 = var2;
         }

         try {
            this.field_752.close();
         } catch (IOException var6) {
            Log.e("ImageManager", "closed failed", var6);
         }
      }

      var4 = new CountDownLatch(1);
      ImageManager.method_1412(this.field_750).post(new class_261(this.field_750, this.field_751, var3, var1, var4));

      try {
         var4.await();
      } catch (InterruptedException var5) {
         Log.w("ImageManager", "Latch interrupted while posting " + this.field_751);
      }
   }
}
