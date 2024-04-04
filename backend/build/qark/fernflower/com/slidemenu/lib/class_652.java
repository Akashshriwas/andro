package com.slidemenu.lib;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.class_114;
import android.support.v4.view.class_252;
import android.support.v4.view.class_274;
import android.support.v4.view.class_279;
import android.util.AttributeSet;
import android.util.FloatMath;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: com.slidemenu.lib.a
public class class_652 extends ViewGroup {
   // $FF: renamed from: e android.view.animation.Interpolator
   private static final Interpolator field_2189 = new class_654();
   // $FF: renamed from: A float
   private float field_2190;
   // $FF: renamed from: a int
   protected int field_2191;
   // $FF: renamed from: b android.view.VelocityTracker
   protected VelocityTracker field_2192;
   // $FF: renamed from: c int
   protected int field_2193;
   // $FF: renamed from: d int
   protected int field_2194;
   // $FF: renamed from: f android.view.View
   private View field_2195;
   // $FF: renamed from: g int
   private int field_2196;
   // $FF: renamed from: h android.widget.Scroller
   private Scroller field_2197;
   // $FF: renamed from: i boolean
   private boolean field_2198;
   // $FF: renamed from: j boolean
   private boolean field_2199;
   // $FF: renamed from: k boolean
   private boolean field_2200;
   // $FF: renamed from: l boolean
   private boolean field_2201;
   // $FF: renamed from: m int
   private int field_2202;
   // $FF: renamed from: n float
   private float field_2203;
   // $FF: renamed from: o float
   private float field_2204;
   // $FF: renamed from: p float
   private float field_2205;
   // $FF: renamed from: q int
   private int field_2206;
   // $FF: renamed from: r int
   private int field_2207;
   // $FF: renamed from: s com.slidemenu.lib.f
   private class_649 field_2208;
   // $FF: renamed from: t boolean
   private boolean field_2209;
   // $FF: renamed from: u com.slidemenu.lib.d
   private class_79 field_2210;
   // $FF: renamed from: v com.slidemenu.lib.d
   private class_79 field_2211;
   // $FF: renamed from: w com.slidemenu.lib.n
   private class_76 field_2212;
   // $FF: renamed from: x com.slidemenu.lib.p
   private class_78 field_2213;
   // $FF: renamed from: y java.util.List
   private List field_2214;
   // $FF: renamed from: z boolean
   private boolean field_2215;

   public class_652(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public class_652(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.field_2191 = -1;
      this.field_2209 = true;
      this.field_2214 = new ArrayList();
      this.field_2194 = 0;
      this.field_2215 = false;
      this.field_2190 = 0.0F;
      this.method_2140();
   }

   // $FF: renamed from: a (float, int, int) int
   private int method_2125(float var1, int var2, int var3) {
      int var5 = this.field_2196;
      if (Math.abs(var3) > this.field_2207 && Math.abs(var2) > this.field_2206) {
         int var4;
         if (var2 > 0 && var3 > 0) {
            var4 = var5 - 1;
         } else {
            var4 = var5;
            if (var2 < 0) {
               var4 = var5;
               if (var3 < 0) {
                  return var5 + 1;
               }
            }
         }

         return var4;
      } else {
         return Math.round((float)this.field_2196 + var1);
      }
   }

   // $FF: renamed from: a (android.view.MotionEvent, int) int
   private int method_2126(MotionEvent var1, int var2) {
      var2 = class_274.method_954(var1, var2);
      if (var2 == -1) {
         this.field_2191 = -1;
      }

      return var2;
   }

   // $FF: renamed from: a (com.slidemenu.lib.a) com.slidemenu.lib.f
   // $FF: synthetic method
   static class_649 method_2127(class_652 var0) {
      return var0.field_2208;
   }

   // $FF: renamed from: a (android.view.MotionEvent) boolean
   private boolean method_2128(MotionEvent var1) {
      Rect var2 = new Rect();
      Iterator var3 = this.field_2214.iterator();

      while(var3.hasNext()) {
         ((View)var3.next()).getHitRect(var2);
         if (var2.contains((int)var1.getX(), (int)var1.getY())) {
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: b (float) boolean
   private boolean method_2129(float var1) {
      return this.method_2147() ? this.field_2208.method_2116(var1) : this.field_2208.method_2112(var1);
   }

   // $FF: renamed from: b (android.view.MotionEvent) boolean
   private boolean method_2130(MotionEvent var1) {
      boolean var4 = false;
      int var2 = (int)(var1.getX() + this.field_2190);
      boolean var3;
      if (this.method_2147()) {
         var3 = this.field_2208.method_2113(this.field_2195, this.field_2196, (float)var2);
      } else {
         var3 = var4;
         switch(this.field_2194) {
         case 0:
            return this.field_2208.method_2117(this.field_2195, var2);
         case 1:
            var3 = var4;
            if (!this.method_2128(var1)) {
               return true;
            }
         case 2:
            break;
         default:
            return false;
         }
      }

      return var3;
   }

   // $FF: renamed from: c (int) void
   private void method_2131(int var1) {
      int var2 = this.getWidth();
      int var3 = var1 / var2;
      var1 %= var2;
      this.method_2141(var3, (float)var1 / (float)var2, var1);
   }

   // $FF: renamed from: c (android.view.MotionEvent) void
   private void method_2132(MotionEvent var1) {
      int var7 = this.field_2191;
      int var8 = this.method_2126(var1, var7);
      if (var7 != -1) {
         float var2 = class_274.method_956(var1, var8);
         float var3 = var2 - this.field_2204;
         float var4 = Math.abs(var3);
         float var5 = class_274.method_957(var1, var8);
         float var6 = Math.abs(var5 - this.field_2205);
         if (this.method_2147()) {
            var7 = this.field_2202 / 2;
         } else {
            var7 = this.field_2202;
         }

         if (var4 > (float)var7 && var4 > var6 && this.method_2129(var3)) {
            this.method_2135();
            this.field_2204 = var2;
            this.field_2205 = var5;
            this.setScrollingCacheEnabled(true);
            return;
         }

         if (var4 > (float)this.field_2202) {
            this.field_2201 = true;
            return;
         }
      }

   }

   // $FF: renamed from: d (android.view.MotionEvent) void
   private void method_2133(MotionEvent var1) {
      int var2 = class_274.method_953(var1);
      if (class_274.method_955(var1, var2) == this.field_2191) {
         byte var3;
         if (var2 == 0) {
            var3 = 1;
         } else {
            var3 = 0;
         }

         this.field_2204 = class_274.method_956(var1, var3);
         this.field_2191 = class_274.method_955(var1, var3);
         if (this.field_2192 != null) {
            this.field_2192.clear();
         }
      }

   }

   // $FF: renamed from: e () void
   private void method_2134() {
      if (this.field_2199) {
         this.setScrollingCacheEnabled(false);
         this.field_2197.abortAnimation();
         int var1 = this.getScrollX();
         int var2 = this.getScrollY();
         int var3 = this.field_2197.getCurrX();
         int var4 = this.field_2197.getCurrY();
         if (var1 != var3 || var2 != var4) {
            this.scrollTo(var3, var4);
         }

         if (this.method_2147()) {
            if (this.field_2213 != null) {
               this.field_2213.method_198();
            }
         } else if (this.field_2212 != null) {
            this.field_2212.method_196();
         }
      }

      this.field_2199 = false;
   }

   // $FF: renamed from: f () void
   private void method_2135() {
      this.field_2200 = true;
      this.field_2215 = false;
   }

   // $FF: renamed from: g () void
   private void method_2136() {
      this.field_2215 = false;
      this.field_2200 = false;
      this.field_2201 = false;
      this.field_2191 = -1;
      if (this.field_2192 != null) {
         this.field_2192.recycle();
         this.field_2192 = null;
      }

   }

   private int getLeftBound() {
      return this.field_2208.method_2107(this.field_2195);
   }

   private int getRightBound() {
      return this.field_2208.method_2114(this.field_2195);
   }

   private void setScrollingCacheEnabled(boolean var1) {
      if (this.field_2198 != var1) {
         this.field_2198 = var1;
      }

   }

   // $FF: renamed from: a (float) float
   float method_2137(float var1) {
      return FloatMath.sin((float)((double)(var1 - 0.5F) * 0.4712389167638204D));
   }

   // $FF: renamed from: a (int) int
   public int method_2138(int var1) {
      switch(var1) {
      case 0:
      case 2:
         return this.field_2208.method_2108(this.field_2195, var1);
      case 1:
         return this.field_2195.getLeft();
      default:
         return 0;
      }
   }

   // $FF: renamed from: a (com.slidemenu.lib.d) com.slidemenu.lib.d
   class_79 method_2139(class_79 var1) {
      class_79 var2 = this.field_2211;
      this.field_2211 = var1;
      return var2;
   }

   // $FF: renamed from: a () void
   void method_2140() {
      this.setWillNotDraw(false);
      this.setDescendantFocusability(262144);
      this.setFocusable(true);
      Context var1 = this.getContext();
      this.field_2197 = new Scroller(var1, field_2189);
      ViewConfiguration var2 = ViewConfiguration.get(var1);
      this.field_2202 = class_114.method_359(var2);
      this.field_2206 = var2.getScaledMinimumFlingVelocity();
      this.field_2193 = var2.getScaledMaximumFlingVelocity();
      this.method_2139(new class_648(this));
      this.field_2207 = (int)(var1.getResources().getDisplayMetrics().density * 25.0F);
   }

   // $FF: renamed from: a (int, float, int) void
   protected void method_2141(int var1, float var2, int var3) {
      if (this.field_2210 != null) {
         this.field_2210.method_200(var1, var2, var3);
      }

      if (this.field_2211 != null) {
         this.field_2211.method_200(var1, var2, var3);
      }

   }

   // $FF: renamed from: a (int, int, int) void
   void method_2142(int var1, int var2, int var3) {
      if (this.getChildCount() == 0) {
         this.setScrollingCacheEnabled(false);
      } else {
         int var7 = this.getScrollX();
         int var8 = this.getScrollY();
         int var9 = var1 - var7;
         var2 -= var8;
         if (var9 != 0 || var2 != 0) {
            this.setScrollingCacheEnabled(true);
            this.field_2199 = true;
            var1 = this.getBehindWidth();
            int var10 = var1 / 2;
            float var6 = Math.min(1.0F, (float)Math.abs(var9) * 1.0F / (float)var1);
            float var4 = (float)var10;
            float var5 = (float)var10;
            var6 = this.method_2137(var6);
            var3 = Math.abs(var3);
            if (var3 > 0) {
               var1 = Math.round(1000.0F * Math.abs((var5 * var6 + var4) / (float)var3)) * 4;
            } else {
               var1 = (int)(((float)Math.abs(var9) / (float)var1 + 1.0F) * 100.0F);
               var1 = 600;
            }

            var1 = Math.min(var1, 600);
            this.field_2197.startScroll(var7, var8, var9, var2, var1);
            this.invalidate();
            return;
         }

         this.method_2134();
         if (this.method_2147()) {
            if (this.field_2213 != null) {
               this.field_2213.method_198();
               return;
            }
         } else if (this.field_2212 != null) {
            this.field_2212.method_196();
            return;
         }
      }

   }

   // $FF: renamed from: a (int, boolean) void
   public void method_2143(int var1, boolean var2) {
      this.method_2144(var1, var2, false);
   }

   // $FF: renamed from: a (int, boolean, boolean) void
   void method_2144(int var1, boolean var2, boolean var3) {
      this.method_2145(var1, var2, var3, 0);
   }

   // $FF: renamed from: a (int, boolean, boolean, int) void
   void method_2145(int var1, boolean var2, boolean var3, int var4) {
      if (!var3 && this.field_2196 == var1) {
         this.setScrollingCacheEnabled(false);
      } else {
         int var5 = this.field_2208.method_2106(var1);
         boolean var7;
         if (this.field_2196 != var5) {
            var7 = true;
         } else {
            var7 = false;
         }

         this.field_2196 = var5;
         int var6 = this.method_2138(this.field_2196);
         if (var7 && this.field_2210 != null) {
            this.field_2210.method_199(var5);
         }

         if (var7 && this.field_2211 != null) {
            this.field_2211.method_199(var5);
         }

         if (var2) {
            this.method_2142(var6, 0, var4);
         } else {
            this.method_2134();
            this.scrollTo(var6, 0);
         }
      }
   }

   // $FF: renamed from: a (android.view.KeyEvent) boolean
   public boolean method_2146(KeyEvent var1) {
      if (var1.getAction() == 0) {
         switch(var1.getKeyCode()) {
         case 21:
            return this.method_2148(17);
         case 22:
            return this.method_2148(66);
         case 61:
            if (VERSION.SDK_INT >= 11) {
               if (class_279.method_965(var1)) {
                  return this.method_2148(2);
               }

               if (class_279.method_966(var1, 1)) {
                  return this.method_2148(1);
               }
            }
         }
      }

      return false;
   }

   // $FF: renamed from: b () boolean
   public boolean method_2147() {
      return this.field_2196 == 0 || this.field_2196 == 2;
   }

   // $FF: renamed from: b (int) boolean
   public boolean method_2148(int var1) {
      View var4 = this.findFocus();
      View var3 = var4;
      if (var4 == this) {
         var3 = null;
      }

      boolean var2;
      label57: {
         var4 = FocusFinder.getInstance().findNextFocus(this, var3, var1);
         if (var4 != null && var4 != var3) {
            if (var1 == 17) {
               var2 = var4.requestFocus();
               break label57;
            }

            if (var1 == 66) {
               if (var3 != null && var4.getLeft() <= var3.getLeft()) {
                  var2 = this.method_2150();
               } else {
                  var2 = var4.requestFocus();
               }
               break label57;
            }
         } else {
            if (var1 == 17 || var1 == 1) {
               var2 = this.method_2149();
               break label57;
            }

            if (var1 == 66 || var1 == 2) {
               var2 = this.method_2150();
               break label57;
            }
         }

         var2 = false;
      }

      if (var2) {
         this.playSoundEffect(SoundEffectConstants.getContantForFocusDirection(var1));
      }

      return var2;
   }

   // $FF: renamed from: c () boolean
   boolean method_2149() {
      if (this.field_2196 > 0) {
         this.method_2143(this.field_2196 - 1, true);
         return true;
      } else {
         return false;
      }
   }

   public void computeScroll() {
      if (!this.field_2197.isFinished() && this.field_2197.computeScrollOffset()) {
         int var1 = this.getScrollX();
         int var2 = this.getScrollY();
         int var3 = this.field_2197.getCurrX();
         int var4 = this.field_2197.getCurrY();
         if (var1 != var3 || var2 != var4) {
            this.scrollTo(var3, var4);
            this.method_2131(var3);
         }

         this.invalidate();
      } else {
         this.method_2134();
      }
   }

   // $FF: renamed from: d () boolean
   boolean method_2150() {
      if (this.field_2196 < 1) {
         this.method_2143(this.field_2196 + 1, true);
         return true;
      } else {
         return false;
      }
   }

   protected void dispatchDraw(Canvas var1) {
      super.dispatchDraw(var1);
      this.field_2208.method_2110(this.field_2195, var1);
      this.field_2208.method_2111(this.field_2195, var1, this.getPercentOpen());
      this.field_2208.method_2115(this.field_2195, var1, this.getPercentOpen());
   }

   public boolean dispatchKeyEvent(KeyEvent var1) {
      return super.dispatchKeyEvent(var1) || this.method_2146(var1);
   }

   public int getBehindWidth() {
      return this.field_2208 == null ? 0 : this.field_2208.getBehindWidth();
   }

   public View getContent() {
      return this.field_2195;
   }

   public int getContentLeft() {
      return this.field_2195.getLeft() + this.field_2195.getPaddingLeft();
   }

   public int getCurrentItem() {
      return this.field_2196;
   }

   protected float getPercentOpen() {
      return Math.abs(this.field_2190 - (float)this.field_2195.getLeft()) / (float)this.getBehindWidth();
   }

   public int getTouchMode() {
      return this.field_2194;
   }

   public boolean onInterceptTouchEvent(MotionEvent var1) {
      if (this.field_2209) {
         int var3 = var1.getAction() & 255;
         if (var3 != 3 && var3 != 1 && (var3 == 0 || !this.field_2201)) {
            switch(var3) {
            case 0:
               var3 = class_274.method_953(var1);
               this.field_2191 = class_274.method_955(var1, var3);
               if (this.field_2191 != -1) {
                  float var2 = class_274.method_956(var1, var3);
                  this.field_2203 = var2;
                  this.field_2204 = var2;
                  this.field_2205 = class_274.method_957(var1, var3);
                  if (this.method_2130(var1)) {
                     this.field_2200 = false;
                     this.field_2201 = false;
                     if (this.method_2147() && this.field_2208.method_2118(this.field_2195, this.field_2196, var1.getX() + this.field_2190)) {
                        this.field_2215 = true;
                     }
                  } else {
                     this.field_2201 = true;
                  }
               }
               break;
            case 2:
               this.method_2132(var1);
               break;
            case 6:
               this.method_2133(var1);
            }

            if (!this.field_2200) {
               if (this.field_2192 == null) {
                  this.field_2192 = VelocityTracker.obtain();
               }

               this.field_2192.addMovement(var1);
            }

            if (!this.field_2200 && !this.field_2215) {
               return false;
            } else {
               return true;
            }
         } else {
            this.method_2136();
            return false;
         }
      } else {
         return false;
      }
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      this.field_2195.layout(0, 0, var4 - var2, var5 - var3);
   }

   protected void onMeasure(int var1, int var2) {
      int var4 = getDefaultSize(0, var1);
      int var3 = getDefaultSize(0, var2);
      this.setMeasuredDimension(var4, var3);
      var1 = getChildMeasureSpec(var1, 0, var4);
      var2 = getChildMeasureSpec(var2, 0, var3);
      this.field_2195.measure(var1, var2);
   }

   protected void onSizeChanged(int var1, int var2, int var3, int var4) {
      super.onSizeChanged(var1, var2, var3, var4);
      if (var1 != var3) {
         this.method_2134();
         this.scrollTo(this.method_2138(this.field_2196), this.getScrollY());
      }

   }

   public boolean onTouchEvent(MotionEvent var1) {
      if (this.field_2209 && (this.field_2200 || this.method_2130(var1))) {
         int var5 = var1.getAction();
         if (this.field_2192 == null) {
            this.field_2192 = VelocityTracker.obtain();
         }

         this.field_2192.addMovement(var1);
         float var2;
         switch(var5 & 255) {
         case 0:
            this.method_2134();
            this.field_2191 = class_274.method_955(var1, class_274.method_953(var1));
            var2 = var1.getX();
            this.field_2203 = var2;
            this.field_2204 = var2;
            break;
         case 1:
            if (this.field_2200) {
               VelocityTracker var7 = this.field_2192;
               var7.computeCurrentVelocity(1000, (float)this.field_2193);
               var5 = (int)class_252.method_914(var7, this.field_2191);
               var2 = (float)(this.getScrollX() - this.method_2138(this.field_2196)) / (float)this.getBehindWidth();
               int var6 = this.method_2126(var1, this.field_2191);
               if (this.field_2191 != -1) {
                  this.method_2145(this.method_2125(var2, var5, (int)(class_274.method_956(var1, var6) - this.field_2203)), true, true, var5);
               } else {
                  this.method_2145(this.field_2196, true, true, var5);
               }

               this.field_2191 = -1;
               this.method_2136();
            } else if (this.field_2215 && this.field_2208.method_2118(this.field_2195, this.field_2196, var1.getX() + this.field_2190)) {
               this.setCurrentItem(1);
               this.method_2136();
            }
            break;
         case 2:
            if (!this.field_2200) {
               this.method_2132(var1);
               if (this.field_2201) {
                  return false;
               }
            }

            if (this.field_2200) {
               var5 = this.method_2126(var1, this.field_2191);
               if (this.field_2191 != -1) {
                  var2 = class_274.method_956(var1, var5);
                  float var3 = this.field_2204;
                  this.field_2204 = var2;
                  var2 = (float)this.getScrollX() + (var3 - var2);
                  var3 = (float)this.getLeftBound();
                  float var4 = (float)this.getRightBound();
                  if (var2 < var3) {
                     var2 = var3;
                  } else if (var2 > var4) {
                     var2 = var4;
                  }

                  this.field_2204 += var2 - (float)((int)var2);
                  this.scrollTo((int)var2, this.getScrollY());
                  this.method_2131((int)var2);
               }
            }
            break;
         case 3:
            if (this.field_2200) {
               this.method_2144(this.field_2196, true, true);
               this.field_2191 = -1;
               this.method_2136();
            }
         case 4:
         default:
            break;
         case 5:
            var5 = class_274.method_953(var1);
            this.field_2204 = class_274.method_956(var1, var5);
            this.field_2191 = class_274.method_955(var1, var5);
            break;
         case 6:
            this.method_2133(var1);
            var5 = this.method_2126(var1, this.field_2191);
            if (this.field_2191 != -1) {
               this.field_2204 = class_274.method_956(var1, var5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void scrollTo(int var1, int var2) {
      super.scrollTo(var1, var2);
      this.field_2190 = (float)var1;
      this.field_2208.method_2109(this.field_2195, var1, var2);
      ((SlidingMenu)this.getParent()).method_578(this.getPercentOpen());
   }

   public void setAboveOffset(int var1) {
      this.field_2195.setPadding(var1, this.field_2195.getPaddingTop(), this.field_2195.getPaddingRight(), this.field_2195.getPaddingBottom());
   }

   public void setContent(View var1) {
      if (this.field_2195 != null) {
         this.removeView(this.field_2195);
      }

      this.field_2195 = var1;
      this.addView(this.field_2195);
   }

   public void setCurrentItem(int var1) {
      this.method_2144(var1, true, false);
   }

   public void setCustomViewBehind(class_649 var1) {
      this.field_2208 = var1;
   }

   public void setOnClosedListener(class_76 var1) {
      this.field_2212 = var1;
   }

   public void setOnOpenedListener(class_78 var1) {
      this.field_2213 = var1;
   }

   public void setOnPageChangeListener(class_79 var1) {
      this.field_2210 = var1;
   }

   public void setSlidingEnabled(boolean var1) {
      this.field_2209 = var1;
   }

   public void setTouchMode(int var1) {
      this.field_2194 = var1;
   }
}
