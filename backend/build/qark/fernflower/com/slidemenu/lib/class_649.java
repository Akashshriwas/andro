package com.slidemenu.lib;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

// $FF: renamed from: com.slidemenu.lib.f
public class class_649 extends ViewGroup {
   // $FF: renamed from: a int
   private int field_2170;
   // $FF: renamed from: b com.slidemenu.lib.a
   private class_652 field_2171;
   // $FF: renamed from: c android.view.View
   private View field_2172;
   // $FF: renamed from: d android.view.View
   private View field_2173;
   // $FF: renamed from: e int
   private int field_2174;
   // $FF: renamed from: f int
   private int field_2175;
   // $FF: renamed from: g com.slidemenu.lib.l
   private class_74 field_2176;
   // $FF: renamed from: h boolean
   private boolean field_2177;
   // $FF: renamed from: i int
   private int field_2178;
   // $FF: renamed from: j boolean
   private boolean field_2179;
   // $FF: renamed from: k android.graphics.Paint
   private final Paint field_2180;
   // $FF: renamed from: l float
   private float field_2181;
   // $FF: renamed from: m android.graphics.drawable.Drawable
   private Drawable field_2182;
   // $FF: renamed from: n android.graphics.drawable.Drawable
   private Drawable field_2183;
   // $FF: renamed from: o int
   private int field_2184;
   // $FF: renamed from: p float
   private float field_2185;
   // $FF: renamed from: q boolean
   private boolean field_2186;
   // $FF: renamed from: r android.graphics.Bitmap
   private Bitmap field_2187;
   // $FF: renamed from: s android.view.View
   private View field_2188;

   public class_649(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public class_649(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.field_2170 = 0;
      this.field_2180 = new Paint();
      this.field_2186 = true;
      this.field_2174 = (int)TypedValue.applyDimension(1, 48.0F, this.getResources().getDisplayMetrics());
   }

   private int getSelectorTop() {
      return this.field_2188.getTop() + (this.field_2188.getHeight() - this.field_2187.getHeight()) / 2;
   }

   // $FF: renamed from: a (int) int
   public int method_2106(int var1) {
      int var2;
      if (var1 > 1) {
         var2 = 2;
      } else {
         var2 = var1;
         if (var1 < 1) {
            var2 = 0;
         }
      }

      if (this.field_2178 == 0 && var2 > 1) {
         return 0;
      } else {
         return this.field_2178 == 1 && var2 < 1 ? 2 : var2;
      }
   }

   // $FF: renamed from: a (android.view.View) int
   public int method_2107(View var1) {
      if (this.field_2178 != 0 && this.field_2178 != 2) {
         return this.field_2178 == 1 ? var1.getLeft() : 0;
      } else {
         return var1.getLeft() - this.getBehindWidth();
      }
   }

   // $FF: renamed from: a (android.view.View, int) int
   public int method_2108(View var1, int var2) {
      if (this.field_2178 == 0) {
         switch(var2) {
         case 0:
            return var1.getLeft() - this.getBehindWidth();
         case 1:
         default:
            break;
         case 2:
            return var1.getLeft();
         }
      } else if (this.field_2178 == 1) {
         switch(var2) {
         case 0:
            return var1.getLeft();
         case 1:
         default:
            break;
         case 2:
            return var1.getLeft() + this.getBehindWidth();
         }
      } else if (this.field_2178 == 2) {
         switch(var2) {
         case 0:
            return var1.getLeft() - this.getBehindWidth();
         case 1:
         default:
            break;
         case 2:
            return var1.getLeft() + this.getBehindWidth();
         }
      }

      return var1.getLeft();
   }

   // $FF: renamed from: a (android.view.View, int, int) void
   public void method_2109(View var1, int var2, int var3) {
      byte var6 = 0;
      byte var7 = 0;
      byte var5 = 0;
      byte var4 = 0;
      if (this.field_2178 == 0) {
         if (var2 >= var1.getLeft()) {
            var4 = 4;
         }

         this.scrollTo((int)((float)(this.getBehindWidth() + var2) * this.field_2181), var3);
      } else if (this.field_2178 == 1) {
         var4 = var7;
         if (var2 <= var1.getLeft()) {
            var4 = 4;
         }

         this.scrollTo((int)((float)(this.getBehindWidth() - this.getWidth()) + (float)(var2 - this.getBehindWidth()) * this.field_2181), var3);
      } else {
         var4 = var6;
         if (this.field_2178 == 2) {
            View var8 = this.field_2172;
            if (var2 >= var1.getLeft()) {
               var4 = 4;
            } else {
               var4 = 0;
            }

            var8.setVisibility(var4);
            var8 = this.field_2173;
            if (var2 <= var1.getLeft()) {
               var4 = 4;
            } else {
               var4 = 0;
            }

            var8.setVisibility(var4);
            var4 = var5;
            if (var2 == 0) {
               var4 = 4;
            }

            if (var2 <= var1.getLeft()) {
               this.scrollTo((int)((float)(this.getBehindWidth() + var2) * this.field_2181), var3);
            } else {
               this.scrollTo((int)((float)(this.getBehindWidth() - this.getWidth()) + (float)(var2 - this.getBehindWidth()) * this.field_2181), var3);
            }
         }
      }

      if (var4 == 4) {
         Log.v("CustomViewBehind", "behind INVISIBLE");
      }

      this.setVisibility(var4);
   }

   // $FF: renamed from: a (android.view.View, android.graphics.Canvas) void
   public void method_2110(View var1, Canvas var2) {
      if (this.field_2182 != null && this.field_2184 > 0) {
         int var3;
         if (this.field_2178 == 0) {
            var3 = var1.getLeft() - this.field_2184;
         } else if (this.field_2178 == 1) {
            var3 = var1.getRight();
         } else if (this.field_2178 == 2) {
            if (this.field_2183 != null) {
               var3 = var1.getRight();
               this.field_2183.setBounds(var3, 0, this.field_2184 + var3, this.getHeight());
               this.field_2183.draw(var2);
            }

            var3 = var1.getLeft() - this.field_2184;
         } else {
            var3 = 0;
         }

         this.field_2182.setBounds(var3, 0, this.field_2184 + var3, this.getHeight());
         this.field_2182.draw(var2);
      }
   }

   // $FF: renamed from: a (android.view.View, android.graphics.Canvas, float) void
   public void method_2111(View var1, Canvas var2, float var3) {
      int var4 = 0;
      if (this.field_2179) {
         int var5 = (int)(this.field_2185 * 255.0F * Math.abs(1.0F - var3));
         this.field_2180.setColor(Color.argb(var5, 0, 0, 0));
         if (this.field_2178 == 0) {
            var5 = var1.getLeft() - this.getBehindWidth();
            var4 = var1.getLeft();
         } else if (this.field_2178 == 1) {
            var5 = var1.getRight();
            var4 = var1.getRight() + this.getBehindWidth();
         } else if (this.field_2178 == 2) {
            var4 = var1.getLeft();
            var5 = this.getBehindWidth();
            int var6 = var1.getLeft();
            var2.drawRect((float)(var4 - var5), 0.0F, (float)var6, (float)this.getHeight(), this.field_2180);
            var5 = var1.getRight();
            var4 = var1.getRight() + this.getBehindWidth();
         } else {
            var5 = 0;
         }

         var2.drawRect((float)var5, 0.0F, (float)var4, (float)this.getHeight(), this.field_2180);
      }
   }

   // $FF: renamed from: a (float) boolean
   public boolean method_2112(float var1) {
      if (this.field_2178 == 0) {
         if (var1 <= 0.0F) {
            return false;
         }
      } else if (this.field_2178 == 1) {
         if (var1 >= 0.0F) {
            return false;
         }
      } else if (this.field_2178 != 2) {
         return false;
      }

      return true;
   }

   // $FF: renamed from: a (android.view.View, int, float) boolean
   public boolean method_2113(View var1, int var2, float var3) {
      switch(this.field_2170) {
      case 0:
         return this.method_2118(var1, var2, var3);
      case 1:
         return true;
      default:
         return false;
      }
   }

   // $FF: renamed from: b (android.view.View) int
   public int method_2114(View var1) {
      if (this.field_2178 == 0) {
         return var1.getLeft();
      } else {
         return this.field_2178 != 1 && this.field_2178 != 2 ? 0 : var1.getLeft() + this.getBehindWidth();
      }
   }

   // $FF: renamed from: b (android.view.View, android.graphics.Canvas, float) void
   public void method_2115(View var1, Canvas var2, float var3) {
      if (this.field_2186 && this.field_2187 != null && this.field_2188 != null && ((String)this.field_2188.getTag(2131165193)).equals("CustomViewBehindSelectedView")) {
         var2.save();
         int var4 = (int)((float)this.field_2187.getWidth() * var3);
         int var5;
         if (this.field_2178 == 0) {
            var5 = var1.getLeft();
            var4 = var5 - var4;
            var2.clipRect(var4, 0, var5, this.getHeight());
            var2.drawBitmap(this.field_2187, (float)var4, (float)this.getSelectorTop(), (Paint)null);
         } else if (this.field_2178 == 1) {
            var5 = var1.getRight();
            var4 += var5;
            var2.clipRect(var5, 0, var4, this.getHeight());
            var2.drawBitmap(this.field_2187, (float)(var4 - this.field_2187.getWidth()), (float)this.getSelectorTop(), (Paint)null);
         }

         var2.restore();
      }
   }

   // $FF: renamed from: b (float) boolean
   public boolean method_2116(float var1) {
      if (this.field_2178 == 0) {
         if (var1 >= 0.0F) {
            return false;
         }
      } else if (this.field_2178 == 1) {
         if (var1 <= 0.0F) {
            return false;
         }
      } else if (this.field_2178 != 2) {
         return false;
      }

      return true;
   }

   // $FF: renamed from: b (android.view.View, int) boolean
   public boolean method_2117(View var1, int var2) {
      int var3 = var1.getLeft();
      int var4 = var1.getRight();
      if (this.field_2178 == 0) {
         if (var2 < var3 || var2 > var3 + this.field_2174) {
            return false;
         }
      } else if (this.field_2178 == 1) {
         if (var2 > var4 || var2 < var4 - this.field_2174) {
            return false;
         }
      } else {
         if (this.field_2178 != 2) {
            return false;
         }

         if ((var2 < var3 || var2 > var3 + this.field_2174) && (var2 > var4 || var2 < var4 - this.field_2174)) {
            return false;
         }
      }

      return true;
   }

   // $FF: renamed from: b (android.view.View, int, float) boolean
   public boolean method_2118(View var1, int var2, float var3) {
      boolean var5 = false;
      boolean var4;
      if (this.field_2178 != 0 && (this.field_2178 != 2 || var2 != 0)) {
         if (this.field_2178 != 1) {
            var4 = var5;
            if (this.field_2178 != 2) {
               return var4;
            }

            var4 = var5;
            if (var2 != 2) {
               return var4;
            }
         }

         var4 = var5;
         if (var3 <= (float)var1.getRight()) {
            return true;
         }
      } else {
         var4 = var5;
         if (var3 >= (float)var1.getLeft()) {
            var4 = true;
         }
      }

      return var4;
   }

   protected void dispatchDraw(Canvas var1) {
      if (this.field_2176 != null) {
         var1.save();
         this.field_2176.method_194(var1, this.field_2171.getPercentOpen());
         super.dispatchDraw(var1);
         var1.restore();
      } else {
         super.dispatchDraw(var1);
      }
   }

   public int getBehindWidth() {
      return this.field_2172.getWidth();
   }

   public View getContent() {
      return this.field_2172;
   }

   public int getMarginThreshold() {
      return this.field_2174;
   }

   public int getMode() {
      return this.field_2178;
   }

   public float getScrollScale() {
      return this.field_2181;
   }

   public View getSecondaryContent() {
      return this.field_2173;
   }

   public boolean onInterceptTouchEvent(MotionEvent var1) {
      return !this.field_2177;
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      var2 = var4 - var2;
      var3 = var5 - var3;
      this.field_2172.layout(0, 0, var2 - this.field_2175, var3);
      if (this.field_2173 != null) {
         this.field_2173.layout(0, 0, var2 - this.field_2175, var3);
      }

   }

   protected void onMeasure(int var1, int var2) {
      int var4 = getDefaultSize(0, var1);
      int var3 = getDefaultSize(0, var2);
      this.setMeasuredDimension(var4, var3);
      var1 = getChildMeasureSpec(var1, 0, var4 - this.field_2175);
      var2 = getChildMeasureSpec(var2, 0, var3);
      this.field_2172.measure(var1, var2);
      if (this.field_2173 != null) {
         this.field_2173.measure(var1, var2);
      }

   }

   public boolean onTouchEvent(MotionEvent var1) {
      return !this.field_2177;
   }

   public void scrollTo(int var1, int var2) {
      super.scrollTo(var1, var2);
      if (this.field_2176 != null) {
         this.invalidate();
      }

   }

   public void setCanvasTransformer(class_74 var1) {
      this.field_2176 = var1;
   }

   public void setChildrenEnabled(boolean var1) {
      this.field_2177 = var1;
   }

   public void setContent(View var1) {
      if (this.field_2172 != null) {
         this.removeView(this.field_2172);
      }

      this.field_2172 = var1;
      this.addView(this.field_2172);
   }

   public void setCustomViewAbove(class_652 var1) {
      this.field_2171 = var1;
   }

   public void setFadeDegree(float var1) {
      if (var1 <= 1.0F && var1 >= 0.0F) {
         this.field_2185 = var1;
      } else {
         throw new IllegalStateException("The BehindFadeDegree must be between 0.0f and 1.0f");
      }
   }

   public void setFadeEnabled(boolean var1) {
      this.field_2179 = var1;
   }

   public void setMarginThreshold(int var1) {
      this.field_2174 = var1;
   }

   public void setMode(int var1) {
      if (var1 == 0 || var1 == 1) {
         if (this.field_2172 != null) {
            this.field_2172.setVisibility(0);
         }

         if (this.field_2173 != null) {
            this.field_2173.setVisibility(4);
         }
      }

      this.field_2178 = var1;
   }

   public void setScrollScale(float var1) {
      this.field_2181 = var1;
   }

   public void setSecondaryContent(View var1) {
      if (this.field_2173 != null) {
         this.removeView(this.field_2173);
      }

      this.field_2173 = var1;
      this.addView(this.field_2173);
   }

   public void setSecondaryShadowDrawable(Drawable var1) {
      this.field_2183 = var1;
      this.invalidate();
   }

   public void setSelectedView(View var1) {
      if (this.field_2188 != null) {
         this.field_2188.setTag(2131165193, (Object)null);
         this.field_2188 = null;
      }

      if (var1 != null && var1.getParent() != null) {
         this.field_2188 = var1;
         this.field_2188.setTag(2131165193, "CustomViewBehindSelectedView");
         this.invalidate();
      }

   }

   public void setSelectorBitmap(Bitmap var1) {
      this.field_2187 = var1;
      this.refreshDrawableState();
   }

   public void setSelectorEnabled(boolean var1) {
      this.field_2186 = var1;
   }

   public void setShadowDrawable(Drawable var1) {
      this.field_2182 = var1;
      this.invalidate();
   }

   public void setShadowWidth(int var1) {
      this.field_2184 = var1;
      this.invalidate();
   }

   public void setTouchMode(int var1) {
      this.field_2170 = var1;
   }

   public void setWidthOffset(int var1) {
      this.field_2175 = var1;
      this.requestLayout();
   }
}
