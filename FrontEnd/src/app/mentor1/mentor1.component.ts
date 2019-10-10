import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';


import { Mentor1Service } from './mentor1.service';
import { Mentor } from '../models/mentor.model';

@Component({
  selector: 'app-mentor1',
  templateUrl: './mentor1.component.html',
  styles: []
})
export class Mentor1Component implements OnInit {

  mentors1: Mentor[];
  mentor1:Mentor=new Mentor();


  constructor(private router: Router, private mentor1Service: Mentor1Service) {

  }

  ngOnInit() {
    this.mentor1Service.getMentors()
      .subscribe( data => {
        this.mentors1 = data;
      });
  };

  deleteMentor(mentor1: Mentor): void {
    this.mentor1Service.deleteMentor(mentor1)
      .subscribe( data => {
        this.mentors1 = this.mentors1.filter(u => u !== mentor1);
      })
  };
  authenticate(userName,password):void {
    this.mentor1Service.authenticate(userName,password).subscribe(data=> {
      if(data==null)
      {
            alert ("incorrect");
           }
         else{

          sessionStorage.setItem('mid',data.id);
          this.router.navigate(['userlanding']);
          localStorage.setItem('storementordata',JSON.stringify(data));
      }
    })
}
}
