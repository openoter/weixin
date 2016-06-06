package openoter.asus.weixin.activity;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import openoter.asus.weixin.R;
import openoter.asus.weixin.fragment.ContactListFragment;
import openoter.asus.weixin.fragment.FindFragment;
import openoter.asus.weixin.fragment.HomeFragment;
import openoter.asus.weixin.fragment.ProfileFragment;

public class MainActivity extends Activity {
    private RadioGroup wxRadioGroup;
    private RadioButton rb_weixin;
    private RadioButton rb_contact_list;
    private RadioButton rb_find;
    private RadioButton rb_profile;

    private Drawable draw_weixin;
    private Drawable draw_contact_list;
    private Drawable draw_find;
    private Drawable draw_profile;

    private Fragment homeFrag;
    private Fragment contactListFrag;
    private Fragment findFrag;
    private Fragment profileFrag;

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
//        findView();

        setTabScale();
        
        initEvent();
        setSelect(homeFrag);
    }

    private void initEvent() {
        wxRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_weixin:
                        setSelect(homeFrag);
                        break;
                    case R.id.rb_contact_list:
                        setSelect(contactListFrag);
                        break;
                    case R.id.rb_find:
                        setSelect(findFrag);
                        break;
                    case R.id.rb_profile:
                        setSelect(profileFrag);
                        break;



                }
            }
        });
    }

    private void setSelect(Fragment contactListFrag) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.wx_content, contactListFrag);
        transaction.commit();
    }

    private void setTabScale() {
        initTabNavPos(draw_weixin, rb_weixin);
        initTabNavPos(draw_contact_list, rb_contact_list);
        initTabNavPos(draw_find, rb_find);
        initTabNavPos(draw_profile, rb_profile);
    }

    private void initTabNavPos(Drawable draw, RadioButton radioButton) {
        draw.setBounds(0, 5, draw.getMinimumWidth() - 55, draw.getMinimumHeight() - 50);
        radioButton.setCompoundDrawables(null, draw, null, null);
        radioButton.setCompoundDrawablePadding(7);
    }

    private void initView() {
        draw_weixin = getResources().getDrawable(R.drawable.select_tab_weixin);
        draw_contact_list = getResources().getDrawable(R.drawable.select_tab_contact_list);
        draw_find = getResources().getDrawable(R.drawable.select_tab_find);
        draw_profile = getResources().getDrawable(R.drawable.select_tab_profile);

        rb_weixin = (RadioButton) findViewById(R.id.rb_weixin);
        rb_contact_list = (RadioButton) findViewById(R.id.rb_contact_list);
        rb_find = (RadioButton) findViewById(R.id.rb_find);
        rb_profile = (RadioButton) findViewById(R.id.rb_profile);

        wxRadioGroup = (RadioGroup) findViewById(R.id.mTabMenu);

        homeFrag = new HomeFragment();
        contactListFrag = new ContactListFragment();
        findFrag = new FindFragment();
        profileFrag = new ProfileFragment();
    }
}
