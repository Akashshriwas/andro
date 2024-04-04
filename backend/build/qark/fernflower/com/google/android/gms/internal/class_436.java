package com.google.android.gms.internal;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewGroup.LayoutParams;

// $FF: renamed from: com.google.android.gms.internal.cf
final class class_436 {
   // $FF: renamed from: a int
   public final int field_1182;
   // $FF: renamed from: b android.view.ViewGroup.LayoutParams
   public final LayoutParams field_1183;
   // $FF: renamed from: c android.view.ViewGroup
   public final ViewGroup field_1184;

   public class_436(class_473 var1) {
      this.field_1183 = var1.getLayoutParams();
      ViewParent var2 = var1.getParent();
      if (var2 instanceof ViewGroup) {
         this.field_1184 = (ViewGroup)var2;
         this.field_1182 = this.field_1184.indexOfChild(var1);
         this.field_1184.removeView(var1);
         var1.method_1645(true);
      } else {
         throw new class_437("Could not get the parent of the WebView for an overlay.");
      }
   }
}
