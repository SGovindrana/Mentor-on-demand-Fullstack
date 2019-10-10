import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Mentor } from '../models/mentor.model';
import { UserlandingService } from './userlanding.service';

@Component({
  selector: 'app-profile',
  templateUrl: './mentorprofile.component.html',
  styles: []
})
export class MentorprofileComponent implements OnInit {

    mentors: Mentor[];

  constructor(private router: Router, private userlandingService: UserlandingService) {

  }

  ngOnInit() {
    this.userlandingService.getUsers()
      .subscribe( data => {
        this.mentors = data;
      });
      var getuserdata=JSON.parse(localStorage.getItem('storementordata'));
      console.log(getuserdata);
      document.getElementById('z').innerHTML=getuserdata.firstName+" "+getuserdata.lastName;
      
      document.getElementById('id').innerHTML= "User Id  : " + getuserdata.id;
      document.getElementById('e').innerHTML= "Email   : "+ getuserdata.email;
      document.getElementById('m').innerHTML= "Mobile No   :  "+ getuserdata.contactNumber;
      document.getElementById('r').innerHTML= "Role: "+ getuserdata.role;
      document.getElementById('ex').innerHTML= "Experience: "+ getuserdata.yearsofExperience+" Years";
  };

  /*deleteUser(mentors: Mentor): void {
    this.userlandingService.deleteUser(mentor)
      .subscribe( data => {
        this.mentors = this.mentors.filter(u => u !== mentor);
      })
  };*/

}


