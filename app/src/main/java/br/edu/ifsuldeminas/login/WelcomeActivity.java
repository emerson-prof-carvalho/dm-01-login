package br.edu.ifsuldeminas.login;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class WelcomeActivity extends AppCompatActivity {

    private final String TAG = "login-bem-vindo";
    private static final int REQUEST_PICTURE_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Intent callingIntent =  getIntent();

        String name = callingIntent.getStringExtra("USER");
        String welcome = String.format("Bem vindo '%s'!", name);

        View layout = findViewById(R.id.activity_bem_vindo_id);
        Snackbar snackbar = Snackbar.make(layout, welcome, Snackbar.LENGTH_LONG);
        snackbar.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Rodou o método onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Rodou o método onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Rodou o método onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Rodou o método onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Rodou o método onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w(TAG, "Rodou o método onDestroy()");
    }

    public void takePictureClick(View view){
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(takePictureIntent, REQUEST_PICTURE_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_PICTURE_CODE && resultCode == RESULT_OK && data != null){
            Bundle extras = data.getExtras();
            Bitmap picture = (Bitmap) extras.get("data");

            ImageView imageView = findViewById(R.id.imagePictureViewId);
            imageView.setImageBitmap(picture);
        }
    }
}