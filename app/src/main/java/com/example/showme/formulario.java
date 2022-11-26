package com.example.showme;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.EditText;
import android.widget.TextView;

public class formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        TextView textView = (TextView)findViewById(R.id.textoppc);
        Spannable wordtoSpan = new SpannableString("Política de Privacidad: Chipping SA informa a los usuarios del sitio web lo siguiente. Los datos del tratamiento\n" +
                "y usos a los que se someten los datos de carácter personal que se recaban en la web son protegidos y tratados con el permiso del usuario.");

        wordtoSpan.setSpan(new ForegroundColorSpan(Color.BLACK), 0, 23, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        wordtoSpan.setSpan(new ForegroundColorSpan(Color.BLACK), 87, 113, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        wordtoSpan.setSpan(new ForegroundColorSpan(Color.BLACK), 200, 223, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(wordtoSpan);

        EditText editText = (EditText)findViewById(R.id.txtBasic);
        Spannable wordtoSpan2 = new SpannableString("Nombre");

        wordtoSpan.setSpan(new ForegroundColorSpan(Color.BLACK), 0, 4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        editText.setHint(wordtoSpan2);

    }
}