package com.example.haasikapuram.dontpanic;

import android.Manifest;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.gsm.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;


import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity implements LocationListener {
    ImageView imageView1;
    ImageView imageView2;
    SQLiteDatabase sqLiteDatabase;
    UerDbHelper userDbHelper;
    Cursor cursor;
    int count = 0;
    int i = 0;
    GPSTracker gps;
    String[] con;
    protected LocationListener locationListener;
    protected Context context;
    TextView txtLat;
    String lat;
    String provider;
    protected String latitude, longitude;
    protected boolean gps_enabled, network_enabled;
    double lat1, lng;
    Location nwLocation;

    Button b;


    final String TAG = "GPS";
    private final static int ALL_PERMISSIONS_RESULT = 101;
    private static final long MIN_DISTANCE_CHANGE_FOR_UPDATES = 10;
    private static final long MIN_TIME_BW_UPDATES = 1000 * 60 * 1;

    TextView tvLatitude, tvLongitude, tvTime;
    LocationManager locationManager;
    Location loc;
    ArrayList<String> permissions = new ArrayList<>();
    ArrayList<String> permissionsToRequest;
    ArrayList<String> permissionsRejected = new ArrayList<>();
    boolean isGPS = false;
    boolean isNetwork = false;
    boolean canGetLocation = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d("test","working1");
        imageView1 = (ImageView) findViewById(R.id.help);
        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.help1);
        RoundedBitmapDrawable roundedBitmapDrawable1 = RoundedBitmapDrawableFactory.create(getResources(), bitmap1);
        roundedBitmapDrawable1.setCircular(true);


        gps = new GPSTracker(this);


            //locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
            imageView1.setImageDrawable(roundedBitmapDrawable1);

            imageView1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    userDbHelper = new UerDbHelper(Home.this);
                    sqLiteDatabase = userDbHelper.getReadableDatabase();
                    cursor = userDbHelper.getInformations(sqLiteDatabase);

                    if (cursor.moveToFirst()) {
                        do {
                            String mob;
                            ArrayList<String> al = new ArrayList<String>();

                            mob = cursor.getString(1);
                            al.add(mob);

                                   try {

                                        locationManager = (LocationManager) getSystemService(Service.LOCATION_SERVICE);
                                        isGPS = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
                                        isNetwork = locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);

                                        permissions.add(Manifest.permission.ACCESS_FINE_LOCATION);
                                        permissions.add(Manifest.permission.ACCESS_COARSE_LOCATION);
                                        permissionsToRequest = findUnAskedPermissions(permissions);

                                        if (!isGPS && !isNetwork) {
                                            Log.d(TAG, "Connection off");
                                            showSettingsAlert();
                                            getLastLocation();
                                        } else {
                                            Log.d(TAG, "Connection on");
                                            // check permissions
                                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                                                if (permissionsToRequest.size() > 0) {
                                                    requestPermissions(permissionsToRequest.toArray(new String[permissionsToRequest.size()]),
                                                            ALL_PERMISSIONS_RESULT);
                                                    Log.d(TAG, "Permission requests");
                                                    canGetLocation = false;
                                                }
                                            }

                                            // get location
                                            getLocation();
                                            String body = "Please Help Me At :" + "http://www.google.com/maps/place/" + lat1 + "," + lng;

                                            Toast.makeText(getApplicationContext(), "Sent" + body, Toast.LENGTH_LONG).show();

                                          /*  SmsManager sms = SmsManager.getDefault();
                                            sms.sendTextMessage(mob, null, body, null, null);
                                            Toast.makeText(getApplicationContext(), "Sent" + body, Toast.LENGTH_LONG).show();
                                        */}

                                    } catch (IndexOutOfBoundsException e) {
                                    }



                            if (al.size() == 0) {
                                Toast.makeText(getApplicationContext(), "sorry", Toast.LENGTH_LONG).show();
                            } else {
                                for (int i1 = 0; al.size() > 0; i1++) {
                                    Toast.makeText(getApplicationContext(), al.get(i1), Toast.LENGTH_LONG).show();


                                    try {

                                        locationManager = (LocationManager) getSystemService(Service.LOCATION_SERVICE);
                                        isGPS = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
                                        isNetwork = locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);

                                        permissions.add(Manifest.permission.ACCESS_FINE_LOCATION);
                                        permissions.add(Manifest.permission.ACCESS_COARSE_LOCATION);
                                        permissionsToRequest = findUnAskedPermissions(permissions);

                                        if (!isGPS && !isNetwork) {
                                            Log.d(TAG, "Connection off");
                                            showSettingsAlert();
                                            getLastLocation();
                                        } else {
                                            Log.d(TAG, "Connection on");
                                            Toast.makeText(getApplicationContext(), "Sent", Toast.LENGTH_LONG).show();
                                            // check permissions
                                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                                                if (permissionsToRequest.size() > 0) {
                                                    requestPermissions(permissionsToRequest.toArray(new String[permissionsToRequest.size()]),
                                                            ALL_PERMISSIONS_RESULT);
                                                    Log.d(TAG, "Permission requests");
                                                    canGetLocation = false;
                                                }
                                            }

                                            // get location
                                            getLocation();
                                            String body = "Please Help Me At :" + "http://www.google.com/maps/place/" + lat1 + "," + lng;
                                            SmsManager sms = SmsManager.getDefault();
                                            sms.sendTextMessage(al.get(i1), null, body, null, null);
                                            Toast.makeText(getApplicationContext(), "Sent"+body, Toast.LENGTH_LONG).show();
                                        }

                                    } catch (IndexOutOfBoundsException e) {
                                    }


                                }
                            }

                        } while (cursor.moveToNext());
                    }


                }
            });

            imageView2 = (ImageView) findViewById(R.id.minfo);
            Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.info);
            RoundedBitmapDrawable roundedBitmapDrawable2 = RoundedBitmapDrawableFactory.create(getResources(), bitmap2);
            roundedBitmapDrawable2.setCircular(true);
            imageView2.setImageDrawable(roundedBitmapDrawable2);

            imageView2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i2 = new Intent(Home.this, MainActivity.class);
                    startActivity(i2);

                }
            });

        b = (Button) findViewById(R.id.call);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:108"));
                startActivity(callIntent);
            }
        });

    }


    private boolean insertDummyContactWrapper() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            List<String> permissionsNeeded = new ArrayList<>();
            final List<String> permissionsList = new ArrayList<String>();
            if (!addPermission(permissionsList, android.Manifest.permission.ACCESS_FINE_LOCATION))
                permissionsNeeded.add("ACCESS_FINE_LOCATION");
            if (!addPermission(permissionsList, Manifest.permission.ACCESS_COARSE_LOCATION))
                permissionsNeeded.add("ACCESS_COARSE_LOCATION");
            if (!addPermission(permissionsList, Manifest.permission.SEND_SMS))
                permissionsNeeded.add("SEND_SMS");

            requestPermissions(permissionsList.toArray(new String[permissionsList.size()]),
                    123);
            return false;
        }
        return true;
    }
    private boolean addPermission(List<String> permissionsList, String permission) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (Home.this.checkSelfPermission(permission) != PackageManager.PERMISSION_GRANTED) {
                permissionsList.add(permission);
                if (!shouldShowRequestPermissionRationale(permission))
                    return false;
            }
        }
        return true;
    }



    @Override
    public void onLocationChanged(Location location) {
        Log.d(TAG, "onLocationChanged");
        updateUI(location);
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {}

    @Override
    public void onProviderEnabled(String s) {
        getLocation();
    }

    @Override
    public void onProviderDisabled(String s) {
        if (locationManager != null) {
            locationManager.removeUpdates(this);
        }
    }

    private void getLocation() {
        try {
            if (canGetLocation) {
                Log.d(TAG, "Can get location");
                if (isGPS) {
                    // from GPS
                    Log.d(TAG, "GPS on");
                    locationManager.requestLocationUpdates(
                            LocationManager.GPS_PROVIDER,
                            MIN_TIME_BW_UPDATES,
                            MIN_DISTANCE_CHANGE_FOR_UPDATES, this);

                    if (locationManager != null) {
                        loc = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
                        if (loc != null)
                            updateUI(loc);
                    }
                } else if (isNetwork) {
                    // from Network Provider
                    Log.d(TAG, "NETWORK_PROVIDER on");
                    locationManager.requestLocationUpdates(
                            LocationManager.NETWORK_PROVIDER,
                            MIN_TIME_BW_UPDATES,
                            MIN_DISTANCE_CHANGE_FOR_UPDATES, this);

                    if (locationManager != null) {
                        loc = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                        if (loc != null)
                            updateUI(loc);
                    }
                } else {
                    loc.setLatitude(0);
                    loc.setLongitude(0);
                    updateUI(loc);
                }
            } else {
                Log.d(TAG, "Can't get location");
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    private void getLastLocation() {
        try {
            Criteria criteria = new Criteria();
            String provider = locationManager.getBestProvider(criteria, false);
            Location location = locationManager.getLastKnownLocation(provider);
            Log.d(TAG, provider);
            Log.d(TAG, location == null ? "NO LastLocation" : location.toString());
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }

    private ArrayList findUnAskedPermissions(ArrayList<String> wanted) {
        ArrayList result = new ArrayList();

        for (String perm : wanted) {
            if (!hasPermission(perm)) {
                result.add(perm);
            }
        }

        return result;
    }

    private boolean hasPermission(String permission) {
        if (canAskPermission()) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                return (checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED);
            }
        }
        return true;
    }

    private boolean canAskPermission() {
        return (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP_MR1);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case ALL_PERMISSIONS_RESULT:
                Log.d(TAG, "onRequestPermissionsResult");
                for (String perms : permissionsToRequest) {
                    if (!hasPermission(perms)) {
                        permissionsRejected.add(perms);
                    }
                }

                if (permissionsRejected.size() > 0) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        if (shouldShowRequestPermissionRationale(permissionsRejected.get(0))) {
                            showMessageOKCancel("These permissions are mandatory for the application. Please allow access.",
                                    new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                                                requestPermissions(permissionsRejected.toArray(
                                                        new String[permissionsRejected.size()]), ALL_PERMISSIONS_RESULT);
                                            }
                                        }
                                    });
                            return;
                        }
                    }
                } else {
                    Log.d(TAG, "No rejected permissions.");
                    canGetLocation = true;
                    getLocation();
                }
                break;
        }
    }

    public void showSettingsAlert() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("GPS is not Enabled!");
        alertDialog.setMessage("Do you want to turn on GPS?");
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                startActivity(intent);
            }
        });

        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        alertDialog.show();
    }

    private void showMessageOKCancel(String message, DialogInterface.OnClickListener okListener) {
        new AlertDialog.Builder(Home.this)
                .setMessage(message)
                .setPositiveButton("OK", okListener)
                .setNegativeButton("Cancel", null)
                .create()
                .show();
    }

    private void updateUI(Location loc) {
        Log.d(TAG, "updateUI");
       lat1=loc.getLatitude();
        lng=loc.getLongitude();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (locationManager != null) {
            locationManager.removeUpdates(this);
        }
    }




}

