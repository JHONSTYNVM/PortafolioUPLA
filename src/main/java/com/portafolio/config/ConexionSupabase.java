package com.portafolio.config;


import java.sql.Connection;
import java.sql.DriverManager;



public class ConexionSupabase {



    private static final String URL =
    "jdbc:postgresql://db.tehyahsrnfjnijikybre.supabase.co:5432/postgres";



    private static final String USER =
    "postgres";



    private static final String PASSWORD =
    "AQUI_PONES_TU_PASSWORD";





    public static Connection getConnection(){


        Connection con = null;


        try{


            Class.forName("org.postgresql.Driver");



            con = DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );



            System.out.println("Conexion exitosa con Supabase");



        }catch(Exception e){


            System.out.println(
                "Error conexion: " + e.getMessage()
            );


        }



        return con;


    }



}