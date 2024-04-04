package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.class_150;
import com.google.android.gms.ads.class_626;
import com.google.android.gms.ads.a.class_22;

// $FF: renamed from: com.google.android.gms.internal.p
public final class class_604 {
   // $FF: renamed from: a com.google.android.gms.internal.bk
   private final class_558 field_2007 = new class_558();
   // $FF: renamed from: b com.google.android.gms.ads.a
   private class_150 field_2008;
   // $FF: renamed from: c com.google.android.gms.internal.e
   private class_81 field_2009;
   // $FF: renamed from: d com.google.android.gms.ads.e[]
   private class_626[] field_2010;
   // $FF: renamed from: e java.lang.String
   private String field_2011;
   // $FF: renamed from: f android.view.ViewGroup
   private ViewGroup field_2012;
   // $FF: renamed from: g com.google.android.gms.ads.a.a
   private class_22 field_2013;

   public class_604(ViewGroup var1) {
      this.field_2012 = var1;
   }

   // $FF: renamed from: d () void
   private void method_1927() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () void
   private void method_1928() {
      if ((this.field_2010 == null || this.field_2011 == null) && this.field_2009 == null) {
         throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
      } else {
         Context var1 = this.field_2012.getContext();
         this.field_2009 = class_380.method_1304(var1, new class_607(var1, this.field_2010), this.field_2011, this.field_2007);
         if (this.field_2008 != null) {
            this.field_2009.method_203(new class_393(this.field_2008));
         }

         if (this.field_2013 != null) {
            this.field_2009.method_204(new class_271(this.field_2013));
         }

         this.method_1927();
      }
   }

   // $FF: renamed from: a () com.google.android.gms.ads.a
   public class_150 method_1929() {
      return this.field_2008;
   }

   // $FF: renamed from: a (com.google.android.gms.ads.a) void
   public void method_1930(class_150 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (com.google.android.gms.internal.n) void
   public void method_1931(class_583 var1) {
      try {
         if (this.field_2009 == null) {
            this.method_1928();
         }

         if (this.field_2009.method_206(new class_597(this.field_2012.getContext(), var1))) {
            this.field_2007.method_1851(var1.method_1901());
         }

      } catch (RemoteException var2) {
         class_467.method_1607("Failed to load ad.", var2);
      }
   }

   // $FF: renamed from: a (java.lang.String) void
   public void method_1932(String var1) {
      if (this.field_2011 != null) {
         throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
      } else {
         this.field_2011 = var1;
      }
   }

   // $FF: renamed from: a (com.google.android.gms.ads.e[]) void
   public void method_1933(class_626... var1) {
      if (this.field_2010 != null) {
         throw new IllegalStateException("The ad size can only be set once on AdView.");
      } else {
         this.method_1935(var1);
      }
   }

   // $FF: renamed from: b () com.google.android.gms.ads.e
   public class_626 method_1934() {
      try {
         if (this.field_2009 != null) {
            class_626 var1 = this.field_2009.method_214().method_1945();
            return var1;
         }
      } catch (RemoteException var2) {
         class_467.method_1607("Failed to get the current AdSize.", var2);
      }

      return this.field_2010 != null ? this.field_2010[0] : null;
   }

   // $FF: renamed from: b (com.google.android.gms.ads.e[]) void
   public void method_1935(class_626... var1) {
      this.field_2010 = var1;

      try {
         if (this.field_2009 != null) {
            this.field_2009.method_205(new class_607(this.field_2012.getContext(), this.field_2010));
         }
      } catch (RemoteException var2) {
         class_467.method_1607("Failed to set the ad size.", var2);
      }

      this.field_2012.requestLayout();
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1936() {
      return this.field_2011;
   }
}
