import { BrowserModule } from '@angular/platform-browser';
import { NgModule ,CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { NgCircleProgressModule } from 'ng-circle-progress';

import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { AppRoutingModule } from './app.routing.module';
import {UserService} from './user/user.service';
import {HttpClientModule} from "@angular/common/http";
import {AddUserComponent} from './user/add-user.component';
import { SigninComponent } from './signin/signin.component';
import {SigninService} from './signin/signin.service';
import { SignupComponent } from './signup/signup.component';
import {SignupService} from './signup/signup.service';
import { IndexComponent } from './index/index.component';
import { IndexService } from './index/index.service';
import { ProfileComponent } from './profile/profile.component';
import { ProfileService } from './profile/profile.service';
import { UloginComponent } from './ulogin/ulogin.component';
import { UloginService } from './ulogin/ulogin.service';
import { UindexComponent } from './uindex/uindex.component';
import { UindexService } from './uindex/uindex.service';
import { CompletedComponent } from './completed/completed.component';
import { CompletedService } from './completed/completed.service';
import { CurrentComponent } from './current/current.component';
import { CurrentService } from './current/current.service';
import { AdminComponent } from './admin/admin.component';
import { AdminService } from './admin/admin.service';
import { PaymentComponent } from './payment/payment.component';
import { PaymentService } from './payment/payment.service';
import { Payment1Component } from './payment1/payment1.component';
import { Payment1Service } from './payment1/payment1.service';
import { MentorComponent } from './mentor/mentor.component';
import { MentorService } from './mentor/mentor.service';
import {UserlandingComponent } from './userlanding/userlanding.component';
import { UserlandingService } from './userlanding/userlanding.service';
import { MentorsignupComponent } from './mentorsignup/mentorsignup.component';
import { MentorsignupService } from './mentorsignup/mentorsignup.service';
import { TechnologyComponent } from './technology/technology.component';
import {TechnologyService} from './technology/technology.service';
import {AddTechnologyComponent} from './technology/add-technology.component';
import { SkillComponent } from './skill/skill.component';
import {SkillService} from './skill/skill.service';
import {AddSkillComponent} from './skill/add-skill.component';
import { TrainingComponent } from './training/training.component';
import {TrainingService} from './training/training.service';
import {AddTrainingComponent} from './training/add-training.component';
import { Mentor1Component } from './mentor1/mentor1.component';
import {Mentor1Service} from './mentor1/mentor1.service';
import {AddMentorComponent} from './mentor/add-mentor.component';
import {AddPaymentComponent} from './payment/add-payment.component';
import { HomeComponent } from './home/home.component';
import {HomeService} from './home/home.service';
import { UserdetailsComponent } from './training/userdetails.component';
import { MentordetailsComponent } from './training/mentordetails.component';
import { Training1Component } from './training1/training1.component';
import { Mentordetails1Component } from './training1/mentordetails1.component';
import { Training1Service } from './training1/training1.service';
import { MentorprofileComponent } from './userlanding/mentorprofile.component';
import { PaymentlistComponent } from './admin/paymentlist.component';
import { UserpaymentComponent } from './index/userpayment.component';








@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    Mentor1Component,
    AddUserComponent,
    AddTechnologyComponent,
    AddPaymentComponent,
    AddMentorComponent,
    TrainingComponent,
    AddTrainingComponent,
    HomeComponent,
    Payment1Component,
    UserdetailsComponent,
    MentordetailsComponent,
    Training1Component,
    MentorprofileComponent,
    PaymentlistComponent,
   Mentordetails1Component,
    TechnologyComponent,
    SigninComponent,
    UserpaymentComponent,
    AddSkillComponent,


  
     SignupComponent,IndexComponent,ProfileComponent,UloginComponent, SkillComponent, UindexComponent,CompletedComponent,CurrentComponent,AdminComponent,PaymentComponent,MentorComponent,UserlandingComponent,MentorsignupComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,

    NgCircleProgressModule.forRoot({
      
      radius: 25,
      outerStrokeWidth: 8,
      innerStrokeWidth: 0,
      outerStrokeColor: "cyan",
      innerStrokeColor: "#C7E596",
      animationDuration: 300,
    })





  ],
  providers: [UserService,  Training1Service, HomeService,SigninService,SkillService,Mentor1Service, TechnologyService, TrainingService ,SignupService, IndexService, ProfileService, UloginService, UindexService, CompletedService, CurrentService, AdminService, PaymentService ,MentorService,UserlandingService ,MentorsignupService, Payment1Service]
  ,
  bootstrap: [AppComponent],
  schemas: [ CUSTOM_ELEMENTS_SCHEMA ]
})
export class AppModule { }
