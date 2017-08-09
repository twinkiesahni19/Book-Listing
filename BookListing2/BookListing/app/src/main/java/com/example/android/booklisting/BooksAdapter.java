package com.example.android.booklisting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Twinkle Sahni on 28-Apr-17.
 */

public class BooksAdapter extends ArrayAdapter<Book> {
    public BooksAdapter(Context context, List<Book> books) {
        super(context, 0, books);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listitem = convertView;
        if (listitem == null) {
            listitem = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Book current = getItem(position);
        TextView title = (TextView) listitem.findViewById(R.id.title);
        TextView author = (TextView) listitem.findViewById(R.id.authors);
        TextView description = (TextView) listitem.findViewById(R.id.desc);
        TextView publisher = (TextView) listitem.findViewById(R.id.publisher);
        title.setText(current.getTitle());
        author.setText(current.getAuthor());
        description.setText(current.getDescription());
        publisher.setText(current.getPublisher());
        return listitem;
    }
}
