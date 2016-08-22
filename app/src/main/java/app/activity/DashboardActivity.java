package app.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

import com.eftimoff.androipathview.PathView;

import java.util.ArrayList;

import app.adapter.DashboardAdapter;
import butterknife.Bind;
import butterknife.ButterKnife;
import entertainment.vn.R;

public class DashboardActivity extends AppCompatActivity {
    private ArrayList<String> titles;
    private DashboardAdapter adapter;

    @Bind(R.id.rv_dashboard)
    RecyclerView rvDashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ButterKnife.bind(this);
        setupUI();

    }

    private void setupUI() {
        titles = new ArrayList<>();
        titles.add(getString(R.string.dashboard_music));
        titles.add(getString(R.string.dashboard_music));
        titles.add(getString(R.string.dashboard_music));
        titles.add(getString(R.string.dashboard_music));
        rvDashboard.setLayoutManager(new GridLayoutManager(this, 2));
        adapter = new DashboardAdapter(this, titles);
        rvDashboard.setAdapter(adapter);
    }
}
