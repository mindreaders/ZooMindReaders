package com.zoomindreader.twentyquestions;

import com.zoomindreader.twentyquestions.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;



public class questions extends Activity {
	
	private SoundPool sp;
	private int music;
	private int musicwin;
	
	private Button yesbutton1;
	private Button yesbutton2;
	private Button yesbutton3;
	private Button yesbutton4;
	private Button yesbutton5;
	private Button yesbutton6;
	private Button yesbutton7;
	private Button yesbutton8;
	private Button yesbutton9;
	private Button yesbutton10;
	private Button yesbutton11;
	private Button yesbutton12;
	private Button yesbutton13;
	private Button yesbutton14;
	private Button yesbutton15;
	private Button yesbutton16;
	private Button yesbutton17;
	private Button yesbutton18;
	private Button yesbutton19;
	private Button yesbutton20;
	private Button yesbutton21;
	private Button yesbutton22;
	private Button yesbutton23;
	private Button yesbutton24;
	private Button yesbutton25;
	private Button yesbutton26;
	private Button yesbutton27;
	private Button yesbutton28;
	private Button yesbutton29;
	private Button yesbutton30;
	private Button yesbutton31;
	private Button yesbutton32;
	private Button yesbutton33;
	private Button yesbutton34;
	private Button yesbutton35;
	private Button yesbutton36;
	private Button yesbutton37;
	private Button yesbutton38;
	private Button yesbutton39;
	private Button yesbutton40;
	private Button yesbutton41;
	private Button yesbutton42;
	private Button yesbutton43;
	private Button yesbutton44;
	private Button yesbutton45;
	private Button yesbutton46;
	private Button yesbutton47;
	private Button yesbutton48;
	private Button yesbutton100;
	private Button yesbutton101;
	private Button yesbutton102;
	private Button yesbutton103;
	private Button yesbutton104;
	private Button yesbutton105;
	private Button yesbutton106;
	private Button yesbutton107;
	private Button yesbutton108;
	private Button yesbutton109;
	private Button yesbutton110;
	private Button yesbutton111;
	private Button yesbutton112;
	private Button yesbutton113;
	private Button yesbutton114;
	private Button yesbutton115;
	private Button yesbutton116;
	private Button yesbutton117;
	private Button yesbutton118;
	private Button yesbutton119;
	private Button yesbutton120;
	private Button yesbutton121;
	private Button yesbutton122;
	private Button yesbutton123;
	private Button yesbutton124;
	private Button yesbutton125;
	private Button yesbutton126;
	private Button yesbutton127;
	private Button yesbutton128;
	private Button yesbutton129;
	private Button yesbutton200;
	private Button yesbutton201;
	private Button yesbutton204;
	private Button yesbutton205;
	
	
	private Button nobutton1;
	private Button nobutton2;
	private Button nobutton3;
	private Button nobutton4;
	private Button nobutton5;
	private Button nobutton6;
	private Button nobutton7;
	private Button nobutton8;
	private Button nobutton9;
	private Button nobutton10;
	private Button nobutton11;
	private Button nobutton12;
	private Button nobutton13;
	private Button nobutton14;
	private Button nobutton15;
	private Button nobutton16;
	private Button nobutton17;
	private Button nobutton18;
	private Button nobutton19;
	private Button nobutton20;
	private Button nobutton21;
	private Button nobutton22;
	private Button nobutton23;
	private Button nobutton24;
	private Button nobutton25;
	private Button nobutton26;
	private Button nobutton27;
	private Button nobutton28;
	private Button nobutton29;
	private Button nobutton30;
	private Button nobutton31;
	private Button nobutton32;
	private Button nobutton33;
	private Button nobutton34;
	private Button nobutton35;
	private Button nobutton36;
	private Button nobutton37;
	private Button nobutton38;
	private Button nobutton39;
	private Button nobutton40;
	private Button nobutton41;
	private Button nobutton42;
	private Button nobutton43;
	private Button nobutton44;
	private Button nobutton45;
	private Button nobutton46;
	private Button nobutton47;
	private Button nobutton48;
	private Button nobutton100;
	private Button nobutton101;
	private Button nobutton102;
	private Button nobutton103;
	private Button nobutton104;
	private Button nobutton105;
	private Button nobutton106;
	private Button nobutton107;
	private Button nobutton108;
	private Button nobutton109;
	private Button nobutton110;
	private Button nobutton111;
	private Button nobutton112;
	private Button nobutton113;
	private Button nobutton114;
	private Button nobutton115;
	private Button nobutton116;
	private Button nobutton117;
	private Button nobutton118;
	private Button nobutton119;
	private Button nobutton120;
	private Button nobutton121;
	private Button nobutton122;
	private Button nobutton123;
	private Button nobutton124;
	private Button nobutton125;
	private Button nobutton126;
	private Button nobutton127;
	private Button nobutton128;
	private Button nobutton129;
	private Button nobutton200;
	private Button nobutton201;
	private Button nobutton204;
	private Button nobutton205;
	
	
	private ImageView q1;
	private ImageView q2;
	private ImageView q3;
	private ImageView q4;
	private ImageView q5;
	private ImageView q6;
	private ImageView q7;
	private ImageView q8;
	private ImageView q9;
	private ImageView q10;
	private ImageView q11;
	private ImageView q12;
	private ImageView q13;
	private ImageView q14;
	private ImageView q15;
	private ImageView q16;
	private ImageView q17;
	private ImageView q18;
	private ImageView q19;
	private ImageView q20;
	private ImageView q21;
	private ImageView q22;
	private ImageView q23;
	private ImageView q24;
	private ImageView q25;
	private ImageView q26;
	private ImageView q27;
	private ImageView q28;
	private ImageView q29;
	private ImageView q30;
	private ImageView q31;
	private ImageView q32;
	private ImageView q33;
	private ImageView q34;
	private ImageView q35;
	private ImageView q36;
	private ImageView q37;
	private ImageView q38;
	private ImageView q39;
	private ImageView q40;
	private ImageView q41;
	private ImageView q42;
	private ImageView q43;
	private ImageView q44;
	private ImageView q45;
	private ImageView q46;
	private ImageView q47;
	private ImageView q48;
	private ImageView q100;
	private ImageView q101;
	private ImageView q102;
	private ImageView q103;
	private ImageView q104;
	private ImageView q105;
	private ImageView q106;
	private ImageView q107;
	private ImageView q108;
	private ImageView q109;
	private ImageView q110;
	private ImageView q111;
	private ImageView q112;
	private ImageView q113;
	private ImageView q114;
	private ImageView q115;
	private ImageView q116;
	private ImageView q117;
	private ImageView q118;
	private ImageView q119;
	private ImageView q120;
	private ImageView q121;
	private ImageView q122;
	private ImageView q123;
	private ImageView q124;
	private ImageView q125;
	private ImageView q126;
	private ImageView q127;
	private ImageView q128;
	private ImageView q129;
	private ImageView q200;
	private ImageView q201;
	private ImageView q204;
	private ImageView q205;
	
	private ImageView bingo;
	private ImageView sorry;
	private ImageView face1;
	private ImageView face2;
	
	
	private ImageButton pause;
	private ImageButton retry;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		  super.onCreate(savedInstanceState);
		setContentView(R.layout.q1page);
		
		
		sp= new SoundPool(10,AudioManager.STREAM_SYSTEM,5);
		music = sp.load(this, R.raw.button,1);
		musicwin = sp.load(this,R.raw.win,1);
		
		yesbutton1=(Button)findViewById(R.id.yesbutton1);
		yesbutton2=(Button)findViewById(R.id.yesbutton2);
		yesbutton3=(Button)findViewById(R.id.yesbutton3);
		yesbutton4=(Button)findViewById(R.id.yesbutton4);
		yesbutton5=(Button)findViewById(R.id.yesbutton5);
		yesbutton6=(Button)findViewById(R.id.yesbutton6);
		yesbutton7=(Button)findViewById(R.id.yesbutton7);
		yesbutton8=(Button)findViewById(R.id.yesbutton8);
		yesbutton9=(Button)findViewById(R.id.yesbutton9);
		yesbutton10=(Button)findViewById(R.id.yesbutton10);
		yesbutton11=(Button)findViewById(R.id.yesbutton11);
		yesbutton12=(Button)findViewById(R.id.yesbutton12);
		yesbutton13=(Button)findViewById(R.id.yesbutton13);
		yesbutton14=(Button)findViewById(R.id.yesbutton14);
		yesbutton15=(Button)findViewById(R.id.yesbutton15);
		yesbutton16=(Button)findViewById(R.id.yesbutton16);
		yesbutton17=(Button)findViewById(R.id.yesbutton17);
		yesbutton18=(Button)findViewById(R.id.yesbutton18);
		yesbutton19=(Button)findViewById(R.id.yesbutton19);
		yesbutton20=(Button)findViewById(R.id.yesbutton20);
		yesbutton21=(Button)findViewById(R.id.yesbutton21);
		yesbutton22=(Button)findViewById(R.id.yesbutton22);
		yesbutton23=(Button)findViewById(R.id.yesbutton23);
		yesbutton24=(Button)findViewById(R.id.yesbutton24);
		yesbutton25=(Button)findViewById(R.id.yesbutton25);
		yesbutton26=(Button)findViewById(R.id.yesbutton26);
		yesbutton27=(Button)findViewById(R.id.yesbutton27);
		yesbutton28=(Button)findViewById(R.id.yesbutton28);
		yesbutton29=(Button)findViewById(R.id.yesbutton29);
		yesbutton30=(Button)findViewById(R.id.yesbutton30);
		yesbutton31=(Button)findViewById(R.id.yesbutton31);
		yesbutton32=(Button)findViewById(R.id.yesbutton32);
		yesbutton33=(Button)findViewById(R.id.yesbutton33);
		yesbutton34=(Button)findViewById(R.id.yesbutton34);
		yesbutton35=(Button)findViewById(R.id.yesbutton35);
		yesbutton36=(Button)findViewById(R.id.yesbutton36);
		yesbutton37=(Button)findViewById(R.id.yesbutton37);
		yesbutton38=(Button)findViewById(R.id.yesbutton38);
		yesbutton39=(Button)findViewById(R.id.yesbutton39);
		yesbutton40=(Button)findViewById(R.id.yesbutton40);
		yesbutton41=(Button)findViewById(R.id.yesbutton41);
		yesbutton42=(Button)findViewById(R.id.yesbutton42);
		yesbutton43=(Button)findViewById(R.id.yesbutton43);
		yesbutton44=(Button)findViewById(R.id.yesbutton44);
		yesbutton45=(Button)findViewById(R.id.yesbutton45);
		yesbutton46=(Button)findViewById(R.id.yesbutton46);
		yesbutton47=(Button)findViewById(R.id.yesbutton47);
		yesbutton48=(Button)findViewById(R.id.yesbutton48);
		yesbutton100=(Button)findViewById(R.id.yesbutton100);
		yesbutton101=(Button)findViewById(R.id.yesbutton101);
		yesbutton102=(Button)findViewById(R.id.yesbutton102);
		yesbutton103=(Button)findViewById(R.id.yesbutton103);
		yesbutton104=(Button)findViewById(R.id.yesbutton104);
		yesbutton105=(Button)findViewById(R.id.yesbutton105);
		yesbutton106=(Button)findViewById(R.id.yesbutton106);
		yesbutton107=(Button)findViewById(R.id.yesbutton107);
		yesbutton108=(Button)findViewById(R.id.yesbutton108);
		yesbutton109=(Button)findViewById(R.id.yesbutton109);
		yesbutton110=(Button)findViewById(R.id.yesbutton110);
		yesbutton111=(Button)findViewById(R.id.yesbutton111);
		yesbutton112=(Button)findViewById(R.id.yesbutton112);
		yesbutton113=(Button)findViewById(R.id.yesbutton113);
		yesbutton114=(Button)findViewById(R.id.yesbutton114);
		yesbutton115=(Button)findViewById(R.id.yesbutton115);
		yesbutton116=(Button)findViewById(R.id.yesbutton116);
		yesbutton117=(Button)findViewById(R.id.yesbutton117);
		yesbutton118=(Button)findViewById(R.id.yesbutton118);
		yesbutton119=(Button)findViewById(R.id.yesbutton119);
		yesbutton120=(Button)findViewById(R.id.yesbutton120);
		yesbutton121=(Button)findViewById(R.id.yesbutton121);
		yesbutton122=(Button)findViewById(R.id.yesbutton122);
		yesbutton123=(Button)findViewById(R.id.yesbutton123);
		yesbutton124=(Button)findViewById(R.id.yesbutton124);
		yesbutton125=(Button)findViewById(R.id.yesbutton125);
		yesbutton126=(Button)findViewById(R.id.yesbutton126);
		yesbutton127=(Button)findViewById(R.id.yesbutton127);
		yesbutton128=(Button)findViewById(R.id.yesbutton128);
		yesbutton129=(Button)findViewById(R.id.yesbutton129);
		yesbutton200=(Button)findViewById(R.id.yesbutton200);
		yesbutton201=(Button)findViewById(R.id.yesbutton201);
		yesbutton204=(Button)findViewById(R.id.yesbutton204);
		yesbutton205=(Button)findViewById(R.id.yesbutton205);
		
		
        nobutton1=(Button)findViewById(R.id.nobutton1);
        nobutton2=(Button)findViewById(R.id.nobutton2);
        nobutton3=(Button)findViewById(R.id.nobutton3);
        nobutton4=(Button)findViewById(R.id.nobutton4);
        nobutton5=(Button)findViewById(R.id.nobutton5);
        nobutton6=(Button)findViewById(R.id.nobutton6);
        nobutton7=(Button)findViewById(R.id.nobutton7);
        nobutton8=(Button)findViewById(R.id.nobutton8);
        nobutton9=(Button)findViewById(R.id.nobutton9);
        nobutton10=(Button)findViewById(R.id.nobutton10);
        nobutton11=(Button)findViewById(R.id.nobutton11);
        nobutton12=(Button)findViewById(R.id.nobutton12);
        nobutton13=(Button)findViewById(R.id.nobutton13);
        nobutton14=(Button)findViewById(R.id.nobutton14);
        nobutton15=(Button)findViewById(R.id.nobutton15);
        nobutton16=(Button)findViewById(R.id.nobutton16);
        nobutton17=(Button)findViewById(R.id.nobutton17);
        nobutton18=(Button)findViewById(R.id.nobutton18);
        nobutton19=(Button)findViewById(R.id.nobutton19);
        nobutton20=(Button)findViewById(R.id.nobutton20);
        nobutton21=(Button)findViewById(R.id.nobutton21);
        nobutton22=(Button)findViewById(R.id.nobutton22);
        nobutton23=(Button)findViewById(R.id.nobutton23);
        nobutton24=(Button)findViewById(R.id.nobutton24);
        nobutton25=(Button)findViewById(R.id.nobutton25);
        nobutton26=(Button)findViewById(R.id.nobutton26);
        nobutton27=(Button)findViewById(R.id.nobutton27);
        nobutton28=(Button)findViewById(R.id.nobutton28);
        nobutton29=(Button)findViewById(R.id.nobutton29);
        nobutton30=(Button)findViewById(R.id.nobutton30);
        nobutton31=(Button)findViewById(R.id.nobutton31);
        nobutton32=(Button)findViewById(R.id.nobutton32);
        nobutton33=(Button)findViewById(R.id.nobutton33);
        nobutton34=(Button)findViewById(R.id.nobutton34);
        nobutton35=(Button)findViewById(R.id.nobutton35);
        nobutton36=(Button)findViewById(R.id.nobutton36);
        nobutton37=(Button)findViewById(R.id.nobutton37);
        nobutton38=(Button)findViewById(R.id.nobutton38);
        nobutton39=(Button)findViewById(R.id.nobutton39);
        nobutton40=(Button)findViewById(R.id.nobutton40);
        nobutton41=(Button)findViewById(R.id.nobutton41);
        nobutton42=(Button)findViewById(R.id.nobutton42);
        nobutton43=(Button)findViewById(R.id.nobutton43);
        nobutton44=(Button)findViewById(R.id.nobutton44);
        nobutton45=(Button)findViewById(R.id.nobutton45);
        nobutton46=(Button)findViewById(R.id.nobutton46);
        nobutton47=(Button)findViewById(R.id.nobutton47);
        nobutton48=(Button)findViewById(R.id.nobutton48);
        nobutton100=(Button)findViewById(R.id.nobutton100);
        nobutton101=(Button)findViewById(R.id.nobutton101);
        nobutton102=(Button)findViewById(R.id.nobutton102);
        nobutton103=(Button)findViewById(R.id.nobutton103);
        nobutton104=(Button)findViewById(R.id.nobutton104);
        nobutton105=(Button)findViewById(R.id.nobutton105);
        nobutton106=(Button)findViewById(R.id.nobutton106);
        nobutton107=(Button)findViewById(R.id.nobutton107);
        nobutton108=(Button)findViewById(R.id.nobutton108);
        nobutton109=(Button)findViewById(R.id.nobutton109);
        nobutton110=(Button)findViewById(R.id.nobutton110);
        nobutton111=(Button)findViewById(R.id.nobutton111);
        nobutton112=(Button)findViewById(R.id.nobutton112);
        nobutton113=(Button)findViewById(R.id.nobutton113);
        nobutton114=(Button)findViewById(R.id.nobutton114);
        nobutton115=(Button)findViewById(R.id.nobutton115);
        nobutton116=(Button)findViewById(R.id.nobutton116);
        nobutton117=(Button)findViewById(R.id.nobutton117);
        nobutton118=(Button)findViewById(R.id.nobutton118);
        nobutton119=(Button)findViewById(R.id.nobutton119);
        nobutton120=(Button)findViewById(R.id.nobutton120);
        nobutton121=(Button)findViewById(R.id.nobutton121);
        nobutton122=(Button)findViewById(R.id.nobutton122);
        nobutton123=(Button)findViewById(R.id.nobutton123);
        nobutton124=(Button)findViewById(R.id.nobutton124);
        nobutton125=(Button)findViewById(R.id.nobutton125);
        nobutton126=(Button)findViewById(R.id.nobutton126);
        nobutton127=(Button)findViewById(R.id.nobutton127);
        nobutton128=(Button)findViewById(R.id.nobutton128);
        nobutton129=(Button)findViewById(R.id.nobutton129);
        nobutton200=(Button)findViewById(R.id.nobutton200);
        nobutton201=(Button)findViewById(R.id.nobutton201);
        nobutton204=(Button)findViewById(R.id.nobutton204);
        nobutton205=(Button)findViewById(R.id.nobutton205);
	
		q1=(ImageView)findViewById(R.id.q1);
		q2=(ImageView)findViewById(R.id.q2);
		q3=(ImageView)findViewById(R.id.q3);
		q4=(ImageView)findViewById(R.id.q4);
		q5=(ImageView)findViewById(R.id.q5);
		q6=(ImageView)findViewById(R.id.q6);
		q7=(ImageView)findViewById(R.id.q7);
		q8=(ImageView)findViewById(R.id.q8);
		q9=(ImageView)findViewById(R.id.q9);
		q10=(ImageView)findViewById(R.id.q10);
		q11=(ImageView)findViewById(R.id.q11);
		q12=(ImageView)findViewById(R.id.q12);
		q13=(ImageView)findViewById(R.id.q13);
		q14=(ImageView)findViewById(R.id.q14);
		q15=(ImageView)findViewById(R.id.q15);
		q16=(ImageView)findViewById(R.id.q16);
		q17=(ImageView)findViewById(R.id.q17);
		q18=(ImageView)findViewById(R.id.q18);
		q19=(ImageView)findViewById(R.id.q19);
		q20=(ImageView)findViewById(R.id.q20);
		q21=(ImageView)findViewById(R.id.q21);
		q22=(ImageView)findViewById(R.id.q22);
		q23=(ImageView)findViewById(R.id.q23);
		q24=(ImageView)findViewById(R.id.q24);
		q25=(ImageView)findViewById(R.id.q25);
		q26=(ImageView)findViewById(R.id.q26);
		q27=(ImageView)findViewById(R.id.q27);
		q28=(ImageView)findViewById(R.id.q28);
		q29=(ImageView)findViewById(R.id.q29);
		q30=(ImageView)findViewById(R.id.q30);
		q31=(ImageView)findViewById(R.id.q31);
		q32=(ImageView)findViewById(R.id.q32);
		q33=(ImageView)findViewById(R.id.q33);
		q34=(ImageView)findViewById(R.id.q34);
		q35=(ImageView)findViewById(R.id.q35);
		q36=(ImageView)findViewById(R.id.q36);
		q37=(ImageView)findViewById(R.id.q37);
		q38=(ImageView)findViewById(R.id.q38);
		q39=(ImageView)findViewById(R.id.q39);
		q40=(ImageView)findViewById(R.id.q40);
		q41=(ImageView)findViewById(R.id.q41);
		q42=(ImageView)findViewById(R.id.q42);
		q43=(ImageView)findViewById(R.id.q43);
		q44=(ImageView)findViewById(R.id.q44);
		q45=(ImageView)findViewById(R.id.q45);
		q46=(ImageView)findViewById(R.id.q46);
		q47=(ImageView)findViewById(R.id.q47);
		q48=(ImageView)findViewById(R.id.q48);
		q100=(ImageView)findViewById(R.id.q100);
		q101=(ImageView)findViewById(R.id.q101);
		q102=(ImageView)findViewById(R.id.q102);
		q103=(ImageView)findViewById(R.id.q103);
		q104=(ImageView)findViewById(R.id.q104);
		q105=(ImageView)findViewById(R.id.q105);
		q106=(ImageView)findViewById(R.id.q106);
		q107=(ImageView)findViewById(R.id.q107);
		q108=(ImageView)findViewById(R.id.q108);
		q109=(ImageView)findViewById(R.id.q109);
		q110=(ImageView)findViewById(R.id.q110);
		q111=(ImageView)findViewById(R.id.q111);
		q112=(ImageView)findViewById(R.id.q112);
		q113=(ImageView)findViewById(R.id.q113);
		q114=(ImageView)findViewById(R.id.q114);
		q115=(ImageView)findViewById(R.id.q115);
		q116=(ImageView)findViewById(R.id.q116);
		q117=(ImageView)findViewById(R.id.q117);
		q118=(ImageView)findViewById(R.id.q118);
		q119=(ImageView)findViewById(R.id.q119);
		q120=(ImageView)findViewById(R.id.q120);
		q121=(ImageView)findViewById(R.id.q121);
		q122=(ImageView)findViewById(R.id.q122);
		q123=(ImageView)findViewById(R.id.q123);
		q124=(ImageView)findViewById(R.id.q124);
		q125=(ImageView)findViewById(R.id.q125);
		q126=(ImageView)findViewById(R.id.q126);
		q127=(ImageView)findViewById(R.id.q127);
		q128=(ImageView)findViewById(R.id.q128);
		q129=(ImageView)findViewById(R.id.q129);
		q200=(ImageView)findViewById(R.id.q200);
		q201=(ImageView)findViewById(R.id.q201);
		q204=(ImageView)findViewById(R.id.q204);
		q205=(ImageView)findViewById(R.id.q205);
		
		sorry=(ImageView)findViewById(R.id.sorry);
		face1=(ImageView)findViewById(R.id.face1);
		face2=(ImageView)findViewById(R.id.face2);
		bingo=(ImageView)findViewById(R.id.bingo);
		
		q1.setVisibility(View.VISIBLE);
		q2.setVisibility(View.INVISIBLE);
		q3.setVisibility(View.INVISIBLE);
		q4.setVisibility(View.INVISIBLE);
		q5.setVisibility(View.INVISIBLE);
		q6.setVisibility(View.INVISIBLE);
		q7.setVisibility(View.INVISIBLE);
		q8.setVisibility(View.INVISIBLE);
		q9.setVisibility(View.INVISIBLE);
		q10.setVisibility(View.INVISIBLE);
		q11.setVisibility(View.INVISIBLE);
		q12.setVisibility(View.INVISIBLE);
		q13.setVisibility(View.INVISIBLE);
		q14.setVisibility(View.INVISIBLE);
		q15.setVisibility(View.INVISIBLE);
		q16.setVisibility(View.INVISIBLE);
		q17.setVisibility(View.INVISIBLE);
		q18.setVisibility(View.INVISIBLE);
		q19.setVisibility(View.INVISIBLE);
		q20.setVisibility(View.INVISIBLE);
		q21.setVisibility(View.INVISIBLE);
		q22.setVisibility(View.INVISIBLE);
		q23.setVisibility(View.INVISIBLE);
		q24.setVisibility(View.INVISIBLE);
		q25.setVisibility(View.INVISIBLE);
		q26.setVisibility(View.INVISIBLE);
		q27.setVisibility(View.INVISIBLE);
		q28.setVisibility(View.INVISIBLE);
		q29.setVisibility(View.INVISIBLE);
		q30.setVisibility(View.INVISIBLE);
		q31.setVisibility(View.INVISIBLE);
		q32.setVisibility(View.INVISIBLE);
		q33.setVisibility(View.INVISIBLE);
		q34.setVisibility(View.INVISIBLE);
		q35.setVisibility(View.INVISIBLE);
		q36.setVisibility(View.INVISIBLE);
		q37.setVisibility(View.INVISIBLE);
		q38.setVisibility(View.INVISIBLE);
		q39.setVisibility(View.INVISIBLE);
		q40.setVisibility(View.INVISIBLE);
		q41.setVisibility(View.INVISIBLE);
		q42.setVisibility(View.INVISIBLE);
		q43.setVisibility(View.INVISIBLE);
		q44.setVisibility(View.INVISIBLE);
		q45.setVisibility(View.INVISIBLE);
		q46.setVisibility(View.INVISIBLE);
		q47.setVisibility(View.INVISIBLE);
		q48.setVisibility(View.INVISIBLE);
		q100.setVisibility(View.INVISIBLE);
		q101.setVisibility(View.INVISIBLE);
		q102.setVisibility(View.INVISIBLE);
		q103.setVisibility(View.INVISIBLE);
		q104.setVisibility(View.INVISIBLE);
		q105.setVisibility(View.INVISIBLE);
		q106.setVisibility(View.INVISIBLE);
		q107.setVisibility(View.INVISIBLE);
		q108.setVisibility(View.INVISIBLE);
		q109.setVisibility(View.INVISIBLE);
		q110.setVisibility(View.INVISIBLE);
		q111.setVisibility(View.INVISIBLE);
		q112.setVisibility(View.INVISIBLE);
		q113.setVisibility(View.INVISIBLE);
		q114.setVisibility(View.INVISIBLE);
		q115.setVisibility(View.INVISIBLE);
		q116.setVisibility(View.INVISIBLE);
		q117.setVisibility(View.INVISIBLE);
		q118.setVisibility(View.INVISIBLE);
		q119.setVisibility(View.INVISIBLE);
		q120.setVisibility(View.INVISIBLE);
		q121.setVisibility(View.INVISIBLE);
		q122.setVisibility(View.INVISIBLE);
		q123.setVisibility(View.INVISIBLE);
		q124.setVisibility(View.INVISIBLE);
		q125.setVisibility(View.INVISIBLE);
		q126.setVisibility(View.INVISIBLE);
		q127.setVisibility(View.INVISIBLE);
		q128.setVisibility(View.INVISIBLE);
		q129.setVisibility(View.INVISIBLE);
		q200.setVisibility(View.INVISIBLE);
		q201.setVisibility(View.INVISIBLE);
		q204.setVisibility(View.INVISIBLE);
		q205.setVisibility(View.INVISIBLE);

		sorry.setVisibility(View.INVISIBLE);
		face1.setVisibility(View.VISIBLE);
		face2.setVisibility(View.INVISIBLE);
		bingo.setVisibility(View.INVISIBLE);
		
		yesbutton1.setVisibility(View.VISIBLE);
		yesbutton2.setVisibility(View.INVISIBLE);
		yesbutton3.setVisibility(View.INVISIBLE);
		yesbutton4.setVisibility(View.INVISIBLE);
		yesbutton5.setVisibility(View.INVISIBLE);
		yesbutton6.setVisibility(View.INVISIBLE);
		yesbutton7.setVisibility(View.INVISIBLE);
		yesbutton8.setVisibility(View.INVISIBLE);
		yesbutton9.setVisibility(View.INVISIBLE);
		yesbutton10.setVisibility(View.INVISIBLE);
		yesbutton11.setVisibility(View.INVISIBLE);
		yesbutton12.setVisibility(View.INVISIBLE);
		yesbutton13.setVisibility(View.INVISIBLE);
		yesbutton14.setVisibility(View.INVISIBLE);
		yesbutton15.setVisibility(View.INVISIBLE);
		yesbutton16.setVisibility(View.INVISIBLE);
		yesbutton17.setVisibility(View.INVISIBLE);
		yesbutton18.setVisibility(View.INVISIBLE);
		yesbutton19.setVisibility(View.INVISIBLE);
		yesbutton20.setVisibility(View.INVISIBLE);
		yesbutton21.setVisibility(View.INVISIBLE);
		yesbutton22.setVisibility(View.INVISIBLE);
		yesbutton23.setVisibility(View.INVISIBLE);
		yesbutton24.setVisibility(View.INVISIBLE);
		yesbutton25.setVisibility(View.INVISIBLE);
		yesbutton26.setVisibility(View.INVISIBLE);
		yesbutton27.setVisibility(View.INVISIBLE);
		yesbutton28.setVisibility(View.INVISIBLE);
		yesbutton29.setVisibility(View.INVISIBLE);
		yesbutton30.setVisibility(View.INVISIBLE);
		yesbutton31.setVisibility(View.INVISIBLE);
		yesbutton32.setVisibility(View.INVISIBLE);
		yesbutton33.setVisibility(View.INVISIBLE);
		yesbutton34.setVisibility(View.INVISIBLE);
		yesbutton35.setVisibility(View.INVISIBLE);
		yesbutton36.setVisibility(View.INVISIBLE);
		yesbutton37.setVisibility(View.INVISIBLE);
		yesbutton38.setVisibility(View.INVISIBLE);
		yesbutton39.setVisibility(View.INVISIBLE);
		yesbutton40.setVisibility(View.INVISIBLE);
		yesbutton41.setVisibility(View.INVISIBLE);
		yesbutton42.setVisibility(View.INVISIBLE);
		yesbutton43.setVisibility(View.INVISIBLE);
		yesbutton44.setVisibility(View.INVISIBLE);
		yesbutton45.setVisibility(View.INVISIBLE);
		yesbutton46.setVisibility(View.INVISIBLE);
		yesbutton47.setVisibility(View.INVISIBLE);
		yesbutton48.setVisibility(View.INVISIBLE);
		yesbutton100.setVisibility(View.INVISIBLE);
		yesbutton101.setVisibility(View.INVISIBLE);
		yesbutton102.setVisibility(View.INVISIBLE);
		yesbutton103.setVisibility(View.INVISIBLE);
		yesbutton104.setVisibility(View.INVISIBLE);
		yesbutton105.setVisibility(View.INVISIBLE);
		yesbutton106.setVisibility(View.INVISIBLE);
		yesbutton107.setVisibility(View.INVISIBLE);
		yesbutton108.setVisibility(View.INVISIBLE);
		yesbutton109.setVisibility(View.INVISIBLE);
		yesbutton110.setVisibility(View.INVISIBLE);
		yesbutton111.setVisibility(View.INVISIBLE);
		yesbutton112.setVisibility(View.INVISIBLE);
		yesbutton113.setVisibility(View.INVISIBLE);
		yesbutton114.setVisibility(View.INVISIBLE);
		yesbutton115.setVisibility(View.INVISIBLE);
		yesbutton116.setVisibility(View.INVISIBLE);
		yesbutton117.setVisibility(View.INVISIBLE);
		yesbutton118.setVisibility(View.INVISIBLE);
		yesbutton119.setVisibility(View.INVISIBLE);
		yesbutton120.setVisibility(View.INVISIBLE);
		yesbutton121.setVisibility(View.INVISIBLE);
		yesbutton122.setVisibility(View.INVISIBLE);
		yesbutton123.setVisibility(View.INVISIBLE);
		yesbutton124.setVisibility(View.INVISIBLE);
		yesbutton125.setVisibility(View.INVISIBLE);
		yesbutton126.setVisibility(View.INVISIBLE);
		yesbutton127.setVisibility(View.INVISIBLE);
		yesbutton128.setVisibility(View.INVISIBLE);
		yesbutton129.setVisibility(View.INVISIBLE);
		yesbutton200.setVisibility(View.INVISIBLE);
		yesbutton201.setVisibility(View.INVISIBLE);
		yesbutton204.setVisibility(View.INVISIBLE);
		yesbutton205.setVisibility(View.INVISIBLE);
		
		nobutton1.setVisibility(View.VISIBLE);
		nobutton2.setVisibility(View.INVISIBLE);
		nobutton3.setVisibility(View.INVISIBLE);
		nobutton4.setVisibility(View.INVISIBLE);
		nobutton5.setVisibility(View.INVISIBLE);
		nobutton6.setVisibility(View.INVISIBLE);
		nobutton7.setVisibility(View.INVISIBLE);
		nobutton8.setVisibility(View.INVISIBLE);
		nobutton9.setVisibility(View.INVISIBLE);
		nobutton10.setVisibility(View.INVISIBLE);
		nobutton11.setVisibility(View.INVISIBLE);
		nobutton12.setVisibility(View.INVISIBLE);
		nobutton13.setVisibility(View.INVISIBLE);
		nobutton14.setVisibility(View.INVISIBLE);
		nobutton15.setVisibility(View.INVISIBLE);
		nobutton16.setVisibility(View.INVISIBLE);
		nobutton17.setVisibility(View.INVISIBLE);
		nobutton18.setVisibility(View.INVISIBLE);
		nobutton19.setVisibility(View.INVISIBLE);
		nobutton20.setVisibility(View.INVISIBLE);
		nobutton21.setVisibility(View.INVISIBLE);
		nobutton22.setVisibility(View.INVISIBLE);
		nobutton23.setVisibility(View.INVISIBLE);
		nobutton24.setVisibility(View.INVISIBLE);
		nobutton25.setVisibility(View.INVISIBLE);
		nobutton26.setVisibility(View.INVISIBLE);
		nobutton27.setVisibility(View.INVISIBLE);
		nobutton28.setVisibility(View.INVISIBLE);
		nobutton29.setVisibility(View.INVISIBLE);
		nobutton30.setVisibility(View.INVISIBLE);
		nobutton31.setVisibility(View.INVISIBLE);
		nobutton32.setVisibility(View.INVISIBLE);
		nobutton33.setVisibility(View.INVISIBLE);
		nobutton34.setVisibility(View.INVISIBLE);
		nobutton35.setVisibility(View.INVISIBLE);
		nobutton36.setVisibility(View.INVISIBLE);
		nobutton37.setVisibility(View.INVISIBLE);
		nobutton38.setVisibility(View.INVISIBLE);
		nobutton39.setVisibility(View.INVISIBLE);
		nobutton40.setVisibility(View.INVISIBLE);
		nobutton41.setVisibility(View.INVISIBLE);
		nobutton42.setVisibility(View.INVISIBLE);
		nobutton43.setVisibility(View.INVISIBLE);
		nobutton44.setVisibility(View.INVISIBLE);
		nobutton45.setVisibility(View.INVISIBLE);
		nobutton46.setVisibility(View.INVISIBLE);
		nobutton47.setVisibility(View.INVISIBLE);
		nobutton48.setVisibility(View.INVISIBLE);
		nobutton100.setVisibility(View.INVISIBLE);
		nobutton101.setVisibility(View.INVISIBLE);
		nobutton102.setVisibility(View.INVISIBLE);
		nobutton103.setVisibility(View.INVISIBLE);
		nobutton104.setVisibility(View.INVISIBLE);
		nobutton105.setVisibility(View.INVISIBLE);
		nobutton106.setVisibility(View.INVISIBLE);
		nobutton107.setVisibility(View.INVISIBLE);
		nobutton108.setVisibility(View.INVISIBLE);
		nobutton109.setVisibility(View.INVISIBLE);
		nobutton110.setVisibility(View.INVISIBLE);
		nobutton111.setVisibility(View.INVISIBLE);
		nobutton112.setVisibility(View.INVISIBLE);
		nobutton113.setVisibility(View.INVISIBLE);
		nobutton114.setVisibility(View.INVISIBLE);
		nobutton115.setVisibility(View.INVISIBLE);
		nobutton116.setVisibility(View.INVISIBLE);
		nobutton117.setVisibility(View.INVISIBLE);
		nobutton118.setVisibility(View.INVISIBLE);
		nobutton119.setVisibility(View.INVISIBLE);
		nobutton120.setVisibility(View.INVISIBLE);
		nobutton121.setVisibility(View.INVISIBLE);
		nobutton122.setVisibility(View.INVISIBLE);
		nobutton123.setVisibility(View.INVISIBLE);
		nobutton124.setVisibility(View.INVISIBLE);
		nobutton125.setVisibility(View.INVISIBLE);
		nobutton126.setVisibility(View.INVISIBLE);
		nobutton127.setVisibility(View.INVISIBLE);
		nobutton128.setVisibility(View.INVISIBLE);
		nobutton129.setVisibility(View.INVISIBLE);
		nobutton200.setVisibility(View.INVISIBLE);
		nobutton201.setVisibility(View.INVISIBLE);
		nobutton204.setVisibility(View.INVISIBLE);
		nobutton205.setVisibility(View.INVISIBLE);
		//d=Drawable.createFromPath(R.drawable.q2);
		
		pause= (ImageButton)findViewById(R.id.pause); 
		retry=(ImageButton)findViewById(R.id.retry); 
		pause.setVisibility(View.VISIBLE);
		retry.setVisibility(View.INVISIBLE);
		
		
		yesbutton1.setOnClickListener(new Button.OnClickListener(){	
		public void onClick(View v1) {
			// TODO Auto-generated method stub
			
			yesbutton1.setVisibility(View.INVISIBLE);
			yesbutton2.setVisibility(View.VISIBLE);
			nobutton1.setVisibility(View.INVISIBLE);
			nobutton2.setVisibility(View.VISIBLE);
			q1.setVisibility(View.INVISIBLE);
			q2.setVisibility(View.VISIBLE);
			 sp.play(music, 1, 1, 0, 0, 1);
		
		}
	});
		
		nobutton1.setOnClickListener(new Button.OnClickListener(){	
			public void onClick(View v1) {
				// TODO Auto-generated method stub
				yesbutton1.setVisibility(View.INVISIBLE);
				yesbutton100.setVisibility(View.VISIBLE);
				nobutton1.setVisibility(View.INVISIBLE);
				nobutton100.setVisibility(View.VISIBLE);
				q1.setVisibility(View.INVISIBLE);
				q100.setVisibility(View.VISIBLE);
				 sp.play(music, 1, 1, 0, 0, 1);
			}

			});
		
		
		yesbutton2.setOnClickListener(new Button.OnClickListener(){	
			public void onClick(View v1) {
				// TODO Auto-generated method stub
				
				yesbutton2.setVisibility(View.INVISIBLE);
				yesbutton3.setVisibility(View.VISIBLE);
				nobutton2.setVisibility(View.INVISIBLE);
				nobutton3.setVisibility(View.VISIBLE);
				q2.setVisibility(View.INVISIBLE);
				q3.setVisibility(View.VISIBLE);
				 sp.play(music, 1, 1, 0, 0, 1);
			
			}
		});
			
			nobutton2.setOnClickListener(new Button.OnClickListener(){	
				public void onClick(View v1) {
					// TODO Auto-generated method stub
					yesbutton2.setVisibility(View.INVISIBLE);
					yesbutton13.setVisibility(View.VISIBLE);
					nobutton2.setVisibility(View.INVISIBLE);
					nobutton13.setVisibility(View.VISIBLE);
					q2.setVisibility(View.INVISIBLE);
					q13.setVisibility(View.VISIBLE);
					 sp.play(music, 1, 1, 0, 0, 1);
				}

				});
			
			yesbutton3.setOnClickListener(new Button.OnClickListener(){	
				public void onClick(View v1) {
					// TODO Auto-generated method stub
					
					yesbutton3.setVisibility(View.INVISIBLE);
					yesbutton9.setVisibility(View.VISIBLE);
					nobutton3.setVisibility(View.INVISIBLE);
					nobutton9.setVisibility(View.VISIBLE);
					q3.setVisibility(View.INVISIBLE);
					q9.setVisibility(View.VISIBLE);
					 sp.play(music, 1, 1, 0, 0, 1);
				
				}
			});
				
				nobutton3.setOnClickListener(new Button.OnClickListener(){	
					public void onClick(View v1) {
						// TODO Auto-generated method stub
						yesbutton3.setVisibility(View.INVISIBLE);
						yesbutton4.setVisibility(View.VISIBLE);
						nobutton3.setVisibility(View.INVISIBLE);
						nobutton4.setVisibility(View.VISIBLE);
						q3.setVisibility(View.INVISIBLE);
						q4.setVisibility(View.VISIBLE);
						 sp.play(music, 1, 1, 0, 0, 1);
					}

					});
				
				yesbutton4.setOnClickListener(new Button.OnClickListener(){	
					public void onClick(View v1) {
						// TODO Auto-generated method stub
						
						yesbutton4.setVisibility(View.INVISIBLE);
						yesbutton5.setVisibility(View.VISIBLE);
						nobutton4.setVisibility(View.INVISIBLE);
						nobutton5.setVisibility(View.VISIBLE);
						q4.setVisibility(View.INVISIBLE);
						q5.setVisibility(View.VISIBLE);
						 sp.play(music, 1, 1, 0, 0, 1);
						 face1.setVisibility(View.INVISIBLE);
							face2.setVisibility(View.VISIBLE);
					
					}
				});
					
					nobutton4.setOnClickListener(new Button.OnClickListener(){	
						public void onClick(View v1) {
							// TODO Auto-generated method stub
							yesbutton4.setVisibility(View.INVISIBLE);
							yesbutton6.setVisibility(View.VISIBLE);
							nobutton4.setVisibility(View.INVISIBLE);
							nobutton6.setVisibility(View.VISIBLE);
							q4.setVisibility(View.INVISIBLE);
							q6.setVisibility(View.VISIBLE);
							 sp.play(music, 1, 1, 0, 0, 1);
							 face1.setVisibility(View.INVISIBLE);
								face2.setVisibility(View.VISIBLE);
						}

						});
					
					yesbutton5.setOnClickListener(new Button.OnClickListener(){	
						public void onClick(View v1) {
							// TODO Auto-generated method stub
							yesbutton5.setVisibility(View.INVISIBLE);
							nobutton5.setVisibility(View.INVISIBLE);
							q5.setVisibility(View.INVISIBLE);
							retry.setVisibility(View.VISIBLE);
							pause.setVisibility(View.INVISIBLE);
							 sp.play(musicwin, 1, 1, 0, 0, 1);
					LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                    View view=inflater.inflate(R.layout.mouse, null);
                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
                    builder2.setView(view);
                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
                        @Override
                                public void onClick(DialogInterface dialog, int which) {
                        		// TODO Auto-generated method stub
                        		 sorry.setVisibility(View.VISIBLE);
                        		 face2.setVisibility(View.INVISIBLE);
                        		 sp.play(music, 1, 1, 0, 0, 1);
 		                    	 dialog.cancel();}

                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
      
               @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // TODO Auto-generated method stub
            	   bingo.setVisibility(View.VISIBLE);
          		 face2.setVisibility(View.INVISIBLE);
          		 sp.play(music, 1, 1, 0, 0, 1);
                            dialog.cancel();
                        }
                    }).create().show();
                   												
						}
					});
						
						nobutton5.setOnClickListener(new Button.OnClickListener(){	
							public void onClick(View v1) {
								// TODO Auto-generated method stub
								yesbutton5.setVisibility(View.INVISIBLE);
								
								nobutton5.setVisibility(View.INVISIBLE);
								retry.setVisibility(View.VISIBLE);
								pause.setVisibility(View.INVISIBLE);
								q5.setVisibility(View.INVISIBLE);
								 sp.play(musicwin, 1, 1, 0, 0, 1);
								LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
			                    View view=inflater.inflate(R.layout.rat, null);
			                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
			                    builder2.setView(view);
			                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
			                        
			                        @Override
			                                public void onClick(DialogInterface dialog, int which) {

			 		                        // TODO Auto-generated method stub
			                        		 sorry.setVisibility(View.VISIBLE);
			                        		 face2.setVisibility(View.INVISIBLE);
			                        		 sp.play(music, 1, 1, 0, 0, 1);
			 		                    	 dialog.cancel();}

			                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
			      
			               @Override
			                        public void onClick(DialogInterface dialog, int which) {
			                            // TODO Auto-generated method stub
			            	   bingo.setVisibility(View.VISIBLE);
			            		 face2.setVisibility(View.INVISIBLE);
			            		 sp.play(music, 1, 1, 0, 0, 1);
			                            dialog.cancel();
			                        }
			                    }).create().show();
								
							}

							});
						
						yesbutton6.setOnClickListener(new Button.OnClickListener(){	
							public void onClick(View v1) {
								// TODO Auto-generated method stub
								
								yesbutton6.setVisibility(View.INVISIBLE);
								
								nobutton6.setVisibility(View.INVISIBLE);
								
								q6.setVisibility(View.INVISIBLE);
								 sp.play(musicwin, 1, 1, 0, 0, 1);
								LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
			                    View view=inflater.inflate(R.layout.dog, null);
			                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
			                    builder2.setView(view);
			                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
			                        
			                        @Override
			                                public void onClick(DialogInterface dialog, int which) {

			 		                        // TODO Auto-generated method stub
			                        		 sorry.setVisibility(View.VISIBLE);
			                        		 face2.setVisibility(View.INVISIBLE);
			                        		 sp.play(music, 1, 1, 0, 0, 1);
			                        		 retry.setVisibility(View.VISIBLE);
			 								pause.setVisibility(View.INVISIBLE);
			 		                    	 dialog.cancel();}

			                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
			      
			               @Override
			                        public void onClick(DialogInterface dialog, int which) {
			                            // TODO Auto-generated method stub
			            	   bingo.setVisibility(View.VISIBLE);
			            		 face2.setVisibility(View.INVISIBLE);
			            		 sp.play(music, 1, 1, 0, 0, 1);
			            		 retry.setVisibility(View.VISIBLE);
									pause.setVisibility(View.INVISIBLE);
			                            dialog.cancel();
			                        }
			                    }).create().show();
							
							}
						});
							
							nobutton6.setOnClickListener(new Button.OnClickListener(){	
								public void onClick(View v1) {
									// TODO Auto-generated method stub
									yesbutton6.setVisibility(View.INVISIBLE);
									yesbutton7.setVisibility(View.VISIBLE);
									nobutton6.setVisibility(View.INVISIBLE);
									nobutton7.setVisibility(View.VISIBLE);
									q6.setVisibility(View.INVISIBLE);
									q7.setVisibility(View.VISIBLE);
									 sp.play(music, 1, 1, 0, 0, 1);
								}

								});
							
							
							yesbutton7.setOnClickListener(new Button.OnClickListener(){	
								public void onClick(View v1) {
									// TODO Auto-generated method stub
									
									
									
									yesbutton7.setVisibility(View.INVISIBLE);
									yesbutton8.setVisibility(View.VISIBLE);
									nobutton7.setVisibility(View.INVISIBLE);
									nobutton8.setVisibility(View.VISIBLE);
									q7.setVisibility(View.INVISIBLE);
									q8.setVisibility(View.VISIBLE);
									 sp.play(music, 1, 1, 0, 0, 1);
								
								}
							});
								
								nobutton7.setOnClickListener(new Button.OnClickListener(){	
									public void onClick(View v1) {
										// TODO Auto-generated method stub
										yesbutton7.setVisibility(View.INVISIBLE);
										
										nobutton7.setVisibility(View.INVISIBLE);
									
										q7.setVisibility(View.INVISIBLE);
										 sp.play(musicwin, 1, 1, 0, 0, 1);
										LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
					                    View view=inflater.inflate(R.layout.polarbear, null);
					                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
					                    builder2.setView(view);
					                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
					                        
					                        @Override
					                                public void onClick(DialogInterface dialog, int which) {

					 		                        // TODO Auto-generated method stub
					                        		 sorry.setVisibility(View.VISIBLE);
					                        		 face2.setVisibility(View.INVISIBLE);
					                        		 sp.play(music, 1, 1, 0, 0, 1);
					                        			retry.setVisibility(View.VISIBLE);
														pause.setVisibility(View.INVISIBLE);
					 		                    	 dialog.cancel();}

					                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
					      
					               @Override
					                        public void onClick(DialogInterface dialog, int which) {
					                            // TODO Auto-generated method stub
					            	   bingo.setVisibility(View.VISIBLE);
					            		 face2.setVisibility(View.INVISIBLE);
					            		 sp.play(music, 1, 1, 0, 0, 1);
					            			retry.setVisibility(View.VISIBLE);
											pause.setVisibility(View.INVISIBLE);
					                            dialog.cancel();
					                        }
					                    }).create().show();
									}

									});
								
								yesbutton8.setOnClickListener(new Button.OnClickListener(){	
									public void onClick(View v1) {
										// TODO Auto-generated method stub
										
										yesbutton8.setVisibility(View.INVISIBLE);
										retry.setVisibility(View.VISIBLE);
										pause.setVisibility(View.INVISIBLE);
										nobutton8.setVisibility(View.INVISIBLE);
										
										q8.setVisibility(View.INVISIBLE);
										 sp.play(musicwin, 1, 1, 0, 0, 1);
										LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
					                    View view=inflater.inflate(R.layout.fox, null);
					                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
					                    builder2.setView(view);
					                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
					                        
					                        @Override
					                                public void onClick(DialogInterface dialog, int which) {

					 		                        // TODO Auto-generated method stub
					                        		 sorry.setVisibility(View.VISIBLE);
					                        		 face2.setVisibility(View.INVISIBLE);
					                        		 sp.play(music, 1, 1, 0, 0, 1);
					 		                    	 dialog.cancel();}

					                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
					      
					               @Override
					                        public void onClick(DialogInterface dialog, int which) {
					                            // TODO Auto-generated method stub
					            	   bingo.setVisibility(View.VISIBLE);
					            		 face2.setVisibility(View.INVISIBLE);
					            		 sp.play(music, 1, 1, 0, 0, 1);
					                            dialog.cancel();
					                        }
					                    }).create().show();
									
									}
								});
									
									nobutton8.setOnClickListener(new Button.OnClickListener(){	
										public void onClick(View v1) {
											// TODO Auto-generated method stub
											yesbutton8.setVisibility(View.INVISIBLE);
											retry.setVisibility(View.VISIBLE);
											pause.setVisibility(View.INVISIBLE);
											nobutton8.setVisibility(View.INVISIBLE);
											
											q8.setVisibility(View.INVISIBLE);
											 sp.play(musicwin, 1, 1, 0, 0, 1);
											LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
						                    View view=inflater.inflate(R.layout.wolf, null);
						                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
						                    builder2.setView(view);
						                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
						                        
						                        @Override
						                                public void onClick(DialogInterface dialog, int which) {

						 		                        // TODO Auto-generated method stub
						                        		 sorry.setVisibility(View.VISIBLE);
						                        		 face2.setVisibility(View.INVISIBLE);
						                        		 sp.play(music, 1, 1, 0, 0, 1);
						 		                    	 dialog.cancel();}

						                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
						      
						               @Override
						                        public void onClick(DialogInterface dialog, int which) {
						                            // TODO Auto-generated method stub
						            	   bingo.setVisibility(View.VISIBLE);
						            		 face2.setVisibility(View.INVISIBLE);
						            		 sp.play(music, 1, 1, 0, 0, 1);
						                            dialog.cancel();
						                        }
						                    }).create().show();
										}

										});
									
							 yesbutton9.setOnClickListener(new Button.OnClickListener(){	
										public void onClick(View v1) {
											// TODO Auto-generated method stub
											
											yesbutton9.setVisibility(View.INVISIBLE);
											yesbutton10.setVisibility(View.VISIBLE);
											nobutton9.setVisibility(View.INVISIBLE);
											nobutton10.setVisibility(View.VISIBLE);
											q9.setVisibility(View.INVISIBLE);
											q10.setVisibility(View.VISIBLE);
											 sp.play(music, 1, 1, 0, 0, 1);
											 face1.setVisibility(View.INVISIBLE);
												face2.setVisibility(View.VISIBLE);
										
										}
									});
										
								nobutton9.setOnClickListener(new Button.OnClickListener(){	
											public void onClick(View v1) {
												// TODO Auto-generated method stub
												yesbutton9.setVisibility(View.INVISIBLE);
												yesbutton11.setVisibility(View.VISIBLE);
												nobutton9.setVisibility(View.INVISIBLE);
												nobutton11.setVisibility(View.VISIBLE);
												q9.setVisibility(View.INVISIBLE);
												q11.setVisibility(View.VISIBLE);
												 sp.play(music, 1, 1, 0, 0, 1);
												 face1.setVisibility(View.INVISIBLE);
													face2.setVisibility(View.VISIBLE);
											}

											});
										
								yesbutton10.setOnClickListener(new Button.OnClickListener(){	
											public void onClick(View v1) {
												// TODO Auto-generated method stub
												
												yesbutton10.setVisibility(View.INVISIBLE);
												retry.setVisibility(View.VISIBLE);
												pause.setVisibility(View.INVISIBLE);
												nobutton10.setVisibility(View.INVISIBLE);
												
												q10.setVisibility(View.INVISIBLE);
												 sp.play(musicwin, 1, 1, 0, 0, 1);
												LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
							                    View view=inflater.inflate(R.layout.panther, null);
							                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
							                    builder2.setView(view);
							                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
							                        
							                        @Override
							                                public void onClick(DialogInterface dialog, int which) {

							 		                        // TODO Auto-generated method stub
							                        		 sorry.setVisibility(View.VISIBLE);
							                        		 face2.setVisibility(View.INVISIBLE);
							                        		 sp.play(music, 1, 1, 0, 0, 1);
							 		                    	 dialog.cancel();}

							                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
							      
							               @Override
							                        public void onClick(DialogInterface dialog, int which) {
							                            // TODO Auto-generated method stub
							            	   bingo.setVisibility(View.VISIBLE);
							            		 face2.setVisibility(View.INVISIBLE);
							            		 sp.play(music, 1, 1, 0, 0, 1);
							                            dialog.cancel();
							                        }
							                    }).create().show();
											
											}
										});
											
									nobutton10.setOnClickListener(new Button.OnClickListener(){	
												public void onClick(View v1) {
													// TODO Auto-generated method stub
													yesbutton10.setVisibility(View.INVISIBLE);
													retry.setVisibility(View.VISIBLE);
													pause.setVisibility(View.INVISIBLE);
													nobutton10.setVisibility(View.INVISIBLE);
													
													q10.setVisibility(View.INVISIBLE);
													 sp.play(musicwin, 1, 1, 0, 0, 1);
													LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
								                    View view=inflater.inflate(R.layout.puma, null);
								                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
								                    builder2.setView(view);
								                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
								                        
								                        @Override
								                                public void onClick(DialogInterface dialog, int which) {

								 		                        // TODO Auto-generated method stub
								                        		 sorry.setVisibility(View.VISIBLE);
								                        		 face2.setVisibility(View.INVISIBLE);
								                        		 sp.play(music, 1, 1, 0, 0, 1);
								 		                    	 dialog.cancel();}

								                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
								      
								               @Override
								                        public void onClick(DialogInterface dialog, int which) {
								                            // TODO Auto-generated method stub
								            	   bingo.setVisibility(View.VISIBLE);
								            		 face2.setVisibility(View.INVISIBLE);
								            		 sp.play(music, 1, 1, 0, 0, 1);
								                            dialog.cancel();
								                        }
								                    }).create().show();
												}

												});
											
									yesbutton11.setOnClickListener(new Button.OnClickListener(){	
												public void onClick(View v1) {
													// TODO Auto-generated method stub
													
													yesbutton11.setVisibility(View.INVISIBLE);
													
													nobutton11.setVisibility(View.INVISIBLE);
													
													q11.setVisibility(View.INVISIBLE);
													 sp.play(musicwin, 1, 1, 0, 0, 1);
													LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
								                    View view=inflater.inflate(R.layout.lion, null);
								                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
								                    builder2.setView(view);
								                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
								                        
								                        @Override
								                                public void onClick(DialogInterface dialog, int which) {

								 		                        // TODO Auto-generated method stub
								                        		 sorry.setVisibility(View.VISIBLE);
								                        		 face2.setVisibility(View.INVISIBLE);
								                        		 sp.play(music, 1, 1, 0, 0, 1);
								                        		 retry.setVisibility(View.VISIBLE);
																	pause.setVisibility(View.INVISIBLE);
								 		                    	 dialog.cancel();}

								                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
								      
								               @Override
								                        public void onClick(DialogInterface dialog, int which) {
								                            // TODO Auto-generated method stub
								            	   bingo.setVisibility(View.VISIBLE);
								            		 face2.setVisibility(View.INVISIBLE);
								            		 sp.play(music, 1, 1, 0, 0, 1);
								            		 retry.setVisibility(View.VISIBLE);
														pause.setVisibility(View.INVISIBLE);
								                            dialog.cancel();
								                        }
								                    }).create().show();
												
												}
											});
												
									nobutton11.setOnClickListener(new Button.OnClickListener(){	
													public void onClick(View v1) {
														// TODO Auto-generated method stub
														yesbutton11.setVisibility(View.INVISIBLE);
														yesbutton12.setVisibility(View.VISIBLE);
														nobutton11.setVisibility(View.INVISIBLE);
														nobutton12.setVisibility(View.VISIBLE);
														q11.setVisibility(View.INVISIBLE);
														q12.setVisibility(View.VISIBLE);
														 sp.play(music, 1, 1, 0, 0, 1);
													}

													});
						 yesbutton12.setOnClickListener(new Button.OnClickListener(){	
										public void onClick(View v1) {
											// TODO Auto-generated method stub
											
											yesbutton12.setVisibility(View.INVISIBLE);
											retry.setVisibility(View.VISIBLE);
											pause.setVisibility(View.INVISIBLE);
											nobutton12.setVisibility(View.INVISIBLE);
											
											q12.setVisibility(View.INVISIBLE);
											 sp.play(musicwin, 1, 1, 0, 0, 1);
											LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
						                    View view=inflater.inflate(R.layout.tiger, null);
						                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
						                    builder2.setView(view);
						                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
						                        
						                        @Override
						                                public void onClick(DialogInterface dialog, int which) {

						 		                        // TODO Auto-generated method stub
						                        		 sorry.setVisibility(View.VISIBLE);
						                        		 face2.setVisibility(View.INVISIBLE);
						                        		 sp.play(music, 1, 1, 0, 0, 1);
						 		                    	 dialog.cancel();}

						                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
						      
						               @Override
						                        public void onClick(DialogInterface dialog, int which) {
						                            // TODO Auto-generated method stub
						            	   bingo.setVisibility(View.VISIBLE);
						            		 face2.setVisibility(View.INVISIBLE);
						            		 sp.play(music, 1, 1, 0, 0, 1);
						                            dialog.cancel();
						                        }
						                    }).create().show();
										
										}
									});
										
							nobutton12.setOnClickListener(new Button.OnClickListener(){	
											public void onClick(View v1) {
												// TODO Auto-generated method stub
												yesbutton12.setVisibility(View.INVISIBLE);
												retry.setVisibility(View.VISIBLE);
												pause.setVisibility(View.INVISIBLE);
												nobutton12.setVisibility(View.INVISIBLE);
												
												q12.setVisibility(View.INVISIBLE);
												 sp.play(musicwin, 1, 1, 0, 0, 1);
												LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
							                    View view=inflater.inflate(R.layout.cheetah, null);
							                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
							                    builder2.setView(view);
							                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
							                        
							                        @Override
							                                public void onClick(DialogInterface dialog, int which) {

							 		                        // TODO Auto-generated method stub
							                        		 sorry.setVisibility(View.VISIBLE);
							                        		 face2.setVisibility(View.INVISIBLE);
							                        		 sp.play(music, 1, 1, 0, 0, 1);
							 		                    	 dialog.cancel();}

							                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
							      
							               @Override
							                        public void onClick(DialogInterface dialog, int which) {
							                            // TODO Auto-generated method stub
							            	   bingo.setVisibility(View.VISIBLE);
							            		 face2.setVisibility(View.INVISIBLE);
							            		 sp.play(music, 1, 1, 0, 0, 1);
							                            dialog.cancel();
							                        }
							                    }).create().show();
											}

											});																																																		
				yesbutton13.setOnClickListener(new Button.OnClickListener(){	
								public void onClick(View v1) {
									// TODO Auto-generated method stub
									
									yesbutton13.setVisibility(View.INVISIBLE);
									yesbutton27.setVisibility(View.VISIBLE);
									nobutton13.setVisibility(View.INVISIBLE);
									nobutton27.setVisibility(View.VISIBLE);
									q13.setVisibility(View.INVISIBLE);
									q27.setVisibility(View.VISIBLE);
									 sp.play(music, 1, 1, 0, 0, 1);
								}
							});
								
					nobutton13.setOnClickListener(new Button.OnClickListener(){	
									public void onClick(View v1) {
										// TODO Auto-generated method stub
										yesbutton13.setVisibility(View.INVISIBLE);
										yesbutton14.setVisibility(View.VISIBLE);
										nobutton13.setVisibility(View.INVISIBLE);
										nobutton14.setVisibility(View.VISIBLE);
										q13.setVisibility(View.INVISIBLE);
										q14.setVisibility(View.VISIBLE);
										 sp.play(music, 1, 1, 0, 0, 1);
									}

									});																																																			
		
		
		yesbutton14.setOnClickListener(new Button.OnClickListener(){	
						public void onClick(View v1) {
							// TODO Auto-generated method stub
							
							yesbutton14.setVisibility(View.INVISIBLE);
							yesbutton18.setVisibility(View.VISIBLE);
							nobutton14.setVisibility(View.INVISIBLE);
							nobutton18.setVisibility(View.VISIBLE);
							q14.setVisibility(View.INVISIBLE);
							q18.setVisibility(View.VISIBLE);
							 sp.play(music, 1, 1, 0, 0, 1);
							 face1.setVisibility(View.INVISIBLE);
								face2.setVisibility(View.VISIBLE);
						}
					});
						
		nobutton14.setOnClickListener(new Button.OnClickListener(){	
							public void onClick(View v1) {
								// TODO Auto-generated method stub
								yesbutton14.setVisibility(View.INVISIBLE);
								yesbutton15.setVisibility(View.VISIBLE);
								nobutton14.setVisibility(View.INVISIBLE);
								nobutton15.setVisibility(View.VISIBLE);
								q14.setVisibility(View.INVISIBLE);
								q15.setVisibility(View.VISIBLE);
								 sp.play(music, 1, 1, 0, 0, 1);
								 face1.setVisibility(View.INVISIBLE);
									face2.setVisibility(View.VISIBLE);
							}

							});
						
						
		yesbutton15.setOnClickListener(new Button.OnClickListener(){	
							public void onClick(View v1) {
								// TODO Auto-generated method stub
								
								yesbutton15.setVisibility(View.INVISIBLE);
								yesbutton16.setVisibility(View.VISIBLE);
								nobutton15.setVisibility(View.INVISIBLE);
								nobutton16.setVisibility(View.VISIBLE);
								q15.setVisibility(View.INVISIBLE);
								q16.setVisibility(View.VISIBLE);
								 sp.play(music, 1, 1, 0, 0, 1);
							}
						});
							
		nobutton15.setOnClickListener(new Button.OnClickListener(){	
								public void onClick(View v1) {
									// TODO Auto-generated method stub
									yesbutton15.setVisibility(View.INVISIBLE);
									yesbutton17.setVisibility(View.VISIBLE);
									nobutton15.setVisibility(View.INVISIBLE);
									nobutton17.setVisibility(View.VISIBLE);
									q15.setVisibility(View.INVISIBLE);
									q17.setVisibility(View.VISIBLE);
									 sp.play(music, 1, 1, 0, 0, 1);
								}

								});
							
		yesbutton16.setOnClickListener(new Button.OnClickListener(){	
								public void onClick(View v1) {
									// TODO Auto-generated method stub
									
									yesbutton16.setVisibility(View.INVISIBLE);
									retry.setVisibility(View.VISIBLE);
									pause.setVisibility(View.INVISIBLE);
									nobutton16.setVisibility(View.INVISIBLE);
									
									q16.setVisibility(View.INVISIBLE);
									 sp.play(musicwin, 1, 1, 0, 0, 1);
									LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
				                    View view=inflater.inflate(R.layout.kangarro, null);
				                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
				                    builder2.setView(view);
				                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
				                        
				                        @Override
				                                public void onClick(DialogInterface dialog, int which) {

				 		                        // TODO Auto-generated method stub
				                        		 sorry.setVisibility(View.VISIBLE);
				                        		 face2.setVisibility(View.INVISIBLE);
				                        		 sp.play(music, 1, 1, 0, 0, 1);
				 		                    	 dialog.cancel();}

				                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
				      
				               @Override
				                        public void onClick(DialogInterface dialog, int which) {
				                            // TODO Auto-generated method stub
				            	   bingo.setVisibility(View.VISIBLE);
				            		 face2.setVisibility(View.INVISIBLE);
				            		 sp.play(music, 1, 1, 0, 0, 1);
				                            dialog.cancel();
				                        }
				                    }).create().show();
								
								}
							});
								
      nobutton16.setOnClickListener(new Button.OnClickListener(){	
									public void onClick(View v1) {
										// TODO Auto-generated method stub
										yesbutton16.setVisibility(View.INVISIBLE);
										
										nobutton16.setVisibility(View.INVISIBLE);
										retry.setVisibility(View.VISIBLE);
										pause.setVisibility(View.INVISIBLE);
										q16.setVisibility(View.INVISIBLE);
										 sp.play(musicwin, 1, 1, 0, 0, 1);
										LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
					                    View view=inflater.inflate(R.layout.rabbit, null);
					                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
					                    builder2.setView(view);
					                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
					                        
					                        @Override
					                                public void onClick(DialogInterface dialog, int which) {

					 		                        // TODO Auto-generated method stub
					                        		 sorry.setVisibility(View.VISIBLE);
					                        		 face2.setVisibility(View.INVISIBLE);
					                        		 sp.play(music, 1, 1, 0, 0, 1);
					 		                    	 dialog.cancel();}

					                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
					      
					               @Override
					                        public void onClick(DialogInterface dialog, int which) {
					                            // TODO Auto-generated method stub
					            	   bingo.setVisibility(View.VISIBLE);
					            		 face2.setVisibility(View.INVISIBLE);
					            		 sp.play(music, 1, 1, 0, 0, 1);
					                            dialog.cancel();
					                        }
					                    }).create().show();
									}

									});
								
	yesbutton17.setOnClickListener(new Button.OnClickListener(){	
									public void onClick(View v1) {
										// TODO Auto-generated method stub
										
										yesbutton17.setVisibility(View.INVISIBLE);
										yesbutton22.setVisibility(View.VISIBLE);
										nobutton17.setVisibility(View.INVISIBLE);
										nobutton22.setVisibility(View.VISIBLE);
										q17.setVisibility(View.INVISIBLE);
										q22.setVisibility(View.VISIBLE);
										 sp.play(music, 1, 1, 0, 0, 1);
									}
								});
									
	nobutton17.setOnClickListener(new Button.OnClickListener(){	
										public void onClick(View v1) {
											// TODO Auto-generated method stub
											yesbutton17.setVisibility(View.INVISIBLE);
											yesbutton21.setVisibility(View.VISIBLE);
											nobutton17.setVisibility(View.INVISIBLE);
											nobutton21.setVisibility(View.VISIBLE);
											q17.setVisibility(View.INVISIBLE);
											q21.setVisibility(View.VISIBLE);
											 sp.play(music, 1, 1, 0, 0, 1);
										}

										});
									
	yesbutton18.setOnClickListener(new Button.OnClickListener(){	
										public void onClick(View v1) {
											// TODO Auto-generated method stub
											
											yesbutton18.setVisibility(View.INVISIBLE);
											yesbutton19.setVisibility(View.VISIBLE);
											nobutton18.setVisibility(View.INVISIBLE);
											nobutton19.setVisibility(View.VISIBLE);
											q18.setVisibility(View.INVISIBLE);
											q19.setVisibility(View.VISIBLE);
											 sp.play(music, 1, 1, 0, 0, 1);
										}
									});
										
	nobutton18.setOnClickListener(new Button.OnClickListener(){	
											public void onClick(View v1) {
												// TODO Auto-generated method stub
												yesbutton18.setVisibility(View.INVISIBLE);
												
												nobutton18.setVisibility(View.INVISIBLE);
												
												q18.setVisibility(View.INVISIBLE);
												 sp.play(musicwin, 1, 1, 0, 0, 1);
												LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
							                    View view=inflater.inflate(R.layout.squirrel, null);
							                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
							                    builder2.setView(view);
							                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
							                        
							                        @Override
							                                public void onClick(DialogInterface dialog, int which) {

							 		                        // TODO Auto-generated method stub
							                        		 sorry.setVisibility(View.VISIBLE);
							                        		 face2.setVisibility(View.INVISIBLE);
							                        		 sp.play(music, 1, 1, 0, 0, 1);
							                        		 retry.setVisibility(View.VISIBLE);
																pause.setVisibility(View.INVISIBLE);
							 		                    	 dialog.cancel();
							 		                    	 }

							                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
							      
							               @Override
							                        public void onClick(DialogInterface dialog, int which) {
							                            // TODO Auto-generated method stub
							            	   bingo.setVisibility(View.VISIBLE);
							            		 face2.setVisibility(View.INVISIBLE);
							            		 sp.play(music, 1, 1, 0, 0, 1);
							                            dialog.cancel();
							                            retry.setVisibility(View.VISIBLE);
														pause.setVisibility(View.INVISIBLE);
							                        }
							                    }).create().show();
											}

											});
										
        yesbutton19.setOnClickListener(new Button.OnClickListener(){	
											public void onClick(View v1) {
												// TODO Auto-generated method stub
												
												yesbutton19.setVisibility(View.INVISIBLE);
												
												nobutton19.setVisibility(View.INVISIBLE);
												
												q19.setVisibility(View.INVISIBLE);
												 sp.play(musicwin, 1, 1, 0, 0, 1);
												LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
							                    View view=inflater.inflate(R.layout.koala, null);
							                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
							                    builder2.setView(view);
							                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
							                        
							                        @Override
							                                public void onClick(DialogInterface dialog, int which) {

							 		                        // TODO Auto-generated method stub
							                        		 sorry.setVisibility(View.VISIBLE);
							                        		 face2.setVisibility(View.INVISIBLE);
							                        		 sp.play(music, 1, 1, 0, 0, 1);
							                        		 retry.setVisibility(View.VISIBLE);
																pause.setVisibility(View.INVISIBLE);
							 		                    	 dialog.cancel();}

							                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
							      
							               @Override
							                        public void onClick(DialogInterface dialog, int which) {
							                            // TODO Auto-generated method stub
							            	   bingo.setVisibility(View.VISIBLE);
							            		 face2.setVisibility(View.INVISIBLE);
							            		 sp.play(music, 1, 1, 0, 0, 1);
							                            dialog.cancel();
							                            retry.setVisibility(View.VISIBLE);
														pause.setVisibility(View.INVISIBLE);
							                        }
							                    }).create().show();
												
											
											}
										});
											
		nobutton19.setOnClickListener(new Button.OnClickListener(){	
												public void onClick(View v1) {
													// TODO Auto-generated method stub
													yesbutton19.setVisibility(View.INVISIBLE);
													yesbutton20.setVisibility(View.VISIBLE);
													nobutton19.setVisibility(View.INVISIBLE);
													nobutton20.setVisibility(View.VISIBLE);
													q19.setVisibility(View.INVISIBLE);
													q20.setVisibility(View.VISIBLE);
													 sp.play(music, 1, 1, 0, 0, 1);
												}

												});
											
											
		yesbutton20.setOnClickListener(new Button.OnClickListener(){	
												public void onClick(View v1) {
													// TODO Auto-generated method stub
													
													yesbutton20.setVisibility(View.INVISIBLE);
													retry.setVisibility(View.VISIBLE);
													pause.setVisibility(View.INVISIBLE);
													nobutton20.setVisibility(View.INVISIBLE);
													
													q20.setVisibility(View.INVISIBLE);
													 sp.play(musicwin, 1, 1, 0, 0, 1);
													LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
								                    View view=inflater.inflate(R.layout.panda, null);
								                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
								                    builder2.setView(view);
								                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
								                        
								                        @Override
								                                public void onClick(DialogInterface dialog, int which) {

								 		                        // TODO Auto-generated method stub
								                        		 sorry.setVisibility(View.VISIBLE);
								                        		 face2.setVisibility(View.INVISIBLE);
								                        		 sp.play(music, 1, 1, 0, 0, 1);
								 		                    	 dialog.cancel();}

								                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
								      
								               @Override
								                        public void onClick(DialogInterface dialog, int which) {
								                            // TODO Auto-generated method stub
								            	   bingo.setVisibility(View.VISIBLE);
								            		 face2.setVisibility(View.INVISIBLE);
								            		 sp.play(music, 1, 1, 0, 0, 1);
								                            dialog.cancel();
								                        }
								                    }).create().show();
												
												}
											});
												
	nobutton20.setOnClickListener(new Button.OnClickListener(){	
													public void onClick(View v1) {
														// TODO Auto-generated method stub
														yesbutton20.setVisibility(View.INVISIBLE);
														retry.setVisibility(View.VISIBLE);
														pause.setVisibility(View.INVISIBLE);
														nobutton20.setVisibility(View.INVISIBLE);
														
														q20.setVisibility(View.INVISIBLE);
														 sp.play(musicwin, 1, 1, 0, 0, 1);
														LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
									                    View view=inflater.inflate(R.layout.monkey, null);
									                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
									                    builder2.setView(view);
									                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
									                        
									                        @Override
									                                public void onClick(DialogInterface dialog, int which) {

									 		                        // TODO Auto-generated method stub
									                        		 sorry.setVisibility(View.VISIBLE);
									                        		 face2.setVisibility(View.INVISIBLE);
									                        		 sp.play(music, 1, 1, 0, 0, 1);
									 		                    	 dialog.cancel();}

									                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
									      
									               @Override
									                        public void onClick(DialogInterface dialog, int which) {
									                            // TODO Auto-generated method stub
									            	   bingo.setVisibility(View.VISIBLE);
									            		 face2.setVisibility(View.INVISIBLE);
									            		 sp.play(music, 1, 1, 0, 0, 1);
									                            dialog.cancel();
									                        }
									                    }).create().show();
													}

													});
												
		yesbutton21.setOnClickListener(new Button.OnClickListener(){	
													public void onClick(View v1) {
														// TODO Auto-generated method stub
														
														yesbutton21.setVisibility(View.INVISIBLE);
														yesbutton24.setVisibility(View.VISIBLE);
														nobutton21.setVisibility(View.INVISIBLE);
														nobutton24.setVisibility(View.VISIBLE);
														q21.setVisibility(View.INVISIBLE);
														q24.setVisibility(View.VISIBLE);
														 sp.play(music, 1, 1, 0, 0, 1);
													}
												});
													
			nobutton21.setOnClickListener(new Button.OnClickListener(){	
														public void onClick(View v1) {
															// TODO Auto-generated method stub
															yesbutton21.setVisibility(View.INVISIBLE);
															yesbutton23.setVisibility(View.VISIBLE);
															nobutton21.setVisibility(View.INVISIBLE);
															nobutton23.setVisibility(View.VISIBLE);
															q21.setVisibility(View.INVISIBLE);
															q23.setVisibility(View.VISIBLE);
															 sp.play(music, 1, 1, 0, 0, 1);
														}

														});
													
          yesbutton22.setOnClickListener(new Button.OnClickListener(){	
														public void onClick(View v1) {
															// TODO Auto-generated method stub
															
															yesbutton22.setVisibility(View.INVISIBLE);
															
															nobutton22.setVisibility(View.INVISIBLE);
															
															q22.setVisibility(View.INVISIBLE);
															 sp.play(musicwin, 1, 1, 0, 0, 1);
															LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
										                    View view=inflater.inflate(R.layout.giraffe, null);
										                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
										                    builder2.setView(view);
										                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
										                        
										                        @Override
										                                public void onClick(DialogInterface dialog, int which) {

										 		                        // TODO Auto-generated method stub
										                        		 sorry.setVisibility(View.VISIBLE);
										                        		 face2.setVisibility(View.INVISIBLE);
										                        		 sp.play(music, 1, 1, 0, 0, 1);
										 		                    	 dialog.cancel();
										 		                    	retry.setVisibility(View.VISIBLE);
																		pause.setVisibility(View.INVISIBLE);}

										                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
										      
										               @Override
										                        public void onClick(DialogInterface dialog, int which) {
										                            // TODO Auto-generated method stub
										            	   bingo.setVisibility(View.VISIBLE);
										            		 face2.setVisibility(View.INVISIBLE);
										            		 sp.play(music, 1, 1, 0, 0, 1);
										                            dialog.cancel();
										                            retry.setVisibility(View.VISIBLE);
																	pause.setVisibility(View.INVISIBLE);
										                        }
										                    }).create().show();
														
														}
													});
														
		nobutton22.setOnClickListener(new Button.OnClickListener(){	
															public void onClick(View v1) {
																// TODO Auto-generated method stub
																yesbutton22.setVisibility(View.INVISIBLE);
																yesbutton25.setVisibility(View.VISIBLE);
																nobutton22.setVisibility(View.INVISIBLE);
																nobutton25.setVisibility(View.VISIBLE);
																q22.setVisibility(View.INVISIBLE);
																q25.setVisibility(View.VISIBLE);
																 sp.play(music, 1, 1, 0, 0, 1);
															}

															});
														
	    yesbutton23.setOnClickListener(new Button.OnClickListener(){	
															public void onClick(View v1) {
																// TODO Auto-generated method stub
																
																yesbutton23.setVisibility(View.INVISIBLE);
																
																nobutton23.setVisibility(View.INVISIBLE);
																
																q23.setVisibility(View.INVISIBLE);
																 sp.play(musicwin, 1, 1, 0, 0, 1);
																LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
											                    View view=inflater.inflate(R.layout.cat, null);
											                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
											                    builder2.setView(view);
											                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
											                        
											                        @Override
											                                public void onClick(DialogInterface dialog, int which) {

											 		                        // TODO Auto-generated method stub
											                        		 sorry.setVisibility(View.VISIBLE);
											                        		 face2.setVisibility(View.INVISIBLE);
											                        		 sp.play(music, 1, 1, 0, 0, 1);
											                        		 retry.setVisibility(View.VISIBLE);
																				pause.setVisibility(View.INVISIBLE);
											 		                    	 dialog.cancel();}

											                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
											      
											               @Override
											                        public void onClick(DialogInterface dialog, int which) {
											                            // TODO Auto-generated method stub
											            	   bingo.setVisibility(View.VISIBLE);
											            		 face2.setVisibility(View.INVISIBLE);
											            		 sp.play(music, 1, 1, 0, 0, 1);
											                            dialog.cancel();
											                            retry.setVisibility(View.VISIBLE);
																		pause.setVisibility(View.INVISIBLE);
											                        }
											                    }).create().show();
															
															}
														});
															
			nobutton23.setOnClickListener(new Button.OnClickListener(){	
																public void onClick(View v1) {
																	// TODO Auto-generated method stub
																	yesbutton23.setVisibility(View.INVISIBLE);
																	yesbutton26.setVisibility(View.VISIBLE);
																	nobutton23.setVisibility(View.INVISIBLE);
																	nobutton26.setVisibility(View.VISIBLE);
																	q23.setVisibility(View.INVISIBLE);
																	q26.setVisibility(View.VISIBLE);
																	 sp.play(music, 1, 1, 0, 0, 1);
																}

																});
															
			yesbutton24.setOnClickListener(new Button.OnClickListener(){	
																public void onClick(View v1) {
																	// TODO Auto-generated method stub
																	
																	yesbutton24.setVisibility(View.INVISIBLE);
																	retry.setVisibility(View.VISIBLE);
																	pause.setVisibility(View.INVISIBLE);
																	nobutton24.setVisibility(View.INVISIBLE);
																	
																	q24.setVisibility(View.INVISIBLE);
																	 sp.play(musicwin, 1, 1, 0, 0, 1);
																	LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
												                    View view=inflater.inflate(R.layout.zebra, null);
												                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
												                    builder2.setView(view);
												                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
												                        
												                        @Override
												                                public void onClick(DialogInterface dialog, int which) {

												 		                        // TODO Auto-generated method stub
												                        		 sorry.setVisibility(View.VISIBLE);
												                        		 face2.setVisibility(View.INVISIBLE);
												                        		 sp.play(music, 1, 1, 0, 0, 1);
												 		                    	 dialog.cancel();}

												                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
												      
												               @Override
												                        public void onClick(DialogInterface dialog, int which) {
												                            // TODO Auto-generated method stub
												            	   bingo.setVisibility(View.VISIBLE);
												            		 face2.setVisibility(View.INVISIBLE);
												                            dialog.cancel();
												                            sp.play(music, 1, 1, 0, 0, 1);
												                        }
												                    }).create().show();
																
																}
															});
																
			nobutton24.setOnClickListener(new Button.OnClickListener(){	
																	public void onClick(View v1) {
																		// TODO Auto-generated method stub
																		yesbutton24.setVisibility(View.INVISIBLE);
																		retry.setVisibility(View.VISIBLE);
																		pause.setVisibility(View.INVISIBLE);
																		nobutton24.setVisibility(View.INVISIBLE);
																	
																		q24.setVisibility(View.INVISIBLE);
																		 sp.play(musicwin, 1, 1, 0, 0, 1);
																		LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
													                    View view=inflater.inflate(R.layout.skunk, null);
													                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
													                    builder2.setView(view);
													                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
													                        
													                        @Override
													                                public void onClick(DialogInterface dialog, int which) {

													 		                        // TODO Auto-generated method stub
													                        		 sorry.setVisibility(View.VISIBLE);
													                        		 face2.setVisibility(View.INVISIBLE);
													                        		 sp.play(music, 1, 1, 0, 0, 1);
													 		                    	 dialog.cancel();}

													                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
													      
													               @Override
													                        public void onClick(DialogInterface dialog, int which) {
													                            // TODO Auto-generated method stub
													            	   bingo.setVisibility(View.VISIBLE);
													            		 face2.setVisibility(View.INVISIBLE);
													            		 sp.play(music, 1, 1, 0, 0, 1);
													                            dialog.cancel();
													                        }
													                    }).create().show();
																	}

																	});
				 yesbutton25.setOnClickListener(new Button.OnClickListener(){	
														public void onClick(View v1) {
															// TODO Auto-generated method stub
															
															yesbutton25.setVisibility(View.INVISIBLE);
															retry.setVisibility(View.VISIBLE);
															pause.setVisibility(View.INVISIBLE);
															nobutton25.setVisibility(View.INVISIBLE);
															
															q25.setVisibility(View.INVISIBLE);
															 sp.play(musicwin, 1, 1, 0, 0, 1);
															LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
										                    View view=inflater.inflate(R.layout.goat, null);
										                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
										                    builder2.setView(view);
										                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
										                        
										                        @Override
										                                public void onClick(DialogInterface dialog, int which) {

										 		                        // TODO Auto-generated method stub
										                        		 sorry.setVisibility(View.VISIBLE);
										                        		 face2.setVisibility(View.INVISIBLE);
										                        		 sp.play(music, 1, 1, 0, 0, 1);
										 		                    	 dialog.cancel();}

										                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
										      
										               @Override
										                        public void onClick(DialogInterface dialog, int which) {
										                            // TODO Auto-generated method stub
										            	   bingo.setVisibility(View.VISIBLE);
										            		 face2.setVisibility(View.INVISIBLE);
										            		 sp.play(music, 1, 1, 0, 0, 1);
										                            dialog.cancel();
										                        }
										                    }).create().show();
														
														}
													});
														
				nobutton25.setOnClickListener(new Button.OnClickListener(){	
															public void onClick(View v1) {
																// TODO Auto-generated method stub
																yesbutton25.setVisibility(View.INVISIBLE);
																retry.setVisibility(View.VISIBLE);
																pause.setVisibility(View.INVISIBLE);
																nobutton25.setVisibility(View.INVISIBLE);
																
																q25.setVisibility(View.INVISIBLE);
																 sp.play(musicwin, 1, 1, 0, 0, 1);
																LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
											                    View view=inflater.inflate(R.layout.deer, null);
											                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
											                    builder2.setView(view);
											                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
											                        
											                        @Override
											                                public void onClick(DialogInterface dialog, int which) {

											 		                        // TODO Auto-generated method stub
											                        		 sorry.setVisibility(View.VISIBLE);
											                        		 face2.setVisibility(View.INVISIBLE);
											                        		 sp.play(music, 1, 1, 0, 0, 1);
											 		                    	 dialog.cancel();}

											                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
											      
											               @Override
											                        public void onClick(DialogInterface dialog, int which) {
											                            // TODO Auto-generated method stub
											            	   bingo.setVisibility(View.VISIBLE);
											            		 face2.setVisibility(View.INVISIBLE);
											            		 sp.play(music, 1, 1, 0, 0, 1);
											                            dialog.cancel();
											                        }
											                    }).create().show();
															}

															});																																																		
			yesbutton26.setOnClickListener(new Button.OnClickListener(){	
												public void onClick(View v1) {
													// TODO Auto-generated method stub
													
													yesbutton26.setVisibility(View.INVISIBLE);
													
													nobutton26.setVisibility(View.INVISIBLE);
													
													q26.setVisibility(View.INVISIBLE);
													 sp.play(music, 1, 1, 0, 0, 1);
													 yesbutton204.setVisibility(View.VISIBLE);
														
														nobutton204.setVisibility(View.VISIBLE);
														
														q204.setVisibility(View.VISIBLE);
												
												}
											});
												
			nobutton26.setOnClickListener(new Button.OnClickListener(){	
													public void onClick(View v1) {
														// TODO Auto-generated method stub
														yesbutton26.setVisibility(View.INVISIBLE);
													
														nobutton26.setVisibility(View.INVISIBLE);
														 sp.play(musicwin, 1, 1, 0, 0, 1);
														q26.setVisibility(View.INVISIBLE);
														yesbutton200.setVisibility(View.VISIBLE);
														
														nobutton200.setVisibility(View.VISIBLE);
														
														q200.setVisibility(View.VISIBLE);
													
													}

													});																																																			
						
							
					
					
			yesbutton27.setOnClickListener(new Button.OnClickListener(){	
				public void onClick(View v1) {
					// TODO Auto-generated method stub
					
					yesbutton27.setVisibility(View.INVISIBLE);
					yesbutton28.setVisibility(View.VISIBLE);
					nobutton27.setVisibility(View.INVISIBLE);
					nobutton28.setVisibility(View.VISIBLE);
					q27.setVisibility(View.INVISIBLE);
					q28.setVisibility(View.VISIBLE);
					 sp.play(music, 1, 1, 0, 0, 1);
					 face1.setVisibility(View.INVISIBLE);
						face2.setVisibility(View.VISIBLE);
				}
			});
				
				nobutton27.setOnClickListener(new Button.OnClickListener(){	
					public void onClick(View v1) {
						// TODO Auto-generated method stub
						yesbutton27.setVisibility(View.INVISIBLE);
						yesbutton29.setVisibility(View.VISIBLE);
						nobutton27.setVisibility(View.INVISIBLE);
						nobutton29.setVisibility(View.VISIBLE);
						q27.setVisibility(View.INVISIBLE);
						q29.setVisibility(View.VISIBLE);
						 sp.play(music, 1, 1, 0, 0, 1);
						 face1.setVisibility(View.INVISIBLE);
							face2.setVisibility(View.VISIBLE);
					}

					});
				
				
				yesbutton28.setOnClickListener(new Button.OnClickListener(){	
					public void onClick(View v1) {
						// TODO Auto-generated method stub
						
						yesbutton28.setVisibility(View.INVISIBLE);
						retry.setVisibility(View.VISIBLE);
						pause.setVisibility(View.INVISIBLE);
						nobutton28.setVisibility(View.INVISIBLE);
						
						q28.setVisibility(View.INVISIBLE);
						 sp.play(musicwin, 1, 1, 0, 0, 1);
						LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
	                    View view=inflater.inflate(R.layout.horse, null);
	                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
	                    builder2.setView(view);
	                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
	                        
	                        @Override
	                                public void onClick(DialogInterface dialog, int which) {

	 		                        // TODO Auto-generated method stub
	                        		 sorry.setVisibility(View.VISIBLE);
	                        		 face2.setVisibility(View.INVISIBLE);
	                        		 sp.play(music, 1, 1, 0, 0, 1);
	 		                    	 dialog.cancel();}

	                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
	      
	               @Override
	                        public void onClick(DialogInterface dialog, int which) {
	                            // TODO Auto-generated method stub
	            	   bingo.setVisibility(View.VISIBLE);
	            		 face2.setVisibility(View.INVISIBLE);
	            		 sp.play(music, 1, 1, 0, 0, 1);
	                            dialog.cancel();
	                        }
	                    }).create().show();
					
					}
				});
					
					nobutton28.setOnClickListener(new Button.OnClickListener(){	
						public void onClick(View v1) {
							// TODO Auto-generated method stub
							yesbutton28.setVisibility(View.INVISIBLE);
							retry.setVisibility(View.VISIBLE);
							pause.setVisibility(View.INVISIBLE);
							nobutton28.setVisibility(View.INVISIBLE);
							
							q28.setVisibility(View.INVISIBLE);
							 sp.play(musicwin, 1, 1, 0, 0, 1);
							LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
		                    View view=inflater.inflate(R.layout.donkey, null);
		                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
		                    builder2.setView(view);
		                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
		                        
		                        @Override
		                                public void onClick(DialogInterface dialog, int which) {

		 		                        // TODO Auto-generated method stub
		                        		 sorry.setVisibility(View.VISIBLE);
		                        		 face2.setVisibility(View.INVISIBLE);
		                        		 sp.play(music, 1, 1, 0, 0, 1);
		 		                    	 dialog.cancel();}

		                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
		      
		               @Override
		                        public void onClick(DialogInterface dialog, int which) {
		                            // TODO Auto-generated method stub
		            	   bingo.setVisibility(View.VISIBLE);
		            		 face2.setVisibility(View.INVISIBLE);
		                            dialog.cancel();
		                            sp.play(music, 1, 1, 0, 0, 1);
		                        }
		                    }).create().show();
						}

						});
					
					yesbutton29.setOnClickListener(new Button.OnClickListener(){	
						public void onClick(View v1) {
							// TODO Auto-generated method stub
							
							yesbutton29.setVisibility(View.INVISIBLE);
							retry.setVisibility(View.VISIBLE);
							pause.setVisibility(View.INVISIBLE);
							nobutton29.setVisibility(View.INVISIBLE);
							
							q29.setVisibility(View.INVISIBLE);
							 sp.play(musicwin, 1, 1, 0, 0, 1);
							LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
		                    View view=inflater.inflate(R.layout.camel, null);
		                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
		                    builder2.setView(view);
		                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
		                        
		                        @Override
		                                public void onClick(DialogInterface dialog, int which) {

		 		                        // TODO Auto-generated method stub
		                        		 sorry.setVisibility(View.VISIBLE);
		                        		 face2.setVisibility(View.INVISIBLE);
		                        		 sp.play(music, 1, 1, 0, 0, 1);
		 		                    	 dialog.cancel();
		 		                    	 }

		                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
		      
		               @Override
		                        public void onClick(DialogInterface dialog, int which) {
		                            // TODO Auto-generated method stub
		            	   bingo.setVisibility(View.VISIBLE);
		            		 face2.setVisibility(View.INVISIBLE);
		            		 sp.play(music, 1, 1, 0, 0, 1);
		                            dialog.cancel();
		                        }
		                    }).create().show();
						
						}
					});
						
						nobutton29.setOnClickListener(new Button.OnClickListener(){	
							public void onClick(View v1) {
								// TODO Auto-generated method stub
								yesbutton29.setVisibility(View.INVISIBLE);
								retry.setVisibility(View.VISIBLE);
								pause.setVisibility(View.INVISIBLE);
								nobutton29.setVisibility(View.INVISIBLE);
								
								q29.setVisibility(View.INVISIBLE);
								 sp.play(musicwin, 1, 1, 0, 0, 1);
								LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
			                    View view=inflater.inflate(R.layout.unicorn, null);
			                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
			                    builder2.setView(view);
			                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
			                        
			                        @Override
			                                public void onClick(DialogInterface dialog, int which) {

			 		                        // TODO Auto-generated method stub
			                        		 sorry.setVisibility(View.VISIBLE);
			                        		 face2.setVisibility(View.INVISIBLE);
			                        		 sp.play(music, 1, 1, 0, 0, 1);
			 		                    	 dialog.cancel();}

			                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
			      
			               @Override
			                        public void onClick(DialogInterface dialog, int which) {
			                            // TODO Auto-generated method stub
			            	   bingo.setVisibility(View.VISIBLE);
			            		 face2.setVisibility(View.INVISIBLE);
			            		 sp.play(music, 1, 1, 0, 0, 1);
			                            dialog.cancel();
			                        }
			                    }).create().show();
							}

							});
						
						yesbutton100.setOnClickListener(new Button.OnClickListener(){	
							public void onClick(View v1) {
								// TODO Auto-generated method stub
								
								yesbutton100.setVisibility(View.INVISIBLE);
								yesbutton30.setVisibility(View.VISIBLE);
								nobutton100.setVisibility(View.INVISIBLE);
								nobutton30.setVisibility(View.VISIBLE);
								q100.setVisibility(View.INVISIBLE);
								q30.setVisibility(View.VISIBLE);
								 sp.play(music, 1, 1, 0, 0, 1);
							}
						});
							
							nobutton100.setOnClickListener(new Button.OnClickListener(){	
								public void onClick(View v1) {
									// TODO Auto-generated method stub
									yesbutton100.setVisibility(View.INVISIBLE);
									yesbutton101.setVisibility(View.VISIBLE);
									nobutton100.setVisibility(View.INVISIBLE);
									nobutton101.setVisibility(View.VISIBLE);
									q100.setVisibility(View.INVISIBLE);
									q101.setVisibility(View.VISIBLE);
									 sp.play(music, 1, 1, 0, 0, 1);
								}

								});
							
							yesbutton30.setOnClickListener(new Button.OnClickListener(){	
								public void onClick(View v1) {
									// TODO Auto-generated method stub
									
									yesbutton30.setVisibility(View.INVISIBLE);
									yesbutton32.setVisibility(View.VISIBLE);
									nobutton30.setVisibility(View.INVISIBLE);
									nobutton32.setVisibility(View.VISIBLE);
									q30.setVisibility(View.INVISIBLE);
									q32.setVisibility(View.VISIBLE);
									 sp.play(music, 1, 1, 0, 0, 1);
								}
							});
								
								nobutton30.setOnClickListener(new Button.OnClickListener(){	
									public void onClick(View v1) {
										// TODO Auto-generated method stub
										yesbutton30.setVisibility(View.INVISIBLE);
										yesbutton31.setVisibility(View.VISIBLE);
										nobutton30.setVisibility(View.INVISIBLE);
										nobutton31.setVisibility(View.VISIBLE);
										q30.setVisibility(View.INVISIBLE);
										q31.setVisibility(View.VISIBLE);
										 sp.play(music, 1, 1, 0, 0, 1);
									}

									});
	
								yesbutton31.setOnClickListener(new Button.OnClickListener(){	
									public void onClick(View v1) {
										// TODO Auto-generated method stub
										
										yesbutton31.setVisibility(View.INVISIBLE);
										yesbutton33.setVisibility(View.VISIBLE);
										nobutton31.setVisibility(View.INVISIBLE);
										nobutton33.setVisibility(View.VISIBLE);
										q31.setVisibility(View.INVISIBLE);
										q33.setVisibility(View.VISIBLE);
										face1.setVisibility(View.INVISIBLE);
										face2.setVisibility(View.VISIBLE);
										 sp.play(music, 1, 1, 0, 0, 1);
									}
								});
									
									nobutton31.setOnClickListener(new Button.OnClickListener(){	
										public void onClick(View v1) {
											// TODO Auto-generated method stub
											yesbutton31.setVisibility(View.INVISIBLE);
											yesbutton34.setVisibility(View.VISIBLE);
											nobutton31.setVisibility(View.INVISIBLE);
											nobutton34.setVisibility(View.VISIBLE);
											q31.setVisibility(View.INVISIBLE);
											q34.setVisibility(View.VISIBLE);
											 sp.play(music, 1, 1, 0, 0, 1);
											 face1.setVisibility(View.INVISIBLE);
												face2.setVisibility(View.VISIBLE);
											 
										}

										});
									
									
									yesbutton32.setOnClickListener(new Button.OnClickListener(){	
										public void onClick(View v1) {
											// TODO Auto-generated method stub
											
											yesbutton32.setVisibility(View.INVISIBLE);
											yesbutton35.setVisibility(View.VISIBLE);
											nobutton32.setVisibility(View.INVISIBLE);
											nobutton35.setVisibility(View.VISIBLE);
											q32.setVisibility(View.INVISIBLE);
											q35.setVisibility(View.VISIBLE);
											 sp.play(music, 1, 1, 0, 0, 1);
											 face1.setVisibility(View.INVISIBLE);
												face2.setVisibility(View.VISIBLE);
										}
									});
										
										nobutton32.setOnClickListener(new Button.OnClickListener(){	
											public void onClick(View v1) {
												// TODO Auto-generated method stub
												yesbutton32.setVisibility(View.INVISIBLE);
												yesbutton36.setVisibility(View.VISIBLE);
												nobutton32.setVisibility(View.INVISIBLE);
												nobutton36.setVisibility(View.VISIBLE);
												q32.setVisibility(View.INVISIBLE);
												q36.setVisibility(View.VISIBLE);
												 sp.play(music, 1, 1, 0, 0, 1);
												 face1.setVisibility(View.INVISIBLE);
													face2.setVisibility(View.VISIBLE);
											}

											});
										
										yesbutton33.setOnClickListener(new Button.OnClickListener(){	
											public void onClick(View v1) {
												// TODO Auto-generated method stub
												
												yesbutton33.setVisibility(View.INVISIBLE);
												yesbutton37.setVisibility(View.VISIBLE);
												nobutton33.setVisibility(View.INVISIBLE);
												nobutton37.setVisibility(View.VISIBLE);
												q33.setVisibility(View.INVISIBLE);
												q37.setVisibility(View.VISIBLE);
												 sp.play(music, 1, 1, 0, 0, 1);
											}
										});
											
								nobutton33.setOnClickListener(new Button.OnClickListener(){	
												public void onClick(View v1) {
													// TODO Auto-generated method stub
													yesbutton33.setVisibility(View.INVISIBLE);
													yesbutton38.setVisibility(View.VISIBLE);
													nobutton33.setVisibility(View.INVISIBLE);
													nobutton38.setVisibility(View.VISIBLE);
													q33.setVisibility(View.INVISIBLE);
													q38.setVisibility(View.VISIBLE);
													 sp.play(music, 1, 1, 0, 0, 1);
												}

												});
											
								yesbutton34.setOnClickListener(new Button.OnClickListener(){	
												public void onClick(View v1) {
													// TODO Auto-generated method stub
													
													yesbutton34.setVisibility(View.INVISIBLE);
													yesbutton39.setVisibility(View.VISIBLE);
													nobutton34.setVisibility(View.INVISIBLE);
													nobutton39.setVisibility(View.VISIBLE);
													q34.setVisibility(View.INVISIBLE);
													q39.setVisibility(View.VISIBLE);
													 sp.play(music, 1, 1, 0, 0, 1);
												}
											});
												
									nobutton34.setOnClickListener(new Button.OnClickListener(){	
													public void onClick(View v1) {
														// TODO Auto-generated method stub
														yesbutton34.setVisibility(View.INVISIBLE);
														yesbutton40.setVisibility(View.VISIBLE);
														nobutton34.setVisibility(View.INVISIBLE);
														nobutton40.setVisibility(View.VISIBLE);
														q34.setVisibility(View.INVISIBLE);
														q40.setVisibility(View.VISIBLE);
														 sp.play(music, 1, 1, 0, 0, 1);
													}

													});
												
									yesbutton35.setOnClickListener(new Button.OnClickListener(){	
													public void onClick(View v1) {
														// TODO Auto-generated method stub
														
														yesbutton35.setVisibility(View.INVISIBLE);
														
														nobutton35.setVisibility(View.INVISIBLE);
														
														q35.setVisibility(View.INVISIBLE);
														 sp.play(music, 1, 1, 0, 0, 1);
														 yesbutton204.setVisibility(View.VISIBLE);
															
															nobutton204.setVisibility(View.VISIBLE);
															
															q204.setVisibility(View.VISIBLE);
														
													}
												});
													
										nobutton35.setOnClickListener(new Button.OnClickListener(){	
														public void onClick(View v1) {
															// TODO Auto-generated method stub
															yesbutton35.setVisibility(View.INVISIBLE);
															yesbutton41.setVisibility(View.VISIBLE);
															nobutton35.setVisibility(View.INVISIBLE);
															nobutton41.setVisibility(View.VISIBLE);
															q35.setVisibility(View.INVISIBLE);
															q41.setVisibility(View.VISIBLE);
															 sp.play(music, 1, 1, 0, 0, 1);
														}

														});		
										yesbutton36.setOnClickListener(new Button.OnClickListener(){	
											public void onClick(View v1) {
												// TODO Auto-generated method stub
												
												yesbutton36.setVisibility(View.INVISIBLE);
												yesbutton42.setVisibility(View.VISIBLE);
												nobutton36.setVisibility(View.INVISIBLE);
												nobutton42.setVisibility(View.VISIBLE);
												q36.setVisibility(View.INVISIBLE);
												q42.setVisibility(View.VISIBLE);
												 sp.play(music, 1, 1, 0, 0, 1);
											}
										});
											
								nobutton36.setOnClickListener(new Button.OnClickListener(){	
												public void onClick(View v1) {
													// TODO Auto-generated method stub
													yesbutton36.setVisibility(View.INVISIBLE);
													yesbutton43.setVisibility(View.VISIBLE);
													nobutton36.setVisibility(View.INVISIBLE);
													nobutton43.setVisibility(View.VISIBLE);
													q36.setVisibility(View.INVISIBLE);
													q43.setVisibility(View.VISIBLE);
													 sp.play(music, 1, 1, 0, 0, 1);
												}

												});	
								yesbutton37.setOnClickListener(new Button.OnClickListener(){	
									public void onClick(View v1) {
										// TODO Auto-generated method stub
										
										yesbutton37.setVisibility(View.INVISIBLE);
										retry.setVisibility(View.VISIBLE);
										pause.setVisibility(View.INVISIBLE);
										nobutton37.setVisibility(View.INVISIBLE);
										
										q37.setVisibility(View.INVISIBLE);
										 sp.play(musicwin, 1, 1, 0, 0, 1);
										LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
					                    View view=inflater.inflate(R.layout.whale, null);
					                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
					                    builder2.setView(view);
					                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
					                        
					                        @Override
					                                public void onClick(DialogInterface dialog, int which) {

					 		                        // TODO Auto-generated method stub
					                        		 sorry.setVisibility(View.VISIBLE);
					                        		 face2.setVisibility(View.INVISIBLE);
					                        		 sp.play(music, 1, 1, 0, 0, 1);
					 		                    	 dialog.cancel();}

					                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
					      
					               @Override
					                        public void onClick(DialogInterface dialog, int which) {
					                            // TODO Auto-generated method stub
					            	   bingo.setVisibility(View.VISIBLE);
					            		 face2.setVisibility(View.INVISIBLE);
					            		 sp.play(music, 1, 1, 0, 0, 1);
					                            dialog.cancel();
					                        }
					                    }).create().show();
									
									}
								});
									
						nobutton37.setOnClickListener(new Button.OnClickListener(){	
										public void onClick(View v1) {
											// TODO Auto-generated method stub
											yesbutton37.setVisibility(View.INVISIBLE);
											
											nobutton37.setVisibility(View.INVISIBLE);
											retry.setVisibility(View.VISIBLE);
											pause.setVisibility(View.INVISIBLE);
											q37.setVisibility(View.INVISIBLE);
											 sp.play(musicwin, 1, 1, 0, 0, 1);
											LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
						                    View view=inflater.inflate(R.layout.dolphin, null);
						                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
						                    builder2.setView(view);
						                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
						                        
						                        @Override
						                                public void onClick(DialogInterface dialog, int which) {

						 		                        // TODO Auto-generated method stub
						                        		 sorry.setVisibility(View.VISIBLE);
						                        		 face2.setVisibility(View.INVISIBLE);
						                        		 sp.play(music, 1, 1, 0, 0, 1);
						 		                    	 dialog.cancel();}

						                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
						      
						               @Override
						                        public void onClick(DialogInterface dialog, int which) {
						                            // TODO Auto-generated method stub
						            	   bingo.setVisibility(View.VISIBLE);
						            		 face2.setVisibility(View.INVISIBLE);
						            		 sp.play(music, 1, 1, 0, 0, 1);
						                            dialog.cancel();
						                        }
						                    }).create().show();
										}

										});	
						yesbutton38.setOnClickListener(new Button.OnClickListener(){	
							public void onClick(View v1) {
								// TODO Auto-generated method stub
								
								yesbutton38.setVisibility(View.INVISIBLE);
								retry.setVisibility(View.VISIBLE);
								pause.setVisibility(View.INVISIBLE);
								nobutton38.setVisibility(View.INVISIBLE);
								
								q38.setVisibility(View.INVISIBLE);
								 sp.play(musicwin, 1, 1, 0, 0, 1);
								LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
			                    View view=inflater.inflate(R.layout.shark, null);
			                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
			                    builder2.setView(view);
			                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
			                        
			                        @Override
			                                public void onClick(DialogInterface dialog, int which) {

			 		                        // TODO Auto-generated method stub
			                        		 sorry.setVisibility(View.VISIBLE);
			                        		 face2.setVisibility(View.INVISIBLE);
			                        		 sp.play(music, 1, 1, 0, 0, 1);
			                        		 retry.setVisibility(View.VISIBLE);
			 								pause.setVisibility(View.INVISIBLE);
			 		                    	 dialog.cancel();}

			                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
			      
			               @Override
			                        public void onClick(DialogInterface dialog, int which) {
			                            // TODO Auto-generated method stub
			            	   bingo.setVisibility(View.VISIBLE);
			            		 face2.setVisibility(View.INVISIBLE);
			            		 sp.play(music, 1, 1, 0, 0, 1);
			            		 retry.setVisibility(View.VISIBLE);
									pause.setVisibility(View.INVISIBLE);
			                            dialog.cancel();
			                        }
			                    }).create().show();
							
							}
						});
							
				nobutton38.setOnClickListener(new Button.OnClickListener(){	
								public void onClick(View v1) {
									// TODO Auto-generated method stub
									yesbutton38.setVisibility(View.INVISIBLE);
									yesbutton44.setVisibility(View.VISIBLE);
									nobutton38.setVisibility(View.INVISIBLE);
									nobutton44.setVisibility(View.VISIBLE);
									q38.setVisibility(View.INVISIBLE);
									q44.setVisibility(View.VISIBLE);
									 sp.play(music, 1, 1, 0, 0, 1);
								}

								});	
				yesbutton39.setOnClickListener(new Button.OnClickListener(){	
					public void onClick(View v1) {
						// TODO Auto-generated method stub
						
						yesbutton39.setVisibility(View.INVISIBLE);
						
						nobutton39.setVisibility(View.INVISIBLE);
						
						q39.setVisibility(View.INVISIBLE);
						 sp.play(musicwin, 1, 1, 0, 0, 1);
						LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
	                    View view=inflater.inflate(R.layout.jellyfish, null);
	                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
	                    builder2.setView(view);
	                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
	                        
	                        @Override
	                                public void onClick(DialogInterface dialog, int which) {

	 		                        // TODO Auto-generated method stub
	                        		 sorry.setVisibility(View.VISIBLE);
	                        		 face2.setVisibility(View.INVISIBLE);
	                        		 sp.play(music, 1, 1, 0, 0, 1);
	                        		 retry.setVisibility(View.VISIBLE);
	         						pause.setVisibility(View.INVISIBLE);
	 		                    	 dialog.cancel();}

	                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
	      
	               @Override
	                        public void onClick(DialogInterface dialog, int which) {
	                            // TODO Auto-generated method stub
	            	   bingo.setVisibility(View.VISIBLE);
	            		 face2.setVisibility(View.INVISIBLE);
	            		 sp.play(music, 1, 1, 0, 0, 1);
	            		 retry.setVisibility(View.VISIBLE);
							pause.setVisibility(View.INVISIBLE);
	                            dialog.cancel();
	                        }
	                    }).create().show();
					
					}
				});
					
		nobutton39.setOnClickListener(new Button.OnClickListener(){	
						public void onClick(View v1) {
							// TODO Auto-generated method stub
							yesbutton39.setVisibility(View.INVISIBLE);
							yesbutton45.setVisibility(View.VISIBLE);
							nobutton39.setVisibility(View.INVISIBLE);
							nobutton45.setVisibility(View.VISIBLE);
							q39.setVisibility(View.INVISIBLE);
							q45.setVisibility(View.VISIBLE);
							 sp.play(music, 1, 1, 0, 0, 1);
						}

						});	
		yesbutton40.setOnClickListener(new Button.OnClickListener(){	
			public void onClick(View v1) {
				// TODO Auto-generated method stub
				
				yesbutton40.setVisibility(View.INVISIBLE);
				
				nobutton40.setVisibility(View.INVISIBLE);
				
				q40.setVisibility(View.INVISIBLE);
				 sp.play(musicwin, 1, 1, 0, 0, 1);
				LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                View view=inflater.inflate(R.layout.seahorse, null);
                AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
                builder2.setView(view);
                builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    
                    @Override
                            public void onClick(DialogInterface dialog, int which) {

		                        // TODO Auto-generated method stub
                    		 sorry.setVisibility(View.VISIBLE);
                    		 face2.setVisibility(View.INVISIBLE);
                    		 sp.play(music, 1, 1, 0, 0, 1);
                    		 retry.setVisibility(View.VISIBLE);
             				pause.setVisibility(View.INVISIBLE);
		                    	 dialog.cancel();}

                         }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
  
           @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO Auto-generated method stub
        	   bingo.setVisibility(View.VISIBLE);
        		 face2.setVisibility(View.INVISIBLE);
        		 sp.play(music, 1, 1, 0, 0, 1);
                        dialog.cancel();
                        retry.setVisibility(View.VISIBLE);
        				pause.setVisibility(View.INVISIBLE);
                    }
                }).create().show();
			
			}
		});
			
nobutton40.setOnClickListener(new Button.OnClickListener(){	
				public void onClick(View v1) {
					// TODO Auto-generated method stub
					yesbutton40.setVisibility(View.INVISIBLE);
					
					nobutton40.setVisibility(View.INVISIBLE);
					
					q40.setVisibility(View.INVISIBLE);
					yesbutton201.setVisibility(View.VISIBLE);
					
					nobutton201.setVisibility(View.VISIBLE);
					 sp.play(music, 1, 1, 0, 0, 1);
					q201.setVisibility(View.VISIBLE);
				
				}

				});	
yesbutton41.setOnClickListener(new Button.OnClickListener(){	
	public void onClick(View v1) {
		// TODO Auto-generated method stub
		
		yesbutton41.setVisibility(View.INVISIBLE);
		
		nobutton41.setVisibility(View.INVISIBLE);
		
		q41.setVisibility(View.INVISIBLE);
		 sp.play(musicwin, 1, 1, 0, 0, 1);
		LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.turtle, null);
        AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
        builder2.setView(view);
        builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
            
            @Override
                    public void onClick(DialogInterface dialog, int which) {

                     // TODO Auto-generated method stub
            		 sorry.setVisibility(View.VISIBLE);
            		 face2.setVisibility(View.INVISIBLE);
            		 sp.play(music, 1, 1, 0, 0, 1);
            		 retry.setVisibility(View.VISIBLE);
            			pause.setVisibility(View.INVISIBLE);
                 	 dialog.cancel();}

                 }).setPositiveButton("YES", new DialogInterface.OnClickListener() {

   @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
	   bingo.setVisibility(View.VISIBLE);
		 face2.setVisibility(View.INVISIBLE);
		 sp.play(music, 1, 1, 0, 0, 1);
		 retry.setVisibility(View.VISIBLE);
			pause.setVisibility(View.INVISIBLE);
                dialog.cancel();
            }
        }).create().show();
	
	}
});
	
nobutton41.setOnClickListener(new Button.OnClickListener(){	
		public void onClick(View v1) {
			// TODO Auto-generated method stub
			yesbutton41.setVisibility(View.INVISIBLE);
			yesbutton46.setVisibility(View.VISIBLE);
			nobutton41.setVisibility(View.INVISIBLE);
			nobutton46.setVisibility(View.VISIBLE);
			q41.setVisibility(View.INVISIBLE);
			q46.setVisibility(View.VISIBLE);
			 sp.play(music, 1, 1, 0, 0, 1);
		}

		});	
yesbutton42.setOnClickListener(new Button.OnClickListener(){	
	public void onClick(View v1) {
		// TODO Auto-generated method stub
		
		yesbutton42.setVisibility(View.INVISIBLE);
		retry.setVisibility(View.VISIBLE);
		pause.setVisibility(View.INVISIBLE);
		nobutton42.setVisibility(View.INVISIBLE);
		
		q42.setVisibility(View.INVISIBLE);
		 sp.play(musicwin, 1, 1, 0, 0, 1);
		LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.duck, null);
        AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
        builder2.setView(view);
        builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
            
            @Override
                    public void onClick(DialogInterface dialog, int which) {

                     // TODO Auto-generated method stub
            		 sorry.setVisibility(View.VISIBLE);
            		 face2.setVisibility(View.INVISIBLE);
            		 sp.play(music, 1, 1, 0, 0, 1);
                 	 dialog.cancel();}

                 }).setPositiveButton("YES", new DialogInterface.OnClickListener() {

   @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
	   bingo.setVisibility(View.VISIBLE);
		 face2.setVisibility(View.INVISIBLE);
		 sp.play(music, 1, 1, 0, 0, 1);
                dialog.cancel();
            }
        }).create().show();
	
	}
});
	
nobutton42.setOnClickListener(new Button.OnClickListener(){	
		public void onClick(View v1) {
			// TODO Auto-generated method stub
			yesbutton42.setVisibility(View.INVISIBLE);
			retry.setVisibility(View.VISIBLE);
			pause.setVisibility(View.INVISIBLE);
			nobutton42.setVisibility(View.INVISIBLE);
			
			q42.setVisibility(View.INVISIBLE);
			 sp.play(musicwin, 1, 1, 0, 0, 1);
			LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
            View view=inflater.inflate(R.layout.swan, null);
            AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
            builder2.setView(view);
            builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
                
                @Override
                        public void onClick(DialogInterface dialog, int which) {

	                        // TODO Auto-generated method stub
                		 sorry.setVisibility(View.VISIBLE);
                		 face2.setVisibility(View.INVISIBLE);
                		 sp.play(music, 1, 1, 0, 0, 1);
	                    	 dialog.cancel();}

                     }).setPositiveButton("YES", new DialogInterface.OnClickListener() {

       @Override
                public void onClick(DialogInterface dialog, int which) {
                    // TODO Auto-generated method stub
    	   bingo.setVisibility(View.VISIBLE);
    		 face2.setVisibility(View.INVISIBLE);
    		 sp.play(music, 1, 1, 0, 0, 1);
                    dialog.cancel();
                }
            }).create().show();
		}

		});	
yesbutton43.setOnClickListener(new Button.OnClickListener(){	
	public void onClick(View v1) {
		// TODO Auto-generated method stub
		
		yesbutton43.setVisibility(View.INVISIBLE);
		yesbutton47.setVisibility(View.VISIBLE);
		nobutton43.setVisibility(View.INVISIBLE);
		nobutton47.setVisibility(View.VISIBLE);
		q43.setVisibility(View.INVISIBLE);
		q47.setVisibility(View.VISIBLE);
		 sp.play(music, 1, 1, 0, 0, 1);
	
	}
});
	
nobutton43.setOnClickListener(new Button.OnClickListener(){	
		public void onClick(View v1) {
			// TODO Auto-generated method stub
			yesbutton43.setVisibility(View.INVISIBLE);
			yesbutton48.setVisibility(View.VISIBLE);
			nobutton43.setVisibility(View.INVISIBLE);
			nobutton48.setVisibility(View.VISIBLE);
			q43.setVisibility(View.INVISIBLE);
			q48.setVisibility(View.VISIBLE);
			 sp.play(music, 1, 1, 0, 0, 1);
		}

		});	
yesbutton44.setOnClickListener(new Button.OnClickListener(){	
	public void onClick(View v1) {
		// TODO Auto-generated method stub
		
		yesbutton44.setVisibility(View.INVISIBLE);
		retry.setVisibility(View.VISIBLE);
		pause.setVisibility(View.INVISIBLE);
		nobutton44.setVisibility(View.INVISIBLE);
		
		q44.setVisibility(View.INVISIBLE);
		 sp.play(musicwin, 1, 1, 0, 0, 1);
		LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.eel, null);
        AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
        builder2.setView(view);
        builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
            
            @Override
                    public void onClick(DialogInterface dialog, int which) {

                     // TODO Auto-generated method stub
            		 sorry.setVisibility(View.VISIBLE);
            		 face2.setVisibility(View.INVISIBLE);
            		 sp.play(music, 1, 1, 0, 0, 1);
                 	 dialog.cancel();}

                 }).setPositiveButton("YES", new DialogInterface.OnClickListener() {

   @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
	   bingo.setVisibility(View.VISIBLE);
		 face2.setVisibility(View.INVISIBLE);
		 sp.play(music, 1, 1, 0, 0, 1);
                dialog.cancel();
            }
        }).create().show();
	
	}
});
	
nobutton44.setOnClickListener(new Button.OnClickListener(){	
		public void onClick(View v1) {
			// TODO Auto-generated method stub
			yesbutton44.setVisibility(View.INVISIBLE);
			retry.setVisibility(View.VISIBLE);
			pause.setVisibility(View.INVISIBLE);
			nobutton44.setVisibility(View.INVISIBLE);
			
			q44.setVisibility(View.INVISIBLE);
			 sp.play(musicwin, 1, 1, 0, 0, 1);
			LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
            View view=inflater.inflate(R.layout.tuna, null);
            AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
            builder2.setView(view);
            builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
                
                @Override
                        public void onClick(DialogInterface dialog, int which) {

	                        // TODO Auto-generated method stub
                		 sorry.setVisibility(View.VISIBLE);
                		 face2.setVisibility(View.INVISIBLE);
                		 sp.play(music, 1, 1, 0, 0, 1);
	                    	 dialog.cancel();}

                     }).setPositiveButton("YES", new DialogInterface.OnClickListener() {

       @Override
                public void onClick(DialogInterface dialog, int which) {
                    // TODO Auto-generated method stub
    	   bingo.setVisibility(View.VISIBLE);
    		 face2.setVisibility(View.INVISIBLE);
    		 sp.play(music, 1, 1, 0, 0, 1);
                    dialog.cancel();
                }
            }).create().show();
		}

		});	
yesbutton45.setOnClickListener(new Button.OnClickListener(){	
	public void onClick(View v1) {
		// TODO Auto-generated method stub
		
		yesbutton45.setVisibility(View.INVISIBLE);
		retry.setVisibility(View.VISIBLE);
		pause.setVisibility(View.INVISIBLE);
		nobutton45.setVisibility(View.INVISIBLE);
		
		q45.setVisibility(View.INVISIBLE);
		 sp.play(musicwin, 1, 1, 0, 0, 1);
		LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.octopus, null);
        AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
        builder2.setView(view);
        builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
            
            @Override
                    public void onClick(DialogInterface dialog, int which) {

                     // TODO Auto-generated method stub
            		 sorry.setVisibility(View.VISIBLE);
            		 face2.setVisibility(View.INVISIBLE);
            		 sp.play(music, 1, 1, 0, 0, 1);
                 	 dialog.cancel();}

                 }).setPositiveButton("YES", new DialogInterface.OnClickListener() {

   @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
	   bingo.setVisibility(View.VISIBLE);
		 face2.setVisibility(View.INVISIBLE);
		 sp.play(music, 1, 1, 0, 0, 1);
                dialog.cancel();
            }
        }).create().show();
	
	}
});
	
nobutton45.setOnClickListener(new Button.OnClickListener(){	
		public void onClick(View v1) {
			// TODO Auto-generated method stub
			yesbutton45.setVisibility(View.INVISIBLE);
			retry.setVisibility(View.VISIBLE);
			pause.setVisibility(View.INVISIBLE);
			nobutton45.setVisibility(View.INVISIBLE);
			
			q45.setVisibility(View.INVISIBLE);
			 sp.play(musicwin, 1, 1, 0, 0, 1);
			LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
            View view=inflater.inflate(R.layout.starfish, null);
            AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
            builder2.setView(view);
            builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
                
                @Override
                        public void onClick(DialogInterface dialog, int which) {

	                        // TODO Auto-generated method stub
                		 sorry.setVisibility(View.VISIBLE);
                		 face2.setVisibility(View.INVISIBLE);
                		 sp.play(music, 1, 1, 0, 0, 1);
	                    	 dialog.cancel();}

                     }).setPositiveButton("YES", new DialogInterface.OnClickListener() {

       @Override
                public void onClick(DialogInterface dialog, int which) {
                    // TODO Auto-generated method stub
    	   bingo.setVisibility(View.VISIBLE);
    		 face2.setVisibility(View.INVISIBLE);
    		 sp.play(music, 1, 1, 0, 0, 1);
                    dialog.cancel();
                }
            }).create().show();
		}

		});	
yesbutton46.setOnClickListener(new Button.OnClickListener(){	
	public void onClick(View v1) {
		// TODO Auto-generated method stub
		
		yesbutton46.setVisibility(View.INVISIBLE);
		retry.setVisibility(View.VISIBLE);
		pause.setVisibility(View.INVISIBLE);
		nobutton46.setVisibility(View.INVISIBLE);
		
		q46.setVisibility(View.INVISIBLE);
		 sp.play(musicwin, 1, 1, 0, 0, 1);
		LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.crocodile, null);
        AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
        builder2.setView(view);
        builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
            
            @Override
                    public void onClick(DialogInterface dialog, int which) {

                     // TODO Auto-generated method stub
            		 sorry.setVisibility(View.VISIBLE);
            		 face2.setVisibility(View.INVISIBLE);
            		 sp.play(music, 1, 1, 0, 0, 1);
                 	 dialog.cancel();}

                 }).setPositiveButton("YES", new DialogInterface.OnClickListener() {

   @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
	   bingo.setVisibility(View.VISIBLE);
		 face2.setVisibility(View.INVISIBLE);
		 sp.play(music, 1, 1, 0, 0, 1);
                dialog.cancel();
            }
        }).create().show();
	
	}
});
	
nobutton46.setOnClickListener(new Button.OnClickListener(){	
		public void onClick(View v1) {
			// TODO Auto-generated method stub
			yesbutton46.setVisibility(View.INVISIBLE);
			retry.setVisibility(View.VISIBLE);
			pause.setVisibility(View.INVISIBLE);
			nobutton46.setVisibility(View.INVISIBLE);
			
			q46.setVisibility(View.INVISIBLE);
			 sp.play(musicwin, 1, 1, 0, 0, 1);
			LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
            View view=inflater.inflate(R.layout.frog, null);
            AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
            builder2.setView(view);
            builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
                
                @Override
                        public void onClick(DialogInterface dialog, int which) {

	                        // TODO Auto-generated method stub
                		 sorry.setVisibility(View.VISIBLE);
                		 face2.setVisibility(View.INVISIBLE);
                		 sp.play(music, 1, 1, 0, 0, 1);
	                    	 dialog.cancel();}

                     }).setPositiveButton("YES", new DialogInterface.OnClickListener() {

       @Override
                public void onClick(DialogInterface dialog, int which) {
                    // TODO Auto-generated method stub
    	   bingo.setVisibility(View.VISIBLE);
    		 face2.setVisibility(View.INVISIBLE);
    		 sp.play(music, 1, 1, 0, 0, 1);
                    dialog.cancel();
                }
            }).create().show();
		}

		});	
yesbutton47.setOnClickListener(new Button.OnClickListener(){	
	public void onClick(View v1) {
		// TODO Auto-generated method stub
		
		yesbutton47.setVisibility(View.INVISIBLE);
		retry.setVisibility(View.VISIBLE);
		pause.setVisibility(View.INVISIBLE);
		nobutton47.setVisibility(View.INVISIBLE);
		
		q47.setVisibility(View.INVISIBLE);
		 sp.play(musicwin, 1, 1, 0, 0, 1);
		LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.crab, null);
        AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
        builder2.setView(view);
        builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
            
            @Override
                    public void onClick(DialogInterface dialog, int which) {

                     // TODO Auto-generated method stub
            		 sorry.setVisibility(View.VISIBLE);
            		 face2.setVisibility(View.INVISIBLE);
            		 sp.play(music, 1, 1, 0, 0, 1);
                 	 dialog.cancel();}

                 }).setPositiveButton("YES", new DialogInterface.OnClickListener() {

   @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
	   bingo.setVisibility(View.VISIBLE);
		 face2.setVisibility(View.INVISIBLE);
		 sp.play(music, 1, 1, 0, 0, 1);
                dialog.cancel();
            }
        }).create().show();
	
	}
});
	
nobutton47.setOnClickListener(new Button.OnClickListener(){	
		public void onClick(View v1) {
			// TODO Auto-generated method stub
			yesbutton47.setVisibility(View.INVISIBLE);
			retry.setVisibility(View.VISIBLE);
			pause.setVisibility(View.INVISIBLE);
			nobutton47.setVisibility(View.INVISIBLE);
			
			q47.setVisibility(View.INVISIBLE);
			 sp.play(musicwin, 1, 1, 0, 0, 1);
			LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
            View view=inflater.inflate(R.layout.lobster, null);
            AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
            builder2.setView(view);
            builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
                
                @Override
                        public void onClick(DialogInterface dialog, int which) {

	                        // TODO Auto-generated method stub
                		 sorry.setVisibility(View.VISIBLE);
                		 face2.setVisibility(View.INVISIBLE);
                		 sp.play(music, 1, 1, 0, 0, 1);
	                    	 dialog.cancel();}

                     }).setPositiveButton("YES", new DialogInterface.OnClickListener() {

       @Override
                public void onClick(DialogInterface dialog, int which) {
                    // TODO Auto-generated method stub
    	   bingo.setVisibility(View.VISIBLE);
    		 face2.setVisibility(View.INVISIBLE);
    		 sp.play(music, 1, 1, 0, 0, 1);
                    dialog.cancel();
                }
            }).create().show();
		}

		});	
yesbutton48.setOnClickListener(new Button.OnClickListener(){	
	public void onClick(View v1) {
		// TODO Auto-generated method stub
		
		yesbutton48.setVisibility(View.INVISIBLE);
		retry.setVisibility(View.VISIBLE);
		pause.setVisibility(View.INVISIBLE);
		nobutton48.setVisibility(View.INVISIBLE);
		
		q48.setVisibility(View.INVISIBLE);
		 sp.play(musicwin, 1, 1, 0, 0, 1);
		LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.penguin, null);
        AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
        builder2.setView(view);
        builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
            
            @Override
                    public void onClick(DialogInterface dialog, int which) {

                     // TODO Auto-generated method stub
            		 sorry.setVisibility(View.VISIBLE);
            		 face2.setVisibility(View.INVISIBLE);
            		 sp.play(music, 1, 1, 0, 0, 1);
                 	 dialog.cancel();}

                 }).setPositiveButton("YES", new DialogInterface.OnClickListener() {

   @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
	   bingo.setVisibility(View.VISIBLE);
		 face2.setVisibility(View.INVISIBLE);
		 sp.play(music, 1, 1, 0, 0, 1);
                dialog.cancel();
            }
        }).create().show();
	
	}
});
	
nobutton48.setOnClickListener(new Button.OnClickListener(){	
		public void onClick(View v1) {
			// TODO Auto-generated method stub
			yesbutton48.setVisibility(View.INVISIBLE);
			retry.setVisibility(View.VISIBLE);
			pause.setVisibility(View.INVISIBLE);
			nobutton48.setVisibility(View.INVISIBLE);
			
			q48.setVisibility(View.INVISIBLE);
			 sp.play(musicwin, 1, 1, 0, 0, 1);
			 LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
             View view=inflater.inflate(R.layout.seal, null);
             AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
             builder2.setView(view);
             builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
                 
                 @Override
                         public void onClick(DialogInterface dialog, int which) {

	                        // TODO Auto-generated method stub
                 		 sorry.setVisibility(View.VISIBLE);
                 		 face2.setVisibility(View.INVISIBLE);
                 		 sp.play(music, 1, 1, 0, 0, 1);
	                    	 dialog.cancel();}

                      }).setPositiveButton("YES", new DialogInterface.OnClickListener() {

        @Override
                 public void onClick(DialogInterface dialog, int which) {
                     // TODO Auto-generated method stub
     	   bingo.setVisibility(View.VISIBLE);
     		 face2.setVisibility(View.INVISIBLE);
     		 sp.play(music, 1, 1, 0, 0, 1);
                     dialog.cancel();
                 }
             }).create().show();
		}

		});	

yesbutton101.setOnClickListener(new Button.OnClickListener(){	
	public void onClick(View v1) {
		// TODO Auto-generated method stub
		
		yesbutton101.setVisibility(View.INVISIBLE);
		yesbutton102.setVisibility(View.VISIBLE);
		nobutton101.setVisibility(View.INVISIBLE);
		nobutton102.setVisibility(View.VISIBLE);
		q101.setVisibility(View.INVISIBLE);
		q102.setVisibility(View.VISIBLE);
		 sp.play(music, 1, 1, 0, 0, 1);
	}
});
	
	nobutton101.setOnClickListener(new Button.OnClickListener(){	
		public void onClick(View v1) {
			// TODO Auto-generated method stub
			yesbutton101.setVisibility(View.INVISIBLE);
			yesbutton105.setVisibility(View.VISIBLE);
			nobutton101.setVisibility(View.INVISIBLE);
			nobutton105.setVisibility(View.VISIBLE);
			q101.setVisibility(View.INVISIBLE);
			q105.setVisibility(View.VISIBLE);
			 sp.play(music, 1, 1, 0, 0, 1);
		}

		});	
	yesbutton102.setOnClickListener(new Button.OnClickListener(){	
		public void onClick(View v1) {
			// TODO Auto-generated method stub
			
			yesbutton102.setVisibility(View.INVISIBLE);
			yesbutton103.setVisibility(View.VISIBLE);
			nobutton102.setVisibility(View.INVISIBLE);
			nobutton103.setVisibility(View.VISIBLE);
			q102.setVisibility(View.INVISIBLE);
			q103.setVisibility(View.VISIBLE);
			 sp.play(music, 1, 1, 0, 0, 1);
			 face1.setVisibility(View.INVISIBLE);
				face2.setVisibility(View.VISIBLE);
		}
	});
		
		nobutton102.setOnClickListener(new Button.OnClickListener(){	
			public void onClick(View v1) {
				// TODO Auto-generated method stub
				yesbutton102.setVisibility(View.INVISIBLE);
				yesbutton108.setVisibility(View.VISIBLE);
				nobutton102.setVisibility(View.INVISIBLE);
				nobutton108.setVisibility(View.VISIBLE);
				q102.setVisibility(View.INVISIBLE);
				q108.setVisibility(View.VISIBLE);
				 sp.play(music, 1, 1, 0, 0, 1);
				 face1.setVisibility(View.INVISIBLE);
					face2.setVisibility(View.VISIBLE);
			}

			});	
		yesbutton103.setOnClickListener(new Button.OnClickListener(){	
			public void onClick(View v1) {
				// TODO Auto-generated method stub
				
				yesbutton103.setVisibility(View.INVISIBLE);
				yesbutton117.setVisibility(View.VISIBLE);
				nobutton103.setVisibility(View.INVISIBLE);
				nobutton117.setVisibility(View.VISIBLE);
				q103.setVisibility(View.INVISIBLE);
				q117.setVisibility(View.VISIBLE);
				 sp.play(music, 1, 1, 0, 0, 1);
			}
		});
			
			nobutton103.setOnClickListener(new Button.OnClickListener(){	
				public void onClick(View v1) {
					// TODO Auto-generated method stub
					yesbutton103.setVisibility(View.INVISIBLE);
					yesbutton104.setVisibility(View.VISIBLE);
					nobutton103.setVisibility(View.INVISIBLE);
					nobutton104.setVisibility(View.VISIBLE);
					q103.setVisibility(View.INVISIBLE);
					q104.setVisibility(View.VISIBLE);
					 sp.play(music, 1, 1, 0, 0, 1);
				}

				});	
			yesbutton104.setOnClickListener(new Button.OnClickListener(){	
				public void onClick(View v1) {
					// TODO Auto-generated method stub
					
					yesbutton104.setVisibility(View.INVISIBLE);
					yesbutton129.setVisibility(View.VISIBLE);
					nobutton104.setVisibility(View.INVISIBLE);
					nobutton129.setVisibility(View.VISIBLE);
					q104.setVisibility(View.INVISIBLE);
					q129.setVisibility(View.VISIBLE);
					 sp.play(music, 1, 1, 0, 0, 1);
				}
			});
				
				nobutton104.setOnClickListener(new Button.OnClickListener(){	
					public void onClick(View v1) {
						// TODO Auto-generated method stub
						yesbutton104.setVisibility(View.INVISIBLE);
						yesbutton121.setVisibility(View.VISIBLE);
						nobutton104.setVisibility(View.INVISIBLE);
						nobutton121.setVisibility(View.VISIBLE);
						q104.setVisibility(View.INVISIBLE);
						q121.setVisibility(View.VISIBLE);
						 sp.play(music, 1, 1, 0, 0, 1);
					}

					});	
				yesbutton105.setOnClickListener(new Button.OnClickListener(){	
					public void onClick(View v1) {
						// TODO Auto-generated method stub
						
						yesbutton105.setVisibility(View.INVISIBLE);
						yesbutton106.setVisibility(View.VISIBLE);
						nobutton105.setVisibility(View.INVISIBLE);
						nobutton106.setVisibility(View.VISIBLE);
						q105.setVisibility(View.INVISIBLE);
						q106.setVisibility(View.VISIBLE);
						 sp.play(music, 1, 1, 0, 0, 1);
						 face1.setVisibility(View.INVISIBLE);
							face2.setVisibility(View.VISIBLE);
					}
				});
					
					nobutton105.setOnClickListener(new Button.OnClickListener(){	
						public void onClick(View v1) {
							// TODO Auto-generated method stub
							yesbutton105.setVisibility(View.INVISIBLE);
							yesbutton109.setVisibility(View.VISIBLE);
							nobutton105.setVisibility(View.INVISIBLE);
							nobutton109.setVisibility(View.VISIBLE);
							q105.setVisibility(View.INVISIBLE);
							q109.setVisibility(View.VISIBLE);
							 sp.play(music, 1, 1, 0, 0, 1);
							 face1.setVisibility(View.INVISIBLE);
								face2.setVisibility(View.VISIBLE);
						}

						});	
				yesbutton106.setOnClickListener(new Button.OnClickListener(){	
						public void onClick(View v1) {
							// TODO Auto-generated method stub
							
							yesbutton106.setVisibility(View.INVISIBLE);
							yesbutton114.setVisibility(View.VISIBLE);
							nobutton106.setVisibility(View.INVISIBLE);
							nobutton114.setVisibility(View.VISIBLE);
							q106.setVisibility(View.INVISIBLE);
							q114.setVisibility(View.VISIBLE);
							 sp.play(music, 1, 1, 0, 0, 1);
						}
					});
						
					nobutton106.setOnClickListener(new Button.OnClickListener(){	
							public void onClick(View v1) {
								// TODO Auto-generated method stub
								yesbutton106.setVisibility(View.INVISIBLE);
								yesbutton115.setVisibility(View.VISIBLE);
								nobutton106.setVisibility(View.INVISIBLE);
								nobutton115.setVisibility(View.VISIBLE);
								q106.setVisibility(View.INVISIBLE);
								q115.setVisibility(View.VISIBLE);
								 sp.play(music, 1, 1, 0, 0, 1);
							}

							});	
					yesbutton107.setOnClickListener(new Button.OnClickListener(){	
						public void onClick(View v1) {
							// TODO Auto-generated method stub
							
							yesbutton107.setVisibility(View.INVISIBLE);
							yesbutton108.setVisibility(View.VISIBLE);
							nobutton107.setVisibility(View.INVISIBLE);
							nobutton108.setVisibility(View.VISIBLE);
							q107.setVisibility(View.INVISIBLE);
							q108.setVisibility(View.VISIBLE);
							 sp.play(music, 1, 1, 0, 0, 1);
						}
					});
						
					nobutton107.setOnClickListener(new Button.OnClickListener(){	
							public void onClick(View v1) {
								// TODO Auto-generated method stub
								yesbutton107.setVisibility(View.INVISIBLE);
								yesbutton109.setVisibility(View.VISIBLE);
								nobutton107.setVisibility(View.INVISIBLE);
								nobutton109.setVisibility(View.VISIBLE);
								q107.setVisibility(View.INVISIBLE);
								q109.setVisibility(View.VISIBLE);
								 sp.play(music, 1, 1, 0, 0, 1);
							}

							});	
					yesbutton108.setOnClickListener(new Button.OnClickListener(){	
						public void onClick(View v1) {
							// TODO Auto-generated method stub
							
							yesbutton108.setVisibility(View.INVISIBLE);
							yesbutton116.setVisibility(View.VISIBLE);
							nobutton108.setVisibility(View.INVISIBLE);
							nobutton116.setVisibility(View.VISIBLE);
							q108.setVisibility(View.INVISIBLE);
							q116.setVisibility(View.VISIBLE);
							 sp.play(music, 1, 1, 0, 0, 1);
						}
					});
						
					nobutton108.setOnClickListener(new Button.OnClickListener(){	
							public void onClick(View v1) {
								// TODO Auto-generated method stub
								yesbutton108.setVisibility(View.INVISIBLE);
								yesbutton111.setVisibility(View.VISIBLE);
								nobutton108.setVisibility(View.INVISIBLE);
								nobutton111.setVisibility(View.VISIBLE);
								q108.setVisibility(View.INVISIBLE);
								q111.setVisibility(View.VISIBLE);
								 sp.play(music, 1, 1, 0, 0, 1);
							}

							});	
					yesbutton109.setOnClickListener(new Button.OnClickListener(){	
						public void onClick(View v1) {
							// TODO Auto-generated method stub
							
							yesbutton109.setVisibility(View.INVISIBLE);
							
							nobutton109.setVisibility(View.INVISIBLE);
							
							q109.setVisibility(View.INVISIBLE);
							yesbutton128.setVisibility(View.VISIBLE);
							
							nobutton128.setVisibility(View.VISIBLE);
							
							q128.setVisibility(View.VISIBLE);
							 sp.play(music, 1, 1, 0, 0, 1);
						
						}
					});
						
					nobutton109.setOnClickListener(new Button.OnClickListener(){	
							public void onClick(View v1) {
								// TODO Auto-generated method stub
								yesbutton109.setVisibility(View.INVISIBLE);
								yesbutton110.setVisibility(View.VISIBLE);
								nobutton109.setVisibility(View.INVISIBLE);
								nobutton110.setVisibility(View.VISIBLE);
								q109.setVisibility(View.INVISIBLE);
								q110.setVisibility(View.VISIBLE);
								 sp.play(music, 1, 1, 0, 0, 1);
							}

							});	
					yesbutton110.setOnClickListener(new Button.OnClickListener(){	
						public void onClick(View v1) {
							// TODO Auto-generated method stub
							
							yesbutton110.setVisibility(View.INVISIBLE);
						
							nobutton110.setVisibility(View.INVISIBLE);
							
							q110.setVisibility(View.INVISIBLE);
							yesbutton127.setVisibility(View.VISIBLE);
							
							nobutton127.setVisibility(View.VISIBLE);
							
							q127.setVisibility(View.VISIBLE);
							 sp.play(music, 1, 1, 0, 0, 1);
						
						}
					});
						
					nobutton110.setOnClickListener(new Button.OnClickListener(){	
							public void onClick(View v1) {
								// TODO Auto-generated method stub
								yesbutton110.setVisibility(View.INVISIBLE);
								yesbutton118.setVisibility(View.VISIBLE);
								nobutton110.setVisibility(View.INVISIBLE);
								nobutton118.setVisibility(View.VISIBLE);
								q110.setVisibility(View.INVISIBLE);
								q118.setVisibility(View.VISIBLE);
								 sp.play(music, 1, 1, 0, 0, 1);
							}

							});	
					yesbutton111.setOnClickListener(new Button.OnClickListener(){	
						public void onClick(View v1) {
							// TODO Auto-generated method stub
							
							yesbutton111.setVisibility(View.INVISIBLE);
						
							nobutton111.setVisibility(View.INVISIBLE);
							
							q111.setVisibility(View.INVISIBLE);
							yesbutton122.setVisibility(View.VISIBLE);
							
							nobutton122.setVisibility(View.VISIBLE);
							
							q122.setVisibility(View.VISIBLE);
							 sp.play(music, 1, 1, 0, 0, 1);
						}
					});
						
					nobutton111.setOnClickListener(new Button.OnClickListener(){	
							public void onClick(View v1) {
								// TODO Auto-generated method stub
								yesbutton111.setVisibility(View.INVISIBLE);
								yesbutton112.setVisibility(View.VISIBLE);
								nobutton111.setVisibility(View.INVISIBLE);
								nobutton112.setVisibility(View.VISIBLE);
								q111.setVisibility(View.INVISIBLE);
								q112.setVisibility(View.VISIBLE);
								 sp.play(music, 1, 1, 0, 0, 1);
							}

							});	
					yesbutton112.setOnClickListener(new Button.OnClickListener(){	
						public void onClick(View v1) {
							// TODO Auto-generated method stub
							
							yesbutton112.setVisibility(View.INVISIBLE);
							yesbutton113.setVisibility(View.VISIBLE);
							nobutton112.setVisibility(View.INVISIBLE);
							nobutton113.setVisibility(View.VISIBLE);
							q112.setVisibility(View.INVISIBLE);
							q113.setVisibility(View.VISIBLE);
							 sp.play(music, 1, 1, 0, 0, 1);
						}
					});
						
					nobutton112.setOnClickListener(new Button.OnClickListener(){	
							public void onClick(View v1) {
								// TODO Auto-generated method stub
								yesbutton112.setVisibility(View.INVISIBLE);
								
								nobutton112.setVisibility(View.INVISIBLE);
								
								q112.setVisibility(View.INVISIBLE);
								yesbutton124.setVisibility(View.VISIBLE);
								
								nobutton124.setVisibility(View.VISIBLE);
								
								q124.setVisibility(View.VISIBLE);
								 sp.play(music, 1, 1, 0, 0, 1);
							}

							});	
					yesbutton113.setOnClickListener(new Button.OnClickListener(){	
						public void onClick(View v1) {
							// TODO Auto-generated method stub
							
							yesbutton113.setVisibility(View.INVISIBLE);
							retry.setVisibility(View.VISIBLE);
							pause.setVisibility(View.INVISIBLE);
							nobutton113.setVisibility(View.INVISIBLE);
							
							q113.setVisibility(View.INVISIBLE);
							 sp.play(musicwin, 1, 1, 0, 0, 1);
							LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
		                    View view=inflater.inflate(R.layout.crow, null);
		                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
		                    builder2.setView(view);
		                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
		                        
		                        @Override
		                                public void onClick(DialogInterface dialog, int which) {

		 		                        // TODO Auto-generated method stub
		                        		 sorry.setVisibility(View.VISIBLE);
		                        		 face2.setVisibility(View.INVISIBLE);
		                        		 sp.play(music, 1, 1, 0, 0, 1);
		 		                    	 dialog.cancel();}

		                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
		      
		               @Override
		                        public void onClick(DialogInterface dialog, int which) {
		                            // TODO Auto-generated method stub
		            	   bingo.setVisibility(View.VISIBLE);
		            		 face2.setVisibility(View.INVISIBLE);
		            		 sp.play(music, 1, 1, 0, 0, 1);
		                            dialog.cancel();
		                        }
		                    }).create().show();
						
						}
					});
						
					nobutton113.setOnClickListener(new Button.OnClickListener(){	
							public void onClick(View v1) {
								// TODO Auto-generated method stub
								yesbutton113.setVisibility(View.INVISIBLE);
								retry.setVisibility(View.VISIBLE);
								pause.setVisibility(View.INVISIBLE);
								nobutton113.setVisibility(View.INVISIBLE);
								 sp.play(musicwin, 1, 1, 0, 0, 1);
								q113.setVisibility(View.INVISIBLE);
								LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
			                    View view=inflater.inflate(R.layout.hawkeagle, null);
			                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
			                    builder2.setView(view);
			                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
			                        
			                        @Override
			                                public void onClick(DialogInterface dialog, int which) {

			 		                        // TODO Auto-generated method stub
			                        		 sorry.setVisibility(View.VISIBLE);
			                        		 face2.setVisibility(View.INVISIBLE);
			                        		 sp.play(music, 1, 1, 0, 0, 1);
			 		                    	 dialog.cancel();}

			                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
			      
			               @Override
			                        public void onClick(DialogInterface dialog, int which) {
			                            // TODO Auto-generated method stub
			            	   bingo.setVisibility(View.VISIBLE);
			            		 face2.setVisibility(View.INVISIBLE);
			            		 sp.play(music, 1, 1, 0, 0, 1);
			                            dialog.cancel();
			                        }
			                    }).create().show();
								 sp.play(music, 1, 1, 0, 0, 1);
							}

							});	
					yesbutton114.setOnClickListener(new Button.OnClickListener(){	
						public void onClick(View v1) {
							// TODO Auto-generated method stub
							
							yesbutton114.setVisibility(View.INVISIBLE);
							retry.setVisibility(View.VISIBLE);
							pause.setVisibility(View.INVISIBLE);
							nobutton114.setVisibility(View.INVISIBLE);
							
							q114.setVisibility(View.INVISIBLE);
							 sp.play(musicwin, 1, 1, 0, 0, 1);
							LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
		                    View view=inflater.inflate(R.layout.cockroach, null);
		                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
		                    builder2.setView(view);
		                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
		                        
		                        @Override
		                                public void onClick(DialogInterface dialog, int which) {

		 		                        // TODO Auto-generated method stub
		                        		 sorry.setVisibility(View.VISIBLE);
		                        		 face2.setVisibility(View.INVISIBLE);
		                        		 sp.play(music, 1, 1, 0, 0, 1);
		 		                    	 dialog.cancel();}

		                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
		      
		               @Override
		                        public void onClick(DialogInterface dialog, int which) {
		                            // TODO Auto-generated method stub
		            	   bingo.setVisibility(View.VISIBLE);
		            		 face2.setVisibility(View.INVISIBLE);
		            		 sp.play(music, 1, 1, 0, 0, 1);
		                            dialog.cancel();
		                        }
		                    }).create().show();
						}
					});
						
					nobutton114.setOnClickListener(new Button.OnClickListener(){	
							public void onClick(View v1) {
								// TODO Auto-generated method stub
								yesbutton114.setVisibility(View.INVISIBLE);
								retry.setVisibility(View.VISIBLE);
								pause.setVisibility(View.INVISIBLE);
								nobutton114.setVisibility(View.INVISIBLE);
								
								q114.setVisibility(View.INVISIBLE);
								 sp.play(musicwin, 1, 1, 0, 0, 1);
								LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
			                    View view=inflater.inflate(R.layout.ant, null);
			                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
			                    builder2.setView(view);
			                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
			                        
			                        @Override
			                                public void onClick(DialogInterface dialog, int which) {

			 		                        // TODO Auto-generated method stub
			                        		 sorry.setVisibility(View.VISIBLE);
			                        		 face2.setVisibility(View.INVISIBLE);
			                        		 sp.play(music, 1, 1, 0, 0, 1);
			 		                    	 dialog.cancel();}

			                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
			      
			               @Override
			                        public void onClick(DialogInterface dialog, int which) {
			                            // TODO Auto-generated method stub
			            	   bingo.setVisibility(View.VISIBLE);
			            		 face2.setVisibility(View.INVISIBLE);
			            		 sp.play(music, 1, 1, 0, 0, 1);
			                            dialog.cancel();
			                        }
			                    }).create().show();
							}

							});	
					yesbutton115.setOnClickListener(new Button.OnClickListener(){	
						public void onClick(View v1) {
							// TODO Auto-generated method stub
							
							yesbutton115.setVisibility(View.INVISIBLE);
							retry.setVisibility(View.VISIBLE);
							pause.setVisibility(View.INVISIBLE);
							nobutton115.setVisibility(View.INVISIBLE);
							
							q115.setVisibility(View.INVISIBLE);
							 sp.play(musicwin, 1, 1, 0, 0, 1);
							LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
		                    View view=inflater.inflate(R.layout.spider, null);
		                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
		                    builder2.setView(view);
		                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
		                        
		                        @Override
		                                public void onClick(DialogInterface dialog, int which) {

		 		                        // TODO Auto-generated method stub
		                        		 sorry.setVisibility(View.VISIBLE);
		                        		 face2.setVisibility(View.INVISIBLE);
		                        		 sp.play(music, 1, 1, 0, 0, 1);
		 		                    	 dialog.cancel();}

		                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
		      
		               @Override
		                        public void onClick(DialogInterface dialog, int which) {
		                            // TODO Auto-generated method stub
		            	   bingo.setVisibility(View.VISIBLE);
		            		 face2.setVisibility(View.INVISIBLE);
		            		 sp.play(music, 1, 1, 0, 0, 1);
		                            dialog.cancel();
		                        }
		                    }).create().show();
						
						}
					});
						
					nobutton115.setOnClickListener(new Button.OnClickListener(){	
							public void onClick(View v1) {
								// TODO Auto-generated method stub
								yesbutton115.setVisibility(View.INVISIBLE);
								retry.setVisibility(View.VISIBLE);
								pause.setVisibility(View.INVISIBLE);
								nobutton115.setVisibility(View.INVISIBLE);
								
								q115.setVisibility(View.INVISIBLE);
								 sp.play(musicwin, 1, 1, 0, 0, 1);
								LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
			                    View view=inflater.inflate(R.layout.centipede, null);
			                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
			                    builder2.setView(view);
			                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
			                        
			                        @Override
			                                public void onClick(DialogInterface dialog, int which) {

			 		                        // TODO Auto-generated method stub
			                        		 sorry.setVisibility(View.VISIBLE);
			                        		 face2.setVisibility(View.INVISIBLE);
			                        		 sp.play(music, 1, 1, 0, 0, 1);
			 		                    	 dialog.cancel();}

			                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
			      
			               @Override
			                        public void onClick(DialogInterface dialog, int which) {
			                            // TODO Auto-generated method stub
			            	   bingo.setVisibility(View.VISIBLE);
			            		 face2.setVisibility(View.INVISIBLE);
			            		 sp.play(music, 1, 1, 0, 0, 1);
			                            dialog.cancel();
			                        }
			                    }).create().show();
							}

							});	
					yesbutton116.setOnClickListener(new Button.OnClickListener(){	
						public void onClick(View v1) {
							// TODO Auto-generated method stub
							
							yesbutton116.setVisibility(View.INVISIBLE);
							retry.setVisibility(View.VISIBLE);
							pause.setVisibility(View.INVISIBLE);
							nobutton116.setVisibility(View.INVISIBLE);
							
							q116.setVisibility(View.INVISIBLE);
							 sp.play(musicwin, 1, 1, 0, 0, 1);
							LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
		                    View view=inflater.inflate(R.layout.bat, null);
		                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
		                    builder2.setView(view);
		                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
		                        
		                        @Override
		                                public void onClick(DialogInterface dialog, int which) {

		 		                        // TODO Auto-generated method stub
		                        		 sorry.setVisibility(View.VISIBLE);
		                        		 face2.setVisibility(View.INVISIBLE);
		                        		 sp.play(music, 1, 1, 0, 0, 1);
		 		                    	 dialog.cancel();}

		                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
		      
		               @Override
		                        public void onClick(DialogInterface dialog, int which) {
		                            // TODO Auto-generated method stub
		            	   bingo.setVisibility(View.VISIBLE);
		            		 face2.setVisibility(View.INVISIBLE);
		            		 sp.play(music, 1, 1, 0, 0, 1);
		                            dialog.cancel();
		                        }
		                    }).create().show();
						
						}
					});
						
					nobutton116.setOnClickListener(new Button.OnClickListener(){	
							public void onClick(View v1) {
								// TODO Auto-generated method stub
								yesbutton116.setVisibility(View.INVISIBLE);
								retry.setVisibility(View.VISIBLE);
								pause.setVisibility(View.INVISIBLE);
								nobutton116.setVisibility(View.INVISIBLE);
								
								q116.setVisibility(View.INVISIBLE);
								 sp.play(musicwin, 1, 1, 0, 0, 1);
								LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
			                    View view=inflater.inflate(R.layout.owl, null);
			                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
			                    builder2.setView(view);
			                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
			                        
			                        @Override
			                                public void onClick(DialogInterface dialog, int which) {

			 		                        // TODO Auto-generated method stub
			                        		 sorry.setVisibility(View.VISIBLE);
			                        		 face2.setVisibility(View.INVISIBLE);
			                        		 sp.play(music, 1, 1, 0, 0, 1);
			 		                    	 dialog.cancel();}

			                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
			      
			               @Override
			                        public void onClick(DialogInterface dialog, int which) {
			                            // TODO Auto-generated method stub
			            	   bingo.setVisibility(View.VISIBLE);
			            		 face2.setVisibility(View.INVISIBLE);
			            		 sp.play(music, 1, 1, 0, 0, 1);
			                            dialog.cancel();
			                        }
			                    }).create().show();
							}

							});	
					yesbutton117.setOnClickListener(new Button.OnClickListener(){	
						public void onClick(View v1) {
							// TODO Auto-generated method stub
							
							yesbutton117.setVisibility(View.INVISIBLE);
							retry.setVisibility(View.VISIBLE);
							pause.setVisibility(View.INVISIBLE);
							nobutton117.setVisibility(View.INVISIBLE);
							
							q117.setVisibility(View.INVISIBLE);
							 sp.play(musicwin, 1, 1, 0, 0, 1);
							LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
		                    View view=inflater.inflate(R.layout.mosquito, null);
		                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
		                    builder2.setView(view);
		                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
		                        
		                        @Override
		                                public void onClick(DialogInterface dialog, int which) {

		 		                        // TODO Auto-generated method stub
		                        		 sorry.setVisibility(View.VISIBLE);
		                        		 face2.setVisibility(View.INVISIBLE);
		                        		 sp.play(music, 1, 1, 0, 0, 1);
		 		                    	 dialog.cancel();}

		                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
		      
		               @Override
		                        public void onClick(DialogInterface dialog, int which) {
		                            // TODO Auto-generated method stub
		            	   bingo.setVisibility(View.VISIBLE);
		            		 face2.setVisibility(View.INVISIBLE);
		            		 sp.play(music, 1, 1, 0, 0, 1);
		                            dialog.cancel();
		                        }
		                    }).create().show();
						
						}
					});
						
					nobutton117.setOnClickListener(new Button.OnClickListener(){	
							public void onClick(View v1) {
								// TODO Auto-generated method stub
								yesbutton117.setVisibility(View.INVISIBLE);
								retry.setVisibility(View.VISIBLE);
								pause.setVisibility(View.INVISIBLE);
								nobutton117.setVisibility(View.INVISIBLE);
								 sp.play(musicwin, 1, 1, 0, 0, 1);
								q117.setVisibility(View.INVISIBLE);
								LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
			                    View view=inflater.inflate(R.layout.beewasp, null);
			                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
			                    builder2.setView(view);
			                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
			                        
			                        @Override
			                                public void onClick(DialogInterface dialog, int which) {

			 		                        // TODO Auto-generated method stub
			                        		 sorry.setVisibility(View.VISIBLE);
			                        		 face2.setVisibility(View.INVISIBLE);
			                        		 sp.play(music, 1, 1, 0, 0, 1);
			 		                    	 dialog.cancel();}

			                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
			      
			               @Override
			                        public void onClick(DialogInterface dialog, int which) {
			                            // TODO Auto-generated method stub
			            	   bingo.setVisibility(View.VISIBLE);
			            		 face2.setVisibility(View.INVISIBLE);
			            		 sp.play(music, 1, 1, 0, 0, 1);
			                            dialog.cancel();
			                        }
			                    }).create().show();
								 sp.play(music, 1, 1, 0, 0, 1);
							}

							});	
					
					yesbutton118.setOnClickListener(new Button.OnClickListener(){	
						public void onClick(View v1) {
							// TODO Auto-generated method stub
							
							yesbutton118.setVisibility(View.INVISIBLE);
							retry.setVisibility(View.VISIBLE);
							pause.setVisibility(View.INVISIBLE);
							nobutton118.setVisibility(View.INVISIBLE);
							
							q118.setVisibility(View.INVISIBLE);
							 sp.play(musicwin, 1, 1, 0, 0, 1);
							LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
		                    View view=inflater.inflate(R.layout.pig, null);
		                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
		                    builder2.setView(view);
		                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
		                        
		                        @Override
		                                public void onClick(DialogInterface dialog, int which) {

		 		                        // TODO Auto-generated method stub
		                        		 sorry.setVisibility(View.VISIBLE);
		                        		 face2.setVisibility(View.INVISIBLE);
		                        		 sp.play(music, 1, 1, 0, 0, 1);
		                        		 retry.setVisibility(View.VISIBLE);
		     							pause.setVisibility(View.INVISIBLE);
		 		                    	 dialog.cancel();}

		                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
		      
		               @Override
		                        public void onClick(DialogInterface dialog, int which) {
		                            // TODO Auto-generated method stub
		            	   bingo.setVisibility(View.VISIBLE);
		            		 face2.setVisibility(View.INVISIBLE);
		            		 sp.play(music, 1, 1, 0, 0, 1);
		            		 retry.setVisibility(View.VISIBLE);
								pause.setVisibility(View.INVISIBLE);
		                            dialog.cancel();
		                        }
		                    }).create().show();
						
						}
					});
						
					nobutton118.setOnClickListener(new Button.OnClickListener(){	
							public void onClick(View v1) {
								// TODO Auto-generated method stub
								yesbutton118.setVisibility(View.INVISIBLE);
								
								nobutton118.setVisibility(View.INVISIBLE);
								
								q118.setVisibility(View.INVISIBLE);
								yesbutton126.setVisibility(View.VISIBLE);
								
								nobutton126.setVisibility(View.VISIBLE);
								
								q126.setVisibility(View.VISIBLE);
								 sp.play(music, 1, 1, 0, 0, 1);
							}

							});	
					
					
					 yesbutton119.setOnClickListener(new Button.OnClickListener(){	
							public void onClick(View v1) {
								// TODO Auto-generated method stub
								
								yesbutton119.setVisibility(View.INVISIBLE);
								retry.setVisibility(View.VISIBLE);
								pause.setVisibility(View.INVISIBLE);
								nobutton119.setVisibility(View.INVISIBLE);
								
								q119.setVisibility(View.INVISIBLE);
								 sp.play(musicwin, 1, 1, 0, 0, 1);
								LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
			                    View view=inflater.inflate(R.layout.firefly, null);
			                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
			                    builder2.setView(view);
			                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
			                        
			                        @Override
			                                public void onClick(DialogInterface dialog, int which) {

			 		                        // TODO Auto-generated method stub
			                        		 sorry.setVisibility(View.VISIBLE);
			                        		 face2.setVisibility(View.INVISIBLE);
			                        		 sp.play(music, 1, 1, 0, 0, 1);
			                        		 retry.setVisibility(View.VISIBLE);
			 								pause.setVisibility(View.INVISIBLE);
			 		                    	 dialog.cancel();}

			                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
			      
			               @Override
			                        public void onClick(DialogInterface dialog, int which) {
			                            // TODO Auto-generated method stub
			            	   bingo.setVisibility(View.VISIBLE);
			            		 face2.setVisibility(View.INVISIBLE);
			            		 sp.play(music, 1, 1, 0, 0, 1);
			            		 retry.setVisibility(View.VISIBLE);
									pause.setVisibility(View.INVISIBLE);
			                            dialog.cancel();
			                        }
			                    }).create().show();
								
							
							}
						});
							
nobutton119.setOnClickListener(new Button.OnClickListener(){	
								public void onClick(View v1) {
									// TODO Auto-generated method stub
									yesbutton119.setVisibility(View.INVISIBLE);
									yesbutton120.setVisibility(View.VISIBLE);
									nobutton119.setVisibility(View.INVISIBLE);
									nobutton120.setVisibility(View.VISIBLE);
									q119.setVisibility(View.INVISIBLE);
									q120.setVisibility(View.VISIBLE);
									 sp.play(music, 1, 1, 0, 0, 1);
								}

								});
							
							
yesbutton120.setOnClickListener(new Button.OnClickListener(){	
								public void onClick(View v1) {
									// TODO Auto-generated method stub
									
									yesbutton120.setVisibility(View.INVISIBLE);
									retry.setVisibility(View.VISIBLE);
									pause.setVisibility(View.INVISIBLE);
									nobutton120.setVisibility(View.INVISIBLE);
									
									q120.setVisibility(View.INVISIBLE);
									 sp.play(musicwin, 1, 1, 0, 0, 1);
									LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
				                    View view=inflater.inflate(R.layout.dragonfly, null);
				                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
				                    builder2.setView(view);
				                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
				                        
				                        @Override
				                                public void onClick(DialogInterface dialog, int which) {

				 		                        // TODO Auto-generated method stub
				                        		 sorry.setVisibility(View.VISIBLE);
				                        		 face2.setVisibility(View.INVISIBLE);
				                        		 sp.play(music, 1, 1, 0, 0, 1);
				 		                    	 dialog.cancel();}

				                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
				      
				               @Override
				                        public void onClick(DialogInterface dialog, int which) {
				                            // TODO Auto-generated method stub
				            	   bingo.setVisibility(View.VISIBLE);
				            		 face2.setVisibility(View.INVISIBLE);
				            		 sp.play(music, 1, 1, 0, 0, 1);
				                            dialog.cancel();
				                        }
				                    }).create().show();
								
								}
							});
								
nobutton120.setOnClickListener(new Button.OnClickListener(){	
									public void onClick(View v1) {
										// TODO Auto-generated method stub
										yesbutton120.setVisibility(View.INVISIBLE);
										retry.setVisibility(View.VISIBLE);
										pause.setVisibility(View.INVISIBLE);
										nobutton120.setVisibility(View.INVISIBLE);
										
										q120.setVisibility(View.INVISIBLE);
										 sp.play(musicwin, 1, 1, 0, 0, 1);
										LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
					                    View view=inflater.inflate(R.layout.butterfly, null);
					                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
					                    builder2.setView(view);
					                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
					                        
					                        @Override
					                                public void onClick(DialogInterface dialog, int which) {

					 		                        // TODO Auto-generated method stub
					                        		 sorry.setVisibility(View.VISIBLE);
					                        		 face2.setVisibility(View.INVISIBLE);
					                        		 sp.play(music, 1, 1, 0, 0, 1);
					 		                    	 dialog.cancel();}

					                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
					      
					               @Override
					                        public void onClick(DialogInterface dialog, int which) {
					                            // TODO Auto-generated method stub
					            	   bingo.setVisibility(View.VISIBLE);
					            		 face2.setVisibility(View.INVISIBLE);
					            		 sp.play(music, 1, 1, 0, 0, 1);
					                            dialog.cancel();
					                        }
					                    }).create().show();
									}

									});
								
yesbutton121.setOnClickListener(new Button.OnClickListener(){	
									public void onClick(View v1) {
										// TODO Auto-generated method stub
										
										yesbutton121.setVisibility(View.INVISIBLE);
										retry.setVisibility(View.VISIBLE);
										pause.setVisibility(View.INVISIBLE);
										nobutton121.setVisibility(View.INVISIBLE);
										
										q121.setVisibility(View.INVISIBLE);
										 sp.play(musicwin, 1, 1, 0, 0, 1);
										LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
					                    View view=inflater.inflate(R.layout.prayingmantis, null);
					                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
					                    builder2.setView(view);
					                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
					                        
					                        @Override
					                                public void onClick(DialogInterface dialog, int which) {

					 		                        // TODO Auto-generated method stub
					                        		 sorry.setVisibility(View.VISIBLE);
					                        		 face2.setVisibility(View.INVISIBLE);
					                        		 sp.play(music, 1, 1, 0, 0, 1);
					 		                    	 dialog.cancel();}

					                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
					      
					               @Override
					                        public void onClick(DialogInterface dialog, int which) {
					                            // TODO Auto-generated method stub
					            	   bingo.setVisibility(View.VISIBLE);
					            		 face2.setVisibility(View.INVISIBLE);
					            		 sp.play(music, 1, 1, 0, 0, 1);
					                            dialog.cancel();
					                        }
					                    }).create().show();
									
									}
								});
									
nobutton121.setOnClickListener(new Button.OnClickListener(){	
										public void onClick(View v1) {
											// TODO Auto-generated method stub
											yesbutton121.setVisibility(View.INVISIBLE);
											retry.setVisibility(View.VISIBLE);
											pause.setVisibility(View.INVISIBLE);
											nobutton121.setVisibility(View.INVISIBLE);
											
											q121.setVisibility(View.INVISIBLE);
											 sp.play(musicwin, 1, 1, 0, 0, 1);
											LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
						                    View view=inflater.inflate(R.layout.housefly, null);
						                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
						                    builder2.setView(view);
						                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
						                        
						                        @Override
						                                public void onClick(DialogInterface dialog, int which) {

						 		                        // TODO Auto-generated method stub
						                        		 sorry.setVisibility(View.VISIBLE);
						                        		 face2.setVisibility(View.INVISIBLE);
						                        		 sp.play(music, 1, 1, 0, 0, 1);
						 		                    	 dialog.cancel();}

						                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
						      
						               @Override
						                        public void onClick(DialogInterface dialog, int which) {
						                            // TODO Auto-generated method stub
						            	   bingo.setVisibility(View.VISIBLE);
						            		 face2.setVisibility(View.INVISIBLE);
						            		 sp.play(music, 1, 1, 0, 0, 1);
						                            dialog.cancel();
						                        }
						                    }).create().show();
										}

										});
									
yesbutton122.setOnClickListener(new Button.OnClickListener(){	
										public void onClick(View v1) {
											// TODO Auto-generated method stub
											
											yesbutton122.setVisibility(View.INVISIBLE);
											retry.setVisibility(View.VISIBLE);
											pause.setVisibility(View.INVISIBLE);
											nobutton122.setVisibility(View.INVISIBLE);
											
											q122.setVisibility(View.INVISIBLE);
											 sp.play(musicwin, 1, 1, 0, 0, 1);
											LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
						                    View view=inflater.inflate(R.layout.parrot, null);
						                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
						                    builder2.setView(view);
						                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
						                        
						                        @Override
						                                public void onClick(DialogInterface dialog, int which) {

						 		                        // TODO Auto-generated method stub
						                        		 sorry.setVisibility(View.VISIBLE);
						                        		 face2.setVisibility(View.INVISIBLE);
						                        		 sp.play(music, 1, 1, 0, 0, 1);
						                        			retry.setVisibility(View.VISIBLE);
															pause.setVisibility(View.INVISIBLE);
						 		                    	 dialog.cancel();}

						                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
						      
						               @Override
						                        public void onClick(DialogInterface dialog, int which) {
						                            // TODO Auto-generated method stub
						            	   bingo.setVisibility(View.VISIBLE);
						            		 face2.setVisibility(View.INVISIBLE);
						            		 sp.play(music, 1, 1, 0, 0, 1);
						                            dialog.cancel();	
						                            retry.setVisibility(View.VISIBLE);
													pause.setVisibility(View.INVISIBLE);
						                        }
						                    }).create().show();
										
										}
									});
										
nobutton122.setOnClickListener(new Button.OnClickListener(){	
											public void onClick(View v1) {
												// TODO Auto-generated method stub
												yesbutton122.setVisibility(View.INVISIBLE);
												yesbutton123.setVisibility(View.VISIBLE);
												nobutton122.setVisibility(View.INVISIBLE);
												nobutton123.setVisibility(View.VISIBLE);
												q122.setVisibility(View.INVISIBLE);
												q123.setVisibility(View.VISIBLE);
												 sp.play(music, 1, 1, 0, 0, 1);
											}

											});
										
yesbutton123.setOnClickListener(new Button.OnClickListener(){	
											public void onClick(View v1) {
												// TODO Auto-generated method stub
												
												yesbutton123.setVisibility(View.INVISIBLE);
												
												nobutton123.setVisibility(View.INVISIBLE);
												retry.setVisibility(View.VISIBLE);
												pause.setVisibility(View.INVISIBLE);
												q123.setVisibility(View.INVISIBLE);
												 sp.play(musicwin, 1, 1, 0, 0, 1);
												LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
							                    View view=inflater.inflate(R.layout.peacock, null);
							                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
							                    builder2.setView(view);
							                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
							                        
							                        @Override
							                                public void onClick(DialogInterface dialog, int which) {

							 		                        // TODO Auto-generated method stub
							                        		 sorry.setVisibility(View.VISIBLE);
							                        		 face2.setVisibility(View.INVISIBLE);
							                        		 sp.play(music, 1, 1, 0, 0, 1);
							 		                    	 dialog.cancel();}

							                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
							      
							               @Override
							                        public void onClick(DialogInterface dialog, int which) {
							                            // TODO Auto-generated method stub
							            	   bingo.setVisibility(View.VISIBLE);
							            		 face2.setVisibility(View.INVISIBLE);
							            		 sp.play(music, 1, 1, 0, 0, 1);
							                            dialog.cancel();
							                        }
							                    }).create().show();
											
											}
										});
											
nobutton123.setOnClickListener(new Button.OnClickListener(){	
												public void onClick(View v1) {
													// TODO Auto-generated method stub
													yesbutton123.setVisibility(View.INVISIBLE);
													retry.setVisibility(View.VISIBLE);
													pause.setVisibility(View.INVISIBLE);
													nobutton123.setVisibility(View.INVISIBLE);
													
													q123.setVisibility(View.INVISIBLE);
													 sp.play(musicwin, 1, 1, 0, 0, 1);
													LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
								                    View view=inflater.inflate(R.layout.songbird, null);
								                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
								                    builder2.setView(view);
								                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
								                        
								                        @Override
								                                public void onClick(DialogInterface dialog, int which) {

								 		                        // TODO Auto-generated method stub
								                        		 sorry.setVisibility(View.VISIBLE);
								                        		 face2.setVisibility(View.INVISIBLE);
								                        		 sp.play(music, 1, 1, 0, 0, 1);
								 		                    	 dialog.cancel();}

								                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
								      
								               @Override
								                        public void onClick(DialogInterface dialog, int which) {
								                            // TODO Auto-generated method stub
								            	   bingo.setVisibility(View.VISIBLE);
								            		 face2.setVisibility(View.INVISIBLE);
								            		 sp.play(music, 1, 1, 0, 0, 1);
								                            dialog.cancel();
								                        }
								                    }).create().show();
												}

												});
											
yesbutton124.setOnClickListener(new Button.OnClickListener(){	
												public void onClick(View v1) {
													// TODO Auto-generated method stub
													
													yesbutton124.setVisibility(View.INVISIBLE);
													retry.setVisibility(View.VISIBLE);
													pause.setVisibility(View.INVISIBLE);
													nobutton124.setVisibility(View.INVISIBLE);
													
													q124.setVisibility(View.INVISIBLE);
													 sp.play(musicwin, 1, 1, 0, 0, 1);
													LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
								                    View view=inflater.inflate(R.layout.ostrich, null);
								                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
								                    builder2.setView(view);
								                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
								                        
								                        @Override
								                                public void onClick(DialogInterface dialog, int which) {

								 		                        // TODO Auto-generated method stub
								                        		 sorry.setVisibility(View.VISIBLE);
								                        		 face2.setVisibility(View.INVISIBLE);
								                        		 sp.play(music, 1, 1, 0, 0, 1);
								                        		 retry.setVisibility(View.VISIBLE);
																	pause.setVisibility(View.INVISIBLE);
								 		                    	 dialog.cancel();}

								                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
								      
								               @Override
								                        public void onClick(DialogInterface dialog, int which) {
								                            // TODO Auto-generated method stub
								            	   bingo.setVisibility(View.VISIBLE);
								            		 face2.setVisibility(View.INVISIBLE);
								            		 sp.play(music, 1, 1, 0, 0, 1);
								            		 retry.setVisibility(View.VISIBLE);
														pause.setVisibility(View.INVISIBLE);
								                            dialog.cancel();
								                        }
								                    }).create().show();
												
												}
											});
												
nobutton124.setOnClickListener(new Button.OnClickListener(){	
													public void onClick(View v1) {
														// TODO Auto-generated method stub
														yesbutton124.setVisibility(View.INVISIBLE);
														yesbutton125.setVisibility(View.VISIBLE);
														nobutton124.setVisibility(View.INVISIBLE);
														nobutton125.setVisibility(View.VISIBLE);
														q124.setVisibility(View.INVISIBLE);
														q125.setVisibility(View.VISIBLE);
														 sp.play(music, 1, 1, 0, 0, 1);
													}

													});
yesbutton125.setOnClickListener(new Button.OnClickListener(){	
										public void onClick(View v1) {
											// TODO Auto-generated method stub
											
											yesbutton125.setVisibility(View.INVISIBLE);
											retry.setVisibility(View.VISIBLE);
											pause.setVisibility(View.INVISIBLE);
											nobutton125.setVisibility(View.INVISIBLE);
											
											q125.setVisibility(View.INVISIBLE);
											 sp.play(musicwin, 1, 1, 0, 0, 1);
											LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
						                    View view=inflater.inflate(R.layout.chicken, null);
						                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
						                    builder2.setView(view);
						                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
						                        
						                        @Override
						                                public void onClick(DialogInterface dialog, int which) {

						 		                        // TODO Auto-generated method stub
						                        		 sorry.setVisibility(View.VISIBLE);
						                        		 face2.setVisibility(View.INVISIBLE);
						                        		 sp.play(music, 1, 1, 0, 0, 1);
						 		                    	 dialog.cancel();}

						                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
						      
						               @Override
						                        public void onClick(DialogInterface dialog, int which) {
						                            // TODO Auto-generated method stub
						            	   bingo.setVisibility(View.VISIBLE);
						            		 face2.setVisibility(View.INVISIBLE);
						            		 sp.play(music, 1, 1, 0, 0, 1);
						                            dialog.cancel();
						                        }
						                    }).create().show();
										
										}
									});
										
nobutton125.setOnClickListener(new Button.OnClickListener(){	
											public void onClick(View v1) {
												// TODO Auto-generated method stub
												yesbutton125.setVisibility(View.INVISIBLE);
												retry.setVisibility(View.VISIBLE);
												pause.setVisibility(View.INVISIBLE);
												nobutton125.setVisibility(View.INVISIBLE);
												
												q125.setVisibility(View.INVISIBLE);
												 sp.play(musicwin, 1, 1, 0, 0, 1);
												LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
							                    View view=inflater.inflate(R.layout.pigeon, null);
							                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
							                    builder2.setView(view);
							                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
							                        
							                        @Override
							                                public void onClick(DialogInterface dialog, int which) {

							 		                        // TODO Auto-generated method stub
							                        		 sorry.setVisibility(View.VISIBLE);
							                        		 face2.setVisibility(View.INVISIBLE);
							                        		 sp.play(music, 1, 1, 0, 0, 1);
							 		                    	 dialog.cancel();}

							                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
							      
							               @Override
							                        public void onClick(DialogInterface dialog, int which) {
							                            // TODO Auto-generated method stub
							            	   bingo.setVisibility(View.VISIBLE);
							            		 face2.setVisibility(View.INVISIBLE);
							            		 sp.play(music, 1, 1, 0, 0, 1);
							                            dialog.cancel();
							                        }
							                    }).create().show();
											}

											});																																																		
yesbutton126.setOnClickListener(new Button.OnClickListener(){	
								public void onClick(View v1) {
									// TODO Auto-generated method stub
									
									yesbutton126.setVisibility(View.INVISIBLE);
									retry.setVisibility(View.VISIBLE);
									pause.setVisibility(View.INVISIBLE);
									nobutton126.setVisibility(View.INVISIBLE);
									
									q126.setVisibility(View.INVISIBLE);
									 sp.play(musicwin, 1, 1, 0, 0, 1);
									LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
				                    View view=inflater.inflate(R.layout.hedgehog, null);
				                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
				                    builder2.setView(view);
				                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
				                        
				                        @Override
				                                public void onClick(DialogInterface dialog, int which) {

				 		                        // TODO Auto-generated method stub
				                        		 sorry.setVisibility(View.VISIBLE);
				                        		 face2.setVisibility(View.INVISIBLE);
				                        		 sp.play(music, 1, 1, 0, 0, 1);
				 		                    	 dialog.cancel();}

				                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
				      
				               @Override
				                        public void onClick(DialogInterface dialog, int which) {
				                            // TODO Auto-generated method stub
				            	   bingo.setVisibility(View.VISIBLE);
				            		 face2.setVisibility(View.INVISIBLE);
				            		 sp.play(music, 1, 1, 0, 0, 1);
				                            dialog.cancel();
				                        }
				                    }).create().show();
								
								}
							});
								
nobutton126.setOnClickListener(new Button.OnClickListener(){	
									public void onClick(View v1) {
										// TODO Auto-generated method stub
										yesbutton126.setVisibility(View.INVISIBLE);
										retry.setVisibility(View.VISIBLE);
										pause.setVisibility(View.INVISIBLE);
										nobutton126.setVisibility(View.INVISIBLE);
										
										q126.setVisibility(View.INVISIBLE);
										 sp.play(musicwin, 1, 1, 0, 0, 1);
										LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
					                    View view=inflater.inflate(R.layout.raccoon, null);
					                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
					                    builder2.setView(view);
					                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
					                        
					                        @Override
					                                public void onClick(DialogInterface dialog, int which) {

					 		                        // TODO Auto-generated method stub
					                        		 sorry.setVisibility(View.VISIBLE);
					                        		 face2.setVisibility(View.INVISIBLE);
					                        		 sp.play(music, 1, 1, 0, 0, 1);
					 		                    	 dialog.cancel();}

					                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
					      
					               @Override
					                        public void onClick(DialogInterface dialog, int which) {
					                            // TODO Auto-generated method stub
					            	   bingo.setVisibility(View.VISIBLE);
					            		 face2.setVisibility(View.INVISIBLE);
					            		 sp.play(music, 1, 1, 0, 0, 1);
					                            dialog.cancel();
					                        }
					                    }).create().show();
									}

									});																																																			
		
			
	
	
yesbutton127.setOnClickListener(new Button.OnClickListener(){	
public void onClick(View v1) {
	// TODO Auto-generated method stub
	
	yesbutton127.setVisibility(View.INVISIBLE);
	retry.setVisibility(View.VISIBLE);
	pause.setVisibility(View.INVISIBLE);
	nobutton127.setVisibility(View.INVISIBLE);
	
	q127.setVisibility(View.INVISIBLE);
	 sp.play(musicwin, 1, 1, 0, 0, 1);
	LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
    View view=inflater.inflate(R.layout.elephant, null);
    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
    builder2.setView(view);
    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
        
        @Override
                public void onClick(DialogInterface dialog, int which) {

                 // TODO Auto-generated method stub
        		 sorry.setVisibility(View.VISIBLE);
        		 face2.setVisibility(View.INVISIBLE);
        		 sp.play(music, 1, 1, 0, 0, 1);
             	 dialog.cancel();}

             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {

@Override
        public void onClick(DialogInterface dialog, int which) {
            // TODO Auto-generated method stub
	  bingo.setVisibility(View.VISIBLE);
		 face2.setVisibility(View.INVISIBLE);
		 sp.play(music, 1, 1, 0, 0, 1);
            dialog.cancel();
        }
    }).create().show();

}
});

nobutton127.setOnClickListener(new Button.OnClickListener(){	
	public void onClick(View v1) {
		// TODO Auto-generated method stub
		yesbutton127.setVisibility(View.INVISIBLE);
		retry.setVisibility(View.VISIBLE);
		pause.setVisibility(View.INVISIBLE);
		nobutton127.setVisibility(View.INVISIBLE);
		
		q127.setVisibility(View.INVISIBLE);
		 sp.play(musicwin, 1, 1, 0, 0, 1);
		LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
	    View view=inflater.inflate(R.layout.rhion, null);
	    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
	    builder2.setView(view);
	    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
	        
	        @Override
	                public void onClick(DialogInterface dialog, int which) {

	                 // TODO Auto-generated method stub
	        		 sorry.setVisibility(View.VISIBLE);
	        		 face2.setVisibility(View.INVISIBLE);
	        		 sp.play(music, 1, 1, 0, 0, 1);
	             	 dialog.cancel();}

	             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {

	@Override
	        public void onClick(DialogInterface dialog, int which) {
	            // TODO Auto-generated method stub
		  bingo.setVisibility(View.VISIBLE);
   		 face2.setVisibility(View.INVISIBLE);
   		 sp.play(music, 1, 1, 0, 0, 1);
	            dialog.cancel();
	        }
	    }).create().show();
	}

	});


yesbutton128.setOnClickListener(new Button.OnClickListener(){	
	public void onClick(View v1) {
		// TODO Auto-generated method stub
		
		yesbutton128.setVisibility(View.INVISIBLE);
		retry.setVisibility(View.VISIBLE);
		pause.setVisibility(View.INVISIBLE);
		nobutton128.setVisibility(View.INVISIBLE);
		
		q128.setVisibility(View.INVISIBLE);
		 sp.play(musicwin, 1, 1, 0, 0, 1);
		LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
     View view=inflater.inflate(R.layout.chameleon, null);
     AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
     builder2.setView(view);
     builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
         
         @Override
                 public void onClick(DialogInterface dialog, int which) {

                  // TODO Auto-generated method stub
         		 sorry.setVisibility(View.VISIBLE);
         		 face2.setVisibility(View.INVISIBLE);
         		 sp.play(music, 1, 1, 0, 0, 1);
              	 dialog.cancel();}

              }).setPositiveButton("YES", new DialogInterface.OnClickListener() {

@Override
         public void onClick(DialogInterface dialog, int which) {
             // TODO Auto-generated method stub
	  bingo.setVisibility(View.VISIBLE);
		 face2.setVisibility(View.INVISIBLE);
		 sp.play(music, 1, 1, 0, 0, 1);
             dialog.cancel();
         }
     }).create().show();
	
	}
});
	
	nobutton128.setOnClickListener(new Button.OnClickListener(){	
		public void onClick(View v1) {
			// TODO Auto-generated method stub
			yesbutton128.setVisibility(View.INVISIBLE);
			retry.setVisibility(View.VISIBLE);
			pause.setVisibility(View.INVISIBLE);
			nobutton128.setVisibility(View.INVISIBLE);
			
			q128.setVisibility(View.INVISIBLE);
			 sp.play(musicwin, 1, 1, 0, 0, 1);
			LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
         View view=inflater.inflate(R.layout.lizard, null);
         AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
         builder2.setView(view);
         builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
             
             @Override
                     public void onClick(DialogInterface dialog, int which) {

                      // TODO Auto-generated method stub
             		 sorry.setVisibility(View.VISIBLE);
             		 face2.setVisibility(View.INVISIBLE);
             		 sp.play(music, 1, 1, 0, 0, 1);
                  	 dialog.cancel();}

                  }).setPositiveButton("YES", new DialogInterface.OnClickListener() {

    @Override
             public void onClick(DialogInterface dialog, int which) {
                 // TODO Auto-generated method stub
    	  bingo.setVisibility(View.VISIBLE);
   		 face2.setVisibility(View.INVISIBLE);
   		 sp.play(music, 1, 1, 0, 0, 1);
                 dialog.cancel();
             }
         }).create().show();
		}

		});
	
	yesbutton129.setOnClickListener(new Button.OnClickListener(){	
		public void onClick(View v1) {
			// TODO Auto-generated method stub
			
			yesbutton129.setVisibility(View.INVISIBLE);
			retry.setVisibility(View.VISIBLE);
			pause.setVisibility(View.INVISIBLE);
			nobutton129.setVisibility(View.INVISIBLE);
			
			q129.setVisibility(View.INVISIBLE);
			 sp.play(musicwin, 1, 1, 0, 0, 1);
			LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
         View view=inflater.inflate(R.layout.ladybug, null);
         AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
         builder2.setView(view);
         builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
             
             @Override
                     public void onClick(DialogInterface dialog, int which) {

                      // TODO Auto-generated method stub
             		 sorry.setVisibility(View.VISIBLE);
             		 face2.setVisibility(View.INVISIBLE);
             		 sp.play(music, 1, 1, 0, 0, 1);
             		retry.setVisibility(View.VISIBLE);
        			pause.setVisibility(View.INVISIBLE);
                  	 dialog.cancel();}

                  }).setPositiveButton("YES", new DialogInterface.OnClickListener() {

    @Override
             public void onClick(DialogInterface dialog, int which) {
                 // TODO Auto-generated method stub
    	  bingo.setVisibility(View.VISIBLE);
   		 face2.setVisibility(View.INVISIBLE);
   		 sp.play(music, 1, 1, 0, 0, 1);
   		retry.setVisibility(View.VISIBLE);
		pause.setVisibility(View.INVISIBLE);
                 dialog.cancel();
             }
         }).create().show();
		
		}
	});
		
		nobutton129.setOnClickListener(new Button.OnClickListener(){	
			public void onClick(View v1) {
				// TODO Auto-generated method stub
				yesbutton129.setVisibility(View.INVISIBLE);
				
				nobutton129.setVisibility(View.INVISIBLE);
				
				q129.setVisibility(View.INVISIBLE);
				yesbutton119.setVisibility(View.VISIBLE);
				
				nobutton119.setVisibility(View.VISIBLE);
				
				q119.setVisibility(View.VISIBLE);
				 sp.play(music, 1, 1, 0, 0, 1);
			}

			});
		
		
			
						
					
					yesbutton200.setOnClickListener(new Button.OnClickListener(){	
						public void onClick(View v1) {
							// TODO Auto-generated method stub
							
							yesbutton200.setVisibility(View.INVISIBLE);
							retry.setVisibility(View.VISIBLE);
							pause.setVisibility(View.INVISIBLE);
							nobutton200.setVisibility(View.INVISIBLE);
						
							q200.setVisibility(View.INVISIBLE);
						
							 sp.play(musicwin, 1, 1, 0, 0, 1);
							 LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
					         View view=inflater.inflate(R.layout.beaver, null);
					         AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
					         builder2.setView(view);
					         builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
					             
					             @Override
					                     public void onClick(DialogInterface dialog, int which) {

					                      // TODO Auto-generated method stub
					             		 sorry.setVisibility(View.VISIBLE);
					             		 face2.setVisibility(View.INVISIBLE);
					             		 sp.play(music, 1, 1, 0, 0, 1);
					             		retry.setVisibility(View.VISIBLE);
										pause.setVisibility(View.INVISIBLE);
					                  	 dialog.cancel();}

					                  }).setPositiveButton("YES", new DialogInterface.OnClickListener() {

					    @Override
					             public void onClick(DialogInterface dialog, int which) {
					                 // TODO Auto-generated method stub
					    	  bingo.setVisibility(View.VISIBLE);
				          		 face2.setVisibility(View.INVISIBLE);
				          		 sp.play(music, 1, 1, 0, 0, 1);
				          		retry.setVisibility(View.VISIBLE);
								pause.setVisibility(View.INVISIBLE);
					                 dialog.cancel();
					             }
					         }).create().show();
						
						}
					});
						
						nobutton200.setOnClickListener(new Button.OnClickListener(){	
							public void onClick(View v1) {
								// TODO Auto-generated method stub
								yesbutton200.setVisibility(View.INVISIBLE);
								yesbutton205.setVisibility(View.VISIBLE);
								nobutton200.setVisibility(View.INVISIBLE);
								nobutton205.setVisibility(View.VISIBLE);
								q200.setVisibility(View.INVISIBLE);
								q205.setVisibility(View.VISIBLE);
								 sp.play(music, 1, 1, 0, 0, 1);
							}

							});
						
						
						yesbutton201.setOnClickListener(new Button.OnClickListener(){	
							public void onClick(View v1) {
								// TODO Auto-generated method stub
								
								yesbutton201.setVisibility(View.INVISIBLE);
								retry.setVisibility(View.VISIBLE);
								pause.setVisibility(View.INVISIBLE);
								nobutton2.setVisibility(View.INVISIBLE);
								
								q2.setVisibility(View.INVISIBLE);
							
								 sp.play(musicwin, 1, 1, 0, 0, 1);
								 LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
						         View view=inflater.inflate(R.layout.snake, null);
						         AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
						         builder2.setView(view);
						         builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
						             
						             @Override
						                     public void onClick(DialogInterface dialog, int which) {

						                      // TODO Auto-generated method stub
						             		 sorry.setVisibility(View.VISIBLE);
						             		 face2.setVisibility(View.INVISIBLE);
						             		 sp.play(music, 1, 1, 0, 0, 1);
						                  	 dialog.cancel();}

						                  }).setPositiveButton("YES", new DialogInterface.OnClickListener() {

						    @Override
						             public void onClick(DialogInterface dialog, int which) {
						                 // TODO Auto-generated method stub
						    	  bingo.setVisibility(View.VISIBLE);
					          		 face2.setVisibility(View.INVISIBLE);
					          		 sp.play(music, 1, 1, 0, 0, 1);
						                 dialog.cancel();
						             }
						         }).create().show();
							
							}
						});
							
							nobutton201.setOnClickListener(new Button.OnClickListener(){	
								public void onClick(View v1) {
									// TODO Auto-generated method stub
									yesbutton201.setVisibility(View.INVISIBLE);
									retry.setVisibility(View.VISIBLE);
									pause.setVisibility(View.INVISIBLE);
									nobutton201.setVisibility(View.INVISIBLE);
									
									q201.setVisibility(View.INVISIBLE);
								
									 sp.play(musicwin, 1, 1, 0, 0, 1);
									 LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
							         View view=inflater.inflate(R.layout.shrimp, null);
							         AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
							         builder2.setView(view);
							         builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
							             
							             @Override
							                     public void onClick(DialogInterface dialog, int which) {

							                      // TODO Auto-generated method stub
							             		 sorry.setVisibility(View.VISIBLE);
							             		 face2.setVisibility(View.INVISIBLE);
							             		 sp.play(music, 1, 1, 0, 0, 1);
							                  	 dialog.cancel();}

							                  }).setPositiveButton("YES", new DialogInterface.OnClickListener() {

							    @Override
							             public void onClick(DialogInterface dialog, int which) {
							                 // TODO Auto-generated method stub
							    	  bingo.setVisibility(View.VISIBLE);
						          		 face2.setVisibility(View.INVISIBLE);
						          		 sp.play(music, 1, 1, 0, 0, 1);
							                 dialog.cancel();
							             }
							         }).create().show();
								}

								});
							
							
									
									yesbutton204.setOnClickListener(new Button.OnClickListener(){	
										public void onClick(View v1) {
											// TODO Auto-generated method stub
											
											yesbutton204.setVisibility(View.INVISIBLE);
											retry.setVisibility(View.VISIBLE);
											pause.setVisibility(View.INVISIBLE);
											nobutton204.setVisibility(View.INVISIBLE);
											
											q204.setVisibility(View.INVISIBLE);
											 sp.play(musicwin, 1, 1, 0, 0, 1);
										

									LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
				                    View view=inflater.inflate(R.layout.cow, null);
				                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
				                    builder2.setView(view);
				                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
				                        
				                        @Override
				                                public void onClick(DialogInterface dialog, int which) {

				 		                        // TODO Auto-generated method stub
				                        		 sorry.setVisibility(View.VISIBLE);
				                        		 face2.setVisibility(View.INVISIBLE);
				                        		 sp.play(music, 1, 1, 0, 0, 1);
				 		                    	 dialog.cancel();}

				                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
				      
				               @Override
				                        public void onClick(DialogInterface dialog, int which) {
				                            // TODO Auto-generated method stub
				            	   bingo.setVisibility(View.VISIBLE);
				          		 face2.setVisibility(View.INVISIBLE);
				          		 sp.play(music, 1, 1, 0, 0, 1);
				                            dialog.cancel();
				                        }
				                    }).create().show();
				                   												
										}
									});
										
										nobutton204.setOnClickListener(new Button.OnClickListener(){	
											public void onClick(View v1) {
												// TODO Auto-generated method stub
												yesbutton204.setVisibility(View.INVISIBLE);
												retry.setVisibility(View.VISIBLE);
												pause.setVisibility(View.INVISIBLE);
												nobutton204.setVisibility(View.INVISIBLE);
												
												q204.setVisibility(View.INVISIBLE);
												 sp.play(musicwin, 1, 1, 0, 0, 1);
												LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
							                    View view=inflater.inflate(R.layout.hippo, null);
							                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
							                    builder2.setView(view);
							                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
							                        
							                        @Override
							                                public void onClick(DialogInterface dialog, int which) {

							 		                        // TODO Auto-generated method stub
							                        		 sorry.setVisibility(View.VISIBLE);
							                        		 face2.setVisibility(View.INVISIBLE);
							                        		 sp.play(music, 1, 1, 0, 0, 1);
							 		                    	 dialog.cancel();}

							                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
							      
							               @Override
							                        public void onClick(DialogInterface dialog, int which) {
							                            // TODO Auto-generated method stub
							            	   bingo.setVisibility(View.VISIBLE);
							            		 face2.setVisibility(View.INVISIBLE);
							            		 sp.play(music, 1, 1, 0, 0, 1);
							                            dialog.cancel();
							                        }
							                    }).create().show();
												
											}

											});
										
										yesbutton205.setOnClickListener(new Button.OnClickListener(){	
											public void onClick(View v1) {
												// TODO Auto-generated method stub
												
												yesbutton205.setVisibility(View.INVISIBLE);
												retry.setVisibility(View.VISIBLE);
												pause.setVisibility(View.INVISIBLE);
												nobutton205.setVisibility(View.INVISIBLE);
												
												q205.setVisibility(View.INVISIBLE);
												 sp.play(musicwin, 1, 1, 0, 0, 1);
												LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
							                    View view=inflater.inflate(R.layout.platypus, null);
							                    AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
							                    builder2.setView(view);
							                    builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
							                        
							                        @Override
							                                public void onClick(DialogInterface dialog, int which) {

							 		                        // TODO Auto-generated method stub
							                        		 sorry.setVisibility(View.VISIBLE);
							                        		 face2.setVisibility(View.INVISIBLE);
							                        		 sp.play(music, 1, 1, 0, 0, 1);
							 		                    	 dialog.cancel();}

							                             }).setPositiveButton("YES", new DialogInterface.OnClickListener() {
							      
							               @Override
							                        public void onClick(DialogInterface dialog, int which) {
							                            // TODO Auto-generated method stub
							            	   bingo.setVisibility(View.VISIBLE);
							            		 face2.setVisibility(View.INVISIBLE);
							            		 sp.play(music, 1, 1, 0, 0, 1);
							                            dialog.cancel();
							                        }
							                    }).create().show();
											
											}
										});
											
											nobutton205.setOnClickListener(new Button.OnClickListener(){	
												public void onClick(View v1) {
													// TODO Auto-generated method stub
													yesbutton205.setVisibility(View.INVISIBLE);
													retry.setVisibility(View.VISIBLE);
													pause.setVisibility(View.INVISIBLE);
													nobutton205.setVisibility(View.INVISIBLE);
													
													q205.setVisibility(View.INVISIBLE);
												
													 sp.play(musicwin, 1, 1, 0, 0, 1);
													 LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
											         View view=inflater.inflate(R.layout.sheep, null);
											         AlertDialog.Builder builder2=new AlertDialog.Builder(questions.this);
											         builder2.setView(view);
											         builder2.setTitle("IS IT ").setNegativeButton("NO", new DialogInterface.OnClickListener() {
											             
											             @Override
											                     public void onClick(DialogInterface dialog, int which) {

											                      // TODO Auto-generated method stub
											             		 sorry.setVisibility(View.VISIBLE);
											             		 face2.setVisibility(View.INVISIBLE);
											             		 sp.play(music, 1, 1, 0, 0, 1);
											                  	 dialog.cancel();}

											                  }).setPositiveButton("YES", new DialogInterface.OnClickListener() {

											    @Override
											             public void onClick(DialogInterface dialog, int which) {
											                 // TODO Auto-generated method stub
											    	  bingo.setVisibility(View.VISIBLE);
										          		 face2.setVisibility(View.INVISIBLE);
										          		 sp.play(music, 1, 1, 0, 0, 1);
											                 dialog.cancel();
											             }
											         }).create().show();
												}

												});					
					
		pause.setOnTouchListener(new View.OnTouchListener(){            
		    public boolean onTouch(View v, MotionEvent event) {               
		            if(event.getAction() == MotionEvent.ACTION_DOWN){       
	   
		            	 sp.play(music, 1, 1, 0, 0, 1);
		            	AlertDialog.Builder dialog=new AlertDialog.Builder(questions.this);

		                   dialog.setTitle("PAUSE").setIcon(android.R.drawable.ic_dialog_info).setPositiveButton("MAIN MENU", new DialogInterface.OnClickListener() {
		                	   


		                    @Override

		                    public void onClick(DialogInterface dialog, int which) {

		                        // TODO Auto-generated method stub
		                    	 sp.play(music, 1, 1, 0, 0, 1);
		                    	  Intent intent=new Intent();    
								     intent.setClass(questions.this,Main.class);
								     finish();
								     startActivity(intent);
		                     


		                    }

		                }).setNegativeButton("RESUME", new DialogInterface.OnClickListener() {

		                    public void onClick(DialogInterface dialog, int which) {

		                    	 sp.play(music, 1, 1, 0, 0, 1);
		                        // TODO Auto-generated method stub
							dialog.cancel();//È¡Ïûµ¯³ö¿ò
		     }

		                }).create().show();
		              
	           }else if(event.getAction() == MotionEvent.ACTION_UP){       
	
	              ((ImageButton)v).setImageDrawable(getResources().getDrawable(R.drawable.pause));     
	            }  
	          return false;       
   }       
		});  
		
		retry.setOnTouchListener(new View.OnTouchListener(){            
		    public boolean onTouch(View v, MotionEvent event) {               
		            if(event.getAction() == MotionEvent.ACTION_DOWN){       
	   
		            	 sp.play(music, 1, 1, 0, 0, 1);
		            	 Intent intent=new Intent();    
					     intent.setClass(questions.this,Main.class);
					     finish();
					     startActivity(intent);
	           } 
	          return false;       
		    }       
		});  

	}
	
}
