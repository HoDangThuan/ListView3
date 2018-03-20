package com.example.lenovo.listview3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvPerSonInfo;
    ArrayList<PerSonInformation> arrayPerSonInfo;
    AdapterPerSonInfor adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        adapter=new AdapterPerSonInfor(this,R.layout.line_person_infor, arrayPerSonInfo);
        lvPerSonInfo.setAdapter(adapter);
    }

    private void AnhXa() {
        lvPerSonInfo = (ListView) findViewById(R.id.listViewPerSonInformation);
        arrayPerSonInfo = new ArrayList<>();


        arrayPerSonInfo.add(new PerSonInformation(R.drawable.person01,R.drawable.online,R.drawable.offline,R.drawable.star,R.drawable.next,
                "Hồ Đăng Thuần", (float) 2.8,(float) 4.7,(float) 1.5));
        arrayPerSonInfo.add(new PerSonInformation(R.drawable.person02,R.drawable.online,R.drawable.offline,R.drawable.star,R.drawable.next,
                "Đặng Ngọc Nguyên", (float) 0.4,(float) 3.4,(float) -1));
        arrayPerSonInfo.add(new PerSonInformation(R.drawable.person03,R.drawable.online,R.drawable.offline,R.drawable.star,R.drawable.next,
                "Trịnh Thị Mỹ Anh", (float) 3.7,(float) 4.2,(float) 5));

        arrayPerSonInfo.add(new PerSonInformation(R.drawable.person01,R.drawable.online,R.drawable.offline,R.drawable.star,R.drawable.next,
                "Hồ Đăng Thuần", (float) 2.8,(float) 2.1,(float) 1.5));
        arrayPerSonInfo.add(new PerSonInformation(R.drawable.person02,R.drawable.online,R.drawable.offline,R.drawable.star,R.drawable.next,
                "Đặng Ngọc Nguyên", (float) 0.4,(float) 1.5,(float) -1));
        arrayPerSonInfo.add(new PerSonInformation(R.drawable.person03,R.drawable.online,R.drawable.offline,R.drawable.star,R.drawable.next,
                "Trịnh Thị Mỹ Anh", (float) 3.7,(float) 3.8,(float) 5));

    }
}
