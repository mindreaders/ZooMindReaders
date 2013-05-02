package com.zoomindreader.twentyquestions;


import com.zoomindreader.twentyquestions.R;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;

import android.view.View;


import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;


public class Main extends Activity {
	
	

	private ImageButton imagebutton1;
	private ImageButton imagebutton2;
	private ImageButton imagebutton3;
	private ImageButton imagebutton4;
	
	private ImageView loading;
	private ImageView title;
	private Toast toast;
	
	private SoundPool sp;
	private int music;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		  super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
			
			loading=(ImageView)findViewById(R.id.loading);
			title=(ImageView)findViewById(R.id.title);
			
			loading.setVisibility(View.INVISIBLE);
			
			sp= new SoundPool(10,AudioManager.STREAM_SYSTEM,5);
			music = sp.load(this, R.raw.button,1);
			
			imagebutton3=(ImageButton)findViewById(R.id.imagebuttoninfo);
			
			// BUTTON 1 , MAIN PAGE, NEW
			imagebutton3.setOnTouchListener(new View.OnTouchListener(){            
			    public boolean onTouch(View v, MotionEvent event) {               
			            if(event.getAction() == MotionEvent.ACTION_DOWN){       
		   
			               ((ImageButton)v).setImageDrawable(getResources().getDrawable(R.drawable.imagebuttoninfo2));
			               sp.play(music, 1, 1, 0, 0, 1);
			               AlertDialog.Builder dialog=new AlertDialog.Builder(Main.this);

		                   dialog.setTitle("INFORMATION").setIcon(android.R.drawable.ic_dialog_info).setMessage("JUST THINK ABOUT ONE COMMON ANIMAL IN YOUR MIND ! WE WILL GUESS THAT !!").setPositiveButton("OKAY", new DialogInterface.OnClickListener() {
		                	   


		                    @Override

		                    public void onClick(DialogInterface dialog, int which) {

		                        // TODO Auto-generated method stub
		                    	 sp.play(music, 1, 1, 0, 0, 1);
		                    	dialog.cancel();//取消弹出框


		                    }

		                }).create().show();
						     
						     
		           }else if(event.getAction() == MotionEvent.ACTION_UP){       
		
		              ((ImageButton)v).setImageDrawable(getResources().getDrawable(R.drawable.imagebuttoninfo1));     
		            }  
		          return false;       
	   }       
			});  
			
			
				imagebutton4=(ImageButton)findViewById(R.id.imagebuttonteam);
			
			// BUTTON 1 , MAIN PAGE, NEW
			imagebutton4.setOnTouchListener(new View.OnTouchListener(){            
			    public boolean onTouch(View v, MotionEvent event) {               
			            if(event.getAction() == MotionEvent.ACTION_DOWN){       
		   
			              
			               sp.play(music, 1, 1, 0, 0, 1);
			               LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
		                    View view=inflater.inflate(R.layout.team, null);
		                    AlertDialog.Builder builder2=new AlertDialog.Builder(Main.this);
		                    builder2.setView(view);
		                    builder2.setTitle("TEAM INFORMATION ").setPositiveButton("OKAY", new DialogInterface.OnClickListener() {
		      
		               @Override
		                        public void onClick(DialogInterface dialog, int which) {
		                            // TODO Auto-generated method stub
		            	   			sp.play(music, 1, 1, 0, 0, 1);
		                            dialog.cancel();
		                        }
		                    }).create().show();
						     
						     	
		           } 
		          return false;       
	   }       
			});  
			
			
					
			
			
			
			// BUTTON 3 , MAIN PAGE, NEW
			imagebutton1= (ImageButton)findViewById(R.id.imagebuttonnew);          
			imagebutton1.setOnTouchListener(new View.OnTouchListener(){            
			    public boolean onTouch(View v, MotionEvent event) {               
			            if(event.getAction() == MotionEvent.ACTION_DOWN){       
		   
			               ((ImageButton)v).setImageDrawable(getResources().getDrawable(R.drawable.imagebuttonnew2));
			               loading.setVisibility(View.VISIBLE);
			   				title.setVisibility(View.INVISIBLE);
			   				imagebutton1.setVisibility(View.INVISIBLE);
			   				imagebutton2.setVisibility(View.INVISIBLE);
			   				imagebutton3.setVisibility(View.INVISIBLE);
			   			 sp.play(music, 1, 1, 0, 0, 1);
			               Intent intent=new Intent();    
						     intent.setClass(Main.this, questions.class);
						     startActivity(intent);
						    
						     
						     toast = Toast.makeText(getApplicationContext(),"GAME START !!!",Toast.LENGTH_LONG);
						   toast.setGravity(Gravity.CENTER, 0, 0);
						   toast.show();
						   finish();
						     
						     
		           }else if(event.getAction() == MotionEvent.ACTION_UP){       
		
		              ((ImageButton)v).setImageDrawable(getResources().getDrawable(R.drawable.imagebuttonnew1));     
		            }  
		          return false;       
	   }       
			});  
			
			
			
			
			
			
			
			
			
			
			// BUTTON 3, MAIN PAGE , EXIT
			imagebutton2= (ImageButton)findViewById(R.id.imagebuttonexit);          
			imagebutton2.setOnTouchListener(new View.OnTouchListener(){            
			    public boolean onTouch(View v, MotionEvent event) {               
			            if(event.getAction() == MotionEvent.ACTION_DOWN){       
		   
			               ((ImageButton)v).setImageDrawable(getResources().getDrawable(R.drawable.imagebuttonexit2));

			               sp.play(music, 1, 1, 0, 0, 1);
			               AlertDialog.Builder dialog=new AlertDialog.Builder(Main.this);

		                   dialog.setTitle("WARNING").setIcon(android.R.drawable.ic_dialog_info).setMessage("ARE YOU SURE YOU WANT TO QUIT???").setPositiveButton("YES", new DialogInterface.OnClickListener() {
		                	   


		                    @Override

		                    public void onClick(DialogInterface dialog, int which) {

		                        // TODO Auto-generated method stub
		                    	 sp.play(music, 1, 1, 0, 0, 1);
		                      finish();


		                    }

		                }).setNegativeButton("NO", new DialogInterface.OnClickListener() {

		                    public void onClick(DialogInterface dialog, int which) {


		                        // TODO Auto-generated method stub
		                    	 sp.play(music, 1, 1, 0, 0, 1);
							dialog.cancel();//取消弹出框
		     }

		                }).create().show();
			               
			               
			               
		           }else if(event.getAction() == MotionEvent.ACTION_UP){       
		
		              ((ImageButton)v).setImageDrawable(getResources().getDrawable(R.drawable.imagebuttonexit1));     
		            }  
		          return false;       
	   }       
			});  
			
			//BUTTON 1 QUESTION PAGE yes button
		

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
