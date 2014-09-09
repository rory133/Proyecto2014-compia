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
import entidades.Imagen;
import entidades.Login;
import entidades.Usuario;
import facade.ImagenFacade;
import facade.LoginFacade;
import facade.ProductoFacade;
import facade.UsuarioFacade;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;
import utilidades.Loggable;

/**
 *
 * @author juanma
 */
//@Loggable
//@RequestScoped
@SessionScoped
@ManagedBean(name="crearProductoBean")
public class CrearProductoBean {

@EJB
private ProductoFacade productoFacade;

@EJB
private ImagenFacade imagenFacade;

@EJB
private LoginFacade loginFacade;

@EJB
private UsuarioFacade usuarioFacade;





 private List<byte[]> imagenesSubidasByte = new ArrayList<byte[]>(); ;

////////////////////
   private List<UploadedFile> imagenesSubidas ;
  private  Imagen imagen;
  private  UploadedFile file;

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }
    
    

///////////////////

private FacesMessage facesMessage;
private final FacesContext faceContext;

// private List<UploadedFile> ImagenesSubidas ;

 private String nombre;
 
 
 private String descripcion;
 
 
 private float precio;
 
 
 private boolean vendido;
 
 
 private boolean enSubasta;
 
private Login login;

private Usuario usuario;

private Categoria categoria;



    public CrearProductoBean() {
        
       faceContext=FacesContext.getCurrentInstance();
        imagenesSubidas = new  ArrayList<UploadedFile>();
//        imagenesSubiendo=new ImagenesSubiendo();
//        imagenesSubidasByte= new ArrayList<byte[]>();
        
    }
    
  
    public String salir() {
        imagenesSubidas = new  ArrayList<UploadedFile>();
//        imagenesSubiendo=new ImagenesSubiendo();
//        imagenesSubidasByte= new ArrayList<byte[]>();
      return "index";
    }

   public void fileUploadListener(FileUploadEvent event){
        // Get uploaded file from the FileUploadEvent
        //file = event.getFile();
        // Print out the information of the file
     //  System.out.println("Uploaded File Name Is :: "+file.getFileName()+" :: Uploaded File Size :: "+file.getSize());
      //  UploadedFile uploadedFile = event.getFile();
       // String fileName = uploadedFile.getFileName();
      //  System.out.println("nombre uploadedFile: "+ fileName);
        
      //  System.out.println("byte[] contents = uploadedFile.getContents();");
       // byte[] contents = uploadedFile.getContents();
        
        //System.out.println("imagen.setImagen(contents);");
       // imagen=new Imagen();
        //imagen.setImagen(contents);
       
  
            
       
       
        
           imagenesSubidas.add(event.getFile());
           System.out.println("contenido imagenes: "+imagenesSubidas.size());
                for(UploadedFile uploadedFile:imagenesSubidas){
                    System.out.println(" nombre: "+uploadedFile.getFileName());
                    System.out.println(" tamaño: "+uploadedFile.getSize());
                    System.out.println(" contenido: "+uploadedFile.toString());
                    
                   // imagenesSubidasByte.add(uploadedFile.getContents());
                    //imagenesSubiendo.getImagenesSubidas().add(uploadedFile.getContents());
                    
                }
//            imagenesSubiendo.setImagenesSubidas(imagenesSubidasByte);
//            imagenesSubiendo.imprimir();
              

       
    }
   public void imprimirImagenes(){
        // Get uploaded file from the FileUploadEvent
        //file = event.getFile();
        // Print out the information of the file
     //  System.out.println("Uploaded File Name Is :: "+file.getFileName()+" :: Uploaded File Size :: "+file.getSize());
      //  UploadedFile uploadedFile = event.getFile();
       // String fileName = uploadedFile.getFileName();
      //  System.out.println("nombre uploadedFile: "+ fileName);
        
      //  System.out.println("byte[] contents = uploadedFile.getContents();");
       // byte[] contents = uploadedFile.getContents();
        
        //System.out.println("imagen.setImagen(contents);");
       // imagen=new Imagen();
        //imagen.setImagen(contents);
        
          
           System.out.println("contenido imagenesSubidas: "+imagenesSubidas.size());
                for(UploadedFile uploadedFile:imagenesSubidas){
                    System.out.println(" nombre: "+uploadedFile.getFileName());
                    System.out.println(" tamaño: "+uploadedFile.getSize());
                    System.out.println(" contenido: "+uploadedFile.toString());

                }
                
//            System.out.println("contenido imagenesSubidasByte: "+imagenesSubidasByte.size());
//                for(byte[] imagen:imagenesSubidasByte){
//                    
//                    System.out.println(" tamaño: "+imagen.length);
//                    System.out.println(" contenido: "+imagen.toString());
//                
//                }
                
                
                
//            System.out.println("IMPRIMIDO DESDE IMAGNESSUBIENDO: ");
//            imagenesSubiendo.imprimir();
       
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
         System.out.println("guardarProducto()");
        return null;
    }
   

}
