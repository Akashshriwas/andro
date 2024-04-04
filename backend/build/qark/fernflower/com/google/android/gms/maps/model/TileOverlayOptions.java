package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.class_294;
import com.google.android.gms.maps.model.a.class_267;
import com.google.android.gms.maps.model.a.class_4;

public final class TileOverlayOptions implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.maps.model.l
   public static final class_238 field_719 = new class_238();
   // $FF: renamed from: b int
   private final int field_720;
   // $FF: renamed from: c com.google.android.gms.maps.model.a.a
   private class_4 field_721;
   // $FF: renamed from: d com.google.android.gms.maps.model.m
   private class_31 field_722;
   // $FF: renamed from: e boolean
   private boolean field_723 = true;
   // $FF: renamed from: f float
   private float field_724;
   // $FF: renamed from: g boolean
   private boolean field_725 = true;

   public TileOverlayOptions() {
      this.field_720 = 1;
   }

   TileOverlayOptions(int var1, IBinder var2, boolean var3, float var4, boolean var5) {
      this.field_720 = var1;
      this.field_721 = class_267.method_951(var2);
      class_240 var6;
      if (this.field_721 == null) {
         var6 = null;
      } else {
         var6 = new class_240(this);
      }

      this.field_722 = var6;
      this.field_723 = var3;
      this.field_724 = var4;
      this.field_725 = var5;
   }

   // $FF: renamed from: a (com.google.android.gms.maps.model.TileOverlayOptions) com.google.android.gms.maps.model.a.a
   // $FF: synthetic method
   static class_4 method_868(TileOverlayOptions var0) {
      return var0.field_721;
   }

   // $FF: renamed from: a () int
   int method_869() {
      return this.field_720;
   }

   // $FF: renamed from: b () android.os.IBinder
   IBinder method_870() {
      return this.field_721.asBinder();
   }

   // $FF: renamed from: c () float
   public float method_871() {
      return this.field_724;
   }

   // $FF: renamed from: d () boolean
   public boolean method_872() {
      return this.field_723;
   }

   public int describeContents() {
      return 0;
   }

   // $FF: renamed from: e () boolean
   public boolean method_873() {
      return this.field_725;
   }

   public void writeToParcel(Parcel var1, int var2) {
      if (class_294.method_1007()) {
         class_191.method_806(this, var1, var2);
      } else {
         class_238.method_882(this, var1, var2);
      }
   }
}
