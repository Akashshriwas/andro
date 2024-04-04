package com.slidemenu.lib;

import android.view.animation.Interpolator;

// $FF: renamed from: com.slidemenu.lib.b
class class_654 implements Interpolator {
   public float getInterpolation(float var1) {
      --var1;
      return var1 * var1 * var1 * var1 * var1 + 1.0F;
   }
}
