package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.class_294;
import com.google.android.gms.maps.a.class_298;
import com.google.android.gms.maps.model.CameraPosition;

public final class GoogleMapOptions implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.maps.a
   public static final class_507 field_64 = new class_507();
   // $FF: renamed from: b int
   private final int field_65;
   // $FF: renamed from: c java.lang.Boolean
   private Boolean field_66;
   // $FF: renamed from: d java.lang.Boolean
   private Boolean field_67;
   // $FF: renamed from: e int
   private int field_68 = -1;
   // $FF: renamed from: f com.google.android.gms.maps.model.CameraPosition
   private CameraPosition field_69;
   // $FF: renamed from: g java.lang.Boolean
   private Boolean field_70;
   // $FF: renamed from: h java.lang.Boolean
   private Boolean field_71;
   // $FF: renamed from: i java.lang.Boolean
   private Boolean field_72;
   // $FF: renamed from: j java.lang.Boolean
   private Boolean field_73;
   // $FF: renamed from: k java.lang.Boolean
   private Boolean field_74;
   // $FF: renamed from: l java.lang.Boolean
   private Boolean field_75;

   public GoogleMapOptions() {
      this.field_65 = 1;
   }

   GoogleMapOptions(int var1, byte var2, byte var3, int var4, CameraPosition var5, byte var6, byte var7, byte var8, byte var9, byte var10, byte var11) {
      this.field_65 = var1;
      this.field_66 = class_298.method_1017(var2);
      this.field_67 = class_298.method_1017(var3);
      this.field_68 = var4;
      this.field_69 = var5;
      this.field_70 = class_298.method_1017(var6);
      this.field_71 = class_298.method_1017(var7);
      this.field_72 = class_298.method_1017(var8);
      this.field_73 = class_298.method_1017(var9);
      this.field_74 = class_298.method_1017(var10);
      this.field_75 = class_298.method_1017(var11);
   }

   // $FF: renamed from: a () int
   int method_270() {
      return this.field_65;
   }

   // $FF: renamed from: b () byte
   byte method_271() {
      return class_298.method_1016(this.field_66);
   }

   // $FF: renamed from: c () byte
   byte method_272() {
      return class_298.method_1016(this.field_67);
   }

   // $FF: renamed from: d () byte
   byte method_273() {
      return class_298.method_1016(this.field_70);
   }

   public int describeContents() {
      return 0;
   }

   // $FF: renamed from: e () byte
   byte method_274() {
      return class_298.method_1016(this.field_71);
   }

   // $FF: renamed from: f () byte
   byte method_275() {
      return class_298.method_1016(this.field_72);
   }

   // $FF: renamed from: g () byte
   byte method_276() {
      return class_298.method_1016(this.field_73);
   }

   // $FF: renamed from: h () byte
   byte method_277() {
      return class_298.method_1016(this.field_74);
   }

   // $FF: renamed from: i () byte
   byte method_278() {
      return class_298.method_1016(this.field_75);
   }

   // $FF: renamed from: j () int
   public int method_279() {
      return this.field_68;
   }

   // $FF: renamed from: k () com.google.android.gms.maps.model.CameraPosition
   public CameraPosition method_280() {
      return this.field_69;
   }

   public void writeToParcel(Parcel var1, int var2) {
      if (class_294.method_1007()) {
         class_512.method_1728(this, var1, var2);
      } else {
         class_507.method_1722(this, var1, var2);
      }
   }
}
