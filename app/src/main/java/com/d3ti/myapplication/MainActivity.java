package com.d3ti.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback{

    private  GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment = (SupportMapFragment)  getSupportFragmentManager().findFragmentById(R.id.maps);
        assert mapFragment != null;
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;

        // tambahkan lokasi yang diinginkan
        LatLng svuns = new LatLng(-7.55930, 110.83842);
        mMap.addMarker(new MarkerOptions().position(svuns).title("Sekolah Vokasi UNS"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(svuns));

        // tambahkan lokasi yang diinginkan
        LatLng rumah = new LatLng(-7.46024, 109.22011);
        mMap.addMarker(new MarkerOptions().position(rumah).title("Rumahku"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rumah));

        // tambahkan lokasi yang diinginkan
        LatLng uns = new LatLng(-7.55952, 110.85612);
        mMap.addMarker(new MarkerOptions().position(uns).title("UNS Beriman"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(uns));
    }
}