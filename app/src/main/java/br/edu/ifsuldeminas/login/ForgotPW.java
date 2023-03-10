package br.edu.ifsuldeminas.login;

import android.view.View;
import android.widget.Toast;

public class ForgotPW implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Toast toast = Toast.makeText(view.getContext(),
                R.string.button_forgot_pw_click,
                Toast.LENGTH_LONG);

        toast.show();
    }
}
