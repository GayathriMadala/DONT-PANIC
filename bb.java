package com.example.haasikapuram.dontpanic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class bb extends AppCompatActivity {
    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHash;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bb);

        listView = (ExpandableListView) findViewById(R.id.ex);
        initData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listHash);
        listView.setAdapter(listAdapter);


    }

    private void initData() {
        listDataHeader = new ArrayList<String>();
        listHash = new HashMap<String, List<String>>();


        listDataHeader.add("Social Service Blood Bank ");
        listDataHeader.add("Habib Mustafa Khan Blood Bank");
        listDataHeader.add("Chiranjeevi Eye & Blood Bank");
        listDataHeader.add("Gandhi Hospital");
        listDataHeader.add("Institute Of Preventive Medicine & Health Labs");
        listDataHeader.add("Central Blood Bank");
        listDataHeader.add("Itmr Speciality Diagnostics");
        listDataHeader.add("Lions Club Blood Bank");
        listDataHeader.add("Itmr Blood Bank");
        listDataHeader.add("Gene Blood Bank");
        listDataHeader.add("Doctors Blood Bank");
        listDataHeader.add("Mythri Blood Bank");
        listDataHeader.add("Suraksha Blood Bank");
        listDataHeader.add("Sanjeevani Blood Bank");
        listDataHeader.add("Janani Voluntary Blood Bank");
        listDataHeader.add("Rudhira Voluntary Blood Bank");
        listDataHeader.add("Navjeevan Blood Bank");
        listDataHeader.add("Seha Blood Bank");
        listDataHeader.add("Balanagar Blood Bank");
        listDataHeader.add("Mythri Charitable Turst Blood Bank & Transfusion");
        listDataHeader.add("Rajyalaxmi Charitable Trust Blood Bank");
        listDataHeader.add("Kamineni Blood Bank");
        listDataHeader.add("Medwin Blood Bank");
        listDataHeader.add("Asian Blood Bank Of Asian Health Foundation");
        listDataHeader.add("Bhanji Kheraji Blood Bank");
        listDataHeader.add("Matadin Goel Blood Bank");
        listDataHeader.add("Sureksha Blood Bank");
        listDataHeader.add("Bhagyanagar Blood Bank");
        listDataHeader.add("Red Cross Blood Bank");
        listDataHeader.add("Seva Blood Bank");

        List<String> u1 = new ArrayList<String>();
        u1.add("9-1-127/1/D/1, Adj To Madhava Nursing Home, Lane Opp St Marys Church, S D Road, Hyderabad - 500003");
        u1.add("Call: +(91)-(40)-,64606048,64505032 +(91)-9985409444");

        List<String> u2 = new ArrayList<>();
        u2.add("9-1-127/1/D/1, Opp St Mary`s Church, Adj To Madhava Nursing Home Lane, S D Road, Hyderabad - 500003");
        u2.add("Call: +(91)-9247320088,9291506708");

        List<String> u3 = new ArrayList<>();
        u3.add("Near Check Post, Jubilee Hills, Hyderabad - 500034");
        u3.add("Call: +(91)-(40)-23554849,23559555,23359066 +(91)-9246547914\t+(91)-(40)-23555005,23552925");

        List<String> u4 = new ArrayList<>();
        u4.add("Main Road, Musheerabad, Hyderabad - 500048");
        u4.add("Call: +(91)-(40)-27505566,27510053,27510052,27510051");

        List<String> u5 = new ArrayList<>();
        u5.add("Narayanguda, Hyderabad - 500029");
        u5.add("Call: +(91)-(40)-27567892,27557733,27557700\t");

        List<String> u6 = new ArrayList<>();
        u6.add("Narayanguda, Hyderabad - 500029");
        u6.add("Call: +(91)-(40)-27567892,27567893,27567894");

        List<String> u7 = new ArrayList<>();
        u7.add("Road No 1, Opp Banjara Park, Next To Electricity Office, Banjara Hills, Hyderabad - 500034");
        u7.add("Call: +(91)-(40)-23373747,66663239,23395513");

        List<String> u8 = new ArrayList<>();
        u8.add("3-6-20 Tirumala Apts, Skyline Cinema Hall Lane, Basheerbagh, Hyderabad - 500029");
        u8.add("Call: +(91)-(40)-23226624");

        List<String> u9 = new ArrayList<>();
        u9.add("Opp Jalagam Vengal Rao Park, Rd No 1, Banjara Hills, Hyderabad - 50003");
        u9.add("Call: +(91)-(40)-23319491,23328956\t+(91)-9866098102");

        List<String> u10 = new ArrayList<>();
        u10.add("Kanthisikara Cmplx, Opp Model House, Panjagutta, Hyderabad - 500004");
        u10.add("Call: +(91)-(40)-23411658,23403882,23300887");

        List<String> u11 = new ArrayList<>();
        u11.add("16/8/923 Cellar Sri Sai Towers, Nalgonda X Road, Below Sbi, Malakpet, Hyderabad - 500036\n");
        u11.add("Call: +(91)-(40)-24570405,24572195,23703627");

        List<String> u12 = new ArrayList<>();
        u12.add("Ameerpet, Hyderabad - 500016");
        u12.add("Call: +(91)-(40)-23757018");

        List<String> u13 = new ArrayList<>();
        u13.add("3-6-147/2, Opp HDFC Bank, Road No 17 Liberty Road, Himayat Nagar, Hyderabad - 500029");
        u13.add("Call: +(91)-(40)-64547363,23236768,23223168,23226979");

        List<String> u14 = new ArrayList<>();
        u14.add("1-1-79/A Bhagyanagar Complex, Rtc X Roads, Hyderabad - 500020");
        u14.add("Call: +(91)-(40)-27667500,65522343, +(91)-9246508593");

        List<String> u15 = new ArrayList<>();
        u15.add("9-1-52 To 56 1st Floor Siddula House, Above Bata Showroom Opp Basera Hotel, S D Road, Hyderabad - 500003");
        u15.add("Call: +(91)-(40)-65603222,32930222\t" +
                "+(91)-9246106222,9246115222 \t" +
                "+(91)-(40)-27801222");

        List<String> u16 = new ArrayList<>();
        u16.add("3-6-10/A 1st Floor, Main Road, Anasurya Commercial Complex, Himayat Nagar, Hyderabad - 500029 ");
        u16.add("Call: +(91)-(40)-23220222,65883777\t+(91)-9885666814");

        List<String> u17 = new ArrayList<>();
        u17.add("16-2-677/1, Opp Andhra Bank, Thirumala Towers, Malakpet, Hyderabad - 500036");
        u17.add("Call: +(91)-(40)-64522406,24553406\t");
        List<String> u18 = new ArrayList<>();
        u18.add("View Towers, Lakdi Ka Pool, Hyderabad - 500004 ");
        u18.add("Call: +(91)-(40)-23314747\t");
        List<String> u19 = new ArrayList<>();
        u19.add("4-494/4, Beside Bbr Hospital, Bala Nagar, Hyderabad - 500037\n");
        u19.add("Call: +(91)-(40)-23774469,66194469\t+(91)-9391024741,9849187869");
        List<String> u20 = new ArrayList<>();
        u20.add("3-4-808, Barkatpura, Hyderabad - 500027\n");
        u20.add("Call: +(91)-(40)-27550238,26822271");
        List<String> u21 = new ArrayList<>();
        u21.add("18-77 1st Flr, St-3 Kamala Nagar, Dilsukhnagar, Hyderabad - 500036\n");
        u21.add("Call: +(91)-9290262411");
        List<String> u22 = new ArrayList<>();
        u22.add("L B Nagar, Hyderabad - 500036");
        u22.add("Call: +(91)-(40)-39879999,39879298");
        List<String> u23 = new ArrayList<>();
        u23.add("Nampally, Hyderabad - 500001");
        u23.add("Call: +(91)-(40)-23204616,23202902,23204616");
        List<String> u24 = new ArrayList<>();
        u24.add("Plot No 2 Shanthi Surabhi Complex, Main Road, A S Rao Nagar, Hyderabad - 500762");
        u24.add("Call: +(91)-(40)-27162146\t+(91)-9866192213\t");
        List<String> u25 = new ArrayList<>();
        u25.add("Gandhi Park, Bank Street, Koti, Hyderabad - 500195");
        u25.add("Call: +(91)-(40)-27732562");
        List<String> u26 = new ArrayList<>();
        u26.add("Flat No 13 To 16 Tirumala Apartments, Basheerbagh, Hyderabad - 500029");
        u26.add("Call: +(91)-(40)-23226624,23236610,23222976\t+(91)-9246544977,9849017900");
        List<String> u27 = new ArrayList<>();
        u27.add("3-6-147/2, Opp HDFC Bank, Himayat Nagar, Hyderabad - 500029 ");
        u27.add("Call: +(91)-(40)-23221662\t");
        List<String> u28 = new ArrayList<>();
        u28.add("11-5-401/1, Red Hills, Hyderabad - 500004");
        u28.add("Call: +(91)-(40)-23390956");
        List<String> u29 = new ArrayList<>();
        u29.add("D No 1-9-310, Vidya Nagar, Hyderabad - 500044");
        u29.add("Call: +(91)-(40)-27633087,27627973");
        List<String> u30 = new ArrayList<>();
        u30.add("Saphire Complex, Near L B Stadium, Fathe Maidan, Hyderabad - 500001");
        u30.add("Call: +(91)-(40)-66660710");

        listHash.put(listDataHeader.get(0), u1);
        listHash.put(listDataHeader.get(1), u2);
        listHash.put(listDataHeader.get(2), u3);
        listHash.put(listDataHeader.get(3), u4);
        listHash.put(listDataHeader.get(4), u5);
        listHash.put(listDataHeader.get(5), u6);
        listHash.put(listDataHeader.get(6), u7);
        listHash.put(listDataHeader.get(7), u8);
        listHash.put(listDataHeader.get(8), u9);
        listHash.put(listDataHeader.get(9), u10);
        listHash.put(listDataHeader.get(10), u11);
        listHash.put(listDataHeader.get(11), u12);
        listHash.put(listDataHeader.get(12), u13);
        listHash.put(listDataHeader.get(13), u14);
        listHash.put(listDataHeader.get(14), u15);
        listHash.put(listDataHeader.get(15), u16);
        listHash.put(listDataHeader.get(16), u17);
        listHash.put(listDataHeader.get(17), u18);
        listHash.put(listDataHeader.get(18), u19);
        listHash.put(listDataHeader.get(19), u20);
        listHash.put(listDataHeader.get(20), u21);
        listHash.put(listDataHeader.get(21), u22);
        listHash.put(listDataHeader.get(22), u23);
        listHash.put(listDataHeader.get(23), u24);
        listHash.put(listDataHeader.get(24), u25);
        listHash.put(listDataHeader.get(25), u26);
        listHash.put(listDataHeader.get(26), u27);
        listHash.put(listDataHeader.get(27), u28);
        listHash.put(listDataHeader.get(28), u29);
        listHash.put(listDataHeader.get(29), u30);

    }
}

