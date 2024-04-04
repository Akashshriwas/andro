/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.res.Resources
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.media.MediaPlayer$OnErrorListener
 *  android.media.MediaPlayer$OnPreparedListener
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
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 */
package mm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.k;
import android.support.v4.app.s;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.a.d.a;
import com.a.h.e;
import dn.b;
import dn.f;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import mm.aa;
import mm.ab;
import mm.ac;
import mm.ad;
import mm.ae;
import mm.d;
import mm.j;
import mm.q;
import mm.rc;
import mm.u;
import mm.v;
import mm.w;
import mm.z;

public class m
extends d {
    boolean A;
    boolean B;
    public MediaPlayer C;
    ProgressBar D;
    ImageButton E;
    Thread F;
    BroadcastReceiver G;
    BroadcastReceiver H;
    int I;
    private com.google.android.gms.ads.f J;
    private View.OnClickListener K;
    private MediaPlayer.OnErrorListener L;
    private MediaPlayer.OnPreparedListener M;
    private MediaPlayer.OnCompletionListener N;
    private TelephonyManager O;
    private ae P;
    Handler q;
    LinearLayout r;
    LinearLayout s;
    LinearLayout t;
    ImageView u;
    TextView v;
    Button w;
    Button x;
    Button y;
    e z;

    public m() {
        this.K = new u(this);
        this.L = new v(this);
        this.M = new w(this);
        this.N = new z(this);
        this.G = new aa(this);
        this.H = new ab(this);
        this.I = 0;
    }

    private void A() {
        if (this.C != null) {
            Object object = this.e().a(2131165217);
            if (object instanceof j) {
                ((j)object).b(this.C.getCurrentPosition());
            }
            if (this.C.isPlaying()) {
                object = new ac(this);
                this.q.postDelayed((Runnable)object, 500L);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void B() {
        long l2;
        SharedPreferences.Editor editor;
        long l3;
        long l4;
        long l5;
        block17 : {
            long l6;
            block16 : {
                long l7;
                long l8;
                long l9;
                SharedPreferences sharedPreferences;
                try {
                    sharedPreferences = this.getSharedPreferences("apprater", 0);
                    editor = sharedPreferences.edit();
                    boolean bl2 = this.getResources().getBoolean(2131492864);
                    if (!bl2) {
                        if (sharedPreferences.getBoolean("dontshow", false)) return;
                        {
                            if (sharedPreferences.getBoolean("rateclicked", false)) {
                                return;
                            }
                        }
                    }
                    if (bl2) {
                        b.a((Context)this, editor);
                        return;
                    }
                    l9 = sharedPreferences.getLong("launch_count", 0L);
                    l7 = sharedPreferences.getLong("event_count", 0L);
                    l6 = sharedPreferences.getLong("date_firstlaunch", 0L);
                    l4 = sharedPreferences.getLong("date_reminder_pressed", 0L);
                    l5 = l7;
                    l2 = l9;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return;
                }
                try {
                    int n2 = this.getPackageManager().getPackageInfo((String)this.getPackageName(), (int)0).versionCode;
                    l3 = l7;
                    l8 = l9;
                    l5 = l7;
                    l2 = l9;
                    if (sharedPreferences.getInt("versioncode", 0) != n2) {
                        l8 = 0L;
                        l5 = l3 = 0L;
                        l2 = l8;
                        editor.putLong("event_count", 0L);
                    }
                    l5 = l3;
                    l2 = l8;
                    editor.putInt("versioncode", n2);
                    l5 = l3;
                }
                catch (Exception exception) {
                    l8 = l2;
                }
                l3 = 1L + l8;
                editor.putLong("launch_count", l3);
                if (l6 != 0L) break block16;
                l2 = System.currentTimeMillis();
                editor.putLong("date_firstlaunch", l2);
                break block17;
            }
            l2 = l6;
        }
        if (l3 >= (long)this.getResources().getInteger(2131296259)) {
            l3 = this.getResources().getInteger(2131296258) * 24 * 60 * 60;
            if (System.currentTimeMillis() >= l2 + l3 * 1000L || l5 >= (long)this.getResources().getInteger(2131296260)) {
                if (l4 == 0L) {
                    b.a((Context)this, editor);
                } else {
                    l5 = this.getResources().getInteger(2131296261) * 24 * 60 * 60;
                    if (System.currentTimeMillis() >= l5 * 1000L + l4) {
                        b.a((Context)this, editor);
                    }
                }
            }
        }
        editor.commit();
    }

    private String a(byte[] object) {
        try {
            this.a((Context)this);
            File file = File.createTempFile((String)"test", (String)"mp3", (File)this.getCacheDir());
            file.deleteOnExit();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write((byte[])object);
            fileOutputStream.close();
            object = file.getPath();
            return object;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    static /* synthetic */ void a(m m2) {
        m2.x();
    }

    private void b(Fragment fragment) {
        s s2 = this.e().a();
        s2.b(2131165217, fragment);
        s2.a();
    }

    private void b(Boolean object) {
        this.q.removeCallbacksAndMessages((Object)null);
        Fragment fragment = this.e().a(2131165217);
        object = new a().a(this.o(), (Boolean)object);
        if (fragment != null && object != null) {
            this.a((e)object);
            this.c((e)object);
            if (!(fragment instanceof q) && fragment instanceof j) {
                this.a(String.valueOf((int)object.d()) + ". " + object.b());
                ((j)fragment).a((e)object);
                ((j)fragment).v();
            }
            this.b(this.o());
        }
    }

    static /* synthetic */ void b(m m2) {
        m2.y();
    }

    private void c(String string) {
        this.C.reset();
        this.C.setAudioStreamType(3);
        try {
            this.C.setDataSource(string);
            this.C.setLooping(false);
            this.C.prepareAsync();
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

    static /* synthetic */ void c(m m2) {
        m2.z();
    }

    static /* synthetic */ void d(m m2) {
        m2.u();
    }

    static /* synthetic */ void e(m m2) {
        m2.t();
    }

    static /* synthetic */ void f(m m2) {
        m2.w();
    }

    static /* synthetic */ void g(m m2) {
        m2.A();
    }

    static /* synthetic */ com.google.android.gms.ads.f h(m m2) {
        return m2.J;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void t() {
        Fragment fragment = this.e().a(2131165217);
        if (fragment == null) return;
        {
            if (fragment instanceof j) {
                if (this.C.isPlaying()) {
                    this.C.pause();
                    this.w.setBackgroundResource(2130837586);
                }
                fragment = new Intent((Context)this, rc.class);
                fragment.putExtra(f.c, this.o().d());
                fragment.putExtra(f.b, this.o().b());
                this.startActivity((Intent)fragment);
                this.overridePendingTransition(2130968576, 2130968577);
                return;
            } else {
                if (!(fragment instanceof q)) return;
                {
                    new com.a.b.d((Context)this).a();
                    return;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void u() {
        boolean bl2 = false;
        boolean bl3 = f.a().a("RepeatPlayAll", false);
        if (bl3) {
            this.E.setBackgroundResource(2130837585);
        } else {
            this.E.setBackgroundResource(2130837600);
        }
        if (!bl3) {
            bl2 = true;
        }
        f.a().b("RepeatPlayAll", bl2);
    }

    private void v() {
        boolean bl2;
        this.B = bl2 = f.a().a("RepeatPlayAll", false);
        if (bl2) {
            this.E.setBackgroundResource(2130837600);
            return;
        }
        this.E.setBackgroundResource(2130837585);
    }

    private void w() {
        if (this.C != null && !this.C.isPlaying()) {
            this.A = true;
            this.C.start();
        }
    }

    private void x() {
        this.B = true;
        this.b((Boolean)true);
    }

    private void y() {
        this.B = true;
        this.b((Boolean)false);
    }

    private void z() {
        if (this.o() != null) {
            this.c(true);
            if (this.e().a(2131165217) instanceof q) {
                j j2 = new j();
                this.l();
                this.a(String.valueOf((int)this.o().d()) + ". " + this.o().b());
                j2.a(this.o());
                this.a(j2, true);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(Context context) {
        try {
            context = context.getCacheDir();
            if (context == null) return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
        if (!context.isDirectory()) return;
        this.a((File)context);
    }

    public void a(Fragment fragment, Boolean object) {
        object = this.e();
        s s2 = object.a();
        s2.a(2130968576, 2130968577, 2130968579, 2130968580);
        s2.a(object.a(2131165217));
        s2.a(2131165217, fragment);
        s2.a((String)null);
        s2.a();
    }

    @Override
    public void a(com.a.a.a object, View object2) {
        super.a((com.a.a.a)object, (View)object2);
        if (object != null && object.c() <= 3) {
            this.k();
            this.c(false);
            object = this.e();
            object2 = object.a(2131165217);
            if (object2 != null && object2 instanceof j) {
                object.c();
            }
            if (this.C != null) {
                this.C.reset();
                this.w.setBackgroundResource(2130837586);
            }
            this.a(false);
            object = object.a(2131165217);
            if (object instanceof q) {
                ((q)object).v();
            }
        }
    }

    public void a(e e2) {
        this.z = e2;
    }

    public void a(Boolean bl2) {
        if (!bl2.booleanValue()) {
            this.r.setVisibility(8);
            return;
        }
        this.r.setVisibility(0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(File file) {
        boolean bl2 = false;
        if (file == null) return file.delete();
        if (!file.isDirectory()) return file.delete();
        String[] arrstring = file.list();
        int n2 = 0;
        while (n2 < arrstring.length) {
            boolean bl3 = bl2;
            if (!this.a(new File(file, arrstring[n2]))) return bl3;
            ++n2;
        }
        return file.delete();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b(e e2) {
        if (e2 == null || this.C == null) return;
        {
            if (this.C.isPlaying()) {
                this.C.reset();
                this.A = false;
                this.p();
                return;
            } else {
                this.C.reset();
                this.A = false;
                if (!this.B) return;
                {
                    this.p();
                    return;
                }
            }
        }
    }

    public void b(String arrstring) {
        if (this.C != null && this.C.isPlaying()) {
            arrstring = arrstring.split(":");
            int n2 = Integer.parseInt((String)arrstring[1].substring(0, 2));
            int n3 = Integer.parseInt((String)arrstring[1].substring(3, 5));
            this.C.seekTo(n3 + n2 * 1000);
        }
    }

    public void b(boolean bl2) {
        this.B = bl2;
    }

    public void c(e e2) {
        if (e2 != null && this.v != null) {
            this.v.setText((CharSequence)(String.valueOf((int)e2.d()) + ". " + e2.b()));
        }
    }

    public void c(boolean bl2) {
        if (bl2) {
            this.u.setImageResource(2130837560);
            return;
        }
        this.u.setImageResource(2130837552);
    }

    @Override
    public void i() {
        this.q = new Handler();
        this.r = (LinearLayout)this.findViewById(2131165218);
        this.t = (LinearLayout)this.findViewById(2131165215);
        this.u = (ImageView)this.findViewById(2131165216);
        this.s = (LinearLayout)this.findViewById(2131165219);
        this.v = (TextView)this.findViewById(2131165220);
        this.x = (Button)this.findViewById(2131165224);
        this.w = (Button)this.findViewById(2131165223);
        this.y = (Button)this.findViewById(2131165222);
        this.E = (ImageButton)this.findViewById(2131165225);
        this.x.setOnClickListener(this.K);
        this.w.setOnClickListener(this.K);
        this.y.setOnClickListener(this.K);
        this.E.setOnClickListener(this.K);
        this.s.setOnClickListener(this.K);
        this.t.setOnClickListener(this.K);
        this.D = (ProgressBar)this.findViewById(2131165221);
        this.a(false);
        this.A = false;
        this.C = new MediaPlayer();
        this.C.setOnCompletionListener(this.N);
        this.C.setOnPreparedListener(this.M);
        this.C.setOnErrorListener(this.L);
        this.v();
        this.c(false);
        this.r();
        this.q();
    }

    @Override
    public int j() {
        return 2130903049;
    }

    @Override
    public void n() {
        k k2 = this.e();
        Fragment fragment = k2.a(2131165217);
        if (fragment != null && fragment instanceof j) {
            k2.b();
            this.k();
            this.c(false);
            this.a(this.p.a(f.b));
            return;
        }
        super.n();
    }

    public e o() {
        return this.z;
    }

    @Override
    public void onBackPressed() {
        Fragment fragment = this.e().a(2131165217);
        if (fragment != null && fragment instanceof j) {
            this.k();
            this.m();
            this.c(false);
            super.onBackPressed();
            return;
        }
        dn.a.a((Context)this);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(null);
        this.b(new q());
        com.a.h.b.a((Context)this);
    }

    @Override
    protected void onDestroy() {
        if (this.C != null) {
            this.C.release();
            this.C = null;
        }
        if (this.H != null && this.J != null) {
            this.unregisterReceiver(this.H);
        }
        if (this.G != null && this.J != null) {
            this.unregisterReceiver(this.G);
        }
        this.s();
        super.onDestroy();
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        bundle.getInt("maxItem");
        super.onRestoreInstanceState(bundle);
    }

    @Override
    protected void onResume() {
        try {
            super.onResume();
            if (dn.a.a()) {
                this.B();
            }
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void p() {
        if (this.C.isPlaying()) {
            this.C.pause();
            this.w.setBackgroundResource(2130837586);
            return;
        } else {
            this.w.setBackgroundResource(2130837581);
            if (this.A) {
                this.w();
                this.A();
                return;
            }
            byte[] arrby = new a().a(this.o().a());
            String string = null;
            if (arrby != null) {
                string = this.a(arrby);
            } else if (dn.a.b(this.o().a()).booleanValue()) {
                string = dn.a.a(this.o().a());
            } else if (dn.a.a()) {
                this.D.setVisibility(0);
                string = dn.a.e(this.o().a());
            } else {
                this.w.setBackgroundResource(2130837586);
                dn.a.a((Context)this, this.getString(2131230751));
            }
            if (string == null) return;
            {
                this.c(string);
                return;
            }
        }
    }

    void q() {
        try {
            this.J = new com.google.android.gms.ads.f((Context)this);
            this.J.setAdUnitId(f.i);
            this.J.setAdSize(com.google.android.gms.ads.e.f);
            RelativeLayout relativeLayout = (RelativeLayout)this.findViewById(2131165212);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            relativeLayout.addView((View)this.J, (ViewGroup.LayoutParams)layoutParams);
            this.J.setAdListener(new ad(this, relativeLayout));
            this.registerReceiver(this.H, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.registerReceiver(this.G, new IntentFilter("android.intent.action.HEADSET_PLUG"));
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public void r() {
        this.P = new ae(this, null);
        this.O = (TelephonyManager)this.getSystemService("phone");
        this.O.listen((PhoneStateListener)this.P, 32);
    }

    public void s() {
        if (this.O != null) {
            this.O.listen((PhoneStateListener)this.P, 0);
        }
    }
}

