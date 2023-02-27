package com.example.buoi6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
   private AdapterView.OnItemClickListener onitemclick=new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent(getBaseContext(),ViewPhoto.class);
            intent.putExtra("id",gridView.getAdapter().getItemId(position));
            startActivity(intent);
        }
    };
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.month_gridview);
        PhotoAdapter adapter = new PhotoAdapter(PhotoData.generatePhotoData(),getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(onitemclick);
    }
}