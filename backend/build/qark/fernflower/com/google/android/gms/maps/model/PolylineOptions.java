package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.class_294;
import java.util.ArrayList;
import java.util.List;

public final class PolylineOptions implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.maps.model.i
   public static final class_242 field_1590 = new class_242();
   // $FF: renamed from: b int
   private final int field_1591;
   // $FF: renamed from: c java.util.List
   private final List field_1592;
   // $FF: renamed from: d float
   private float field_1593 = 10.0F;
   // $FF: renamed from: e int
   private int field_1594 = -16777216;
   // $FF: renamed from: f float
   private float field_1595 = 0.0F;
   // $FF: renamed from: g boolean
   private boolean field_1596 = true;
   // $FF: renamed from: h boolean
   private boolean field_1597 = false;

   public PolylineOptions() {
      this.field_1591 = 1;
      this.field_1592 = new ArrayList();
   }

   PolylineOptions(int var1, List var2, float var3, int var4, float var5, boolean var6, boolean var7) {
      this.field_1591 = var1;
      this.field_1592 = var2;
      this.field_1593 = var3;
      this.field_1594 = var4;
      this.field_1595 = var5;
      this.field_1596 = var6;
      this.field_1597 = var7;
   }

   // $FF: renamed from: a () int
   int method_1760() {
      return this.field_1591;
   }

   // $FF: renamed from: b () java.util.List
   public List method_1761() {
      return this.field_1592;
   }

   // $FF: renamed from: c () float
   public float method_1762() {
      return this.field_1593;
   }

   // $FF: renamed from: d () int
   public int method_1763() {
      return this.field_1594;
   }

   public int describeContents() {
      return 0;
   }

   // $FF: renamed from: e () float
   public float method_1764() {
      return this.field_1595;
   }

   // $FF: renamed from: f () boolean
   public boolean method_1765() {
      return this.field_1596;
   }

   // $FF: renamed from: g () boolean
   public boolean method_1766() {
      return this.field_1597;
   }

   public void writeToParcel(Parcel var1, int var2) {
      if (class_294.method_1007()) {
         class_193.method_808(this, var1, var2);
      } else {
         class_242.method_891(this, var1, var2);
      }
   }
}
