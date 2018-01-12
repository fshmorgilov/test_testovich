package Grabber;
//import jdk.nashorn.internal.objects.annotations.Constructor;

import java.lang.annotation.Inherited;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Grabber{

    private int id;
    private String name;
    private ArrayList<String> skillList = new ArrayList<>();

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }
    public void grabInfo(){
        //invoke curl -x <site_name> POST <dateRequest>
//        Array siteName = new Array();
    }

    public Grabber(int id,String name) {
        this.id = id;
        this.name = name;
        skillList.add(this.name);
        int counter=0;
        while (counter <skillList.size()){
            System.out.println("Grabber Created " + "\nSiteNames equals to " + skillList.get(counter));
            counter ++;
        }
    }

}

