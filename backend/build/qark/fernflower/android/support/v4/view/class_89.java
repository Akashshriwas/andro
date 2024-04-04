package android.support.v4.view;

import android.view.animation.Interpolator;

// $FF: renamed from: android.support.v4.view.ah
final class class_89 implements Interpolator {
   public float getInterpolation(float var1) {
      --var1;
      return var1 * var1 * var1 * var1 * var1 + 1.0F;
   }
}
