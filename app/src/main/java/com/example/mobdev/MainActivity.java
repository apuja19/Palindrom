package com.example.mobdev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
    Button tombolcek, tombolnext;
    EditText isinama, isipalindrome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tombolcek = findViewById(R.id.tombolcek);
        tombolnext = findViewById(R.id.tombolnext);
        isinama = findViewById(R.id.isinama);
        isipalindrome = findViewById(R.id.isipalindrome);


        tombolcek.setOnClickListener(view -> {

            String name = isipalindrome.getText().toString().toLowerCase();
            //boolean ans = false;
            String rev = "";
            for (int i = name.length() - 1; i >= 0; i--) {
                rev = rev + name.charAt(i);
            }

            if (name.equals(rev)) {
                toastMessage("isPalindrome");
            }
            else{
                toastMessage("not palindrome");
            }
        });

        tombolnext.setOnClickListener(view -> {
            String nama = isinama.getText().toString();
            Intent intent = new Intent(view.getContext(), SecondScreen.class);
            intent.putExtra("isinama", nama);
            startActivity(intent);
        });
    }

    private void toastMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}