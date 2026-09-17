package com.portafolio.controller;


import com.portafolio.dao.UsuarioDAO;
import com.portafolio.model.Usuario;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/UsuarioController")
public class UsuarioController extends HttpServlet {



    private UsuarioDAO usuarioDAO = new UsuarioDAO();





    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {



        String accion = request.getParameter("accion");



        // ==========================
        // REGISTRO DE USUARIO
        // ==========================


        if("registrar".equals(accion)){



            String nombre = request.getParameter("nombre");

            String correo = request.getParameter("correo");

            String password = request.getParameter("password");




            Usuario usuario = new Usuario();



            usuario.setNombre(nombre);

            usuario.setCorreo(correo);

            usuario.setPassword(password);





            boolean registrado = usuarioDAO.registrar(usuario);




            if(registrado){


                response.sendRedirect("login.jsp");


            }else{


                response.sendRedirect("registro.jsp");


            }



        }





        // ==========================
        // LOGIN DE USUARIO
        // ==========================


        else if("login".equals(accion)){



            String correo = request.getParameter("correo");

            String password = request.getParameter("password");





            Usuario usuario = usuarioDAO.login(correo, password);





            if(usuario != null){



                request.getSession().setAttribute(
                        "usuario",
                        usuario
                );



                response.sendRedirect("panel.jsp");



            }else{



                response.sendRedirect("login.jsp");



            }




        }



        else{


            response.sendRedirect("index.html");


        }




    }



}