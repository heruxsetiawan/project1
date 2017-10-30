package com.example.united.mrk;

import android.app.Dialog;
import android.content.Context;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/**
 * Created by united on 26-Oct-17.
 */

public class dialog_gambar extends Dialog {
    Context kontek;
    ImageView img;


    public dialog_gambar(Context context, String url) {
        super(context);

        setContentView(R.layout.dialog_gambar);
        img = (ImageView) findViewById(R.id.gambar_dialog);
        Picasso.with(kontek)
                .load(url)
                .into(img);
    }

   

}
