package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.net.Uri;
import android.widget.ImageView;

// $FF: renamed from: com.google.android.gms.internal.ft
public final class class_490 extends ImageView {
   // $FF: renamed from: a android.net.Uri
   private Uri field_1392;
   // $FF: renamed from: b int
   private int field_1393;
   // $FF: renamed from: c int
   private int field_1394;

   // $FF: renamed from: a () int
   public int method_1696() {
      return this.field_1393;
   }

   // $FF: renamed from: a (int) void
   public void method_1697(int var1) {
      this.field_1393 = var1;
   }

   // $FF: renamed from: a (android.net.Uri) void
   public void method_1698(Uri var1) {
      this.field_1392 = var1;
   }

   protected void onDraw(Canvas var1) {
      super.onDraw(var1);
      if (this.field_1394 != 0) {
         var1.drawColor(this.field_1394);
      }

   }
}
