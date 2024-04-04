package android.support.v4.view;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.Build.VERSION;
import android.support.v4.d.class_280;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ViewPager extends ViewGroup {
   // $FF: renamed from: a int[]
   private static final int[] field_2248 = new int[]{16842931};
   // $FF: renamed from: b java.util.Comparator
   private static final Comparator field_2249 = new class_105();
   // $FF: renamed from: c android.view.animation.Interpolator
   private static final Interpolator field_2250 = new class_89();
   // $FF: renamed from: A boolean
   private boolean field_2251;
   // $FF: renamed from: B int
   private int field_2252;
   // $FF: renamed from: C int
   private int field_2253;
   // $FF: renamed from: D int
   private int field_2254;
   // $FF: renamed from: E float
   private float field_2255;
   // $FF: renamed from: F float
   private float field_2256;
   // $FF: renamed from: G float
   private float field_2257;
   // $FF: renamed from: H int
   private int field_2258;
   // $FF: renamed from: I android.view.VelocityTracker
   private VelocityTracker field_2259;
   // $FF: renamed from: J int
   private int field_2260;
   // $FF: renamed from: K int
   private int field_2261;
   // $FF: renamed from: L int
   private int field_2262;
   // $FF: renamed from: M int
   private int field_2263;
   // $FF: renamed from: N boolean
   private boolean field_2264;
   // $FF: renamed from: O android.support.v4.d.a
   private class_280 field_2265;
   // $FF: renamed from: P android.support.v4.d.a
   private class_280 field_2266;
   // $FF: renamed from: Q boolean
   private boolean field_2267;
   // $FF: renamed from: R boolean
   private boolean field_2268;
   // $FF: renamed from: S boolean
   private boolean field_2269;
   // $FF: renamed from: T int
   private int field_2270;
   // $FF: renamed from: U android.support.v4.view.am
   private class_0 field_2271;
   // $FF: renamed from: V android.support.v4.view.am
   private class_0 field_2272;
   // $FF: renamed from: W android.support.v4.view.al
   private class_1 field_2273;
   // $FF: renamed from: Z int
   private int field_2274;
   // $FF: renamed from: d java.util.ArrayList
   private final ArrayList field_2275;
   // $FF: renamed from: e android.support.v4.view.aj
   private final class_88 field_2276;
   // $FF: renamed from: f android.graphics.Rect
   private final Rect field_2277;
   // $FF: renamed from: g android.support.v4.view.k
   private class_253 field_2278;
   // $FF: renamed from: h int
   private int field_2279;
   // $FF: renamed from: i int
   private int field_2280;
   // $FF: renamed from: j android.os.Parcelable
   private Parcelable field_2281;
   // $FF: renamed from: k java.lang.ClassLoader
   private ClassLoader field_2282;
   // $FF: renamed from: l android.widget.Scroller
   private Scroller field_2283;
   // $FF: renamed from: m android.support.v4.view.an
   private class_84 field_2284;
   // $FF: renamed from: n int
   private int field_2285;
   // $FF: renamed from: o android.graphics.drawable.Drawable
   private Drawable field_2286;
   // $FF: renamed from: p int
   private int field_2287;
   // $FF: renamed from: q int
   private int field_2288;
   // $FF: renamed from: r float
   private float field_2289;
   // $FF: renamed from: s float
   private float field_2290;
   // $FF: renamed from: t int
   private int field_2291;
   // $FF: renamed from: u int
   private int field_2292;
   // $FF: renamed from: v boolean
   private boolean field_2293;
   // $FF: renamed from: w boolean
   private boolean field_2294;
   // $FF: renamed from: x boolean
   private boolean field_2295;
   // $FF: renamed from: y int
   private int field_2296;
   // $FF: renamed from: z boolean
   private boolean field_2297;

   // $FF: renamed from: a (int, float, int, int) int
   private int method_2171(int var1, float var2, int var3, int var4) {
      if (Math.abs(var4) > this.field_2262 && Math.abs(var3) > this.field_2260) {
         if (var3 <= 0) {
            ++var1;
         }
      } else {
         var1 = (int)((float)var1 + var2 + 0.5F);
      }

      var3 = var1;
      if (this.field_2275.size() > 0) {
         class_88 var5 = (class_88)this.field_2275.get(0);
         class_88 var6 = (class_88)this.field_2275.get(this.field_2275.size() - 1);
         var3 = Math.max(var5.field_77, Math.min(var1, var6.field_77));
      }

      return var3;
   }

   // $FF: renamed from: a (android.graphics.Rect, android.view.View) android.graphics.Rect
   private Rect method_2172(Rect var1, View var2) {
      if (var1 == null) {
         var1 = new Rect();
      }

      if (var2 == null) {
         var1.set(0, 0, 0, 0);
         return var1;
      } else {
         var1.left = var2.getLeft();
         var1.right = var2.getRight();
         var1.top = var2.getTop();
         var1.bottom = var2.getBottom();

         ViewGroup var4;
         for(ViewParent var3 = var2.getParent(); var3 instanceof ViewGroup && var3 != this; var3 = var4.getParent()) {
            var4 = (ViewGroup)var3;
            var1.left += var4.getLeft();
            var1.right += var4.getRight();
            var1.top += var4.getTop();
            var1.bottom += var4.getBottom();
         }

         return var1;
      }
   }

   // $FF: renamed from: a (int, int, int, int) void
   private void method_2173(int var1, int var2, int var3, int var4) {
      float var5;
      class_88 var6;
      if (var2 > 0 && !this.field_2275.isEmpty()) {
         var5 = (float)this.getScrollX() / (float)(var2 + var4);
         var2 = (int)((float)(var1 + var3) * var5);
         this.scrollTo(var2, this.getScrollY());
         if (!this.field_2283.isFinished()) {
            var3 = this.field_2283.getDuration();
            var4 = this.field_2283.timePassed();
            var6 = this.method_2196(this.field_2279);
            this.field_2283.startScroll(var2, 0, (int)(var6.field_80 * (float)var1), 0, var3 - var4);
         }
      } else {
         var6 = this.method_2196(this.field_2279);
         if (var6 != null) {
            var5 = Math.min(var6.field_80, this.field_2290);
         } else {
            var5 = 0.0F;
         }

         var1 = (int)(var5 * (float)var1);
         if (var1 != this.getScrollX()) {
            this.method_2181();
            this.scrollTo(var1, this.getScrollY());
            return;
         }
      }

   }

   // $FF: renamed from: a (android.support.v4.view.aj, int, android.support.v4.view.aj) void
   private void method_2174(class_88 var1, int var2, class_88 var3) {
      int var10 = this.field_2278.method_916();
      int var7 = this.getWidth();
      float var5;
      if (var7 > 0) {
         var5 = (float)this.field_2285 / (float)var7;
      } else {
         var5 = 0.0F;
      }

      float var4;
      float var6;
      int var8;
      int var9;
      if (var3 != null) {
         var7 = var3.field_77;
         if (var7 < var1.field_77) {
            var4 = var3.field_80 + var3.field_79 + var5;
            ++var7;

            for(var8 = 0; var7 <= var1.field_77 && var8 < this.field_2275.size(); var7 = var9 + 1) {
               var3 = (class_88)this.field_2275.get(var8);

               while(true) {
                  var9 = var7;
                  var6 = var4;
                  if (var7 <= var3.field_77) {
                     break;
                  }

                  var9 = var7;
                  var6 = var4;
                  if (var8 >= this.field_2275.size() - 1) {
                     break;
                  }

                  ++var8;
                  var3 = (class_88)this.field_2275.get(var8);
               }

               while(var9 < var3.field_77) {
                  var6 += this.field_2278.method_915(var9) + var5;
                  ++var9;
               }

               var3.field_80 = var6;
               var4 = var6 + var3.field_79 + var5;
            }
         } else if (var7 > var1.field_77) {
            var8 = this.field_2275.size() - 1;
            var4 = var3.field_80;
            --var7;

            while(var7 >= var1.field_77 && var8 >= 0) {
               var3 = (class_88)this.field_2275.get(var8);

               while(true) {
                  var9 = var7;
                  var6 = var4;
                  if (var7 >= var3.field_77) {
                     break;
                  }

                  var9 = var7;
                  var6 = var4;
                  if (var8 <= 0) {
                     break;
                  }

                  --var8;
                  var3 = (class_88)this.field_2275.get(var8);
               }

               while(var9 > var3.field_77) {
                  var6 -= this.field_2278.method_915(var9) + var5;
                  --var9;
               }

               var4 = var6 - (var3.field_79 + var5);
               var3.field_80 = var4;
               var7 = var9 - 1;
            }
         }
      }

      var9 = this.field_2275.size();
      var6 = var1.field_80;
      var7 = var1.field_77 - 1;
      if (var1.field_77 == 0) {
         var4 = var1.field_80;
      } else {
         var4 = -3.4028235E38F;
      }

      this.field_2289 = var4;
      if (var1.field_77 == var10 - 1) {
         var4 = var1.field_80 + var1.field_79 - 1.0F;
      } else {
         var4 = Float.MAX_VALUE;
      }

      this.field_2290 = var4;
      var8 = var2 - 1;

      for(var4 = var6; var8 >= 0; --var8) {
         for(var3 = (class_88)this.field_2275.get(var8); var7 > var3.field_77; --var7) {
            var4 -= this.field_2278.method_915(var7) + var5;
         }

         var4 -= var3.field_79 + var5;
         var3.field_80 = var4;
         if (var3.field_77 == 0) {
            this.field_2289 = var4;
         }

         --var7;
      }

      var4 = var1.field_80 + var1.field_79 + var5;
      var8 = var1.field_77 + 1;
      var7 = var2 + 1;

      for(var2 = var8; var7 < var9; ++var7) {
         for(var1 = (class_88)this.field_2275.get(var7); var2 < var1.field_77; ++var2) {
            var4 += this.field_2278.method_915(var2) + var5;
         }

         if (var1.field_77 == var10 - 1) {
            this.field_2290 = var1.field_79 + var4 - 1.0F;
         }

         var1.field_80 = var4;
         var4 += var1.field_79 + var5;
         ++var2;
      }

      this.field_2268 = false;
   }

   // $FF: renamed from: a (android.view.MotionEvent) void
   private void method_2175(MotionEvent var1) {
      int var2 = class_274.method_953(var1);
      if (class_274.method_955(var1, var2) == this.field_2258) {
         byte var3;
         if (var2 == 0) {
            var3 = 1;
         } else {
            var3 = 0;
         }

         this.field_2256 = class_274.method_956(var1, var3);
         this.field_2258 = class_274.method_955(var1, var3);
         if (this.field_2259 != null) {
            this.field_2259.clear();
         }
      }

   }

   // $FF: renamed from: a (float, float) boolean
   private boolean method_2176(float var1, float var2) {
      return var1 < (float)this.field_2253 && var2 > 0.0F || var1 > (float)(this.getWidth() - this.field_2253) && var2 < 0.0F;
   }

   // $FF: renamed from: b (float) boolean
   private boolean method_2177(float var1) {
      boolean var6 = true;
      boolean var9 = false;
      boolean var8 = false;
      float var2 = this.field_2256;
      this.field_2256 = var1;
      float var3 = (float)this.getScrollX() + (var2 - var1);
      int var7 = this.getWidth();
      var1 = (float)var7 * this.field_2289;
      var2 = (float)var7;
      float var4 = this.field_2290;
      class_88 var10 = (class_88)this.field_2275.get(0);
      class_88 var11 = (class_88)this.field_2275.get(this.field_2275.size() - 1);
      boolean var5;
      if (var10.field_77 != 0) {
         var1 = var10.field_80 * (float)var7;
         var5 = false;
      } else {
         var5 = true;
      }

      if (var11.field_77 != this.field_2278.method_916() - 1) {
         var2 = var11.field_80 * (float)var7;
         var6 = false;
      } else {
         var2 *= var4;
      }

      if (var3 < var1) {
         var2 = var1;
         if (var5) {
            var8 = this.field_2265.method_969(Math.abs(var1 - var3) / (float)var7);
            var2 = var1;
         }
      } else if (var3 > var2) {
         var8 = var9;
         if (var6) {
            var8 = this.field_2266.method_969(Math.abs(var3 - var2) / (float)var7);
         }
      } else {
         var2 = var3;
      }

      this.field_2256 += var2 - (float)((int)var2);
      this.scrollTo((int)var2, this.getScrollY());
      this.method_2178((int)var2);
      return var8;
   }

   // $FF: renamed from: d (int) boolean
   private boolean method_2178(int var1) {
      boolean var6 = false;
      if (this.field_2275.size() == 0) {
         this.field_2269 = false;
         this.method_2189(0, 0.0F, 0);
         if (!this.field_2269) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
         }
      } else {
         class_88 var7 = this.method_2182();
         int var4 = this.getWidth();
         int var5 = this.field_2285;
         float var2 = (float)this.field_2285 / (float)var4;
         int var3 = var7.field_77;
         var2 = ((float)var1 / (float)var4 - var7.field_80) / (var7.field_79 + var2);
         var1 = (int)((float)(var5 + var4) * var2);
         this.field_2269 = false;
         this.method_2189(var3, var2, var1);
         if (!this.field_2269) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
         }

         var6 = true;
      }

      return var6;
   }

   // $FF: renamed from: e () int[]
   // $FF: synthetic method
   static int[] method_2179() {
      return field_2248;
   }

   // $FF: renamed from: f () void
   private void method_2180() {
      int var2;
      for(int var1 = 0; var1 < this.getChildCount(); var1 = var2 + 1) {
         var2 = var1;
         if (!((class_87)this.getChildAt(var1).getLayoutParams()).field_60) {
            this.removeViewAt(var1);
            var2 = var1 - 1;
         }
      }

   }

   // $FF: renamed from: g () void
   private void method_2181() {
      boolean var1;
      if (this.field_2274 == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      if (var1) {
         this.setScrollingCacheEnabled(false);
         this.field_2283.abortAnimation();
         int var2 = this.getScrollX();
         int var3 = this.getScrollY();
         int var4 = this.field_2283.getCurrX();
         int var5 = this.field_2283.getCurrY();
         if (var2 != var4 || var3 != var5) {
            this.scrollTo(var4, var5);
         }

         this.setScrollState(0);
      }

      this.field_2295 = false;
      byte var9 = 0;
      boolean var8 = var1;

      for(int var7 = var9; var7 < this.field_2275.size(); ++var7) {
         class_88 var6 = (class_88)this.field_2275.get(var7);
         if (var6.field_78) {
            var6.field_78 = false;
            var8 = true;
         }
      }

      if (var8) {
         this.method_2198();
      }

   }

   // $FF: renamed from: h () android.support.v4.view.aj
   private class_88 method_2182() {
      int var5 = this.getWidth();
      float var1;
      if (var5 > 0) {
         var1 = (float)this.getScrollX() / (float)var5;
      } else {
         var1 = 0.0F;
      }

      float var2;
      if (var5 > 0) {
         var2 = (float)this.field_2285 / (float)var5;
      } else {
         var2 = 0.0F;
      }

      float var4 = 0.0F;
      float var3 = 0.0F;
      int var7 = -1;
      var5 = 0;
      boolean var6 = true;
      class_88 var9 = null;

      class_88 var10;
      while(true) {
         var10 = var9;
         if (var5 >= this.field_2275.size()) {
            break;
         }

         class_88 var8 = (class_88)this.field_2275.get(var5);
         if (!var6 && var8.field_77 != var7 + 1) {
            var8 = this.field_2276;
            var8.field_80 = var4 + var3 + var2;
            var8.field_77 = var7 + 1;
            var8.field_79 = this.field_2278.method_915(var8.field_77);
            --var5;
         }

         var3 = var8.field_80;
         var4 = var8.field_79;
         if (!var6) {
            var10 = var9;
            if (var1 < var3) {
               break;
            }
         }

         if (var1 < var4 + var3 + var2 || var5 == this.field_2275.size() - 1) {
            var10 = var8;
            break;
         }

         var7 = var8.field_77;
         var4 = var8.field_79;
         var6 = false;
         ++var5;
         var9 = var8;
      }

      return var10;
   }

   // $FF: renamed from: i () void
   private void method_2183() {
      this.field_2297 = false;
      this.field_2251 = false;
      if (this.field_2259 != null) {
         this.field_2259.recycle();
         this.field_2259 = null;
      }

   }

   private void setScrollState(int var1) {
      if (this.field_2274 != var1) {
         this.field_2274 = var1;
         if (this.field_2271 != null) {
            this.field_2271.method_2(var1);
            return;
         }
      }

   }

   private void setScrollingCacheEnabled(boolean var1) {
      if (this.field_2294 != var1) {
         this.field_2294 = var1;
      }

   }

   // $FF: renamed from: a (float) float
   float method_2184(float var1) {
      return (float)Math.sin((double)((float)((double)(var1 - 0.5F) * 0.4712389167638204D)));
   }

   // $FF: renamed from: a (int, int) android.support.v4.view.aj
   class_88 method_2185(int var1, int var2) {
      class_88 var3 = new class_88();
      var3.field_77 = var1;
      var3.field_76 = this.field_2278.method_919(this, var1);
      var3.field_79 = this.field_2278.method_915(var1);
      if (var2 >= 0 && var2 < this.field_2275.size()) {
         this.field_2275.add(var2, var3);
         return var3;
      } else {
         this.field_2275.add(var3);
         return var3;
      }
   }

   // $FF: renamed from: a (android.view.View) android.support.v4.view.aj
   class_88 method_2186(View var1) {
      for(int var2 = 0; var2 < this.field_2275.size(); ++var2) {
         class_88 var3 = (class_88)this.field_2275.get(var2);
         if (this.field_2278.method_926(var1, var3.field_76)) {
            return var3;
         }
      }

      return null;
   }

   // $FF: renamed from: a () void
   void method_2187() {
      boolean var1;
      if (this.field_2275.size() < this.field_2296 * 2 + 1 && this.field_2275.size() < this.field_2278.method_916()) {
         var1 = true;
      } else {
         var1 = false;
      }

      int var2 = this.field_2279;
      boolean var3 = false;
      byte var5 = 0;
      boolean var4 = var1;
      int var8 = var2;
      boolean var9 = var3;

      int var10;
      for(var10 = var5; var10 < this.field_2275.size(); var4 = var3) {
         class_88 var7 = (class_88)this.field_2275.get(var10);
         int var12 = this.field_2278.method_917(var7.field_76);
         int var11;
         if (var12 == -1) {
            var3 = var4;
            var2 = var8;
            var1 = var9;
            var11 = var10;
         } else if (var12 == -2) {
            this.field_2275.remove(var10);
            var11 = var10 - 1;
            var3 = var9;
            if (!var9) {
               this.field_2278.method_924(this);
               var3 = true;
            }

            this.field_2278.method_925(this, var7.field_77, var7.field_76);
            if (this.field_2279 == var7.field_77) {
               var2 = Math.max(0, Math.min(this.field_2279, this.field_2278.method_916() - 1));
               var1 = var3;
               var3 = true;
            } else {
               var2 = var8;
               boolean var13 = true;
               var1 = var3;
               var3 = var13;
            }
         } else if (var7.field_77 != var12) {
            if (var7.field_77 == this.field_2279) {
               var8 = var12;
            }

            var7.field_77 = var12;
            boolean var6 = true;
            var11 = var10;
            var1 = var9;
            var2 = var8;
            var3 = var6;
         } else {
            var11 = var10;
            var1 = var9;
            var2 = var8;
            var3 = var4;
         }

         var10 = var11 + 1;
         var9 = var1;
         var8 = var2;
      }

      if (var9) {
         this.field_2278.method_931(this);
      }

      Collections.sort(this.field_2275, field_2249);
      if (var4) {
         var10 = this.getChildCount();

         for(var2 = 0; var2 < var10; ++var2) {
            class_87 var15 = (class_87)this.getChildAt(var2).getLayoutParams();
            if (!var15.field_60) {
               var15.field_62 = 0.0F;
            }
         }

         this.method_2192(var8, false, true);
         this.requestLayout();
      }

   }

   // $FF: renamed from: a (int) void
   void method_2188(int var1) {
      class_88 var13;
      if (this.field_2279 != var1) {
         var13 = this.method_2196(this.field_2279);
         this.field_2279 = var1;
      } else {
         var13 = null;
      }

      if (this.field_2278 != null && !this.field_2295 && this.getWindowToken() != null) {
         this.field_2278.method_924(this);
         var1 = this.field_2296;
         int var11 = Math.max(0, this.field_2279 - var1);
         int var9 = this.field_2278.method_916();
         int var10 = Math.min(var9 - 1, var1 + this.field_2279);

         class_88 var12;
         label189: {
            for(var1 = 0; var1 < this.field_2275.size(); ++var1) {
               var12 = (class_88)this.field_2275.get(var1);
               if (var12.field_77 >= this.field_2279) {
                  if (var12.field_77 == this.field_2279) {
                     break label189;
                  }
                  break;
               }
            }

            var12 = null;
         }

         class_88 var14;
         if (var12 == null && var9 > 0) {
            var14 = this.method_2185(this.field_2279, var1);
         } else {
            var14 = var12;
         }

         int var5;
         if (var14 != null) {
            int var8 = var1 - 1;
            if (var8 >= 0) {
               var12 = (class_88)this.field_2275.get(var8);
            } else {
               var12 = null;
            }

            float var4 = var14.field_79;
            var5 = this.field_2279;
            float var3 = 0.0F;
            int var7 = var5 - 1;
            int var6 = var1;

            float var2;
            for(class_88 var15 = var12; var7 >= 0; var6 = var5) {
               if (var3 >= 2.0F - var4 && var7 < var11) {
                  if (var15 == null) {
                     break;
                  }

                  var12 = var15;
                  var1 = var8;
                  var2 = var3;
                  var5 = var6;
                  if (var7 == var15.field_77) {
                     var12 = var15;
                     var1 = var8;
                     var2 = var3;
                     var5 = var6;
                     if (!var15.field_78) {
                        this.field_2275.remove(var8);
                        this.field_2278.method_925(this, var7, var15.field_76);
                        var1 = var8 - 1;
                        var5 = var6 - 1;
                        if (var1 >= 0) {
                           var12 = (class_88)this.field_2275.get(var1);
                           var2 = var3;
                        } else {
                           var12 = null;
                           var2 = var3;
                        }
                     }
                  }
               } else if (var15 != null && var7 == var15.field_77) {
                  var2 = var3 + var15.field_79;
                  var1 = var8 - 1;
                  if (var1 >= 0) {
                     var12 = (class_88)this.field_2275.get(var1);
                     var5 = var6;
                  } else {
                     var12 = null;
                     var5 = var6;
                  }
               } else {
                  var2 = var3 + this.method_2185(var7, var8 + 1).field_79;
                  var5 = var6 + 1;
                  if (var8 >= 0) {
                     var12 = (class_88)this.field_2275.get(var8);
                     var1 = var8;
                  } else {
                     var12 = null;
                     var1 = var8;
                  }
               }

               --var7;
               var15 = var12;
               var8 = var1;
               var3 = var2;
            }

            var2 = var14.field_79;
            var1 = var6 + 1;
            if (var2 < 2.0F) {
               if (var1 < this.field_2275.size()) {
                  var12 = (class_88)this.field_2275.get(var1);
               } else {
                  var12 = null;
               }

               var5 = this.field_2279;
               ++var5;

               for(; var5 < var9; ++var5) {
                  if (var2 >= 2.0F && var5 > var10) {
                     if (var12 == null) {
                        break;
                     }

                     if (var5 == var12.field_77 && !var12.field_78) {
                        this.field_2275.remove(var1);
                        this.field_2278.method_925(this, var5, var12.field_76);
                        if (var1 < this.field_2275.size()) {
                           var12 = (class_88)this.field_2275.get(var1);
                        } else {
                           var12 = null;
                        }
                     }
                  } else if (var12 != null && var5 == var12.field_77) {
                     var3 = var12.field_79;
                     ++var1;
                     if (var1 < this.field_2275.size()) {
                        var12 = (class_88)this.field_2275.get(var1);
                     } else {
                        var12 = null;
                     }

                     var2 += var3;
                  } else {
                     var12 = this.method_2185(var5, var1);
                     ++var1;
                     var3 = var12.field_79;
                     if (var1 < this.field_2275.size()) {
                        var12 = (class_88)this.field_2275.get(var1);
                     } else {
                        var12 = null;
                     }

                     var2 += var3;
                  }
               }
            }

            this.method_2174(var14, var6, var13);
         }

         class_253 var16 = this.field_2278;
         var1 = this.field_2279;
         Object var18;
         if (var14 != null) {
            var18 = var14.field_76;
         } else {
            var18 = null;
         }

         var16.method_932(this, var1, var18);
         this.field_2278.method_931(this);
         var5 = this.getChildCount();

         for(var1 = 0; var1 < var5; ++var1) {
            View var17 = this.getChildAt(var1);
            class_87 var19 = (class_87)var17.getLayoutParams();
            if (!var19.field_60 && var19.field_62 == 0.0F) {
               var13 = this.method_2186(var17);
               if (var13 != null) {
                  var19.field_62 = var13.field_79;
               }
            }
         }

         if (this.hasFocus()) {
            View var20 = this.findFocus();
            if (var20 != null) {
               var12 = this.method_2197(var20);
            } else {
               var12 = null;
            }

            if (var12 == null || var12.field_77 != this.field_2279) {
               for(var1 = 0; var1 < this.getChildCount(); ++var1) {
                  var20 = this.getChildAt(var1);
                  var13 = this.method_2186(var20);
                  if (var13 != null && var13.field_77 == this.field_2279 && var20.requestFocus(2)) {
                     break;
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: a (int, float, int) void
   protected void method_2189(int var1, float var2, int var3) {
      if (this.field_2270 > 0) {
         int var9 = this.getScrollX();
         int var4 = this.getPaddingLeft();
         int var5 = this.getPaddingRight();
         int var10 = this.getWidth();
         int var11 = this.getChildCount();

         int var6;
         for(int var8 = 0; var8 < var11; var5 = var6) {
            View var13 = this.getChildAt(var8);
            class_87 var14 = (class_87)var13.getLayoutParams();
            int var7;
            if (!var14.field_60) {
               var7 = var4;
               var6 = var5;
            } else {
               int var12;
               switch(var14.field_61 & 7) {
               case 1:
                  var6 = Math.max((var10 - var13.getMeasuredWidth()) / 2, var4);
                  var7 = var4;
                  var4 = var5;
                  var5 = var7;
                  break;
               case 2:
               case 4:
               default:
                  var6 = var4;
                  var7 = var5;
                  var5 = var4;
                  var4 = var7;
                  break;
               case 3:
                  var6 = var13.getWidth();
                  var7 = var6 + var4;
                  var6 = var4;
                  var4 = var5;
                  var5 = var7;
                  break;
               case 5:
                  var6 = var10 - var5 - var13.getMeasuredWidth();
                  var12 = var13.getMeasuredWidth();
                  var7 = var4;
                  var4 = var5 + var12;
                  var5 = var7;
               }

               var12 = var6 + var9 - var13.getLeft();
               var6 = var4;
               var7 = var5;
               if (var12 != 0) {
                  var13.offsetLeftAndRight(var12);
                  var6 = var4;
                  var7 = var5;
               }
            }

            ++var8;
            var4 = var7;
         }
      }

      if (this.field_2271 != null) {
         this.field_2271.method_1(var1, var2, var3);
      }

      if (this.field_2272 != null) {
         this.field_2272.method_1(var1, var2, var3);
      }

      this.field_2269 = true;
   }

   // $FF: renamed from: a (int, int, int) void
   void method_2190(int var1, int var2, int var3) {
      if (this.getChildCount() == 0) {
         this.setScrollingCacheEnabled(false);
      } else {
         int var7 = this.getScrollX();
         int var8 = this.getScrollY();
         int var9 = var1 - var7;
         var2 -= var8;
         if (var9 == 0 && var2 == 0) {
            this.method_2181();
            this.method_2198();
            this.setScrollState(0);
         } else {
            this.setScrollingCacheEnabled(true);
            this.setScrollState(2);
            var1 = this.getWidth();
            int var10 = var1 / 2;
            float var6 = Math.min(1.0F, (float)Math.abs(var9) * 1.0F / (float)var1);
            float var4 = (float)var10;
            float var5 = (float)var10;
            var6 = this.method_2184(var6);
            var3 = Math.abs(var3);
            if (var3 > 0) {
               var1 = Math.round(1000.0F * Math.abs((var5 * var6 + var4) / (float)var3)) * 4;
            } else {
               var4 = (float)var1;
               var5 = this.field_2278.method_915(this.field_2279);
               var1 = (int)(((float)Math.abs(var9) / (var4 * var5 + (float)this.field_2285) + 1.0F) * 100.0F);
            }

            var1 = Math.min(var1, 600);
            this.field_2283.startScroll(var7, var8, var9, var2, var1);
            class_265.method_950(this);
         }
      }
   }

   // $FF: renamed from: a (int, boolean) void
   public void method_2191(int var1, boolean var2) {
      this.field_2295 = false;
      this.method_2192(var1, var2, false);
   }

   // $FF: renamed from: a (int, boolean, boolean) void
   void method_2192(int var1, boolean var2, boolean var3) {
      this.method_2193(var1, var2, var3, 0);
   }

   // $FF: renamed from: a (int, boolean, boolean, int) void
   void method_2193(int var1, boolean var2, boolean var3, int var4) {
      if (this.field_2278 != null && this.field_2278.method_916() > 0) {
         if (!var3 && this.field_2279 == var1 && this.field_2275.size() != 0) {
            this.setScrollingCacheEnabled(false);
            return;
         }

         int var6;
         if (var1 < 0) {
            var6 = 0;
         } else {
            var6 = var1;
            if (var1 >= this.field_2278.method_916()) {
               var6 = this.field_2278.method_916() - 1;
            }
         }

         var1 = this.field_2296;
         if (var6 > this.field_2279 + var1 || var6 < this.field_2279 - var1) {
            for(var1 = 0; var1 < this.field_2275.size(); ++var1) {
               ((class_88)this.field_2275.get(var1)).field_78 = true;
            }
         }

         boolean var9;
         if (this.field_2279 != var6) {
            var9 = true;
         } else {
            var9 = false;
         }

         this.method_2188(var6);
         class_88 var8 = this.method_2196(var6);
         int var7;
         if (var8 != null) {
            float var5 = (float)this.getWidth();
            var7 = (int)(Math.max(this.field_2289, Math.min(var8.field_80, this.field_2290)) * var5);
         } else {
            var7 = 0;
         }

         if (!var2) {
            if (var9 && this.field_2271 != null) {
               this.field_2271.method_0(var6);
            }

            if (var9 && this.field_2272 != null) {
               this.field_2272.method_0(var6);
            }

            this.method_2181();
            this.scrollTo(var7, 0);
            return;
         }

         this.method_2190(var7, 0, var4);
         if (var9 && this.field_2271 != null) {
            this.field_2271.method_0(var6);
         }

         if (var9 && this.field_2272 != null) {
            this.field_2272.method_0(var6);
            return;
         }
      } else {
         this.setScrollingCacheEnabled(false);
      }

   }

   // $FF: renamed from: a (android.view.KeyEvent) boolean
   public boolean method_2194(KeyEvent var1) {
      if (var1.getAction() == 0) {
         switch(var1.getKeyCode()) {
         case 21:
            return this.method_2200(17);
         case 22:
            return this.method_2200(66);
         case 61:
            if (VERSION.SDK_INT >= 11) {
               if (class_279.method_965(var1)) {
                  return this.method_2200(2);
               }

               if (class_279.method_966(var1, 1)) {
                  return this.method_2200(1);
               }
            }
         }
      }

      return false;
   }

   // $FF: renamed from: a (android.view.View, boolean, int, int, int) boolean
   protected boolean method_2195(View var1, boolean var2, int var3, int var4, int var5) {
      if (var1 instanceof ViewGroup) {
         ViewGroup var9 = (ViewGroup)var1;
         int var7 = var1.getScrollX();
         int var8 = var1.getScrollY();

         for(int var6 = var9.getChildCount() - 1; var6 >= 0; --var6) {
            View var10 = var9.getChildAt(var6);
            if (var4 + var7 >= var10.getLeft() && var4 + var7 < var10.getRight() && var5 + var8 >= var10.getTop() && var5 + var8 < var10.getBottom() && this.method_2195(var10, true, var3, var4 + var7 - var10.getLeft(), var5 + var8 - var10.getTop())) {
               return true;
            }
         }
      }

      if (!var2 || !class_265.method_949(var1, -var3)) {
         return false;
      } else {
         return true;
      }
   }

   public void addFocusables(ArrayList var1, int var2, int var3) {
      int var5 = var1.size();
      int var6 = this.getDescendantFocusability();
      if (var6 != 393216) {
         for(int var4 = 0; var4 < this.getChildCount(); ++var4) {
            View var7 = this.getChildAt(var4);
            if (var7.getVisibility() == 0) {
               class_88 var8 = this.method_2186(var7);
               if (var8 != null && var8.field_77 == this.field_2279) {
                  var7.addFocusables(var1, var2, var3);
               }
            }
         }
      }

      if ((var6 != 262144 || var5 == var1.size()) && this.isFocusable() && ((var3 & 1) != 1 || !this.isInTouchMode() || this.isFocusableInTouchMode()) && var1 != null) {
         var1.add(this);
      }
   }

   public void addTouchables(ArrayList var1) {
      for(int var2 = 0; var2 < this.getChildCount(); ++var2) {
         View var3 = this.getChildAt(var2);
         if (var3.getVisibility() == 0) {
            class_88 var4 = this.method_2186(var3);
            if (var4 != null && var4.field_77 == this.field_2279) {
               var3.addTouchables(var1);
            }
         }
      }

   }

   public void addView(View var1, int var2, LayoutParams var3) {
      if (!this.checkLayoutParams(var3)) {
         var3 = this.generateLayoutParams(var3);
      }

      class_87 var4 = (class_87)var3;
      var4.field_60 |= var1 instanceof class_2;
      if (this.field_2293) {
         if (var4 != null && var4.field_60) {
            throw new IllegalStateException("Cannot add pager decor view during layout");
         } else {
            var4.field_63 = true;
            this.addViewInLayout(var1, var2, var3);
         }
      } else {
         super.addView(var1, var2, var3);
      }
   }

   // $FF: renamed from: b (int) android.support.v4.view.aj
   class_88 method_2196(int var1) {
      for(int var2 = 0; var2 < this.field_2275.size(); ++var2) {
         class_88 var3 = (class_88)this.field_2275.get(var2);
         if (var3.field_77 == var1) {
            return var3;
         }
      }

      return null;
   }

   // $FF: renamed from: b (android.view.View) android.support.v4.view.aj
   class_88 method_2197(View var1) {
      while(true) {
         ViewParent var2 = var1.getParent();
         if (var2 != this) {
            if (var2 != null && var2 instanceof View) {
               var1 = (View)var2;
               continue;
            }

            return null;
         }

         return this.method_2186(var1);
      }
   }

   // $FF: renamed from: b () void
   void method_2198() {
      this.method_2188(this.field_2279);
   }

   // $FF: renamed from: c () boolean
   boolean method_2199() {
      if (this.field_2279 > 0) {
         this.method_2191(this.field_2279 - 1, true);
         return true;
      } else {
         return false;
      }
   }

   // $FF: renamed from: c (int) boolean
   public boolean method_2200(int var1) {
      View var6 = this.findFocus();
      View var5 = var6;
      if (var6 == this) {
         var5 = null;
      }

      boolean var4;
      label64: {
         var6 = FocusFinder.getInstance().findNextFocus(this, var5, var1);
         if (var6 != null && var6 != var5) {
            int var2;
            int var3;
            if (var1 == 17) {
               var2 = this.method_2172(this.field_2277, var6).left;
               var3 = this.method_2172(this.field_2277, var5).left;
               if (var5 != null && var2 >= var3) {
                  var4 = this.method_2199();
               } else {
                  var4 = var6.requestFocus();
               }
               break label64;
            }

            if (var1 == 66) {
               var2 = this.method_2172(this.field_2277, var6).left;
               var3 = this.method_2172(this.field_2277, var5).left;
               if (var5 != null && var2 <= var3) {
                  var4 = this.method_2201();
               } else {
                  var4 = var6.requestFocus();
               }
               break label64;
            }
         } else {
            if (var1 == 17 || var1 == 1) {
               var4 = this.method_2199();
               break label64;
            }

            if (var1 == 66 || var1 == 2) {
               var4 = this.method_2201();
               break label64;
            }
         }

         var4 = false;
      }

      if (var4) {
         this.playSoundEffect(SoundEffectConstants.getContantForFocusDirection(var1));
      }

      return var4;
   }

   protected boolean checkLayoutParams(LayoutParams var1) {
      return var1 instanceof class_87 && super.checkLayoutParams(var1);
   }

   public void computeScroll() {
      if (!this.field_2283.isFinished() && this.field_2283.computeScrollOffset()) {
         int var1 = this.getScrollX();
         int var2 = this.getScrollY();
         int var3 = this.field_2283.getCurrX();
         int var4 = this.field_2283.getCurrY();
         if (var1 != var3 || var2 != var4) {
            this.scrollTo(var3, var4);
            if (!this.method_2178(var3)) {
               this.field_2283.abortAnimation();
               this.scrollTo(0, var4);
            }
         }

         class_265.method_950(this);
      } else {
         this.method_2181();
      }
   }

   // $FF: renamed from: d () boolean
   boolean method_2201() {
      if (this.field_2278 != null && this.field_2279 < this.field_2278.method_916() - 1) {
         this.method_2191(this.field_2279 + 1, true);
         return true;
      } else {
         return false;
      }
   }

   public boolean dispatchKeyEvent(KeyEvent var1) {
      return super.dispatchKeyEvent(var1) || this.method_2194(var1);
   }

   public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent var1) {
      boolean var5 = false;
      int var3 = this.getChildCount();
      int var2 = 0;

      boolean var4;
      while(true) {
         var4 = var5;
         if (var2 >= var3) {
            break;
         }

         View var6 = this.getChildAt(var2);
         if (var6.getVisibility() == 0) {
            class_88 var7 = this.method_2186(var6);
            if (var7 != null && var7.field_77 == this.field_2279 && var6.dispatchPopulateAccessibilityEvent(var1)) {
               var4 = true;
               break;
            }
         }

         ++var2;
      }

      return var4;
   }

   public void draw(Canvas var1) {
      super.draw(var1);
      boolean var3 = false;
      boolean var2 = false;
      int var4 = class_265.method_948(this);
      if (var4 != 0 && (var4 != 1 || this.field_2278 == null || this.field_2278.method_916() <= 1)) {
         this.field_2265.method_971();
         this.field_2266.method_971();
      } else {
         int var9;
         if (!this.field_2265.method_968()) {
            var9 = var1.save();
            int var8 = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
            var4 = this.getWidth();
            var1.rotate(270.0F);
            var1.translate((float)(-var8 + this.getPaddingTop()), this.field_2289 * (float)var4);
            this.field_2265.method_967(var8, var4);
            var2 = false | this.field_2265.method_970(var1);
            var1.restoreToCount(var9);
         }

         var3 = var2;
         if (!this.field_2266.method_968()) {
            var4 = var1.save();
            var9 = this.getWidth();
            int var5 = this.getHeight();
            int var6 = this.getPaddingTop();
            int var7 = this.getPaddingBottom();
            var1.rotate(90.0F);
            var1.translate((float)(-this.getPaddingTop()), -(this.field_2290 + 1.0F) * (float)var9);
            this.field_2266.method_967(var5 - var6 - var7, var9);
            var3 = var2 | this.field_2266.method_970(var1);
            var1.restoreToCount(var4);
         }
      }

      if (var3) {
         class_265.method_950(this);
      }

   }

   protected void drawableStateChanged() {
      super.drawableStateChanged();
      Drawable var1 = this.field_2286;
      if (var1 != null && var1.isStateful()) {
         var1.setState(this.getDrawableState());
      }

   }

   protected LayoutParams generateDefaultLayoutParams() {
      return new class_87();
   }

   public LayoutParams generateLayoutParams(AttributeSet var1) {
      return new class_87(this.getContext(), var1);
   }

   protected LayoutParams generateLayoutParams(LayoutParams var1) {
      return this.generateDefaultLayoutParams();
   }

   public class_253 getAdapter() {
      return this.field_2278;
   }

   public int getCurrentItem() {
      return this.field_2279;
   }

   public int getOffscreenPageLimit() {
      return this.field_2296;
   }

   public int getPageMargin() {
      return this.field_2285;
   }

   protected void onAttachedToWindow() {
      super.onAttachedToWindow();
      this.field_2267 = true;
   }

   protected void onDraw(Canvas var1) {
      super.onDraw(var1);
      if (this.field_2285 > 0 && this.field_2286 != null && this.field_2275.size() > 0 && this.field_2278 != null) {
         int var8 = this.getScrollX();
         int var9 = this.getWidth();
         float var4 = (float)this.field_2285 / (float)var9;
         class_88 var12 = (class_88)this.field_2275.get(0);
         float var2 = var12.field_80;
         int var10 = this.field_2275.size();
         int var6 = var12.field_77;
         int var11 = ((class_88)this.field_2275.get(var10 - 1)).field_77;

         for(int var7 = 0; var6 < var11; ++var6) {
            while(var6 > var12.field_77 && var7 < var10) {
               ArrayList var13 = this.field_2275;
               ++var7;
               var12 = (class_88)var13.get(var7);
            }

            float var3;
            if (var6 == var12.field_77) {
               var3 = (var12.field_80 + var12.field_79) * (float)var9;
               var2 = var12.field_80 + var12.field_79 + var4;
            } else {
               float var5 = this.field_2278.method_915(var6);
               var3 = (var2 + var5) * (float)var9;
               var2 += var5 + var4;
            }

            if ((float)this.field_2285 + var3 > (float)var8) {
               this.field_2286.setBounds((int)var3, this.field_2287, (int)((float)this.field_2285 + var3 + 0.5F), this.field_2288);
               this.field_2286.draw(var1);
            }

            if (var3 > (float)(var8 + var9)) {
               break;
            }
         }
      }

   }

   public boolean onInterceptTouchEvent(MotionEvent var1) {
      int var7;
      label79: {
         var7 = var1.getAction() & 255;
         if (var7 != 3 && var7 != 1) {
            if (var7 == 0) {
               break label79;
            }

            if (this.field_2297) {
               return true;
            }

            if (!this.field_2251) {
               break label79;
            }
         } else {
            this.field_2297 = false;
            this.field_2251 = false;
            this.field_2258 = -1;
            if (this.field_2259 != null) {
               this.field_2259.recycle();
               this.field_2259 = null;
            }
         }

         return false;
      }

      float var2;
      switch(var7) {
      case 0:
         var2 = var1.getX();
         this.field_2255 = var2;
         this.field_2256 = var2;
         this.field_2257 = var1.getY();
         this.field_2258 = class_274.method_955(var1, 0);
         this.field_2251 = false;
         this.field_2283.computeScrollOffset();
         if (this.field_2274 == 2 && Math.abs(this.field_2283.getFinalX() - this.field_2283.getCurrX()) > this.field_2263) {
            this.field_2283.abortAnimation();
            this.field_2295 = false;
            this.method_2198();
            this.field_2297 = true;
            this.setScrollState(1);
         } else {
            this.method_2181();
            this.field_2297 = false;
         }
         break;
      case 2:
         var7 = this.field_2258;
         if (var7 != -1) {
            var7 = class_274.method_954(var1, var7);
            float var3 = class_274.method_956(var1, var7);
            var2 = var3 - this.field_2256;
            float var4 = Math.abs(var2);
            float var5 = class_274.method_957(var1, var7);
            float var6 = Math.abs(var5 - this.field_2257);
            if (var2 != 0.0F && !this.method_2176(this.field_2256, var2) && this.method_2195(this, false, (int)var2, (int)var3, (int)var5)) {
               this.field_2256 = var3;
               this.field_2255 = var3;
               this.field_2257 = var5;
               this.field_2251 = true;
               return false;
            }

            if (var4 > (float)this.field_2254 && var4 > var6) {
               this.field_2297 = true;
               this.setScrollState(1);
               if (var2 > 0.0F) {
                  var2 = this.field_2255 + (float)this.field_2254;
               } else {
                  var2 = this.field_2255 - (float)this.field_2254;
               }

               this.field_2256 = var2;
               this.setScrollingCacheEnabled(true);
            } else if (var6 > (float)this.field_2254) {
               this.field_2251 = true;
            }

            if (this.field_2297 && this.method_2177(var3)) {
               class_265.method_950(this);
            }
         }
         break;
      case 6:
         this.method_2175(var1);
      }

      if (this.field_2259 == null) {
         this.field_2259 = VelocityTracker.obtain();
      }

      this.field_2259.addMovement(var1);
      return this.field_2297;
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      this.field_2293 = true;
      this.method_2198();
      this.field_2293 = false;
      int var12 = this.getChildCount();
      int var13 = var4 - var2;
      int var14 = var5 - var3;
      var3 = this.getPaddingLeft();
      var2 = this.getPaddingTop();
      var5 = this.getPaddingRight();
      var4 = this.getPaddingBottom();
      int var15 = this.getScrollX();
      int var8 = 0;

      int var7;
      int var9;
      View var17;
      class_87 var18;
      for(int var10 = 0; var10 < var12; var3 = var9) {
         label49: {
            var17 = this.getChildAt(var10);
            if (var17.getVisibility() != 8) {
               var18 = (class_87)var17.getLayoutParams();
               if (var18.field_60) {
                  var7 = var18.field_61;
                  int var16 = var18.field_61;
                  int var11;
                  switch(var7 & 7) {
                  case 1:
                     var7 = Math.max((var13 - var17.getMeasuredWidth()) / 2, var3);
                     var9 = var3;
                     break;
                  case 2:
                  case 4:
                  default:
                     var7 = var3;
                     var9 = var3;
                     break;
                  case 3:
                     var9 = var17.getMeasuredWidth();
                     var7 = var3;
                     var9 += var3;
                     break;
                  case 5:
                     var9 = var17.getMeasuredWidth();
                     var7 = var5 + var17.getMeasuredWidth();
                     var11 = var13 - var5 - var9;
                     var5 = var7;
                     var9 = var3;
                     var7 = var11;
                  }

                  switch(var16 & 112) {
                  case 16:
                     var11 = Math.max((var14 - var17.getMeasuredHeight()) / 2, var2);
                     var3 = var2;
                     var2 = var4;
                     var4 = var11;
                     break;
                  case 48:
                     var11 = var17.getMeasuredHeight();
                     var3 = var4;
                     var11 += var2;
                     var4 = var2;
                     var2 = var3;
                     var3 = var11;
                     break;
                  case 80:
                     var11 = var14 - var4 - var17.getMeasuredHeight();
                     var16 = var17.getMeasuredHeight();
                     var3 = var2;
                     var2 = var4 + var16;
                     var4 = var11;
                     break;
                  default:
                     var11 = var2;
                     var3 = var2;
                     var2 = var4;
                     var4 = var11;
                  }

                  var7 += var15;
                  var17.layout(var7, var4, var17.getMeasuredWidth() + var7, var17.getMeasuredHeight() + var4);
                  ++var8;
                  var4 = var9;
                  var7 = var2;
                  var2 = var8;
                  break label49;
               }
            }

            var7 = var8;
            var8 = var2;
            var9 = var3;
            var2 = var7;
            var7 = var4;
            var3 = var8;
            var4 = var9;
         }

         ++var10;
         var9 = var4;
         var8 = var2;
         var2 = var3;
         var4 = var7;
      }

      for(var7 = 0; var7 < var12; ++var7) {
         var17 = this.getChildAt(var7);
         if (var17.getVisibility() != 8) {
            var18 = (class_87)var17.getLayoutParams();
            if (!var18.field_60) {
               class_88 var19 = this.method_2186(var17);
               if (var19 != null) {
                  float var6 = (float)var13;
                  var9 = (int)(var19.field_80 * var6) + var3;
                  if (var18.field_63) {
                     var18.field_63 = false;
                     var6 = (float)(var13 - var3 - var5);
                     var17.measure(MeasureSpec.makeMeasureSpec((int)(var18.field_62 * var6), 1073741824), MeasureSpec.makeMeasureSpec(var14 - var2 - var4, 1073741824));
                  }

                  var17.layout(var9, var2, var17.getMeasuredWidth() + var9, var17.getMeasuredHeight() + var2);
               }
            }
         }
      }

      this.field_2287 = var2;
      this.field_2288 = var14 - var4;
      this.field_2270 = var8;
      this.field_2267 = false;
   }

   protected void onMeasure(int var1, int var2) {
      this.setMeasuredDimension(getDefaultSize(0, var1), getDefaultSize(0, var2));
      var1 = this.getMeasuredWidth();
      this.field_2253 = Math.min(var1 / 10, this.field_2252);
      var1 = var1 - this.getPaddingLeft() - this.getPaddingRight();
      var2 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom();
      int var12 = this.getChildCount();

      int var4;
      int var5;
      View var13;
      class_87 var14;
      for(int var6 = 0; var6 < var12; var2 = var5) {
         var13 = this.getChildAt(var6);
         var4 = var1;
         var5 = var2;
         if (var13.getVisibility() != 8) {
            var14 = (class_87)var13.getLayoutParams();
            var4 = var1;
            var5 = var2;
            if (var14 != null) {
               var4 = var1;
               var5 = var2;
               if (var14.field_60) {
                  var4 = var14.field_61 & 7;
                  int var7 = var14.field_61 & 112;
                  int var9 = Integer.MIN_VALUE;
                  var5 = Integer.MIN_VALUE;
                  boolean var15;
                  if (var7 != 48 && var7 != 80) {
                     var15 = false;
                  } else {
                     var15 = true;
                  }

                  boolean var8;
                  if (var4 != 3 && var4 != 5) {
                     var8 = false;
                  } else {
                     var8 = true;
                  }

                  if (var15) {
                     var4 = 1073741824;
                  } else {
                     var4 = var9;
                     if (var8) {
                        var5 = 1073741824;
                        var4 = var9;
                     }
                  }

                  if (var14.width != -2) {
                     var9 = 1073741824;
                     if (var14.width != -1) {
                        var4 = var14.width;
                     } else {
                        var4 = var1;
                     }
                  } else {
                     var9 = var4;
                     var4 = var1;
                  }

                  int var10;
                  label72: {
                     if (var14.height != -2) {
                        var10 = 1073741824;
                        var5 = var10;
                        if (var14.height != -1) {
                           int var11 = var14.height;
                           var5 = var10;
                           var10 = var11;
                           break label72;
                        }
                     }

                     var10 = var2;
                  }

                  var13.measure(MeasureSpec.makeMeasureSpec(var4, var9), MeasureSpec.makeMeasureSpec(var10, var5));
                  if (var15) {
                     var5 = var2 - var13.getMeasuredHeight();
                     var4 = var1;
                  } else {
                     var4 = var1;
                     var5 = var2;
                     if (var8) {
                        var4 = var1 - var13.getMeasuredWidth();
                        var5 = var2;
                     }
                  }
               }
            }
         }

         ++var6;
         var1 = var4;
      }

      this.field_2291 = MeasureSpec.makeMeasureSpec(var1, 1073741824);
      this.field_2292 = MeasureSpec.makeMeasureSpec(var2, 1073741824);
      this.field_2293 = true;
      this.method_2198();
      this.field_2293 = false;
      var4 = this.getChildCount();

      for(var2 = 0; var2 < var4; ++var2) {
         var13 = this.getChildAt(var2);
         if (var13.getVisibility() != 8) {
            var14 = (class_87)var13.getLayoutParams();
            if (var14 == null || !var14.field_60) {
               float var3 = (float)var1;
               var13.measure(MeasureSpec.makeMeasureSpec((int)(var14.field_62 * var3), 1073741824), this.field_2292);
            }
         }
      }

   }

   protected boolean onRequestFocusInDescendants(int var1, Rect var2) {
      byte var5 = -1;
      int var4 = this.getChildCount();
      int var3;
      if ((var1 & 2) != 0) {
         var5 = 1;
         var3 = 0;
      } else {
         var3 = var4 - 1;
         var4 = -1;
      }

      for(; var3 != var4; var3 += var5) {
         View var6 = this.getChildAt(var3);
         if (var6.getVisibility() == 0) {
            class_88 var7 = this.method_2186(var6);
            if (var7 != null && var7.field_77 == this.field_2279 && var6.requestFocus(var1, var2)) {
               return true;
            }
         }
      }

      return false;
   }

   public void onRestoreInstanceState(Parcelable var1) {
      if (!(var1 instanceof ViewPager$SavedState)) {
         super.onRestoreInstanceState(var1);
      } else {
         ViewPager$SavedState var2 = (ViewPager$SavedState)var1;
         super.onRestoreInstanceState(var2.getSuperState());
         if (this.field_2278 != null) {
            this.field_2278.method_921(var2.field_364, var2.field_365);
            this.method_2192(var2.field_363, false, true);
         } else {
            this.field_2280 = var2.field_363;
            this.field_2281 = var2.field_364;
            this.field_2282 = var2.field_365;
         }
      }
   }

   public Parcelable onSaveInstanceState() {
      ViewPager$SavedState var1 = new ViewPager$SavedState(super.onSaveInstanceState());
      var1.field_363 = this.field_2279;
      if (this.field_2278 != null) {
         var1.field_364 = this.field_2278.method_927();
      }

      return var1;
   }

   protected void onSizeChanged(int var1, int var2, int var3, int var4) {
      super.onSizeChanged(var1, var2, var3, var4);
      if (var1 != var3) {
         this.method_2173(var1, var3, this.field_2285, this.field_2285);
      }

   }

   public boolean onTouchEvent(MotionEvent var1) {
      boolean var6 = false;
      if (this.field_2264) {
         return true;
      } else if (var1.getAction() == 0 && var1.getEdgeFlags() != 0) {
         return false;
      } else if (this.field_2278 != null && this.field_2278.method_916() != 0) {
         if (this.field_2259 == null) {
            this.field_2259 = VelocityTracker.obtain();
         }

         this.field_2259.addMovement(var1);
         boolean var5 = var6;
         float var2;
         boolean var8;
         int var10;
         switch(var1.getAction() & 255) {
         case 0:
            this.field_2283.abortAnimation();
            this.field_2295 = false;
            this.method_2198();
            this.field_2297 = true;
            this.setScrollState(1);
            var2 = var1.getX();
            this.field_2255 = var2;
            this.field_2256 = var2;
            this.field_2258 = class_274.method_955(var1, 0);
            var5 = var6;
            break;
         case 1:
            var5 = var6;
            if (this.field_2297) {
               VelocityTracker var9 = this.field_2259;
               var9.computeCurrentVelocity(1000, (float)this.field_2261);
               var10 = (int)class_252.method_914(var9, this.field_2258);
               this.field_2295 = true;
               int var11 = this.getWidth();
               int var7 = this.getScrollX();
               class_88 var12 = this.method_2182();
               this.method_2193(this.method_2171(var12.field_77, ((float)var7 / (float)var11 - var12.field_80) / var12.field_79, var10, (int)(class_274.method_956(var1, class_274.method_954(var1, this.field_2258)) - this.field_2255)), true, true, var10);
               this.field_2258 = -1;
               this.method_2183();
               var8 = this.field_2265.method_972();
               var5 = this.field_2266.method_972() | var8;
            }
            break;
         case 2:
            if (!this.field_2297) {
               var10 = class_274.method_954(var1, this.field_2258);
               var2 = class_274.method_956(var1, var10);
               float var3 = Math.abs(var2 - this.field_2256);
               float var4 = Math.abs(class_274.method_957(var1, var10) - this.field_2257);
               if (var3 > (float)this.field_2254 && var3 > var4) {
                  this.field_2297 = true;
                  if (var2 - this.field_2255 > 0.0F) {
                     var2 = this.field_2255 + (float)this.field_2254;
                  } else {
                     var2 = this.field_2255 - (float)this.field_2254;
                  }

                  this.field_2256 = var2;
                  this.setScrollState(1);
                  this.setScrollingCacheEnabled(true);
               }
            }

            var5 = var6;
            if (this.field_2297) {
               var5 = false | this.method_2177(class_274.method_956(var1, class_274.method_954(var1, this.field_2258)));
            }
            break;
         case 3:
            var5 = var6;
            if (this.field_2297) {
               this.method_2192(this.field_2279, true, true);
               this.field_2258 = -1;
               this.method_2183();
               var8 = this.field_2265.method_972();
               var5 = this.field_2266.method_972() | var8;
            }
         case 4:
            break;
         case 5:
            var10 = class_274.method_953(var1);
            this.field_2256 = class_274.method_956(var1, var10);
            this.field_2258 = class_274.method_955(var1, var10);
            var5 = var6;
            break;
         case 6:
            this.method_2175(var1);
            this.field_2256 = class_274.method_956(var1, class_274.method_954(var1, this.field_2258));
            var5 = var6;
            break;
         default:
            var5 = var6;
         }

         if (var5) {
            class_265.method_950(this);
         }

         return true;
      } else {
         return false;
      }
   }

   public void setAdapter(class_253 var1) {
      if (this.field_2278 != null) {
         this.field_2278.method_928(this.field_2284);
         this.field_2278.method_924(this);

         for(int var2 = 0; var2 < this.field_2275.size(); ++var2) {
            class_88 var3 = (class_88)this.field_2275.get(var2);
            this.field_2278.method_925(this, var3.field_77, var3.field_76);
         }

         this.field_2278.method_931(this);
         this.field_2275.clear();
         this.method_2180();
         this.field_2279 = 0;
         this.scrollTo(0, 0);
      }

      class_253 var4 = this.field_2278;
      this.field_2278 = var1;
      if (this.field_2278 != null) {
         if (this.field_2284 == null) {
            this.field_2284 = new class_84(this, (class_105)null);
         }

         this.field_2278.method_920(this.field_2284);
         this.field_2295 = false;
         this.field_2267 = true;
         if (this.field_2280 >= 0) {
            this.field_2278.method_921(this.field_2281, this.field_2282);
            this.method_2192(this.field_2280, false, true);
            this.field_2280 = -1;
            this.field_2281 = null;
            this.field_2282 = null;
         } else {
            this.method_2198();
         }
      }

      if (this.field_2273 != null && var4 != var1) {
         this.field_2273.method_3(var4, var1);
      }

   }

   public void setCurrentItem(int var1) {
      this.field_2295 = false;
      boolean var2;
      if (!this.field_2267) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.method_2192(var1, var2, false);
   }

   public void setOffscreenPageLimit(int var1) {
      int var2 = var1;
      if (var1 < 1) {
         Log.w("ViewPager", "Requested offscreen page limit " + var1 + " too small; defaulting to " + 1);
         var2 = 1;
      }

      if (var2 != this.field_2296) {
         this.field_2296 = var2;
         this.method_2198();
      }

   }

   void setOnAdapterChangeListener(class_1 var1) {
      this.field_2273 = var1;
   }

   public void setOnPageChangeListener(class_0 var1) {
      this.field_2271 = var1;
   }

   public void setPageMargin(int var1) {
      int var2 = this.field_2285;
      this.field_2285 = var1;
      int var3 = this.getWidth();
      this.method_2173(var3, var3, var1, var2);
      this.requestLayout();
   }

   public void setPageMarginDrawable(int var1) {
      this.setPageMarginDrawable(this.getContext().getResources().getDrawable(var1));
   }

   public void setPageMarginDrawable(Drawable var1) {
      this.field_2286 = var1;
      if (var1 != null) {
         this.refreshDrawableState();
      }

      boolean var2;
      if (var1 == null) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.setWillNotDraw(var2);
      this.invalidate();
   }

   protected boolean verifyDrawable(Drawable var1) {
      return super.verifyDrawable(var1) || var1 == this.field_2286;
   }
}
