package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class Main {

        public static void main(String args[]) {

            Republic republic= new Republic("Kazakhstan");

            System.out.println(republic);

            Kazakhstan kazakhstan=new Kazakhstan("Kazakhstan",2725000,17,3,18750000,"Nur-Sultan","Nur-Sultan,Almaty,Shymkent");

            System.out.println(kazakhstan);

            NurSultan nurSultan=new NurSultan(722,1217600);

            System.out.println(nurSultan);

            Almaty almaty=new Almaty(682,1977011);

            System.out.println(almaty);

            Shymkent shymkent=new Shymkent(1170,1100000);

            System.out.println(shymkent);



        }
    }