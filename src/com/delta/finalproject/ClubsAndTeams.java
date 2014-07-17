package com.delta.finalproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class ClubsAndTeams extends Activity{
	ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clubsteams);
 
        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);
 
        // preparing list data
        prepareListData();
 
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
 
        // setting list adapter
        expListView.setAdapter(listAdapter);
    }
 
    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
 
        // Adding child data
        listDataHeader.add("Tech Clubs");
        listDataHeader.add("Non-Tech Clubs");
        listDataHeader.add("Teams");
 
        // Adding child data
        List<String> TechClubs = new ArrayList<String>();
        TechClubs.add("Delta");
        TechClubs.add("Spider");
        TechClubs.add("RMI");
        TechClubs.add("3D");
        TechClubs.add("PSI Racing");
 
        List<String> NonTechClubs = new ArrayList<String>();
        NonTechClubs.add("Pragyan");
        NonTechClubs.add("Dance Troupe");
        NonTechClubs.add("Music Troupe");
        NonTechClubs.add("The Thespian Society");
        NonTechClubs.add("Pixelbug");
        NonTechClubs.add("Feeds");
        NonTechClubs.add("Festember");
 
        List<String> Teams = new ArrayList<String>();
        Teams.add("Basketball");
        Teams.add("Tennis");
        Teams.add("Football");
        Teams.add("Table Tennis");
        Teams.add("Badminton");
        Teams.add("Athletics");
        Teams.add("Volleyball");
        
        listDataChild.put(listDataHeader.get(0), TechClubs); // Header, Child data
        listDataChild.put(listDataHeader.get(1), NonTechClubs);
        listDataChild.put(listDataHeader.get(2), Teams);
    }

}
