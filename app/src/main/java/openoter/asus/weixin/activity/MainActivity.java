package openoter.asus.weixin.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import openoter.asus.weixin.R;

public class MainActivity extends Activity{
    private RadioGroup wxRadioGroup;
    private RadioButton wxWXRb;
    private RadioButton wxCLRb;
    private RadioButton wxFindRb;
    private RadioButton wxProfileRb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        findView();

    }

    private void findView() {
       /* wxRadioGroup = (RadioGroup) findViewById(R.id.mTabMenu);
        wxWXRb = (RadioButton) findViewById(R.id.ib_weixin);
        wxCLRb = (RadioButton) findViewById(R.id.ib_contact_list);
        wxFindRb = (RadioButton) findViewById(R.id.ib_find);
        wxProfileRb = (RadioButton) findViewById(R.id.ib_profile);

        wxRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int index = 0;
                switch (checkedId){
                    case R.id.ib_weixin:
                        wxRadioGroup.check(R.id.ib_weixin);
                        break;
                    case R.id.ib_contact_list:
                        wxRadioGroup.check(R.id.ib_contact_list);
                        break;
                    case R.id.ib_find:
                        wxRadioGroup.check(R.id.ib_find);
                        break;
                    case R.id.ib_profile:
                        break;
                }
            }
        });*/
    }

    @Override
    protected void onStart() {
        super.onStart();
//        wxRadioGroup.check(R.id.ib_weixin);
    }
}
