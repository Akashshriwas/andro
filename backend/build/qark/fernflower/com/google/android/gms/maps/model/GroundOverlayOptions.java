package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.a.class_375;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.class_294;

public final class GroundOverlayOptions implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.maps.model.d
   public static final class_245 field_796 = new class_245();
   // $FF: renamed from: b int
   private final int field_797;
   // $FF: renamed from: c com.google.android.gms.maps.model.a
   private class_231 field_798;
   // $FF: renamed from: d com.google.android.gms.maps.model.LatLng
   private LatLng field_799;
   // $FF: renamed from: e float
   private float field_800;
   // $FF: renamed from: f float
   private float field_801;
   // $FF: renamed from: g com.google.android.gms.maps.model.LatLngBounds
   private LatLngBounds field_802;
   // $FF: renamed from: h float
   private float field_803;
   // $FF: renamed from: i float
   private float field_804;
   // $FF: renamed from: j boolean
   private boolean field_805 = true;
   // $FF: renamed from: k float
   private float field_806 = 0.0F;
   // $FF: renamed from: l float
   private float field_807 = 0.5F;
   // $FF: renamed from: m float
   private float field_808 = 0.5F;

   public GroundOverlayOptions() {
      this.field_797 = 1;
   }

   GroundOverlayOptions(int var1, IBinder var2, LatLng var3, float var4, float var5, LatLngBounds var6, float var7, float var8, boolean var9, float var10, float var11, float var12) {
      this.field_797 = var1;
      this.field_798 = new class_231(class_375.method_1292(var2));
      this.field_799 = var3;
      this.field_800 = var4;
      this.field_801 = var5;
      this.field_802 = var6;
      this.field_803 = var7;
      this.field_804 = var8;
      this.field_805 = var9;
      this.field_806 = var10;
      this.field_807 = var11;
      this.field_808 = var12;
   }

   // $FF: renamed from: a () android.os.IBinder
   IBinder method_994() {
      return this.field_798.method_866().asBinder();
   }

   // $FF: renamed from: b () int
   int method_995() {
      return this.field_797;
   }

   // $FF: renamed from: c () com.google.android.gms.maps.model.LatLng
   public LatLng method_996() {
      return this.field_799;
   }

   // $FF: renamed from: d () float
   public float method_997() {
      return this.field_800;
   }

   public int describeContents() {
      return 0;
   }

   // $FF: renamed from: e () float
   public float method_998() {
      return this.field_801;
   }

   // $FF: renamed from: f () com.google.android.gms.maps.model.LatLngBounds
   public LatLngBounds method_999() {
      return this.field_802;
   }

   // $FF: renamed from: g () float
   public float method_1000() {
      return this.field_803;
   }

   // $FF: renamed from: h () float
   public float method_1001() {
      return this.field_804;
   }

   // $FF: renamed from: i () float
   public float method_1002() {
      return this.field_806;
   }

   // $FF: renamed from: j () float
   public float method_1003() {
      return this.field_807;
   }

   // $FF: renamed from: k () float
   public float method_1004() {
      return this.field_808;
   }

   // $FF: renamed from: l () boolean
   public boolean method_1005() {
      return this.field_805;
   }

   public void writeToParcel(Parcel var1, int var2) {
      if (class_294.method_1007()) {
         class_235.method_877(this, var1, var2);
      } else {
         class_245.method_900(this, var1, var2);
      }
   }
}
