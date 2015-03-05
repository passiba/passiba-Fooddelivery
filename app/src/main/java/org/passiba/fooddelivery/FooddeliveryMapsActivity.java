package org.passiba.fooddelivery;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import static org.passiba.fooddelivery.DummyLocationContent.ITEMS;

public class FooddeliveryMapsActivity extends FragmentActivity implements GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fooddelivery_maps);
        setUpMap();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMap();
    }



    /**
     * This is where we can add markers or lines, add listeners or move the camera. In this case, we
     * just add a marker near Africa.
     * <p/>
     * This should only be called once and when we are sure that {@link #mMap} is not null.
  */
        private void setUpMap() {




       /* mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                .getMap();*/
            if (mMap == null) {
                mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
                        .getMap();
                mMap.setPadding(0,0,300,0);//enables navigation of setting padding


            }
            if (mMap != null) {

                    int count = 0;

                    for (DummyLocationContent.DummyLocation location : ITEMS) {
                       Marker marker;
                        count++;
                       marker = mMap.addMarker(new MarkerOptions()
                                        .position(location.getLatitudelongitude())
                                        .title(location.getName())
                                        .snippet(location.getWebsite())
                                        .icon(BitmapDescriptorFactory
                                                .fromResource(R.drawable.ic_launcher))


                        );


                        if (count == ITEMS.size()) {
                            // Move the camera instantantly to the last item geolocation cordinates in the array
                            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location.getLatitudelongitude(), 15));
                        }

                    }


                    // Zoom in, animating the camera.
                    mMap.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
                    mMap.getUiSettings().setZoomControlsEnabled(true);
                    mMap.getUiSettings().setMapToolbarEnabled(true);
                    mMap.getUiSettings().setZoomGesturesEnabled(true);
                    mMap.getUiSettings().setMyLocationButtonEnabled(true);
            }
        }


    @Override
    public boolean onMarkerClick(Marker marker) {


        return false;

    }
}


