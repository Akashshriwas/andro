/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.pm.PackageManager
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.media.MediaPlayer$OnErrorListener
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.media.MediaRecorder
 *  android.os.Bundle
 *  android.os.Handler
 *  android.telephony.PhoneStateListener
 *  android.telephony.TelephonyManager
 *  android.util.Log
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.Button
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.Thread
 *  java.util.ArrayList
 */
package mm;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.a.d.a;
import com.a.f.e;
import dn.f;
import java.io.IOException;
import java.util.ArrayList;
import mm.ap;
import mm.aq;
import mm.ar;
import mm.as;
import mm.at;
import mm.au;
import mm.av;
import mm.aw;
import mm.ay;
import mm.az;
import mm.ba;
import mm.bb;
import mm.t;

public class rc
extends com.a.f.a {
    static String z = null;
    MediaRecorder A = null;
    boolean B;
    Handler C;
    BroadcastReceiver D;
    BroadcastReceiver E;
    Thread F;
    int G;
    private com.google.android.gms.ads.f H;
    private View.OnClickListener I;
    private View.OnClickListener J;
    private MediaPlayer.OnErrorListener K;
    private MediaPlayer.OnPreparedListener L;
    private MediaPlayer.OnCompletionListener M;
    private TelephonyManager N;
    private bb O;
    int p;
    String q;
    LinearLayout r;
    TextView s;
    Button t;
    Button u;
    Button v;
    Button w;
    TextView x;
    MediaPlayer y;

    public rc() {
        this.D = new ap(this);
        this.E = new as(this);
        this.I = new at(this);
        this.J = new au(this);
        this.K = new av(this);
        this.L = new aw(this);
        this.M = new ay(this);
        this.G = 0;
    }

    static /* synthetic */ com.google.android.gms.ads.f a(rc rc2) {
        return rc2.H;
    }

    private String a(long l2) {
        StringBuffer stringBuffer = new StringBuffer();
        int n2 = (int)(l2 % 3600000L / 60000L);
        int n3 = (int)(l2 % 3600000L % 60000L / 1000L);
        stringBuffer.append(String.format((String)"%02d", (Object[])new Object[]{n2})).append(":").append(String.format((String)"%02d", (Object[])new Object[]{n3}));
        return stringBuffer.toString();
    }

    private void a(String string) {
        this.y.reset();
        this.y.setAudioStreamType(3);
        try {
            this.y.setDataSource(string);
            this.y.prepareAsync();
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
            return;
        }
        catch (SecurityException securityException) {
            securityException.printStackTrace();
            return;
        }
        catch (IllegalStateException illegalStateException) {
            illegalStateException.printStackTrace();
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            Log.w((String)"loadDataStream", (String)iOException.toString());
            return;
        }
    }

    static /* synthetic */ void a(rc rc2, long l2) {
        rc2.b(l2);
    }

    static /* synthetic */ e b(rc rc2) {
        return rc2.m;
    }

    private void b(long l2) {
        if (this.A != null) {
            this.x.setText((CharSequence)this.a(l2));
            ar ar2 = new ar(this, l2);
            this.C.postDelayed((Runnable)ar2, 1000L);
        }
    }

    static /* synthetic */ void c(rc rc2) {
        rc2.w();
    }

    private boolean t() {
        return this.getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    private void u() {
        dn.a.b();
        z = dn.a.d(this.p);
        this.A = new MediaRecorder();
        this.A.setAudioSource(1);
        this.A.setOutputFormat(1);
        this.A.setOutputFile(z);
        this.A.setAudioEncoder(1);
        try {
            this.A.prepare();
            this.A.start();
            this.u.setVisibility(0);
            this.t.setVisibility(8);
            this.v.setVisibility(8);
            this.w.setVisibility(8);
            this.b(1000L);
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    private void v() {
        this.A.stop();
        this.A.release();
        this.A = null;
        this.u.setVisibility(8);
        this.t.setVisibility(0);
        this.v.setVisibility(0);
        this.w.setVisibility(0);
        this.x.setText((CharSequence)"");
        if (this.C != null) {
            this.C.removeCallbacksAndMessages((Object)null);
        }
    }

    private void w() {
        if (this.y != null && !this.y.isPlaying()) {
            this.y.start();
        }
    }

    @Override
    public void f() {
        this.C = new Handler();
        this.p = this.getIntent().getExtras().getInt(f.c);
        this.q = this.getIntent().getExtras().getString(f.b);
        this.s = (TextView)this.findViewById(2131165211);
        this.s.setText((CharSequence)(String.valueOf((int)this.p) + ". " + this.q));
        this.r = (LinearLayout)this.findViewById(2131165208);
        this.r.setOnClickListener(this.J);
        this.x = (TextView)this.findViewById(2131165241);
        this.v = (Button)this.findViewById(2131165223);
        this.u = (Button)this.findViewById(2131165244);
        this.t = (Button)this.findViewById(2131165243);
        this.w = (Button)this.findViewById(2131165242);
        this.v.setOnClickListener(this.I);
        this.u.setOnClickListener(this.I);
        this.t.setOnClickListener(this.I);
        this.w.setOnClickListener(this.I);
        this.y = new MediaPlayer();
        this.y.setOnCompletionListener(this.M);
        this.y.setOnPreparedListener(this.L);
        this.y.setOnErrorListener(this.K);
        this.m();
        this.r();
        this.l();
    }

    @Override
    public int g() {
        return 2130903063;
    }

    @Override
    public e h() {
        return new t((Context)this);
    }

    @Override
    public ArrayList i() {
        return new a().d(this.getIntent().getExtras().getInt(f.c));
    }

    @Override
    public Class j() {
        return null;
    }

    void l() {
        try {
            this.H = new com.google.android.gms.ads.f((Context)this);
            this.H.setAdUnitId(f.j);
            this.H.setAdSize(com.google.android.gms.ads.e.f);
            RelativeLayout relativeLayout = (RelativeLayout)this.findViewById(2131165212);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout.addView((View)this.H, (ViewGroup.LayoutParams)layoutParams);
            this.H.setAdListener(new az(this, relativeLayout));
            this.registerReceiver(this.E, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.registerReceiver(this.D, new IntentFilter("android.intent.action.HEADSET_PLUG"));
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    void m() {
        if (dn.a.c(this.p).booleanValue()) {
            this.u.setVisibility(8);
            this.t.setVisibility(0);
            this.v.setVisibility(0);
            this.w.setVisibility(0);
        }
    }

    void n() {
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
        builder.setMessage((CharSequence)this.getString(2131230806));
        builder.setTitle((CharSequence)this.getString(2131230774));
        builder.setPositiveButton((CharSequence)this.getString(2131230763), (DialogInterface.OnClickListener)new ba(this));
        builder.setNegativeButton((CharSequence)this.getString(2131230764), (DialogInterface.OnClickListener)new aq(this));
        builder.create().show();
    }

    void o() {
        this.v();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.overridePendingTransition(2130968579, 2130968580);
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override
    protected void onDestroy() {
        if (this.A != null) {
            this.A.release();
            this.A = null;
        }
        if (this.y != null) {
            this.y.release();
            this.y = null;
        }
        if (this.E != null && this.H != null) {
            this.unregisterReceiver(this.E);
        }
        if (this.D != null && this.H != null) {
            this.unregisterReceiver(this.D);
        }
        this.s();
        super.onDestroy();
    }

    void p() {
        if (this.y.isPlaying()) {
            this.v.setBackgroundResource(2130837595);
            this.y.pause();
            return;
        }
        this.v.setBackgroundResource(2130837594);
        if (this.B) {
            this.y.start();
            return;
        }
        this.a(dn.a.d(this.p));
    }

    void q() {
        if (this.t()) {
            this.u();
        }
    }

    public void r() {
        this.O = new bb(this, null);
        this.N = (TelephonyManager)this.getSystemService("phone");
        this.N.listen((PhoneStateListener)this.O, 32);
    }

    public void s() {
        if (this.N != null) {
            this.N.listen((PhoneStateListener)this.O, 0);
        }
    }
}

