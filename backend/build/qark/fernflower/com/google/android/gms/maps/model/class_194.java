package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.maps.model.w
public class class_194 {
   // $FF: renamed from: a (com.google.android.gms.maps.model.Tile, android.os.Parcel, int) void
   static void method_809(Tile var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_291());
      class_333.method_1140(var1, 2, var0.field_102);
      class_333.method_1140(var1, 3, var0.field_103);
      class_333.method_1151(var1, 4, var0.field_104, false);
      class_333.method_1136(var1, var2);
   }
}
