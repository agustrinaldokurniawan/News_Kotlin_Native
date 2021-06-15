package com.tsuga.news;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;
import com.tsuga.news.databinding.ActivityMainBinding;
import com.tsuga.news.home.HomeFragment;
import kotlin.jvm.internal.Intrinsics;

public final class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private View decorView;
    private NavController navController;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityMainBinding inflate = ActivityMainBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.binding = inflate;
        if (inflate != null) {
            setContentView(inflate.getRoot());
            View decorView2 = getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView2, "window.decorView");
            this.decorView = decorView2;
            getWindow().setFlags(512, 512);
            ActivityMainBinding activityMainBinding = this.binding;
            if (activityMainBinding != null) {
                ChipNavigationBar chipNavigationBar = activityMainBinding.cnb;
                Intrinsics.checkNotNullExpressionValue(chipNavigationBar, "binding.cnb");
                ChipNavigationBar.setItemSelected$default(chipNavigationBar, R.id.home_menu, false, 2, null);
                ActivityMainBinding activityMainBinding2 = this.binding;
                if (activityMainBinding2 != null) {
                    activityMainBinding2.cnb.setOnItemSelectedListener(new MainActivity$onCreate$1(this));
                    ActionBar supportActionBar = getSupportActionBar();
                    if (supportActionBar != null) {
                        supportActionBar.hide();
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.home_fragment_container, new HomeFragment()).commit();
                    return;
                }
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        NavController navController2 = this.navController;
        if (navController2 != null) {
            return navController2.navigateUp() || super.onSupportNavigateUp();
        }
        Intrinsics.throwUninitializedPropertyAccessException("navController");
        throw null;
    }

    /* access modifiers changed from: public */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void changeFragment(int r3) {
        /*
            r2 = this;
            r0 = 2131230806(0x7f080056, float:1.8077675E38)
            if (r3 == r0) goto L_0x0020
            r0 = 2131230921(0x7f0800c9, float:1.8077908E38)
            if (r3 == r0) goto L_0x0018
            r0 = 2131231063(0x7f080157, float:1.8078196E38)
            if (r3 == r0) goto L_0x0010
            goto L_0x0030
        L_0x0010:
            com.tsuga.news.search.SearchFragment r3 = new com.tsuga.news.search.SearchFragment
            r3.<init>()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            goto L_0x0031
        L_0x0018:
            com.tsuga.news.home.HomeFragment r3 = new com.tsuga.news.home.HomeFragment
            r3.<init>()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            goto L_0x0031
        L_0x0020:
            java.lang.String r3 = "favorite_app://favorite"
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1, r3)
            r2.startActivity(r0)
        L_0x0030:
            r3 = 0
        L_0x0031:
            if (r3 == 0) goto L_0x0045
            androidx.fragment.app.FragmentManager r0 = r2.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
            r1 = 2131230920(0x7f0800c8, float:1.8077906E38)
            androidx.fragment.app.FragmentTransaction r3 = r0.replace(r1, r3)
            r3.commit()
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsuga.news.MainActivity.changeFragment(int):void");
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            View view = this.decorView;
            if (view != null) {
                view.setSystemUiVisibility(4866);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("decorView");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        ActivityMainBinding activityMainBinding = this.binding;
        if (activityMainBinding != null) {
            ChipNavigationBar chipNavigationBar = activityMainBinding.cnb;
            Intrinsics.checkNotNullExpressionValue(chipNavigationBar, "binding.cnb");
            ChipNavigationBar.setItemSelected$default(chipNavigationBar, R.id.home_menu, false, 2, null);
            getSupportFragmentManager().beginTransaction().replace(R.id.home_fragment_container, new HomeFragment()).commit();
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        throw null;
    }
}
