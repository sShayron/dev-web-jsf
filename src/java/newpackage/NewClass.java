package newpackage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alunodev06
 */
@ManagedBean(name="usuarioBean")
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
}
