package br.edu.ifsuldeminas.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "login_main_activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLogin = (Button) findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Clicou no botão Logar",
                        Toast.LENGTH_LONG);

                toast.show();
            }
        });

        Button buttonForgotPW = (Button) findViewById(R.id.buttonForgotPW);
        buttonForgotPW.setOnClickListener(new ForgotPW());
    }

    public void signIn(View view){
        Toast toast = Toast.makeText(getApplicationContext(),
                "Clicou no botão Cadastrar",
                Toast.LENGTH_LONG);

        toast.show();
    }
}
