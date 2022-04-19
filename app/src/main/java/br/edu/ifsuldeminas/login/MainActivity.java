package br.edu.ifsuldeminas.login;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "login_main_activity";
    private static final int REQUEST_FOTO_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLogin = (Button) findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent welcomeIntent = new Intent(getApplicationContext(),
                        WelcomeActivity.class);

                EditText userName = (EditText) findViewById(R.id.editTextUser);
                String name = userName.getText().toString();

                welcomeIntent.putExtra("USER", name);

                startActivity(welcomeIntent);
            }
        });

        Button buttonForgotPW = (Button) findViewById(R.id.buttonForgotPW);
        buttonForgotPW.setOnClickListener(new ForgotPW());
    }

    public void signIn(View view){
        Toast toast = Toast.makeText(view.getContext(),
                "Clicou no botão Cadastrar",
                Toast.LENGTH_LONG);

        toast.show();
    }
}
