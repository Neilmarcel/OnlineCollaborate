import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserListComponent } from '../../../OnlineCollaborateAngular/src/app/user-list/user-list.component';  
import { LoginUserComponent } from './login-user/login-user.component';
import { RegisterUserComponent } from '../../../OnlineCollaborateAngular/src/app/register-user/register-user.component';
import { ActiveUserComponent } from '../../../OnlineCollaborateAngular/src/app/active-user/active-user.component';

const routes: Routes = [
  { path: '', redirectTo: 'login-user', pathMatch: 'full' },  
  { path: 'user-list', component: UserListComponent },  
  { path: 'add-user', component: RegisterUserComponent },
  { path: 'login-user', component: LoginUserComponent }, 
  { path: 'active-user', component: ActiveUserComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
