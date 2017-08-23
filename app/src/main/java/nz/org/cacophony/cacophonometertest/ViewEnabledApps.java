package nz.org.cacophony.cacophonometertest;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ViewEnabledApps extends AppCompatActivity {

    String logTag = "caco";

    //LIST OF ARRAY STRINGS WHICH WILL SERVE AS LIST ITEMS
    ArrayList<String> listItems=new ArrayList<String>();

    //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
    ArrayAdapter<String> adapter;

    //RECORDING HOW MANY TIMES THE BUTTON HAS BEEN CLICKED
    int clickCounter=0;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_enabled_apps);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);

        if (mListView == null) {
            mListView = (ListView) findViewById(R.id.listEnabledApps);
        }

        adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                listItems);
        setListAdapter(adapter);
    }

    public void onResume() {
        super.onResume();
        getInstalledApps(false);
    }

    //METHOD WHICH WILL HANDLE DYNAMIC INSERTION
    public void addItems(View v) {
        listItems.add("Clicked : "+clickCounter++);
        adapter.notifyDataSetChanged();
    }

    protected ListView getListView() {
        if (mListView == null) {
            mListView = (ListView) findViewById(R.id.listEnabledApps);
        }
        return mListView;
    }

    protected void setListAdapter(ListAdapter adapter) {
        getListView().setAdapter(adapter);
    }

    protected ListAdapter getListAdapter() {
        ListAdapter adapter = getListView().getAdapter();
        if (adapter instanceof HeaderViewListAdapter) {
            return ((HeaderViewListAdapter)adapter).getWrappedAdapter();
        } else {
            return adapter;
        }
    }
    public void btnDisableApps(@SuppressWarnings("UnusedParameters") View v) {
      //  listItems.add("Clicked : "+clickCounter++);
       //getRunningProcess();
        getInstalledApps(true);
    }

    private void getRunningProcess(){
        ActivityManager am = (ActivityManager) getApplicationContext().getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> listProcesses = am.getRunningAppProcesses();
        listItems.clear();
        for (ActivityManager.RunningAppProcessInfo runningProcess : listProcesses) {
            listItems.add(Integer.toString(runningProcess.importance) + " " + runningProcess.processName  );
            //Log.i(runningProcess.processName, Integer.toString(runningProcess.importance ));
        }

        Collections.sort(listItems, Collections.reverseOrder());
        setListAdapter(adapter);
    }

    private void getInstalledApps(boolean disable){
        int numberOfAppsSuccessfullyDisabled = 0;

        PackageManager pm = getPackageManager();
        List<ApplicationInfo> apps = pm.getInstalledApplications(0);

        listItems.clear();
        for (ApplicationInfo appInfo: apps){
            String packageName = appInfo.packageName;
            String apkName = appInfo.sourceDir;
            int packageEnabledSetting = pm.getApplicationEnabledSetting(packageName);
            if (packageEnabledSetting == PackageManager.COMPONENT_ENABLED_STATE_DISABLED || packageEnabledSetting == PackageManager.COMPONENT_ENABLED_STATE_DISABLED_USER){
                continue; // only interested in apps that have not been disabled
            }

            final String applicationName = (String) (appInfo != null ? pm.getApplicationLabel(appInfo) : "(unknown)");

            Log.e(logTag, Integer.toString(pm.getApplicationEnabledSetting(appInfo.packageName)) + " " + packageName + " " + applicationName + " " + apkName);

                if (AppsToDisable.isThisAnAppToDisable(packageName) && disable) {


                    if ((packageEnabledSetting == PackageManager.COMPONENT_ENABLED_STATE_DEFAULT) || packageEnabledSetting == PackageManager.COMPONENT_ENABLED_STATE_ENABLED) {
                        Log.e(logTag, "EnabledSetting is enabled and setting is " + String.valueOf(packageEnabledSetting));

                        try {
                            pm.setApplicationEnabledSetting(packageName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, 0);
                            Log.e(logTag, "tried to setApplicationEnabledSetting to disabled state ");

                            packageEnabledSetting = pm.getApplicationEnabledSetting(packageName);
                            Log.e(logTag, "EnabledSetting is now " + String.valueOf(packageEnabledSetting));
                            numberOfAppsSuccessfullyDisabled++;
                        } catch (Exception ex) {
                            Log.e(logTag, ex.getLocalizedMessage());
                            try {
                                pm.setApplicationEnabledSetting(packageName, PackageManager.COMPONENT_ENABLED_STATE_DISABLED_USER, 0);
                                packageEnabledSetting = pm.getApplicationEnabledSetting(packageName);
                                Log.e(logTag, "EnabledSetting is now " + String.valueOf(packageEnabledSetting));
                                numberOfAppsSuccessfullyDisabled++;
                            } catch (Exception e) {
                                Log.e(logTag, e.getLocalizedMessage());
                            }

                        }
                    } else {
                        Log.e(logTag, "EnabledSetting is NOT enabled and setting is" + String.valueOf(packageEnabledSetting));
                    }

                }
//                listItems.add(applicationName + " EnabledSetting " + String.valueOf(packageEnabledSetting));
            //listItems.add(applicationName );
            listItems.add(packageName + " " + applicationName + " " + apkName );

        }
        Collections.sort(listItems);
        setListAdapter(adapter);
if (disable){
    Context context = getApplicationContext();
    CharSequence text = numberOfAppsSuccessfullyDisabled + " Apps were disabled";
    int duration = Toast.LENGTH_LONG;

    Toast toast = Toast.makeText(context, text, duration);
    toast.show();
}

    }



}
