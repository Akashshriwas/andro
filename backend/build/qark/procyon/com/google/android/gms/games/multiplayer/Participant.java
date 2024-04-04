// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.games.multiplayer;

import com.google.android.gms.games.Player;
import android.net.Uri;
import com.google.android.gms.common.data.d;
import android.os.Parcelable;

public interface Participant extends Parcelable, d
{
    int b();
    
    String c();
    
    int d();
    
    boolean e();
    
    String f();
    
    Uri g();
    
    Uri h();
    
    String i();
    
    Player j();
    
    ParticipantResult k();
}
