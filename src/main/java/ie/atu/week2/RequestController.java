package ie.atu.week2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @GetMapping("/hello")
    public  String message(){
        return "Hello There";
    }
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name){
        return name;
    }
    @GetMapping("/details")
    public String detail(@RequestParam String name, int age){
        return "Name: " + name + " age: "+ age;
    }

    @GetMapping("/calculator")
    public String calculator(@RequestParam float num1, float num2, String operator){
        float total = 0;

        switch(operator)
        {
            case "add":
                total = num1 + num2;
                break;

            case "subtract":
                total = num1 - num2;
                break;

            case "multiply":
                total = num1 * num2;
                break;

            case "disvide":
                if(num2 == 0) {
                    return "Cannot divide by zero";
                }
                else{
            total = num1 / num2;
        }
                break;

            default:
                return "NULL";
        }

        return "operator " + operator + " Total = " + total;
    }

}
