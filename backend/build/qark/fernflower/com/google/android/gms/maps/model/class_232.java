package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.maps.model.r
public class class_232 {
   // $FF: renamed from: a (com.google.android.gms.maps.model.LatLngBounds, android.os.Parcel, int) void
   static void method_874(LatLngBounds var0, Parcel var1, int var2) {
      int var3 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_1703());
      class_333.method_1145(var1, 2, var0.field_1407, var2, false);
      class_333.method_1145(var1, 3, var0.field_1408, var2, false);
      class_333.method_1136(var1, var3);
   }
}
