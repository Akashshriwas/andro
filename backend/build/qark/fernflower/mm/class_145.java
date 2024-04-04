package mm;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import com.a.f.class_128;
import java.util.ArrayList;

// $FF: renamed from: mm.a
public abstract class class_145 extends Fragment implements OnItemClickListener {
   // $FF: renamed from: N java.lang.Boolean
   protected Boolean field_450 = false;
   // $FF: renamed from: O com.a.f.e
   protected class_128 field_451;
   // $FF: renamed from: P android.widget.ListView
   public ListView field_452;
   // $FF: renamed from: Q java.util.ArrayList
   private ArrayList field_453;
   // $FF: renamed from: R java.lang.Runnable
   private Runnable field_454 = new class_584(this);

   // $FF: renamed from: a (mm.a) java.util.ArrayList
   // $FF: synthetic method
   static ArrayList method_636(class_145 var0) {
      return var0.field_453;
   }

   // $FF: renamed from: b (mm.a) java.lang.Runnable
   // $FF: synthetic method
   static Runnable method_637(class_145 var0) {
      return var0.field_454;
   }

   // $FF: renamed from: a (android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle) android.view.View
   public View method_595(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      View var4 = var1.inflate(this.method_640(), var2, false);
      if (var4 != null) {
         this.field_452 = (ListView)var4.findViewById(2131165194);
         this.method_638(var4);
      }

      return var4;
   }

   // $FF: renamed from: a (android.view.View) void
   public abstract void method_638(View var1);

   // $FF: renamed from: a (java.util.ArrayList) void
   public void method_639(ArrayList var1) {
      this.field_453 = var1;
   }

   // $FF: renamed from: b (android.os.Bundle) void
   public void method_609(Bundle var1) {
      super.method_609(var1);
      this.b(true);
   }

   // $FF: renamed from: c (android.os.Bundle) void
   public void method_615(Bundle var1) {
      super.method_615(var1);
      if (this.field_452 != null && this.method_641() != null) {
         this.field_452.setOnItemClickListener(this);
         this.field_451 = this.method_641();
         this.field_452.setAdapter(this.field_451);
         this.method_644();
      }

   }

   // $FF: renamed from: r () int
   public abstract int method_640();

   // $FF: renamed from: s () com.a.f.e
   public abstract class_128 method_641();

   // $FF: renamed from: t () java.util.ArrayList
   public abstract ArrayList method_642();

   // $FF: renamed from: u () java.util.ArrayList
   public ArrayList method_643() {
      return this.field_453;
   }

   // $FF: renamed from: v () void
   protected void method_644() {
      (new Thread(new class_596(this))).start();
   }
}
