package mm;

import android.os.Bundle;
import android.support.v4.app.class_143;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.AdapterView.OnItemClickListener;

// $FF: renamed from: mm.l
public class class_144 extends class_143 {
   // $FF: renamed from: V mm.p
   public class_80 field_444;
   // $FF: renamed from: W mm.k
   public class_131 field_445;
   // $FF: renamed from: X int
   int field_446 = 0;
   // $FF: renamed from: Y android.widget.ImageView
   private ImageView field_447;
   // $FF: renamed from: Z android.view.View.OnClickListener
   private OnClickListener field_448 = new class_603(this);
   // $FF: renamed from: aa android.widget.AdapterView.OnItemClickListener
   private OnItemClickListener field_449 = new class_655(this);

   // $FF: renamed from: a (android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle) android.view.View
   public View method_595(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      return var1.inflate(2130903044, (ViewGroup)null);
   }

   // $FF: renamed from: c (android.os.Bundle) void
   public void method_615(Bundle var1) {
      super.c(var1);
      this.r().setOnItemClickListener(this.field_449);
      this.field_445 = new class_131(this.c());
      this.a(this.field_445);
      this.field_447 = (ImageView)this.c().findViewById(2131165201);
      this.field_447.setOnClickListener(this.field_448);
   }
}
