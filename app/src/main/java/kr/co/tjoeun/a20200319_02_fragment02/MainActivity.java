package kr.co.tjoeun.a20200319_02_fragment02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kr.co.tjoeun.a20200319_02_fragment02.adapters.MainViewPagerAdapter;
import kr.co.tjoeun.a20200319_02_fragment02.databinding.ActivityMainBinding;


public class MainActivity extends BaseActivity {

    MainViewPagerAdapter mvpa;
    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setEvents();
        setValues();

    }

    @Override
    public void setEvents() {

    }

    @Override
    public void setValues() {

        mvpa = new MainViewPagerAdapter(getSupportFragmentManager());
        binding.mainViewPager.setAdapter(mvpa);

    }
}
