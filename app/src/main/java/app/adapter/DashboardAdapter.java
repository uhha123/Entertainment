package app.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;

import com.eftimoff.androipathview.PathView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import entertainment.vn.R;

/**
 * Created by mobit on 22/08/2016.
 */
public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.DashboardViewHolder>{
    private Context context;
    private ArrayList<String> titles;

    public DashboardAdapter(Context context, ArrayList<String> titles) {
        this.context = context;
        this.titles = titles;
    }

    @Override
    public DashboardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DashboardViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dashboard, parent, false));
    }

    @Override
    public void onBindViewHolder(DashboardViewHolder holder, int position) {
        holder.tvTitle.setText(titles.get(position));

        switch (position){
            case 0:
                holder.crdBg.setCardBackgroundColor(context.getResources().getColor(R.color.dash_card_green_dark));
                holder.pathView.setSvgResource(R.raw.settings);
                holder.pathView.getPathAnimator().
                        //pathView.getSequentialPathAnimator().
                                delay(100).
                        duration(1500).
                        interpolator(new AccelerateDecelerateInterpolator()).
                        start();
                break;
            case 1:
                holder.crdBg.setCardBackgroundColor(context.getResources().getColor(R.color.dash_card_red));
                holder.pathView.setSvgResource(R.raw.shopping_cart);
                holder.pathView.getPathAnimator().
                        //pathView.getSequentialPathAnimator().
                                delay(100).
                        duration(1500).
                        interpolator(new AccelerateDecelerateInterpolator()).
                        start();
                break;
            case 2:
                holder.crdBg.setCardBackgroundColor(context.getResources().getColor(R.color.dash_card_violet));
                holder.pathView.setSvgResource(R.raw.star);
                holder.pathView.getPathAnimator().
                        //pathView.getSequentialPathAnimator().
                                delay(100).
                        duration(1500).
                        interpolator(new AccelerateDecelerateInterpolator()).
                        start();
                break;
            case 3:
                holder.crdBg.setCardBackgroundColor(context.getResources().getColor(R.color.dash_card_yellow));
                holder.pathView.setSvgResource(R.raw.upload);
                holder.pathView.getPathAnimator().
                        //pathView.getSequentialPathAnimator().
                                delay(100).
                        duration(1500).
                        interpolator(new AccelerateDecelerateInterpolator()).
                        start();
                break;
        }
    }

    @Override
    public int getItemCount() {
        return (titles == null)?0:titles.size();
    }

    class DashboardViewHolder extends RecyclerView.ViewHolder{

        @Bind(R.id.crdView_dashboard)
        CardView crdBg;
        @Bind(R.id.pathView_item_dashboard)
        PathView pathView;
        @Bind(R.id.tv_dashboard_title)
        TextView tvTitle;
        public DashboardViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
