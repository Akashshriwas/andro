/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnClickListener
 *  android.os.Message
 *  android.view.View
 *  android.webkit.ConsoleMessage
 *  android.webkit.ConsoleMessage$MessageLevel
 *  android.webkit.JsPromptResult
 *  android.webkit.JsResult
 *  android.webkit.WebChromeClient
 *  android.webkit.WebChromeClient$CustomViewCallback
 *  android.webkit.WebStorage
 *  android.webkit.WebStorage$QuotaUpdater
 *  android.webkit.WebView
 *  android.webkit.WebView$WebViewTransport
 *  android.webkit.WebViewClient
 *  android.widget.EditText
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.cc;
import com.google.android.gms.internal.et;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.ex;
import com.google.android.gms.internal.fc;
import com.google.android.gms.internal.fd;
import com.google.android.gms.internal.fe;
import com.google.android.gms.internal.ff;
import com.google.android.gms.internal.fg;
import com.google.android.gms.internal.fh;
import com.google.android.gms.internal.fi;

public class fb
extends WebChromeClient {
    private final ev a;

    public fb(ev ev2) {
        this.a = ev2;
    }

    private static void a(AlertDialog.Builder builder, String string, JsResult jsResult) {
        builder.setMessage((CharSequence)string).setPositiveButton(17039370, (DialogInterface.OnClickListener)new fe(jsResult)).setNegativeButton(17039360, (DialogInterface.OnClickListener)new fd(jsResult)).setOnCancelListener((DialogInterface.OnCancelListener)new fc(jsResult)).create().show();
    }

    private static void a(Context context, AlertDialog.Builder builder, String string, String string2, JsPromptResult jsPromptResult) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText((CharSequence)string);
        context = new EditText(context);
        context.setText((CharSequence)string2);
        linearLayout.addView((View)textView);
        linearLayout.addView((View)context);
        builder.setView((View)linearLayout).setPositiveButton(17039370, (DialogInterface.OnClickListener)new fh(jsPromptResult, (EditText)context)).setNegativeButton(17039360, (DialogInterface.OnClickListener)new fg(jsPromptResult)).setOnCancelListener((DialogInterface.OnCancelListener)new ff(jsPromptResult)).create().show();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(Context context, String string, String string2, String string3, JsResult jsResult, JsPromptResult jsPromptResult, boolean bl2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle((CharSequence)string);
        if (bl2) {
            fb.a(context, builder, string2, string3, jsPromptResult);
            do {
                return true;
                break;
            } while (true);
        }
        fb.a(builder, string2, jsResult);
        return true;
    }

    protected final void a(View view, int n2, WebChromeClient.CustomViewCallback customViewCallback) {
        cc cc2 = this.a.c();
        if (cc2 == null) {
            et.e("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        cc2.a(view, customViewCallback);
        cc2.a(n2);
    }

    public final void onCloseWindow(WebView object) {
        if (!(object instanceof ev)) {
            et.e("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        if ((object = ((ev)((Object)object)).c()) == null) {
            et.e("Tried to close an AdWebView not associated with an overlay.");
            return;
        }
        object.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String string = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        switch (fi.a[consoleMessage.messageLevel().ordinal()]) {
            default: {
                et.c(string);
                do {
                    return super.onConsoleMessage(consoleMessage);
                    break;
                } while (true);
            }
            case 1: {
                et.b(string);
                return super.onConsoleMessage(consoleMessage);
            }
            case 2: {
                et.e(string);
                return super.onConsoleMessage(consoleMessage);
            }
            case 3: 
            case 4: {
                et.c(string);
                return super.onConsoleMessage(consoleMessage);
            }
            case 5: 
        }
        et.a(string);
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean bl2, boolean bl3, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport)message.obj;
        webView = new WebView(webView.getContext());
        webView.setWebViewClient((WebViewClient)this.a.e());
        webViewTransport.setWebView(webView);
        message.sendToTarget();
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onExceededDatabaseQuota(String string, String string2, long l2, long l3, long l4, WebStorage.QuotaUpdater quotaUpdater) {
        long l5 = 0x500000L - l4;
        if (l5 <= 0L) {
            quotaUpdater.updateQuota(l2);
            return;
        }
        if (l2 == 0L) {
            if (l3 > l5 || l3 > 0x100000L) {
                l3 = 0L;
            }
        } else if (l3 == 0L) {
            l3 = Math.min((long)(Math.min((long)131072L, (long)l5) + l2), (long)0x100000L);
        } else {
            l4 = l2;
            if (l3 <= Math.min((long)(0x100000L - l2), (long)l5)) {
                l4 = l2 + l3;
            }
            l3 = l4;
        }
        quotaUpdater.updateQuota(l3);
    }

    public final void onHideCustomView() {
        cc cc2 = this.a.c();
        if (cc2 == null) {
            et.e("Could not get ad overlay when hiding custom view.");
            return;
        }
        cc2.c();
    }

    public final boolean onJsAlert(WebView webView, String string, String string2, JsResult jsResult) {
        return fb.a(webView.getContext(), string, string2, null, jsResult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String string, String string2, JsResult jsResult) {
        return fb.a(webView.getContext(), string, string2, null, jsResult, null, false);
    }

    public final boolean onJsConfirm(WebView webView, String string, String string2, JsResult jsResult) {
        return fb.a(webView.getContext(), string, string2, null, jsResult, null, false);
    }

    public final boolean onJsPrompt(WebView webView, String string, String string2, String string3, JsPromptResult jsPromptResult) {
        return fb.a(webView.getContext(), string, string2, string3, null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long l2, long l3, WebStorage.QuotaUpdater quotaUpdater) {
        if (0x500000L - l3 < (l2 = 131072L + l2)) {
            quotaUpdater.updateQuota(0L);
            return;
        }
        quotaUpdater.updateQuota(l2);
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.a(view, -1, customViewCallback);
    }
}

