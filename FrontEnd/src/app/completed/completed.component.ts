import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Training } from '../models/training.model';
import { CompletedService } from './completed.service';

@Component({
  selector: 'app-training',
  templateUrl: './completed.component.html',
  styleUrls: ['./completed.component.css']
})
export class CompletedComponent implements OnInit {
  training: Training[];
  id=sessionStorage.getItem("id");
  startDate=sessionStorage.getItem("startDate");
  endDate=sessionStorage.getItem("endDate");

  constructor(private router: Router, private completedService: CompletedService) {

  }

  ngOnInit() {
    this.completedService.getTraining1()
      .subscribe( data => {
        this.training = data;
      });
      
      // else{
      //   this.completedService.getTraining()
      //     .subscribe( data => {
      //       this.training = data;
      //     });
      //   }

  }
  deleteTraining(training: Training): void {
    this.completedService.deleteTraining(training)
      .subscribe( data => {
        this.training = this.training.filter(u => u !== training);
      })
  };


}
