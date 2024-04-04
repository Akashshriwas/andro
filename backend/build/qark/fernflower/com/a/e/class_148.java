package com.a.e;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView.OnEditorActionListener;
import dn.class_91;
import java.util.Timer;

// $FF: renamed from: com.a.e.a
public class class_148 extends Fragment {
   // $FF: renamed from: N android.widget.EditText
   public EditText field_458;
   // $FF: renamed from: O android.widget.Button
   protected Button field_459;
   // $FF: renamed from: P java.util.Timer
   private Timer field_460;
   // $FF: renamed from: Q android.widget.TextView.OnEditorActionListener
   private OnEditorActionListener field_461;
   // $FF: renamed from: R android.text.TextWatcher
   private TextWatcher field_462;
   // $FF: renamed from: S android.view.View.OnClickListener
   private OnClickListener field_463;

   // $FF: renamed from: a (android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle) android.view.View
   public View method_595(LayoutInflater var1, ViewGroup var2, Bundle var3) {
      View var4 = var1.inflate(2130903065, var2, false);
      this.field_459 = (Button)var4.findViewById(2131165246);
      if (this.field_459 != null) {
         this.field_459.setVisibility(8);
         this.field_459.setOnClickListener(this.field_463);
      }

      this.field_458 = (EditText)var4.findViewById(2131165245);
      if (this.field_458 != null) {
         String var5 = class_91.method_281().method_284(class_91.field_85);
         if (var5 != null) {
            this.field_458.setText(var5);
            this.field_459.setVisibility(0);
            this.field_458.setSelection(var5.length());
         }

         this.field_458.addTextChangedListener(this.field_462);
         this.field_458.setOnEditorActionListener(this.field_461);
      }

      return var4;
   }

   // $FF: renamed from: b (android.os.Bundle) void
   public void method_609(Bundle var1) {
      super.method_609(var1);
      this.field_460 = new Timer();
   }
}
