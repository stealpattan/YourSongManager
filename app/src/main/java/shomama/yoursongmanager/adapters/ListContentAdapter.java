package shomama.yoursongmanager.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;
// java utils
import java.util.ArrayList;
// list item container
import shomama.yoursongmanager.typeClass.listItemContainer;

public class ListContentAdapter extends ArrayAdapter{

    // layout name
    private int layoutName;
    // context name
    private Context context;
    // list item container
    private ArrayList<listItemContainer> songListItems;

    public ListContentAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }
}
