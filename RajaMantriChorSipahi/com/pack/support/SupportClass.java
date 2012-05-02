package com.pack.support;

import java.util.Random;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.pack.android.R;

public class SupportClass {

	String[] solutionArray = { "RAJA", "MANTRI", "CHOR", "SIPAHI" };

	private TextView txtPlayer1;
	private TextView txtPlayer2;
	private TextView txtPlayer3;
	private TextView txtPlayer4;
	// private Bundle savedInstanceState2;

	private boolean guess = false;

	private TextView txtTurn;

	private Button btnPlay;
	private int count = 0;

	private Button btnPod1;
	private Button btnPod2;
	private Button btnPod3;
	private Button btnPod4;

	private String player1_role;
	private String player2_role;
	private String player3_role;
	private String player4_role;

	private String player1_name;
	private String player2_name;
	private String player3_name;
	private String player4_name;

	private String player1;
	private String player2;
	private String player3;
	private String player4;

	private String nextTurn = "";

	public static SupportClass INSTANCE = new SupportClass();

	public SupportClass() {
		// TODO Auto-generated constructor stub
	}

	public void makeGuess() {

		btnPlay.setText("SHUFFLE");
		count = 0;
		btnPlay.setText("SHUFFLE");

		btnPod1.setClickable(true);
		btnPod2.setClickable(true);
		btnPod3.setClickable(true);
		btnPod4.setClickable(true);

		if (player1.equals("RAJA")) {

			btnPod1.setText("RAJA");
			btnPod1.setBackgroundResource(R.drawable.podopen);
			btnPod1.setClickable(false);
		}
		if (player2.equals("RAJA")) {

			btnPod2.setText("RAJA");
			btnPod2.setBackgroundResource(R.drawable.podopen);
			btnPod2.setClickable(false);
		}
		if (player3.equals("RAJA")) {

			btnPod3.setText("RAJA");
			btnPod3.setBackgroundResource(R.drawable.podopen);
			btnPod3.setClickable(false);
		}
		if (player4.equals("RAJA")) {

			btnPod4.setText("RAJA");
			btnPod4.setBackgroundResource(R.drawable.podopen);
			btnPod4.setClickable(false);
		}

		if (player1.equals("MANTRI")) {

			btnPod1.setText("MANTRI");
			btnPod1.setBackgroundResource(R.drawable.podopen);
			btnPod1.setClickable(false);
		}
		if (player2.equals("MANTRI")) {

			btnPod2.setText("MANTRI");
			btnPod2.setBackgroundResource(R.drawable.podopen);
			btnPod2.setClickable(false);
		}
		if (player3.equals("MANTRI")) {

			btnPod3.setText("MANTRI");
			btnPod3.setBackgroundResource(R.drawable.podopen);
			btnPod3.setClickable(false);
		}
		if (player4.equals("MANTRI")) {

			btnPod4.setText("MANTRI");
			btnPod4.setBackgroundResource(R.drawable.podopen);
			btnPod4.setClickable(false);

		}

		if (player1_role.equals("MANTRI")) {
			txtTurn.setText(player1_name + " will find the CHOR!");
		}
		if (player2_role.equals("MANTRI")) {
			txtTurn.setText(player2_name + " will find the CHOR!");
		}
		if (player3_role.equals("MANTRI")) {
			txtTurn.setText(player3_name + " will find the CHOR!");
		}
		if (player4_role.equals("MANTRI")) {
			txtTurn.setText(player4_name + " will find the CHOR!");
		}

		Log.v("AkhandBakar", "#########" + btnPod1.getText());

		if (btnPod1.getText().equals("")) {

			btnPod1.setOnClickListener(new OnClickListener() {

				public void onClick(View v) {
					// TODO Auto-generated method stub
					Log.v("AkhandBakar", "#########" + player1);
					if (player1.equals("CHOR")) {

						guess = true;
						btnPod1.setBackgroundResource(R.drawable.podopen);
						btnPod1.setText("CHOR");

					} else {

						guess = false;
						btnPod1.setBackgroundResource(R.drawable.podopen);
						btnPod1.setText("SIPAHI");
					}
					btnPod1.setClickable(false);
					btnPod2.setClickable(false);
					btnPod3.setClickable(false);
					btnPod4.setClickable(false);
					updateScore();
				}
			});
		}

		Log.v("AkhandBakar", "#########" + btnPod2.getText());
		if (btnPod2.getText().equals("")) {

			btnPod2.setOnClickListener(new OnClickListener() {

				public void onClick(View v) {
					// TODO Auto-generated method stub
					Log.v("AkhandBakar", "#########" + player2);
					if (player2.equals("CHOR")) {

						guess = true;
						btnPod2.setBackgroundResource(R.drawable.podopen);
						btnPod2.setText("CHOR");
					} else {

						guess = false;
						btnPod2.setBackgroundResource(R.drawable.podopen);
						btnPod2.setText("SIPAHI");

					}
					btnPod1.setClickable(false);
					btnPod2.setClickable(false);
					btnPod3.setClickable(false);
					btnPod4.setClickable(false);
					updateScore();
				}
			});
		}

		Log.v("AkhandBakar", "#########" + btnPod3.getText());
		if (btnPod3.getText().equals("")) {

			btnPod3.setOnClickListener(new OnClickListener() {

				public void onClick(View v) {
					// TODO Auto-generated method stub
					Log.v("AkhandBakar", "#########" + player3);
					if (player3.equals("CHOR")) {

						guess = true;
						btnPod3.setBackgroundResource(R.drawable.podopen);
						btnPod3.setText("CHOR");
					} else {

						guess = false;
						btnPod3.setBackgroundResource(R.drawable.podopen);
						btnPod3.setText("SIPAHI");

					}
					btnPod1.setClickable(false);
					btnPod2.setClickable(false);
					btnPod3.setClickable(false);
					btnPod4.setClickable(false);
					updateScore();
				}
			});
		}

		Log.v("AkhandBakar", "#########" + btnPod4.getText());
		if (btnPod4.getText().equals("")) {

			btnPod4.setOnClickListener(new OnClickListener() {

				public void onClick(View v) {
					// TODO Auto-generated method stub
					Log.v("AkhandBakar", "#########" + player4);
					if (player4.equals("CHOR")) {

						guess = true;
						btnPod4.setBackgroundResource(R.drawable.podopen);
						btnPod4.setText("CHOR");
					} else {

						guess = false;
						btnPod4.setBackgroundResource(R.drawable.podopen);
						btnPod4.setText("SIPAHI");

					}
					btnPod1.setClickable(false);
					btnPod2.setClickable(false);
					btnPod3.setClickable(false);
					btnPod4.setClickable(false);
					updateScore();
				}
			});
		}

	}

	public void shuffle() {

		btnPlay.setText("Guess");
		btnPlay.setClickable(false);
		shuffleArray(solutionArray);
		txtTurn.setText(player1_name + "'s" + " turn!");
		nextTurn = player2_name;
		btnPod1 = (Button) findViewById(R.id.btnPod1);
		btnPod1.setBackgroundResource(R.drawable.podtlclosed);
		btnPod1.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				player1 = solutionArray[0];
				btnPod1.setText(player1);
				btnPod1.setBackgroundResource(R.drawable.podopen);
				btnPod2.setClickable(false);
				btnPod3.setClickable(false);
				btnPod4.setClickable(false);
				if (txtTurn.getText().equals(player1_name + "'s" + " turn!")) {

					if (player1.equals("MANTRI")) {

						player1_role = "MANTRI";
					}
					if (player1.equals("RAJA")) {

						player1_role = "RAJA";
					}
					if (player1.equals("SIPAHI")) {

						player1_role = "SIPAHI";
					}
					if (player1.equals("CHOR")) {

						player1_role = "CHOR";
					}

					nextTurn = player2_name + "'s" + " turn!";

				}
				if (txtTurn.getText().equals(player2_name + "'s" + " turn!")) {

					if (player1.equals("MANTRI")) {

						player2_role = "MANTRI";
					}
					if (player1.equals("RAJA")) {

						player2_role = "RAJA";
					}
					if (player1.equals("SIPAHI")) {

						player2_role = "SIPAHI";
					}
					if (player1.equals("CHOR")) {

						player2_role = "CHOR";
					}

					nextTurn = player3_name + "'s" + " turn!";

				}
				if (txtTurn.getText().equals(player3_name + "'s" + " turn!")) {

					if (player1.equals("MANTRI")) {

						player3_role = "MANTRI";
					}
					if (player1.equals("RAJA")) {

						player3_role = "RAJA";
					}
					if (player1.equals("SIPAHI")) {

						player3_role = "SIPAHI";
					}
					if (player1.equals("CHOR")) {

						player3_role = "CHOR";
					}

					nextTurn = player4_name + "'s" + " turn!";

				}

				if (txtTurn.getText().equals(player4_name + "'s" + " turn!")) {

					if (player1.equals("MANTRI")) {

						player4_role = "MANTRI";
					}
					if (player1.equals("RAJA")) {

						player4_role = "RAJA";
					}
					if (player1.equals("SIPAHI")) {

						player4_role = "SIPAHI";
					}
					if (player1.equals("CHOR")) {

						player4_role = "CHOR";
					}

					nextTurn = "Click on Guess!";

				}

				txtTurn.setText("Click again to close the chit!");

				btnPod1.setOnClickListener(new OnClickListener() {

					public void onClick(View v) {
						// TODO Auto-generated method stub
						btnPod1.setClickable(false);
						count++;
						btnPod1.setText("");
						btnPod1.setBackgroundResource(R.drawable.podtlhalf);
						txtTurn.setText(nextTurn);
						btnPod2.setClickable(true);
						btnPod3.setClickable(true);
						btnPod4.setClickable(true);
						if (count == 4) {

							txtTurn.setText("Click on Guess!");
							btnPlay.setClickable(true);
							count = 0;

						}
					}
				});
			}
		});

		btnPod2 = (Button) findViewById(R.id.btnPod2);
		btnPod2.setBackgroundResource(R.drawable.podtrclosed);
		btnPod2.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				player2 = solutionArray[1];
				btnPod2.setText(player2);
				btnPod2.setBackgroundResource(R.drawable.podopen);
				btnPod1.setClickable(false);
				btnPod3.setClickable(false);
				btnPod4.setClickable(false);
				if (txtTurn.getText().equals(player1_name + "'s" + " turn!")) {

					if (player2.equals("MANTRI")) {

						player1_role = "MANTRI";
					}
					if (player2.equals("RAJA")) {

						player1_role = "RAJA";
					}
					if (player2.equals("SIPAHI")) {

						player1_role = "SIPAHI";
					}
					if (player2.equals("CHOR")) {

						player1_role = "CHOR";
					}

					nextTurn = player2_name + "'s" + " turn!";

				}
				if (txtTurn.getText().equals(player2_name + "'s" + " turn!")) {

					if (player2.equals("MANTRI")) {

						player2_role = "MANTRI";
					}
					if (player2.equals("RAJA")) {

						player2_role = "RAJA";
					}
					if (player2.equals("SIPAHI")) {

						player2_role = "SIPAHI";
					}
					if (player2.equals("CHOR")) {

						player2_role = "CHOR";
					}

					nextTurn = player3_name + "'s" + " turn!";

				}
				if (txtTurn.getText().equals(player3_name + "'s" + " turn!")) {

					if (player2.equals("MANTRI")) {

						player3_role = "MANTRI";
					}
					if (player2.equals("RAJA")) {

						player3_role = "RAJA";
					}
					if (player2.equals("SIPAHI")) {

						player3_role = "SIPAHI";
					}
					if (player2.equals("CHOR")) {

						player3_role = "CHOR";
					}

					nextTurn = player4_name + "'s" + " turn!";

				}
				if (txtTurn.getText().equals(player4_name + "'s" + " turn!")) {

					if (player2.equals("MANTRI")) {

						player4_role = "MANTRI";
					}
					if (player2.equals("RAJA")) {

						player4_role = "RAJA";
					}
					if (player2.equals("SIPAHI")) {

						player4_role = "SIPAHI";
					}
					if (player2.equals("CHOR")) {

						player4_role = "CHOR";
					}

					nextTurn = "Click on Guess!";

				}
				txtTurn.setText("Click again to close the chit!");
				btnPod2.setOnClickListener(new OnClickListener() {

					public void onClick(View v) {
						// TODO Auto-generated method stub
						btnPod2.setClickable(false);
						count++;
						btnPod2.setText("");
						btnPod2.setBackgroundResource(R.drawable.podtrhalf);
						txtTurn.setText(nextTurn);
						btnPod1.setClickable(true);
						btnPod3.setClickable(true);
						btnPod4.setClickable(true);
						if (count == 4) {

							txtTurn.setText("Click on Guess!");
							btnPlay.setClickable(true);
							count = 0;

						}
					}
				});
			}
		});

		btnPod3 = (Button) findViewById(R.id.btnPod3);
		btnPod3.setBackgroundResource(R.drawable.podblclosed);
		btnPod3.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				player3 = solutionArray[2];
				btnPod3.setText(player3);
				btnPod3.setBackgroundResource(R.drawable.podopen);

				btnPod2.setClickable(false);
				btnPod1.setClickable(false);
				btnPod4.setClickable(false);
				if (txtTurn.getText().equals(player1_name + "'s" + " turn!")) {

					if (player3.equals("MANTRI")) {

						player1_role = "MANTRI";
					}
					if (player3.equals("RAJA")) {

						player1_role = "RAJA";
					}
					if (player3.equals("SIPAHI")) {

						player1_role = "SIPAHI";
					}
					if (player3.equals("CHOR")) {

						player1_role = "CHOR";
					}

					nextTurn = player2_name + "'s" + " turn!";

				}
				if (txtTurn.getText().equals(player2_name + "'s" + " turn!")) {

					if (player3.equals("MANTRI")) {

						player2_role = "MANTRI";
					}
					if (player3.equals("RAJA")) {

						player2_role = "RAJA";
					}
					if (player3.equals("SIPAHI")) {

						player2_role = "SIPAHI";
					}
					if (player3.equals("CHOR")) {

						player2_role = "CHOR";
					}

					nextTurn = player3_name + "'s" + " turn!";

				}
				if (txtTurn.getText().equals(player3_name + "'s" + " turn!")) {

					if (player3.equals("MANTRI")) {

						player3_role = "MANTRI";
					}
					if (player3.equals("RAJA")) {

						player3_role = "RAJA";
					}
					if (player3.equals("SIPAHI")) {

						player3_role = "SIPAHI";
					}
					if (player3.equals("CHOR")) {

						player3_role = "CHOR";
					}
					nextTurn = player4_name + "'s" + " turn!";

				}
				if (txtTurn.getText().equals(player4_name + "'s" + " turn!")) {

					if (player3.equals("MANTRI")) {

						player4_role = "MANTRI";
					}
					if (player3.equals("RAJA")) {

						player4_role = "RAJA";
					}
					if (player3.equals("SIPAHI")) {

						player4_role = "SIPAHI";
					}
					if (player3.equals("CHOR")) {

						player4_role = "CHOR";
					}
					nextTurn = "Click on Guess!";

				}

				txtTurn.setText("Click again to close the chit!");
				btnPod3.setOnClickListener(new OnClickListener() {

					public void onClick(View v) {
						// TODO Auto-generated method stub
						btnPod3.setClickable(false);
						count++;
						btnPod3.setText("");
						btnPod3.setBackgroundResource(R.drawable.podblhalf);
						txtTurn.setText(nextTurn);
						btnPod2.setClickable(true);
						btnPod1.setClickable(true);
						btnPod4.setClickable(true);
						if (count == 4) {

							txtTurn.setText("Click on Guess!");
							btnPlay.setClickable(true);
							count = 0;

						}
					}
				});
			}
		});

		btnPod4 = (Button) findViewById(R.id.btnPod4);
		btnPod4.setBackgroundResource(R.drawable.podbrclosed);

		btnPod4.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				player4 = solutionArray[3];
				btnPod4.setText(player4);
				btnPod4.setBackgroundResource(R.drawable.podopen);

				btnPod2.setClickable(false);
				btnPod3.setClickable(false);
				btnPod1.setClickable(false);
				if (txtTurn.getText().equals(player1_name + "'s" + " turn!")) {

					if (player4.equals("MANTRI")) {

						player1_role = "MANTRI";
					}
					if (player4.equals("RAJA")) {

						player1_role = "RAJA";
					}
					if (player4.equals("SIPAHI")) {

						player1_role = "SIPAHI";
					}
					if (player4.equals("CHOR")) {

						player1_role = "CHOR";
					}
					nextTurn = player2_name + "'s" + " turn!";

				}
				if (txtTurn.getText().equals(player2_name + "'s" + " turn!")) {

					if (player4.equals("MANTRI")) {

						player2_role = "MANTRI";
					}
					if (player4.equals("RAJA")) {

						player2_role = "RAJA";
					}
					if (player4.equals("SIPAHI")) {

						player2_role = "SIPAHI";
					}
					if (player4.equals("CHOR")) {

						player2_role = "CHOR";
					}
					nextTurn = player3_name + "'s" + " turn!";

				}
				if (txtTurn.getText().equals(player3_name + "'s" + " turn!")) {

					if (player4.equals("MANTRI")) {

						player3_role = "MANTRI";
					}
					if (player4.equals("RAJA")) {

						player3_role = "RAJA";
					}
					if (player4.equals("SIPAHI")) {

						player3_role = "SIPAHI";
					}
					if (player4.equals("CHOR")) {

						player3_role = "CHOR";
					}
					nextTurn = player4_name + "'s" + " turn!";

				}
				if (txtTurn.getText().equals(player4_name + "'s" + " turn!")) {

					if (player4.equals("MANTRI")) {

						player4_role = "MANTRI";
					}
					if (player4.equals("RAJA")) {

						player4_role = "RAJA";
					}
					if (player4.equals("SIPAHI")) {

						player4_role = "SIPAHI";
					}
					if (player4.equals("CHOR")) {

						player4_role = "CHOR";
					}
					nextTurn = "Click on Guess!";

				}

				txtTurn.setText("Click again to close the chit!");
				btnPod4.setOnClickListener(new OnClickListener() {

					public void onClick(View v) {
						// TODO Auto-generated method stub
						btnPod4.setClickable(false);
						count++;
						btnPod4.setText("");
						btnPod4.setBackgroundResource(R.drawable.podbrhalf);
						txtTurn.setText(nextTurn);
						btnPod2.setClickable(true);
						btnPod3.setClickable(true);
						btnPod1.setClickable(true);
						if (count == 4) {

							txtTurn.setText(nextTurn);
							btnPlay.setClickable(true);
							count = 0;

						}
					}
				});
			}
		});

		btnPod1.setText("");
		btnPod2.setText("");
		btnPod3.setText("");
		btnPod4.setText("");

	}

	public void setRole(String role, String player) {

		if (player1.equals("MANTRI")) {

			player4_role = "MANTRI";
		}
		if (player1.equals("RAJA")) {

			player4_role = "RAJA";
		}
		if (player1.equals("SIPAHI")) {

			player4_role = "SIPAHI";
		}
		if (player1.equals("CHOR")) {

			player4_role = "CHOR";
		}

	}

	void shuffleArray(String[] solutionArray) {
		Random rnd = new Random();
		for (int i = solutionArray.length - 1; i >= 0; i--) {
			int index = rnd.nextInt(i + 1);

			String a = solutionArray[index];
			solutionArray[index] = solutionArray[i];
			solutionArray[i] = a;
		}
	}

	void updateScore() {

		int p1score = 0;
		int p2score = 0;
		int p3score = 0;
		int p4score = 0;
		int i, j, k, l;
		Log.v("AkhandBakar", "##########" + guess);
		if (player1_role.equals("MANTRI")) {

			Log.v("AkhandBakar", "##########Mantri" + player1_name);
			if (guess) {
				i = i + 80;

				p1score = i;
				txtTurn.setText(player1_name + " is right!");
				btnPod1.setText(player1);
				btnPod2.setText(player2);
				btnPod3.setText(player3);
				btnPod4.setText(player4);
				btnPod1.setBackgroundResource(R.drawable.podopen);
				btnPod2.setBackgroundResource(R.drawable.podopen);
				btnPod3.setBackgroundResource(R.drawable.podopen);
				btnPod4.setBackgroundResource(R.drawable.podopen);
				if (player2_role.equals("CHOR")) {
					p2score = j;
					if (player3_role.equals("RAJA")) {

						k = k + 100;
						l = l + 50;
						p3score = k;
						p4score = l;
					} else {

						l = l + 100;
						k = k + 50;
						p4score = l;
						p3score = k;
					}
				}
				if (player3_role.equals("CHOR")) {

					p3score = k;

					if (player2_role.equals("RAJA")) {

						j = j + 100;
						l = l + 50;
						p2score = j;
						p4score = l;
					} else {

						l = l + 100;
						j = j + 50;
						p4score = l;
						p2score = j;
					}
				}
				if (player4_role.equals("CHOR")) {

					p4score = l;

					if (player3_role.equals("RAJA")) {

						k = k + 100;
						j = j + 50;
						p2score = j;
						p3score = k;
					} else {

						j = j + 100;
						k = k + 50;
						p3score = k;
						p2score = j;
					}
				}
			} else {
				i = i - 80;
				p1score = i;
				txtTurn.setText(player1_name + " is wrong!");
				btnPod1.setText(player1);
				btnPod2.setText(player2);
				btnPod3.setText(player3);
				btnPod4.setText(player4);
				btnPod1.setBackgroundResource(R.drawable.podopen);
				btnPod2.setBackgroundResource(R.drawable.podopen);
				btnPod3.setBackgroundResource(R.drawable.podopen);
				btnPod4.setBackgroundResource(R.drawable.podopen);
				if (player2_role.equals("CHOR")) {
					j = j + 25;
					p2score = j;
					if (player3_role.equals("RAJA")) {

						k = k + 100;
						l = l + 50;
						p3score = k;
						p4score = l;
					} else {

						l = l + 100;
						k = k + 50;
						p4score = l;
						p3score = k;
					}
				}
				if (player3_role.equals("CHOR")) {
					k = k + 25;
					p3score = k;

					if (player2_role.equals("RAJA")) {

						j = j + 100;
						l = l + 50;
						p2score = j;
						p4score = l;
					} else {

						l = l + 100;
						j = j + 50;
						p4score = l;
						p2score = j;
					}
				}
				if (player4_role.equals("CHOR")) {
					l = l + 25;
					p4score = l;

					if (player3_role.equals("RAJA")) {

						k = k + 100;
						j = j + 50;
						p2score = j;
						p3score = k;
					} else {

						j = j + 100;
						k = k + 50;
						p3score = k;
						p2score = j;
					}
				}
			}

		}
		if (player2_role.equals("MANTRI")) {
			if (guess) {
				Log.v("AkhandBakar", "##########Mantri" + player2_name);
				j = j + 80;
				p2score = j;
				txtTurn.setText(player2_name + " is right!");
				btnPod1.setText(player1);
				btnPod2.setText(player2);
				btnPod3.setText(player3);
				btnPod4.setText(player4);
				btnPod1.setBackgroundResource(R.drawable.podopen);
				btnPod2.setBackgroundResource(R.drawable.podopen);
				btnPod3.setBackgroundResource(R.drawable.podopen);
				btnPod4.setBackgroundResource(R.drawable.podopen);
				if (player1_role.equals("CHOR")) {
					p1score = i;

					if (player3_role.equals("RAJA")) {

						k = k + 100;
						l = l + 50;
						p3score = k;
						p4score = l;

					} else {

						l = l + 100;
						k = k + 50;
						p4score = l;
						p3score = k;
					}

				}
				if (player3_role.equals("CHOR")) {

					p3score = k;

					if (player1_role.equals("RAJA")) {

						i = i + 100;
						l = l + 50;
						p1score = i;
						p4score = l;

					} else {

						l = l + 100;
						i = i + 50;
						p1score = i;
						p4score = l;

					}

				}
				if (player4_role.equals("CHOR")) {

					p4score = l;

					if (player1_role.equals("RAJA")) {

						i = i + 100;
						k = k + 50;
						p1score = i;
						p3score = k;

					} else {

						k = k + 100;
						i = i + 50;
						p1score = i;
						p3score = k;

					}

				}
			} else {

				j = j - 80;
				p2score = j;
				txtTurn.setText(player2_name + " is wrong!");
				btnPod1.setText(player1);
				btnPod2.setText(player2);
				btnPod3.setText(player3);
				btnPod4.setText(player4);
				btnPod1.setBackgroundResource(R.drawable.podopen);
				btnPod2.setBackgroundResource(R.drawable.podopen);
				btnPod3.setBackgroundResource(R.drawable.podopen);
				btnPod4.setBackgroundResource(R.drawable.podopen);
				if (player1_role.equals("CHOR")) {
					i = i + 25;
					p1score = i;

					if (player3_role.equals("RAJA")) {

						k = k + 100;
						l = l + 50;
						p3score = k;
						p4score = l;

					} else {

						l = l + 100;
						k = k + 50;
						p4score = l;
						p3score = k;
					}

				}
				if (player3_role.equals("CHOR")) {
					k = k + 25;
					p3score = k;

					if (player1_role.equals("RAJA")) {

						i = i + 100;
						l = l + 50;
						p1score = i;
						p4score = l;

					} else {

						l = l + 100;
						i = i + 50;
						p1score = i;
						p4score = l;

					}

				}
				if (player4_role.equals("CHOR")) {
					l = l + 25;
					p4score = l;

					if (player1_role.equals("RAJA")) {

						i = i + 100;
						k = k + 50;
						p1score = i;
						p3score = k;

					} else {

						k = k + 100;
						i = i + 50;
						p1score = i;
						p3score = k;

					}

				}
			}

		}
		if (player3_role.equals("MANTRI")) {
			Log.v("AkhandBakar", "##########Mantri" + player3_name);
			if (guess) {
				k = k + 80;
				p3score = k;
				txtTurn.setText(player3_name + " is right!");
				btnPod1.setText(player1);
				btnPod2.setText(player2);
				btnPod3.setText(player3);
				btnPod4.setText(player4);
				btnPod1.setBackgroundResource(R.drawable.podopen);
				btnPod2.setBackgroundResource(R.drawable.podopen);
				btnPod3.setBackgroundResource(R.drawable.podopen);
				btnPod4.setBackgroundResource(R.drawable.podopen);
				if (player1_role.equals("CHOR")) {
					p1score = i;

					if (player2_role.equals("RAJA")) {

						j = j + 100;
						l = l + 50;
						p2score = j;
						p4score = l;

					} else {

						l = l + 100;
						j = j + 50;
						p2score = j;
						p4score = l;

					}

				}
				if (player2_role.equals("CHOR")) {

					p2score = j;

					if (player1_role.equals("RAJA")) {

						i = i + 100;
						l = l + 50;
						p1score = i;
						p4score = l;

					} else {

						i = i + 50;
						l = l + 100;
						p1score = i;
						p4score = l;

					}

				}
				if (player4_role.equals("CHOR")) {

					p4score = l;

					if (player2_role.equals("RAJA")) {

						j = j + 100;
						i = i + 50;
						p1score = i;
						p2score = j;

					} else {

						j = j + 50;
						i = i + 100;
						p1score = i;
						p2score = j;

					}

				}
			} else {
				k = k - 80;
				p3score = k;
				txtTurn.setText(player3_name + " is wrong!");
				btnPod1.setText(player1);
				btnPod2.setText(player2);
				btnPod3.setText(player3);
				btnPod4.setText(player4);
				btnPod1.setBackgroundResource(R.drawable.podopen);
				btnPod2.setBackgroundResource(R.drawable.podopen);
				btnPod3.setBackgroundResource(R.drawable.podopen);
				btnPod4.setBackgroundResource(R.drawable.podopen);
				if (player1_role.equals("CHOR")) {
					i = i + 25;
					p1score = i;

					if (player2_role.equals("RAJA")) {

						j = j + 100;
						l = l + 50;
						p2score = j;
						p4score = l;

					} else {

						l = l + 100;
						j = j + 50;
						p2score = j;
						p4score = l;

					}

				}
				if (player2_role.equals("CHOR")) {
					j = j + 25;
					p2score = j;

					if (player1_role.equals("RAJA")) {

						i = i + 100;
						l = l + 50;
						p1score = i;
						p4score = l;

					} else {

						i = i + 50;
						l = l + 100;
						p1score = i;
						p4score = l;

					}

				}
				if (player4_role.equals("CHOR")) {
					l = l + 25;
					p4score = l;

					if (player2_role.equals("RAJA")) {

						j = j + 100;
						i = i + 50;
						p1score = i;
						p2score = j;

					} else {

						j = j + 50;
						i = i + 100;
						p1score = i;
						p2score = j;

					}

				}
			}

		}
		if (player4_role.equals("MANTRI")) {
			Log.v("AkhandBakar", "##########Mantri" + player4_name);
			if (guess) {
				l = l + 80;
				p4score = l;
				txtTurn.setText(player4_name + " is right!");
				btnPod1.setText(player1);
				btnPod2.setText(player2);
				btnPod3.setText(player3);
				btnPod4.setText(player4);
				btnPod1.setBackgroundResource(R.drawable.podopen);
				btnPod2.setBackgroundResource(R.drawable.podopen);
				btnPod3.setBackgroundResource(R.drawable.podopen);
				btnPod4.setBackgroundResource(R.drawable.podopen);
				if (player1_role.equals("CHOR")) {
					p1score = i;

					if (player2_role.equals("RAJA")) {

						j = j + 100;
						k = k + 50;
						p2score = j;
						p3score = k;

					} else {

						j = j + 50;
						k = k + 100;
						p2score = j;
						p3score = k;

					}
				}
				if (player2_role.equals("CHOR")) {

					p2score = j;

					if (player1_role.equals("RAJA")) {

						i = i + 100;
						k = k + 50;
						p1score = i;
						p3score = k;
					} else {

						i = i + 50;
						k = k + 100;
						p1score = i;
						p3score = k;

					}

				}
				if (player3_role.equals("CHOR")) {

					p3score = k;

					if (player1_role.equals("RAJA")) {

						i = i + 100;
						j = j + 50;
						p1score = i;
						p2score = j;
					} else {

						i = i + 50;
						j = j + 100;
						p1score = i;
						p2score = j;

					}

				}
			} else {
				l = l - 80;
				p4score = l;
				txtTurn.setText(player4_name + " is wrong!");
				btnPod1.setText(player1);
				btnPod2.setText(player2);
				btnPod3.setText(player3);
				btnPod4.setText(player4);
				btnPod1.setBackgroundResource(R.drawable.podopen);
				btnPod2.setBackgroundResource(R.drawable.podopen);
				btnPod3.setBackgroundResource(R.drawable.podopen);
				btnPod4.setBackgroundResource(R.drawable.podopen);
				if (player1_role.equals("CHOR")) {
					i = i + 25;
					p1score = i;

					if (player2_role.equals("RAJA")) {

						j = j + 100;
						k = k + 50;
						p2score = j;
						p3score = k;

					} else {

						j = j + 50;
						k = k + 100;
						p2score = j;
						p3score = k;

					}
				}
				if (player2_role.equals("CHOR")) {
					j = j + 25;
					p2score = j;

					if (player1_role.equals("RAJA")) {

						i = i + 100;
						k = k + 50;
						p1score = i;
						p3score = k;
					} else {

						i = i + 50;
						k = k + 100;
						p1score = i;
						p3score = k;

					}

				}
				if (player3_role.equals("CHOR")) {
					k = k + 25;
					p3score = k;

					if (player1_role.equals("RAJA")) {

						i = i + 100;
						j = j + 50;
						p1score = i;
						p2score = j;
					} else {

						i = i + 50;
						j = j + 100;
						p1score = i;
						p2score = j;

					}

				}
			}

		}

		Log.v("AkhandBakar", "##########Score " + i);
		txtPlayer1.setText("1." + player1_name + " [" + i + "]");
		Log.v("AkhandBakar", player1 + " [" + i + "]");

		txtPlayer2.setText("2." + player2_name + " [" + j + "]");

		Log.v("AkhandBakar", player2 + " [" + p2score + "]");

		txtPlayer3.setText("3." + player3_name + " [" + k + "]");
		Log.v("AkhandBakar", player3 + " [" + p3score + "]");

		txtPlayer4.setText("4." + player4_name + " [" + l + "]");
		Log.v("AkhandBakar", player4 + " [" + p4score + "]");
	}
}
