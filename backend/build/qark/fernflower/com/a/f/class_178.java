package com.a.f;

import android.os.AsyncTask;
import com.a.b.class_296;
import java.util.ArrayList;

// $FF: renamed from: com.a.f.d
class class_178 extends AsyncTask {
   // $FF: renamed from: a com.a.b.a
   class_296 field_534;
   // $FF: renamed from: b com.a.f.a
   // $FF: synthetic field
   final class_185 field_535;

   private class_178(class_185 var1) {
      this.field_535 = var1;
   }

   // $FF: synthetic method
   class_178(class_185 var1, class_178 var2) {
      this(var1);
   }

   // $FF: renamed from: a (java.lang.Void[]) java.lang.Void
   protected Void method_692(Void... var1) {
      try {
         new ArrayList();
         ArrayList var3 = this.field_535.method_761();
         this.field_535.method_757(var3);
      } catch (Exception var2) {
         this.field_534.dismiss();
      }

      return null;
   }

   // $FF: renamed from: a (java.lang.Void) void
   protected void method_693(Void var1) {
      this.field_534.dismiss();
      if (class_185.method_755(this.field_535) != null && class_185.method_755(this.field_535).size() > 0) {
         this.field_535.field_585.method_384(this.field_535.method_763());
         this.field_535.field_585.notifyDataSetChanged();
      } else {
         this.field_535.field_585.method_385().clear();
         this.field_535.field_585.notifyDataSetChanged();
      }
   }

   // $FF: synthetic method
   protected Object doInBackground(Object... var1) {
      return this.method_692((Void[])var1);
   }

   // $FF: synthetic method
   protected void onPostExecute(Object var1) {
      this.method_693((Void)var1);
   }

   protected void onPreExecute() {
      this.field_534 = new class_296(this.field_535.field_586.getContext());
      this.field_534.show();
   }
}
