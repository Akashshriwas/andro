package com.google.android.gms.games.multiplayer;

import android.os.Parcelable;
import com.google.android.gms.common.data.class_8;
import com.google.android.gms.games.Game;

public interface Invitation extends Parcelable, class_8, class_21 {
   // $FF: renamed from: b () com.google.android.gms.games.Game
   Game method_14();

   // $FF: renamed from: c () java.lang.String
   String method_15();

   // $FF: renamed from: d () com.google.android.gms.games.multiplayer.Participant
   Participant method_16();

   // $FF: renamed from: e () long
   long method_17();

   // $FF: renamed from: f () int
   int method_18();

   // $FF: renamed from: g () int
   int method_19();
}
