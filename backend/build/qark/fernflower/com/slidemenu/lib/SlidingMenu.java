package com.slidemenu.lib;

import a.a.a.class_134;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Parcelable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

public class SlidingMenu extends RelativeLayout {
   // $FF: renamed from: a boolean
   private boolean field_356;
   // $FF: renamed from: b com.slidemenu.lib.a
   private class_652 field_357;
   // $FF: renamed from: c com.slidemenu.lib.f
   private class_649 field_358;
   // $FF: renamed from: d com.slidemenu.lib.o
   private class_77 field_359;
   // $FF: renamed from: e com.slidemenu.lib.o
   private class_77 field_360;
   // $FF: renamed from: f com.slidemenu.lib.m
   private class_75 field_361;
   // $FF: renamed from: g android.os.Handler
   private Handler field_362;

   public SlidingMenu(Activity var1, int var2) {
      this(var1, (AttributeSet)null);
      this.method_579(var1, var2);
   }

   public SlidingMenu(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public SlidingMenu(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public SlidingMenu(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.field_356 = false;
      this.field_362 = new Handler();
      LayoutParams var5 = new LayoutParams(-1, -1);
      this.field_358 = new class_649(var1);
      this.addView(this.field_358, var5);
      var5 = new LayoutParams(-1, -1);
      this.field_357 = new class_652(var1);
      this.addView(this.field_357, var5);
      this.field_357.setCustomViewBehind(this.field_358);
      this.field_358.setCustomViewAbove(this.field_357);
      this.field_357.setOnPageChangeListener(new class_640(this));
      TypedArray var6 = var1.obtainStyledAttributes(var2, class_134.SlidingMenu);
      this.setMode(var6.getInt(0, 0));
      var3 = var6.getResourceId(1, -1);
      if (var3 != -1) {
         this.setContent(var3);
      } else {
         this.setContent(new FrameLayout(var1));
      }

      var3 = var6.getResourceId(2, -1);
      if (var3 != -1) {
         this.setMenu(var3);
      } else {
         this.setMenu(new FrameLayout(var1));
      }

      this.setTouchModeAbove(var6.getInt(6, 0));
      this.setTouchModeBehind(var6.getInt(7, 0));
      var3 = (int)var6.getDimension(3, -1.0F);
      int var4 = (int)var6.getDimension(4, -1.0F);
      if (var3 != -1 && var4 != -1) {
         throw new IllegalStateException("Cannot set both behindOffset and behindWidth for a SlidingMenu");
      } else {
         if (var3 != -1) {
            this.setBehindOffset(var3);
         } else if (var4 != -1) {
            this.setBehindWidth(var4);
         } else {
            this.setBehindOffset(0);
         }

         this.setBehindScrollScale(var6.getFloat(5, 0.33F));
         var3 = var6.getResourceId(8, -1);
         if (var3 != -1) {
            this.setShadowDrawable(var3);
         }

         this.setShadowWidth((int)var6.getDimension(9, 0.0F));
         this.setFadeEnabled(var6.getBoolean(10, true));
         this.setFadeDegree(var6.getFloat(11, 0.33F));
         this.setSelectorEnabled(var6.getBoolean(12, false));
         var3 = var6.getResourceId(13, -1);
         if (var3 != -1) {
            this.setSelectorDrawable(var3);
         }

         var6.recycle();
      }
   }

   // $FF: renamed from: a (com.slidemenu.lib.SlidingMenu) com.slidemenu.lib.o
   // $FF: synthetic method
   static class_77 method_574(SlidingMenu var0) {
      return var0.field_359;
   }

   // $FF: renamed from: b (com.slidemenu.lib.SlidingMenu) com.slidemenu.lib.m
   // $FF: synthetic method
   static class_75 method_575(SlidingMenu var0) {
      return var0.field_361;
   }

   // $FF: renamed from: c (com.slidemenu.lib.SlidingMenu) com.slidemenu.lib.o
   // $FF: synthetic method
   static class_77 method_576(SlidingMenu var0) {
      return var0.field_360;
   }

   // $FF: renamed from: a () void
   public void method_577() {
      this.method_581(true);
   }

   // $FF: renamed from: a (float) void
   @TargetApi(11)
   public void method_578(float var1) {
      byte var3 = 0;
      if (VERSION.SDK_INT >= 11) {
         boolean var2;
         if (var1 > 0.0F && var1 < 1.0F) {
            var2 = true;
         } else {
            var2 = false;
         }

         if (var2) {
            var3 = 2;
         }

         if (var3 != this.getContent().getLayerType()) {
            this.field_362.post(new class_637(this, var3));
            return;
         }
      }

   }

   // $FF: renamed from: a (android.app.Activity, int) void
   public void method_579(Activity var1, int var2) {
      this.method_580(var1, var2, false);
   }

   // $FF: renamed from: a (android.app.Activity, int, boolean) void
   public void method_580(Activity var1, int var2, boolean var3) {
      if (var2 != 0 && var2 != 1) {
         throw new IllegalArgumentException("slideStyle must be either SLIDING_WINDOW or SLIDING_CONTENT");
      } else if (this.getParent() != null) {
         throw new IllegalStateException("This SlidingMenu appears to already be attached");
      } else {
         TypedArray var5 = var1.getTheme().obtainStyledAttributes(new int[]{16842836});
         int var4 = var5.getResourceId(0, 0);
         var5.recycle();
         ViewGroup var6;
         switch(var2) {
         case 0:
            this.field_356 = false;
            var6 = (ViewGroup)var1.getWindow().getDecorView();
            ViewGroup var8 = (ViewGroup)var6.getChildAt(0);
            var8.setBackgroundResource(var4);
            var6.removeView(var8);
            var6.addView(this);
            this.setContent(var8);
            return;
         case 1:
            this.field_356 = var3;
            var6 = (ViewGroup)var1.findViewById(16908290);
            View var7 = var6.getChildAt(0);
            var6.removeView(var7);
            var6.addView(this);
            this.setContent(var7);
            if (var7.getBackground() == null) {
               var7.setBackgroundResource(var4);
               return;
            }
         default:
         }
      }
   }

   // $FF: renamed from: a (boolean) void
   public void method_581(boolean var1) {
      this.field_357.method_2143(0, var1);
   }

   // $FF: renamed from: b () void
   public void method_582() {
      this.method_584(true);
   }

   // $FF: renamed from: b (boolean) void
   public void method_583(boolean var1) {
      this.field_357.method_2143(2, var1);
   }

   // $FF: renamed from: c (boolean) void
   public void method_584(boolean var1) {
      this.field_357.method_2143(1, var1);
   }

   // $FF: renamed from: c () boolean
   public boolean method_585() {
      return this.field_357.getCurrentItem() == 0 || this.field_357.getCurrentItem() == 2;
   }

   // $FF: renamed from: d () boolean
   public boolean method_586() {
      return this.field_357.getCurrentItem() == 2;
   }

   @SuppressLint({"NewApi"})
   protected boolean fitSystemWindows(Rect var1) {
      int var2 = var1.left;
      int var3 = var1.right;
      int var4 = var1.top;
      int var5 = var1.bottom;
      if (!this.field_356) {
         Log.v("SlidingMenu", "setting padding!");
         this.setPadding(var2, var4, var3, var5);
      }

      return true;
   }

   public int getBehindOffset() {
      return ((LayoutParams)this.field_358.getLayoutParams()).rightMargin;
   }

   public float getBehindScrollScale() {
      return this.field_358.getScrollScale();
   }

   public View getContent() {
      return this.field_357.getContent();
   }

   public View getMenu() {
      return this.field_358.getContent();
   }

   public int getMode() {
      return this.field_358.getMode();
   }

   public View getSecondaryMenu() {
      return this.field_358.getSecondaryContent();
   }

   public int getTouchModeAbove() {
      return this.field_357.getTouchMode();
   }

   public int getTouchmodeMarginThreshold() {
      return this.field_358.getMarginThreshold();
   }

   protected void onRestoreInstanceState(Parcelable var1) {
      SlidingMenu$SavedState var2 = (SlidingMenu$SavedState)var1;
      super.onRestoreInstanceState(var2.getSuperState());
      this.field_357.setCurrentItem(var2.method_2067());
   }

   protected Parcelable onSaveInstanceState() {
      return new SlidingMenu$SavedState(super.onSaveInstanceState(), this.field_357.getCurrentItem());
   }

   public void setAboveOffset(int var1) {
      this.field_357.setAboveOffset(var1);
   }

   public void setAboveOffsetRes(int var1) {
      this.setAboveOffset((int)this.getContext().getResources().getDimension(var1));
   }

   public void setBehindCanvasTransformer(class_74 var1) {
      this.field_358.setCanvasTransformer(var1);
   }

   public void setBehindOffset(int var1) {
      this.field_358.setWidthOffset(var1);
   }

   public void setBehindOffsetRes(int var1) {
      this.setBehindOffset((int)this.getContext().getResources().getDimension(var1));
   }

   public void setBehindScrollScale(float var1) {
      if (var1 < 0.0F && var1 > 1.0F) {
         throw new IllegalStateException("ScrollScale must be between 0 and 1");
      } else {
         this.field_358.setScrollScale(var1);
      }
   }

   public void setBehindWidth(int var1) {
      Display var3 = ((WindowManager)this.getContext().getSystemService("window")).getDefaultDisplay();

      int var2;
      try {
         Point var4 = new Point();
         Display.class.getMethod("getSize", Point.class).invoke(var3, var4);
         var2 = var4.x;
      } catch (Exception var5) {
         var2 = var3.getWidth();
      }

      this.setBehindOffset(var2 - var1);
   }

   public void setBehindWidthRes(int var1) {
      this.setBehindWidth((int)this.getContext().getResources().getDimension(var1));
   }

   public void setContent(int var1) {
      this.setContent(LayoutInflater.from(this.getContext()).inflate(var1, (ViewGroup)null));
   }

   public void setContent(View var1) {
      this.field_357.setContent(var1);
      this.method_582();
   }

   public void setFadeDegree(float var1) {
      this.field_358.setFadeDegree(var1);
   }

   public void setFadeEnabled(boolean var1) {
      this.field_358.setFadeEnabled(var1);
   }

   public void setMenu(int var1) {
      this.setMenu(LayoutInflater.from(this.getContext()).inflate(var1, (ViewGroup)null));
   }

   public void setMenu(View var1) {
      this.field_358.setContent(var1);
   }

   public void setMode(int var1) {
      if (var1 != 0 && var1 != 1 && var1 != 2) {
         throw new IllegalStateException("SlidingMenu mode must be LEFT, RIGHT, or LEFT_RIGHT");
      } else {
         this.field_358.setMode(var1);
      }
   }

   public void setOnCloseListener(class_75 var1) {
      this.field_361 = var1;
   }

   public void setOnClosedListener(class_76 var1) {
      this.field_357.setOnClosedListener(var1);
   }

   public void setOnOpenListener(class_77 var1) {
      this.field_359 = var1;
   }

   public void setOnOpenedListener(class_78 var1) {
      this.field_357.setOnOpenedListener(var1);
   }

   public void setSecondaryMenu(int var1) {
      this.setSecondaryMenu(LayoutInflater.from(this.getContext()).inflate(var1, (ViewGroup)null));
   }

   public void setSecondaryMenu(View var1) {
      this.field_358.setSecondaryContent(var1);
   }

   public void setSecondaryOnOpenListner(class_77 var1) {
      this.field_360 = var1;
   }

   public void setSecondaryShadowDrawable(int var1) {
      this.setSecondaryShadowDrawable(this.getContext().getResources().getDrawable(var1));
   }

   public void setSecondaryShadowDrawable(Drawable var1) {
      this.field_358.setSecondaryShadowDrawable(var1);
   }

   public void setSelectedView(View var1) {
      this.field_358.setSelectedView(var1);
   }

   public void setSelectorBitmap(Bitmap var1) {
      this.field_358.setSelectorBitmap(var1);
   }

   public void setSelectorDrawable(int var1) {
      this.field_358.setSelectorBitmap(BitmapFactory.decodeResource(this.getResources(), var1));
   }

   public void setSelectorEnabled(boolean var1) {
      this.field_358.setSelectorEnabled(true);
   }

   public void setShadowDrawable(int var1) {
      this.setShadowDrawable(this.getContext().getResources().getDrawable(var1));
   }

   public void setShadowDrawable(Drawable var1) {
      this.field_358.setShadowDrawable(var1);
   }

   public void setShadowWidth(int var1) {
      this.field_358.setShadowWidth(var1);
   }

   public void setShadowWidthRes(int var1) {
      this.setShadowWidth((int)this.getResources().getDimension(var1));
   }

   public void setSlidingEnabled(boolean var1) {
      this.field_357.setSlidingEnabled(var1);
   }

   public void setStatic(boolean var1) {
      if (var1) {
         this.setSlidingEnabled(false);
         this.field_357.setCustomViewBehind((class_649)null);
         this.field_357.setCurrentItem(1);
      } else {
         this.field_357.setCurrentItem(1);
         this.field_357.setCustomViewBehind(this.field_358);
         this.setSlidingEnabled(true);
      }
   }

   public void setTouchModeAbove(int var1) {
      if (var1 != 1 && var1 != 0 && var1 != 2) {
         throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
      } else {
         this.field_357.setTouchMode(var1);
      }
   }

   public void setTouchModeBehind(int var1) {
      if (var1 != 1 && var1 != 0 && var1 != 2) {
         throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
      } else {
         this.field_358.setTouchMode(var1);
      }
   }

   public void setTouchmodeMarginThreshold(int var1) {
      this.field_358.setMarginThreshold(var1);
   }
}
