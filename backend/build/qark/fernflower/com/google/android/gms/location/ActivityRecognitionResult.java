package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class ActivityRecognitionResult implements SafeParcelable {
   // $FF: renamed from: a com.google.android.gms.location.a
   public static final class_285 field_2135 = new class_285();
   // $FF: renamed from: b java.util.List
   List field_2136;
   // $FF: renamed from: c long
   long field_2137;
   // $FF: renamed from: d long
   long field_2138;
   // $FF: renamed from: e int
   private final int field_2139 = 1;

   public ActivityRecognitionResult(int var1, List var2, long var3, long var5) {
      this.field_2136 = var2;
      this.field_2137 = var3;
      this.field_2138 = var5;
   }

   // $FF: renamed from: a () int
   public int method_2055() {
      return this.field_2139;
   }

   public int describeContents() {
      return 0;
   }

   public String toString() {
      return "ActivityRecognitionResult [probableActivities=" + this.field_2136 + ", timeMillis=" + this.field_2137 + ", elapsedRealtimeMillis=" + this.field_2138 + "]";
   }

   public void writeToParcel(Parcel var1, int var2) {
      class_285.method_982(this, var1, var2);
   }
}
