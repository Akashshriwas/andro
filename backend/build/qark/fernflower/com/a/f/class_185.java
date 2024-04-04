package com.a.f;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.class_181;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import com.a.e.class_23;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;

// $FF: renamed from: com.a.f.a
public abstract class class_185 extends class_181 implements OnItemClickListener {
   // $FF: renamed from: m com.a.f.e
   protected class_128 field_585;
   // $FF: renamed from: n android.widget.ListView
   public ListView field_586;
   // $FF: renamed from: o com.a.e.b
   public class_23 field_587 = new class_176(this);
   // $FF: renamed from: p java.util.ArrayList
   private ArrayList field_588;
   // $FF: renamed from: q java.lang.Thread.UncaughtExceptionHandler
   private UncaughtExceptionHandler field_589 = new class_189(this);

   // $FF: renamed from: a (com.a.f.a) java.util.ArrayList
   // $FF: synthetic method
   static ArrayList method_755(class_185 var0) {
      return var0.field_588;
   }

   // $FF: renamed from: a (android.widget.AdapterView, android.view.View, int) void
   protected void method_756(AdapterView var1, View var2, int var3) {
      this.startActivity(new Intent(var2.getContext(), this.method_762()));
   }

   // $FF: renamed from: a (java.util.ArrayList) void
   public void method_757(ArrayList var1) {
      this.field_588 = var1;
   }

   // $FF: renamed from: f () void
   public abstract void method_758();

   // $FF: renamed from: g () int
   public abstract int method_759();

   // $FF: renamed from: h () com.a.f.e
   public abstract class_128 method_760();

   // $FF: renamed from: i () java.util.ArrayList
   public abstract ArrayList method_761();

   // $FF: renamed from: j () java.lang.Class
   public abstract Class method_762();

   // $FF: renamed from: k () java.util.ArrayList
   public ArrayList method_763() {
      return this.field_588;
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.requestWindowFeature(1);
      Thread.setDefaultUncaughtExceptionHandler(this.field_589);
      if (this.method_759() != -1) {
         this.setContentView(this.method_759());
      }

      this.method_758();
      this.field_586 = (ListView)this.findViewById(2131165194);
      if (this.field_586 != null) {
         this.field_586.setOnItemClickListener(this);
      }

      if (this.field_586 != null && this.method_760() != null) {
         this.field_585 = this.method_760();
         this.field_586.setAdapter(this.field_585);
      }

      if (this.field_586 != null && this.field_585 != null) {
         (new class_178(this, (class_178)null)).execute(new Void[0]);
      }

   }

   public void onItemClick(AdapterView var1, View var2, int var3, long var4) {
      try {
         this.method_756(var1, var2, var3);
      } catch (Exception var6) {
         Log.w("onItemClick", "Has error");
      }
   }
}
