package com.example.semarangkoding

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.provider.Settings
import android.widget.Button
import android.widget.Toast
import androidx.core.app.ActivityCompat

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

import com.google.android.gms.location.*
import com.google.android.gms.maps.model.BitmapDescriptorFactory

import com.google.android.libraries.places.api.Places

class TampilMap : AppCompatActivity(), OnMapReadyCallback {


    private val PERMISSION_ID = 42
    lateinit var mFusedLocationClient: FusedLocationProviderClient
    lateinit var mMap: GoogleMap



    var currentLocation: LatLng = LatLng( -6.966667, 110.416664)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tampil_map)

        // Fetching API_KEY
        val ai: ApplicationInfo = applicationContext.packageManager
            .getApplicationInfo(applicationContext.packageName, PackageManager.GET_META_DATA)
        val value = ai.metaData["com.google.android.geo.API_KEY"]
        val apiKey = value.toString()

        // Initializing lokasi API
        if (!Places.isInitialized()) {
            Places.initialize(applicationContext, apiKey)
        }

        // Initializing Map
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        // Initializing lokasi
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this)

        // Button mencari lokasi
        val btn = findViewById<Button>(R.id.lokasiterkini)
        btn.setOnClickListener {
            getLastLocation()
        }
    }

    override fun onMapReady(p0: GoogleMap) {
        mMap = p0
        getLastLocation()


    }

    // Mencari Lokasi Saat Ini
    @SuppressLint("MissingPermission")
    private fun getLastLocation() {
        if (checkPermissions()) {
            if (isLocationEnabled()) {

                mFusedLocationClient.lastLocation.addOnCompleteListener(this) { task ->
                    val location: Location? = task.result
                    if (location == null) {
                        requestNewLocationData()
                    } else {
                        currentLocation = LatLng(location.latitude, location.longitude)
                        mMap.clear()
                        mMap.addMarker(MarkerOptions().position(currentLocation))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))




                        val rs1 = LatLng(-6.993966867949614, 110.4075326122442)
                        mMap.addMarker(MarkerOptions().position(rs1).title("RSUP Dr.Kariadi")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs1))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs2: LatLng = LatLng( -6.984416605890685, 110.35595405457094)
                        mMap.addMarker(MarkerOptions().position(rs2).title("RSUD Tugurejo")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs2))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs3: LatLng = LatLng( -7.033692281169151, 110.46604432573484)
                        mMap.addMarker(MarkerOptions().position(rs3).title("RSUD Wongsonegoro")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs3))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs4: LatLng = LatLng( -7.063536604565311, 110.41648149689861)
                        mMap.addMarker(MarkerOptions().position(rs4).title("RS Banyumanik")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs4))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs5: LatLng = LatLng( -6.98483, 110.40752)
                        mMap.addMarker(MarkerOptions().position(rs5).title("RS Bhakti Wira Tamtama")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs5))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs6: LatLng = LatLng( -7.016292761480072, 110.40977605416748)
                        mMap.addMarker(MarkerOptions().position(rs6).title("RS Bhayangkara Akpol")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs6))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs7: LatLng = LatLng( -7.000387613271933, 110.44615326806132)
                        mMap.addMarker(MarkerOptions().position(rs7).title("RS Bhayangkara Semarang")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs7))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs8: LatLng = LatLng( -6.9840079088591, 110.38285239504165)
                        mMap.addMarker(MarkerOptions().position(rs8).title("RS Columbia Asia Semarang")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs8))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs9: LatLng = LatLng( -7.009254775964936, 110.46324363922486)
                        mMap.addMarker(MarkerOptions().position(rs9).title("RS Jiwa Dr.Amino Gondohutomo")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs9))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs10: LatLng = LatLng( -7.072520767734421, 110.41173064108162)
                        mMap.addMarker(MarkerOptions().position(rs10).title("RS Hermina Banyumanik")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs10))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs11: LatLng = LatLng( -6.978054583262269, 110.4116737008689)
                        mMap.addMarker(MarkerOptions().position(rs11).title("RS Hermina Pandanaran")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs11))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs12: LatLng = LatLng( -7.04746800498914, 110.44389439875454)
                            mMap.addMarker(MarkerOptions().position(rs12).title("RS Nasional Diponegoro")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs12))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs13: LatLng = LatLng( -6.9727779568692405, 110.43439663922447)
                        mMap.addMarker(MarkerOptions().position(rs13).title("RS Panti wilasa")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs13))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs14: LatLng = LatLng( -6.9698950252141945, 110.43952868685732)
                        mMap.addMarker(MarkerOptions().position(rs14).title("RS Pantiwilasa II")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs14))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs15: LatLng = LatLng( -7.0000219131386645, 110.34227099875403)
                        mMap.addMarker(MarkerOptions().position(rs15).title("RS Permata Medika")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs15))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs16: LatLng = LatLng( -7.00095465999688, 110.42793988340767)
                        mMap.addMarker(MarkerOptions().position(rs16).title("RS Roesmani Muhammadiyah")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs16))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs17: LatLng = LatLng( -6.998868514945478, 110.43392068155156)
                        mMap.addMarker(MarkerOptions().position(rs17).title("RS Siloam Semarang")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs17))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs18: LatLng = LatLng( -7.008160272736608, 110.41962039875403)
                        mMap.addMarker(MarkerOptions().position(rs18).title("RS St.Elisabeth Semarang")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs18))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs19: LatLng = LatLng( -6.955031296563603, 110.46140841038765)
                        mMap.addMarker(MarkerOptions().position(rs19).title("RS Sultan Agung")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs19))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs20: LatLng = LatLng( -6.987318411915282, 110.42712072387819)
                        mMap.addMarker(MarkerOptions().position(rs20).title("RS Telogorejo")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs20))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs21: LatLng = LatLng( -6.9966495693548625, 110.40517332759052)
                        mMap.addMarker(MarkerOptions().position(rs21).title("RS William Booth")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs21))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs22: LatLng = LatLng( -7.068602738253279, 110.31662520432315)
                        mMap.addMarker(MarkerOptions().position(rs22).title("RSIA Ananda Pasar Ace")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs22))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs23: LatLng = LatLng( -6.9923498180692985, 110.40488551224422)
                        mMap.addMarker(MarkerOptions().position(rs23).title("RSIA Anugerah")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs23))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs24: LatLng = LatLng( -6.994239970112018, 110.43315485457097)
                        mMap.addMarker(MarkerOptions().position(rs24).title("RSIA Bunda Semarang")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs24))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs25: LatLng = LatLng( -6.996011662725907, 110.40675475457101)
                        mMap.addMarker(MarkerOptions().position(rs25).title("RSIA Gunung Sawo")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs25))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))

                        var rs26: LatLng = LatLng( -6.975801756092118, 110.4357135103879)
                        mMap.addMarker(MarkerOptions().position(rs26).title("RSIA Kusuma Pradja")
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.ico1)))
                        mMap.moveCamera(CameraUpdateFactory.newLatLng(rs26))
                        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 16F))





                    }
                }
            } else {
                Toast.makeText(this, "Turn on location", Toast.LENGTH_LONG).show()
                val intent = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
                startActivity(intent)
            }
        } else {
            requestPermissions()
        }
    }

    // Mendapatkan Lokasi Terkini
    @SuppressLint("MissingPermission")
    private fun requestNewLocationData() {
        val mLocationRequest = LocationRequest()
        mLocationRequest.priority = LocationRequest.PRIORITY_HIGH_ACCURACY
        mLocationRequest.interval = 0
        mLocationRequest.fastestInterval = 0
        mLocationRequest.numUpdates = 1

        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        mFusedLocationClient.requestLocationUpdates(
            mLocationRequest, mLocationCallback,
            Looper.myLooper()!!
        )
    }

    private val mLocationCallback = object : LocationCallback() {
        override fun onLocationResult(locationResult: LocationResult) {
            val mLastLocation: Location = locationResult.lastLocation
            currentLocation = LatLng(mLastLocation.latitude, mLastLocation.longitude)
        }
    }

    // Cek GPS On atau Off
    private fun isLocationEnabled(): Boolean {
        val locationManager: LocationManager = getSystemService(Context.LOCATION_SERVICE) as LocationManager
        return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) || locationManager.isProviderEnabled(
            LocationManager.NETWORK_PROVIDER
        )
    }

    // Cek Perizinan Lokasi GPS
    private fun checkPermissions(): Boolean {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
        ) {
            return true
        }
        return false
    }

    // Request menyalakan GPS
    private fun requestPermissions() {
        ActivityCompat.requestPermissions(
            this,
            arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION),
            PERMISSION_ID
        )
    }

    // Akses Lokasi Disetujui
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == PERMISSION_ID) {
            if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                getLastLocation()
            }
        }
    }
}