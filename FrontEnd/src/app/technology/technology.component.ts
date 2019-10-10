import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Technology } from '../models/technology.model';
import { TechnologyService } from './technology.service';

@Component({
  selector: 'app-technology',
  templateUrl: './technology.component.html',
  styles: []
})
export class TechnologyComponent implements OnInit {

  technologys: Technology[];

  constructor(private router: Router, private technologyService: TechnologyService) {

  }

  ngOnInit() {
    this.technologyService.getTechnologys()
      .subscribe( data => {
        this.technologys = data;
      });
  };

  deleteTechnology(technology: Technology): void {
    this.technologyService.deleteTechnology(technology)
      .subscribe( data => {
        this.technologys = this.technologys.filter(u => u !== technology);
      })
  };

}


