package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

public class zillavittik extends AppCompatActivity {

    private ListView l;
    private ArrayAdapter<String> a;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zillavittik);

        l=(ListView) findViewById(R.id.list);
        searchView=(SearchView)findViewById(R.id.search);
        final String[] districtnames=getResources().getStringArray(R.array.district);

        a=new ArrayAdapter<String>(zillavittik.this,R.layout.showzillavittik,R.id.zillatextview,districtnames);
        l.setAdapter(a);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int x=0;
                String value =a.getItem(position);
                for(int i=0;i<61;i++)
                {
                    if(value.equals(districtnames[i]))
                    {
                        x=i;
                        break;
                    }
                }
                Intent intent1=new Intent(zillavittik.this,zillanewspaper.class);
                intent1.putExtra("key",x);
                startActivity(intent1);
            }
        });
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                a.getFilter().filter(newText);
                return false;
            }
        });

    }
}
