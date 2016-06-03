package web;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import org.springframework.ui.*;
import org.springframework.boot.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class Demo 
{
	
	@RequestMapping("/balance")
	String balance() 
        {
		return "balance";
	}
        
        @RequestMapping("/circle")
	String input() 
        {
		return "circle";
	}
        
       @RequestMapping("/rectangle")
	String rectangle() 
        {
		return "rectangle";
	}
        
        @RequestMapping("/district")
	String dis() 
        {
		return "district";
	}
        
        @RequestMapping("/domain")
	String domain() 
        {
		return "domain";
	}
        @RequestMapping("/divide")
	String divide() 
        {
		return "getValue";
	}
        
        @RequestMapping("/process")
	String process(int n) 
        {
		return "show";
	}
         
        
  

	@RequestMapping("/calculate")
	String calculate(double balance, Model model) 
        {
		double result = balance * 1.25 / 100;
		model.addAttribute("x", result);
		return "interest";
	}

        @RequestMapping("/vat") //form balance to interest
	String calVat(double balance, Model model) 
        {
		double result = (balance * 7) / 100;
		model.addAttribute("v", result);
		return "interest";
	}
        
        @RequestMapping("/calArea")
	String findCir(double input, Model model) 
        {
		double area = Math.PI * Math.pow(input, 2);
                double cir = 2 * Math.PI * input;
		model.addAttribute("a", area);
                model.addAttribute("c", cir);
		return "findCircle";
	}

        @RequestMapping("/Area")
	String findRec(double w,double h, Model model) 
        {
		double area = w*h;
		model.addAttribute("a", area);
		return "findRec";
	}
        
        @RequestMapping("/FindDistrict")   
	String findDis(String district, Model model) 
        {
		String zip = "";
            if(district.equals("เมืองนนทบุรี"))
                zip = "11000";
            else
               if(district.equals("บางบัวทอง"))
                 zip = "11110";
            else
               if(district.equals("ปากเกร็ด"))
                 zip = "11120";
            else
               if(district.equals("บางกรวย"))
                 zip = "11130";
            else
               if(district.equals("บางใหญ่"))
                 zip = "11140";
            else
               if(district.equals("ไทรน้อย"))
                 zip = "11150"; 
          
		model.addAttribute("z", zip);
		return "zipcode";
	}
        
        @RequestMapping("/GetIP")
	String findRec(String domain, Model model) throws UnknownHostException 
        {
		InetAddress hostname = InetAddress.getLocalHost(); 
                hostname = InetAddress.getByName(domain);
                model.addAttribute("i", hostname);
		return "ip";
	}

}
