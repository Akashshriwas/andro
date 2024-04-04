package com.google.android.gms.internal;

import java.io.IOException;

// $FF: renamed from: com.google.android.gms.internal.jf
public class class_410 extends IOException {
   class_410(int var1, int var2) {
      super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + var1 + " limit " + var2 + ").");
   }
}
