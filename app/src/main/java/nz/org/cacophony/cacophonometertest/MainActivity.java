package nz.org.cacophony.cacophonometertest;

import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

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


    public void displayPowerButtonClicked(@SuppressWarnings("UnusedParameters") View v) {


        displayPower();

    }

    void displayPower(){
        Intent intent = new Intent(this, ViewPowerActivity2.class);
        startActivity(intent);
    }
}
