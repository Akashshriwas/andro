package android.support.v4.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;

// $FF: renamed from: android.support.v4.b.b
class class_197 implements Creator {
   // $FF: renamed from: a android.support.v4.b.c
   final class_30 field_644;

   public class_197(class_30 var1) {
      this.field_644 = var1;
   }

   public Object createFromParcel(Parcel var1) {
      return this.field_644.method_83(var1, (ClassLoader)null);
   }

   public Object[] newArray(int var1) {
      return this.field_644.method_84(var1);
   }
}
