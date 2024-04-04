package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.widget.Scroller;

class ScrollerCompat {
   Scroller mScroller;

   ScrollerCompat(Context var1) {
      this.mScroller = new Scroller(var1);
   }

   public static ScrollerCompat from(Context var0) {
      return (ScrollerCompat)(VERSION.SDK_INT >= 14 ? new ScrollerCompat.ScrollerCompatImplIcs(var0) : new ScrollerCompat(var0));
   }

   public void abortAnimation() {
      this.mScroller.abortAnimation();
   }

   public boolean computeScrollOffset() {
      return this.mScroller.computeScrollOffset();
   }

   public void fling(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.mScroller.fling(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public float getCurrVelocity() {
      return 0.0F;
   }

   public int getCurrX() {
      return this.mScroller.getCurrX();
   }

   public int getCurrY() {
      return this.mScroller.getCurrY();
   }

   public int getDuration() {
      return this.mScroller.getDuration();
   }

   public boolean isFinished() {
      return this.mScroller.isFinished();
   }

   public void startScroll(int var1, int var2, int var3, int var4) {
      this.mScroller.startScroll(var1, var2, var3, var4);
   }

   public void startScroll(int var1, int var2, int var3, int var4, int var5) {
      this.mScroller.startScroll(var1, var2, var3, var4, var5);
   }

   static class ScrollerCompatImplIcs extends ScrollerCompat {
      public ScrollerCompatImplIcs(Context var1) {
         super(var1);
      }

      public float getCurrVelocity() {
         return ScrollerCompatIcs.getCurrVelocity(this.mScroller);
      }
   }
}
