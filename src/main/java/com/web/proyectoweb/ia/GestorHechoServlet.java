/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.proyectoweb.ia;

import jadex.rules.parser.conditions.ParserHelper;
import jadex.rules.rulesystem.IAction;
import jadex.rules.rulesystem.ICondition;
import jadex.rules.rulesystem.IVariableAssignments;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import jadex.rules.rulesystem.LIFOAgenda;
import jadex.rules.rulesystem.RuleSystem;
import jadex.rules.rulesystem.RuleSystemExecutor;
import jadex.rules.rulesystem.Rulebase;
import jadex.rules.rulesystem.rete.RetePatternMatcherFunctionality;
import jadex.rules.rulesystem.rules.Rule;
import jadex.rules.state.IOAVState;
import jadex.rules.state.OAVAttributeType;
import jadex.rules.state.OAVJavaType;
import jadex.rules.state.OAVObjectType;
import jadex.rules.state.OAVTypeModel;
import jadex.rules.state.javaimpl.OAVStateFactory;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author hiros
 */
public class GestorHechoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    public static final OAVTypeModel	catalogo_type_model;
    public static final OAVObjectType nodo_type;
    public static final OAVAttributeType valor_nodo;
    
    private RuleSystem rete;
    private IOAVState state;
    private RuleSystemExecutor exe;
    private Rulebase	rb;
    
    private String redirect;
    
    public void setRedirect(String _redirect){
        this.redirect=_redirect;
    }
    
    public String getRedirect(){
        return this.redirect;
    }
    
    static{
        catalogo_type_model	= new OAVTypeModel("catalogo_type_model");
        catalogo_type_model.addTypeModel(OAVJavaType.java_type_model);
        
        nodo_type=catalogo_type_model.createType("nodo");
        valor_nodo=nodo_type.createAttributeType("valor", OAVJavaType.java_string_type);
        
    }
    
    private void instanciarSE(){
        state = OAVStateFactory.createOAVState(catalogo_type_model);
        rb= new Rulebase();
         rete = new RuleSystem(state, rb, new RetePatternMatcherFunctionality(rb), new LIFOAgenda());
 
        rete.getRulebase().addRule(new Rule("nodo3-1",
                    ParserHelper.parseClipsCondition(
                               "(nodo (valor \"iniciar-pregunta\"))"+
                               "(nodo (valor \"1 de-todo\"))"+
                               "(nodo (valor \"2 grandes\"))"+
                               "(nodo (valor \"3 mini\"))",
				catalogo_type_model),
                    new IAction()
                        {
                                public void execute(IOAVState state, IVariableAssignments assignments)
                                {
                                    setRedirect("minibolso");
                                    System.out.println("Ejecucion: "+getRedirect());
                                    exe.setStepmode(false);
                                }
                        }));
        
        rete.getRulebase().addRule(new Rule("nodo3-2",
                    ParserHelper.parseClipsCondition(
                               "(nodo (valor \"iniciar-pregunta\"))"+
                               "(nodo (valor \"1 de-todo\"))"+
                               "(nodo (valor \"2 grandes\"))"+
                               "(nodo (valor \"3 de-mano\"))",
				catalogo_type_model),
                    new IAction()
                        {
                                public void execute(IOAVState state, IVariableAssignments assignments)
                                {
                                    setRedirect("bolso-demano");
                                    System.out.println("Ejecucion: "+getRedirect());
                                    exe.setStepmode(false);
                                }
                        }));
        
        rete.getRulebase().addRule(new Rule("nodo3-3",
                    ParserHelper.parseClipsCondition(
                               "(nodo (valor \"iniciar-pregunta\"))"+
                               "(nodo (valor \"1 de-todo\"))"+
                               "(nodo (valor \"2 grandes\"))"+
                               "(nodo (valor \"3 mediano\"))",
				catalogo_type_model),
                    new IAction()
                        {
                                public void execute(IOAVState state, IVariableAssignments assignments)
                                {
                                    setRedirect("bolso-mediano");
                                    System.out.println("Ejecucion: "+getRedirect());
                                    exe.setStepmode(false);
                                }
                        }));
        
        rete.getRulebase().addRule(new Rule("nodo3-4",
                    ParserHelper.parseClipsCondition(
                               "(nodo (valor \"iniciar-pregunta\"))"+
                               "(nodo (valor \"1 de-todo\"))"+
                               "(nodo (valor \"2 grandes\"))"+
                               "(nodo (valor \"3 grande\"))",
				catalogo_type_model),
                    new IAction()
                        {
                                public void execute(IOAVState state, IVariableAssignments assignments)
                                {
                                    setRedirect("bolso-grande");
                                    System.out.println("Ejecucion: "+getRedirect());
                                    exe.setStepmode(false);
                                }
                        }));
        
        rete.getRulebase().addRule(new Rule("nodo3-5",
                    ParserHelper.parseClipsCondition(
                               "(nodo (valor \"iniciar-pregunta\"))"+
                               "(nodo (valor \"1 de-todo\"))"+
                               "(nodo (valor \"2 pequenos\"))"+
                               "(nodo (valor \"3 lapiz-digital\"))",
				catalogo_type_model),
                    new IAction()
                        {
                                public void execute(IOAVState state, IVariableAssignments assignments)
                                {
                                    setRedirect("lapizdigital");
                                    System.out.println("Ejecucion: "+getRedirect());
                                    exe.setStepmode(false);
                                }
                        }));
        
        rete.getRulebase().addRule(new Rule("nodo3-6",
                    ParserHelper.parseClipsCondition(
                               "(nodo (valor \"iniciar-pregunta\"))"+
                               "(nodo (valor \"1 de-todo\"))"+
                               "(nodo (valor \"2 pequeno\"))"+
                               "(nodo (valor \"3 agenda\"))",
				catalogo_type_model),
                    new IAction()
                        {
                                public void execute(IOAVState state, IVariableAssignments assignments)
                                {
                                    setRedirect("agenda");
                                    System.out.println("Ejecucion: "+getRedirect());
                                    exe.setStepmode(false);
                                }
                        }));
        
        rete.getRulebase().addRule(new Rule("nodo4-1",
                    ParserHelper.parseClipsCondition(
                               "(nodo (valor \"iniciar-pregunta\"))"+
                               "(nodo (valor \"1 de-todo\"))"+
                               "(nodo (valor \"2 pequeno\"))"+
                               "(nodo (valor \"3 uso-general\"))"+
                               "(nodo (valor \"4 pequeno\"))",
				catalogo_type_model),
                    new IAction()
                        {
                                public void execute(IOAVState state, IVariableAssignments assignments)
                                {
                                    setRedirect("cartuchera-pequena");
                                    System.out.println("Ejecucion: "+getRedirect());
                                    exe.setStepmode(false);
                                }
                        }));
        
        rete.getRulebase().addRule(new Rule("nodo4-2",
                    ParserHelper.parseClipsCondition(
                               "(nodo (valor \"iniciar-pregunta\"))"+
                               "(nodo (valor \"1 de-todo\"))"+
                               "(nodo (valor \"2 pequeno\"))"+
                               "(nodo (valor \"3 uso-general\"))"+
                               "(nodo (valor \"4 mediano\"))",
				catalogo_type_model),
                    new IAction()
                        {
                                public void execute(IOAVState state, IVariableAssignments assignments)
                                {
                                    setRedirect("cartuchera-mediana");
                                    System.out.println("Ejecucion: "+getRedirect());
                                    exe.setStepmode(false);
                                }
                        }));
        
        rete.getRulebase().addRule(new Rule("nodo4-3",
                    ParserHelper.parseClipsCondition(
                               "(nodo (valor \"iniciar-pregunta\"))"+
                               "(nodo (valor \"1 de-todo\"))"+
                               "(nodo (valor \"2 pequeno\"))"+
                               "(nodo (valor \"3 uso-general\"))"+
                               "(nodo (valor \"4 grande\"))",
				catalogo_type_model),
                    new IAction()
                        {
                                public void execute(IOAVState state, IVariableAssignments assignments)
                                {
                                    setRedirect("cartuchera-grande");
                                    System.out.println("Ejecucion: "+getRedirect());
                                    exe.setStepmode(false);
                                }
                        }));
        
        rete.getRulebase().addRule(new Rule("nodo3-8",
                    ParserHelper.parseClipsCondition(
                               "(nodo (valor \"iniciar-pregunta\"))"+
                               "(nodo (valor \"1 cosas-importantes\"))"+
                               "(nodo (valor \"2 documentos\"))"+
                               "(nodo (valor \"3 muchos\"))",
				catalogo_type_model),
                    new IAction()
                        {
                                public void execute(IOAVState state, IVariableAssignments assignments)
                                {
                                    setRedirect("portadocumentos-grande");
                                    System.out.println("Ejecucion: "+getRedirect());
                                    exe.setStepmode(false);
                                }
                        }));
        
        rete.getRulebase().addRule(new Rule("nodo3-9",
                    ParserHelper.parseClipsCondition(
                               "(nodo (valor \"iniciar-pregunta\"))"+
                               "(nodo (valor \"1 cosas-importantes\"))"+
                               "(nodo (valor \"2 documentos\"))"+
                               "(nodo (valor \"3 pocos\"))",
				catalogo_type_model),
                    new IAction()
                        {
                                public void execute(IOAVState state, IVariableAssignments assignments)
                                {
                                    setRedirect("portadocumentos-pequeno");
                                    System.out.println("Ejecucion: "+getRedirect());
                                    exe.setStepmode(false);
                                }
                        }));
        
        rete.getRulebase().addRule(new Rule("nodo4-4",
                    ParserHelper.parseClipsCondition(
                               "(nodo (valor \"iniciar-pregunta\"))"+
                               "(nodo (valor \"1 cosas-importantes\"))"+
                               "(nodo (valor \"2 dinero\"))"+
                               "(nodo (valor \"3 billetes\"))"+
                               "(nodo (valor \"4 varon\"))",
				catalogo_type_model),
                    new IAction()
                        {
                                public void execute(IOAVState state, IVariableAssignments assignments)
                                {
                                    setRedirect("billetera-varon");
                                    System.out.println("Ejecucion: "+getRedirect());
                                    exe.setStepmode(false);
                                }
                        }));
        
        rete.getRulebase().addRule(new Rule("nodo5-1",
                    ParserHelper.parseClipsCondition(
                               "(nodo (valor \"iniciar-pregunta\"))"+
                               "(nodo (valor \"1 cosas-importantes\"))"+
                               "(nodo (valor \"2 dinero\"))"+
                               "(nodo (valor \"3 billetes\"))"+
                               "(nodo (valor \"4 dama\"))"+
                               "(nodo (valor \"5 regular\"))",
				catalogo_type_model),
                    new IAction()
                        {
                                public void execute(IOAVState state, IVariableAssignments assignments)
                                {
                                    setRedirect("billetera-regular");
                                    System.out.println("Ejecucion: "+getRedirect());
                                    exe.setStepmode(false);
                                }
                        }));
        
        rete.getRulebase().addRule(new Rule("nodo5-2",
                    ParserHelper.parseClipsCondition(
                               "(nodo (valor \"iniciar-pregunta\"))"+
                               "(nodo (valor \"1 cosas-importantes\"))"+
                               "(nodo (valor \"2 dinero\"))"+
                               "(nodo (valor \"3 billetes\"))"+
                               "(nodo (valor \"4 dama\"))"+
                               "(nodo (valor \"5 grande\"))",
				catalogo_type_model),
                    new IAction()
                        {
                                public void execute(IOAVState state, IVariableAssignments assignments)
                                {
                                    setRedirect("billetera-grande");
                                    System.out.println("Ejecucion: "+getRedirect());
                                    exe.setStepmode(false);
                                }
                        }));
        
        rete.getRulebase().addRule(new Rule("nodo4-6",
                    ParserHelper.parseClipsCondition(
                               "(nodo (valor \"iniciar-pregunta\"))"+
                               "(nodo (valor \"1 cosas-importantes\"))"+
                               "(nodo (valor \"2 dinero\"))"+
                               "(nodo (valor \"3 monedas\"))"+
                                "(nodo (valor \"4 minimonedero\"))",
				catalogo_type_model),
                    new IAction()
                        {
                                public void execute(IOAVState state, IVariableAssignments assignments)
                                {
                                    setRedirect("minimonedero");
                                    System.out.println("Ejecucion: "+getRedirect());
                                    exe.setStepmode(false);
                                }
                        }));
        
        rete.getRulebase().addRule(new Rule("nodo4-7",
                    ParserHelper.parseClipsCondition(
                               "(nodo (valor \"iniciar-pregunta\"))"+
                               "(nodo (valor \"1 cosas-importantes\"))"+
                               "(nodo (valor \"2 dinero\"))"+
                               "(nodo (valor \"3 monedas\"))"+
                                "(nodo (valor \"4 sencillero\"))",
				catalogo_type_model),
                    new IAction()
                        {
                                public void execute(IOAVState state, IVariableAssignments assignments)
                                {
                                    setRedirect("sencillero");
                                    System.out.println("Ejecucion: "+getRedirect());
                                    exe.setStepmode(false);
                                }
                        }));
        
        rete.getRulebase().addRule(new Rule("nodo4-8",
                    ParserHelper.parseClipsCondition(
                               "(nodo (valor \"iniciar-pregunta\"))"+
                               "(nodo (valor \"1 cosas-importantes\"))"+
                               "(nodo (valor \"2 dinero\"))"+
                               "(nodo (valor \"3 monedas\"))"+
                                "(nodo (valor \"4 tarjetero\"))",
				catalogo_type_model),
                    new IAction()
                        {
                                public void execute(IOAVState state, IVariableAssignments assignments)
                                {
                                    setRedirect("tarjetero");
                                    System.out.println("Ejecucion: "+getRedirect());
                                    exe.setStepmode(false);
                                }
                        }));
        
        rete.getRulebase().addRule(new Rule("nodo3-12",
                    ParserHelper.parseClipsCondition(
                               "(nodo (valor \"iniciar-pregunta\"))"+
                               "(nodo (valor \"1 cosas-importantes\"))"+
                               "(nodo (valor \"2 llaves\"))"+
                               "(nodo (valor \"3 bordado\"))",
				catalogo_type_model),
                    new IAction()
                        {
                                public void execute(IOAVState state, IVariableAssignments assignments)
                                {
                                    setRedirect("llavero-bordado");
                                    System.out.println("Ejecucion: "+getRedirect());
                                    exe.setStepmode(false);
                                }
                        }));
        
        rete.getRulebase().addRule(new Rule("nodo3-13",
                    ParserHelper.parseClipsCondition(
                               "(nodo (valor \"iniciar-pregunta\"))"+
                               "(nodo (valor \"1 cosas-importantes\"))"+
                               "(nodo (valor \"2 llaves\"))"+
                               "(nodo (valor \"3 munequera\"))",
				catalogo_type_model),
                    new IAction()
                        {
                                public void execute(IOAVState state, IVariableAssignments assignments)
                                {
                                    setRedirect("munequera");
                                    System.out.println("Ejecucion: "+getRedirect());
                                    exe.setStepmode(false);
                                }
                        }));
        
        
        
        
    }
  
    
    public void ejecutarSE(){
        rete.init();
        exe= new RuleSystemExecutor(rete, true);
        while(exe.isStepmode()){
                exe.doStep();
        }
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try (PrintWriter out = response.getWriter()) {
            String fact=request.getParameter("fact");
            setRedirect(request.getParameter("redirect"));
            if(fact.equals("iniciar-pregunta")){
            instanciarSE();
            }
            
            
            Object m = state.createRootObject(nodo_type);
            state.setAttributeValue(m, valor_nodo, fact);
            
            if(getRedirect().equals("ejecutar")){
                ejecutarSE();
            }
            
            System.out.println(getRedirect());
            
            RequestDispatcher rd = request.getRequestDispatcher(getRedirect()+".jsp");
            rd.forward(request, response);
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
