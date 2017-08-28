package com.jorgesys.fragmentsinviewpager;


import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {


  private ViewPager viewPager;
  private TabsPagerAdapter mAdapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);*/

    // Initilization
    viewPager = (ViewPager) findViewById(R.id.pager);
    mAdapter = new TabsPagerAdapter(getSupportFragmentManager(), getApplicationContext());
    viewPager.setAdapter(mAdapter);


  }


}