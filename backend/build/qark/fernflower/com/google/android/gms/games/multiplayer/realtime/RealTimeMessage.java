package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.class_343;

public final class RealTimeMessage implements Parcelable {
   public static final Creator CREATOR = new class_592();
   // $FF: renamed from: a java.lang.String
   private final String field_491;
   // $FF: renamed from: b byte[]
   private final byte[] field_492;
   // $FF: renamed from: c int
   private final int field_493;

   private RealTimeMessage(Parcel var1) {
      this(var1.readString(), var1.createByteArray(), var1.readInt());
   }

   // $FF: synthetic method
   RealTimeMessage(Parcel var1, class_592 var2) {
      this(var1);
   }

   public RealTimeMessage(String var1, byte[] var2, int var3) {
      this.field_491 = (String)class_343.method_1189(var1);
      this.field_492 = (byte[])((byte[])class_343.method_1189(var2)).clone();
      this.field_493 = var3;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeString(this.field_491);
      var1.writeByteArray(this.field_492);
      var1.writeInt(this.field_493);
   }
}
