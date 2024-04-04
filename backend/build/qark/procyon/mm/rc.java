// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package mm;

import android.telephony.PhoneStateListener;
import android.os.Bundle;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.content.IntentFilter;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import android.content.Context;
import com.a.f.e;
import java.io.IOException;
import android.util.Log;
import android.media.MediaPlayer;
import android.widget.Button;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.telephony.TelephonyManager;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnPreparedListener;
import android.media.MediaPlayer$OnErrorListener;
import android.view.View$OnClickListener;
import com.google.android.gms.ads.f;
import android.content.BroadcastReceiver;
import android.os.Handler;
import android.media.MediaRecorder;
import com.a.f.a;

public class rc extends a
{
    static String z;
    MediaRecorder A;
    boolean B;
    Handler C;
    BroadcastReceiver D;
    BroadcastReceiver E;
    Thread F;
    int G;
    private f H;
    private View$OnClickListener I;
    private View$OnClickListener J;
    private MediaPlayer$OnErrorListener K;
    private MediaPlayer$OnPreparedListener L;
    private MediaPlayer$OnCompletionListener M;
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
    
    static {
        rc.z = null;
    }
    
    public rc() {
        this.A = null;
        this.D = new ap(this);
        this.E = new as(this);
        this.I = (View$OnClickListener)new at(this);
        this.J = (View$OnClickListener)new au(this);
        this.K = (MediaPlayer$OnErrorListener)new av(this);
        this.L = (MediaPlayer$OnPreparedListener)new aw(this);
        this.M = (MediaPlayer$OnCompletionListener)new ay(this);
        this.G = 0;
    }
    
    private String a(final long n) {
        final StringBuffer sb = new StringBuffer();
        sb.append(String.format("%02d", (int)(n % 3600000L / 60000L))).append(":").append(String.format("%02d", (int)(n % 3600000L % 60000L / 1000L)));
        return sb.toString();
    }
    
    private void a(final String dataSource) {
        this.y.reset();
        this.y.setAudioStreamType(3);
        try {
            this.y.setDataSource(dataSource);
            this.y.prepareAsync();
        }
        catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        catch (SecurityException ex2) {
            ex2.printStackTrace();
        }
        catch (IllegalStateException ex3) {
            ex3.printStackTrace();
        }
        catch (IOException ex4) {
            ex4.printStackTrace();
            Log.w("loadDataStream", ex4.toString());
        }
    }
    
    private void b(final long n) {
        if (this.A != null) {
            this.x.setText((CharSequence)this.a(n));
            this.C.postDelayed((Runnable)new ar(this, n), 1000L);
        }
    }
    
    private boolean t() {
        return this.getPackageManager().hasSystemFeature("android.hardware.microphone");
    }
    
    private void u() {
        dn.a.b();
        rc.z = dn.a.d(this.p);
        (this.A = new MediaRecorder()).setAudioSource(1);
        this.A.setOutputFormat(1);
        this.A.setOutputFile(rc.z);
        this.A.setAudioEncoder(1);
        try {
            this.A.prepare();
            this.A.start();
            this.u.setVisibility(0);
            this.t.setVisibility(8);
            this.v.setVisibility(8);
            this.w.setVisibility(8);
            this.b(1000L);
        }
        catch (IOException ex) {
            ex.printStackTrace();
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
        this.p = this.getIntent().getExtras().getInt(dn.f.c);
        this.q = this.getIntent().getExtras().getString(dn.f.b);
        (this.s = (TextView)this.findViewById(2131165211)).setText((CharSequence)(String.valueOf(this.p) + ". " + this.q));
        (this.r = (LinearLayout)this.findViewById(2131165208)).setOnClickListener(this.J);
        this.x = (TextView)this.findViewById(2131165241);
        this.v = (Button)this.findViewById(2131165223);
        this.u = (Button)this.findViewById(2131165244);
        this.t = (Button)this.findViewById(2131165243);
        this.w = (Button)this.findViewById(2131165242);
        this.v.setOnClickListener(this.I);
        this.u.setOnClickListener(this.I);
        this.t.setOnClickListener(this.I);
        this.w.setOnClickListener(this.I);
        (this.y = new MediaPlayer()).setOnCompletionListener(this.M);
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
        return new com.a.d.a().d(this.getIntent().getExtras().getInt(dn.f.c));
    }
    
    @Override
    public Class j() {
        return null;
    }
    
    void l() {
        try {
            (this.H = new f((Context)this)).setAdUnitId(dn.f.j);
            this.H.setAdSize(com.google.android.gms.ads.e.f);
            final RelativeLayout relativeLayout = (RelativeLayout)this.findViewById(2131165212);
            relativeLayout.addView((View)this.H, (ViewGroup$LayoutParams)new RelativeLayout$LayoutParams(-1, -2));
            this.H.setAdListener(new az(this, relativeLayout));
            this.registerReceiver(this.E, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.registerReceiver(this.D, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    void m() {
        if (dn.a.c(this.p)) {
            this.u.setVisibility(8);
            this.t.setVisibility(0);
            this.v.setVisibility(0);
            this.w.setVisibility(0);
        }
    }
    
    void n() {
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this);
        alertDialog$Builder.setMessage((CharSequence)this.getString(2131230806));
        alertDialog$Builder.setTitle((CharSequence)this.getString(2131230774));
        alertDialog$Builder.setPositiveButton((CharSequence)this.getString(2131230763), (DialogInterface$OnClickListener)new ba(this));
        alertDialog$Builder.setNegativeButton((CharSequence)this.getString(2131230764), (DialogInterface$OnClickListener)new aq(this));
        alertDialog$Builder.create().show();
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
    protected void onCreate(final Bundle bundle) {
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
        (this.N = (TelephonyManager)this.getSystemService("phone")).listen((PhoneStateListener)this.O, 32);
    }
    
    public void s() {
        if (this.N != null) {
            this.N.listen((PhoneStateListener)this.O, 0);
        }
    }
}
