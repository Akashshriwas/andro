package android.support.v4.c;

import android.util.Log;
import java.io.Writer;

// $FF: renamed from: android.support.v4.c.b
public class class_226 extends Writer {
   // $FF: renamed from: a java.lang.String
   private final String field_702;
   // $FF: renamed from: b java.lang.StringBuilder
   private StringBuilder field_703 = new StringBuilder(128);

   public class_226(String var1) {
      this.field_702 = var1;
   }

   // $FF: renamed from: a () void
   private void method_844() {
      if (this.field_703.length() > 0) {
         Log.d(this.field_702, this.field_703.toString());
         this.field_703.delete(0, this.field_703.length());
      }

   }

   public void close() {
      this.method_844();
   }

   public void flush() {
      this.method_844();
   }

   public void write(char[] var1, int var2, int var3) {
      for(int var5 = 0; var5 < var3; ++var5) {
         char var4 = var1[var2 + var5];
         if (var4 == '\n') {
            this.method_844();
         } else {
            this.field_703.append(var4);
         }
      }

   }
}
