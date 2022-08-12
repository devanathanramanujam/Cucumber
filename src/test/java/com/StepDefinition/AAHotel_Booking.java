package com.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.BaseClass.Baseclass;
import com.Runner.Test_Runner;
import com.pom.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.textui.TestRunner;

public class AAHotel_Booking extends Baseclass {
	
	public static WebDriver driver = Test_Runner.driver;
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("user lanches the application")
	public void user_lanches_the_application() {
		get_Url("https://adactinhotelapp.com/");
			
		
	}
	@When("user enter the username in the username field")
	public void user_enter_the_username_in_the_username_field() {
	sendkeys(pom.getLogin_Page().getUsername(), "devanathanselva");
	    
	}
	@When("user enter the password in the password field")
	public void user_enter_the_password_in_the_password_field() {
	   sendkeys(pom.getLogin_Page().getPassword(), "Deva@4090");
	}
	@Then("user clik the login button and navigate to search hotel page")
	public void user_clik_the_login_button_and_navigate_to_search_hotel_page() {
	   click(pom.getLogin_Page().getLogin());
	}


	@When("user select the location from the dropdown")
	public void user_select_the_location_from_the_dropdown() {
	  
	}
	@When("user select the hotel from the dropdown")
	public void user_select_the_hotel_from_the_dropdown() {
	}
	@When("user select the room type from the dropdwon")
	public void user_select_the_room_type_from_the_dropdwon() {
	}
	@When("user select the room from the no of room")
	public void user_select_the_room_from_the_no_of_room() {
	}
	@When("user enter the date in the checkin field")
	public void user_enter_the_date_in_the_checkin_field() {
	}
	
	@When("user enter the date in the checkout field")
	public void user_enter_the_date_in_the_checkout_field() {
	}
	@When("user select the type form the adults room field")
	
	public void user_select_the_type_form_the_adults_room_field() {
	}
	@When("user select the type for the children room field")
	public void user_select_the_type_for_the_children_room_field() {
		
	}
	@Then("user click the search and navigte to the selelct hotel page")
	public void user_click_the_search_and_navigte_to_the_selelct_hotel_page() {
	}

	@When("user select the raido button from the radio btutton field")
	public void user_select_the_raido_button_from_the_radio_btutton_field() {
	}
	@Then("user click the continue button and navigage to book a hotel page")
	public void user_click_the_continue_button_and_navigage_to_book_a_hotel_page() {
	  
	}

	@When("user enter the firstname in the firstname filed")
	public void user_enter_the_firstname_in_the_firstname_filed() {
	}
	@When("user enter the lastname in the lastname field")
	public void user_enter_the_lastname_in_the_lastname_field() {
	}
	@When("user enter the address in the address field")
	public void user_enter_the_address_in_the_address_field() {
	}
	@When("user enter the cridt card non in the cridt card filed")
	public void user_enter_the_cridt_card_non_in_the_cridt_card_filed() {
	}
	@When("user select the card type in the cridt card type field")
	public void user_select_the_card_type_in_the_cridt_card_type_field() {
	}
	@When("user select the date from expiry date field")
	public void user_select_the_date_from_expiry_date_field() {
	}
	@When("user select the date form expiry year field")
	public void user_select_the_date_form_expiry_year_field() {
	    
	}
	@When("user enter the cvv no in the cvv number field")
	public void user_enter_the_cvv_no_in_the_cvv_number_field() {
	   
	}
	@Then("user click book now btton and navigate to the booking Confirmation page")
	public void user_click_book_now_btton_and_navigate_to_the_booking_confirmation_page() {
	   
	}
	@Then("user click the logout")
	public void user_click_the_logout() {
	   
	}
	
}
