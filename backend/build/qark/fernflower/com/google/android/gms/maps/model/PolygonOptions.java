package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.class_294;
import java.util.ArrayList;
import java.util.List;

public final class PolygonOptions implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.maps.model.h
   public static final class_241 field_508 = new class_241();
   // $FF: renamed from: b int
   private final int field_509;
   // $FF: renamed from: c java.util.List
   private final List field_510;
   // $FF: renamed from: d java.util.List
   private final List field_511;
   // $FF: renamed from: e float
   private float field_512 = 10.0F;
   // $FF: renamed from: f int
   private int field_513 = -16777216;
   // $FF: renamed from: g int
   private int field_514 = 0;
   // $FF: renamed from: h float
   private float field_515 = 0.0F;
   // $FF: renamed from: i boolean
   private boolean field_516 = true;
   // $FF: renamed from: j boolean
   private boolean field_517 = false;

   public PolygonOptions() {
      this.field_509 = 1;
      this.field_510 = new ArrayList();
      this.field_511 = new ArrayList();
   }

   PolygonOptions(int var1, List var2, List var3, float var4, int var5, int var6, float var7, boolean var8, boolean var9) {
      this.field_509 = var1;
      this.field_510 = var2;
      this.field_511 = var3;
      this.field_512 = var4;
      this.field_513 = var5;
      this.field_514 = var6;
      this.field_515 = var7;
      this.field_516 = var8;
      this.field_517 = var9;
   }

   // $FF: renamed from: a () int
   int method_671() {
      return this.field_509;
   }

   // $FF: renamed from: b () java.util.List
   List method_672() {
      return this.field_511;
   }

   // $FF: renamed from: c () java.util.List
   public List method_673() {
      return this.field_510;
   }

   // $FF: renamed from: d () float
   public float method_674() {
      return this.field_512;
   }

   public int describeContents() {
      return 0;
   }

   // $FF: renamed from: e () int
   public int method_675() {
      return this.field_513;
   }

   // $FF: renamed from: f () int
   public int method_676() {
      return this.field_514;
   }

   // $FF: renamed from: g () float
   public float method_677() {
      return this.field_515;
   }

   // $FF: renamed from: h () boolean
   public boolean method_678() {
      return this.field_516;
   }

   // $FF: renamed from: i () boolean
   public boolean method_679() {
      return this.field_517;
   }

   public void writeToParcel(Parcel var1, int var2) {
      if (class_294.method_1007()) {
         class_196.method_811(this, var1, var2);
      } else {
         class_241.method_888(this, var1, var2);
      }
   }
}
