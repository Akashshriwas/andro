package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Fragment$SavedState implements Parcelable {
   public static final Creator CREATOR = new class_621();
   // $FF: renamed from: a android.os.Bundle
   final Bundle field_782;

   Fragment$SavedState(Parcel var1, ClassLoader var2) {
      this.field_782 = var1.readBundle();
      if (var2 != null && this.field_782 != null) {
         this.field_782.setClassLoader(var2);
      }

   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeBundle(this.field_782);
   }
}
