import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { User } from '../models/user.model';
import { Payment } from '../models/payment.model';
import { Training } from '../models/training.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class AdminService {

  constructor(private http:HttpClient) {}

  private userUrl = 'http://localhost:8889/user-portal/users';
  private paymentUrl = 'http://localhost:8071/payment';
  private userUrl1 = 'http://localhost:8071/training';
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

  public getPayments() {
    return this.http.get<Payment[]>(this.paymentUrl);
  }

  public getTrainings(id) {
    return this.http.get<Training>(this.userUrl1+"/"+id);
  }

  public setAmount(amount,Remark,Pid)
  {
    return this.http.get<Payment[]>(this.paymentUrl+"/"+amount+"/"+Remark+"/"+Pid);
  }

  public setCommission(commission,Tid){
    return this.http.get<Training>(this.userUrl1+"/ChangeCommission/"+commission+"/"+Tid);
  }


}
