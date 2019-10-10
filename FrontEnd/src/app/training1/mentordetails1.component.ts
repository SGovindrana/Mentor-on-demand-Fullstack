import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Training } from '../models/training.model';
import { Training1Service } from './training1.service';

@Component({
  //selector: 'app-training',
  templateUrl: './mentordetails1.component.html',
  //styleUrls: ['./usertraini.component.css']
})
export class Mentordetails1Component implements OnInit {
  training: Training[];
  
  mid: String;
  constructor(private router: Router, private training1Service: Training1Service) {

  }

  ngOnInit() {
    this.training1Service.getTraining1()
          .subscribe( data => {
            this.training = data;

          })

  
        };

}
