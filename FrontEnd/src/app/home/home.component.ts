import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { HomeService } from './home.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styles: []
})
export class HomeComponent implements OnInit {

  users: User[];

  constructor(private router: Router, private homeService: HomeService) {

  }

  ngOnInit() {
    this.homeService.getUsers()
      .subscribe( data => {
        this.users = data;
      });
      
  };

  deleteUser(user: User): void {
    this.homeService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

}


