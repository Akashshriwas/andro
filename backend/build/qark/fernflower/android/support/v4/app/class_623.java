package android.support.v4.app;

import android.support.v4.c.class_228;
import android.support.v4.c.class_230;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// $FF: renamed from: android.support.v4.app.y
class class_623 extends class_622 {
   // $FF: renamed from: a boolean
   static boolean field_2096 = false;
   // $FF: renamed from: b android.support.v4.c.c
   final class_230 field_2097 = new class_230();
   // $FF: renamed from: c android.support.v4.c.c
   final class_230 field_2098 = new class_230();
   // $FF: renamed from: d android.support.v4.app.g
   class_181 field_2099;
   // $FF: renamed from: e boolean
   boolean field_2100;
   // $FF: renamed from: f boolean
   boolean field_2101;

   class_623(class_181 var1, boolean var2) {
      this.field_2099 = var1;
      this.field_2100 = var2;
   }

   // $FF: renamed from: a (android.support.v4.app.g) void
   void method_2025(class_181 var1) {
      this.field_2099 = var1;
   }

   // $FF: renamed from: a (java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]) void
   public void method_2026(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      byte var6 = 0;
      int var5;
      String var7;
      class_624 var8;
      if (this.field_2097.method_856() > 0) {
         var3.print(var1);
         var3.println("Active Loaders:");
         var7 = var1 + "    ";

         for(var5 = 0; var5 < this.field_2097.method_856(); ++var5) {
            var8 = (class_624)this.field_2097.method_865(var5);
            var3.print(var1);
            var3.print("  #");
            var3.print(this.field_2097.method_864(var5));
            var3.print(": ");
            var3.println(var8.toString());
            var8.method_2036(var7, var2, var3, var4);
         }
      }

      if (this.field_2098.method_856() > 0) {
         var3.print(var1);
         var3.println("Inactive Loaders:");
         var7 = var1 + "    ";

         for(var5 = var6; var5 < this.field_2098.method_856(); ++var5) {
            var8 = (class_624)this.field_2098.method_865(var5);
            var3.print(var1);
            var3.print("  #");
            var3.print(this.field_2098.method_864(var5));
            var3.print(": ");
            var3.println(var8.toString());
            var8.method_2036(var7, var2, var3, var4);
         }
      }

   }

   // $FF: renamed from: a () boolean
   public boolean method_2024() {
      int var3 = this.field_2097.method_856();
      int var1 = 0;

      boolean var4;
      for(var4 = false; var1 < var3; ++var1) {
         class_624 var5 = (class_624)this.field_2097.method_865(var1);
         boolean var2;
         if (var5.field_2109 && !var5.field_2107) {
            var2 = true;
         } else {
            var2 = false;
         }

         var4 |= var2;
      }

      return var4;
   }

   // $FF: renamed from: b () void
   void method_2027() {
      if (field_2096) {
         Log.v("LoaderManager", "Starting in " + this);
      }

      if (this.field_2100) {
         RuntimeException var2 = new RuntimeException("here");
         var2.fillInStackTrace();
         Log.w("LoaderManager", "Called doStart when already started: " + this, var2);
      } else {
         this.field_2100 = true;

         for(int var1 = this.field_2097.method_856() - 1; var1 >= 0; --var1) {
            ((class_624)this.field_2097.method_865(var1)).method_2034();
         }
      }

   }

   // $FF: renamed from: c () void
   void method_2028() {
      if (field_2096) {
         Log.v("LoaderManager", "Stopping in " + this);
      }

      if (!this.field_2100) {
         RuntimeException var2 = new RuntimeException("here");
         var2.fillInStackTrace();
         Log.w("LoaderManager", "Called doStop when not started: " + this, var2);
      } else {
         for(int var1 = this.field_2097.method_856() - 1; var1 >= 0; --var1) {
            ((class_624)this.field_2097.method_865(var1)).method_2040();
         }

         this.field_2100 = false;
      }
   }

   // $FF: renamed from: d () void
   void method_2029() {
      if (field_2096) {
         Log.v("LoaderManager", "Retaining in " + this);
      }

      if (!this.field_2100) {
         RuntimeException var2 = new RuntimeException("here");
         var2.fillInStackTrace();
         Log.w("LoaderManager", "Called doRetain when not started: " + this, var2);
      } else {
         this.field_2101 = true;
         this.field_2100 = false;

         for(int var1 = this.field_2097.method_856() - 1; var1 >= 0; --var1) {
            ((class_624)this.field_2097.method_865(var1)).method_2037();
         }
      }

   }

   // $FF: renamed from: e () void
   void method_2030() {
      if (this.field_2101) {
         if (field_2096) {
            Log.v("LoaderManager", "Finished Retaining in " + this);
         }

         this.field_2101 = false;

         for(int var1 = this.field_2097.method_856() - 1; var1 >= 0; --var1) {
            ((class_624)this.field_2097.method_865(var1)).method_2038();
         }
      }

   }

   // $FF: renamed from: f () void
   void method_2031() {
      for(int var1 = this.field_2097.method_856() - 1; var1 >= 0; --var1) {
         ((class_624)this.field_2097.method_865(var1)).field_2112 = true;
      }

   }

   // $FF: renamed from: g () void
   void method_2032() {
      for(int var1 = this.field_2097.method_856() - 1; var1 >= 0; --var1) {
         ((class_624)this.field_2097.method_865(var1)).method_2039();
      }

   }

   // $FF: renamed from: h () void
   void method_2033() {
      int var1;
      if (!this.field_2101) {
         if (field_2096) {
            Log.v("LoaderManager", "Destroying Active in " + this);
         }

         for(var1 = this.field_2097.method_856() - 1; var1 >= 0; --var1) {
            ((class_624)this.field_2097.method_865(var1)).method_2041();
         }
      }

      if (field_2096) {
         Log.v("LoaderManager", "Destroying Inactive in " + this);
      }

      for(var1 = this.field_2098.method_856() - 1; var1 >= 0; --var1) {
         ((class_624)this.field_2098.method_865(var1)).method_2041();
      }

      this.field_2098.method_859();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder(128);
      var1.append("LoaderManager{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append(" in ");
      class_228.method_848(this.field_2099, var1);
      var1.append("}}");
      return var1.toString();
   }
}
