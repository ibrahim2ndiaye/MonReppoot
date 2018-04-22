package ecole.exament.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ecole.exament.model.Clients;
import ecole.exament.model.Commande;
import ecole.exament.model.Detail;
import ecole.exament.service.IexemService;






@Controller
@RequestMapping("/exam")
public class ItemsController {
	@Autowired
	private IexemService examService;

	@RequestMapping("/getAllCommande")
    public @ResponseBody List<Commande> listAllCommande() {
		System.out.println("*************************************getAllCommande");
    	List<Commande> lcom = examService.getAllCommande();
        if(lcom.isEmpty()){
            return null;
        }
        return lcom;
    }
	
	@RequestMapping("/getAllDetail")
    public @ResponseBody List<Detail> listAlldetail() {
		System.out.println("*************************************getAllDetail");
    	List<Detail> lcom = examService.getAllDetail();
        if(lcom.isEmpty()){
            return null;
        }
        return lcom;
    }
	
	@RequestMapping("/getAllClients")
    public @ResponseBody List<Clients> getAllCloents() {
		System.out.println("*************************************getAllCloents");
    	List<Clients> lcom = examService.getAllClient();
        if(lcom.isEmpty()){
            return null;
        }
        return lcom;
    }
}
