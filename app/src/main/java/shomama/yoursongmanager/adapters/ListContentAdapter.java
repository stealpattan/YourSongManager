package shomama.yoursongmanager.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
// java utils
import java.util.ArrayList;
import java.util.List;
// list item container
import shomama.yoursongmanager.typeClass.listItemContainer;

public class ListContentAdapter extends ArrayAdapter<listItemContainer>{

    // layout name
    private int layoutId;
    // context name
    private Context context;
    // list item container
    private List<listItemContainer> songListItems;
    // layout inflater
    private LayoutInflater layoutInflater;

    public ListContentAdapter(Context context,int layoutId, List<listItemContainer> listItems){
        super(context, layoutId, listItems);

        this.context = context;
        this.layoutId = layoutId;
        songListItems = listItems;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View view;
        if(convertView != null){
            view = convertView;
        }
        else{
            view = layoutInflater.inflate(this.layoutId, null);
        }
        // 表示するアイテムの取得
        listItemContainer item = this.songListItems.get(position);
        // 表示する準備　ウィジェットの用意
        return view;
    }
}
