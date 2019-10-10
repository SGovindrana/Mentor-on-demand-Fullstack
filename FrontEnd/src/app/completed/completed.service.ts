import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Training } from '../models/training.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class CompletedService {
   
  id=sessionStorage.getItem("id");
  startDate=sessionStorage.getItem("startDate");
  endDate=sessionStorage.getItem("endDate");

  constructor(private http:HttpClient) {}


  private trainingUrl = 'http://localhost:8071/training';
  //private userUrl = '/api';

  public getTraining1() {
    alert(this.trainingUrl+"/findTrainingByStartDateBetween/"+this.startDate+"/"+this.endDate);
  
    return this.http.get<Training[]>(this.trainingUrl+"/findTrainingByStartDateBetween/"+this.startDate+"/"+this.endDate);
  }
  
  public getTraining() {
    return this.http.get<Training[]>(this.trainingUrl);
  }
  public deleteTraining(training) {
    return this.http.delete(this.trainingUrl + "/"+ training.id);
  }

  public createTraining(training) {
    return this.http.post<Training>(this.trainingUrl, training);
  }

}
