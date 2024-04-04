package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.class_333;

// $FF: renamed from: com.google.android.gms.maps.model.s
public class class_233 {
   // $FF: renamed from: a (com.google.android.gms.maps.model.LatLng, android.os.Parcel, int) void
   static void method_875(LatLng var0, Parcel var1, int var2) {
      var2 = class_333.method_1135(var1);
      class_333.method_1140(var1, 1, var0.method_816());
      class_333.method_1138(var1, 2, var0.field_649);
      class_333.method_1138(var1, 3, var0.field_650);
      class_333.method_1136(var1, var2);
   }
}
