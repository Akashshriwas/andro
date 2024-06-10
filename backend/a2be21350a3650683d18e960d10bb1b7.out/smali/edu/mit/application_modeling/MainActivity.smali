.class public Ledu/mit/application_modeling/MainActivity;
.super Landroid/app/Activity;
.source "MainActivity.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 23
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 24
    const/high16 v3, 0x7f030000

    invoke-virtual {p0, v3}, Ledu/mit/application_modeling/MainActivity;->setContentView(I)V

    .line 26
    const-string v3, "phone"

    invoke-virtual {p0, v3}, Ledu/mit/application_modeling/MainActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/telephony/TelephonyManager;

    .line 27
    .local v2, "mgr":Landroid/telephony/TelephonyManager;
    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v1

    .line 29
    .local v1, "imei":Ljava/lang/String;
    invoke-virtual {p0}, Ledu/mit/application_modeling/MainActivity;->getApplication()Landroid/app/Application;

    move-result-object v3

    check-cast v3, Ledu/mit/application_modeling/MyApplication;

    iput-object v1, v3, Ledu/mit/application_modeling/MyApplication;->imei:Ljava/lang/String;

    .line 31
    new-instance v0, Landroid/content/Intent;

    const-class v3, Ledu/mit/application_modeling/AnotherActivity;

    invoke-direct {v0, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 32
    .local v0, "i":Landroid/content/Intent;
    return-void
.end method
