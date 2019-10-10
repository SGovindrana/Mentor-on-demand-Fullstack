import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { IndexService } from './index.service';

@Component({
  selector: 'app-index',
  templateUrl: './index.component.html',
  styles: []
})
export class IndexComponent implements OnInit {

  users: User[];

  constructor(private router: Router, private indexService: IndexService) {

  }
ngOnInit() { 
  if(localStorage.length == 0){
    alert('Not Logged in, Please Login First');
    this.router.navigate(['signin']);
  }else{

    this.indexService.getUsers()
      .subscribe( data => {
        this.users = data;
      });
      var getuserdata=JSON.parse(localStorage.getItem('storeuserdata'));
      console.log(getuserdata);
      document.getElementById('v').innerHTML=getuserdata.firstName+" "+getuserdata.lastName;
  };
}

  deleteUser(user: User): void {
    this.indexService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

logout()
  {
    sessionStorage.removeItem("id");
    window.localStorage.clear();
    this.router.navigate(['signin']);
  }

}


