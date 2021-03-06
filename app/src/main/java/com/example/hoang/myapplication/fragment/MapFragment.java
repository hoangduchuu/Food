//package com.example.hoang.myapplication.fragment;
//
//import android.app.Fragment;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import com.example.hoang.myapplication.R;
//import com.google.android.gms.maps.CameraUpdateFactory;
//import com.google.android.gms.maps.GoogleMap;
//import com.google.android.gms.maps.SupportMapFragment;
//import com.google.android.gms.maps.model.BitmapDescriptorFactory;
//import com.google.android.gms.maps.model.LatLng;
//import com.google.android.gms.maps.model.Marker;
//import com.google.android.gms.maps.model.MarkerOptions;
//
///**
// * Created by hoang on 2016/11/25.
// */
//public class MapFragment extends Fragment {
//    static final LatLng HAMBURG = new LatLng(53.558, 9.927);
//    static final LatLng KIEL = new LatLng(53.551, 9.993);
//    private GoogleMap map;
//
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//
//        View v = inflater.inflate(R.layout.test_map_layout, null, false);
//
//        map = ((MapFragment) getChildFragmentManager().findFragmentById(R.id.map))
//                .getMap();
//
//        Marker hamburg = map.addMarker(new MarkerOptions().position(HAMBURG)
//                .title("Hamburg"));
//        Marker kiel = map.addMarker(new MarkerOptions()
//                .position(KIEL)
//                .title("Kiel")
//                .snippet("Kiel is cool")
//                .icon(BitmapDescriptorFactory
//                        .fromResource(R.drawable.ic_launcher)));
//
//        // Move the camera instantly to hamburg with a zoom of 15.
//        map.moveCamera(CameraUpdateFactory.newLatLngZoom(HAMBURG, 15));
//
//        // Zoom in, animating the camera.
//        map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
//
//        //...
//
//        return v;
//    }