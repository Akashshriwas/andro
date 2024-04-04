package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

// $FF: renamed from: android.support.v4.view.k
public abstract class class_253 {
   // $FF: renamed from: a android.database.DataSetObservable
   private DataSetObservable field_744;

   // $FF: renamed from: a (int) float
   public float method_915(int var1) {
      return 1.0F;
   }

   // $FF: renamed from: a () int
   public abstract int method_916();

   // $FF: renamed from: a (java.lang.Object) int
   public int method_917(Object var1) {
      return -1;
   }

   // $FF: renamed from: a (android.view.View, int) java.lang.Object
   public Object method_918(View var1, int var2) {
      throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
   }

   // $FF: renamed from: a (android.view.ViewGroup, int) java.lang.Object
   public Object method_919(ViewGroup var1, int var2) {
      return this.method_918(var1, var2);
   }

   // $FF: renamed from: a (android.database.DataSetObserver) void
   void method_920(DataSetObserver var1) {
      this.field_744.registerObserver(var1);
   }

   // $FF: renamed from: a (android.os.Parcelable, java.lang.ClassLoader) void
   public void method_921(Parcelable var1, ClassLoader var2) {
   }

   // $FF: renamed from: a (android.view.View) void
   public void method_922(View var1) {
   }

   // $FF: renamed from: a (android.view.View, int, java.lang.Object) void
   public void method_923(View var1, int var2, Object var3) {
      throw new UnsupportedOperationException("Required method destroyItem was not overridden");
   }

   // $FF: renamed from: a (android.view.ViewGroup) void
   public void method_924(ViewGroup var1) {
      this.method_922(var1);
   }

   // $FF: renamed from: a (android.view.ViewGroup, int, java.lang.Object) void
   public void method_925(ViewGroup var1, int var2, Object var3) {
      this.method_923(var1, var2, var3);
   }

   // $FF: renamed from: a (android.view.View, java.lang.Object) boolean
   public abstract boolean method_926(View var1, Object var2);

   // $FF: renamed from: b () android.os.Parcelable
   public Parcelable method_927() {
      return null;
   }

   // $FF: renamed from: b (android.database.DataSetObserver) void
   void method_928(DataSetObserver var1) {
      this.field_744.unregisterObserver(var1);
   }

   // $FF: renamed from: b (android.view.View) void
   public void method_929(View var1) {
   }

   // $FF: renamed from: b (android.view.View, int, java.lang.Object) void
   public void method_930(View var1, int var2, Object var3) {
   }

   // $FF: renamed from: b (android.view.ViewGroup) void
   public void method_931(ViewGroup var1) {
      this.method_929(var1);
   }

   // $FF: renamed from: b (android.view.ViewGroup, int, java.lang.Object) void
   public void method_932(ViewGroup var1, int var2, Object var3) {
      this.method_930(var1, var2, var3);
   }
}
