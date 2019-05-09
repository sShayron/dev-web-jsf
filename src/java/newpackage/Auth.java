/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import static java.lang.Boolean.TRUE;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author alunodev06
 */
@ManagedBean(name="authBean")
@RequestScoped
public class Auth {
    public String login;
    public Integer senha;

    @ManagedProperty(value="#{userSession}")
    private Sessao userSession;

    public Sessao getUserSession() {
        return userSession;
    }

    public void setUserSession(Sessao userSession) {
        this.userSession = userSession;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }
    
    public String login() {
         if (this.login.equals("shayro") && this.senha.equals(123)) {
            userSession.setLoggedIn(TRUE);
            userSession.setLogin(this.login);         
            return "dashboard";
        }
        FacesContext.getCurrentInstance().addMessage(
                null,
                new FacesMessage("SEVERITY_ERROR: Senha incorreta...", "É necessário digita a senha corretamente")
        );
        
        return "login";
    }
}
