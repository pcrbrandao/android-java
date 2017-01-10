package org.pcrbrandao.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "org.pcrbrandao.myfistapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Solicitado quando o usuário pressiona o botão Send
     * o tipo View não está definido ainda
     * */
    public void sendMessage(View view) {
        // falta implementar
        Intent intent = new Intent(this, DisplayMessageActivity.class); // vai corrigir aqui
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
