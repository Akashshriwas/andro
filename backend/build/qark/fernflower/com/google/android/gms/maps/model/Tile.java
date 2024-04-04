package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.class_294;

public final class Tile implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.maps.model.j
   public static final class_239 field_101 = new class_239();
   // $FF: renamed from: b int
   public final int field_102;
   // $FF: renamed from: c int
   public final int field_103;
   // $FF: renamed from: d byte[]
   public final byte[] field_104;
   // $FF: renamed from: e int
   private final int field_105;

   Tile(int var1, int var2, int var3, byte[] var4) {
      this.field_105 = var1;
      this.field_102 = var2;
      this.field_103 = var3;
      this.field_104 = var4;
   }

   public Tile(int var1, int var2, byte[] var3) {
      this(1, var1, var2, var3);
   }

   // $FF: renamed from: a () int
   int method_291() {
      return this.field_105;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      if (class_294.method_1007()) {
         class_194.method_809(this, var1, var2);
      } else {
         class_239.method_885(this, var1, var2);
      }
   }
}
