package cn.chuangblog.selectionlistview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.List;

/**
 * @author : created by chuangWu
 * @version : 0.01
 * @email : chuangwu127@gmail.com
 * @created time : 2015-09-17 14:03
 * @description : none
 * @for your attention : none
 * @revise : none
 */
public class ListAdapter extends SectionedBaseAdapter {

    private ListEntity entities;
    private Context context;

    public ListAdapter(Context context, ListEntity entities) {
        this.context = context;
        this.entities = entities;
    }

    @Override
    public Object getItem(int section, int position) {
        return null;
    }

    @Override
    public long getItemId(int section, int position) {
        return position;
    }

    @Override
    public int getSectionCount() {
        return entities.getMap().size();
    }

    @Override
    public int getCountForSection(int section) {
        return entities.getMap().get(entities.getMapKeyArr()[section]).size();
    }

    @Override
    public View getItemView(int section, int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.item_view, null);
        }
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView id = (TextView) convertView.findViewById(R.id.id);
        String nameStr = entities.getMap().get(entities.getMapKeyArr()[section]).get(position).getName();
        int idInt = entities.getMap().get(entities.getMapKeyArr()[section]).get(position).getId();
        name.setText(nameStr);
        id.setText(String.valueOf(idInt));
        return convertView;
    }

    @Override
    public View getSectionHeaderView(int section, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.item_header, null);
        }
        TextView title = (TextView) convertView.findViewById(R.id.title);
        // title.setText(entities.get(section).getName());
        title.setText("分组" + section);
        return convertView;
    }

    @Override
    public int getItemViewTypeCount() {
        return 2;

    }

    @Override
    public int getItemViewType(int section, int position) {
        return super.getItemViewType(section, position);
    }
}
