package com.gembas.android.mobile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import me.zhanghai.android.systemuihelper.SystemUiHelper;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    hideStatusBar();
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_maps);

    setUpUI();

    setUpMapIfNeeded();
  }

  private void hideStatusBar() {
    new SystemUiHelper(this,
        SystemUiHelper.LEVEL_IMMERSIVE,
        SystemUiHelper.FLAG_IMMERSIVE_STICKY).hide();
  }

  private void setUpUI() {
    //        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
  }

  @Override
  protected void onResume() {
    super.onResume();
    setUpMapIfNeeded();
  }

  /**
   * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
   * installed) and the map has not already been instantiated.. This will ensure that we only ever
   * call {@link #setUpMap()} once when {@link #mMap} is not null.
   * <p/>
   * If it isn't installed {@link com.google.android.gms.maps.MapFragment} (and
   * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
   * install/update the Google Play services APK on their device.
   * <p/>
   * A user can return to this FragmentActivity after following the prompt and correctly
   * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
   * have been completely destroyed during this process (it is likely that it would only be
   * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
   * method in {@link #onResume()} to guarantee that it will be called.
   */
  private void setUpMapIfNeeded() {
    // Do a null check to confirm that we have not already instantiated the map.
    //if (mMap == null) {
    // Try to obtain the map from the SupportMapFragment.
    //mMap = ((PlacesMapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
    //// Check if we were successful in obtaining the map.
    //if (mMap != null) {
    //    //setUpMap();
    //}
    //}
  }

  /**
   * This is where we can add markers or lines, add listeners or move the camera. In this case, we
   * just add a marker near Africa.
   * <p/>
   * This should only be called once and when we are sure that {@link #mMap} is not null.
   */
  //private void setUpMap() {
  //    mMap.addMarker(new MarkerOptions().position(new LatLng(0, 0)).title("Marker"));
  //}
}
