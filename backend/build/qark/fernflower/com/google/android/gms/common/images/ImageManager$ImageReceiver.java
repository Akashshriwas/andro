package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import java.util.ArrayList;

final class ImageManager$ImageReceiver extends ResultReceiver {
   // $FF: renamed from: a boolean
   boolean field_503;
   // $FF: renamed from: b com.google.android.gms.common.images.ImageManager
   // $FF: synthetic field
   final ImageManager field_504;
   // $FF: renamed from: c android.net.Uri
   private final Uri field_505;
   // $FF: renamed from: d java.util.ArrayList
   private final ArrayList field_506;

   // $FF: renamed from: a (com.google.android.gms.common.images.ImageManager$ImageReceiver) java.util.ArrayList
   // $FF: synthetic method
   static ArrayList method_670(ImageManager$ImageReceiver var0) {
      return var0.field_506;
   }

   public void onReceiveResult(int var1, Bundle var2) {
      ParcelFileDescriptor var3 = (ParcelFileDescriptor)var2.getParcelable("com.google.android.gms.extra.fileDescriptor");
      ImageManager.method_1411(this.field_504).execute(new class_262(this.field_504, this.field_505, var3));
   }
}
