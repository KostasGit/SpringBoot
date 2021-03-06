package com.carshopwebapp.controllers;


import com.carshopwebapp.entitities.Owner;
import com.carshopwebapp.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller

public class OwnerContoller {
    @Autowired
    OwnerService service;


    @RequestMapping("/OwnerPages")
    public String ownerOptins() {
        return "OwnerPage";
    }


    @RequestMapping("/OwnerUpdatePage")
    public String ownerOptionUpdate(ModelMap modelMap) {
        List<Owner> owners = service.getAllOwners();
        modelMap.addAttribute("owners", owners);
        return "OwnerUpdatePage";
    }//ADD delete option


    @RequestMapping("/showCreate")
    public String createNewOwner() {
        return "createOwner";
    }

    @RequestMapping("/search")
    public String search(Model model, @RequestParam (name = "epitheto") String surname)
    {
        model.addAttribute("owners", service.getOwnersBySurname(surname));
        return "createOwner";
    }


    @RequestMapping("/saveOwn")
    public String saveNewOwner(@ModelAttribute("owner") Owner owner, ModelMap modelMap) { //expose it out a as bean -spring container-
        Owner userSaved = service.saveOwner(owner);
        String msg = "Επιτυχης εισαγωγη δεδομενων με id: " + userSaved.getId();
        modelMap.addAttribute("msg", msg);
        return "createOwner";  //request modelattribute        //response modelmap (pass key value pairs)
    }


    @RequestMapping("/showUpdate")
    public String showOwner(@RequestParam("id") int id, ModelMap modelMap) {
        //model map for when we get back to the jsp
        Owner owner = service.getOwnerbyId(id);
        modelMap.addAttribute("owner", owner);
        return "updateOwner";
    }


    @RequestMapping("/updateOwn") //uri to handle
    public String updateOwner(@ModelAttribute("owner") Owner owner, ModelMap modelMap) {
        service.updateOwner(owner); // i wont use it so i dont save it somewhere like createOwner
        List<Owner> owners = service.getAllOwners();
        modelMap.addAttribute("owners", owners);
        return "OwnerUpdatePage"; //return to all records page
    }


    @RequestMapping("/deleteOwner") //it gets it from the displayOwners.jsp
    public String deleteOwner(@RequestParam("id") int id, ModelMap modelMap) {
        Owner owner = new Owner();
        owner = service.getOwnerbyId(id);//get the owner
        service.deleteOwner(owner); //delete the owner
        List<Owner> owners = service.getAllOwners();
        modelMap.addAttribute("owners", owners);
        //send response back via modelmap
        return "OwnerUpdatePage"; //go back to all Records page
    }

}
