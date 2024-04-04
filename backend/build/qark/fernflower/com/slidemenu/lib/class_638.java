package com.slidemenu.lib;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

// $FF: renamed from: com.slidemenu.lib.g
public class class_638 {
   // $FF: renamed from: a android.app.Activity
   private Activity field_2142;
   // $FF: renamed from: b com.slidemenu.lib.SlidingMenu
   private SlidingMenu field_2143;
   // $FF: renamed from: c android.view.View
   private View field_2144;
   // $FF: renamed from: d android.view.View
   private View field_2145;
   // $FF: renamed from: e boolean
   private boolean field_2146 = false;
   // $FF: renamed from: f boolean
   private boolean field_2147 = false;
   // $FF: renamed from: g boolean
   private boolean field_2148 = true;

   public class_638(Activity var1) {
      this.field_2142 = var1;
   }

   // $FF: renamed from: a (com.slidemenu.lib.g) com.slidemenu.lib.SlidingMenu
   // $FF: synthetic method
   static SlidingMenu method_2056(class_638 var0) {
      return var0.field_2143;
   }

   // $FF: renamed from: a (int) android.view.View
   public View method_2057(int var1) {
      if (this.field_2143 != null) {
         View var2 = this.field_2143.findViewById(var1);
         if (var2 != null) {
            return var2;
         }
      }

      return null;
   }

   // $FF: renamed from: a () com.slidemenu.lib.SlidingMenu
   public SlidingMenu method_2058() {
      return this.field_2143;
   }

   // $FF: renamed from: a (android.os.Bundle) void
   public void method_2059(Bundle var1) {
      this.field_2143 = (SlidingMenu)LayoutInflater.from(this.field_2142).inflate(2130903056, (ViewGroup)null);
   }

   // $FF: renamed from: a (android.view.View, android.view.ViewGroup.LayoutParams) void
   public void method_2060(View var1, LayoutParams var2) {
      if (!this.field_2146) {
         this.field_2144 = var1;
      }

   }

   // $FF: renamed from: a (int, android.view.KeyEvent) boolean
   public boolean method_2061(int var1, KeyEvent var2) {
      if (var1 == 4 && this.field_2143.method_585()) {
         this.method_2062();
         return true;
      } else {
         return false;
      }
   }

   // $FF: renamed from: b () void
   public void method_2062() {
      this.field_2143.method_582();
   }

   // $FF: renamed from: b (android.os.Bundle) void
   public void method_2063(Bundle var1) {
      byte var2 = 1;
      boolean var4 = false;
      if (this.field_2145 != null && this.field_2144 != null) {
         this.field_2147 = true;
         SlidingMenu var5 = this.field_2143;
         Activity var6 = this.field_2142;
         if (this.field_2148) {
            var2 = 0;
         }

         var5.method_579(var6, var2);
         boolean var3;
         if (var1 != null) {
            var3 = var1.getBoolean("SlidingActivityHelper.open");
            var4 = var1.getBoolean("SlidingActivityHelper.secondary");
         } else {
            var3 = false;
         }

         (new Handler()).post(new class_639(this, var3, var4));
      } else {
         throw new IllegalStateException("Both setBehindContentView must be called in onCreate in addition to setContentView.");
      }
   }

   // $FF: renamed from: b (android.view.View, android.view.ViewGroup.LayoutParams) void
   public void method_2064(View var1, LayoutParams var2) {
      this.field_2145 = var1;
      this.field_2143.setMenu(this.field_2145);
   }

   // $FF: renamed from: c () void
   public void method_2065() {
      this.field_2143.method_577();
   }

   // $FF: renamed from: c (android.os.Bundle) void
   public void method_2066(Bundle var1) {
      var1.putBoolean("SlidingActivityHelper.open", this.field_2143.method_585());
      var1.putBoolean("SlidingActivityHelper.secondary", this.field_2143.method_586());
   }
}
