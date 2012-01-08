package com.github.jonaldomo.DriversLicenseManuals;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class DriversLicenseManualsActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ListView lv = (ListView) findViewById(R.id.list);
		lv.setTextFilterEnabled(true);

		String[] menuItems = getResources().getStringArray(R.array.states);
		lv.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item,
				menuItems));

		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Intent i;
				switch ((int) id) {
				case 0:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2ZmUzMDFhODItMTRhZS00ZDdhLThhOWYtMzNkNzlmN2JlYjQ2"));
					startActivity(i);
					break;
				case 1:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2ZWQwN2M2MDQtZDMxNi00ODU3LTkwMTYtMTkwNzIzMTQ2ZjY4"));
					startActivity(i);
					break;
				case 2:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2NjI5NjU4ZTktN2FiZi00ZDFiLThkNTEtZjE3MzczYTY1YTQ1"));
					startActivity(i);
					break;
				case 3:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2ODkxNThlNmQtNjk2OS00MTBlLWE2ZjUtN2U2N2I4NDMyMjk2"));
					startActivity(i);
					break;
				case 4:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2YmI5MjEzYTMtNjc2NC00ZmI3LWJmM2QtNWExNWZiMjg2MzA2"));
					startActivity(i);
					break;
				case 5:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2NTRhZmVkMDAtODU0MS00NjY2LTlkNTAtNzgxNjdhN2RhZDkx"));
					startActivity(i);
					break;
				case 6:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2YTBjM2EyYWMtYWRjOC00MGI3LTlkMDEtMzQ0YWE3Mzg5MzVi"));
					startActivity(i);
					break;
				case 7:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2YWY4ZmNmOGEtMjI1OS00ZWFhLWJlMWUtMWNjMWRmYjE3YmU3"));
					startActivity(i);
					break;
				case 8:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2ZWZkZmQyZTItMzE0ZC00YWQyLWFlNzUtZGFjNDllMjJiZmU0"));
					startActivity(i);
					break;
				case 9:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2NTI5N2VlMmEtOGVhMy00MjU3LWJiMjMtOGQ2YzJkZmE3ZDgy"));
					startActivity(i);
					break;
				case 10:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2ZmYxODRlNTQtZTBhZC00ZTNlLWFlMmMtM2QyZjc1M2M3Yjg1"));
					startActivity(i);
					break;
				case 11:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2YWRlODhhYzItMDc0Ny00N2FlLTkxMTAtYWMzNzYzZWIxM2Vh"));
					startActivity(i);
					break;
				case 12:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2NjJiNDY0MWItMzdmZC00MWFmLTk0ZDItMmE4OTBiNzg5ZmNj"));
					startActivity(i);
					break;
				case 13:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2NTkyNzgxNWUtYjIwNC00MjQ1LTkwOTYtZTBkOTFjODk5NjVm"));
					startActivity(i);
					break;
				case 14:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2YjUyZDgyN2MtOWU5Yy00MzZiLTgxOTktODhmMGZhZjU3N2Yy"));
					startActivity(i);
					break;
				case 15:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2NzllMDA4ODEtZjAyNS00OGU5LTkxOWEtZTE5Y2VlYTRiNzFh"));
					startActivity(i);
					break;
				case 16:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2Y2I1YmIwMTgtMWQyMC00OTQxLThjMmYtODA4ZjZhNWQ5NTg0"));
					startActivity(i);
					break;
				case 17:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2ZjUyMzdlYTYtYTgyYy00MGE2LWFjNDMtNTU5MDhlNjM0MTcy"));
					startActivity(i);
					break;
				case 18:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2ODg1ODA5ZDItY2NjMS00ZTNkLWE5ZmEtYTMyYTM2NDgxMzkw"));
					startActivity(i);
					break;
				case 19:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2Yzg4ODNkNDAtMzBjNS00NmRjLWE2ODYtZDlhMGU0NDI0Yjk5"));
					startActivity(i);
					break;
				case 20:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2ZWUyNmJhMmQtNGRmMS00MmI5LWJlM2ItNTI1OGM0NjljZjZj"));
					startActivity(i);
					break;
				case 21:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2ZDliNDg2ZGItNmFlMS00YTM3LWFjZGEtOGZjYWRlMzg3MDBl"));
					startActivity(i);
					break;
				case 22:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2ZDdmMzZiYWMtMzY3My00MzBmLTkyZDYtYTRjNTY0NGFhYjQw"));
					startActivity(i);
					break;
				case 23:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2NTZjYzA4NzctNTcxOS00OTEyLTliMDEtMzRmZDliOTdhYjdj"));
					startActivity(i);
					break;
				case 24:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2ZTM0OTZmMjQtOGFmMS00MWZlLWJiN2QtMzEwZDI1ZDI0NjZk"));
					startActivity(i);
					break;
				case 25:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2OTQ0OGRlYTMtZDRkMy00MGEzLWI5YTAtMGZhZWMzODc2YmEz"));
					startActivity(i);
					break;
				case 26:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2MmMwZTBlZjEtMjA0Ni00YzE5LTk3YTAtZjczNDI5NDU5NGFh"));
					startActivity(i);
					break;
				case 27:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2Mzg0MGFiY2UtZGUzYy00ZjI2LTk5OWEtMWI0YTIzNDYxNTY4"));
					startActivity(i);
					break;
				case 28:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2NmViMTAzODQtNzBjYi00ZGQzLWE0OGMtY2M4MjA1NjYyN2Ji"));
					startActivity(i);
					break;
				case 29:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2MDBiOWZkMDktZGI3Zi00ZDM3LTlhZDAtYmVjYjNmNmMwZDBm"));
					startActivity(i);
					break;
				case 30:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2MzBlYjNhMGUtMTY5OC00NDc2LTkwOTktMGI0NWFiOTcxOGQz"));
					startActivity(i);
					break;
				case 31:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2NGI0M2QyMWMtY2Q1YS00N2RjLWEyZTMtZWNlYjI2NjRlOTA3"));
					startActivity(i);
					break;
				case 32:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2YzM3NjZiNTUtYWM4My00MzlmLThlMjctYWFiMzRiOGUyMjZh"));
					startActivity(i);
					break;
				case 33:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2M2NmYzZmYTUtNmRkMy00M2Y2LTg3NzAtY2ExMTIwZjFhYWE0"));
					startActivity(i);
					break;
				case 34:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2OTg0MTg1M2EtZmI5NC00MmYyLWI4MTYtODc3ODgyYjY0Yzg3"));
					startActivity(i);
					break;
				case 35:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2MzVmYjZkOTItZGU4Zi00ODgyLWE2MTUtZDgxOGExYjUxYWE0"));
					startActivity(i);
					break;
				case 36:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2MmVjMWE5MDAtZTQwZC00NmI4LWIwNDAtMTRjZjRhZTBkYmUw"));
					startActivity(i);
					break;
				case 37:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2NTIyNWFkOWItYWJmZi00MmI3LWJkY2UtYTBjNjgwOWE1Zjlk"));
					startActivity(i);
					break;
				case 38:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2OTExY2NmZDktMmVmNi00YmI5LTgxYTQtMTJmNTU0ZDcxMTI4"));
					startActivity(i);
					break;
				case 39:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2NWE0YzBlOTYtMWYyNy00ZDJkLWE4YjktMzIyOTY4YmNlYTYw"));
					startActivity(i);
					break;
				case 40:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2MGM1OTUzNWUtYzY5MS00NWJlLWE1NTUtYjYzYTMzNWFmMTJi"));
					startActivity(i);
					break;
				case 41:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2OWY1NWNiNjQtNzJlNy00NTY0LTkwYTItNGUxM2EwMjc3OWY5"));
					startActivity(i);
					break;
				case 42:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2MDE2MmYzNWQtNTUzZi00MWE5LWE3OTAtMWIwNjRhYzBmNzdl"));
					startActivity(i);
					break;
				case 43:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2YjkxZGIyOGMtZjk0My00OTA4LWJmNjUtMDMzZWQyM2VhM2Y2"));
					startActivity(i);
					break;
				case 44:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2YTJhZGQ2MDEtM2U0Zi00NDliLWJlZDYtOGI5ZmI0NzYzNTVj"));
					startActivity(i);
					break;
				case 45:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2YjExYjAzZWYtZjMwMi00MmZhLTkzMmUtZWNiZDM3ZDczODVh"));
					startActivity(i);
					break;
				case 46:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2MDAzNTUyNmUtMTU3Ni00MTNlLTk5NjctODIyZTdlYjVjZDEx"));
					startActivity(i);
					break;
				case 47:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2MDlkY2Y5ODktNzA2Yi00MTAzLTlmZDQtZTY2MDhmMzAxNzE4"));
					startActivity(i);
					break;
				case 48:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2MDg4MGFmNGItYTBhMC00N2Y4LWIwZjEtZmVmZTZmMWUzOGI3"));
					startActivity(i);
					break;
				case 49:
					i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse("https://docs.google.com/open?id=0B-CXsm6IapM2N2VhZDIzYTUtNzhjMy00ZGE1LWFlNTMtMWExMzJmMzJhNWU1"));
					startActivity(i);
					break;
				}
			}
		});
	}
}