package com.example.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping({"/payment"})
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
	
	@PostMapping
    public Payment create(@RequestBody Payment payment){
        return paymentService.create(payment);
    }

    @GetMapping(path = {"/{id}"})
    public Payment findOne(@PathVariable("id") int id){
        return paymentService.findById(id);
    }

    @PutMapping(path = {"/{id}"})
    public Payment update(@PathVariable("id") int id, @RequestBody Payment payment){
        payment.setId(id);
        return paymentService.update(payment);
    }

    @DeleteMapping(path ={"/{id}"})
    public Payment delete(@PathVariable("id") int id) {
        return paymentService.delete(id);
    }

    @GetMapping
    public List<Payment> findAll(){
        return paymentService.findAll();
    }
    
    @GetMapping("/findPaymentByMentorId/{mentorId}")
	public List<Payment> getPaymentByMentorId(@PathVariable(value = "mentorId") int mentorId) {
		return paymentService.findPaymentByMentorId(mentorId);
	}
    @GetMapping(path = "/{amount}/{remark}/{id}")
    public Payment SetAmount(@PathVariable("amount") Integer amount,@PathVariable("remark") String remark,@PathVariable("id") Integer id){
    	
    	Payment payment=paymentService.findById(id);
    	payment.paymenttrainer(amount);
    	payment.setRemarks(remark);
        return paymentService.create(payment);
    }
    
    @GetMapping("/findPaymentByUserId/{userId}")
    public List < Payment > findPaymentByUserId(@PathVariable(value = "userId") int userId) {
        return paymentService.findPaymentByUserId(userId);
    }
    
    
    
}
