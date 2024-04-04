/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcelable
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.multiplayer.ParticipantResult;

public interface Participant
extends Parcelable,
d {
    public int b();

    public String c();

    public int d();

    public boolean e();

    public String f();

    public Uri g();

    public Uri h();

    public String i();

    public Player j();

    public ParticipantResult k();
}

