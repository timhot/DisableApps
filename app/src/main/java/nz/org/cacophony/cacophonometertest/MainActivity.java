package nz.org.cacophony.cacophonometertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

//        // Get a support ActionBar corresponding to this toolbar
//        ActionBar ab = getSupportActionBar();
//        if (ab != null){
//
//
//            ab.setDisplayUseLogoEnabled(true);
//            ab.setLogo(R.mipmap.ic_launcher);
//        }else{
//
//
////            logger.warn("ActionBar ab is null");
//        }
    }

    @Override
    public void onResume() {
        // Application name text  appNameVersionText
        // http://stackoverflow.com/questions/4616095/how-to-get-the-build-version-number-of-your-android-application
        String versionName = BuildConfig.VERSION_NAME;
        TextView versionNameText = (TextView) findViewById(R.id.appNameVersionText);
        versionNameText.setText(getString(R.string.version) + " " + versionName);
        super.onResume();
    }

    public void displayPowerButtonClicked(@SuppressWarnings("UnusedParameters") View v) {


        displayEnabledApps();

    }

    void displayEnabledApps(){
        Intent intent = new Intent(this, ViewEnabledApps.class);
        startActivity(intent);
    }
}
