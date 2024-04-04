package mm;

import android.content.Intent;
import android.os.AsyncTask;

// $FF: renamed from: mm.bd
class class_201 extends AsyncTask {
   // $FF: renamed from: a mm.sp
   // $FF: synthetic field
   final class_519 field_647;

   class_201(class_519 var1) {
      this.field_647 = var1;
   }

   // $FF: renamed from: a (java.lang.Boolean[]) java.lang.Boolean
   protected Boolean method_813(Boolean... var1) {
      return class_519.method_1770(this.field_647);
   }

   // $FF: renamed from: a (java.lang.Boolean) void
   protected void method_814(Boolean var1) {
      Intent var2 = new Intent(this.field_647.getApplication(), m.class);
      var2.setFlags(67108864);
      this.field_647.startActivity(var2);
      this.field_647.finish();
   }

   // $FF: synthetic method
   protected Object doInBackground(Object... var1) {
      return this.method_813((Boolean[])var1);
   }

   // $FF: synthetic method
   protected void onPostExecute(Object var1) {
      this.method_814((Boolean)var1);
   }

   protected void onPreExecute() {
      super.onPreExecute();
   }
}
