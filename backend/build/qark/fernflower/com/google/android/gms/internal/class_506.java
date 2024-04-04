package com.google.android.gms.internal;

import android.webkit.ConsoleMessage.MessageLevel;

// $FF: renamed from: com.google.android.gms.internal.fi
// $FF: synthetic class
class class_506 {
   // $FF: renamed from: a int[]
   // $FF: synthetic field
   static final int[] field_1542 = new int[MessageLevel.values().length];

   static {
      try {
         field_1542[MessageLevel.ERROR.ordinal()] = 1;
      } catch (NoSuchFieldError var5) {
      }

      try {
         field_1542[MessageLevel.WARNING.ordinal()] = 2;
      } catch (NoSuchFieldError var4) {
      }

      try {
         field_1542[MessageLevel.LOG.ordinal()] = 3;
      } catch (NoSuchFieldError var3) {
      }

      try {
         field_1542[MessageLevel.TIP.ordinal()] = 4;
      } catch (NoSuchFieldError var2) {
      }

      try {
         field_1542[MessageLevel.DEBUG.ordinal()] = 5;
      } catch (NoSuchFieldError var1) {
      }
   }
}
