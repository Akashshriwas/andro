package android.support.v4.app;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

// $FF: renamed from: android.support.v4.app.aa
class class_292 extends FrameLayout {
   public class_292(Context var1) {
      super(var1);
   }

   // $FF: renamed from: a (android.view.View) android.view.ViewGroup
   static ViewGroup method_1006(View var0) {
      class_292 var1 = new class_292(var0.getContext());
      LayoutParams var2 = var0.getLayoutParams();
      if (var2 != null) {
         var1.setLayoutParams(var2);
      }

      var0.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
      var1.addView(var0);
      return var1;
   }

   protected void dispatchRestoreInstanceState(SparseArray var1) {
      this.dispatchThawSelfOnly(var1);
   }

   protected void dispatchSaveInstanceState(SparseArray var1) {
      this.dispatchFreezeSelfOnly(var1);
   }
}
