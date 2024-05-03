package com.example.discord;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TreeEnum[] treeEnums = TreeEnum.values();
        for (int i = 0; i < treeEnums.length; i++) {
            TreeEnum treeIds = treeEnums[i];
            ImageView iv = findViewById(treeIds.getBtnId());
            LinearLayout contents = findViewById(treeIds.getLinearId());
            iv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (contents.getVisibility() == View.GONE) {
                        contents.setVisibility(View.VISIBLE);
                        iv.setImageResource(R.drawable.icon_arrow_drop_down);
                    } else {
                        contents.setVisibility(View.GONE);
                        iv.setImageResource(R.drawable.icon_arrow_right);
                    }
                }
            });
        }
        int[] tree2Ids = {R.id.channel_tree1_tv_1, R.id.channel_tree2_tv_1, R.id.channel_tree3_tv_1, R.id.channel_tree3_tv_2, R.id.channel_tree3_tv_3, R.id.channel_tree4_tv_1, R.id.channel_tree4_tv_2, R.id.channel_tree4_tv_3, R.id.channel_tree4_tv_4 };
        for (int i = 0; i < tree2Ids.length; i++) {
            TextView tv = findViewById(tree2Ids[i]);
            CharSequence text = tv.getText();
            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(MainActivity.this, text, duration);
                    toast.show();
                }
            });
        }
    }
}