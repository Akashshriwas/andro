package com.a.f;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

// $FF: renamed from: com.a.f.e
public abstract class class_128 extends BaseAdapter {
   // $FF: renamed from: a java.util.ArrayList
   ArrayList field_140;
   // $FF: renamed from: b android.content.Context
   Context field_141;
   // $FF: renamed from: c android.view.LayoutInflater
   protected LayoutInflater field_142;

   public class_128(Context var1) {
      this.field_141 = var1;
      var1 = this.method_386();
      this.method_386();
      this.field_142 = (LayoutInflater)var1.getSystemService("layout_inflater");
      if (this.method_385() == null) {
         this.field_140 = this.method_383();
      }

   }

   // $FF: renamed from: a (java.lang.Object, android.view.View, int) android.view.View
   public abstract View method_382(Object var1, View var2, int var3);

   // $FF: renamed from: a () java.util.ArrayList
   public ArrayList method_383() {
      return new ArrayList();
   }

   // $FF: renamed from: a (java.util.ArrayList) void
   public void method_384(ArrayList var1) {
      this.field_140 = var1;
   }

   // $FF: renamed from: b () java.util.ArrayList
   public ArrayList method_385() {
      return this.field_140;
   }

   // $FF: renamed from: c () android.content.Context
   public Context method_386() {
      return this.field_141;
   }

   public int getCount() {
      return this.field_140 != null ? this.field_140.size() : 0;
   }

   public Object getItem(int var1) {
      return this.field_140.get(var1);
   }

   public long getItemId(int var1) {
      return 0L;
   }

   public View getView(int var1, View var2, ViewGroup var3) {
      try {
         View var5 = this.method_382(this.field_140.get(var1), var2, var1);
         return var5;
      } catch (Exception var4) {
         return var2;
      }
   }
}
