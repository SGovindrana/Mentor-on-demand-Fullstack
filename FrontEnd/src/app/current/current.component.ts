import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Training } from '../models/training.model';
import { CurrentService } from './current.service';

@Component({
  selector: 'app-current',
  templateUrl: './current.component.html',
  styleUrls: ['./current.component.css']
})
export class  CurrentComponent implements OnInit {
  training: Training[];
  id: string;
  
  mid: string;
  constructor(private router: Router, private currentService: CurrentService) {

  }

  ngOnInit() {
    this.id=sessionStorage.getItem("id");
    this.mid=sessionStorage.getItem("mid");
    if(this.id!=null){
    this.currentService.getTraining()
      .subscribe( data => {
        this.training = data;
      });}
      else if(this.mid!=null){
        this.currentService.getTraining2()
          .subscribe( data => {
            this.training = data;
          });}
      else{
        this.currentService.getTraining1()
          .subscribe( data => {
            this.training = data;
          });
        }

  };
  deleteTraining(training: Training): void {
    this.currentService.deleteTraining(training)
      .subscribe( data => {
        this.training = this.training.filter(u => u !== training);
      })
  };
  search(startDate,endDate):void{
    sessionStorage.setItem('startDate',startDate);
    sessionStorage.setItem('endDate',endDate);
    this.router.navigate(['current']);
  }


}
