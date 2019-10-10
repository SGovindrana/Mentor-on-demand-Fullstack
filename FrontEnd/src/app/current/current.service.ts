import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Training } from '../models/training.model';
import { User } from '../models/user.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class CurrentService {

  constructor(private http:HttpClient) {}
 users:User[];
  id: string;
  mid: string;

  private trainingUrl = 'http://localhost:8071/training';
  //private userUrl = '/api';

  public getTraining() {
    
    this.id=sessionStorage.getItem("id");
    return this.http.get<Training[]>(this.trainingUrl+"/findTrainingByUsersIdAndStatusEquals/"+this.id+"/in progress");
  }

  public getTraining2() {
    this.mid=sessionStorage.getItem("mid");
    return this.http.get<Training[]>(this.trainingUrl+"/findTrainingByMentorIdAndStatusEquals/"+this.mid+"/in progress");
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

}
