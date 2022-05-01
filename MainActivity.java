package com.my.newproject47;

import android.app.Activity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.DialogFragment;

public class MainActivity extends Activity {
	
	private Timer _timer = new Timer();
	
	private String value = "";
	private double count = 0;
	private String t1 = "";
	private String t2 = "";
	private String t3 = "";
	private String t4 = "";
	private String t5 = "";
	private String t6 = "";
	private String t7 = "";
	private String t8 = "";
	private String t9 = "";
	
	private LinearLayout linear1;
	private TextView textview11;
	private TextView textview10;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear2;
	private TextView textview1;
	private TextView textview2;
	private TextView textview3;
	private TextView textview4;
	private TextView textview5;
	private TextView textview6;
	private TextView textview7;
	private TextView textview8;
	private TextView textview9;
	
	private Intent in = new Intent();
	private AlertDialog.Builder dialog;
	private TimerTask time;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		textview11 = findViewById(R.id.textview11);
		textview10 = findViewById(R.id.textview10);
		linear7 = findViewById(R.id.linear7);
		linear8 = findViewById(R.id.linear8);
		linear2 = findViewById(R.id.linear2);
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		textview3 = findViewById(R.id.textview3);
		textview4 = findViewById(R.id.textview4);
		textview5 = findViewById(R.id.textview5);
		textview6 = findViewById(R.id.textview6);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		dialog = new AlertDialog.Builder(this);
		
		textview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_OnClick(textview1);
			}
		});
		
		textview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_OnClick(textview2);
			}
		});
		
		textview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_OnClick(textview3);
			}
		});
		
		textview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_OnClick(textview4);
			}
		});
		
		textview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_OnClick(textview5);
			}
		});
		
		textview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_OnClick(textview6);
			}
		});
		
		textview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_OnClick(textview7);
			}
		});
		
		textview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_OnClick(textview8);
			}
		});
		
		textview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_OnClick(textview9);
			}
		});
	}
	
	private void initializeLogic() {
		dialog= new AlertDialog.Builder(MainActivity.this, AlertDialog.THEME_DEVICE_DEFAULT_DARK);
		
		
		
		/*
 Created By Shubhamjit

on 1st May 2022

*/
		
		
		
		
		
		
		_glow(textview10);
		_setTransitionName(linear8, "p");
		_glow_bg(linear8);
		_glow_bg(linear7);
		_glow_bg(linear2);
	}
	
	public void _Check_Logic() {
		try {
			t1 = textview1.getText().toString();
			t2 = textview2.getText().toString();
			t3 = textview3.getText().toString();
			t4 = textview4.getText().toString();
			t5 = textview5.getText().toString();
			t6 = textview6.getText().toString();
			t7 = textview7.getText().toString();
			t8 = textview8.getText().toString();
			t9 = textview9.getText().toString();
			if (t1==t2 && t2==t3 || t4==t5 && t5==t6 || t7==t8 && t8==t9 || t1==t4 && t4==t7 || t2==t5 && t5==t8 || t3==t6 && t6==t9 || t1==t5 && t5==t9 || t7==t5 && t5==t3) {
				_dialog_message(value.concat(" Wins 🏆💪"));
			}
		} catch (Exception e) {
			showMessage(e.toString());
		}
	}
	
	
	public void _OnClick(final TextView _textview) {
		count++;
		if (value.equals("X")) {
			value = "O";
			_textview.setTextColor(0xFF66BB6A);
		}
		else {
			value = "X";
			_textview.setTextColor(0xFFF44336);
		}
		_textview.setText(value);
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						_Check_Logic();
						time.cancel();
					}
				});
			}
		};
		_timer.schedule(time, (int)(90));
		if (count == 9) {
			_dialog_message("Match Draw! Oops.. ");
		}
	}
	
	
	public void _Reset() {
		in.setClass(getApplicationContext(), MainActivity.class);
		_ActivityTransition(linear1, "p", in);
		finish();
	}
	
	
	public void _dialog_message(final String _title) {
		dialog.setTitle(_title);
		dialog.setCancelable(false);
		dialog.setPositiveButton("Play again! ", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				_Reset();
			}
		});
		dialog.setNegativeButton("Exit Game", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				finishAffinity();
			}
		});
		dialog.create().show();
	}
	
	
	public void _glow(final View _view) {
		ObjectAnimator a = ObjectAnimator.ofInt(_view, "textColor", Color.BLUE, Color.RED,
		Color.BLUE, Color.GREEN);
		a.setEvaluator(new ArgbEvaluator()); a.setInterpolator(new LinearInterpolator());
		a.setDuration(4000); a.setRepeatCount(ValueAnimator.INFINITE);
		
		a.setRepeatMode(ValueAnimator.REVERSE);
		
		AnimatorSet t = new AnimatorSet(); t.play(a); t.start();
	}
	
	
	public void _ActivityTransition(final View _view, final String _transitionName, final Intent _intent) {
		_view.setTransitionName(_transitionName); android.app.ActivityOptions optionsCompat = android.app.ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, _view, _transitionName); startActivity(_intent, optionsCompat.toBundle());
	}
	
	
	public void _setTransitionName(final View _view, final String _transitionName) {
		_view.setTransitionName(_transitionName);
	}
	
	
	public void _glow_bg(final View _view) {
		ObjectAnimator a = ObjectAnimator.ofInt(_view, "backgroundColor", Color.BLUE, Color.RED,
		Color.YELLOW, Color.GREEN);
		a.setEvaluator(new ArgbEvaluator()); a.setInterpolator(new LinearInterpolator());
		a.setDuration(4000); a.setRepeatCount(ValueAnimator.INFINITE);
		
		a.setRepeatMode(ValueAnimator.REVERSE);
		
		AnimatorSet t = new AnimatorSet(); t.play(a); t.start();


	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	


}