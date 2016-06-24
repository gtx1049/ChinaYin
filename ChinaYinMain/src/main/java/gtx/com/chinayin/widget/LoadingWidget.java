package gtx.com.chinayin.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import gtx.com.chinayin.R;

/**
 * Created by gtx1049 on 16-6-24.
 */
public class LoadingWidget extends ViewGroup{

    private ImageView loadingImage = null;
    private TextView loadingText = null;


    public LoadingWidget(Context context){
        super(context);

        LayoutInflater.from(context).inflate(R.layout.widget_loading, this, true);
        loadingImage = (ImageView)this.findViewById(R.id.widget_loading_image);
        loadingText = (TextView)this.findViewById(R.id.widget_loading_text);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }

    public void updateProgress(){

    }

    public void startLoading(){

    }

    public void stopLoading(){

    }
}
