import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Mentor } from '../models/mentor.model';
import { MentorsignupService } from './mentorsignup.service';

@Component({
  selector: 'app-mentorsignup',
  templateUrl: './mentorsignup.component.html',
  styles: []
})
export class MentorsignupComponent implements OnInit{
  mentors: Mentor[];
  mentor: Mentor = new Mentor();
  constructor(private router: Router, private mentorsignupService: MentorsignupService) {

  }

   ngOnInit() {
     this.mentorsignupService.getMentor()
       .subscribe( data => {
         this.mentors = data;
       });
   };


  deleteMentor(mentors: Mentor): void {
    this.mentorsignupService.deleteMentor(mentors)
      .subscribe( data => {
        this.mentors = this.mentors.filter(u => u !== mentors);
      })
  };
  createMentor(): void {
    this.mentorsignupService.createMentor(this.mentor)
        .subscribe( data => {
          alert("Mentor created successfully.");
        });

  
  };

}


