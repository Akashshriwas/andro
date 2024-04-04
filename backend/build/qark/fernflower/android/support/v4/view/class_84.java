package android.support.v4.view;

import android.database.DataSetObserver;

// $FF: renamed from: android.support.v4.view.an
class class_84 extends DataSetObserver {
   // $FF: renamed from: a android.support.v4.view.ViewPager
   // $FF: synthetic field
   final ViewPager field_2;

   private class_84(ViewPager var1) {
      this.field_2 = var1;
   }

   // $FF: synthetic method
   class_84(ViewPager var1, class_105 var2) {
      this(var1);
   }

   public void onChanged() {
      this.field_2.method_2187();
   }

   public void onInvalidated() {
      this.field_2.method_2187();
   }
}
