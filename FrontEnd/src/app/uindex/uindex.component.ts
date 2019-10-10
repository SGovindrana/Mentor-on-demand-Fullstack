import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { UindexService } from './uindex.service';

@Component({
  selector: 'app-uindex',
  templateUrl: './uindex.component.html',
  styles: []
})
export class UindexComponent implements OnInit {

  users: User[];

  constructor(private router: Router, private uindexService: UindexService) {

  }

  ngOnInit() {
    this.uindexService.getUsers()
      .subscribe( data => {
        this.users = data;
      });
  };

  deleteUser(user: User): void {
    this.uindexService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

}


