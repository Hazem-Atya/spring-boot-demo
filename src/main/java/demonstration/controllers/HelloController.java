package demonstration.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/basic")


    public String hello() {
        return "<h1>Bonjour Mr Hazem Atya</h1>";
    }

    @RequestMapping(value = "/fine")

    public String fine() {
        return "<h1>Comment vas-tu Hazem?</h1>";
    }

    @RequestMapping("/user_entry")
    public String userForm() {
        return "<form action=\"/hello/userGreeting\" method=\"POST\">\n" +
                "  <label for=\"fname\">First name:</label><br>\n" +
                "  <input type=\"text\" id=\"fname\" name=\"firstname\" ><br>\n" +
                "  <label for=\"lname\">Last name:</label><br>\n" +
                "  <input type=\"text\" id=\"lname\" name=\"lastname\" ><br><br>\n" +
                "  <input type=\"submit\" value=\"Submit\">\n" +
                "</form> ";
    }

    @RequestMapping(value = "/userGreeting", method = RequestMethod.POST)
    String greetUser(@RequestParam String firstname, @RequestParam String lastname) {
        return "Bonjour " + firstname + " " + lastname;
    }

    @RequestMapping(value = "/order/{id}", method = RequestMethod.GET)
    public String getOrder(@PathVariable int id) {
        return "Order ID: "+id;
    }
}
