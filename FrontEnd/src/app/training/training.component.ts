import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Training } from '../models/training.model';
import { TrainingService } from './training.service';

@Component({
  selector: 'app-training',
  templateUrl: './training.component.html',
  styleUrls: ['./training.component.css']
})
export class TrainingComponent implements OnInit {
  training: Training[];
  id: String;
  mid: String;
  constructor(private router: Router, private trainingService: TrainingService) {

  }

  ngOnInit() {
    this.id=sessionStorage.getItem("id");
    this.mid=sessionStorage.getItem("mid");
    if(this.id!=null){
    this.trainingService.getTraining()
      .subscribe( data => {
        this.training = data;
      });}
      else if(this.mid!=null){
        this.trainingService.getMentorTraining()
          .subscribe( data => {
            this.training = data;
          });

      }
      else{
        this.trainingService.getTraining1()
          .subscribe( data => {
            this.training = data;
          });
        }

  };
  deleteTraining(training: Training): void {
    this.trainingService.deleteTraining(training)
      .subscribe( data => {
        this.training = this.training.filter(u => u !== training);
      })
  };


}
