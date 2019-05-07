package newpackage;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alunodev06
 */
@ManagedBean(name = "usuarioBean")
@RequestScoped
public class NewClass {

    public String name;
    public String senha;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String valida() {
        if (this.senha.equals("123") && this.name.equals("shayro")) {            
            return "case1";
        }
        FacesContext.getCurrentInstance().addMessage(
                null,
                new FacesMessage("SEVERITY_ERROR: Senha incorreta...", "É necessário digita a senha corretamente")
        );

        return null;
    }
}
