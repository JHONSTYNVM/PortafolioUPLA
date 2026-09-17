package com.portafolio.dao;


import com.portafolio.config.ConexionSupabase;
import com.portafolio.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class UsuarioDAO {



    // ==================================
    // REGISTRAR USUARIO
    // ==================================

    public boolean registrar(Usuario usuario){


        String sql = 
        "INSERT INTO usuarios(nombre, correo, password) VALUES(?,?,?)";



        try(
            Connection con = ConexionSupabase.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

        ){



            if(con == null){

                System.out.println("No existe conexion con la base de datos");

                return false;

            }



            ps.setString(1, usuario.getNombre());

            ps.setString(2, usuario.getCorreo());

            ps.setString(3, usuario.getPassword());



            int filas = ps.executeUpdate();



            return filas > 0;



        }catch(Exception e){


            System.out.println("Error al registrar usuario: " 
                    + e.getMessage());


            return false;


        }



    }









    // ==================================
    // LOGIN USUARIO
    // ==================================

    public Usuario login(String correo, String password){



        Usuario usuario = null;



        String sql = 
        "SELECT * FROM usuarios WHERE correo=? AND password=?";





        try(

            Connection con = ConexionSupabase.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

        ){



            if(con == null){


                System.out.println("No existe conexion con la base de datos");


                return null;


            }





            ps.setString(1, correo);

            ps.setString(2, password);





            ResultSet rs = ps.executeQuery();





            if(rs.next()){



                usuario = new Usuario();




                usuario.setId(
                    rs.getInt("id")
                );



                usuario.setNombre(
                    rs.getString("nombre")
                );



                usuario.setCorreo(
                    rs.getString("correo")
                );



                usuario.setPassword(
                    rs.getString("password")
                );



            }





            rs.close();




        }catch(Exception e){



            System.out.println("Error al iniciar sesión: "
                    + e.getMessage());



        }





        return usuario;



    }




}