import  {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';

import { Payment} from '../models/payment.model';
import { AdminService } from './admin.service';
import { Training } from '../models/training.model';

@Component({
	selector: 'my-employee8',
    templateUrl: './paymentlist.component.html',
    //styleUrls: ['./adminpayment.component.css']
})
export class PaymentlistComponent implements OnInit
{ 
    payment: Payment[];
    //current: Curr=new Curr();
    training: Training= new Training();
    amt=0;
	Pid=0;
	Remark="0 of 4";
	commission;
    showId=false;
    displayId=false;
    users=sessionStorage.getItem('username');
    constructor(private router: Router, private adminService: AdminService)
	{

	}
    ngOnInit() {
        this.adminService.getPayments()
          .subscribe( data => {
            this.payment = data;
          });
      };

      public getTrainings(Paid,x,id) {
        
        this.amt=x;
		this.Pid=id;
        this.adminService.getTrainings(Paid)
        .subscribe( data2 => {
          this.training = data2;
        })
        this.showId=!this.showId;
      }
    

      setAmount(progress,commission)
	{
        
		this.amt=(this.amt-(this.amt*(commission/100)));
		this.amt=(this.amt/4);
		if(progress<=25 && progress>0)
		{
			this.amt=this.amt;
			this.Remark="1 of 4";
			alert("First Payment Done");
		}
		else if(progress<=50 && progress>25)
		{
			this.amt=this.amt*2;
			this.Remark="2 of 4";
			alert("Second Payment Done");
		}
		else if(progress<=75 && progress>50)
		{
			this.amt=this.amt*3;
			this.Remark="3 of 4";
			alert("Third Payment Done");
		}
		else if(progress<=100 && progress>75)
		{
			this.amt=this.amt*4;
			this.Remark="4 of 4";
			alert("Full Payment Done");
		}

		this.adminService.setAmount(this.amt,this.Remark,this.Pid)
		.subscribe(data2=>{

		});
	}


    setCommission(commission,Tid)
	{
		this.adminService.setCommission(commission,Tid)
		.subscribe(data=>{
			alert("Commission-amount Changed Sucessfully!")
		});
    }
    
    toggleId()
    {
        this.displayId=!this.displayId;
    }

    logout()
    {
        sessionStorage.removeItem('role');
        sessionStorage.removeItem('username');
        sessionStorage.removeItem('fname');
        sessionStorage.removeItem('id');
        this.router.navigate(['home']);
        
    }
}