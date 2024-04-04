package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import com.google.android.gms.internal.class_263;

// $FF: renamed from: com.google.android.gms.common.images.b
final class class_264 extends class_263 {
   // $FF: renamed from: a (com.google.android.gms.common.images.f, android.graphics.Bitmap) int
   protected int method_946(class_249 var1, Bitmap var2) {
      return var2.getHeight() * var2.getRowBytes();
   }

   // $FF: renamed from: a (java.lang.Object, java.lang.Object) int
   // $FF: synthetic method
   protected int method_941(Object var1, Object var2) {
      return this.method_946((class_249)var1, (Bitmap)var2);
   }

   // $FF: renamed from: a (boolean, com.google.android.gms.common.images.f, android.graphics.Bitmap, android.graphics.Bitmap) void
   protected void method_947(boolean var1, class_249 var2, Bitmap var3, Bitmap var4) {
      super.method_944(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (boolean, java.lang.Object, java.lang.Object, java.lang.Object) void
   // $FF: synthetic method
   protected void method_944(boolean var1, Object var2, Object var3, Object var4) {
      this.method_947(var1, (class_249)var2, (Bitmap)var3, (Bitmap)var4);
   }
}
