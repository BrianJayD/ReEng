package ca.uoit.csci4100u.reeng;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by brianjayd on 2018-07-29.
 */

public class AccountActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.user_account_page);
    }

    public void maxId(View view) {
        Intent intent = new Intent(AccountActivity.this, IdPage.class);
        startActivity(intent);
    }
}
