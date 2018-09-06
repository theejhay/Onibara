package ismummy.me.onibara.ui.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import ismummy.me.onibara.R;

public class SliderViewHolders extends RecyclerView.ViewHolder {
    @BindView(R.id.carouselView)
    CarouselView carouselView;

    private int[] sampleImages = {R.drawable.banner1, R.drawable.banner2, R.drawable.banner3};

    public SliderViewHolders(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);

        carouselView.setPageCount(sampleImages.length);
        ImageListener imageListener = new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setImageResource(sampleImages[position]);
            }
        };
        carouselView.setImageListener(imageListener);
    }

}