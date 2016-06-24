package gtx.com.chinayin.netutil;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import gtx.com.chinayin.widget.LoadingWidget;

/**
 * Created by gtx1049 on 16-6-24.
 */
public class PostTool {

    private Context mContext;
    private RequestQueue mRequestQueue;
    private LoadingWidget mLoadingWidget;
    private UIhandler mUIhandler;

    public PostTool(Context context, LoadingWidget loadingWidget, UIhandler uihandler){

        this.mContext = context;
        mRequestQueue = Volley.newRequestQueue(context);
        this.mLoadingWidget = loadingWidget;
        this.mUIhandler = uihandler;
    }

    public void doPost(){
        mLoadingWidget.startLoading();
    }

    public void doGet(){

    }
}
