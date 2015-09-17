package cn.chuangblog.selectionlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import cn.chuangblog.selectionlistview.game.Entity;
import cn.chuangblog.selectionlistview.game.GameListEntity;

public class MainActivity extends AppCompatActivity {

    PinnedHeaderListView listView;
    ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListEntity entity = new ListEntity();
        entity.setName("TEST");
        List<Entity> one = new ArrayList<Entity>();
        List<Entity> two = new ArrayList<Entity>();
        List<Entity> three = new ArrayList<Entity>();
        for (int i = 0; i < 20; i++) {
            Entity data = new Entity();
            data.setName(i + "-One");
            data.setId(i + 1000);
            one.add(data);
            Entity data_ = new Entity();
            data_.setName(i + "-Two");
            data_.setId(i + 2000);
            two.add(data_);
            Entity data__ = new Entity();
            data__.setName(i + "-Three");
            data__.setId(i + 3000);
            three.add(data__);
        }
        entity.setOne(one);
        entity.setTwo(two);
        entity.setThree(three);

        entity.getMap().put(entity.getMapKeyArr()[0], one);
        entity.getMap().put(entity.getMapKeyArr()[1], two);
        entity.getMap().put(entity.getMapKeyArr()[2], three);


        initView();
        initData();
        initListener();

        TextView textView = new TextView(this);
        textView.setText("HAHAHAHAHA");
        listView.addHeaderView(textView);

        TextView textView2 = new TextView(this);
        textView2.setText("DDDDD");
        listView.addHeaderView(textView2);

        TextView textView3 = new TextView(this);
        textView3.setText("GAGDGSD");
        listView.addFooterView(textView3);

        adapter = new ListAdapter(this, entity);
        listView.setAdapter(adapter);



    }

    private void initListener() {

    }

    private void initView() {
        listView = (PinnedHeaderListView) findViewById(R.id.pinnedListView);
    }

    private void initData() {

    }
}
