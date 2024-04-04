package com.slidemenu.lib;

import android.os.Bundle;
import android.support.v4.app.class_181;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

// $FF: renamed from: com.slidemenu.lib.i
public class class_182 extends class_181 {
   // $FF: renamed from: m com.slidemenu.lib.g
   private class_638 field_550;

   // $FF: renamed from: a (android.view.View, android.view.ViewGroup.LayoutParams) void
   public void method_704(View var1, LayoutParams var2) {
      this.field_550.method_2064(var1, var2);
   }

   // $FF: renamed from: b (int) void
   public void method_705(int var1) {
      this.setBehindContentView(this.getLayoutInflater().inflate(var1, (ViewGroup)null));
   }

   // $FF: renamed from: f () com.slidemenu.lib.SlidingMenu
   public SlidingMenu method_706() {
      return this.field_550.method_2058();
   }

   public View findViewById(int var1) {
      View var2 = super.findViewById(var1);
      return var2 != null ? var2 : this.field_550.method_2057(var1);
   }

   // $FF: renamed from: g () void
   public void method_707() {
      this.field_550.method_2062();
   }

   // $FF: renamed from: h () void
   public void method_708() {
      this.field_550.method_2065();
   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.field_550 = new class_638(this);
      this.field_550.method_2059(var1);
   }

   public boolean onKeyUp(int var1, KeyEvent var2) {
      boolean var3 = this.field_550.method_2061(var1, var2);
      return var3 ? var3 : super.onKeyUp(var1, var2);
   }

   public void onPostCreate(Bundle var1) {
      super.onPostCreate(var1);
      this.field_550.method_2063(var1);
   }

   protected void onSaveInstanceState(Bundle var1) {
      super.onSaveInstanceState(var1);
      this.field_550.method_2066(var1);
   }

   public void setBehindContentView(View var1) {
      this.method_704(var1, new LayoutParams(-1, -1));
   }

   public void setContentView(int var1) {
      this.setContentView(this.getLayoutInflater().inflate(var1, (ViewGroup)null));
   }

   public void setContentView(View var1) {
      this.setContentView(var1, new LayoutParams(-1, -1));
   }

   public void setContentView(View var1, LayoutParams var2) {
      super.setContentView(var1, var2);
      this.field_550.method_2060(var1, var2);
   }
}
