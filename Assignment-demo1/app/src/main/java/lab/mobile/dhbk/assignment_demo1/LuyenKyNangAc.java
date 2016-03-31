package lab.mobile.dhbk.assignment_demo1;


import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class LuyenKyNangAc extends TabActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.luyenkynang);

        TabHost tabHost = getTabHost();
        tabHost.addTab(tabHost.newTabSpec("tabTuvung").setIndicator("Vocabulary", getResources().getDrawable(R.drawable.icon_voca_tab)).setContent(new Intent().setClass(this, tratuvung.class)));
        tabHost.addTab(tabHost.newTabSpec("tabNguphap").setIndicator("Grammar", getResources().getDrawable(R.drawable.icon_grammar_tab)).setContent(new Intent().setClass(this, MainActivity.class)));
        tabHost.addTab(tabHost.newTabSpec("tabLuyenNghe").setIndicator("Listening",getResources().getDrawable(R.drawable.icon_listen_tab) ).setContent(new Intent().setClass(this, LuyenNghe.class)));
    }


}
