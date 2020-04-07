/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;



/**
 *
 * @author Usuario
 */
public class ClsCancion {

    private String StrIdCancion;
    private String StrGenero;
    private String StrAutor;
    private String StrTitulo;
    private Date Fecha;
    private String Duracion;
    private String StrUsuario_Idusuario;

    public ClsCancion() {
    }

    public ClsCancion(String StrIdCancion, String StrGenero, String StrAutor, String StrTitulo, Date Fecha, String Duracion, String StrUsuario_Idusuario) {
        this.StrIdCancion = StrIdCancion;
        this.StrGenero = StrGenero;
        this.StrAutor = StrAutor;
        this.StrTitulo = StrTitulo;
        this.Fecha = Fecha;
        this.Duracion = Duracion;
        this.StrUsuario_Idusuario = StrUsuario_Idusuario;
    }

    /**
     * @return the StrIdCancion
     */
    public String getStrIdCancion() {
        return StrIdCancion;
    }

    /**
     * @param StrIdCancion the StrIdCancion to set
     */
    public void setStrIdCancion(String StrIdCancion) {
        this.StrIdCancion = StrIdCancion;
    }

    /**
     * @return the StrGenero
     */
    public String getStrGenero() {
        return StrGenero;
    }

    /**
     * @param StrGenero the StrGenero to set
     */
    public void setStrGenero(String StrGenero) {
        this.StrGenero = StrGenero;
    }

    /**
     * @return the StrAutor
     */
    public String getStrAutor() {
        return StrAutor;
    }

    /**
     * @param StrAutor the StrAutor to set
     */
    public void setStrAutor(String StrAutor) {
        this.StrAutor = StrAutor;
    }

    /**
     * @return the StrTitulo
     */
    public String getStrTitulo() {
        return StrTitulo;
    }

    /**
     * @param StrTitulo the StrTitulo to set
     */
    public void setStrTitulo(String StrTitulo) {
        this.StrTitulo = StrTitulo;
    }

    /**
     * @return the Fecha
     */
    public Date getFecha() {
        return Fecha;
    }

    /**
     * @param Fecha the Fecha to set
     */
    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    /**
     * @return the Duracion
     */
    public String getDuracion() {
        return Duracion;
    }

    /**
     * @param Duracion the Duracion to set
     */
    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    /**
     * @return the StrUsuario_Idusuario
     */
    public String getStrUsuario_Idusuario() {
        return StrUsuario_Idusuario;
    }

    /**
     * @param StrUsuario_Idusuario the StrUsuario_Idusuario to set
     */
    public void setStrUsuario_Idusuario(String StrUsuario_Idusuario) {
        this.StrUsuario_Idusuario = StrUsuario_Idusuario;
    }
    

}
