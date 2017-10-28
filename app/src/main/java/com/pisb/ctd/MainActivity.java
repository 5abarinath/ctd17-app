package com.pisb.ctd;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        navigationView.setCheckedItem(R.id.nav_home);
        /*if (android.os.Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            //window.setStatusBarColor(this.getResources().getColor(R.color.black));
            window.setStatusBarColor(ContextCompat.getColor(activity, R.color.example_color));
        }*/

        getFragmentManager().beginTransaction()
                .replace(R.id.mainFrame,new fragment_ctdInfo())
                .commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            navigationView.setCheckedItem(R.id.nav_home);
            events event = (events)getFragmentManager().findFragmentByTag("fragment_events");
            ping pin = (ping)getFragmentManager().findFragmentByTag("fragment_ping");
            sigFragment sig = (sigFragment) getFragmentManager().findFragmentByTag("fragment_sig");

            seminars seminar = (seminars)getFragmentManager().findFragmentByTag("fragment_seminars");
            seminars2 seminar2 = (seminars2)getFragmentManager().findFragmentByTag("fragment_seminars2");
            seminars22 seminar22 = (seminars22)getFragmentManager().findFragmentByTag("fragment_seminars22");
            seminars3 seminar3 = (seminars3)getFragmentManager().findFragmentByTag("fragment_seminars3");
            seminars33 seminar33 = (seminars33)getFragmentManager().findFragmentByTag("fragment_seminars33");
            seminars4 seminar4 = (seminars4)getFragmentManager().findFragmentByTag("fragment_seminars4");

            contactUs contact = (contactUs) getFragmentManager().findFragmentByTag("fragment_contact");
            feedback fEEd = (feedback) getFragmentManager().findFragmentByTag("fragment_feedback");
            fragment_ctdInfo home = (fragment_ctdInfo) getFragmentManager().findFragmentByTag("home");
            fragment_pisbInfo home2 = (fragment_pisbInfo) getFragmentManager().findFragmentByTag("home2");
            fragment_ieeeInfo home3 = (fragment_ieeeInfo) getFragmentManager().findFragmentByTag("home3");
            if((event != null && event.isVisible()) || (pin != null && pin.isVisible()) || (sig != null && sig.isVisible()) || (seminar != null && seminar.isVisible()) || (contact != null && contact.isVisible())  || (fEEd != null && fEEd.isVisible()) || (seminar2 != null && seminar2.isVisible()) || (seminar22 != null && seminar22.isVisible()) || (seminar3 != null && seminar3.isVisible()) || (seminar33 != null && seminar33.isVisible()) || (seminar4 != null && seminar4.isVisible())) {
                getFragmentManager().beginTransaction().
                        replace(R.id.mainFrame, new fragment_ctdInfo())
                        .commit();
            }
            else if((home != null && home.isVisible())||(home2 != null && home2.isVisible())||(home3 != null && home3.isVisible()))
            {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
            else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        if (id == R.id.action_feedback) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.mainFrame,new feedback(), "fragment_feedback")
                    .commit();
            //return true;
        }
        else if (id == R.id.action_share)
        {
            Intent share = new Intent(android.content.Intent.ACTION_SEND);
            share.setType("text/plain");
            String sharebody = getString(R.string.app_share) + "https://play.google.com/store/apps/details?id=com.pisb.ctd";
            //share.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject here");
            share.putExtra(android.content.Intent.EXTRA_TEXT, sharebody);
            startActivity(Intent.createChooser(share, "Share via"));
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        if(id == R.id.nav_home) {
            navigationView.setCheckedItem(R.id.nav_home);
            getFragmentManager().beginTransaction().
                    replace(R.id.mainFrame, new fragment_ctdInfo(), "home")
                    .commit();
        }

        else if (id == R.id.nav_events) {
            navigationView.setCheckedItem(R.id.nav_events);
            getFragmentManager().beginTransaction()
                    .replace(R.id.mainFrame,new events(), "fragment_events")
                    .commit();

        } else if (id == R.id.nav_ping) {
            navigationView.setCheckedItem(R.id.nav_ping);
            getFragmentManager().beginTransaction()
                    .replace(R.id.mainFrame,new ping(), "fragment_ping")
                    .commit();

        } else if (id == R.id.nav_seminars) {
            navigationView.setCheckedItem(R.id.nav_seminars);
            getFragmentManager().beginTransaction()
                    .replace(R.id.mainFrame,new seminars(), "fragment_seminars")
                    .commit();

        }

        else if(id == R.id.nav_sig){
            navigationView.setCheckedItem(R.id.nav_sig);
            getFragmentManager().beginTransaction()
                    .replace(R.id.mainFrame,new sigFragment(), "fragment_sig")
                    .commit();
        }
        /*else if(id == R.id.nav_share){

        }*/
        else if(id == R.id.nav_contact){
            navigationView.setCheckedItem(R.id.nav_contact);
            getFragmentManager().beginTransaction()
                    .replace(R.id.mainFrame,new contactUs(), "fragment_contact")
                    .commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
