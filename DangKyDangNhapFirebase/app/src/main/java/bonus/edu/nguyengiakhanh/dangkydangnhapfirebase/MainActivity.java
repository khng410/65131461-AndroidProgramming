package bonus.edu.nguyengiakhanh.dangkydangnhapfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth auth;
    private TextView txtEmail, txtWelcome;
    private Button btnLogout, btnLogin, btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auth = FirebaseAuth.getInstance();

        txtWelcome = findViewById(R.id.txt_welcome);
        txtEmail = findViewById(R.id.txt_user_email);
        btnLogout = findViewById(R.id.btn_logout);
        btnLogin = findViewById(R.id.btn_main_login);
        btnRegister = findViewById(R.id.btn_main_register);

        updateUI();

        btnLogin.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
        });

        btnRegister.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, RegisterActivity.class));
        });

        btnLogout.setOnClickListener(v -> {
            auth.signOut();
            updateUI();
        });
    }

    private void updateUI() {
        FirebaseUser user = auth.getCurrentUser();
        if (user != null) {
            txtEmail.setVisibility(View.VISIBLE);
            btnLogout.setVisibility(View.VISIBLE);
            btnLogin.setVisibility(View.GONE);
            btnRegister.setVisibility(View.GONE);

            txtEmail.setText(user.getEmail());
            txtWelcome.setText("Chào mừng, " + user.getEmail() + "!");
        } else {
            txtEmail.setVisibility(View.GONE);
            btnLogout.setVisibility(View.GONE);
            btnLogin.setVisibility(View.VISIBLE);
            btnRegister.setVisibility(View.VISIBLE);

            txtWelcome.setText("Chào mừng bạn!");
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        updateUI();
    }
}