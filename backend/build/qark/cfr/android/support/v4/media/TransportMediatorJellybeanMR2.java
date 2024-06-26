/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.media.AudioManager
 *  android.media.AudioManager$OnAudioFocusChangeListener
 *  android.media.RemoteControlClient
 *  android.media.RemoteControlClient$OnGetPlaybackPositionListener
 *  android.media.RemoteControlClient$OnPlaybackPositionUpdateListener
 *  android.os.Parcelable
 *  android.util.Log
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnWindowAttachListener
 *  android.view.ViewTreeObserver$OnWindowFocusChangeListener
 *  java.lang.ClassCastException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 */
package android.support.v4.media;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.os.Parcelable;
import android.support.v4.media.TransportMediatorCallback;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;

class TransportMediatorJellybeanMR2
implements RemoteControlClient.OnGetPlaybackPositionListener,
RemoteControlClient.OnPlaybackPositionUpdateListener {
    AudioManager.OnAudioFocusChangeListener mAudioFocusChangeListener;
    boolean mAudioFocused;
    final AudioManager mAudioManager;
    final Context mContext;
    boolean mFocused;
    final Intent mIntent;
    final BroadcastReceiver mMediaButtonReceiver;
    PendingIntent mPendingIntent;
    int mPlayState;
    final String mReceiverAction;
    final IntentFilter mReceiverFilter;
    RemoteControlClient mRemoteControl;
    final View mTargetView;
    final TransportMediatorCallback mTransportCallback;
    final ViewTreeObserver.OnWindowAttachListener mWindowAttachListener;
    final ViewTreeObserver.OnWindowFocusChangeListener mWindowFocusListener;

    public TransportMediatorJellybeanMR2(Context context, AudioManager audioManager, View view, TransportMediatorCallback transportMediatorCallback) {
        this.mWindowAttachListener = new ViewTreeObserver.OnWindowAttachListener(){

            public void onWindowAttached() {
                TransportMediatorJellybeanMR2.this.windowAttached();
            }

            public void onWindowDetached() {
                TransportMediatorJellybeanMR2.this.windowDetached();
            }
        };
        this.mWindowFocusListener = new ViewTreeObserver.OnWindowFocusChangeListener(){

            public void onWindowFocusChanged(boolean bl) {
                if (bl) {
                    TransportMediatorJellybeanMR2.this.gainFocus();
                    return;
                }
                TransportMediatorJellybeanMR2.this.loseFocus();
            }
        };
        this.mMediaButtonReceiver = new BroadcastReceiver(){

            public void onReceive(Context context, Intent intent) {
                try {
                    context = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                    TransportMediatorJellybeanMR2.this.mTransportCallback.handleKey((KeyEvent)context);
                    return;
                }
                catch (ClassCastException classCastException) {
                    Log.w((String)"TransportController", (Throwable)classCastException);
                    return;
                }
            }
        };
        this.mAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener(){

            public void onAudioFocusChange(int n) {
                TransportMediatorJellybeanMR2.this.mTransportCallback.handleAudioFocusChange(n);
            }
        };
        this.mPlayState = 0;
        this.mContext = context;
        this.mAudioManager = audioManager;
        this.mTargetView = view;
        this.mTransportCallback = transportMediatorCallback;
        this.mReceiverAction = context.getPackageName() + ":transport:" + System.identityHashCode((Object)this);
        this.mIntent = new Intent(this.mReceiverAction);
        this.mIntent.setPackage(context.getPackageName());
        this.mReceiverFilter = new IntentFilter();
        this.mReceiverFilter.addAction(this.mReceiverAction);
        this.mTargetView.getViewTreeObserver().addOnWindowAttachListener(this.mWindowAttachListener);
        this.mTargetView.getViewTreeObserver().addOnWindowFocusChangeListener(this.mWindowFocusListener);
    }

    public void destroy() {
        this.windowDetached();
        this.mTargetView.getViewTreeObserver().removeOnWindowAttachListener(this.mWindowAttachListener);
        this.mTargetView.getViewTreeObserver().removeOnWindowFocusChangeListener(this.mWindowFocusListener);
    }

    void dropAudioFocus() {
        if (this.mAudioFocused) {
            this.mAudioFocused = false;
            this.mAudioManager.abandonAudioFocus(this.mAudioFocusChangeListener);
        }
    }

    void gainFocus() {
        if (!this.mFocused) {
            this.mFocused = true;
            this.mAudioManager.registerMediaButtonEventReceiver(this.mPendingIntent);
            this.mAudioManager.registerRemoteControlClient(this.mRemoteControl);
            if (this.mPlayState == 3) {
                this.takeAudioFocus();
            }
        }
    }

    public Object getRemoteControlClient() {
        return this.mRemoteControl;
    }

    void loseFocus() {
        this.dropAudioFocus();
        if (this.mFocused) {
            this.mFocused = false;
            this.mAudioManager.unregisterRemoteControlClient(this.mRemoteControl);
            this.mAudioManager.unregisterMediaButtonEventReceiver(this.mPendingIntent);
        }
    }

    public long onGetPlaybackPosition() {
        return this.mTransportCallback.getPlaybackPosition();
    }

    public void onPlaybackPositionUpdate(long l) {
        this.mTransportCallback.playbackPositionUpdate(l);
    }

    public void pausePlaying() {
        if (this.mPlayState == 3) {
            this.mPlayState = 2;
            this.mRemoteControl.setPlaybackState(2);
        }
        this.dropAudioFocus();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void refreshState(boolean bl, long l, int n) {
        if (this.mRemoteControl != null) {
            RemoteControlClient remoteControlClient = this.mRemoteControl;
            int n2 = bl ? 3 : 1;
            float f = bl ? 1.0f : 0.0f;
            remoteControlClient.setPlaybackState(n2, l, f);
            this.mRemoteControl.setTransportControlFlags(n);
        }
    }

    public void startPlaying() {
        if (this.mPlayState != 3) {
            this.mPlayState = 3;
            this.mRemoteControl.setPlaybackState(3);
        }
        if (this.mFocused) {
            this.takeAudioFocus();
        }
    }

    public void stopPlaying() {
        if (this.mPlayState != 1) {
            this.mPlayState = 1;
            this.mRemoteControl.setPlaybackState(1);
        }
        this.dropAudioFocus();
    }

    void takeAudioFocus() {
        if (!this.mAudioFocused) {
            this.mAudioFocused = true;
            this.mAudioManager.requestAudioFocus(this.mAudioFocusChangeListener, 3, 1);
        }
    }

    void windowAttached() {
        this.mContext.registerReceiver(this.mMediaButtonReceiver, this.mReceiverFilter);
        this.mPendingIntent = PendingIntent.getBroadcast((Context)this.mContext, (int)0, (Intent)this.mIntent, (int)268435456);
        this.mRemoteControl = new RemoteControlClient(this.mPendingIntent);
        this.mRemoteControl.setOnGetPlaybackPositionListener((RemoteControlClient.OnGetPlaybackPositionListener)this);
        this.mRemoteControl.setPlaybackPositionUpdateListener((RemoteControlClient.OnPlaybackPositionUpdateListener)this);
    }

    void windowDetached() {
        this.loseFocus();
        if (this.mPendingIntent != null) {
            this.mContext.unregisterReceiver(this.mMediaButtonReceiver);
            this.mPendingIntent.cancel();
            this.mPendingIntent = null;
            this.mRemoteControl = null;
        }
    }

}

