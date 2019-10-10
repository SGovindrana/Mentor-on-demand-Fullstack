import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { ProfileService } from './profile.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styles: []
})
export class ProfileComponent implements OnInit {

  users: User[];

  constructor(private router: Router, private profileService: ProfileService) {

  }

  ngOnInit() {
    this.profileService.getUsers()
      .subscribe( data => {
        this.users = data;
      });
      var getuserdata=JSON.parse(localStorage.getItem('storeuserdata'));
      console.log(getuserdata);
      document.getElementById('z').innerHTML=getuserdata.firstName+" "+getuserdata.lastName;
      
      document.getElementById('id').innerHTML= "User Id  : " + getuserdata.id;
      document.getElementById('e').innerHTML= "Email   : "+ getuserdata.email;
      document.getElementById('m').innerHTML= "Mobile No   :  "+ getuserdata.contactNumber;
      document.getElementById('r').innerHTML= "Role: "+ getuserdata.role;
      document.getElementById('ex').innerHTML= "Experience: "+ getuserdata.yearsofExperience+" Years";
  };

  deleteUser(user: User): void {
    this.profileService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

}


