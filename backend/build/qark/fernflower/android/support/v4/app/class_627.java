package android.support.v4.app;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

// $FF: renamed from: android.support.v4.app.p
class class_627 implements AnimationListener {
   // $FF: renamed from: a android.support.v4.app.Fragment
   // $FF: synthetic field
   final Fragment field_2127;
   // $FF: renamed from: b android.support.v4.app.m
   // $FF: synthetic field
   final class_613 field_2128;

   class_627(class_613 var1, Fragment var2) {
      this.field_2128 = var1;
      this.field_2127 = var2;
   }

   public void onAnimationEnd(Animation var1) {
      if (this.field_2127.field_408 != null) {
         this.field_2127.field_408 = null;
         this.field_2128.method_1967(this.field_2127, this.field_2127.field_409, 0, 0, false);
      }

   }

   public void onAnimationRepeat(Animation var1) {
   }

   public void onAnimationStart(Animation var1) {
   }
}
