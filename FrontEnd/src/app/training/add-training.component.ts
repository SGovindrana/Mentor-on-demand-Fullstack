import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { Training } from '../models/training.model';
import { TrainingService } from '../training/training.service';

@Component({
  templateUrl: './add-training.component.html'
})
export class AddTrainingComponent {

  training: Training = new Training();

  constructor(private router: Router, private trainingService: TrainingService) {

  }

  createTraining(): void {
    this.trainingService.createTraining(this.training)
        .subscribe( data => {
          alert("Training Module added successfully.");
        });

  };

}
