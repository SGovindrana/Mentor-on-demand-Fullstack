import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Training } from '../models/training.model';
import { Training1Service } from './training1.service';

@Component({
  selector: 'app-training',
  templateUrl: './training1.component.html',
  styleUrls: ['./training1.component.css']
})
export class Training1Component implements OnInit {
  training: Training[];
  id: String;
  mid: String;
  constructor(private router: Router, private training1Service: Training1Service) {

  }

  ngOnInit() {
    this.id=sessionStorage.getItem("id");
    this.mid=sessionStorage.getItem("mid");
    if(this.id!=null){
    this.training1Service.getTrainingByUserCompleted()
      .subscribe( data => {
        this.training = data;
      });}
      else if(this.mid!=null){
        this.training1Service.getTrainingByMentorCompleted()
          .subscribe( data => {
            this.training = data;
          });

      }
      else{
        this.training1Service.getTraining1()
          .subscribe( data => {
            this.training = data;
          });
        }

  };
  deleteTraining(training: Training): void {
    this.training1Service.deleteTraining(training)
      .subscribe( data => {
        this.training = this.training.filter(u => u !== training);
      })
  };


}
