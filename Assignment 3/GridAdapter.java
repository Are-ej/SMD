import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {
    private Context context;
    private final String[] textLabels;
    private final int[] imageIds;

    public GridAdapter(Context context, String[] textLabels, int[] imageIds) {
        this.context = context;
        this.textLabels = textLabels;
        this.imageIds = imageIds;
    }

    @Override
    public int getCount() {
        return textLabels.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.grid_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.grid_item_image);
        TextView textView = convertView.findViewById(R.id.grid_item_text);

        imageView.setImageResource(imageIds[position]);
        textView.setText(textLabels[position]);

        return convertView;
    }
}
