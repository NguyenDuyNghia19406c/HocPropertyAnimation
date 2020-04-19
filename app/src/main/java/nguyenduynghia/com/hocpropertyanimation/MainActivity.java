package nguyenduynghia.com.hocpropertyanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addEvents();
    }

    private void addEvents() {
        final Button btnObjectAnimator=findViewById(R.id.btnObjectAnimator);
        btnObjectAnimator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator objectAnimator= (ObjectAnimator) AnimatorInflater.loadAnimator(MainActivity.this,R.animator.object_animator);
                objectAnimator.setTarget(btnObjectAnimator);
                objectAnimator.start();
            }
        });

        final Button btnObjectAnimationSet=findViewById(R.id.btnObjectAnimatorSet);
        btnObjectAnimationSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimatorSet animatorSet= (AnimatorSet) AnimatorInflater.loadAnimator(MainActivity.this,R.animator.object_animator_set);
                animatorSet.setTarget(btnObjectAnimationSet);
                animatorSet.start();
            }
        });
    }
}
