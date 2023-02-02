package mx.com.pqtx.core;
 
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import mx.com.pqtx.web.PkgBean;       
import mx.com.pqtx.datos.dto.BranchDTO;  

@FacesConverter("genericConverter")
public class GenericConverter implements Converter {

    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if (value != null && value.trim().length() > 0) {
            //COMPONENETES PARA REPORTES ORACLE CLOUD INICIO         
            if (uic.getId().equalsIgnoreCase("cmbSucursal")) {
                PkgBean controller = (PkgBean) fc.getApplication().getELResolver().
                        getValue(fc.getELContext(), null, "pkgBean");
                for (BranchDTO p : controller.getBranches()) {
                    if (p.getName().equalsIgnoreCase(value)) {
                        return p;
                    }
                }
            }
        } else { 
            return null;
        }

        return null;
    }

    public String getAsString(FacesContext fc, UIComponent uic, Object object) {
        if (object instanceof BranchDTO) {
            BranchDTO dto = (BranchDTO) object;
            return dto.getName();
        }   else if (1==1) { 
            System.out.println("nothing");
        }
        return "";
    }
    
}
