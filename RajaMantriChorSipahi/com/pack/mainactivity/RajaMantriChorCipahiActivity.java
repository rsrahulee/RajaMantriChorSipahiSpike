package com.pack.mainactivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.pack.android.R;
import com.pack.support.AdRequest;
import com.pack.support.AdSize;
import com.pack.support.AdView;
import com.pack.support.SupportClass;

public class RajaMantriChorCipahiActivity extends Activity {

	private String player1_role = "";
	private String player2_role = "";
	private String player3_role = "";
	private String player4_role = "";

	private String player1_name, player2_name, player3_name, player4_name;
	private String[] playersArray = { "Player1", "Player2", "Player3", "Player4" };

	private Button btnSignin;
	private Button btnMainMenu;
	private Button btnPlay;
	private Button btnRajaMantri;
	private Button btnHelp;

	private EditText editTxtPlayer1;
	private EditText editTxtPlayer2;
	private EditText editTxtPlayer3;
	private EditText editTxtPlayer4;

	private TextView lblPlayer1;
	private TextView lblPlayer2;
	private TextView lblPlayer3;
	private TextView lblPlayer4;
	private TextView txtTurn;
	private TextView txtPlayer1;
	private TextView txtPlayer2;
	private TextView txtPlayer3;
	private TextView txtPlayer4;
	
	private Context context;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		
		context = this.getApplicationContext();

		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;

		btnHelp = (Button) findViewById(R.id.btnHelp);
		btnHelp.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				setContentView(R.layout.help);
				// Create the adView
				AdView adView = new AdView(context, AdSize.BANNER, "a14e156523d01de");
				// Lookup your LinearLayout assuming it’s been given
				// the attribute android:id="@+id/mainLayout"
				LinearLayout layout = (LinearLayout) findViewById(R.id.mainLayoutHelp);
				// Add the adView to it
				layout.addView(adView);
				// Initiate a generic request to load it with an ad
				adView.loadAd(new AdRequest());
				TextView txtHelp = (TextView) findViewById(R.id.txtHelp);
				String text = "Welcome to nostalgia! This is the paper free version of Raja Mantri Chor Sipahi.\n\nThe game involves bluffing with facial expressions and good guessing. This is a very popular childhood game in India played among kids often during their long summer vacations.\n\nThe game has 4 paper chits with Chor (thief), Sipahi (police), Raja (king) and Mantri (minister). The chits are folded at the start of the game and one of the 4 players will press SHUFFLE each one of the four players is supposed to secretly (by taking the phone and not letting the others see it)pick one chit by clicking on it, the player then clicks on the chit again to fold it back. All the players will then secretly open their chits and read what they have got. \n\nThe player who gets the chit with Raja written on it will say MERA MANTRI KAUN? (Who is my minister?). The player who got the chit with Mantri will say MEIN! (Me), The player with Raja will then say CHOR SIPAHI KA PATA LAGAO (find out who is the theif and who is the soldier). The player with Mantri will then guess who is the Chor (Thief), if he is wrong then his points are deducted and if he is correct he gets more points and the points from the player who got Chor (Thief) are deducted.\n\nIf the guess is correct the player with Chor is wrapped on his wrist by the Mantri, and if the Mantri is wrong then the Chor gets to hit his wrist.";
				txtHelp.setText(text);
				Button btnBack = (Button) findViewById(R.id.btnMainMenuHelp);
				btnBack.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						Intent i = new Intent(context, RajaMantriChorCipahiActivity.class);
						context.startActivity(i);
						finish();
					}
				});
			}
		});
		btnRajaMantri = (Button) findViewById(R.id.btnRajaMantri);
		btnRajaMantri.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setContentView(R.layout.rmcsp);
				// Create the adView
				AdView adView = new AdView(context, AdSize.BANNER, "a14e156523d01de");
				// Lookup your LinearLayout assuming it’s been given
				// the attribute android:id="@+id/mainLayout"
				LinearLayout layout = (LinearLayout) findViewById(R.id.mainLayoutPlayer);
				// Add the adView to it
				layout.addView(adView);
				// Initiate a generic request to load it with an ad
				adView.loadAd(new AdRequest());

				editTxtPlayer1 = (EditText) findViewById(R.id.editTxtPlayer1);
				editTxtPlayer2 = (EditText) findViewById(R.id.editTxtPlayer2);
				editTxtPlayer3 = (EditText) findViewById(R.id.editTxtPlayer3);
				editTxtPlayer4 = (EditText) findViewById(R.id.editTxtPlayer4);

				lblPlayer1 = (TextView) findViewById(R.id.lblPlayer1);
				lblPlayer2 = (TextView) findViewById(R.id.lblPlayer2);
				lblPlayer3 = (TextView) findViewById(R.id.lblPlayer3);
				lblPlayer4 = (TextView) findViewById(R.id.lblPlayer4);

				Display display = getWindowManager().getDefaultDisplay();
				int width = display.getWidth();
				int height = display.getHeight();

				lblPlayer1.setGravity(Gravity.CENTER_HORIZONTAL);
				lblPlayer2.setGravity(Gravity.CENTER_HORIZONTAL);
				lblPlayer3.setGravity(Gravity.CENTER_HORIZONTAL);
				lblPlayer4.setGravity(Gravity.CENTER_HORIZONTAL);

				Log.v("AkandBakar", "Playernames:" + player1_name);
				Log.v("AkandBakar", "Playernames:" + player2_name);
				Log.v("AkandBakar", "Playernames:" + player3_name);
				Log.v("AkandBakar", "Playernames:" + player4_name);

				btnMainMenu = (Button) findViewById(R.id.btnMainMenu);
				btnMainMenu.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						Intent i = new Intent(context, RajaMantriChorCipahiActivity.class);
						context.startActivity(i);
						finish();
					}
				});

				btnSignin = (Button) findViewById(R.id.btnsignin);
				btnSignin.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						// TODO Auto-generated method stub
						player1_name = editTxtPlayer1.getText().toString();
						player2_name = editTxtPlayer2.getText().toString();
						player3_name = editTxtPlayer3.getText().toString();
						player4_name = editTxtPlayer4.getText().toString();

						if (player1_name.equals("") || player2_name.equals("") || player3_name.equals("")
								|| player4_name.equals("")) {

							Toast toast = Toast.makeText(getBaseContext(), "Enter player names!", 8000);
							toast.show();

						} else {

							int p1score = 0;
							int p2score = 0;
							int p3score = 0;
							int p4score = 0;

							setContentView(R.layout.rmcsgnew);
							// Create the adView
							AdView adView = new AdView(context, AdSize.BANNER,
									"a14e156523d01de");
							// Lookup your LinearLayout assuming it’s been
							// given
							// the attribute android:id="@+id/mainLayout"
							LinearLayout layout = (LinearLayout) findViewById(R.id.mainLayout);
							// Add the adView to it
							layout.addView(adView);
							// Initiate a generic request to load it with an ad
							adView.loadAd(new AdRequest());

							txtTurn = (TextView) findViewById(R.id.txtTurn);
							txtTurn.setText("Click on SHUFFLE!");
							playersArray[0] = player1_name;
							playersArray[1] = player2_name;
							playersArray[2] = player3_name;
							playersArray[3] = player4_name;

							txtPlayer1 = (TextView) findViewById(R.id.txtPlayer1);
							txtPlayer1.setText("1." + player1_name + " [" + p1score + "]");

							txtPlayer2 = (TextView) findViewById(R.id.txtPlayer2);
							txtPlayer2.setText("2." + player2_name + " [" + p2score + "]");

							txtPlayer3 = (TextView) findViewById(R.id.txtPlayer3);
							txtPlayer3.setText("3." + player3_name + " [" + p3score + "]");

							txtPlayer4 = (TextView) findViewById(R.id.txtPlayer4);
							txtPlayer4.setText("4." + player4_name + " [" + p4score + "]");

							btnPlay = (Button) findViewById(R.id.btnPlay);

							btnPlay.setOnClickListener(new OnClickListener() {

								public void onClick(View v) {
									// TODO Auto-generated method stub

									if (btnPlay.getText().equals("SHUFFLE")) {

										SupportClass.INSTANCE.shuffle();

									} else {

										SupportClass.INSTANCE.makeGuess();

										Log.v("RajaMantri", "########## Player Name:" + player1_name + " Role:"
												+ player1_role);
										Log.v("RajaMantri", "########## Player Name:" + player2_name + " Role:"
												+ player2_role);
										Log.v("RajaMantri", "########## Player Name:" + player3_name + " Role:"
												+ player3_role);
										Log.v("RajaMantri", "########## Player Name:" + player4_name + " Role:"
												+ player4_role);
									}
								}
							});
						}
					}
				});
			}
		});
	}

	@Override
	public void onBackPressed() {

	}

	@Override
	protected void onPostResume() {
		// TODO Auto-generated method stub
		super.onPostResume();
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		AlertDialog dialog = new AlertDialog.Builder(this).create();
		dialog.setTitle("Exit game!");
		dialog.setMessage("Are you sure you want to exit the game?");
		dialog.setButton("Exit", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				finish();
			}
		});

		dialog.setButton2("Cancel", new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
		dialog.show();
		return super.onKeyDown(keyCode, event);
	}

	// This is called when the overall system is running low on memory
	@Override
	public void onLowMemory() {
		AlertDialog dialog = new AlertDialog.Builder(this).create();
		dialog.setTitle("Low memory!");
		dialog.setMessage("Too many apps open, kindly close some other apps and try again!");
		dialog.setButton("Exit", new DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialog, int which) {

				finish();

			}
		});

		dialog.show();

		super.onLowMemory();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	public void onRestart() {

		super.onRestart();
		/*
		 * player1_name = "" ; player2_name = ""; player3_name = "";
		 * player4_name = ""; guess = false; player1 = ""; player2 = ""; player3
		 * = ""; player4 = ""; i=0;j=0;k=0;l=0; p1score = 0; p2score = 0;
		 * p3score = 0; p4score = 0;
		 */

	}

	public void onResume() {
		super.onResume();
		/*
		 * player1_name = "" ; player2_name = ""; player3_name = "";
		 * player4_name = ""; guess = false; player1 = ""; player2 = ""; player3
		 * = ""; player4 = ""; i=0;j=0;k=0;l=0; p1score = 0; p2score = 0;
		 * p3score = 0; p4score = 0;
		 */
	}
}