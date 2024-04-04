package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.a.class_173;
import android.support.v4.a.class_24;
import android.support.v4.c.class_228;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

// $FF: renamed from: android.support.v4.app.z
final class class_624 implements class_24 {
   // $FF: renamed from: a int
   final int field_2102;
   // $FF: renamed from: b android.os.Bundle
   final Bundle field_2103;
   // $FF: renamed from: c android.support.v4.app.x
   class_73 field_2104;
   // $FF: renamed from: d android.support.v4.a.a
   class_173 field_2105;
   // $FF: renamed from: e boolean
   boolean field_2106;
   // $FF: renamed from: f boolean
   boolean field_2107;
   // $FF: renamed from: g java.lang.Object
   Object field_2108;
   // $FF: renamed from: h boolean
   boolean field_2109;
   // $FF: renamed from: i boolean
   boolean field_2110;
   // $FF: renamed from: j boolean
   boolean field_2111;
   // $FF: renamed from: k boolean
   boolean field_2112;
   // $FF: renamed from: l boolean
   boolean field_2113;
   // $FF: renamed from: m boolean
   boolean field_2114;
   // $FF: renamed from: n android.support.v4.app.z
   class_624 field_2115;
   // $FF: renamed from: o android.support.v4.app.y
   // $FF: synthetic field
   final class_623 field_2116;

   // $FF: renamed from: a () void
   void method_2034() {
      if (this.field_2110 && this.field_2111) {
         this.field_2109 = true;
      } else if (!this.field_2109) {
         this.field_2109 = true;
         if (class_623.field_2096) {
            Log.v("LoaderManager", "  Starting: " + this);
         }

         if (this.field_2105 == null && this.field_2104 != null) {
            this.field_2105 = this.field_2104.method_191(this.field_2102, this.field_2103);
         }

         if (this.field_2105 != null) {
            if (this.field_2105.getClass().isMemberClass() && !Modifier.isStatic(this.field_2105.getClass().getModifiers())) {
               throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.field_2105);
            }

            if (!this.field_2114) {
               this.field_2105.method_682(this.field_2102, this);
               this.field_2114 = true;
            }

            this.field_2105.method_681();
            return;
         }
      }

   }

   // $FF: renamed from: a (android.support.v4.a.a, java.lang.Object) void
   void method_2035(class_173 var1, Object var2) {
      if (this.field_2104 != null) {
         String var3;
         if (this.field_2116.field_2099 != null) {
            var3 = this.field_2116.field_2099.field_539.field_2061;
            this.field_2116.field_2099.field_539.field_2061 = "onLoadFinished";
         } else {
            var3 = null;
         }

         try {
            if (class_623.field_2096) {
               Log.v("LoaderManager", "  onLoadFinished in " + var1 + ": " + var1.method_680(var2));
            }

            this.field_2104.method_193(var1, var2);
         } finally {
            if (this.field_2116.field_2099 != null) {
               this.field_2116.field_2099.field_539.field_2061 = var3;
            }

         }

         this.field_2107 = true;
      }

   }

   // $FF: renamed from: a (java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]) void
   public void method_2036(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      var3.print(var1);
      var3.print("mId=");
      var3.print(this.field_2102);
      var3.print(" mArgs=");
      var3.println(this.field_2103);
      var3.print(var1);
      var3.print("mCallbacks=");
      var3.println(this.field_2104);
      var3.print(var1);
      var3.print("mLoader=");
      var3.println(this.field_2105);
      if (this.field_2105 != null) {
         this.field_2105.method_684(var1 + "  ", var2, var3, var4);
      }

      if (this.field_2106 || this.field_2107) {
         var3.print(var1);
         var3.print("mHaveData=");
         var3.print(this.field_2106);
         var3.print("  mDeliveredData=");
         var3.println(this.field_2107);
         var3.print(var1);
         var3.print("mData=");
         var3.println(this.field_2108);
      }

      var3.print(var1);
      var3.print("mStarted=");
      var3.print(this.field_2109);
      var3.print(" mReportNextStart=");
      var3.print(this.field_2112);
      var3.print(" mDestroyed=");
      var3.println(this.field_2113);
      var3.print(var1);
      var3.print("mRetaining=");
      var3.print(this.field_2110);
      var3.print(" mRetainingStarted=");
      var3.print(this.field_2111);
      var3.print(" mListenerRegistered=");
      var3.println(this.field_2114);
      if (this.field_2115 != null) {
         var3.print(var1);
         var3.println("Pending Loader ");
         var3.print(this.field_2115);
         var3.println(":");
         this.field_2115.method_2036(var1 + "  ", var2, var3, var4);
      }

   }

   // $FF: renamed from: b () void
   void method_2037() {
      if (class_623.field_2096) {
         Log.v("LoaderManager", "  Retaining: " + this);
      }

      this.field_2110 = true;
      this.field_2111 = this.field_2109;
      this.field_2109 = false;
      this.field_2104 = null;
   }

   // $FF: renamed from: c () void
   void method_2038() {
      if (this.field_2110) {
         if (class_623.field_2096) {
            Log.v("LoaderManager", "  Finished Retaining: " + this);
         }

         this.field_2110 = false;
         if (this.field_2109 != this.field_2111 && !this.field_2109) {
            this.method_2040();
         }
      }

      if (this.field_2109 && this.field_2106 && !this.field_2112) {
         this.method_2035(this.field_2105, this.field_2108);
      }

   }

   // $FF: renamed from: d () void
   void method_2039() {
      if (this.field_2109 && this.field_2112) {
         this.field_2112 = false;
         if (this.field_2106) {
            this.method_2035(this.field_2105, this.field_2108);
         }
      }

   }

   // $FF: renamed from: e () void
   void method_2040() {
      if (class_623.field_2096) {
         Log.v("LoaderManager", "  Stopping: " + this);
      }

      this.field_2109 = false;
      if (!this.field_2110 && this.field_2105 != null && this.field_2114) {
         this.field_2114 = false;
         this.field_2105.method_683(this);
         this.field_2105.method_686();
      }

   }

   // $FF: renamed from: f () void
   void method_2041() {
      if (class_623.field_2096) {
         Log.v("LoaderManager", "  Destroying: " + this);
      }

      this.field_2113 = true;
      boolean var1 = this.field_2107;
      this.field_2107 = false;
      if (this.field_2104 != null && this.field_2105 != null && this.field_2106 && var1) {
         if (class_623.field_2096) {
            Log.v("LoaderManager", "  Reseting: " + this);
         }

         String var2;
         if (this.field_2116.field_2099 != null) {
            var2 = this.field_2116.field_2099.field_539.field_2061;
            this.field_2116.field_2099.field_539.field_2061 = "onLoaderReset";
         } else {
            var2 = null;
         }

         try {
            this.field_2104.method_192(this.field_2105);
         } finally {
            if (this.field_2116.field_2099 != null) {
               this.field_2116.field_2099.field_539.field_2061 = var2;
            }

         }
      }

      this.field_2104 = null;
      this.field_2108 = null;
      this.field_2106 = false;
      if (this.field_2105 != null) {
         if (this.field_2114) {
            this.field_2114 = false;
            this.field_2105.method_683(this);
         }

         this.field_2105.method_688();
      }

      if (this.field_2115 != null) {
         this.field_2115.method_2041();
      }

   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(64);
      var1.append("LoaderInfo{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append(" #");
      var1.append(this.field_2102);
      var1.append(" : ");
      class_228.method_848(this.field_2105, var1);
      var1.append("}}");
      return var1.toString();
   }
}
