package net.codejava.ws;

import java.util.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("/BankingApplication")
public class BankApp {
	
//	@GET
//	@Produces(MediaType.TEXT_HTML)
//	public static void main(String[] args) {
//		
//	public String sayHelloHTML(@QueryParam("name") String name, @QueryParam("surname") String surname) {
//		
//		return "<html><title>Hello HTML </title> <body>"
//				+ "<h1>Hello "+name+" "+surname+", Thanks for calling me </h1></body></html>";
//	
//		
//	}
//	}
	

	
	private String AccountOwner ;
	private int AccountNumber;
	private int PIN;
	private double balance = 0; 
	
	
	BankApp(){
		System.out.println("Object created of type BankApp");
	}
	
	
	
	public void createAccount(String Account_Owner, int Account_Number, int pin_number){
		
		AccountOwner = Account_Owner;
		AccountNumber = Account_Number;
		PIN = pin_number;  
	}

	
	public void setInitialBalance(double bal,String Account_Owner, int Account_Number, int pin_number) {
		if ( AccountOwner == Account_Owner && AccountNumber == Account_Number && PIN == pin_number){
			
			balance += bal;
		}
		else {
			System.out.println("Details doesnt match with exisiting user");
		}
		
	}
	
	public void deposit(double ammount,String Account_Owner, int Account_Number, int pin_number) {
		if ( AccountOwner == Account_Owner && AccountNumber == Account_Number && PIN == pin_number){
			
			balance += ammount;
		}
		else {
			System.out.println("Details doesnt match with exisiting user");
		}
	}
		
		
	public void withdrawal(double ammount,String Account_Owner, int Account_Number, int pin_number) {
				
		if ( AccountOwner == Account_Owner && AccountNumber == Account_Number && PIN == pin_number){
					
					balance -= ammount;
				}
				else {
					System.out.println("Details doesnt match with exisiting user");
				}
	}
		
		
	
	public double getCurrentBalance(String Account_Owner, int Account_Number, int pin_number) {
		
		if ( AccountOwner == Account_Owner && AccountNumber == Account_Number && PIN == pin_number){
			
			return balance;
		}
		else {
			return -1.0;
		}
		
	}



}



