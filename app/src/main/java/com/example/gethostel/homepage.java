package com.example.gethostel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class homepage extends AppCompatActivity {
    public static final String triple  ="com.example.gethostel.MESSAGE";
    public static final String mark  ="com.example.gethostel.MESSAGE";
    public static final String beco  ="com.example.gethostel.MESSAGE";
    public static final String golf  ="com.example.gethostel.MESSAGE";
    ListView list;
    ArrayAdapter<String> array;
    ArrayList<String> hostels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Button bt = findViewById(R.id.hostels);
        registerForContextMenu(bt);

        list = findViewById(R.id.listview);
        hostels = new ArrayList<>();
        hostels.add("Triple B");
        hostels.add("Mark");
        hostels.add("Beco");
        hostels.add("Golf Course");
array = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,hostels);
list.setAdapter(array);
list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(homepage.this,BottomView.class);
        startActivity(intent);
    }
});



    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add("Triple B");
        menu.add("Mark");
        menu.add("Beco");
        menu.add("Golf course");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

            Intent intent = new Intent(this,BottomView.class);
//            String x = (String) item.getTitle();
//            intent.putExtra(triple,x);
            startActivity(intent);
//            Toast.makeText(this, "Text or button working, +"+x, Toast.LENGTH_SHORT).show();
//




        return super.onContextItemSelected(item);
    }
}
