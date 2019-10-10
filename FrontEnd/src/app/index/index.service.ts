import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { User } from '../models/user.model';
import { Training } from '../models/training.model';
import { Payment } from '../models/payment.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class IndexService {
  id:String;

  constructor(private http:HttpClient) {}

  private userUrl = 'http://localhost:8889/user-portal/users';
  private paymentUrl = 'http://localhost:8071/payment';
  private trainingUrl = 'http://localhost:8071/training';
  //private userUrl = '/api';

  public getUsers() {
    return this.http.get<User[]>(this.userUrl);
  }

  public deleteUser(user) {
    return this.http.delete(this.userUrl + "/"+ user.id);
  }

  public createUser(user) {
    return this.http.post<User>(this.userUrl, user);
  }


  public getPayment()
  {
    this.id=sessionStorage.getItem("id");
    return this.http.get<Payment[]>(this.paymentUrl+"/findPaymentByUserId/"+this.id);
  }

  public getTrainings(Pid)
  {
    return this.http.get<Training>(this.trainingUrl+"/"+Pid);
  }
  
  public Payfees(payid,amount)
  {
    return this.http.get<Payment>(this.paymentUrl+"/payfees/"+payid+"/"+amount)
  }

}
