package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.class_8;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.class_21;

public interface TurnBasedMatch extends Parcelable, class_8, class_21 {
   // $FF: renamed from: a_ int[]
   int[] field_0 = new int[]{0, 1, 2, 3};

   // $FF: renamed from: b () com.google.android.gms.games.Game
   Game method_61();

   // $FF: renamed from: c () java.lang.String
   String method_62();

   // $FF: renamed from: d () java.lang.String
   String method_63();

   // $FF: renamed from: e () long
   long method_64();

   // $FF: renamed from: f () int
   int method_65();

   // $FF: renamed from: g () int
   int method_66();

   // $FF: renamed from: h () int
   int method_67();

   // $FF: renamed from: j () java.lang.String
   String method_68();

   // $FF: renamed from: k () long
   long method_69();

   // $FF: renamed from: l () java.lang.String
   String method_70();

   // $FF: renamed from: m () byte[]
   byte[] method_71();

   // $FF: renamed from: n () int
   int method_72();

   // $FF: renamed from: o () java.lang.String
   String method_73();

   // $FF: renamed from: p () byte[]
   byte[] method_74();

   // $FF: renamed from: q () int
   int method_75();

   // $FF: renamed from: r () android.os.Bundle
   Bundle method_76();

   // $FF: renamed from: s () int
   int method_77();

   // $FF: renamed from: t () boolean
   boolean method_78();
}
