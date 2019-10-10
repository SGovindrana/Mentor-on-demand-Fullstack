import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { UserComponent } from './user/user.component';
import {AddUserComponent} from './user/add-user.component';
import { SigninComponent } from './signin/signin.component';
import { SignupComponent } from './signup/signup.component';
import { IndexComponent } from './index/index.component';
import { ProfileComponent} from './profile/profile.component' ;
import { UloginComponent} from './ulogin/ulogin.component' ;
import { UindexComponent} from './uindex/uindex.component' ;
import { CompletedComponent} from './completed/completed.component' ;
import { CurrentComponent} from './current/current.component' ;
import { AdminComponent} from './admin/admin.component' ;
import { PaymentComponent} from './payment/payment.component' ;
import { Payment1Component} from './payment1/payment1.component' ;
import { MentorComponent} from './mentor/mentor.component' ;
import { UserlandingComponent} from './userlanding/userlanding.component' ;
import { MentorsignupComponent} from './mentorsignup/mentorsignup.component' ;
import {AddTechnologyComponent} from './technology/add-technology.component';
import { TechnologyComponent } from './technology/technology.component';
import {AddSkillComponent} from './skill/add-skill.component';
import { SkillComponent } from './skill/skill.component';
import { TrainingComponent } from './training/training.component';
import {AddTrainingComponent} from './training/add-training.component';
import { Mentor1Component } from './mentor1/mentor1.component';
import {AddMentorComponent} from './mentor/add-mentor.component';
import { HomeComponent } from './home/home.component';
import { AddPaymentComponent } from './payment/add-payment.component';
import { UserdetailsComponent } from './training/userdetails.component';
import { MentordetailsComponent } from './training/mentordetails.component';
import { Mentordetails1Component } from './training1/mentordetails1.component';
import { Training1Component } from './training1/training1.component';
import { MentorprofileComponent } from './userlanding/mentorprofile.component';
import { PaymentlistComponent } from './admin/paymentlist.component';
import { UserpaymentComponent } from './index/userpayment.component';







const routes: Routes = [
  { path: '',pathMatch:'full' ,component: HomeComponent },
  { path: 'add', component: AddUserComponent },
  { path: 'user', component: UserComponent },
  { path: 'signin', component: SigninComponent },
  { path: 'signup', component: SignupComponent },
  { path: 'training', component: TrainingComponent },
  { path: 'mentor1', component: Mentor1Component },
  { path: 'index', component: IndexComponent },
  { path:'profile',component: ProfileComponent},
  { path:'ulogin',component: UloginComponent},
  { path: 'skill', component: SkillComponent },
  { path:'uindex',component: UindexComponent},
  { path:'completed',component: CompletedComponent},
  { path:'current',component: CurrentComponent},
  { path:'admin',component: AdminComponent},
  { path:'payment',component: PaymentComponent},
  { path:'payment1',component: Payment1Component},
  { path:'home',component:HomeComponent},
  { path:'mentor',component: MentorComponent},
  { path:'userlanding',component: UserlandingComponent},
  { path:'mentorsignup',component: MentorsignupComponent},
  { path: 'technologys', component: TechnologyComponent },
  { path: 'addtechnology', component: AddTechnologyComponent },
  { path: 'addskill', component: AddSkillComponent },
  { path: 'addmentor', component: AddMentorComponent },
  { path: 'addpayment', component: AddPaymentComponent },
  { path: 'addtraining', component: AddTrainingComponent },
  { path: 'userdetails', component: UserdetailsComponent },
  { path: 'mentordetails', component: MentordetailsComponent },
  { path: 'mentordetails1', component: Mentordetails1Component },
  { path: 'training1', component: Training1Component },
  { path: 'mentorprofile', component: MentorprofileComponent },
  { path: 'paymentlist', component: PaymentlistComponent },
  { path: 'userpayment', component: UserpaymentComponent }


];






@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ],
  declarations: []
})
export class AppRoutingModule { }
