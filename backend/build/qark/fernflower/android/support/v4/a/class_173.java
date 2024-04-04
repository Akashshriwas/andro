package android.support.v4.a;

import android.support.v4.c.class_228;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// $FF: renamed from: android.support.v4.a.a
public class class_173 {
   // $FF: renamed from: a int
   int field_518;
   // $FF: renamed from: b android.support.v4.a.b
   class_24 field_519;
   // $FF: renamed from: c boolean
   boolean field_520;
   // $FF: renamed from: d boolean
   boolean field_521;
   // $FF: renamed from: e boolean
   boolean field_522;
   // $FF: renamed from: f boolean
   boolean field_523;

   // $FF: renamed from: a (java.lang.Object) java.lang.String
   public String method_680(Object var1) {
      StringBuilder var2 = new StringBuilder(64);
      class_228.method_848(var1, var2);
      var2.append("}");
      return var2.toString();
   }

   // $FF: renamed from: a () void
   public final void method_681() {
      this.field_520 = true;
      this.field_522 = false;
      this.field_521 = false;
      this.method_685();
   }

   // $FF: renamed from: a (int, android.support.v4.a.b) void
   public void method_682(int var1, class_24 var2) {
      if (this.field_519 != null) {
         throw new IllegalStateException("There is already a listener registered");
      } else {
         this.field_519 = var2;
         this.field_518 = var1;
      }
   }

   // $FF: renamed from: a (android.support.v4.a.b) void
   public void method_683(class_24 var1) {
      if (this.field_519 == null) {
         throw new IllegalStateException("No listener register");
      } else if (this.field_519 != var1) {
         throw new IllegalArgumentException("Attempting to unregister the wrong listener");
      } else {
         this.field_519 = null;
      }
   }

   // $FF: renamed from: a (java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]) void
   public void method_684(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      var3.print(var1);
      var3.print("mId=");
      var3.print(this.field_518);
      var3.print(" mListener=");
      var3.println(this.field_519);
      var3.print(var1);
      var3.print("mStarted=");
      var3.print(this.field_520);
      var3.print(" mContentChanged=");
      var3.print(this.field_523);
      var3.print(" mAbandoned=");
      var3.print(this.field_521);
      var3.print(" mReset=");
      var3.println(this.field_522);
   }

   // $FF: renamed from: b () void
   protected void method_685() {
   }

   // $FF: renamed from: c () void
   public void method_686() {
      this.field_520 = false;
      this.method_687();
   }

   // $FF: renamed from: d () void
   protected void method_687() {
   }

   // $FF: renamed from: e () void
   public void method_688() {
      this.method_689();
      this.field_522 = true;
      this.field_520 = false;
      this.field_521 = false;
      this.field_523 = false;
   }

   // $FF: renamed from: f () void
   protected void method_689() {
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(64);
      class_228.method_848(this, var1);
      var1.append(" id=");
      var1.append(this.field_518);
      var1.append("}");
      return var1.toString();
   }
}
