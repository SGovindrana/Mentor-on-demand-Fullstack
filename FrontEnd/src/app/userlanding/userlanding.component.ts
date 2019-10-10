import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Mentor } from '../models/mentor.model';
import { UserlandingService } from './userlanding.service';

@Component({
  selector: 'app-userlanding',
  templateUrl: './userlanding.component.html',
  styles: []
})
export class UserlandingComponent implements OnInit {

 mentors:Mentor[]; 
  mid: string;
  constructor(private router: Router, private userlandingService: UserlandingService) {

  }

  ngOnInit() {


    if(localStorage.length == 0){
      alert('Not Logged in, Please Login First');
      this.router.navigate(['signin']);
    }else{
    this.userlandingService.getMentors()
      .subscribe( data => {
        this.mentors = data;
      });
      var getuserdata=JSON.parse(localStorage.getItem('storementordata'));
      console.log(getuserdata);
      document.getElementById('w').innerHTML=getuserdata.firstName+" "+getuserdata.lastName;
      this.mid=sessionStorage.getItem("mid");
      
  };
}

  deleteUser(user: Mentor): void {
    this.userlandingService.deleteUser(user)
      .subscribe( data => {
        this.mentors = this.mentors.filter(u => u !== user);
      })
  };
  logout()
  {
    sessionStorage.removeItem("mid");
    window.localStorage.clear();
    this.router.navigate(['mentor1']);
  }

}


