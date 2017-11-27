package com.example.camil.navgooglemap;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsCuadritos extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    public double lat = 0.0;
    public double lon = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_cuadritos);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        Button btn=(Button)findViewById(R.id.btn_cerrar);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //ub();
        Bundle bundle = getIntent().getExtras();
        int lugar = bundle.getInt("lugar");


        // Add a marker in Sydney and move the camera


        switch (lugar) {

            case 1:

                LatLng x = new LatLng(1.215623,-77.278495);
                mMap.addMarker(new MarkerOptions().position(x).title(getString(R.string.cp)));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(x, 10));
                Toast notificacion = Toast.makeText(this,getResources().getString(R.string.hA)+" " + "8:00 AM - 2:00 PM", Toast.LENGTH_LONG);
                notificacion.show();
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);


                break;
            case 2:

                LatLng b = new LatLng(5.532763,-73.36002);
                mMap.addMarker(new MarkerOptions().position(b).title(getString(R.string.ctun)));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(b, 15));
                Toast notificacion1 = Toast.makeText(this,getResources().getString(R.string.hA)+" " + "8:00 AM - 5:00 PM", Toast.LENGTH_LONG);
                notificacion1.show();
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);


                break;
            case 3:

                LatLng c = new LatLng(7.084302,-70.758984);
                mMap.addMarker(new MarkerOptions().position(c).title(getString(R.string.cAra)));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(c, 15));
                Toast notificacion2 = Toast.makeText(this,getResources().getString(R.string.hA)+" " + "8:00 AM - 7:00 PM", Toast.LENGTH_LONG);
                notificacion2.show();
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);


                break;
            case 4:

                LatLng d = new LatLng(7.12119,-73.123056);
                mMap.addMarker(new MarkerOptions().position(d).title(getString(R.string.cBuc)));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(d, 15));
                Toast notificacion3 = Toast.makeText(this,getResources().getString(R.string.hA)+" " + "8:00 AM - 2:00 PM", Toast.LENGTH_LONG);
                notificacion3.show();
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);


                break;

            case 5:

                LatLng e = new LatLng(2.925402,-75.288122);
                mMap.addMarker(new MarkerOptions().position(e).title(getString(R.string.cNei)));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(e, 15));
                Toast notificacion4 = Toast.makeText(this,getResources().getString(R.string.hA)+" " + "8:00 AM - 2:00 PM", Toast.LENGTH_LONG);
                notificacion4.show();
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);


                break;
            case 6:

                LatLng n = new LatLng(5.066848,-75.518215);
                mMap.addMarker(new MarkerOptions().position(n).title(getString(R.string.cMan)));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(n, 15));
                Toast notificacion5 = Toast.makeText(this,getResources().getString(R.string.hA)+" " + "8:00 AM - 4:00 PM", Toast.LENGTH_LONG);
                notificacion5.show();
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);


                break;
            case 7:

                LatLng m = new LatLng(7.884103,-72.500134);
                mMap.addMarker(new MarkerOptions().position(m).title(getString(R.string.cCu)));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(m, 15));
                Toast notificacion6 = Toast.makeText(this,getResources().getString(R.string.hA)+" " + "8:00 AM - 5:30 PM", Toast.LENGTH_LONG);
                notificacion6.show();
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);


                break;
            case 8:

                LatLng l = new LatLng(4.646159,-74.102902);
                mMap.addMarker(new MarkerOptions().position(l).title(getString(R.string.cBo)));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(l, 15));
                Toast notificacion7 = Toast.makeText(this,getResources().getString(R.string.hA)+" " + "8:00 AM - 2:00 PM", Toast.LENGTH_LONG);
                notificacion7.show();
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);


                break;
            case 9:

                LatLng h = new LatLng(3.473573,-76.519913);
                mMap.addMarker(new MarkerOptions().position(h).title(getString(R.string.cCal)));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(h, 15));
                Toast notificacion8 = Toast.makeText(this,getResources().getString(R.string.hA)+" " + "8:00 AM - 2:00 PM", Toast.LENGTH_LONG);
                notificacion8.show();
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);


                break;
            case 10:

                LatLng o = new LatLng(4.134915,-73.636565);
                mMap.addMarker(new MarkerOptions().position(o).title(getString(R.string.cVil)));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(o, 15));
                Toast notificacion9 = Toast.makeText(this,getResources().getString(R.string.hA)+" " + "8:00 AM - 2:00 PM", Toast.LENGTH_LONG);
                notificacion9.show();
                mMap.getUiSettings().setZoomControlsEnabled(true);
                mMap.getUiSettings().setZoomGesturesEnabled(true);
                mMap.setMapType(googleMap.MAP_TYPE_NORMAL);


                break;

        }

    }
}
