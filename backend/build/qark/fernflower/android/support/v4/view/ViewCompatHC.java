package android.support.v4.view;

import android.animation.ValueAnimator;

class ViewCompatHC {
   static long getFrameTime() {
      return ValueAnimator.getFrameDelay();
   }
}
