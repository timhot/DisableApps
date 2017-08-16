package nz.org.cacophony.cacophonometertest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by User on 14-Aug-17.
 */

public class AppsToDisable {

    private static final String[] appsToDisable = {

            "com.android.noisefield",
            "com.android.galaxy4",
            "com.android.browser",
            "com.android.calculator2",
            "com.android.calendar",
            "com.android.chrome",
            "com.android.contacts",
            "com.android.deskclock",
            "com.android.dreams.basic",
            "com.android.gallery3d",
            "com.android.mms",
            "com.android.musicfx",
            "com.android.musicvis",
            "com.android.exchange",
            "com.android.email",
            "com.android.providers.calendar",
            "com.android.systemui",
            "com.android.vending",
            "com.android.videoeditor",
            "com.google.android.apps.books",
            "com.google.android.apps.magazines",
            "com.google.android.apps.plus",
            "com.google.android.apps.uploader",
            "com.google.android.gm",
            "com.google.android.gms",
            "com.google.android.googlequicksearchbox",
            "com.google.android.gsf.login",
            "com.google.android.partnersetup",
            "com.google.android.play.games",
            "com.mediatek.videoplayer",
            "com.google.android.videos",
            "com.google.android.music",
            "com.google.android.syncadapters.calendar",
            "com.google.android.syncadapters.contacts",
            "com.google.android.talk",
            "com.google.android.youtube",
            "com.gtarcade.lod",
            "com.huawei.android.hwouc",
            "com.huawei.android.totemweather",
            "com.kingoapp.superbattery",
            "com.mediatek.appwidget.weather",
            "com.mediatek.batterywarning",
            "com.mediatek.bluetooth",
            "com.mediatek.filemanager",
            "com.mediatek.smsreg",
            "com.mediatek.vlw",
            "com.mediatek.voicecommand",
            "com.mediatek.weather",
            "com.huawei.android.totemweather",
            "com.twodegreesmobile.twodegrees",
            "com.google.android.apps.maps",
            "com.android.soundrecorder",
            "com.huawei.KoBackup",
            "com.mediatek.todos",
            "com.mediatek.FMRadio",
            "com.android.music",
            "com.mediatek.videoplayer",
            "com.android.magicsmoke",
            "com.google.android.street",
            "com.sec.android.provider.smemo",
            "com.android.calendar",
            "com.sec.android.widgetapp.diotek.smemo",



            "com.tgrape.android.radar",
            "com.vlingo.midas",
            "com.sec.android.app.samsungapps",
            "com.google.android.talk",
            "com.sec.android.app.videoplayer",
            "com.sec.android.app.voicerecorder",
            "com.sec.pcw",
            "com.sec.android.app.allsharedmc",
            "com.sec.android.allshare.framework",
            "com.sec.android.app.popupcalculator",
            "com.sec.android.app.camera",
            "com.sec.chaton",






            "com.android.facelock",
            "com.android.providers.contacts",
            "com.android.wallpaper.livepicker",
            "com.google.android.backup",
            "com.google.android.feedback",
            "com.google.android.marvin.talkback",
            "com.google.android.syncadapters.bookmarks",
            "com.google.android.tts",
            "com.google.android.voicesearch",
            "com.infraware.polarisviewer4",
            "com.lifevibes.trimapp",
            "com.osp.app.signin",
            "com.samsung.SMT",
            "com.samsung.app.playreadyui",
            "com.samsung.topicwall",
            "com.sec.android.app.bluetoothtest",
            "com.sec.android.app.mobileprint",
            "com.sec.android.app.nfctest",
            "com.sec.android.cloudagent.dropboxoobe",
            "com.sec.android.daemonapp.ap.accuweather",
            "com.sec.android.daemonapp.ap.yahoonews",
            "com.sec.android.daemonapp.ap.yahoostock.stockclock",
            "com.sec.android.nearby.mediaserver",
            "com.sec.android.sCloudBackupApp",
            "com.sec.android.sCloudBackupProvider",
            "com.sec.android.sCloudRelayData",
            "com.sec.android.sCloudSync",
            "com.sec.android.saslideshow",
            "com.sec.android.widgetapp.SPlannerAppWidget",
            "com.sec.android.widgetapp.ap.hero.accuweather",
            "com.sec.android.widgetapp.ap.hero.accuweather.widget",
            "com.sec.android.widgetapp.ap.yahoonews",
            "com.sec.android.widgetapp.ap.yahoostock.stockclock",
            "com.sec.android.widgetapp.dualclockanalog",
            "com.sec.android.widgetapp.dualclockdigital",
            "com.sec.ccl.csp.app.secretwallpaper.themetwo",
            "com.sec.hearingadjust",
            "com.sec.spp.push",
            "com.siso.photoWall",



            "com.sec.android.sCloudRelayData",
            "com.sec.spp.push",
            "com.broadcom.bms",
            "android.googleSearch.googleSearchWidget",
            "com.android.bluetooth",
            "com.android.clipboardsaveservice",
            "com.sec.android.app.moreservices",
            "com.sec.android.app.music",
            "flipboard.app",
            "com.sec.android.gallery3d",
            "com.sec.android.app.fm",
            "com.sec.android.app.gamehub",
            "flipboard.app",

            // those above here are safe

            "com.sec.android.widgetapp.digitalclock",
            "com.sec.android.widgetapp.analogclocksimple",
            "com.sec.android.widgetapp.analogclockunique",

            // following apps listed on https://docs.google.com/spreadsheet/...UE&pli=1#gid=0
            "com.sec.android.daemonapp.ap.accuweather",
            "com.sec.android.widgetapp.ap.hero.accuweather.widget",
            "com.sec.android.nearby.mediaserver",
            "com.sec.pcw",
            "com.sec.android.allshare.framework",
            "com.samsung.map",
            "com.samsung.avrcp",
            "com.sec.android.app.bluetoothtest",
            "com.sec.chaton",
            "com.monotype.android.font.chococooky",
            "com.google.android.syncadapters.bookmarks",
            "com.sec.android.widgetapp.analogclocksimple",
            "com.sec.android.widgetapp.analogclockunique",
            "com.samsung.android.livewallpaper.deepsea",
            "com.sec.android.widgetapp.digitalclock",
            "com.samsung.android.app",
            "com.sec.android.widgetapp.dualclockanalog",
            "com.sec.android.widgetapp.dualclockdigital",
            "com.android.server.vpn.enterprise",
            "com.android.exchange",
            "flipboard.app",
            "com.sec.android.app.fm",
            "com.sec.android.app.gamehub",
            "com.google.android.googlequicksearchbox",
            "android.googleSearch.googleSearchWidget",
            "com.google.android.tts",
            "com.monotype.android.font.helvneuelt",
            "com.sec.android.app.controlpanel",
            "com.sec.android.app",
            "com.samsung.android.livewallpaper.luminousdots",
            "com.google.android.apps.maps",
            "com.samsung.music",
            "com.sec.android.app.mobileprint",
            "com.sec.android.app.myfiles",
            "com.android.noisefield",
            "com.android.phasebeam",
            "com.siso.photoWall",
            "com.android.pickuptutorial",
            "com.infraware.polarisviewer4",
            "com.samsung.app.playreadyui",
            "com.monotype.android.font.rosemary",
            "com.sec.android.app.samsungapps",
            "com.sec.android.app.samsungapps.una2",
            "com.sec.android.app.camera",
            "com.samsung.SMT",
            "com.sec.android.sCloudBackupApp",
            "com.sec.android.sCloudBackupProvider",
            "com.sec.android.sCloudRelayData",
            "com.sec.android.sCloudSync",
            "com.android.browser",
            "com.sec.android.app.popupcalculator",
            "com.android.calendar",
            "com.android.providers.downloads.ui",
            "com.android.email",
            "com.android.htmlviewer",
            "com.android.wallpaper.livepicker",
            "com.sec.android.widgetapp.deotek.smemo",
            "com.sec.android.provider.smemo",
            "com.sec.android.app.sn3",
            "com.sec.android.widgetapp.SPlannerAppWidget",
            "com.sec.spp.push",
            "com.tgrape.android.radar",
            "com.android.stk",
            "com.google.android.street",
            "com.google.android.talk",
            "com.google.android.marvin.talkback",
            "com.siso.topicWall",
            "com.lifevibes.trimapp",
            "com.samsung.videohub",
            "com.sec.android.app.voicerecorder",
            "com.vlingo.midas",
            "com.sec.ccl.csp.app.secretwallpaper.themetwo",
            "com.sec.android.daemonapp.ap.yahoonews",
            "com.sec.android.daemonapp.ap.yahoonews",
            "com.sec.android.daemonapp.ap.yahoostock.stockclock",
            "com.sec.android.widgetapp.ap.yahoostock.stockclock",
            "com.google.android.youtube",


            // following apps listed on https://forum.xda-developers.com/showthread.php?t=1856887
            "com.android.email",
            "com.android.exchange",
            "com.android.noisefield",
            "com.google.android.apps.genie.geniewidget",
            "com.google.android.talk",
            "com.monotype.android.font.chococooky",
            "com.osp.app.signin",
            "com.samsung.android.livewallpaper.deepsea",
            "com.samsung.android.livewallpaper.luminousdots",
            "com.samsung.BackupAssistant",
            "com.samsung.hux.sso",
            "com.samsung.map",
            "com.samsung.mediahub",
            "com.samsung.music",
            "com.samsung.swift.app.kiesair",
            "com.samsung.vmmhux",
            "com.sec.android.allshare.framework",
            "com.sec.android.app.allsharedmc",
            "com.sec.android.app.kieswifi",
            "com.sec.android.app.music",
            "com.sec.android.app.myfiles",
            "com.sec.android.app.popupcalculator",
            "com.sec.android.daemonapp.ap.accuweather",
            "com.sec.android.daemonapp.ap.yahoonews",
            "com.sec.android.provider.smemo",
            "com.sec.android.sCloudBackupProvider",
            "com.sec.android.sCloudRelayData",
            "com.sec.android.sCloudSync",
            "com.sec.android.widgetapp.ap.hero.accuweather",
            "com.sec.android.widgetapp.ap.hero.accuweather.widget",
            "com.sec.android.widgetapp.ap.yahoonews",
            "com.sec.android.widgetapp.ap.yahoostock.stockclock",
            "com.sec.android.widgetapp.diotek.smemo",
            "com.sec.ccl.csp.app.secretwallpaper.themetwo",
            "com.sec.pcw",
            "com.sec.spp.push",
            "com.tgrape.android.radar",
            "com.vlingo.midas",
            "com.vzw.hss.myverizon",

            // still testing these
            "com.dropbox.android",
            "com.sec.dropbox.android.cloudagent.dropboxoobe"
    };

    private static final String[] appsToNotDisable = { // use this list as check in case add an app to disable list that has already been shown to cause phone to crash etc

            "com.android.nfc",
            "com.sec.pcw.device",

// following apps listed on https://docs.google.com/spreadsheet/...UE&pli=1#gid=0 as take caution on removing - so leave on to play safe
            "com.broadcom.bms",
            "com.android.providers.drm",
            "com.sec.android.Kies",
            "com.android.settings.mt",
            "com.andoid.MtpApplication",
            "com.sec.android.inputmethod",
            "com.sec.android.gallery3d",
            "com.sec.android.app.launcher",
            "com.android.mms",
            "com.sec.android.app.SecSetup.Wizard",
            "com.sec.android.app.wallpaperchooser",
            "com.android.apps.tag",
            "com.android.providers.userdictionary",

// following apps listed on https://docs.google.com/spreadsheet/...UE&pli=1#gid=0 as do not remove

            "com.sec.android.provider.badge",
            "com.android.certinstaller",
            "com.sec.android.app.clockpackage",
            "com.samsung.sec.android.application.csc",
            "com.sec.android.app.DataCreate",
            "com.android.contacts",
            "com.android.providers.dpwnloads",
            "com.android.providers.media",
            "com.android.phone",
            "com.android.settings",
            "com.android.providers.settings",
            "com.android.providers.security",
            "com.sec.android.app.servicemodeapp",
            "com.android.systemui",

            //https://stackoverflow.com/questions/26725872/what-can-com-sec-android-app-launcher-be-used-for
            "com.sec.android.app.launcher"
            // I manually disabled the following app (called Huawei Home) and the Huawei Y300-0151 then failed to get past telecom screeen at boot up - did factory reset
            "com.huawei.android.launcher",

            // using the app 'system app remover it said the following are key modules (on Huawei Y300)
            Wi-Fi Hotspot
            TooBox
            Themes
            System Update
            SmartcardService
            RecordService
            ProjectMenuAct
            Profiles
            Notes
            Music
            MMI Test II
            Import via Bluetooth
            Huawei Inpupt Method
            Help Center
            Gallery
            FM Radio
            Flashlight
            File Manager
            DLNA
            Contacts Extension
            com.android.wallpaper.holospiral
            com.android.sharedstoragebackup
            backupconfirm
            Backup
            AppInstaller
            androidhwext

    };


    public static boolean isThisAnAppToDisable(String packageName) {
        boolean onDisableList = Arrays.asList(appsToDisable).contains(packageName);
        boolean onDoNotDisableList = Arrays.asList(appsToNotDisable).contains(packageName);
        return onDisableList && !onDoNotDisableList;

    }


}
