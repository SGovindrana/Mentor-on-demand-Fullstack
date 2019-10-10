import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { Payment1Service } from './payment1.service';

@Component({
  selector: 'app-payment',
  templateUrl: './payment1.component.html',
  styles: []
})
export class Payment1Component implements OnInit {

  users: User[];

  constructor(private router: Router, private payment1Service: Payment1Service) {

  }

  ngOnInit() {
    this.payment1Service.getUsers()
      .subscribe( data => {
        this.users = data;
      });
  };

  deleteUser(user: User): void {
    this.payment1Service.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

}


