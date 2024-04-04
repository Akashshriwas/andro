package com.google.android.gms.drive.metadata;

import com.google.android.gms.internal.class_343;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// $FF: renamed from: com.google.android.gms.drive.metadata.b
public abstract class class_213 {
   // $FF: renamed from: a java.lang.String
   private final String field_675;
   // $FF: renamed from: b java.util.Set
   private final Set field_676;

   protected class_213(String var1) {
      this.field_675 = (String)class_343.method_1190(var1, "fieldName");
      this.field_676 = Collections.singleton(var1);
   }

   protected class_213(String var1, Collection var2) {
      this.field_675 = (String)class_343.method_1190(var1, "fieldName");
      this.field_676 = Collections.unmodifiableSet(new HashSet(var2));
   }

   // $FF: renamed from: a () java.lang.String
   public final String method_823() {
      return this.field_675;
   }

   public String toString() {
      return this.field_675;
   }
}
