package action;

import Controller.Action;
import Model.Contato;
import Persistence.ContatoDAO;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LerContatoAction implements Action {

    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

        try{
            
            List<Contato> listaContatos = ContatoDAO.getInstance().read();
            request.setAttribute("listaContatos", listaContatos);
            RequestDispatcher view = request.getRequestDispatcher("/LerContato.jsp");
            view.forward(request, response);
        }
        catch (ServletException ex) {
            //Logger.getLogger(LerContatoAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
