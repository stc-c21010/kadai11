package jp.suntech.c21010.mykadainationview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView select=findViewById(R.id.snation);
        ListView country=findViewById(R.id.litem);
        country.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent,View view,int position,long id){
                String c=(String) parent.getItemAtPosition(position);
                String s="あなたが選んだ国："+c;
                select.setText(s);
            }
        });


    }
    //private class ListItemClickListener implements AdapterView.OnItemClickListener{
    //    @Override
    //    public void onItemClick(AdapterView<?> parent,View view,int position,long id){
    //        String c=(String) parent.getItemAtPosition(position);
    //        String s="あなたが選んだ国："+c;
    //    }
    //}


}