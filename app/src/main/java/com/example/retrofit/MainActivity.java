package com.example.retrofit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.retrofit.Retro.GetData;
import com.example.retrofit.Retro.Retro;
import com.example.retrofit.Retro.RetrofitInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private CustomAdapter adapter;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Object of Interface GetData, RetrofitInstance is the class we created which had the method getRetrofitInstance()
        GetData data = RetrofitInstance.getRetrofitInstance().create(GetData.class);

        Call<List<Retro>> serve = data.getPosts();
        serve.enqueue(new Callback<List<Retro>>() {
            @Override
            public void onResponse(@NonNull Call<List<Retro>> call, @NonNull Response<List<Retro>> response) {

                createList(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<List<Retro>> call, @NonNull Throwable t) {
                Toast.makeText(getApplicationContext(),"Failed",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void createList(List<Retro> body) {
        recyclerView = findViewById(R.id.list);
        adapter = new CustomAdapter(this,body);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}