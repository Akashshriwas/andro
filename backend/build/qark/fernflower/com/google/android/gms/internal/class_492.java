package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

// $FF: renamed from: com.google.android.gms.internal.fr
final class class_492 extends ConstantState {
   // $FF: renamed from: a int
   int field_1403;
   // $FF: renamed from: b int
   int field_1404;

   class_492(class_492 var1) {
      if (var1 != null) {
         this.field_1403 = var1.field_1403;
         this.field_1404 = var1.field_1404;
      }

   }

   public int getChangingConfigurations() {
      return this.field_1403;
   }

   public Drawable newDrawable() {
      return new class_511(this);
   }
}
