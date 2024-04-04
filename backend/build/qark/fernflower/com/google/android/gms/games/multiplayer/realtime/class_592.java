package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable.Creator;

// $FF: renamed from: com.google.android.gms.games.multiplayer.realtime.a
final class class_592 implements Creator {
   // $FF: renamed from: a (android.os.Parcel) com.google.android.gms.games.multiplayer.realtime.RealTimeMessage
   public RealTimeMessage method_1916(Parcel var1) {
      return new RealTimeMessage(var1, (class_592)null);
   }

   // $FF: renamed from: a (int) com.google.android.gms.games.multiplayer.realtime.RealTimeMessage[]
   public RealTimeMessage[] method_1917(int var1) {
      return new RealTimeMessage[var1];
   }

   // $FF: synthetic method
   public Object createFromParcel(Parcel var1) {
      return this.method_1916(var1);
   }

   // $FF: synthetic method
   public Object[] newArray(int var1) {
      return this.method_1917(var1);
   }
}
