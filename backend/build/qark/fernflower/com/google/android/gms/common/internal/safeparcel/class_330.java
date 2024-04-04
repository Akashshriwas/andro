package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;

// $FF: renamed from: com.google.android.gms.common.internal.safeparcel.b
public class class_330 extends RuntimeException {
   public class_330(String var1, Parcel var2) {
      super(var1 + " Parcel: pos=" + var2.dataPosition() + " size=" + var2.dataSize());
   }
}
