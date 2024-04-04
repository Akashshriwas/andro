package com.slidemenu.lib;

import android.graphics.Paint;
import android.util.Log;

// $FF: renamed from: com.slidemenu.lib.k
class class_637 implements Runnable {
   // $FF: renamed from: a com.slidemenu.lib.SlidingMenu
   // $FF: synthetic field
   final SlidingMenu field_2140;
   // $FF: renamed from: b int
   // $FF: synthetic field
   private final int field_2141;

   class_637(SlidingMenu var1, int var2) {
      this.field_2140 = var1;
      this.field_2141 = var2;
   }

   public void run() {
      StringBuilder var2 = new StringBuilder("changing layerType. hardware? ");
      boolean var1;
      if (this.field_2141 == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      Log.v("SlidingMenu", var2.append(var1).toString());
      this.field_2140.getContent().setLayerType(this.field_2141, (Paint)null);
      this.field_2140.getMenu().setLayerType(this.field_2141, (Paint)null);
      if (this.field_2140.getSecondaryMenu() != null) {
         this.field_2140.getSecondaryMenu().setLayerType(this.field_2141, (Paint)null);
      }

   }
}
