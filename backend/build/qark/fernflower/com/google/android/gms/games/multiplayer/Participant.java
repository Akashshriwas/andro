package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.class_8;
import com.google.android.gms.games.Player;

public interface Participant extends Parcelable, class_8 {
   // $FF: renamed from: b () int
   int method_45();

   // $FF: renamed from: c () java.lang.String
   String method_46();

   // $FF: renamed from: d () int
   int method_47();

   // $FF: renamed from: e () boolean
   boolean method_48();

   // $FF: renamed from: f () java.lang.String
   String method_49();

   // $FF: renamed from: g () android.net.Uri
   Uri method_50();

   // $FF: renamed from: h () android.net.Uri
   Uri method_51();

   // $FF: renamed from: i () java.lang.String
   String method_52();

   // $FF: renamed from: j () com.google.android.gms.games.Player
   Player method_53();

   // $FF: renamed from: k () com.google.android.gms.games.multiplayer.ParticipantResult
   ParticipantResult method_54();
}
