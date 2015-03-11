package org.passiba.fooddelivery;

import android.app.Fragment;


public class FoodDeliveryDetailsActivity extends FoodDeliveryActivity {

    @Override
    protected Fragment getRootFragment() {
        return FoodDeliveryDetailFragment.getInstance();
    }
}