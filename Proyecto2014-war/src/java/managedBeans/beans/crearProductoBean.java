/*
 * Proyecto fin de carrera gen�rico del Dpto.  * 
 * Lenguajes y Sistemas Inform�ticos (curso 2014-2015)  * 
 * Desarrollo de un portal de anuncios para compra/venta online. * 
 * realizado por: * 
 * juan Manuel Mendez Feijoo  * 
 *  juan-ma@telefonica.net * 
 */

package managedBeans.beans;

import entidades.Categoria;
import entidades.Login;
import entidades.Usuario;
import facade.ImagenFacade;
import facade.LoginFacade;
import facade.ProductoFacade;
import facade.UsuarioFacade;
import javax.ejb.EJB;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import utilidades.Loggable;

/**
 *
 * @author juanma
 */
@Loggable
@RequestScoped
@ManagedBean(name="crearProductoBean")
public class crearProductoBean {

@EJB
private ProductoFacade productoFacade;

@EJB
private ImagenFacade imagenFacade;

@EJB
private LoginFacade loginFacade;

@EJB
private UsuarioFacade usuarioFacade;

private FacesMessage facesMessage;
private final FacesContext faceContext;



 private String nombre;
 
 
 private String descripcion;
 
 
 private float precio;
 
 
 private boolean vendido;
 
 
 private boolean enSubasta;
 
private Login login;

private Usuario usuario;

private Categoria categoria;

  
  

    public crearProductoBean() {
        
        faceContext=FacesContext.getCurrentInstance();
    }

    public LoginFacade getLoginFacade() {
        return loginFacade;
    }

    public void setLoginFacade(LoginFacade loginFacade) {
        this.loginFacade = loginFacade;
    }

    public FacesMessage getFacesMessage() {
        return facesMessage;
    }

    public void setFacesMessage(FacesMessage facesMessage) {
        this.facesMessage = facesMessage;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public boolean isEnSubasta() {
        return enSubasta;
    }

    public void setEnSubasta(boolean enSubasta) {
        this.enSubasta = enSubasta;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
     public String guardarProducto() {
        return null;
    }
    
    
    
}
