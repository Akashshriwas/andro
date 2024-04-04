package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.ads.d.class_225;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// $FF: renamed from: com.google.android.gms.internal.ai
public final class class_530 implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.internal.q
   public static final class_605 field_1636 = new class_605();
   // $FF: renamed from: b int
   public final int field_1637;
   // $FF: renamed from: c int
   public final int field_1638;
   // $FF: renamed from: d int
   public final int field_1639;
   // $FF: renamed from: e int
   public final int field_1640;
   // $FF: renamed from: f int
   public final int field_1641;
   // $FF: renamed from: g int
   public final int field_1642;
   // $FF: renamed from: h int
   public final int field_1643;
   // $FF: renamed from: i int
   public final int field_1644;
   // $FF: renamed from: j int
   public final int field_1645;
   // $FF: renamed from: k java.lang.String
   public final String field_1646;
   // $FF: renamed from: l int
   public final int field_1647;
   // $FF: renamed from: m java.lang.String
   public final String field_1648;
   // $FF: renamed from: n int
   public final int field_1649;
   // $FF: renamed from: o int
   public final int field_1650;
   // $FF: renamed from: p java.lang.String
   public final String field_1651;

   class_530(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, String var10, int var11, String var12, int var13, int var14, String var15) {
      this.field_1637 = var1;
      this.field_1638 = var2;
      this.field_1639 = var3;
      this.field_1640 = var4;
      this.field_1641 = var5;
      this.field_1642 = var6;
      this.field_1643 = var7;
      this.field_1644 = var8;
      this.field_1645 = var9;
      this.field_1646 = var10;
      this.field_1647 = var11;
      this.field_1648 = var12;
      this.field_1649 = var13;
      this.field_1650 = var14;
      this.field_1651 = var15;
   }

   public class_530(class_225 var1) {
      this.field_1637 = 1;
      this.field_1638 = var1.method_830();
      this.field_1639 = var1.method_831();
      this.field_1640 = var1.method_832();
      this.field_1641 = var1.method_833();
      this.field_1642 = var1.method_834();
      this.field_1643 = var1.method_835();
      this.field_1644 = var1.method_836();
      this.field_1645 = var1.method_837();
      this.field_1646 = var1.method_838();
      this.field_1647 = var1.method_839();
      this.field_1648 = var1.method_840();
      this.field_1649 = var1.method_841();
      this.field_1650 = var1.method_842();
      this.field_1651 = var1.method_843();
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_605.method_1937(this, var1, var2);
   }
}
