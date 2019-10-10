import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Training } from '../models/training.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class Training1Service {

  constructor(private http:HttpClient) {}
  id: String;
  mid: String;

  private trainingUrl = 'http://localhost:8071/training';
  //private userUrl = '/api';

  public getTraining() {
    this.id=sessionStorage.getItem("id");
    return this.http.get<Training[]>(this.trainingUrl+"/findTrainingByUserId/"+this.id);
  }
  
  public getMentorTraining() {
    this.mid=sessionStorage.getItem("mid");
    return this.http.get<Training[]>(this.trainingUrl+"/findTrainingByMentorId/"+this.mid);
  }
  
  public getTrainingByUser() {
    this.id=sessionStorage.getItem("id");
    return this.http.get<Training[]>(this.trainingUrl+"/findTrainingByUsersId/"+this.id);
  }

  public getTrainingByMentorCompleted() {
    this.mid=sessionStorage.getItem("mid");
    return this.http.get<Training[]>(this.trainingUrl+"/findTrainingByMentorIdAndStatusEquals/"+this.mid+"/completed");
  }
  public getTraining1() {
    return this.http.get<Training[]>(this.trainingUrl);
  }
  public deleteTraining(training) {
    return this.http.delete(this.trainingUrl + "/"+ training.id);
  }

  public createTraining(training) {
    return this.http.post<Training>(this.trainingUrl, training);
  }

  public getTrainingByUserCompleted() {
    this.id=sessionStorage.getItem("id");
    return this.http.get<Training[]>(this.trainingUrl+"//findTrainingByUsersIdAndStatusEquals//"+this.id+"/completed");
  }
}
