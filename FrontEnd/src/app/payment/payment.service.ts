import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Payment } from '../models/payment.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class PaymentService {

  constructor(private http:HttpClient) {}

  private paymentUrl = 'http://localhost:8071/payment';
 

  mid: String;
  //private userUrl = '/api';
  public getPayment()
  {
    this.mid=sessionStorage.getItem("mid");
    return this.http.get<Payment[]>(this.paymentUrl+"/findPaymentByUserId/"+this.mid);
  }

  public deletePayment(payment) {
    return this.http.delete(this.paymentUrl + "/"+ payment.pid);
  }

  public createPayment(payment) {
    return this.http.post<Payment>(this.paymentUrl, payment);
  }

 



}
