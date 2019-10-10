import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Training } from '../models/training.model';
import { TrainingService } from './training.service';

@Component({
  //selector: 'app-training',
  templateUrl: './mentordetails.component.html',
  //styleUrls: ['./usertraini.component.css']
})
export class MentordetailsComponent implements OnInit {
  training: Training[];
  
  mid: String;
  constructor(private router: Router, private trainingService: TrainingService) {

  }

  ngOnInit() {
    this.mid=sessionStorage.getItem("mid");
    if(this.mid==null){
    this.trainingService.getTrainingByUser()
      .subscribe( data => {
        this.training = data;
      });}
      else{
        this.trainingService.getMentorTraining()
          .subscribe( data => {
            this.training = data;
          });
        }

  };

  


}
